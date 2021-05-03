package ir.cyber.saralahzn;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class sher_view_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (sher_view) ","sher_view",3,sher_view.mostCurrent.activityBA,sher_view.mostCurrent,25);
if (RapidSub.canDelegate("activity_create")) { return ir.cyber.saralahzn.sher_view.remoteMe.runUserSub(false, "sher_view","activity_create", _firsttime);}
RemoteObject _x = RemoteObject.createImmutable(0);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="Activity.LoadLayout(\"sher_view\")";
Debug.ShouldStop(67108864);
sher_view.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("sher_view")),sher_view.mostCurrent.activityBA);
 BA.debugLineNum = 28;BA.debugLine="s1=map1.Get(\"body\")";
Debug.ShouldStop(134217728);
sher_view.mostCurrent._s1 = BA.ObjectToString(sher_view._map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("body")))));
 BA.debugLineNum = 29;BA.debugLine="l.Initialize(\"l\")";
Debug.ShouldStop(268435456);
sher_view.mostCurrent._l.runVoidMethod ("Initialize",sher_view.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("l")));
 BA.debugLineNum = 30;BA.debugLine="l.Text=s1";
Debug.ShouldStop(536870912);
sher_view.mostCurrent._l.runMethod(true,"setText",BA.ObjectToCharSequence(sher_view.mostCurrent._s1));
 BA.debugLineNum = 31;BA.debugLine="l.TextSize=20";
Debug.ShouldStop(1073741824);
sher_view.mostCurrent._l.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 32;BA.debugLine="l.Typeface=Typeface.LoadFromAssets(\"shabnam.ttf\")";
Debug.ShouldStop(-2147483648);
sher_view.mostCurrent._l.runMethod(false,"setTypeface",sher_view.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("shabnam.ttf"))));
 BA.debugLineNum = 33;BA.debugLine="ScrollView1.Panel.AddView(l,0,15dip,100%x,ScrollVi";
Debug.ShouldStop(1);
sher_view.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((sher_view.mostCurrent._l.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(sher_view.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))),(Object)(sher_view.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),sher_view.mostCurrent.activityBA)),(Object)(sher_view.mostCurrent._scrollview1.runMethod(true,"getHeight")));
 BA.debugLineNum = 35;BA.debugLine="l.TextColor=Colors.White";
Debug.ShouldStop(4);
sher_view.mostCurrent._l.runMethod(true,"setTextColor",sher_view.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 36;BA.debugLine="l.Gravity=Gravity.RIGHT+Gravity.TOP";
Debug.ShouldStop(8);
sher_view.mostCurrent._l.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {sher_view.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"),sher_view.mostCurrent.__c.getField(false,"Gravity").getField(true,"TOP")}, "+",1, 1));
 BA.debugLineNum = 37;BA.debugLine="Dim x As Int=su.MeasureMultilineTextHeight(l,s1)";
Debug.ShouldStop(16);
_x = sher_view.mostCurrent._su.runMethod(true,"MeasureMultilineTextHeight",(Object)((sher_view.mostCurrent._l.getObject())),(Object)(BA.ObjectToCharSequence(sher_view.mostCurrent._s1)));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 38;BA.debugLine="If x>ScrollView1.Height Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_x,BA.numberCast(double.class, sher_view.mostCurrent._scrollview1.runMethod(true,"getHeight")))) { 
 BA.debugLineNum = 39;BA.debugLine="ScrollView1.Panel.Height=x+16dip";
Debug.ShouldStop(64);
sher_view.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_x,sher_view.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))}, "+",1, 1));
 BA.debugLineNum = 40;BA.debugLine="l.Height=x";
Debug.ShouldStop(128);
sher_view.mostCurrent._l.runMethod(true,"setHeight",_x);
 };
 BA.debugLineNum = 43;BA.debugLine="a.InitializeRotateCenter(\"anim\",0,90,lbl_more_down";
Debug.ShouldStop(1024);
sher_view.mostCurrent._a.runVoidMethod ("InitializeRotateCenter",sher_view.mostCurrent.activityBA,(Object)(BA.ObjectToString("anim")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 90)),(Object)((sher_view.mostCurrent._lbl_more_down.getObject())));
 BA.debugLineNum = 44;BA.debugLine="a.Duration=400";
Debug.ShouldStop(2048);
sher_view.mostCurrent._a.runMethod(true,"setDuration",BA.numberCast(long.class, 400));
 BA.debugLineNum = 46;BA.debugLine="a2.InitializeRotateCenter(\"anim\",0,-90,lbl_more_d";
Debug.ShouldStop(8192);
sher_view.mostCurrent._a2.runVoidMethod ("InitializeRotateCenter",sher_view.mostCurrent.activityBA,(Object)(BA.ObjectToString("anim")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, -(double) (0 + 90))),(Object)((sher_view.mostCurrent._lbl_more_down.getObject())));
 BA.debugLineNum = 47;BA.debugLine="a2.Duration=400";
