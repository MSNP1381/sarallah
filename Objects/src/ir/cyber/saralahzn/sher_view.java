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

public class sher_view extends Activity implements B4AActivity{
	public static sher_view mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.cyber.saralahzn", "ir.cyber.saralahzn.sher_view");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (sher_view).");
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
		activityBA = new BA(this, layout, processBA, "ir.cyber.saralahzn", "ir.cyber.saralahzn.sher_view");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.cyber.saralahzn.sher_view", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (sher_view) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (sher_view) Resume **");
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
		return sher_view.class;
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
        BA.LogInfo("** Activity (sher_view) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            sher_view mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (sher_view) Resume **");
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
public static anywheresoftware.b4a.objects.collections.Map _map1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _l = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public static String _s1 = "";
public anywheresoftware.b4a.objects.StringUtils _su = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcount = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.AnimationWrapper _a = null;
public anywheresoftware.b4a.objects.AnimationWrapper _a2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_more_down = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public ir.cyber.saralahzn.main _main = null;
public ir.cyber.saralahzn.newmain _newmain = null;
public ir.cyber.saralahzn.ashar _ashar = null;
public ir.cyber.saralahzn.infomodule _infomodule = null;
public ir.cyber.saralahzn.news _news = null;
public ir.cyber.saralahzn.news_view _news_view = null;
public ir.cyber.saralahzn.audionotifi _audionotifi = null;
public ir.cyber.saralahzn.starter _starter = null;
public ir.cyber.saralahzn.pic_view _pic_view = null;
public ir.cyber.saralahzn.video _video = null;
public ir.cyber.saralahzn.video_view _video_view = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="sher_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
int _x = 0;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Activity.LoadLayout(\"sher_view\")";
mostCurrent._activity.LoadLayout("sher_view",mostCurrent.activityBA);
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="s1=map1.Get(\"body\")";
mostCurrent._s1 = BA.ObjectToString(_map1.Get((Object)("body")));
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="l.Initialize(\"l\")";
mostCurrent._l.Initialize(mostCurrent.activityBA,"l");
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="l.Text=s1";
mostCurrent._l.setText(BA.ObjectToCharSequence(mostCurrent._s1));
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="l.TextSize=20";
mostCurrent._l.setTextSize((float) (20));
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="l.Typeface=Typeface.LoadFromAssets(\"shabnam.ttf\")";
mostCurrent._l.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("shabnam.ttf"));
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="ScrollView1.Panel.AddView(l,0,15dip,100%x,ScrollVi";
mostCurrent._scrollview1.getPanel().AddView((android.view.View)(mostCurrent._l.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (15)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._scrollview1.getHeight());
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="l.TextColor=Colors.White";
mostCurrent._l.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="l.Gravity=Gravity.RIGHT+Gravity.TOP";
mostCurrent._l.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.RIGHT+anywheresoftware.b4a.keywords.Common.Gravity.TOP));
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="Dim x As Int=su.MeasureMultilineTextHeight(l,s1)";
_x = mostCurrent._su.MeasureMultilineTextHeight((android.widget.TextView)(mostCurrent._l.getObject()),BA.ObjectToCharSequence(mostCurrent._s1));
RDebugUtils.currentLine=2555917;
 //BA.debugLineNum = 2555917;BA.debugLine="If x>ScrollView1.Height Then";
if (_x>mostCurrent._scrollview1.getHeight()) { 
RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="ScrollView1.Panel.Height=x+16dip";
mostCurrent._scrollview1.getPanel().setHeight((int) (_x+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (16))));
RDebugUtils.currentLine=2555919;
 //BA.debugLineNum = 2555919;BA.debugLine="l.Height=x";
mostCurrent._l.setHeight(_x);
 };
RDebugUtils.currentLine=2555922;
 //BA.debugLineNum = 2555922;BA.debugLine="a.InitializeRotateCenter(\"anim\",0,90,lbl_more_down";
mostCurrent._a.InitializeRotateCenter(mostCurrent.activityBA,"anim",(float) (0),(float) (90),(android.view.View)(mostCurrent._lbl_more_down.getObject()));
RDebugUtils.currentLine=2555923;
 //BA.debugLineNum = 2555923;BA.debugLine="a.Duration=400";
mostCurrent._a.setDuration((long) (400));
RDebugUtils.currentLine=2555925;
 //BA.debugLineNum = 2555925;BA.debugLine="a2.InitializeRotateCenter(\"anim\",0,-90,lbl_more_d";
