
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

public class infomodule implements IRemote{
	public static infomodule mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public infomodule() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("infomodule"), "ir.cyber.saralahzn.infomodule");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, infomodule.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static ir.cyber.saralahzn.main _main = null;
public static ir.cyber.saralahzn.newmain _newmain = null;
public static ir.cyber.saralahzn.ashar _ashar = null;
public static ir.cyber.saralahzn.sher_view _sher_view = null;
public static ir.cyber.saralahzn.news _news = null;
public static ir.cyber.saralahzn.news_view _news_view = null;
public static ir.cyber.saralahzn.audionotifi _audionotifi = null;
public static ir.cyber.saralahzn.starter _starter = null;
public static ir.cyber.saralahzn.pic_view _pic_view = null;
public static ir.cyber.saralahzn.video _video = null;
public static ir.cyber.saralahzn.video_view _video_view = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",infomodule.mostCurrent._activity,"ashar",Debug.moduleToString(ir.cyber.saralahzn.ashar.class),"AudioNotifi",Debug.moduleToString(ir.cyber.saralahzn.audionotifi.class),"HttpUtils2Service",infomodule.mostCurrent._httputils2service,"Main",Debug.moduleToString(ir.cyber.saralahzn.main.class),"newMain",Debug.moduleToString(ir.cyber.saralahzn.newmain.class),"news",Debug.moduleToString(ir.cyber.saralahzn.news.class),"news_view",Debug.moduleToString(ir.cyber.saralahzn.news_view.class),"pic_view",Debug.moduleToString(ir.cyber.saralahzn.pic_view.class),"sher_view",Debug.moduleToString(ir.cyber.saralahzn.sher_view.class),"Starter",Debug.moduleToString(ir.cyber.saralahzn.starter.class),"video",Debug.moduleToString(ir.cyber.saralahzn.video.class),"video_view",Debug.moduleToString(ir.cyber.saralahzn.video_view.class)};
}
}