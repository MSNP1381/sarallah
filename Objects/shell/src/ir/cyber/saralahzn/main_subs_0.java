package ir.cyber.saralahzn;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("activity_create")) { return ir.cyber.saralahzn.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="If File.IsDirectory(File.DirRootExternal&\"/Sarala";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(RemoteObject.concat(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirRootExternal"),RemoteObject.createImmutable("/SaralahCyber"))),(Object)(RemoteObject.createImmutable(""))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 42;BA.debugLine="Log( File.IsDirectory(File.DirRootExternal,\"sara";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethod ("LogImpl","6131075",BA.ObjectToString(RemoteObject.solveBoolean("=",main.mostCurrent.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirRootExternal")),(Object)(RemoteObject.createImmutable("saralahcyber"))),main.mostCurrent.__c.getField(true,"False"))),0);
 BA.debugLineNum = 43;BA.debugLine="File.MakeDir(File.DirRootExternal,\"SaralahCyber\"";
Debug.ShouldStop(1024);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirRootExternal")),(Object)(RemoteObject.createImmutable("SaralahCyber")));
 };
 BA.debugLineNum = 45;BA.debugLine="Activity.LoadLayout(\"anim_layout\")";
Debug.ShouldStop(4096);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("anim_layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 46;BA.debugLine="a.InitializeRotateCenter(\"animcore\",0,290,ivOutli";
Debug.ShouldStop(8192);
main.mostCurrent._a.runVoidMethod ("InitializeRotateCenter",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("animcore")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 290)),(Object)((main.mostCurrent._ivoutline.getObject())));
 BA.debugLineNum = 49;BA.debugLine="a.RepeatCount=-1";
Debug.ShouldStop(65536);
main.mostCurrent._a.runMethod(true,"setRepeatCount",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 50;BA.debugLine="a.Duration=10000";
Debug.ShouldStop(131072);
main.mostCurrent._a.runMethod(true,"setDuration",BA.numberCast(long.class, 10000));
 BA.debugLineNum = 52;BA.debugLine="If a.IsInitialized Then";
Debug.ShouldStop(524288);
if (main.mostCurrent._a.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 53;BA.debugLine="Activity.Invalidate";
Debug.ShouldStop(1048576);
main.mostCurrent._activity.runVoidMethod ("Invalidate");
 BA.debugLineNum = 54;BA.debugLine="a.Start(ivOutline)";
Debug.ShouldStop(2097152);
main.mostCurrent._a.runVoidMethod ("Start",(Object)((main.mostCurrent._ivoutline.getObject())));
 };
 BA.debugLineNum = 56;BA.debugLine="t.Initialize(\"t\",2000)";
Debug.ShouldStop(8388608);
main._t.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("t")),(Object)(BA.numberCast(long.class, 2000)));
 BA.debugLineNum = 57;BA.debugLine="t.Enabled=True";
Debug.ShouldStop(16777216);
main._t.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 59;BA.debugLine="animatedbackground.SetLayoutAnimated(5500,100%X-a";
Debug.ShouldStop(67108864);
main.mostCurrent._animatedbackground.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 5500)),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),main.mostCurrent._animatedbackground.runMethod(true,"getWidth")}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent._animatedbackground.runMethod(true,"getWidth")),(Object)(main.mostCurrent._animatedbackground.runMethod(true,"getHeight")));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,68);
if (RapidSub.canDelegate("activity_pause")) { return ir.cyber.saralahzn.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 68;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,64);
if (RapidSub.canDelegate("activity_resume")) { return ir.cyber.saralahzn.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 64;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _callactivity() throws Exception{
try {
		Debug.PushSubsStack("callActivity (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,92);
if (RapidSub.canDelegate("callactivity")) { return ir.cyber.saralahzn.main.remoteMe.runUserSub(false, "main","callactivity");}
 BA.debugLineNum = 92;BA.debugLine="Sub callActivity";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="t2.Enabled=False";
Debug.ShouldStop(268435456);
main._t2.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 94;BA.debugLine="StartActivity(newMain)";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._newmain.getObject())));
 BA.debugLineNum = 95;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1073741824);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 29;BA.debugLine="Private animatedbackground As ImageView";
