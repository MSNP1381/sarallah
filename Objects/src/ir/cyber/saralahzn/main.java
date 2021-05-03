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

public class main extends android.support.v7.app.AppCompatActivity implements B4AActivity{
	public static main mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.cyber.saralahzn", "ir.cyber.saralahzn.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "ir.cyber.saralahzn", "ir.cyber.saralahzn.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.cyber.saralahzn.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
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
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        anywheresoftware.b4a.samples.httputils2.httputils2service._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (newmain.mostCurrent != null);
vis = vis | (ashar.mostCurrent != null);
vis = vis | (sher_view.mostCurrent != null);
vis = vis | (infomodule.mostCurrent != null);
vis = vis | (news.mostCurrent != null);
vis = vis | (news_view.mostCurrent != null);
vis = vis | (pic_view.mostCurrent != null);
vis = vis | (video.mostCurrent != null);
vis = vis | (video_view.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (newmain.previousOne != null) {
				__a = newmain.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(newmain.mostCurrent == null ? null : newmain.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (ashar.previousOne != null) {
				__a = ashar.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(ashar.mostCurrent == null ? null : ashar.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (sher_view.previousOne != null) {
				__a = sher_view.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(sher_view.mostCurrent == null ? null : sher_view.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (infomodule.previousOne != null) {
				__a = infomodule.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(infomodule.mostCurrent == null ? null : infomodule.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (news.previousOne != null) {
				__a = news.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(news.mostCurrent == null ? null : news.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (news_view.previousOne != null) {
				__a = news_view.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(news_view.mostCurrent == null ? null : news_view.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, audionotifi.class));
BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
 {
            Activity __a = null;
            if (pic_view.previousOne != null) {
				__a = pic_view.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(pic_view.mostCurrent == null ? null : pic_view.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (video.previousOne != null) {
				__a = video.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(video.mostCurrent == null ? null : video.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (video_view.previousOne != null) {
				__a = video_view.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(video_view.mostCurrent == null ? null : video_view.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.Timer _t = null;
public static anywheresoftware.b4a.objects.Timer _t2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _animatedbackground = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _ivbackground = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _ivcore = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _ivoutline = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.AnimationWrapper _a = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
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
public ir.cyber.saralahzn.video_view _video_view = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="If File.IsDirectory(File.DirRootExternal&\"/Sarala";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(anywheresoftware.b4a.keywords.Common.File.getDirRootExternal()+"/SaralahCyber","")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="Log( File.IsDirectory(File.DirRootExternal,\"sara";
anywheresoftware.b4a.keywords.Common.LogImpl("6131075",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.File.IsDirectory(anywheresoftware.b4a.keywords.Common.File.getDirRootExternal(),"saralahcyber")==anywheresoftware.b4a.keywords.Common.False),0);
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="File.MakeDir(File.DirRootExternal,\"SaralahCyber\"";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirRootExternal(),"SaralahCyber");
 };
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="Activity.LoadLayout(\"anim_layout\")";
mostCurrent._activity.LoadLayout("anim_layout",mostCurrent.activityBA);
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="a.InitializeRotateCenter(\"animcore\",0,290,ivOutli";
mostCurrent._a.InitializeRotateCenter(mostCurrent.activityBA,"animcore",(float) (0),(float) (290),(android.view.View)(mostCurrent._ivoutline.getObject()));
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="a.RepeatCount=-1";
mostCurrent._a.setRepeatCount((int) (-1));
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="a.Duration=10000";
mostCurrent._a.setDuration((long) (10000));
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="If a.IsInitialized Then";
if (mostCurrent._a.IsInitialized()) { 
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="Activity.Invalidate";
mostCurrent._activity.Invalidate();
RDebugUtils.currentLine=131087;
 //BA.debugLineNum = 131087;BA.debugLine="a.Start(ivOutline)";
mostCurrent._a.Start((android.view.View)(mostCurrent._ivoutline.getObject()));
 };
RDebugUtils.currentLine=131089;
 //BA.debugLineNum = 131089;BA.debugLine="t.Initialize(\"t\",2000)";
_t.Initialize(processBA,"t",(long) (2000));
RDebugUtils.currentLine=131090;
 //BA.debugLineNum = 131090;BA.debugLine="t.Enabled=True";
_t.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131092;
 //BA.debugLineNum = 131092;BA.debugLine="animatedbackground.SetLayoutAnimated(5500,100%X-a";
mostCurrent._animatedbackground.SetLayoutAnimated((int) (5500),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._animatedbackground.getWidth()),(int) (0),mostCurrent._animatedbackground.getWidth(),mostCurrent._animatedbackground.getHeight());
RDebugUtils.currentLine=131094;
 //BA.debugLineNum = 131094;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public static String  _callactivity() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "callactivity", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "callactivity", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub callActivity";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="t2.Enabled=False";
_t2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="StartActivity(newMain)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._newmain.getObject()));
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="End Sub";
return "";
}
public static String  _hitex_reveallayout1_onanimationend() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hitex_reveallayout1_onanimationend", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hitex_reveallayout1_onanimationend", null));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Hitex_RevealLayout1_onAnimationEnd";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="End Sub";
return "";
}
public static String  _t_tick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t_tick", null));}
int _h = 0;
int _w = 0;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub  t_Tick";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="t.Enabled=False";
_t.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Dim h,w As Int";
_h = 0;
_w = 0;
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="h=Panel1.Height/1'2";
_h = (int) (mostCurrent._panel1.getHeight()/(double)1);
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="w=Panel1.Height/1'2";
_w = (int) (mostCurrent._panel1.getHeight()/(double)1);
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="ivOutline.Invalidate";
mostCurrent._ivoutline.Invalidate();
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="Panel1.SetLayoutAnimated(2000,50%X-w/2,99%y-h,w,h";
mostCurrent._panel1.SetLayoutAnimated((int) (2000),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA)-_w/(double)2),(int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (99),mostCurrent.activityBA)-_h),_w,_h);
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="ivOutline.Invalidate";
mostCurrent._ivoutline.Invalidate();
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="ivBackground.SetVisibleAnimated(1500,True)";
mostCurrent._ivbackground.SetVisibleAnimated((int) (1500),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="t2.Initialize(\"t2\",2000)";
_t2.Initialize(processBA,"t2",(long) (2000));
RDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="t2.Enabled=True";
_t2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="End Sub";
return "";
}
public static String  _t2_tick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t2_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t2_tick", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub  t2_Tick";
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="callActivity";
_callactivity();
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="End Sub";
return "";
}
}