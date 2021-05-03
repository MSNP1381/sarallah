package ir.cyber.saralahzn;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class video extends Activity implements B4AActivity{
	public static video mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.cyber.saralahzn", "ir.cyber.saralahzn.video");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (video).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "ir.cyber.saralahzn", "ir.cyber.saralahzn.video");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.cyber.saralahzn.video", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (video) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (video) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return video.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (video) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            video mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (video) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.sql.SQL _sql = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _cur1 = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _type_vid = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _type_sot = null;
public flm.b4a.ultimatelistview.UltimateListViewWrapper _ulvid = null;
public ariagp.amin.shahedi.AriaGlideWrapper _glide = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public de.amberhome.objects.appcompat.ACSpinnerWrapper _acspinnerstyle = null;
public de.amberhome.objects.appcompat.ACSpinnerWrapper _acspinnerday = null;
public static String _old_js = "";
public static int _max_item = 0;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public ir.cyber.saralahzn.main _main = null;
public ir.cyber.saralahzn.newmain _newmain = null;
public ir.cyber.saralahzn.ashar _ashar = null;
public ir.cyber.saralahzn.sher_view _sher_view = null;
public ir.cyber.saralahzn.infomodule _infomodule = null;
public ir.cyber.saralahzn.news _news = null;
public ir.cyber.saralahzn.news_view _news_view = null;
public ir.cyber.saralahzn.audionotifi _audionotifi = null;
public ir.cyber.saralahzn.starter _starter = null;
public ir.cyber.saralahzn.pic_view _pic_view = null;
public ir.cyber.saralahzn.video_view _video_view = null;
public static String  _start(String _js) throws Exception{
RDebugUtils.currentModule="video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "start", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "start", new Object[] {_js}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _records = null;
anywheresoftware.b4a.objects.collections.Map _colrecords = null;
String _name = "";
String _style = "";
String _pic_url = "";
String _type1 = "";
String _hajm = "";
String _url = "";
int _i = 0;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub start(js As String)";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="If js<>old_js Then";
if ((_js).equals(mostCurrent._old_js) == false) { 
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="ulvid.Initialize(0,0,0,\"ulvid\")";
mostCurrent._ulvid.Initialize(mostCurrent.activityBA,(byte) (0),(int) (0),BA.NumberToString(0),"ulvid");
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="sql.Initialize(File.DirInternal,\"saralah.db\",Fals";
_sql.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"saralah.db",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="Activity.LoadLayout(\"madah\")";
mostCurrent._activity.LoadLayout("madah",mostCurrent.activityBA);
RDebugUtils.currentLine=6750215;
 //BA.debugLineNum = 6750215;BA.debugLine="spiner_itemset";
_spiner_itemset();
RDebugUtils.currentLine=6750217;
 //BA.debugLineNum = 6750217;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=6750218;
 //BA.debugLineNum = 6750218;BA.debugLine="parser.Initialize(js)";
_parser.Initialize(_js);
RDebugUtils.currentLine=6750219;
 //BA.debugLineNum = 6750219;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=6750220;
 //BA.debugLineNum = 6750220;BA.debugLine="Dim RECORDS As List = root.Get(\"RECORDS\")";
_records = new anywheresoftware.b4a.objects.collections.List();
_records.setObject((java.util.List)(_root.Get((Object)("RECORDS"))));
RDebugUtils.currentLine=6750221;
 //BA.debugLineNum = 6750221;BA.debugLine="For Each colRECORDS As Map In RECORDS";
_colrecords = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group11 = _records;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_colrecords.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group11.Get(index11)));
RDebugUtils.currentLine=6750222;
 //BA.debugLineNum = 6750222;BA.debugLine="Dim name As String = colRECORDS.Get(\"name\")";
_name = BA.ObjectToString(_colrecords.Get((Object)("name")));
RDebugUtils.currentLine=6750223;
 //BA.debugLineNum = 6750223;BA.debugLine="Dim style As String = colRECORDS.Get(\"style\")";
_style = BA.ObjectToString(_colrecords.Get((Object)("style")));
RDebugUtils.currentLine=6750224;
 //BA.debugLineNum = 6750224;BA.debugLine="Dim pic_url As String = colRECORDS.Get(\"pic_url\"";
_pic_url = BA.ObjectToString(_colrecords.Get((Object)("pic_url")));
RDebugUtils.currentLine=6750225;
 //BA.debugLineNum = 6750225;BA.debugLine="Dim Type1 As String = colRECORDS.Get(\"type\")";
_type1 = BA.ObjectToString(_colrecords.Get((Object)("type")));
RDebugUtils.currentLine=6750226;
 //BA.debugLineNum = 6750226;BA.debugLine="Dim hajm As String = colRECORDS.Get(\"hajm\")";
_hajm = BA.ObjectToString(_colrecords.Get((Object)("hajm")));
RDebugUtils.currentLine=6750227;
 //BA.debugLineNum = 6750227;BA.debugLine="Dim url As String = colRECORDS.Get(\"url\")";
_url = BA.ObjectToString(_colrecords.Get((Object)("url")));
RDebugUtils.currentLine=6750228;
 //BA.debugLineNum = 6750228;BA.debugLine="sql.ExecNonQuery(\"INSERT INTO madahi(name,pic_ur";
_sql.ExecNonQuery("INSERT INTO madahi(name,pic_url,url,style,type,hajm) VALUES('"+_name+"','"+_pic_url+"','"+_url+"','"+_style+"','"+_type1+"','"+_hajm+"')");
 }
};
RDebugUtils.currentLine=6750230;
 //BA.debugLineNum = 6750230;BA.debugLine="cur1=sql.ExecQuery(\"SELECT * FROM madahi\")";