main.mostCurrent._animatedbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private ivBackground As ImageView";
main.mostCurrent._ivbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private ivcore As ImageView";
main.mostCurrent._ivcore = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private ivOutline As ImageView";
main.mostCurrent._ivoutline = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private Panel1 As Panel";
main.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Dim a As Animation";
main.mostCurrent._a = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hitex_reveallayout1_onanimationend() throws Exception{
try {
		Debug.PushSubsStack("Hitex_RevealLayout1_onAnimationEnd (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,99);
if (RapidSub.canDelegate("hitex_reveallayout1_onanimationend")) { return ir.cyber.saralahzn.main.remoteMe.runUserSub(false, "main","hitex_reveallayout1_onanimationend");}
 BA.debugLineNum = 99;BA.debugLine="Sub Hitex_RevealLayout1_onAnimationEnd";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
newmain_subs_0._process_globals();
ashar_subs_0._process_globals();
sher_view_subs_0._process_globals();
infomodule_subs_0._process_globals();
news_subs_0._process_globals();
news_view_subs_0._process_globals();
audionotifi_subs_0._process_globals();
starter_subs_0._process_globals();
pic_view_subs_0._process_globals();
video_subs_0._process_globals();
video_view_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("ir.cyber.saralahzn.main");
newmain.myClass = BA.getDeviceClass ("ir.cyber.saralahzn.newmain");
ashar.myClass = BA.getDeviceClass ("ir.cyber.saralahzn.ashar");
sher_view.myClass = BA.getDeviceClass ("ir.cyber.saralahzn.sher_view");
infomodule.myClass = BA.getDeviceClass ("ir.cyber.saralahzn.infomodule");
news.myClass = BA.getDeviceClass ("ir.cyber.saralahzn.news");
news_view.myClass = BA.getDeviceClass ("ir.cyber.saralahzn.news_view");
audionotifi.myClass = BA.getDeviceClass ("ir.cyber.saralahzn.audionotifi");
starter.myClass = BA.getDeviceClass ("ir.cyber.saralahzn.starter");
pic_view.myClass = BA.getDeviceClass ("ir.cyber.saralahzn.pic_view");
video.myClass = BA.getDeviceClass ("ir.cyber.saralahzn.video");
video_view.myClass = BA.getDeviceClass ("ir.cyber.saralahzn.video_view");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 22;BA.debugLine="Dim t,t2 As Timer";
main._t = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
main._t2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _t_tick() throws Exception{
try {
		Debug.PushSubsStack("t_Tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,71);
if (RapidSub.canDelegate("t_tick")) { return ir.cyber.saralahzn.main.remoteMe.runUserSub(false, "main","t_tick");}
RemoteObject _h = RemoteObject.createImmutable(0);
RemoteObject _w = RemoteObject.createImmutable(0);
 BA.debugLineNum = 71;BA.debugLine="Sub  t_Tick";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="t.Enabled=False";
Debug.ShouldStop(128);
main._t.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 73;BA.debugLine="Dim h,w As Int";
Debug.ShouldStop(256);
_h = RemoteObject.createImmutable(0);Debug.locals.put("h", _h);
_w = RemoteObject.createImmutable(0);Debug.locals.put("w", _w);
 BA.debugLineNum = 74;BA.debugLine="h=Panel1.Height/1'2";
Debug.ShouldStop(512);
_h = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {main.mostCurrent._panel1.runMethod(true,"getHeight"),RemoteObject.createImmutable(1)}, "/",0, 0));Debug.locals.put("h", _h);
 BA.debugLineNum = 75;BA.debugLine="w=Panel1.Height/1'2";
Debug.ShouldStop(1024);
_w = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {main.mostCurrent._panel1.runMethod(true,"getHeight"),RemoteObject.createImmutable(1)}, "/",0, 0));Debug.locals.put("w", _w);
 BA.debugLineNum = 76;BA.debugLine="ivOutline.Invalidate";
Debug.ShouldStop(2048);
main.mostCurrent._ivoutline.runVoidMethod ("Invalidate");
 BA.debugLineNum = 79;BA.debugLine="Panel1.SetLayoutAnimated(2000,50%X-w/2,99%y-h,w,h";
Debug.ShouldStop(16384);
main.mostCurrent._panel1.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 2000)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),main.mostCurrent.activityBA),_w,RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 99)),main.mostCurrent.activityBA),_h}, "-",1, 1)),(Object)(_w),(Object)(_h));
 BA.debugLineNum = 80;BA.debugLine="ivOutline.Invalidate";
Debug.ShouldStop(32768);
main.mostCurrent._ivoutline.runVoidMethod ("Invalidate");
 BA.debugLineNum = 81;BA.debugLine="ivBackground.SetVisibleAnimated(1500,True)";
Debug.ShouldStop(65536);
main.mostCurrent._ivbackground.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 1500)),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 82;BA.debugLine="t2.Initialize(\"t2\",2000)";
Debug.ShouldStop(131072);
main._t2.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("t2")),(Object)(BA.numberCast(long.class, 2000)));
 BA.debugLineNum = 83;BA.debugLine="t2.Enabled=True";
Debug.ShouldStop(262144);
main._t2.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t2_tick() throws Exception{
try {
		Debug.PushSubsStack("t2_Tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,85);
if (RapidSub.canDelegate("t2_tick")) { return ir.cyber.saralahzn.main.remoteMe.runUserSub(false, "main","t2_tick");}
 BA.debugLineNum = 85;BA.debugLine="Sub  t2_Tick";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 88;BA.debugLine="callActivity";
Debug.ShouldStop(8388608);
_callactivity();
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}