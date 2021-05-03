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

public class video_view extends Activity implements B4AActivity{
	public static video_view mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.cyber.saralahzn", "ir.cyber.saralahzn.video_view");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (video_view).");
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
		activityBA = new BA(this, layout, processBA, "ir.cyber.saralahzn", "ir.cyber.saralahzn.video_view");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.cyber.saralahzn.video_view", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (video_view) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (video_view) Resume **");
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
		return video_view.class;
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
        BA.LogInfo("** Activity (video_view) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            video_view mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (video_view) Resume **");
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
public static anywheresoftware.b4a.objects.collections.Map _m = null;
public static anywheresoftware.b4a.objects.Timer _timer1 = null;
public static anywheresoftware.b4a.sql.SQL _sql = null;
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _cur1 = null;
public static anywheresoftware.b4a.objects.collections.Map _service_map = null;
public aria.photoshop.Photoshop _aria = null;
public com.maximussoft.circularimageview.CircularImageViewWrapper _circle = null;
public com.tillekesoft.vlcb4a.VideoViewWrapper _vv = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_down = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_share = null;
public anywheresoftware.b4a.objects.LabelWrapper _f_screen = null;
public ariagp.amin.shahedi.AriaGlideWrapper _glide = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_time = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3 = null;
public de.amberhome.objects.appcompat.ACSeekBarWrapper _seekbar1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _ultimatelistview1 = null;
public flm.b4a.ultimatelistview.UltimateListViewWrapper _ulvid = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _iv_play = null;
public anywheresoftware.b4a.objects.PanelWrapper _dwnpnl = null;
public anywheresoftware.b4a.objects.LabelWrapper _percent = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _progressbar = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblname = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_under_dwn = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _ivback = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_circle = null;
public de.donmanfred.MaterialCircleProgressWrapper _materialcircleprogress1 = null;
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
public ir.cyber.saralahzn.video _video = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
int _i = 0;
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="StopService(Starter)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._starter.getObject()));
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="StartService(AudioNotifi)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._audionotifi.getObject()));
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="Activity.LoadLayout(\"video_play1\")";
mostCurrent._activity.LoadLayout("video_play1",mostCurrent.activityBA);
RDebugUtils.currentLine=7602181;
 //BA.debugLineNum = 7602181;BA.debugLine="lbl_time.Text=ConvertToTimeFormat(0)";
mostCurrent._lbl_time.setText(BA.ObjectToCharSequence(_converttotimeformat((int) (0))));
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="MaterialCircleProgress1.Colors=Array As Int(0xFF4";
mostCurrent._materialcircleprogress1.setColors(new int[]{(int) (0xff43a047),(int) (0xfff44336),(int) (0xff1dacd6),(int) (0xff00ccb4),(int) (0xff2f2f2f)});
RDebugUtils.currentLine=7602183;
 //BA.debugLineNum = 7602183;BA.debugLine="MaterialCircleProgress1.ShowArrow=False";
