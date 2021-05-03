package ir.cyber.saralahzn;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class audionotifi extends  android.app.Service{
	public static class audionotifi_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (audionotifi) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, audionotifi.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static audionotifi mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return audionotifi.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "ir.cyber.saralahzn", "ir.cyber.saralahzn.audionotifi");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.cyber.saralahzn.audionotifi", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (audionotifi) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (false) {
			ServiceHelper.StarterHelper.runWaitForLayouts();
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (audionotifi) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (false)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (audionotifi) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (audionotifi) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (audionotifi) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.Map _m = null;
public static barxdroid.NotificationBuilder.NotificationBuilder _nb = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public ir.cyber.saralahzn.main _main = null;
public ir.cyber.saralahzn.newmain _newmain = null;
public ir.cyber.saralahzn.ashar _ashar = null;
public ir.cyber.saralahzn.sher_view _sher_view = null;
public ir.cyber.saralahzn.infomodule _infomodule = null;
public ir.cyber.saralahzn.news _news = null;
public ir.cyber.saralahzn.news_view _news_view = null;
public ir.cyber.saralahzn.starter _starter = null;
public ir.cyber.saralahzn.pic_view _pic_view = null;
public ir.cyber.saralahzn.video _video = null;
public ir.cyber.saralahzn.video_view _video_view = null;
public static String  _close() throws Exception{
RDebugUtils.currentModule="audionotifi";
if (Debug.shouldDelegate(processBA, "close", false))
	 {return ((String) Debug.delegate(processBA, "close", null));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub close";
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="End Sub";
return "";
}
public static String  _notify() throws Exception{
RDebugUtils.currentModule="audionotifi";
if (Debug.shouldDelegate(processBA, "notify", false))
	 {return ((String) Debug.delegate(processBA, "notify", null));}
anywheresoftware.b4a.objects.NotificationWrapper _n = null;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub notify";
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="nb.Initialize";
_nb.Initialize(processBA);
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="nb.SmallIcon = \"hhlogo\"";
_nb.setSmallIcon("hhlogo");
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="nb.Ticker = \"New Demo\"";
_nb.setTicker("New Demo");
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="nb.DefaultLight = True";
_nb.setDefaultLight(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="nb.DefaultVibrate = True";
_nb.setDefaultVibrate(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="nb.DefaultSound = True";
_nb.setDefaultSound(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="nb.ContentTitle = m.Get(\"text\")";
_nb.setContentTitle(BA.ObjectToString(_m.Get((Object)("text"))));
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="nb.DefaultSound=False";
_nb.setDefaultSound(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5505034;
 //BA.debugLineNum = 5505034;BA.debugLine="nb.ShowTime=False";
_nb.setShowTime(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5505035;
 //BA.debugLineNum = 5505035;BA.debugLine="nb.AddAction2(\"pause\",\"\",\"ct\",video_view)";
_nb.AddAction2(processBA,"pause","","ct",(Object)(mostCurrent._video_view.getObject()));
RDebugUtils.currentLine=5505036;
 //BA.debugLineNum = 5505036;BA.debugLine="nb.AddAction(\"close\", \"\",\"close\",video_view)";
_nb.AddAction(processBA,"close","","close",(Object)(mostCurrent._video_view.getObject()));
RDebugUtils.currentLine=5505037;
 //BA.debugLineNum = 5505037;BA.debugLine="nb.AutoCancel=True";
_nb.setAutoCancel(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5505038;
 //BA.debugLineNum = 5505038;BA.debugLine="Dim n As Notification= nb.GetNotification";
_n = new anywheresoftware.b4a.objects.NotificationWrapper();
_n.setObject((java.lang.Object)(_nb.GetNotification(processBA)));
RDebugUtils.currentLine=5505039;
 //BA.debugLineNum = 5505039;BA.debugLine="n.AutoCancel=False";
_n.setAutoCancel(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5505040;
 //BA.debugLineNum = 5505040;BA.debugLine="nb.Notify(1)";
_nb.Notify(processBA,(int) (1));
RDebugUtils.currentLine=5505043;
 //BA.debugLineNum = 5505043;BA.debugLine="End Sub";
return "";
}
public static String  _resume() throws Exception{
RDebugUtils.currentModule="audionotifi";
if (Debug.shouldDelegate(processBA, "resume", false))
	 {return ((String) Debug.delegate(processBA, "resume", null));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub resume";
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="audionotifi";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Log(\"CreateMa\")";
anywheresoftware.b4a.keywords.Common.LogImpl("65308417","CreateMa",0);
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="audionotifi";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="audionotifi";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Log(StartingIntent.ExtrasToString)";
anywheresoftware.b4a.keywords.Common.LogImpl("65373953",_startingintent.ExtrasToString(),0);
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="End Sub";
return "";
}
public static String  _set_stream() throws Exception{
RDebugUtils.currentModule="audionotifi";
if (Debug.shouldDelegate(processBA, "set_stream", false))
	 {return ((String) Debug.delegate(processBA, "set_stream", null));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub set_stream";
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="End Sub";
return "";
}
}