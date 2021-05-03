package ir.cyber.saralahzn;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class infomodule_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (infomodule) ","infomodule",4,infomodule.mostCurrent.activityBA,infomodule.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) { return ir.cyber.saralahzn.infomodule.remoteMe.runUserSub(false, "infomodule","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 20;BA.debugLine="Activity.LoadLayout(\"info\")";
Debug.ShouldStop(524288);
infomodule.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("info")),infomodule.mostCurrent.activityBA);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Activity_Pause (infomodule) ","infomodule",4,infomodule.mostCurrent.activityBA,infomodule.mostCurrent,47);
if (RapidSub.canDelegate("activity_pause")) { return ir.cyber.saralahzn.infomodule.remoteMe.runUserSub(false, "infomodule","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 47;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Resume (infomodule) ","infomodule",4,infomodule.mostCurrent.activityBA,infomodule.mostCurrent,43);
if (RapidSub.canDelegate("activity_resume")) { return ir.cyber.saralahzn.infomodule.remoteMe.runUserSub(false, "infomodule","activity_resume");}
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (infomodule) ","infomodule",4,infomodule.mostCurrent.activityBA,infomodule.mostCurrent,71);
if (RapidSub.canDelegate("button1_click")) { return ir.cyber.saralahzn.infomodule.remoteMe.runUserSub(false, "infomodule","button1_click");}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 71;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(128);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 73;BA.debugLine="i.Initialize(i.ACTION_VIEW,\"http://t.me/sarallah_";
Debug.ShouldStop(256);
_i.runVoidMethod ("Initialize",(Object)(_i.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.createImmutable("http://t.me/sarallah_zanjan")));
 BA.debugLineNum = 74;BA.debugLine="StartActivity (i)";
Debug.ShouldStop(512);
infomodule.mostCurrent.__c.runVoidMethod ("StartActivity",infomodule.processBA,(Object)((_i.getObject())));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (infomodule) ","infomodule",4,infomodule.mostCurrent.activityBA,infomodule.mostCurrent,65);
if (RapidSub.canDelegate("button2_click")) { return ir.cyber.saralahzn.infomodule.remoteMe.runUserSub(false, "infomodule","button2_click");}
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.ariagplib.AriaMarkets");
 BA.debugLineNum = 65;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 67;BA.debugLine="Dim a As AriaMarkets";
Debug.ShouldStop(4);
_a = RemoteObject.createNew ("anywheresoftware.b4a.ariagplib.AriaMarkets");Debug.locals.put("a", _a);
 BA.debugLineNum = 68;BA.debugLine="a.Cafebazaar_SafheNazar(\"ir.cyber.saralahzn\")";
Debug.ShouldStop(8);
_a.runVoidMethod ("Cafebazaar_SafheNazar",(Object)(RemoteObject.createImmutable("ir.cyber.saralahzn")));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _insta_clickablelink(RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("insta_ClickableLink (infomodule) ","infomodule",4,infomodule.mostCurrent.activityBA,infomodule.mostCurrent,23);
if (RapidSub.canDelegate("insta_clickablelink")) { return ir.cyber.saralahzn.infomodule.remoteMe.runUserSub(false, "infomodule","insta_clickablelink", _text);}
RemoteObject _i2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
Debug.locals.put("Text", _text);
 BA.debugLineNum = 23;BA.debugLine="Sub insta_ClickableLink (Text As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Dim i2 As Intent";
Debug.ShouldStop(8388608);
_i2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i2", _i2);
 BA.debugLineNum = 25;BA.debugLine="i2.Initialize(i2.ACTION_VIEW,\"http://instagram.co";
Debug.ShouldStop(16777216);
_i2.runVoidMethod ("Initialize",(Object)(_i2.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.createImmutable("http://instagram.com/sarallah_zn.ir")));
 BA.debugLineNum = 26;BA.debugLine="StartActivity (i2)";
Debug.ShouldStop(33554432);
infomodule.mostCurrent.__c.runVoidMethod ("StartActivity",infomodule.processBA,(Object)((_i2.getObject())));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label3_click() throws Exception{
try {
		Debug.PushSubsStack("Label3_Click (infomodule) ","infomodule",4,infomodule.mostCurrent.activityBA,infomodule.mostCurrent,52);
if (RapidSub.canDelegate("label3_click")) { return ir.cyber.saralahzn.infomodule.remoteMe.runUserSub(false, "infomodule","label3_click");}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 52;BA.debugLine="Sub Label3_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(2097152);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 55;BA.debugLine="i.Initialize(i.ACTION_VIEW,\"http://rayanrooyesh.i";
Debug.ShouldStop(4194304);
_i.runVoidMethod ("Initialize",(Object)(_i.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.createImmutable("http://rayanrooyesh.ir")));
 BA.debugLineNum = 56;BA.debugLine="StartActivity (i)";
Debug.ShouldStop(8388608);
infomodule.mostCurrent.__c.runVoidMethod ("StartActivity",infomodule.processBA,(Object)((_i.getObject())));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _sitelink_click() throws Exception{
try {
		Debug.PushSubsStack("siteLink_Click (infomodule) ","infomodule",4,infomodule.mostCurrent.activityBA,infomodule.mostCurrent,59);
if (RapidSub.canDelegate("sitelink_click")) { return ir.cyber.saralahzn.infomodule.remoteMe.runUserSub(false, "infomodule","sitelink_click");}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 59;BA.debugLine="Sub siteLink_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(134217728);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 61;BA.debugLine="i.Initialize(i.ACTION_VIEW,\"http://sarallah-zn.ir";
Debug.ShouldStop(268435456);
_i.runVoidMethod ("Initialize",(Object)(_i.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.createImmutable("http://sarallah-zn.ir/")));
 BA.debugLineNum = 62;BA.debugLine="StartActivity (i)";
Debug.ShouldStop(536870912);
infomodule.mostCurrent.__c.runVoidMethod ("StartActivity",infomodule.processBA,(Object)((_i.getObject())));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}