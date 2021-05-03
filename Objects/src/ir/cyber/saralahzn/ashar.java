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

public class ashar extends Activity implements B4AActivity{
	public static ashar mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.cyber.saralahzn", "ir.cyber.saralahzn.ashar");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (ashar).");
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
		activityBA = new BA(this, layout, processBA, "ir.cyber.saralahzn", "ir.cyber.saralahzn.ashar");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.cyber.saralahzn.ashar", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (ashar) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (ashar) Resume **");
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
		return ashar.class;
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
        BA.LogInfo("** Activity (ashar) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            ashar mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (ashar) Resume **");
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
public static String _old_js = "";
public flm.b4a.ultimatelistview.UltimateListViewWrapper _ulvid = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public static int _max_item = 0;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public ir.cyber.saralahzn.main _main = null;
public ir.cyber.saralahzn.newmain _newmain = null;
public ir.cyber.saralahzn.sher_view _sher_view = null;
public ir.cyber.saralahzn.infomodule _infomodule = null;
public ir.cyber.saralahzn.news _news = null;
public ir.cyber.saralahzn.news_view _news_view = null;
public ir.cyber.saralahzn.audionotifi _audionotifi = null;
public ir.cyber.saralahzn.starter _starter = null;
public ir.cyber.saralahzn.pic_view _pic_view = null;
public ir.cyber.saralahzn.video _video = null;
public ir.cyber.saralahzn.video_view _video_view = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="ashar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Activity.LoadLayout(\"sher_show\")";
mostCurrent._activity.LoadLayout("sher_show",mostCurrent.activityBA);
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="CallSub3(Starter,\"dwnl\",newMain.ip&\"saralah/sher.";
anywheresoftware.b4a.keywords.Common.CallSubDebug3(processBA,(Object)(mostCurrent._starter.getObject()),"dwnl",(Object)(mostCurrent._newmain._ip /*String*/ +"saralah/sher.json"),ashar.getObject());
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="ProgressDialogShow(\"در حال بارگذاری ...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال بارگذاری ..."));
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="ashar";
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="ashar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public static String  _end1() throws Exception{
RDebugUtils.currentModule="ashar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "end1", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "end1", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub end1";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="ToastMessageShow(\"با مشکل مواجه شدید\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("با مشکل مواجه شدید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_more_click() throws Exception{
RDebugUtils.currentModule="ashar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_more_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbl_more_click", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub lbl_more_Click";
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return "";
}
public static String  _start(String _js) throws Exception{
RDebugUtils.currentModule="ashar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "start", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "start", new Object[] {_js}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _records = null;
anywheresoftware.b4a.objects.collections.Map _colrecords = null;
String _name = "";
String _style = "";
int _id = 0;
String _body = "";
int _i = 0;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub start(js As String)";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="If js<>old_js Then";
if ((_js).equals(mostCurrent._old_js) == false) { 
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Log(js)";
anywheresoftware.b4a.keywords.Common.LogImpl("61835011",_js,0);
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="ulvid.Initialize(0,0,0,\"ulvid\")";
mostCurrent._ulvid.Initialize(mostCurrent.activityBA,(byte) (0),(int) (0),BA.NumberToString(0),"ulvid");
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="sql.Initialize(File.DirInternal,\"saralah.db\",Fal";
_sql.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"saralah.db",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="Activity.LoadLayout(\"sher_show\")";
mostCurrent._activity.LoadLayout("sher_show",mostCurrent.activityBA);
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="parser.Initialize(js)";
_parser.Initialize(_js);
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="Dim RECORDS As List = root.Get(\"RECORDS\")";
_records = new anywheresoftware.b4a.objects.collections.List();
_records.setObject((java.util.List)(_root.Get((Object)("RECORDS"))));
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="For Each colRECORDS As Map In RECORDS";
_colrecords = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group11 = _records;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_colrecords.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group11.Get(index11)));
RDebugUtils.currentLine=1835023;
 //BA.debugLineNum = 1835023;BA.debugLine="Dim name As String = colRECORDS.Get(\"name\")";
_name = BA.ObjectToString(_colrecords.Get((Object)("name")));
RDebugUtils.currentLine=1835024;
 //BA.debugLineNum = 1835024;BA.debugLine="Dim style As String = colRECORDS.Get(\"style\")";
_style = BA.ObjectToString(_colrecords.Get((Object)("style")));
RDebugUtils.currentLine=1835026;
 //BA.debugLineNum = 1835026;BA.debugLine="Dim ID As Int = colRECORDS.Get(\"ID\")";
_id = (int)(BA.ObjectToNumber(_colrecords.Get((Object)("ID"))));
RDebugUtils.currentLine=1835027;
 //BA.debugLineNum = 1835027;BA.debugLine="Log(ID)";
anywheresoftware.b4a.keywords.Common.LogImpl("61835027",BA.NumberToString(_id),0);
RDebugUtils.currentLine=1835028;
 //BA.debugLineNum = 1835028;BA.debugLine="Dim body As String = colRECORDS.Get(\"body\")";
_body = BA.ObjectToString(_colrecords.Get((Object)("body")));
RDebugUtils.currentLine=1835029;
 //BA.debugLineNum = 1835029;BA.debugLine="sql.ExecNonQuery(\"INSERT INTO sher(name,body,st";