mostCurrent._materialcircleprogress1.setShowArrow(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7602184;
 //BA.debugLineNum = 7602184;BA.debugLine="sql.Initialize(File.DirInternal,\"saralah.db\",Fals";
_sql.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"saralah.db",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7602185;
 //BA.debugLineNum = 7602185;BA.debugLine="Timer1.Initialize(\"Timer1\", 400)";
_timer1.Initialize(processBA,"Timer1",(long) (400));
RDebugUtils.currentLine=7602186;
 //BA.debugLineNum = 7602186;BA.debugLine="Log(m.Get(\"url\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("67602186",BA.ObjectToString(_m.Get((Object)("url"))),0);
RDebugUtils.currentLine=7602187;
 //BA.debugLineNum = 7602187;BA.debugLine="video_play";
_video_play();
RDebugUtils.currentLine=7602188;
 //BA.debugLineNum = 7602188;BA.debugLine="cur1=sql.ExecQuery(\"SELECT * FROM madahi\")";
_cur1.setObject((android.database.Cursor)(_sql.ExecQuery("SELECT * FROM madahi")));
RDebugUtils.currentLine=7602189;
 //BA.debugLineNum = 7602189;BA.debugLine="ulvid.Initialize(0,0,0,\"ulvid\")";
mostCurrent._ulvid.Initialize(mostCurrent.activityBA,(byte) (0),(int) (0),BA.NumberToString(0),"ulvid");
RDebugUtils.currentLine=7602190;
 //BA.debugLineNum = 7602190;BA.debugLine="UltimateListView1.AddView(ulvid,0,0,-1,-1)";
mostCurrent._ultimatelistview1.AddView((android.view.View)(mostCurrent._ulvid.getObject()),(int) (0),(int) (0),(int) (-1),(int) (-1));
RDebugUtils.currentLine=7602191;
 //BA.debugLineNum = 7602191;BA.debugLine="ulvid.AddLayout(\"layout1\",\"ulvid_LayoutCreator\",\"";
mostCurrent._ulvid.AddLayout("layout1","ulvid_LayoutCreator","ulvid_ContentFiller",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (110)),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7602192;
 //BA.debugLineNum = 7602192;BA.debugLine="For i = 0 To cur1.RowCount-1";
{
final int step15 = 1;
final int limit15 = (int) (_cur1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=7602193;
 //BA.debugLineNum = 7602193;BA.debugLine="ulvid.AddItem(\"layout1\", i)";
mostCurrent._ulvid.AddItem("layout1",(long) (_i));
 }
};
RDebugUtils.currentLine=7602195;
 //BA.debugLineNum = 7602195;BA.debugLine="lblname.Text=m.Get(\"comment\")";
mostCurrent._lblname.setText(BA.ObjectToCharSequence(_m.Get((Object)("comment"))));
RDebugUtils.currentLine=7602196;
 //BA.debugLineNum = 7602196;BA.debugLine="End Sub";
return "";
}
public static String  _converttotimeformat(int _ms) throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "converttotimeformat", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "converttotimeformat", new Object[] {_ms}));}
int _seconds = 0;
int _minutes = 0;
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Sub ConvertToTimeFormat(ms As Int) As String";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="Dim seconds, minutes As Int";
_seconds = 0;
_minutes = 0;
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="seconds = Round(ms / 1000)";
_seconds = (int) (anywheresoftware.b4a.keywords.Common.Round(_ms/(double)1000));
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="minutes = Floor(seconds / 60)";
_minutes = (int) (anywheresoftware.b4a.keywords.Common.Floor(_seconds/(double)60));
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="seconds = seconds Mod 60";
_seconds = (int) (_seconds%60);
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="Return NumberFormat(minutes, 1, 0) & \":\" & Number";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat(_minutes,(int) (1),(int) (0))+":"+anywheresoftware.b4a.keywords.Common.NumberFormat(_seconds,(int) (2),(int) (0));
RDebugUtils.currentLine=8978438;
 //BA.debugLineNum = 8978438;BA.debugLine="End Sub";
return "";
}
public static String  _video_play() throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "video_play", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "video_play", null));}
String _str = "";
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Sub video_play";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="vv.Initialize(\"vv\")";
mostCurrent._vv.Initialize(processBA,"vv");
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="Panel1.AddView(vv, 0, 0dip, 100%x, 100%y)";
mostCurrent._panel1.AddView((android.view.View)(mostCurrent._vv.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="Dim str As String=m.Get(\"url\")";
_str = BA.ObjectToString(_m.Get((Object)("url")));
RDebugUtils.currentLine=7995398;
 //BA.debugLineNum = 7995398;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("67995398",_str,0);
RDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="If 	str.EndsWith(\"mp3\") Then";
if (_str.endsWith("mp3")) { 
RDebugUtils.currentLine=7995400;
 //BA.debugLineNum = 7995400;BA.debugLine="Panel1.LoadLayout(\"blur_lay\")";
mostCurrent._panel1.LoadLayout("blur_lay",mostCurrent.activityBA);
RDebugUtils.currentLine=7995401;
 //BA.debugLineNum = 7995401;BA.debugLine="glide_OnBitmapReady(LoadBitmap(File.DirAssets,\"1";
_glide_onbitmapready(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"1 (12).jpg"),(Object)(0));
RDebugUtils.currentLine=7995402;
 //BA.debugLineNum = 7995402;BA.debugLine="f_screen.Text=Chr(0xE5D8)";
mostCurrent._f_screen.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe5d8))));
RDebugUtils.currentLine=7995403;
 //BA.debugLineNum = 7995403;BA.debugLine="sound_play";