Debug.ShouldStop(16384);
sher_view.mostCurrent._a2.runMethod(true,"setDuration",BA.numberCast(long.class, 400));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Pause (sher_view) ","sher_view",3,sher_view.mostCurrent.activityBA,sher_view.mostCurrent,54);
if (RapidSub.canDelegate("activity_pause")) { return ir.cyber.saralahzn.sher_view.remoteMe.runUserSub(false, "sher_view","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 54;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Resume (sher_view) ","sher_view",3,sher_view.mostCurrent.activityBA,sher_view.mostCurrent,50);
if (RapidSub.canDelegate("activity_resume")) { return ir.cyber.saralahzn.sher_view.remoteMe.runUserSub(false, "sher_view","activity_resume");}
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Dim l As Label";
sher_view.mostCurrent._l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private ScrollView1 As ScrollView";
sher_view.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Dim s1 As String";
sher_view.mostCurrent._s1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Dim su As StringUtils";
sher_view.mostCurrent._su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");
 //BA.debugLineNum = 19;BA.debugLine="Private lblCount As Label";
sher_view.mostCurrent._lblcount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Panel2 As Panel";
sher_view.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim a,a2 As Animation";
sher_view.mostCurrent._a = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");
sher_view.mostCurrent._a2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private lbl_more_down As Label";
sher_view.mostCurrent._lbl_more_down = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _iv_play_click() throws Exception{
try {
		Debug.PushSubsStack("iv_play_Click (sher_view) ","sher_view",3,sher_view.mostCurrent.activityBA,sher_view.mostCurrent,64);
if (RapidSub.canDelegate("iv_play_click")) { return ir.cyber.saralahzn.sher_view.remoteMe.runUserSub(false, "sher_view","iv_play_click");}
 BA.debugLineNum = 64;BA.debugLine="Sub iv_play_Click";
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
public static RemoteObject  _lbl_more_down_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_more_down_Click (sher_view) ","sher_view",3,sher_view.mostCurrent.activityBA,sher_view.mostCurrent,97);
if (RapidSub.canDelegate("lbl_more_down_click")) { return ir.cyber.saralahzn.sher_view.remoteMe.runUserSub(false, "sher_view","lbl_more_down_click");}
 BA.debugLineNum = 97;BA.debugLine="Sub lbl_more_down_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="If Panel2.Visible Then";
Debug.ShouldStop(2);
if (sher_view.mostCurrent._panel2.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 99;BA.debugLine="a.Start(lbl_more_down)";
Debug.ShouldStop(4);
sher_view.mostCurrent._a.runVoidMethod ("Start",(Object)((sher_view.mostCurrent._lbl_more_down.getObject())));
 BA.debugLineNum = 100;BA.debugLine="Panel2.SetVisibleAnimated(400,Not(Panel2.Visible";
Debug.ShouldStop(8);
sher_view.mostCurrent._panel2.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 400)),(Object)(sher_view.mostCurrent.__c.runMethod(true,"Not",(Object)(sher_view.mostCurrent._panel2.runMethod(true,"getVisible")))));
 }else {
 BA.debugLineNum = 104;BA.debugLine="a2.Start(lbl_more_down)";
Debug.ShouldStop(128);
sher_view.mostCurrent._a2.runVoidMethod ("Start",(Object)((sher_view.mostCurrent._lbl_more_down.getObject())));
 BA.debugLineNum = 105;BA.debugLine="Panel2.SetVisibleAnimated(400,Not(Panel2.Visible";
Debug.ShouldStop(256);
sher_view.mostCurrent._panel2.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 400)),(Object)(sher_view.mostCurrent.__c.runMethod(true,"Not",(Object)(sher_view.mostCurrent._panel2.runMethod(true,"getVisible")))));
 };
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_save_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_save_Click (sher_view) ","sher_view",3,sher_view.mostCurrent.activityBA,sher_view.mostCurrent,68);
if (RapidSub.canDelegate("lbl_save_click")) { return ir.cyber.saralahzn.sher_view.remoteMe.runUserSub(false, "sher_view","lbl_save_click");}
 BA.debugLineNum = 68;BA.debugLine="Sub lbl_save_Click";
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
public static RemoteObject  _lbl_title_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_title_Click (sher_view) ","sher_view",3,sher_view.mostCurrent.activityBA,sher_view.mostCurrent,72);
if (RapidSub.canDelegate("lbl_title_click")) { return ir.cyber.saralahzn.sher_view.remoteMe.runUserSub(false, "sher_view","lbl_title_click");}
 BA.debugLineNum = 72;BA.debugLine="Sub lbl_title_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblmines_click() throws Exception{
