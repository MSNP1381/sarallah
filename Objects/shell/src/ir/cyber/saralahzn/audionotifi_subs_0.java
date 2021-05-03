package ir.cyber.saralahzn;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class audionotifi_subs_0 {


public static RemoteObject  _close() throws Exception{
try {
		Debug.PushSubsStack("close (audionotifi) ","audionotifi",7,audionotifi.processBA,audionotifi.mostCurrent,56);
if (RapidSub.canDelegate("close")) { return ir.cyber.saralahzn.audionotifi.remoteMe.runUserSub(false, "audionotifi","close");}
 BA.debugLineNum = 56;BA.debugLine="Sub close";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _notify() throws Exception{
try {
		Debug.PushSubsStack("notify (audionotifi) ","audionotifi",7,audionotifi.processBA,audionotifi.mostCurrent,27);
if (RapidSub.canDelegate("notify")) { return ir.cyber.saralahzn.audionotifi.remoteMe.runUserSub(false, "audionotifi","notify");}
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4a.objects.NotificationWrapper");
 BA.debugLineNum = 27;BA.debugLine="Sub notify";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="nb.Initialize";
Debug.ShouldStop(268435456);
audionotifi._nb.runVoidMethod ("Initialize",audionotifi.processBA);
 BA.debugLineNum = 30;BA.debugLine="nb.SmallIcon = \"hhlogo\"";
Debug.ShouldStop(536870912);
audionotifi._nb.runVoidMethod ("setSmallIcon",BA.ObjectToString("hhlogo"));
 BA.debugLineNum = 31;BA.debugLine="nb.Ticker = \"New Demo\"";
Debug.ShouldStop(1073741824);
audionotifi._nb.runVoidMethod ("setTicker",BA.ObjectToString("New Demo"));
 BA.debugLineNum = 32;BA.debugLine="nb.DefaultLight = True";
Debug.ShouldStop(-2147483648);
audionotifi._nb.runVoidMethod ("setDefaultLight",audionotifi.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 33;BA.debugLine="nb.DefaultVibrate = True";
Debug.ShouldStop(1);
audionotifi._nb.runVoidMethod ("setDefaultVibrate",audionotifi.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 34;BA.debugLine="nb.DefaultSound = True";
Debug.ShouldStop(2);
audionotifi._nb.runVoidMethod ("setDefaultSound",audionotifi.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 35;BA.debugLine="nb.ContentTitle = m.Get(\"text\")";
Debug.ShouldStop(4);
audionotifi._nb.runVoidMethod ("setContentTitle",BA.ObjectToString(audionotifi._m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("text"))))));
 BA.debugLineNum = 36;BA.debugLine="nb.DefaultSound=False";
Debug.ShouldStop(8);
audionotifi._nb.runVoidMethod ("setDefaultSound",audionotifi.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 37;BA.debugLine="nb.ShowTime=False";
Debug.ShouldStop(16);
audionotifi._nb.runVoidMethod ("setShowTime",audionotifi.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 38;BA.debugLine="nb.AddAction2(\"pause\",\"\",\"ct\",video_view)";
Debug.ShouldStop(32);
audionotifi._nb.runVoidMethod ("AddAction2",audionotifi.processBA,(Object)(BA.ObjectToString("pause")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("ct")),(Object)((audionotifi.mostCurrent._video_view.getObject())));
 BA.debugLineNum = 39;BA.debugLine="nb.AddAction(\"close\", \"\",\"close\",video_view)";
Debug.ShouldStop(64);
audionotifi._nb.runVoidMethod ("AddAction",audionotifi.processBA,(Object)(BA.ObjectToString("close")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("close")),(Object)((audionotifi.mostCurrent._video_view.getObject())));
 BA.debugLineNum = 40;BA.debugLine="nb.AutoCancel=True";
Debug.ShouldStop(128);
audionotifi._nb.runVoidMethod ("setAutoCancel",audionotifi.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 41;BA.debugLine="Dim n As Notification= nb.GetNotification";
Debug.ShouldStop(256);
_n = RemoteObject.createNew ("anywheresoftware.b4a.objects.NotificationWrapper");
_n.setObject(audionotifi._nb.runMethod(false,"GetNotification",audionotifi.processBA));Debug.locals.put("n", _n);
 BA.debugLineNum = 42;BA.debugLine="n.AutoCancel=False";
Debug.ShouldStop(512);
_n.runVoidMethod ("setAutoCancel",audionotifi.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 43;BA.debugLine="nb.Notify(1)";
Debug.ShouldStop(1024);
audionotifi._nb.runVoidMethod ("Notify",audionotifi.processBA,(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim m As Map";
audionotifi._m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 12;BA.debugLine="Dim nb As NotificationBuilder";
audionotifi._nb = RemoteObject.createNew ("barxdroid.NotificationBuilder.NotificationBuilder");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _resume() throws Exception{
try {
		Debug.PushSubsStack("resume (audionotifi) ","audionotifi",7,audionotifi.processBA,audionotifi.mostCurrent,53);
if (RapidSub.canDelegate("resume")) { return ir.cyber.saralahzn.audionotifi.remoteMe.runUserSub(false, "audionotifi","resume");}
 BA.debugLineNum = 53;BA.debugLine="Sub resume";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (audionotifi) ","audionotifi",7,audionotifi.processBA,audionotifi.mostCurrent,15);
if (RapidSub.canDelegate("service_create")) { return ir.cyber.saralahzn.audionotifi.remoteMe.runUserSub(false, "audionotifi","service_create");}
 BA.debugLineNum = 15;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Log(\"CreateMa\")";
Debug.ShouldStop(32768);
audionotifi.mostCurrent.__c.runVoidMethod ("LogImpl","65308417",RemoteObject.createImmutable("CreateMa"),0);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (audionotifi) ","audionotifi",7,audionotifi.processBA,audionotifi.mostCurrent,24);
if (RapidSub.canDelegate("service_destroy")) { return ir.cyber.saralahzn.audionotifi.remoteMe.runUserSub(false, "audionotifi","service_destroy");}
 BA.debugLineNum = 24;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (audionotifi) ","audionotifi",7,audionotifi.processBA,audionotifi.mostCurrent,19);
if (RapidSub.canDelegate("service_start")) { return ir.cyber.saralahzn.audionotifi.remoteMe.runUserSub(false, "audionotifi","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 19;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Log(StartingIntent.ExtrasToString)";
Debug.ShouldStop(524288);
audionotifi.mostCurrent.__c.runVoidMethod ("LogImpl","65373953",_startingintent.runMethod(true,"ExtrasToString"),0);
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
public static RemoteObject  _set_stream() throws Exception{
try {
		Debug.PushSubsStack("set_stream (audionotifi) ","audionotifi",7,audionotifi.processBA,audionotifi.mostCurrent,48);
if (RapidSub.canDelegate("set_stream")) { return ir.cyber.saralahzn.audionotifi.remoteMe.runUserSub(false, "audionotifi","set_stream");}
 BA.debugLineNum = 48;BA.debugLine="Sub set_stream";
Debug.ShouldStop(32768);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}