mostCurrent._a2.InitializeRotateCenter(mostCurrent.activityBA,"anim",(float) (0),(float) (-90),(android.view.View)(mostCurrent._lbl_more_down.getObject()));
RDebugUtils.currentLine=2555926;
 //BA.debugLineNum = 2555926;BA.debugLine="a2.Duration=400";
mostCurrent._a2.setDuration((long) (400));
RDebugUtils.currentLine=2555927;
 //BA.debugLineNum = 2555927;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="sher_view";
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="sher_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
public static String  _iv_play_click() throws Exception{
RDebugUtils.currentModule="sher_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "iv_play_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "iv_play_click", null));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub iv_play_Click";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_more_down_click() throws Exception{
RDebugUtils.currentModule="sher_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_more_down_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbl_more_down_click", null));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub lbl_more_down_Click";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="If Panel2.Visible Then";
if (mostCurrent._panel2.getVisible()) { 
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="a.Start(lbl_more_down)";
mostCurrent._a.Start((android.view.View)(mostCurrent._lbl_more_down.getObject()));
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Panel2.SetVisibleAnimated(400,Not(Panel2.Visible";
mostCurrent._panel2.SetVisibleAnimated((int) (400),anywheresoftware.b4a.keywords.Common.Not(mostCurrent._panel2.getVisible()));
 }else {
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="a2.Start(lbl_more_down)";
mostCurrent._a2.Start((android.view.View)(mostCurrent._lbl_more_down.getObject()));
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="Panel2.SetVisibleAnimated(400,Not(Panel2.Visible";
mostCurrent._panel2.SetVisibleAnimated((int) (400),anywheresoftware.b4a.keywords.Common.Not(mostCurrent._panel2.getVisible()));
 };
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_save_click() throws Exception{
RDebugUtils.currentModule="sher_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_save_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbl_save_click", null));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub lbl_save_Click";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_title_click() throws Exception{
RDebugUtils.currentModule="sher_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_title_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbl_title_click", null));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub lbl_title_Click";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
public static String  _lblmines_click() throws Exception{
RDebugUtils.currentModule="sher_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblmines_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblmines_click", null));}
int _x = 0;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub lblMines_Click";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="l.TextSize=l.TextSize-1";
mostCurrent._l.setTextSize((float) (mostCurrent._l.getTextSize()-1));
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="lblCount.Text=l.TextSize";
mostCurrent._lblcount.setText(BA.ObjectToCharSequence(mostCurrent._l.getTextSize()));
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Dim x As Int=su.MeasureMultilineTextHeight(l,s1)";
_x = mostCurrent._su.MeasureMultilineTextHeight((android.widget.TextView)(mostCurrent._l.getObject()),BA.ObjectToCharSequence(mostCurrent._s1));
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="If x>ScrollView1.Height Then";
if (_x>mostCurrent._scrollview1.getHeight()) { 
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="ScrollView1.Panel.Height=x+16dip";
mostCurrent._scrollview1.getPanel().setHeight((int) (_x+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (16))));
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="l.Height=x";
mostCurrent._l.setHeight(_x);
 };
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="End Sub";
return "";
}
public static String  _lblplus_click() throws Exception{
RDebugUtils.currentModule="sher_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblplus_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblplus_click", null));}
int _x = 0;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub lblPlus_Click";
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="l.TextSize=l.TextSize+1";
mostCurrent._l.setTextSize((float) (mostCurrent._l.getTextSize()+1));
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="lblCount.Text=l.TextSize";
mostCurrent._lblcount.setText(BA.ObjectToCharSequence(mostCurrent._l.getTextSize()));
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="Dim x As Int=su.MeasureMultilineTextHeight(l,s1)";
_x = mostCurrent._su.MeasureMultilineTextHeight((android.widget.TextView)(mostCurrent._l.getObject()),BA.ObjectToCharSequence(mostCurrent._s1));
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="If x>ScrollView1.Height Then";
if (_x>mostCurrent._scrollview1.getHeight()) { 
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="ScrollView1.Panel.Height=x+16dip";
mostCurrent._scrollview1.getPanel().setHeight((int) (_x+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (16))));
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="l.Height=x";
mostCurrent._l.setHeight(_x);
 };
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="End Sub";
return "";
}
public static String  _set_sher(String _val) throws Exception{
RDebugUtils.currentModule="sher_view";
if (Debug.shouldDelegate(mostCurrent.activityBA, "set_sher", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "set_sher", new Object[] {_val}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub set_sher(val As String)";
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
return "";
}
}