_sound_play();
 }else {
 };
RDebugUtils.currentLine=7995411;
 //BA.debugLineNum = 7995411;BA.debugLine="vv.VideoURI=(newMain.ip&str)";
mostCurrent._vv.setVideoURI((mostCurrent._newmain._ip /*String*/ +_str));
RDebugUtils.currentLine=7995412;
 //BA.debugLineNum = 7995412;BA.debugLine="vv.Start";
mostCurrent._vv.Start();
RDebugUtils.currentLine=7995413;
 //BA.debugLineNum = 7995413;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Sub  Activity_KeyPress (KeyCode As Int) As Boolea";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="lbl_exit_Click";
_lbl_exit_click();
 }else 
{RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="Else If KeyCode==KeyCodes.KEYCODE_VOLUME_DOWN T";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_VOLUME_DOWN) { 
 }else 
{RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="Else If KeyCodes.KEYCODE_VOLUME_UP==KeyCode Th";
if (anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_VOLUME_UP==_keycode) { 
 }}}
;
RDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=8650760;
 //BA.debugLineNum = 8650760;BA.debugLine="End Sub";
return false;
}
public static String  _lbl_exit_click() throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_exit_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbl_exit_click", null));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Sub lbl_exit_Click";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="vv.StopPlayback";
mostCurrent._vv.StopPlayback();
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="vv.RemoveView";
mostCurrent._vv.RemoveView();
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="vv.Pause";
mostCurrent._vv.Pause();
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="video_view";
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Log(Activity.getStartingIntent.ExtrasToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("67798785",mostCurrent._activity.GetStartingIntent().ExtrasToString(),0);
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="If Activity.GetStartingIntent.ExtrasToString.EndsW";
if (mostCurrent._activity.GetStartingIntent().ExtrasToString().endsWith("close}]")) { 
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="lbl_exit_Click";
_lbl_exit_click();
 }else 
{RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="Else If Activity.GetStartingIntent.ExtrasToString";
if (mostCurrent._activity.GetStartingIntent().ExtrasToString().endsWith("ctrl}]")) { 
RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="iv_play_Click";
_iv_play_click();
 }}
;
RDebugUtils.currentLine=7798792;
 //BA.debugLineNum = 7798792;BA.debugLine="End Sub";
return "";
}
public static String  _iv_play_click() throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "iv_play_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "iv_play_click", null));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Sub iv_play_Click";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Log(vv.IsPlaying)";
anywheresoftware.b4a.keywords.Common.LogImpl("68781825",BA.ObjectToString(mostCurrent._vv.IsPlaying()),0);
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="If	vv.IsPlaying Then";
if (mostCurrent._vv.IsPlaying()) { 
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="vv.Pause";
mostCurrent._vv.Pause();
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="iv_play.Bitmap=LoadBitmap(File.DirAssets,\"paly_i";
mostCurrent._iv_play.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"paly_ico.png").getObject()));
 }else {
RDebugUtils.currentLine=8781833;
 //BA.debugLineNum = 8781833;BA.debugLine="vv.Start";
mostCurrent._vv.Start();
RDebugUtils.currentLine=8781834;
 //BA.debugLineNum = 8781834;BA.debugLine="iv_play.Bitmap=LoadBitmap(File.DirAssets,\"pause_";
mostCurrent._iv_play.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pause_ico.png").getObject()));
 };
RDebugUtils.currentLine=8781838;
 //BA.debugLineNum = 8781838;BA.debugLine="End Sub";