try {
		Debug.PushSubsStack("lblMines_Click (sher_view) ","sher_view",3,sher_view.mostCurrent.activityBA,sher_view.mostCurrent,76);
if (RapidSub.canDelegate("lblmines_click")) { return ir.cyber.saralahzn.sher_view.remoteMe.runUserSub(false, "sher_view","lblmines_click");}
RemoteObject _x = RemoteObject.createImmutable(0);
 BA.debugLineNum = 76;BA.debugLine="Sub lblMines_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="l.TextSize=l.TextSize-1";
Debug.ShouldStop(4096);
sher_view.mostCurrent._l.runMethod(true,"setTextSize",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {sher_view.mostCurrent._l.runMethod(true,"getTextSize"),RemoteObject.createImmutable(1)}, "-",1, 0)));
 BA.debugLineNum = 78;BA.debugLine="lblCount.Text=l.TextSize";
Debug.ShouldStop(8192);
sher_view.mostCurrent._lblcount.runMethod(true,"setText",BA.ObjectToCharSequence(sher_view.mostCurrent._l.runMethod(true,"getTextSize")));
 BA.debugLineNum = 79;BA.debugLine="Dim x As Int=su.MeasureMultilineTextHeight(l,s1)";
Debug.ShouldStop(16384);
_x = sher_view.mostCurrent._su.runMethod(true,"MeasureMultilineTextHeight",(Object)((sher_view.mostCurrent._l.getObject())),(Object)(BA.ObjectToCharSequence(sher_view.mostCurrent._s1)));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 80;BA.debugLine="If x>ScrollView1.Height Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",_x,BA.numberCast(double.class, sher_view.mostCurrent._scrollview1.runMethod(true,"getHeight")))) { 
 BA.debugLineNum = 81;BA.debugLine="ScrollView1.Panel.Height=x+16dip";
Debug.ShouldStop(65536);
sher_view.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_x,sher_view.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))}, "+",1, 1));
 BA.debugLineNum = 82;BA.debugLine="l.Height=x";
Debug.ShouldStop(131072);
sher_view.mostCurrent._l.runMethod(true,"setHeight",_x);
 };
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
public static RemoteObject  _lblplus_click() throws Exception{
try {
		Debug.PushSubsStack("lblPlus_Click (sher_view) ","sher_view",3,sher_view.mostCurrent.activityBA,sher_view.mostCurrent,86);
if (RapidSub.canDelegate("lblplus_click")) { return ir.cyber.saralahzn.sher_view.remoteMe.runUserSub(false, "sher_view","lblplus_click");}
RemoteObject _x = RemoteObject.createImmutable(0);
 BA.debugLineNum = 86;BA.debugLine="Sub lblPlus_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 88;BA.debugLine="l.TextSize=l.TextSize+1";
Debug.ShouldStop(8388608);
sher_view.mostCurrent._l.runMethod(true,"setTextSize",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {sher_view.mostCurrent._l.runMethod(true,"getTextSize"),RemoteObject.createImmutable(1)}, "+",1, 0)));
 BA.debugLineNum = 89;BA.debugLine="lblCount.Text=l.TextSize";
Debug.ShouldStop(16777216);
sher_view.mostCurrent._lblcount.runMethod(true,"setText",BA.ObjectToCharSequence(sher_view.mostCurrent._l.runMethod(true,"getTextSize")));
 BA.debugLineNum = 90;BA.debugLine="Dim x As Int=su.MeasureMultilineTextHeight(l,s1)";
Debug.ShouldStop(33554432);
_x = sher_view.mostCurrent._su.runMethod(true,"MeasureMultilineTextHeight",(Object)((sher_view.mostCurrent._l.getObject())),(Object)(BA.ObjectToCharSequence(sher_view.mostCurrent._s1)));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 91;BA.debugLine="If x>ScrollView1.Height Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_x,BA.numberCast(double.class, sher_view.mostCurrent._scrollview1.runMethod(true,"getHeight")))) { 
 BA.debugLineNum = 92;BA.debugLine="ScrollView1.Panel.Height=x+16dip";
Debug.ShouldStop(134217728);
sher_view.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_x,sher_view.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))}, "+",1, 1));
 BA.debugLineNum = 93;BA.debugLine="l.Height=x";
Debug.ShouldStop(268435456);
sher_view.mostCurrent._l.runMethod(true,"setHeight",_x);
 };
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim map1 As Map";
sher_view._map1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _set_sher(RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("set_sher (sher_view) ","sher_view",3,sher_view.mostCurrent.activityBA,sher_view.mostCurrent,59);
if (RapidSub.canDelegate("set_sher")) { return ir.cyber.saralahzn.sher_view.remoteMe.runUserSub(false, "sher_view","set_sher", _val);}
Debug.locals.put("val", _val);
 BA.debugLineNum = 59;BA.debugLine="Sub set_sher(val As String)";
Debug.ShouldStop(67108864);
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
}