_sql.ExecNonQuery("INSERT INTO sher(name,body,style) VALUES('"+_name+"','"+_body+"','"+_style+"')");
 }
};
RDebugUtils.currentLine=1835031;
 //BA.debugLineNum = 1835031;BA.debugLine="cur1=sql.ExecQuery(\"SELECT * FROM sher\")";
_cur1.setObject((android.database.Cursor)(_sql.ExecQuery("SELECT * FROM sher")));
RDebugUtils.currentLine=1835034;
 //BA.debugLineNum = 1835034;BA.debugLine="Panel1.AddView(ulvid,0,0dip,-1,-1)";
mostCurrent._panel1.AddView((android.view.View)(mostCurrent._ulvid.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),(int) (-1),(int) (-1));
RDebugUtils.currentLine=1835035;
 //BA.debugLineNum = 1835035;BA.debugLine="ulvid.AddLayout(\"layout1\",\"ulvid_LayoutCreator\",";
mostCurrent._ulvid.AddLayout("layout1","ulvid_LayoutCreator","ulvid_ContentFiller",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1835037;
 //BA.debugLineNum = 1835037;BA.debugLine="max_item=cur1.RowCount-1";
_max_item = (int) (_cur1.getRowCount()-1);
RDebugUtils.currentLine=1835038;
 //BA.debugLineNum = 1835038;BA.debugLine="Log(max_item)";
anywheresoftware.b4a.keywords.Common.LogImpl("61835038",BA.NumberToString(_max_item),0);
RDebugUtils.currentLine=1835039;
 //BA.debugLineNum = 1835039;BA.debugLine="For i = 0 To max_item";
{
final int step24 = 1;
final int limit24 = _max_item;
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=1835040;
 //BA.debugLineNum = 1835040;BA.debugLine="ulvid.AddItem(\"layout1\", i)";
mostCurrent._ulvid.AddItem("layout1",(long) (_i));
 }
};
RDebugUtils.currentLine=1835043;
 //BA.debugLineNum = 1835043;BA.debugLine="old_js=js";
mostCurrent._old_js = _js;
 };
RDebugUtils.currentLine=1835045;
 //BA.debugLineNum = 1835045;BA.debugLine="End Sub";
return "";
}
public static String  _ulvid_contentfiller(long _itemid,String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _layoutpanel,int _position) throws Exception{
RDebugUtils.currentModule="ashar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ulvid_contentfiller", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ulvid_contentfiller", new Object[] {_itemid,_layoutname,_layoutpanel,_position}));}
anywheresoftware.b4a.objects.LabelWrapper _style = null;
anywheresoftware.b4a.objects.LabelWrapper _name = null;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub ulvid_ContentFiller(ItemID As Long, LayoutName";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="cur1.Position=ItemID";
_cur1.setPosition((int) (_itemid));
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Dim style As Label=LayoutPanel.GetView(1)";
_style = new anywheresoftware.b4a.objects.LabelWrapper();
_style.setObject((android.widget.TextView)(_layoutpanel.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Dim name As Label=LayoutPanel.GetView(0)";
_name = new anywheresoftware.b4a.objects.LabelWrapper();
_name.setObject((android.widget.TextView)(_layoutpanel.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="style.Text=cur1.GetString(\"style\")";
_style.setText(BA.ObjectToCharSequence(_cur1.GetString("style")));
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="name.Text=cur1.GetString(\"name\")";
_name.setText(BA.ObjectToCharSequence(_cur1.GetString("name")));
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="If ItemID=0 Then";
if (_itemid==0) { 
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="ulvid.SetStyle(ulvid.STYLE_HOLO_DARK)";
mostCurrent._ulvid.SetStyle(mostCurrent.activityBA,mostCurrent._ulvid.STYLE_HOLO_DARK);
 };
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="Log(LayoutPanel.NumberOfViews)";
anywheresoftware.b4a.keywords.Common.LogImpl("62162697",BA.NumberToString(_layoutpanel.getNumberOfViews()),0);
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="End Sub";
return "";
}
public static String  _ulvid_itemclick(long _itemid,int _position,anywheresoftware.b4a.objects.PanelWrapper _clickedpanel) throws Exception{
RDebugUtils.currentModule="ashar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ulvid_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ulvid_itemclick", new Object[] {_itemid,_position,_clickedpanel}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub ulvid_ItemClick(ItemID As Long, Position As In";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Log(\"ClickedPanel\")";
anywheresoftware.b4a.keywords.Common.LogImpl("62228225","ClickedPanel",0);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="cur1.Position=Position";
_cur1.setPosition(_position);
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Dim m As Map=CreateMap(\"title\":cur1.GetString(\"nam";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)(_cur1.GetString("name")),(Object)("body"),(Object)(_cur1.GetString("body"))});
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="sher_view.map1=m";
mostCurrent._sher_view._map1 /*anywheresoftware.b4a.objects.collections.Map*/  = _m;
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="StartActivity(sher_view)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._sher_view.getObject()));
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="End Sub";
return "";
}
public static String  _ulvid_layoutcreator(String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _layoutpanel) throws Exception{
RDebugUtils.currentModule="ashar";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ulvid_layoutcreator", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ulvid_layoutcreator", new Object[] {_layoutname,_layoutpanel}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub ulvid_LayoutCreator(LayoutName As String, Layo";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="LayoutPanel.LoadLayout(\"layout1_sher\")";
_layoutpanel.LoadLayout("layout1_sher",mostCurrent.activityBA);
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
}