return "";
}
public static String  _aria_blurend(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bluredimage) throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "aria_blurend", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "aria_blurend", new Object[] {_bluredimage}));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Sub  aria_BlurEnd (BluredImage As Bitmap)";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="ivback.Bitmap=BluredImage";
mostCurrent._ivback.setBitmap((android.graphics.Bitmap)(_bluredimage.getObject()));
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="End Sub";
return "";
}
public static String  _btn_down_click() throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_down_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_down_click", null));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub btn_down_Click";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="dwnpnl.LoadLayout(\"download_panel\")";
mostCurrent._dwnpnl.LoadLayout("download_panel",mostCurrent.activityBA);
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="Label2.Enabled=False";
mostCurrent._label2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="btn_down.Enabled=False";
mostCurrent._btn_down.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="End Sub";
return "";
}
public static String  _btn_share_click() throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_share_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_share_click", null));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Sub btn_share_Click";
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="End Sub";
return "";
}
public static String  _f_screen_click() throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "f_screen_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "f_screen_click", null));}
String _str = "";
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Sub f_screen_Click";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="Dim str As String=m.Get(\"url\")";
_str = BA.ObjectToString(_m.Get((Object)("url")));
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="If 	str.EndsWith(\"mp3\")=False Then";
if (_str.endsWith("mp3")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="If Panel2.Visible Then";
if (mostCurrent._panel2.getVisible()) { 
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="Panel2.Visible=False";
mostCurrent._panel2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="UltimateListView1.Visible=False";
mostCurrent._ultimatelistview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="Panel1.Width=100%x";
mostCurrent._panel1.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="Panel1.Left=0";
mostCurrent._panel1.setLeft((int) (0));
RDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="dwnpnl.Width=100%x";
mostCurrent._dwnpnl.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=8519689;
 //BA.debugLineNum = 8519689;BA.debugLine="dwnpnl.Left=0";
mostCurrent._dwnpnl.setLeft((int) (0));
RDebugUtils.currentLine=8519691;
 //BA.debugLineNum = 8519691;BA.debugLine="Panel3.Width=100%x";
mostCurrent._panel3.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=8519692;
 //BA.debugLineNum = 8519692;BA.debugLine="Panel3.Left=0";
mostCurrent._panel3.setLeft((int) (0));
RDebugUtils.currentLine=8519693;
 //BA.debugLineNum = 8519693;BA.debugLine="vv.Invalidate";
mostCurrent._vv.Invalidate();
RDebugUtils.currentLine=8519694;
 //BA.debugLineNum = 8519694;BA.debugLine="f_screen.Text=Chr(0xE5D1)";
mostCurrent._f_screen.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe5d1))));
 }else {
RDebugUtils.currentLine=8519697;
 //BA.debugLineNum = 8519697;BA.debugLine="Panel2.Visible=True";
mostCurrent._panel2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8519698;
 //BA.debugLineNum = 8519698;BA.debugLine="UltimateListView1.Visible=True";
mostCurrent._ultimatelistview1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8519700;
 //BA.debugLineNum = 8519700;BA.debugLine="Panel1.Width=80%x";
mostCurrent._panel1.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA));
RDebugUtils.currentLine=8519701;
 //BA.debugLineNum = 8519701;BA.debugLine="Panel1.Left=0";
mostCurrent._panel1.setLeft((int) (0));
RDebugUtils.currentLine=8519703;
 //BA.debugLineNum = 8519703;BA.debugLine="dwnpnl.Width=80%x";
mostCurrent._dwnpnl.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA));
RDebugUtils.currentLine=8519704;
 //BA.debugLineNum = 8519704;BA.debugLine="dwnpnl.Left=0";
mostCurrent._dwnpnl.setLeft((int) (0));
RDebugUtils.currentLine=8519706;
 //BA.debugLineNum = 8519706;BA.debugLine="Panel3.Width=80%x";
mostCurrent._panel3.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA));
RDebugUtils.currentLine=8519707;
 //BA.debugLineNum = 8519707;BA.debugLine="Panel3.Left=0";
mostCurrent._panel3.setLeft((int) (0));
RDebugUtils.currentLine=8519708;
 //BA.debugLineNum = 8519708;BA.debugLine="vv.Invalidate";
mostCurrent._vv.Invalidate();
RDebugUtils.currentLine=8519709;
 //BA.debugLineNum = 8519709;BA.debugLine="f_screen.Text=Chr(0xE5D0)";
mostCurrent._f_screen.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xe5d0))));
 };
 }else {
RDebugUtils.currentLine=8519713;
 //BA.debugLineNum = 8519713;BA.debugLine="service_map=CreateMap(\"text\":m.Get(\"comment\"),\"o";
_service_map = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("text"),_m.Get((Object)("comment")),(Object)("offline"),(Object)(anywheresoftware.b4a.keywords.Common.False),(Object)("path"),_m.Get((Object)("url"))});
RDebugUtils.currentLine=8519714;
 //BA.debugLineNum = 8519714;BA.debugLine="AudioNotifi.m=service_map";
