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

public class news extends Activity implements B4AActivity{
	public static news mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.cyber.saralahzn", "ir.cyber.saralahzn.news");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (news).");
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
		activityBA = new BA(this, layout, processBA, "ir.cyber.saralahzn", "ir.cyber.saralahzn.news");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.cyber.saralahzn.news", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (news) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (news) Resume **");
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
		return news.class;
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
        BA.LogInfo("** Activity (news) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            news mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (news) Resume **");
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
public flm.b4a.ultimatelistview.UltimateListViewWrapper _ulvnews = null;
public ariagp.amin.shahedi.AriaGlideWrapper _glide = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public static String _old_js = "";
public static int _max_item = 0;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public ir.cyber.saralahzn.main _main = null;
public ir.cyber.saralahzn.newmain _newmain = null;
public ir.cyber.saralahzn.ashar _ashar = null;
public ir.cyber.saralahzn.sher_view _sher_view = null;
public ir.cyber.saralahzn.infomodule _infomodule = null;
public ir.cyber.saralahzn.news_view _news_view = null;
public ir.cyber.saralahzn.audionotifi _audionotifi = null;
public ir.cyber.saralahzn.starter _starter = null;
public ir.cyber.saralahzn.pic_view _pic_view = null;
public ir.cyber.saralahzn.video _video = null;
public ir.cyber.saralahzn.video_view _video_view = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="news";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="CallSub3(Starter,\"dwnl\",newMain.ip&\"saralah/news.";
anywheresoftware.b4a.keywords.Common.CallSubDebug3(processBA,(Object)(mostCurrent._starter.getObject()),"dwnl",(Object)(mostCurrent._newmain._ip /*String*/ +"saralah/news.json"),news.getObject());
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="ProgressDialogShow2(\"در حال بارگذاری ...\",True)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال بارگذاری ..."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="news";
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="news";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="End Sub";
return "";
}
public static String  _end1() throws Exception{
RDebugUtils.currentModule="news";
if (Debug.shouldDelegate(mostCurrent.activityBA, "end1", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "end1", null));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub end1";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="ToastMessageShow(\"با مشکل مواجه شدید\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("با مشکل مواجه شدید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="End Sub";
return "";
}
public static String  _start(String _js) throws Exception{
RDebugUtils.currentModule="news";
if (Debug.shouldDelegate(mostCurrent.activityBA, "start", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "start", new Object[] {_js}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _records = null;
anywheresoftware.b4a.objects.collections.Map _colrecords = null;
String _date = "";
String _title = "";
String _id = "";
String _body = "";
String _pic_url = "";
int _i = 0;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub start(js As String)";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="If js<>old_js Then";
if ((_js).equals(mostCurrent._old_js) == false) { 
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="ulvnews.Initialize(0,0,0,\"ulvnews\")";
mostCurrent._ulvnews.Initialize(mostCurrent.activityBA,(byte) (0),(int) (0),BA.NumberToString(0),"ulvnews");
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="sql.Initialize(File.DirInternal,\"saralah.db\",Fal";
_sql.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"saralah.db",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="Activity.LoadLayout(\"news_load_lay\")";
mostCurrent._activity.LoadLayout("news_load_lay",mostCurrent.activityBA);
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4063242;
 //BA.debugLineNum = 4063242;BA.debugLine="parser.Initialize(js)";
_parser.Initialize(_js);
RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="Dim RECORDS As List = root.Get(\"RECORDS\")";
_records = new anywheresoftware.b4a.objects.collections.List();
_records.setObject((java.util.List)(_root.Get((Object)("RECORDS"))));
RDebugUtils.currentLine=4063245;
 //BA.debugLineNum = 4063245;BA.debugLine="For Each colRECORDS As Map In RECORDS";
_colrecords = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group10 = _records;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_colrecords.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group10.Get(index10)));
RDebugUtils.currentLine=4063246;
 //BA.debugLineNum = 4063246;BA.debugLine="Dim date As String = colRECORDS.Get(\"date\")";
_date = BA.ObjectToString(_colrecords.Get((Object)("date")));
RDebugUtils.currentLine=4063247;
 //BA.debugLineNum = 4063247;BA.debugLine="Dim title As String = colRECORDS.Get(\"title\")";
_title = BA.ObjectToString(_colrecords.Get((Object)("title")));
RDebugUtils.currentLine=4063248;
 //BA.debugLineNum = 4063248;BA.debugLine="Dim ID As String=colRECORDS.Get(\"ID\")";
_id = BA.ObjectToString(_colrecords.Get((Object)("ID")));
RDebugUtils.currentLine=4063249;
 //BA.debugLineNum = 4063249;BA.debugLine="Dim body As String = colRECORDS.Get(\"body\")";
_body = BA.ObjectToString(_colrecords.Get((Object)("body")));
RDebugUtils.currentLine=4063250;
 //BA.debugLineNum = 4063250;BA.debugLine="Dim pic_url As String = colRECORDS.Get(\"pic_url";
_pic_url = BA.ObjectToString(_colrecords.Get((Object)("pic_url")));
RDebugUtils.currentLine=4063251;
 //BA.debugLineNum = 4063251;BA.debugLine="sql.ExecNonQuery(\"INSERT INTO news(ID,title,bod";
_sql.ExecNonQuery("INSERT INTO news(ID,title,body,pic_url,date) VALUES('"+_id+"','"+_title+"','"+_body+"','"+_pic_url+"','"+_date+"')");
RDebugUtils.currentLine=4063252;
 //BA.debugLineNum = 4063252;BA.debugLine="cur1=sql.ExecQuery(\"SELECT * FROM news\")";
_cur1.setObject((android.database.Cursor)(_sql.ExecQuery("SELECT * FROM news")));
 }
};
RDebugUtils.currentLine=4063255;
 //BA.debugLineNum = 4063255;BA.debugLine="Panel1.AddView(ulvnews,0,0dip,-1,-1)";
mostCurrent._panel1.AddView((android.view.View)(mostCurrent._ulvnews.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),(int) (-1),(int) (-1));
RDebugUtils.currentLine=4063256;
 //BA.debugLineNum = 4063256;BA.debugLine="ulvnews.AddLayout(\"layout1\",\"ulvnews_LayoutCreat";
mostCurrent._ulvnews.AddLayout("layout1","ulvnews_LayoutCreator","ulvnews_ContentFiller",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (320)),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4063257;
 //BA.debugLineNum = 4063257;BA.debugLine="max_item=cur1.RowCount-1";
_max_item = (int) (_cur1.getRowCount()-1);
RDebugUtils.currentLine=4063258;
 //BA.debugLineNum = 4063258;BA.debugLine="For i = 0 To max_item";
{
final int step22 = 1;
final int limit22 = _max_item;
_i = (int) (0) ;
for (;_i <= limit22 ;_i = _i + step22 ) {
RDebugUtils.currentLine=4063259;
 //BA.debugLineNum = 4063259;BA.debugLine="ulvnews.AddItem(\"layout1\", i)";
mostCurrent._ulvnews.AddItem("layout1",(long) (_i));
 }
};
RDebugUtils.currentLine=4063261;
 //BA.debugLineNum = 4063261;BA.debugLine="ulvnews.FadingEdges(False)";
mostCurrent._ulvnews.FadingEdges(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4063262;
 //BA.debugLineNum = 4063262;BA.debugLine="ulvnews.SetStyle(ulvnews.STYLE_DEFAULT)";
mostCurrent._ulvnews.SetStyle(mostCurrent.activityBA,mostCurrent._ulvnews.STYLE_DEFAULT);
RDebugUtils.currentLine=4063264;
 //BA.debugLineNum = 4063264;BA.debugLine="old_js=js";
mostCurrent._old_js = _js;
 };
RDebugUtils.currentLine=4063266;
 //BA.debugLineNum = 4063266;BA.debugLine="End Sub";
return "";
}
public static String  _ulvnews_contentfiller(long _itemid,String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _layoutpanel,int _position) throws Exception{
RDebugUtils.currentModule="news";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ulvnews_contentfiller", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ulvnews_contentfiller", new Object[] {_itemid,_layoutname,_layoutpanel,_position}));}
anywheresoftware.b4a.objects.ImageViewWrapper _imgbody = null;
anywheresoftware.b4a.objects.LabelWrapper _lbltitle = null;
anywheresoftware.b4a.objects.LabelWrapper _lblbody = null;
anywheresoftware.b4a.objects.LabelWrapper _lbltime = null;
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub ulvnews_ContentFiller(ItemID As Long, LayoutNa";
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="Log(ItemID)";
anywheresoftware.b4a.keywords.Common.LogImpl("64194307",BA.NumberToString(_itemid),0);
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="cur1.Position=ItemID";
_cur1.setPosition((int) (_itemid));
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="Dim imgBody As ImageView=LayoutPanel.GetView(1)";
_imgbody = new anywheresoftware.b4a.objects.ImageViewWrapper();
_imgbody.setObject((android.widget.ImageView)(_layoutpanel.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="Dim lblTitle As Label=LayoutPanel.GetView(2)";
_lbltitle = new anywheresoftware.b4a.objects.LabelWrapper();
_lbltitle.setObject((android.widget.TextView)(_layoutpanel.GetView((int) (2)).getObject()));
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="Dim lblBody As Label=LayoutPanel.GetView(6)";
_lblbody = new anywheresoftware.b4a.objects.LabelWrapper();
_lblbody.setObject((android.widget.TextView)(_layoutpanel.GetView((int) (6)).getObject()));
RDebugUtils.currentLine=4194314;
 //BA.debugLineNum = 4194314;BA.debugLine="Dim lbltime As Label=LayoutPanel.GetView(5)";
_lbltime = new anywheresoftware.b4a.objects.LabelWrapper();
_lbltime.setObject((android.widget.TextView)(_layoutpanel.GetView((int) (5)).getObject()));
RDebugUtils.currentLine=4194315;
 //BA.debugLineNum = 4194315;BA.debugLine="glide.Load(cur1.GetString(\"pic_url\")).AsBitmap.Pl";
mostCurrent._glide.Load((Object)(_cur1.GetString("pic_url"))).AsBitmap().Placeholder((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"placeholder.jpg").getObject())).CenterCrop().IntoImageView(_imgbody);
RDebugUtils.currentLine=4194316;
 //BA.debugLineNum = 4194316;BA.debugLine="lblTitle.Text=cur1.GetString(\"title\")";
_lbltitle.setText(BA.ObjectToCharSequence(_cur1.GetString("title")));
RDebugUtils.currentLine=4194318;
 //BA.debugLineNum = 4194318;BA.debugLine="lblBody.Text=(cur1.GetString(\"body\"))";
_lblbody.setText(BA.ObjectToCharSequence((_cur1.GetString("body"))));
RDebugUtils.currentLine=4194319;
 //BA.debugLineNum = 4194319;BA.debugLine="lbltime.Text=cur1.GetString(\"date\")";
_lbltime.setText(BA.ObjectToCharSequence(_cur1.GetString("date")));
RDebugUtils.currentLine=4194321;
 //BA.debugLineNum = 4194321;BA.debugLine="If max_item=ItemID Then";
if (_max_item==_itemid) { 
RDebugUtils.currentLine=4194322;
 //BA.debugLineNum = 4194322;BA.debugLine="ulvnews.SetStyle(ulvnews.STYLE_DEFAULT)";
mostCurrent._ulvnews.SetStyle(mostCurrent.activityBA,mostCurrent._ulvnews.STYLE_DEFAULT);
RDebugUtils.currentLine=4194323;
 //BA.debugLineNum = 4194323;BA.debugLine="ulvnews.Color=Colors.Transparent";
mostCurrent._ulvnews.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 };
RDebugUtils.currentLine=4194325;
 //BA.debugLineNum = 4194325;BA.debugLine="End Sub";
return "";
}
public static String  _ulvnews_itemclick(long _itemid,int _position,anywheresoftware.b4a.objects.PanelWrapper _clickedpanel) throws Exception{
RDebugUtils.currentModule="news";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ulvnews_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ulvnews_itemclick", new Object[] {_itemid,_position,_clickedpanel}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Sub ulvnews_ItemClick(ItemID As Long, Position As";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Log(cur1.GetString(\"body\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("64259841",_cur1.GetString("body"),0);
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Dim m As Map=CreateMap(\"title\":cur1.GetString(\"ti";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)(_cur1.GetString("title")),(Object)("pic_url"),(Object)(_cur1.GetString("pic_url")),(Object)("body"),(Object)(_cur1.GetString("body"))});
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="news_view.m=m";
mostCurrent._news_view._m /*anywheresoftware.b4a.objects.collections.Map*/  = _m;
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="StartActivity(news_view)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._news_view.getObject()));
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="End Sub";
return "";
}
public static String  _ulvnews_layoutcreator(String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _layoutpanel) throws Exception{
RDebugUtils.currentModule="news";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ulvnews_layoutcreator", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ulvnews_layoutcreator", new Object[] {_layoutname,_layoutpanel}));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub ulvnews_LayoutCreator(LayoutName As String, La";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="LayoutPanel.LoadLayout(\"news_lay\")";
_layoutpanel.LoadLayout("news_lay",mostCurrent.activityBA);
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
return "";
}
}