_cur1.setObject((android.database.Cursor)(_sql.ExecQuery("SELECT * FROM madahi")));
RDebugUtils.currentLine=6750233;
 //BA.debugLineNum = 6750233;BA.debugLine="Panel1.AddView(ulvid,0,0dip,-1,-1)";
mostCurrent._panel1.AddView((android.view.View)(mostCurrent._ulvid.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),(int) (-1),(int) (-1));
RDebugUtils.currentLine=6750234;
 //BA.debugLineNum = 6750234;BA.debugLine="ulvid.AddLayout(\"layout1\",\"ulvid_LayoutCreator\",\"";
mostCurrent._ulvid.AddLayout("layout1","ulvid_LayoutCreator","ulvid_ContentFiller",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (110)),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6750235;
 //BA.debugLineNum = 6750235;BA.debugLine="max_item=cur1.RowCount-1";
_max_item = (int) (_cur1.getRowCount()-1);
RDebugUtils.currentLine=6750236;
 //BA.debugLineNum = 6750236;BA.debugLine="For i = 0 To max_item";
{
final int step24 = 1;
final int limit24 = _max_item;
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=6750237;
 //BA.debugLineNum = 6750237;BA.debugLine="ulvid.AddItem(\"layout1\", i)";
mostCurrent._ulvid.AddItem("layout1",(long) (_i));
 }
};
RDebugUtils.currentLine=6750239;
 //BA.debugLineNum = 6750239;BA.debugLine="ulvid.SetStyle(ulvid.STYLE_DEFAULT)";
mostCurrent._ulvid.SetStyle(mostCurrent.activityBA,mostCurrent._ulvid.STYLE_DEFAULT);
RDebugUtils.currentLine=6750240;
 //BA.debugLineNum = 6750240;BA.debugLine="old_js=js";
mostCurrent._old_js = _js;
 };
RDebugUtils.currentLine=6750242;
 //BA.debugLineNum = 6750242;BA.debugLine="End Sub";