mostCurrent._audionotifi._m /*anywheresoftware.b4a.objects.collections.Map*/  = _service_map;
RDebugUtils.currentLine=8519715;
 //BA.debugLineNum = 8519715;BA.debugLine="CallSub(AudioNotifi,\"notify\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(processBA,(Object)(mostCurrent._audionotifi.getObject()),"notify");
 };
RDebugUtils.currentLine=8519717;
 //BA.debugLineNum = 8519717;BA.debugLine="End Sub";
return "";
}
public static String  _glide_onbitmapready(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bitmap,Object _tag) throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "glide_onbitmapready", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "glide_onbitmapready", new Object[] {_bitmap,_tag}));}
anywheresoftware.b4a.objects.drawable.BitmapDrawable _draw = null;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Sub  glide_OnBitmapReady(bitmap As Bitmap,Tag As O";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="aria.Initialize(\"aria\")";
mostCurrent._aria.Initialize(processBA,"aria");
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="aria.Blur(bitmap,5)";
mostCurrent._aria.Blur(processBA,(android.graphics.Bitmap)(_bitmap.getObject()),(int) (5));
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="circle.Initialize(\"circle\")";
mostCurrent._circle.Initialize(processBA,"circle");
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="Dim draw As BitmapDrawable";
_draw = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="draw.Initialize(bitmap)";
_draw.Initialize((android.graphics.Bitmap)(_bitmap.getObject()));
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="circle.SetDrawable(draw)";
mostCurrent._circle.SetDrawable(_draw);
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="circle.AddDefaultShadow";
mostCurrent._circle.AddDefaultShadow();
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="pnl_circle.AddView(circle,0,0,-1,-1)";
mostCurrent._pnl_circle.AddView((android.view.View)(mostCurrent._circle.getObject()),(int) (0),(int) (0),(int) (-1),(int) (-1));
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="End Sub";
return "";
}
public static void  _lbl_time_click() throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_time_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "lbl_time_click", null); return;}
ResumableSub_lbl_time_Click rsub = new ResumableSub_lbl_time_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_lbl_time_Click extends BA.ResumableSub {
public ResumableSub_lbl_time_Click(ir.cyber.saralahzn.video_view parent) {
this.parent = parent;
}
ir.cyber.saralahzn.video_view parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="video_view";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="lbl_time.Text=ConvertToTimeFormat(vv.Duration)";
parent.mostCurrent._lbl_time.setText(BA.ObjectToCharSequence(_converttotimeformat((int) (parent.mostCurrent._vv.getDuration()))));
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="Sleep(4000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "video_view", "lbl_time_click"),(int) (4000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _lblcancel_click() throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblcancel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblcancel_click", null));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Sub lblcancel_Click";
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="pnl_under_dwn.RemoveView";
mostCurrent._pnl_under_dwn.RemoveView();
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="Label2.Enabled=True";
mostCurrent._label2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="btn_down.Enabled=True";
mostCurrent._btn_down.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="End Sub";
return "";
}
public static String  _seekbar1_valuechanged(int _value,boolean _userchanged) throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "seekbar1_valuechanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "seekbar1_valuechanged", new Object[] {_value,_userchanged}));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Sub SeekBar1_ValueChanged (Value As Int, UserChang";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="If UserChanged Then";
if (_userchanged) { 
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="vv.SeekTo(Value)";
mostCurrent._vv.SeekTo(_value);
 };
RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="End Sub";
return "";
}
public static String  _sound_play() throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sound_play", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sound_play", null));}
String _str = "";
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub sound_play";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Dim str As String=m.Get(\"url\")";
_str = BA.ObjectToString(_m.Get((Object)("url")));
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "timer1_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "timer1_tick", null));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub Timer1_Tick";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="lbl_time.Text=ConvertToTimeFormat(vv.CurrentPositi";
mostCurrent._lbl_time.setText(BA.ObjectToCharSequence(_converttotimeformat((int) (mostCurrent._vv.getCurrentPosition()))));
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="SeekBar1.Value=vv.CurrentPosition";
mostCurrent._seekbar1.setValue((int) (mostCurrent._vv.getCurrentPosition()));
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="End Sub";
return "";
}
public static String  _ulvid_contentfiller(long _itemid,String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _layoutpanel,int _position) throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ulvid_contentfiller", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ulvid_contentfiller", new Object[] {_itemid,_layoutname,_layoutpanel,_position}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl_name = null;
anywheresoftware.b4a.objects.ImageViewWrapper _img_title = null;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub ulvid_ContentFiller(ItemID As Long, LayoutName";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Log(ItemID)";
anywheresoftware.b4a.keywords.Common.LogImpl("67733249",BA.NumberToString(_itemid),0);
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="cur1.Position=ItemID";
_cur1.setPosition((int) (_itemid));
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="Dim lbl_name As Label=LayoutPanel.GetView(1)";
_lbl_name = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_name.setObject((android.widget.TextView)(_layoutpanel.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="Dim img_title As ImageView=LayoutPanel.GetView(0)";
_img_title = new anywheresoftware.b4a.objects.ImageViewWrapper();
_img_title.setObject((android.widget.ImageView)(_layoutpanel.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="lbl_name.Text=cur1.GetString(\"name\")";
_lbl_name.setText(BA.ObjectToCharSequence(_cur1.GetString("name")));
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="glide.Load(newMain.ip&cur1.GetString(\"pic_url\")).";
mostCurrent._glide.Load((Object)(mostCurrent._newmain._ip /*String*/ +_cur1.GetString("pic_url"))).AsBitmap().Placeholder((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"placeholder.jpg").getObject())).IntoImageView(_img_title);
RDebugUtils.currentLine=7733255;
 //BA.debugLineNum = 7733255;BA.debugLine="If ItemID=0 Then";
if (_itemid==0) { 
RDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="ulvid.Color=0xFFFFFFFF";
mostCurrent._ulvid.setColor((int) (0xffffffff));
 };
RDebugUtils.currentLine=7733259;
 //BA.debugLineNum = 7733259;BA.debugLine="End Sub";
return "";
}
public static String  _ulvid_layoutcreator(String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _layoutpanel) throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ulvid_layoutcreator", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ulvid_layoutcreator", new Object[] {_layoutname,_layoutpanel}));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub ulvid_LayoutCreator(LayoutName As String, Layo";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="LayoutPanel.LoadLayout(\"vid_v_ulv\")";
_layoutpanel.LoadLayout("vid_v_ulv",mostCurrent.activityBA);
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="End Sub";
return "";
}
public static void  _vv_oncompleted() throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "vv_oncompleted", false))
	 {Debug.delegate(mostCurrent.activityBA, "vv_oncompleted", null); return;}
ResumableSub_vv_onCompleted rsub = new ResumableSub_vv_onCompleted(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_vv_onCompleted extends BA.ResumableSub {
public ResumableSub_vv_onCompleted(ir.cyber.saralahzn.video_view parent) {
this.parent = parent;
}
ir.cyber.saralahzn.video_view parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="video_view";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="Log(\"Playing completed\"):Sleep(3000)";
anywheresoftware.b4a.keywords.Common.LogImpl("68257538","Playing completed",0);
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="Log(\"Playing completed\"):Sleep(3000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "video_view", "vv_oncompleted"),(int) (3000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _vv_onerror() throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "vv_onerror", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "vv_onerror", null));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Sub  vv_onError";
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="Log(\"erorr\")";
anywheresoftware.b4a.keywords.Common.LogImpl("68323077","erorr",0);
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="End Sub";
return "";
}
public static String  _vv_onprepared() throws Exception{
RDebugUtils.currentModule="video_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "vv_onprepared", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "vv_onprepared", null));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Sub vv_onPrepared";
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="SeekBar1.Max=vv.Duration";
mostCurrent._seekbar1.setMax((int) (mostCurrent._vv.getDuration()));
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="Log(\"vv_prepared\")";
anywheresoftware.b4a.keywords.Common.LogImpl("68192003","vv_prepared",0);
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="MaterialCircleProgress1.Visible=False";
mostCurrent._materialcircleprogress1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8192013;
 //BA.debugLineNum = 8192013;BA.debugLine="Timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8192015;
 //BA.debugLineNum = 8192015;BA.debugLine="End Sub";
return "";
}
}