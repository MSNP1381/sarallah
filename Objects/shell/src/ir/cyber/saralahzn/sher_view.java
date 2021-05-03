
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

public class sher_view implements IRemote{
	public static sher_view mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public sher_view() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("sher_view"), "ir.cyber.saralahzn.sher_view");
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
		pcBA = new PCBA(this, sher_view.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _map1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _s1 = RemoteObject.createImmutable("");
public static RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
public static RemoteObject _lblcount = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panel2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
public static RemoteObject _a2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
public static RemoteObject _lbl_more_down = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static ir.cyber.saralahzn.main _main = null;
public static ir.cyber.saralahzn.newmain _newmain = null;
public static ir.cyber.saralahzn.ashar _ashar = null;
public static ir.cyber.saralahzn.infomodule _infomodule = null;
public static ir.cyber.saralahzn.news _news = null;
public static ir.cyber.saralahzn.news_view _news_view = null;
public static ir.cyber.saralahzn.audionotifi _audionotifi = null;
public static ir.cyber.saralahzn.starter _starter = null;
public static ir.cyber.saralahzn.pic_view _pic_view = null;
public static ir.cyber.saralahzn.video _video = null;
public static ir.cyber.saralahzn.video_view _video_view = null;
  public Object[] GetGlobals() {
		return new Object[] {"a",sher_view.mostCurrent._a,"a2",sher_view.mostCurrent._a2,"Activity",sher_view.mostCurrent._activity,"ashar",Debug.moduleToString(ir.cyber.saralahzn.ashar.class),"AudioNotifi",Debug.moduleToString(ir.cyber.saralahzn.audionotifi.class),"HttpUtils2Service",sher_view.mostCurrent._httputils2service,"infomodule",Debug.moduleToString(ir.cyber.saralahzn.infomodule.class),"l",sher_view.mostCurrent._l,"lbl_more_down",sher_view.mostCurrent._lbl_more_down,"lblCount",sher_view.mostCurrent._lblcount,"Main",Debug.moduleToString(ir.cyber.saralahzn.main.class),"map1",sher_view._map1,"newMain",Debug.moduleToString(ir.cyber.saralahzn.newmain.class),"news",Debug.moduleToString(ir.cyber.saralahzn.news.class),"news_view",Debug.moduleToString(ir.cyber.saralahzn.news_view.class),"Panel2",sher_view.mostCurrent._panel2,"pic_view",Debug.moduleToString(ir.cyber.saralahzn.pic_view.class),"s1",sher_view.mostCurrent._s1,"ScrollView1",sher_view.mostCurrent._scrollview1,"Starter",Debug.moduleToString(ir.cyber.saralahzn.starter.class),"su",sher_view.mostCurrent._su,"video",Debug.moduleToString(ir.cyber.saralahzn.video.class),"video_view",Debug.moduleToString(ir.cyber.saralahzn.video_view.class)};
}
}