return "";
}
public static String  _end1() throws Exception{
RDebugUtils.currentModule="video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "end1", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "end1", null));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Sub end1";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="ToastMessageShow(\"با مشکل مواجه شدید\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("با مشکل مواجه شدید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="End Sub";
return "";
}
public static String  _acspinnerday_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "acspinnerday_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "acspinnerday_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub ACSpinnerday_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="End Sub";
return "";
}
public static String  _acspinnerstyle_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "acspinnerstyle_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "acspinnerstyle_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub ACSpinnerstyle_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="End Sub";
return "";
}
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="CallSub3(Starter,\"dwnl\",newMain.ip&\"saralah/mada";
anywheresoftware.b4a.keywords.Common.CallSubDebug3(processBA,(Object)(mostCurrent._starter.getObject()),"dwnl",(Object)(mostCurrent._newmain._ip /*String*/ +"saralah/madahi.json"),video.getObject());
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="ProgressDialogShow(\"در حال بارگذاری ...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال بارگذاری ..."));
RDebugUtils.currentLine=6684679;
 //BA.debugLineNum = 6684679;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="video";
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="End Sub";
return "";
}
public static String  _spiner_itemset() throws Exception{
RDebugUtils.currentModule="video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spiner_itemset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spiner_itemset", null));}
int _i = 0;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub spiner_itemset";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="cur1=sql.ExecQuery(\"SELECT * FROM spinner_tbl\")";
_cur1.setObject((android.database.Cursor)(_sql.ExecQuery("SELECT * FROM spinner_tbl")));
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="For i =0 To cur1.RowCount-1";
{
final int step2 = 1;
final int limit2 = (int) (_cur1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="cur1.Position=i";
_cur1.setPosition(_i);
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="ACSpinnerstyle.Add(cur1.GetString(\"style\"))";
mostCurrent._acspinnerstyle.Add(BA.ObjectToCharSequence(_cur1.GetString("style")));
 }
};
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="End Sub";
return "";
}
public static String  _ulvid_contentfiller(long _itemid,String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _layoutpanel,int _position) throws Exception{
RDebugUtils.currentModule="video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ulvid_contentfiller", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ulvid_contentfiller", new Object[] {_itemid,_layoutname,_layoutpanel,_position}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_name = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_hajm = null;
anywheresoftware.b4a.objects.ImageViewWrapper _img_title = null;
anywheresoftware.b4a.objects.ImageViewWrapper _img_type = null;
anywheresoftware.b4a.objects.ButtonWrapper _btn_download = null;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub ulvid_ContentFiller(ItemID As Long, LayoutName";
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="Log(ItemID)";
anywheresoftware.b4a.keywords.Common.LogImpl("66881283",BA.NumberToString(_itemid),0);
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="cur1.Position=ItemID";
_cur1.setPosition((int) (_itemid));
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="Dim p As Panel=LayoutPanel.GetView(0)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p.setObject((android.view.ViewGroup)(_layoutpanel.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=6881288;
 //BA.debugLineNum = 6881288;BA.debugLine="Dim lbl_name As Label=p.GetView(1)";
_lbl_name = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_name.setObject((android.widget.TextView)(_p.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=6881290;
 //BA.debugLineNum = 6881290;BA.debugLine="Dim lbl_hajm As Label=p.GetView(4)";
_lbl_hajm = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_hajm.setObject((android.widget.TextView)(_p.GetView((int) (4)).getObject()));
RDebugUtils.currentLine=6881292;
 //BA.debugLineNum = 6881292;BA.debugLine="Dim img_title As ImageView=p.GetView(0)";
_img_title = new anywheresoftware.b4a.objects.ImageViewWrapper();
_img_title.setObject((android.widget.ImageView)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=6881294;
 //BA.debugLineNum = 6881294;BA.debugLine="Dim img_type As ImageView=p.GetView(3)";
_img_type = new anywheresoftware.b4a.objects.ImageViewWrapper();
_img_type.setObject((android.widget.ImageView)(_p.GetView((int) (3)).getObject()));
RDebugUtils.currentLine=6881296;
 //BA.debugLineNum = 6881296;BA.debugLine="Dim btn_download As Button=p.GetView(2)";
_btn_download = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn_download.setObject((android.widget.Button)(_p.GetView((int) (2)).getObject()));
RDebugUtils.currentLine=6881297;
 //BA.debugLineNum = 6881297;BA.debugLine="btn_download.Tag=ItemID";
_btn_download.setTag((Object)(_itemid));
RDebugUtils.currentLine=6881299;
 //BA.debugLineNum = 6881299;BA.debugLine="ulvid.AnimationCleaner=True";
mostCurrent._ulvid.setAnimationCleaner(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6881300;
 //BA.debugLineNum = 6881300;BA.debugLine="lbl_name.Text=cur1.GetString(\"name\")";
_lbl_name.setText(BA.ObjectToCharSequence(_cur1.GetString("name")));
RDebugUtils.currentLine=6881301;
 //BA.debugLineNum = 6881301;BA.debugLine="lbl_hajm.Text=cur1.GetInt(\"hajm\")&\" MB\"";
_lbl_hajm.setText(BA.ObjectToCharSequence(BA.NumberToString(_cur1.GetInt("hajm"))+" MB"));
RDebugUtils.currentLine=6881302;
 //BA.debugLineNum = 6881302;BA.debugLine="glide.Load(cur1.GetString(\"pic_url\")).AsBitmap.Pl";
mostCurrent._glide.Load((Object)(_cur1.GetString("pic_url"))).AsBitmap().Placeholder((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"placeholder.jpg").getObject())).IntoImageView(_img_title);
RDebugUtils.currentLine=6881303;
 //BA.debugLineNum = 6881303;BA.debugLine="If cur1.GetString(\"url\").EndsWith(\"mp3\") Then";
if (_cur1.GetString("url").endsWith("mp3")) { 
RDebugUtils.currentLine=6881304;
 //BA.debugLineNum = 6881304;BA.debugLine="img_type.Bitmap=type_sot";
_img_type.setBitmap((android.graphics.Bitmap)(mostCurrent._type_sot.getObject()));
 }else {
RDebugUtils.currentLine=6881307;
 //BA.debugLineNum = 6881307;BA.debugLine="img_type.Bitmap=type_vid";
_img_type.setBitmap((android.graphics.Bitmap)(mostCurrent._type_vid.getObject()));
 };
RDebugUtils.currentLine=6881310;
 //BA.debugLineNum = 6881310;BA.debugLine="If ItemID=0 Then";
if (_itemid==0) { 
RDebugUtils.currentLine=6881311;
 //BA.debugLineNum = 6881311;BA.debugLine="ulvid.SetStyle(ulvid.STYLE_HOLO_LIGHT)";
mostCurrent._ulvid.SetStyle(mostCurrent.activityBA,mostCurrent._ulvid.STYLE_HOLO_LIGHT);
RDebugUtils.currentLine=6881312;
 //BA.debugLineNum = 6881312;BA.debugLine="ulvid.Color=Colors.Transparent";
mostCurrent._ulvid.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 };
RDebugUtils.currentLine=6881315;
 //BA.debugLineNum = 6881315;BA.debugLine="If ItemID=max_item Then";
if (_itemid==_max_item) { 
 };
RDebugUtils.currentLine=6881321;
 //BA.debugLineNum = 6881321;BA.debugLine="End Sub";
return "";
}
public static String  _ulvid_itemclick(long _itemid,int _position,anywheresoftware.b4a.objects.PanelWrapper _clickedpanel) throws Exception{
RDebugUtils.currentModule="video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ulvid_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ulvid_itemclick", new Object[] {_itemid,_position,_clickedpanel}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub ulvid_ItemClick(ItemID As Long, Position As In";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="cur1.Position=ItemID";
_cur1.setPosition((int) (_itemid));
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="m.Put(\"comment\",cur1.GetString(\"name\"))";
_m.Put((Object)("comment"),(Object)(_cur1.GetString("name")));
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="m.Put(\"img_url\",cur1.GetString(\"pic_url\"))";
_m.Put((Object)("img_url"),(Object)(_cur1.GetString("pic_url")));
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="m.Put(\"url\",cur1.GetString(\"url\"))";
_m.Put((Object)("url"),(Object)(_cur1.GetString("url")));
RDebugUtils.currentLine=6946823;
 //BA.debugLineNum = 6946823;BA.debugLine="video_view.m=m";
mostCurrent._video_view._m /*anywheresoftware.b4a.objects.collections.Map*/  = _m;
RDebugUtils.currentLine=6946825;
 //BA.debugLineNum = 6946825;BA.debugLine="StartActivity(video_view)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._video_view.getObject()));
RDebugUtils.currentLine=6946826;
 //BA.debugLineNum = 6946826;BA.debugLine="End Sub";
return "";
}
public static String  _ulvid_layoutcreator(String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _layoutpanel) throws Exception{
RDebugUtils.currentModule="video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ulvid_layoutcreator", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ulvid_layoutcreator", new Object[] {_layoutname,_layoutpanel}));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub ulvid_LayoutCreator(LayoutName As String, Layo";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="LayoutPanel.LoadLayout(\"media_pnl\")";
_layoutpanel.LoadLayout("media_pnl",mostCurrent.activityBA);
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="End Sub";
return "";
}
}