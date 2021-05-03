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

public class newmain extends Activity implements B4AActivity{
	public static newmain mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.cyber.saralahzn", "ir.cyber.saralahzn.newmain");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (newmain).");
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
		activityBA = new BA(this, layout, processBA, "ir.cyber.saralahzn", "ir.cyber.saralahzn.newmain");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.cyber.saralahzn.newmain", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (newmain) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (newmain) Resume **");
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
		return newmain.class;
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
        BA.LogInfo("** Activity (newmain) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            newmain mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (newmain) Resume **");
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
public static String _ip = "";
public flm.b4a.ultimatelistview.UltimateListViewWrapper _ulv = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public ir.cyber.saralahzn.main _main = null;
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
RDebugUtils.currentModule="newmain";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
int _i = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _d = null;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Activity.LoadLayout(\"main\")";
mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="File.Copy(File.DirAssets,\"saralah.db\",File.DirInt";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"saralah.db",anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"saralah.db");
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="sql.Initialize(File.DirInternal,\"saralah.db\",Fals";
_sql.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"saralah.db",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="cur1=sql.ExecQuery(\"SELECT * from home_menu\")";
_cur1.setObject((android.database.Cursor)(_sql.ExecQuery("SELECT * from home_menu")));
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="ulv.Initialize(000,0,0,\"ulv\")";
mostCurrent._ulv.Initialize(mostCurrent.activityBA,(byte) (000),(int) (0),BA.NumberToString(0),"ulv");
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="Panel1.AddView(ulv,0,0,-1,-1)";
mostCurrent._panel1.AddView((android.view.View)(mostCurrent._ulv.getObject()),(int) (0),(int) (0),(int) (-1),(int) (-1));
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="ulv.AddLayout(\"layout1\",\"ulv_LayoutCreator\",\"ulv_";
mostCurrent._ulv.AddLayout("layout1","ulv_LayoutCreator","ulv_ContentFiller",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1114131;
 //BA.debugLineNum = 1114131;BA.debugLine="For i=0 To cur1.RowCount-1";
{
final int step8 = 1;
final int limit8 = (int) (_cur1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=1114132;
 //BA.debugLineNum = 1114132;BA.debugLine="ulv.AddItem(\"layout1\",i)";
mostCurrent._ulv.AddItem("layout1",(long) (_i));
 }
};
RDebugUtils.currentLine=1114134;
 //BA.debugLineNum = 1114134;BA.debugLine="Dim d As ColorDrawable";
_d = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=1114135;
 //BA.debugLineNum = 1114135;BA.debugLine="d.Initialize(Colors.Transparent,-1)";
_d.Initialize(anywheresoftware.b4a.keywords.Common.Colors.Transparent,(int) (-1));
RDebugUtils.currentLine=1114136;
 //BA.debugLineNum = 1114136;BA.debugLine="ulv.DividerDrawable=d";
mostCurrent._ulv.setDividerDrawable((android.graphics.drawable.Drawable)(_d.getObject()));
RDebugUtils.currentLine=1114137;
 //BA.debugLineNum = 1114137;BA.debugLine="ulv.DividerHeight=20dip";
mostCurrent._ulv.setDividerHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1114138;
 //BA.debugLineNum = 1114138;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="newmain";
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="newmain";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public static String  _imginfo_click() throws Exception{
RDebugUtils.currentModule="newmain";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imginfo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imginfo_click", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub imginfo_Click";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="StartActivity(infomodule)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._infomodule.getObject()));
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return "";
}
public static String  _iv_insta_click() throws Exception{
RDebugUtils.currentModule="newmain";
if (Debug.shouldDelegate(mostCurrent.activityBA, "iv_insta_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "iv_insta_click", null));}
anywheresoftware.b4a.objects.IntentWrapper _i2 = null;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub iv_insta_Click";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Dim i2 As Intent";
_i2 = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="i2.Initialize(i2.ACTION_VIEW,\"http://instagram.co";
_i2.Initialize(_i2.ACTION_VIEW,"http://instagram.com/sarallah_zn.ir");
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="StartActivity (i2)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_i2.getObject()));
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="End Sub";
return "";
}
public static String  _iv_telegram_click() throws Exception{
RDebugUtils.currentModule="newmain";
if (Debug.shouldDelegate(mostCurrent.activityBA, "iv_telegram_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "iv_telegram_click", null));}
anywheresoftware.b4a.objects.IntentWrapper _i = null;
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub iv_telegram_Click";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="i.Initialize(i.ACTION_VIEW,\"http://t.me/sarallah_";
_i.Initialize(_i.ACTION_VIEW,"http://t.me/sarallah_zanjan");
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="StartActivity (i)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_i.getObject()));
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="End Sub";
return "";
}
public static String  _ulv_contentfiller(long _itemid,String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _layoutpanel,int _position) throws Exception{
RDebugUtils.currentModule="newmain";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ulv_contentfiller", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ulv_contentfiller", new Object[] {_itemid,_layoutname,_layoutpanel,_position}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_tite = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_subtitle = null;
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub ulv_ContentFiller(ItemID As Long, LayoutName A";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="cur1.Position=ItemID";
_cur1.setPosition((int) (_itemid));
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Log(LayoutPanel.NumberOfViews)";
anywheresoftware.b4a.keywords.Common.LogImpl("61245187",BA.NumberToString(_layoutpanel.getNumberOfViews()),0);
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Dim p As Panel=LayoutPanel.GetView(0)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p.setObject((android.view.ViewGroup)(_layoutpanel.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="p.Tag=ItemID";
_p.setTag((Object)(_itemid));
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="Dim lbl_tite As Label=p.GetView(1)";
_lbl_tite = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_tite.setObject((android.widget.TextView)(_p.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="lbl_tite.Text=cur1.GetString(\"menu\")";
_lbl_tite.setText(BA.ObjectToCharSequence(_cur1.GetString("menu")));
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="Log(lbl_tite.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("61245192",_lbl_tite.getText(),0);
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="Dim lbl_subtitle As Label=p.GetView(0)";
_lbl_subtitle = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_subtitle.setObject((android.widget.TextView)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="Log(lbl_tite.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("61245195",_lbl_tite.getText(),0);
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="lbl_subtitle.Text=cur1.GetString(\"submenu\")";
_lbl_subtitle.setText(BA.ObjectToCharSequence(_cur1.GetString("submenu")));
RDebugUtils.currentLine=1245199;
 //BA.debugLineNum = 1245199;BA.debugLine="Log(lbl_tite.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("61245199",_lbl_tite.getText(),0);
RDebugUtils.currentLine=1245200;
 //BA.debugLineNum = 1245200;BA.debugLine="Dim img As ImageView=p.GetView(2)";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
_img.setObject((android.widget.ImageView)(_p.GetView((int) (2)).getObject()));
RDebugUtils.currentLine=1245201;
 //BA.debugLineNum = 1245201;BA.debugLine="img.Bitmap=LoadBitmap(File.DirAssets,\"ico_maddahi";
_img.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ico_maddahi.png").getObject()));
RDebugUtils.currentLine=1245202;
 //BA.debugLineNum = 1245202;BA.debugLine="ulv.Color=Colors.Transparent";
mostCurrent._ulv.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=1245203;
 //BA.debugLineNum = 1245203;BA.debugLine="LayoutPanel.Tag=cur1.GetString(\"ID\")";
_layoutpanel.setTag((Object)(_cur1.GetString("ID")));
RDebugUtils.currentLine=1245205;
 //BA.debugLineNum = 1245205;BA.debugLine="If ItemID=0 Then";
if (_itemid==0) { 
RDebugUtils.currentLine=1245206;
 //BA.debugLineNum = 1245206;BA.debugLine="ulv.SetStyle(ulv.STYLE_HOLO_LIGHT)";
mostCurrent._ulv.SetStyle(mostCurrent.activityBA,mostCurrent._ulv.STYLE_HOLO_LIGHT);
RDebugUtils.currentLine=1245207;
 //BA.debugLineNum = 1245207;BA.debugLine="ulv.Color=0x00201F1F";
mostCurrent._ulv.setColor((int) (0x00201f1f));
 };
RDebugUtils.currentLine=1245210;
 //BA.debugLineNum = 1245210;BA.debugLine="End Sub";
return "";
}
public static String  _ulv_itemclick(long _itemid,int _position,anywheresoftware.b4a.objects.PanelWrapper _clickedpanel) throws Exception{
RDebugUtils.currentModule="newmain";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ulv_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ulv_itemclick", new Object[] {_itemid,_position,_clickedpanel}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub ulv_ItemClick(ItemID As Long, Position As Int,";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Log(\"ClickedPanel\")";
anywheresoftware.b4a.keywords.Common.LogImpl("61310721","ClickedPanel",0);
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Select Position";
switch (_position) {
case 0: {
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="StartActivity(video)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._video.getObject()));
 break; }
case 3: {
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="StartActivity(pic_view)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._pic_view.getObject()));
 break; }
case 4: {
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="StartActivity(ashar)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._ashar.getObject()));
 break; }
case 6: {
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="StartActivity(news)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._news.getObject()));
 break; }
}
;
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="End Sub";
return "";
}
public static String  _ulv_layoutcreator(String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _layoutpanel) throws Exception{
RDebugUtils.currentModule="newmain";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ulv_layoutcreator", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ulv_layoutcreator", new Object[] {_layoutname,_layoutpanel}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub ulv_LayoutCreator(LayoutName As String, Layout";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="LayoutPanel.LoadLayout(\"layout1\")";
_layoutpanel.LoadLayout("layout1",mostCurrent.activityBA);
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
}