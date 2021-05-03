
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

public class video_view implements IRemote{
	public static video_view mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public video_view() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("video_view"), "ir.cyber.saralahzn.video_view");
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
		pcBA = new PCBA(this, video_view.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _timer1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _sql = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _cur1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _service_map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _aria = RemoteObject.declareNull("aria.photoshop.Photoshop");
public static RemoteObject _circle = RemoteObject.declareNull("com.maximussoft.circularimageview.CircularImageViewWrapper");
public static RemoteObject _vv = RemoteObject.declareNull("com.tillekesoft.vlcb4a.VideoViewWrapper");
public static RemoteObject _btn_down = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_share = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _f_screen = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _glide = RemoteObject.declareNull("ariagp.amin.shahedi.AriaGlideWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_time = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _seekbar1 = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACSeekBarWrapper");
public static RemoteObject _ultimatelistview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _ulvid = RemoteObject.declareNull("flm.b4a.ultimatelistview.UltimateListViewWrapper");
public static RemoteObject _iv_play = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _dwnpnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _percent = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _progressbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _lblname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnl_under_dwn = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _ivback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _pnl_circle = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _materialcircleprogress1 = RemoteObject.declareNull("de.donmanfred.MaterialCircleProgressWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static ir.cyber.saralahzn.main _main = null;
public static ir.cyber.saralahzn.newmain _newmain = null;
public static ir.cyber.saralahzn.ashar _ashar = null;
public static ir.cyber.saralahzn.sher_view _sher_view = null;
public static ir.cyber.saralahzn.infomodule _infomodule = null;
public static ir.cyber.saralahzn.news _news = null;
public static ir.cyber.saralahzn.news_view _news_view = null;
public static ir.cyber.saralahzn.audionotifi _audionotifi = null;
public static ir.cyber.saralahzn.starter _starter = null;
public static ir.cyber.saralahzn.pic_view _pic_view = null;
public static ir.cyber.saralahzn.video _video = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",video_view.mostCurrent._activity,"aria",video_view.mostCurrent._aria,"ashar",Debug.moduleToString(ir.cyber.saralahzn.ashar.class),"AudioNotifi",Debug.moduleToString(ir.cyber.saralahzn.audionotifi.class),"btn_down",video_view.mostCurrent._btn_down,"btn_share",video_view.mostCurrent._btn_share,"circle",video_view.mostCurrent._circle,"cur1",video_view._cur1,"dwnpnl",video_view.mostCurrent._dwnpnl,"f_screen",video_view.mostCurrent._f_screen,"glide",video_view.mostCurrent._glide,"HttpUtils2Service",video_view.mostCurrent._httputils2service,"infomodule",Debug.moduleToString(ir.cyber.saralahzn.infomodule.class),"iv_play",video_view.mostCurrent._iv_play,"ivback",video_view.mostCurrent._ivback,"Label2",video_view.mostCurrent._label2,"lbl_time",video_view.mostCurrent._lbl_time,"lblname",video_view.mostCurrent._lblname,"m",video_view._m,"Main",Debug.moduleToString(ir.cyber.saralahzn.main.class),"MaterialCircleProgress1",video_view.mostCurrent._materialcircleprogress1,"newMain",Debug.moduleToString(ir.cyber.saralahzn.newmain.class),"news",Debug.moduleToString(ir.cyber.saralahzn.news.class),"news_view",Debug.moduleToString(ir.cyber.saralahzn.news_view.class),"Panel1",video_view.mostCurrent._panel1,"Panel2",video_view.mostCurrent._panel2,"Panel3",video_view.mostCurrent._panel3,"percent",video_view.mostCurrent._percent,"pic_view",Debug.moduleToString(ir.cyber.saralahzn.pic_view.class),"pnl_circle",video_view.mostCurrent._pnl_circle,"pnl_under_dwn",video_view.mostCurrent._pnl_under_dwn,"progressbar",video_view.mostCurrent._progressbar,"SeekBar1",video_view.mostCurrent._seekbar1,"service_map",video_view._service_map,"sher_view",Debug.moduleToString(ir.cyber.saralahzn.sher_view.class),"sql",video_view._sql,"Starter",Debug.moduleToString(ir.cyber.saralahzn.starter.class),"Timer1",video_view._timer1,"UltimateListView1",video_view.mostCurrent._ultimatelistview1,"ulvid",video_view.mostCurrent._ulvid,"video",Debug.moduleToString(ir.cyber.saralahzn.video.class),"vv",video_view.mostCurrent._vv};
}
}