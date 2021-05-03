package ir.cyber.saralahzn;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class starter_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (starter) ","starter",8,starter.processBA,starter.mostCurrent,31);
if (RapidSub.canDelegate("application_error")) { return ir.cyber.saralahzn.starter.remoteMe.runUserSub(false, "starter","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 31;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) return starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dwnl(RemoteObject _url,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("dwnl (starter) ","starter",8,starter.processBA,starter.mostCurrent,39);
if (RapidSub.canDelegate("dwnl")) { return ir.cyber.saralahzn.starter.remoteMe.runUserSub(false, "starter","dwnl", _url, _module);}
RemoteObject _hj = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("url", _url);
Debug.locals.put("module", _module);
 BA.debugLineNum = 39;BA.debugLine="Sub dwnl(url As String,module As Object)";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="modu=module";
Debug.ShouldStop(128);
starter._modu = _module;
 BA.debugLineNum = 41;BA.debugLine="Dim hj As HttpJob";
Debug.ShouldStop(256);
_hj = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("hj", _hj);
 BA.debugLineNum = 42;BA.debugLine="hj.Initialize(\"job1\",Me)";
Debug.ShouldStop(512);
_hj.runVoidMethod ("_initialize",starter.processBA,(Object)(BA.ObjectToString("job1")),(Object)(starter.getObject()));
 BA.debugLineNum = 43;BA.debugLine="hj.Download(url)";
Debug.ShouldStop(1024);
_hj.runVoidMethod ("_download",(Object)(_url));
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
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("jobdone (starter) ","starter",8,starter.processBA,starter.mostCurrent,46);
if (RapidSub.canDelegate("jobdone")) { return ir.cyber.saralahzn.starter.remoteMe.runUserSub(false, "starter","jobdone", _job);}
Debug.locals.put("job", _job);
 BA.debugLineNum = 46;BA.debugLine="Sub jobdone(job As HttpJob)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Log(\"job.Success = \"&job.Success)";
Debug.ShouldStop(16384);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","65832705",RemoteObject.concat(RemoteObject.createImmutable("job.Success = "),_job.getField(true,"_success")),0);
 BA.debugLineNum = 48;BA.debugLine="If job.Success Then";
Debug.ShouldStop(32768);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 49;BA.debugLine="CallSub2(modu,\"start\",job.GetString)";
Debug.ShouldStop(65536);
starter.mostCurrent.__c.runMethodAndSync(false,"CallSubNew2",starter.processBA,(Object)(starter._modu),(Object)(BA.ObjectToString("start")),(Object)((_job.runMethod(true,"_getstring"))));
 }else {
 BA.debugLineNum = 51;BA.debugLine="CallSub(modu,\"end1\")";
Debug.ShouldStop(262144);
starter.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",starter.processBA,(Object)(starter._modu),(Object)(RemoteObject.createImmutable("end1")));
 };
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Dim modu As Object";
starter._modu = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (starter) ","starter",8,starter.processBA,starter.mostCurrent,16);
if (RapidSub.canDelegate("service_create")) { return ir.cyber.saralahzn.starter.remoteMe.runUserSub(false, "starter","service_create");}
 BA.debugLineNum = 16;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(32768);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Service_Destroy (starter) ","starter",8,starter.processBA,starter.mostCurrent,35);
if (RapidSub.canDelegate("service_destroy")) { return ir.cyber.saralahzn.starter.remoteMe.runUserSub(false, "starter","service_destroy");}
 BA.debugLineNum = 35;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Service_Start (starter) ","starter",8,starter.processBA,starter.mostCurrent,22);
if (RapidSub.canDelegate("service_start")) { return ir.cyber.saralahzn.starter.remoteMe.runUserSub(false, "starter","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 22;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_taskremoved() throws Exception{
try {
		Debug.PushSubsStack("Service_TaskRemoved (starter) ","starter",8,starter.processBA,starter.mostCurrent,26);
if (RapidSub.canDelegate("service_taskremoved")) { return ir.cyber.saralahzn.starter.remoteMe.runUserSub(false, "starter","service_taskremoved");}
 BA.debugLineNum = 26;BA.debugLine="Sub Service_TaskRemoved";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}