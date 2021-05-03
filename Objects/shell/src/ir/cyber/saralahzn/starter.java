
package ir.cyber.saralahzn;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class starter implements IRemote{
	public static starter mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public starter() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("starter"), "ir.cyber.saralahzn.starter");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("ir.cyber.saralahzn.starter");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, starter.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) mostCurrent.pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _modu = RemoteObject.declareNull("Object");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static ir.cyber.saralahzn.main _main = null;
public static ir.cyber.saralahzn.newmain _newmain = null;
public static ir.cyber.saralahzn.ashar _ashar = null;
public static ir.cyber.saralahzn.sher_view _sher_view = null;
public static ir.cyber.saralahzn.infomodule _infomodule = null;
public static ir.cyber.saralahzn.news _news = null;
public static ir.cyber.saralahzn.news_view _news_view = null;
public static ir.cyber.saralahzn.audionotifi _audionotifi = null;
public static ir.cyber.saralahzn.pic_view _pic_view = null;
public static ir.cyber.saralahzn.video _video = null;
public static ir.cyber.saralahzn.video_view _video_view = null;
  public Object[] GetGlobals() {
		return new Object[] {"ashar",Debug.moduleToString(ir.cyber.saralahzn.ashar.class),"AudioNotifi",Debug.moduleToString(ir.cyber.saralahzn.audionotifi.class),"HttpUtils2Service",starter.mostCurrent._httputils2service,"infomodule",Debug.moduleToString(ir.cyber.saralahzn.infomodule.class),"Main",Debug.moduleToString(ir.cyber.saralahzn.main.class),"modu",starter._modu,"newMain",Debug.moduleToString(ir.cyber.saralahzn.newmain.class),"news",Debug.moduleToString(ir.cyber.saralahzn.news.class),"news_view",Debug.moduleToString(ir.cyber.saralahzn.news_view.class),"pic_view",Debug.moduleToString(ir.cyber.saralahzn.pic_view.class),"Service",starter.mostCurrent._service,"sher_view",Debug.moduleToString(ir.cyber.saralahzn.sher_view.class),"video",Debug.moduleToString(ir.cyber.saralahzn.video.class),"video_view",Debug.moduleToString(ir.cyber.saralahzn.video_view.class)};
}
}