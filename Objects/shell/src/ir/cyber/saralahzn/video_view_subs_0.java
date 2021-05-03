package ir.cyber.saralahzn;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class video_view_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,62);
if (RapidSub.canDelegate("activity_create")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","activity_create", _firsttime);}
int _i = 0;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 62;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="StopService(Starter)";
Debug.ShouldStop(1073741824);
video_view.mostCurrent.__c.runVoidMethod ("StopService",video_view.processBA,(Object)((video_view.mostCurrent._starter.getObject())));
 BA.debugLineNum = 64;BA.debugLine="StartService(AudioNotifi)";
Debug.ShouldStop(-2147483648);
video_view.mostCurrent.__c.runVoidMethod ("StartService",video_view.processBA,(Object)((video_view.mostCurrent._audionotifi.getObject())));
 BA.debugLineNum = 66;BA.debugLine="Activity.LoadLayout(\"video_play1\")";
Debug.ShouldStop(2);
video_view.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("video_play1")),video_view.mostCurrent.activityBA);
 BA.debugLineNum = 67;BA.debugLine="lbl_time.Text=ConvertToTimeFormat(0)";
Debug.ShouldStop(4);
video_view.mostCurrent._lbl_time.runMethod(true,"setText",BA.ObjectToCharSequence(_converttotimeformat(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 68;BA.debugLine="MaterialCircleProgress1.Colors=Array As Int(0xFF4";
Debug.ShouldStop(8);
video_view.mostCurrent._materialcircleprogress1.runMethod(false,"setColors",RemoteObject.createNewArray("int",new int[] {5},new Object[] {BA.numberCast(int.class, 0xff43a047),BA.numberCast(int.class, 0xfff44336),BA.numberCast(int.class, 0xff1dacd6),BA.numberCast(int.class, 0xff00ccb4),BA.numberCast(int.class, 0xff2f2f2f)}));
 BA.debugLineNum = 69;BA.debugLine="MaterialCircleProgress1.ShowArrow=False";
Debug.ShouldStop(16);
video_view.mostCurrent._materialcircleprogress1.runMethod(true,"setShowArrow",video_view.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 70;BA.debugLine="sql.Initialize(File.DirInternal,\"saralah.db\",Fals";
Debug.ShouldStop(32);
video_view._sql.runVoidMethod ("Initialize",(Object)(video_view.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("saralah.db")),(Object)(video_view.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 71;BA.debugLine="Timer1.Initialize(\"Timer1\", 400)";
Debug.ShouldStop(64);
video_view._timer1.runVoidMethod ("Initialize",video_view.processBA,(Object)(BA.ObjectToString("Timer1")),(Object)(BA.numberCast(long.class, 400)));
 BA.debugLineNum = 72;BA.debugLine="Log(m.Get(\"url\"))";
Debug.ShouldStop(128);
video_view.mostCurrent.__c.runVoidMethod ("LogImpl","67602186",BA.ObjectToString(video_view._m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("url"))))),0);
 BA.debugLineNum = 73;BA.debugLine="video_play";
Debug.ShouldStop(256);
_video_play();
 BA.debugLineNum = 74;BA.debugLine="cur1=sql.ExecQuery(\"SELECT * FROM madahi\")";
Debug.ShouldStop(512);
video_view._cur1.setObject(video_view._sql.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM madahi"))));
 BA.debugLineNum = 75;BA.debugLine="ulvid.Initialize(0,0,0,\"ulvid\")";
Debug.ShouldStop(1024);
video_view.mostCurrent._ulvid.runVoidMethod ("Initialize",video_view.mostCurrent.activityBA,(Object)(BA.numberCast(byte.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.NumberToString(0)),(Object)(RemoteObject.createImmutable("ulvid")));
 BA.debugLineNum = 76;BA.debugLine="UltimateListView1.AddView(ulvid,0,0,-1,-1)";
Debug.ShouldStop(2048);
video_view.mostCurrent._ultimatelistview1.runVoidMethod ("AddView",(Object)((video_view.mostCurrent._ulvid.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 BA.debugLineNum = 77;BA.debugLine="ulvid.AddLayout(\"layout1\",\"ulvid_LayoutCreator\",\"";
Debug.ShouldStop(4096);
video_view.mostCurrent._ulvid.runVoidMethod ("AddLayout",(Object)(BA.ObjectToString("layout1")),(Object)(BA.ObjectToString("ulvid_LayoutCreator")),(Object)(BA.ObjectToString("ulvid_ContentFiller")),(Object)(video_view.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110)))),(Object)(video_view.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 78;BA.debugLine="For i = 0 To cur1.RowCount-1";
Debug.ShouldStop(8192);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {video_view._cur1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 79;BA.debugLine="ulvid.AddItem(\"layout1\", i)";
Debug.ShouldStop(16384);
video_view.mostCurrent._ulvid.runVoidMethod ("AddItem",(Object)(BA.ObjectToString("layout1")),(Object)(BA.numberCast(long.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 81;BA.debugLine="lblname.Text=m.Get(\"comment\")";
Debug.ShouldStop(65536);
video_view.mostCurrent._lblname.runMethod(true,"setText",BA.ObjectToCharSequence(video_view._m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("comment"))))));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,240);
if (RapidSub.canDelegate("activity_keypress")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 240;BA.debugLine="Sub  Activity_KeyPress (KeyCode As Int) As Boolea";
Debug.ShouldStop(32768);
 BA.debugLineNum = 241;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, video_view.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 242;BA.debugLine="lbl_exit_Click";
Debug.ShouldStop(131072);
_lbl_exit_click();
 }else 
{ BA.debugLineNum = 243;BA.debugLine="Else If KeyCode==KeyCodes.KEYCODE_VOLUME_DOWN T";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, video_view.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_VOLUME_DOWN")))) { 
 }else 
{ BA.debugLineNum = 245;BA.debugLine="Else If KeyCodes.KEYCODE_VOLUME_UP==KeyCode Th";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",video_view.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_VOLUME_UP"),BA.numberCast(double.class, _keycode))) { 
 }}}
;
 BA.debugLineNum = 247;BA.debugLine="Return True";
Debug.ShouldStop(4194304);
if (true) return video_view.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,150);
if (RapidSub.canDelegate("activity_pause")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 150;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Resume (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,99);
if (RapidSub.canDelegate("activity_resume")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","activity_resume");}
 BA.debugLineNum = 99;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Log(Activity.getStartingIntent.ExtrasToString)";
Debug.ShouldStop(8);
video_view.mostCurrent.__c.runVoidMethod ("LogImpl","67798785",video_view.mostCurrent._activity.runMethod(false,"GetStartingIntent").runMethod(true,"ExtrasToString"),0);
 BA.debugLineNum = 101;BA.debugLine="If Activity.GetStartingIntent.ExtrasToString.EndsW";
Debug.ShouldStop(16);
if (video_view.mostCurrent._activity.runMethod(false,"GetStartingIntent").runMethod(true,"ExtrasToString").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("close}]"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 102;BA.debugLine="lbl_exit_Click";
Debug.ShouldStop(32);
_lbl_exit_click();
 }else 
{ BA.debugLineNum = 104;BA.debugLine="Else If Activity.GetStartingIntent.ExtrasToString";
Debug.ShouldStop(128);
if (video_view.mostCurrent._activity.runMethod(false,"GetStartingIntent").runMethod(true,"ExtrasToString").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("ctrl}]"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 105;BA.debugLine="iv_play_Click";
Debug.ShouldStop(256);
_iv_play_click();
 }}
;
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _aria_blurend(RemoteObject _bluredimage) throws Exception{
try {
		Debug.PushSubsStack("aria_BlurEnd (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,118);
if (RapidSub.canDelegate("aria_blurend")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","aria_blurend", _bluredimage);}
Debug.locals.put("BluredImage", _bluredimage);
 BA.debugLineNum = 118;BA.debugLine="Sub  aria_BlurEnd (BluredImage As Bitmap)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="ivback.Bitmap=BluredImage";
Debug.ShouldStop(4194304);
video_view.mostCurrent._ivback.runMethod(false,"setBitmap",(_bluredimage.getObject()));
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_down_click() throws Exception{
try {
		Debug.PushSubsStack("btn_down_Click (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,188);
if (RapidSub.canDelegate("btn_down_click")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","btn_down_click");}
 BA.debugLineNum = 188;BA.debugLine="Sub btn_down_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 189;BA.debugLine="dwnpnl.LoadLayout(\"download_panel\")";
Debug.ShouldStop(268435456);
video_view.mostCurrent._dwnpnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("download_panel")),video_view.mostCurrent.activityBA);
 BA.debugLineNum = 190;BA.debugLine="Label2.Enabled=False";
Debug.ShouldStop(536870912);
video_view.mostCurrent._label2.runMethod(true,"setEnabled",video_view.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 191;BA.debugLine="btn_down.Enabled=False";
Debug.ShouldStop(1073741824);
video_view.mostCurrent._btn_down.runMethod(true,"setEnabled",video_view.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_share_click() throws Exception{
try {
		Debug.PushSubsStack("btn_share_Click (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,184);
if (RapidSub.canDelegate("btn_share_click")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","btn_share_click");}
 BA.debugLineNum = 184;BA.debugLine="Sub btn_share_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _converttotimeformat(RemoteObject _ms) throws Exception{
try {
		Debug.PushSubsStack("ConvertToTimeFormat (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,288);
if (RapidSub.canDelegate("converttotimeformat")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","converttotimeformat", _ms);}
RemoteObject _seconds = RemoteObject.createImmutable(0);
RemoteObject _minutes = RemoteObject.createImmutable(0);
Debug.locals.put("ms", _ms);
 BA.debugLineNum = 288;BA.debugLine="Sub ConvertToTimeFormat(ms As Int) As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 289;BA.debugLine="Dim seconds, minutes As Int";
Debug.ShouldStop(1);
_seconds = RemoteObject.createImmutable(0);Debug.locals.put("seconds", _seconds);
_minutes = RemoteObject.createImmutable(0);Debug.locals.put("minutes", _minutes);
 BA.debugLineNum = 290;BA.debugLine="seconds = Round(ms / 1000)";
Debug.ShouldStop(2);
_seconds = BA.numberCast(int.class, video_view.mostCurrent.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_ms,RemoteObject.createImmutable(1000)}, "/",0, 0))));Debug.locals.put("seconds", _seconds);
 BA.debugLineNum = 291;BA.debugLine="minutes = Floor(seconds / 60)";
Debug.ShouldStop(4);
_minutes = BA.numberCast(int.class, video_view.mostCurrent.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {_seconds,RemoteObject.createImmutable(60)}, "/",0, 0))));Debug.locals.put("minutes", _minutes);
 BA.debugLineNum = 292;BA.debugLine="seconds = seconds Mod 60";
Debug.ShouldStop(8);
_seconds = RemoteObject.solve(new RemoteObject[] {_seconds,RemoteObject.createImmutable(60)}, "%",0, 1);Debug.locals.put("seconds", _seconds);
 BA.debugLineNum = 293;BA.debugLine="Return NumberFormat(minutes, 1, 0) & \":\" & Number";
Debug.ShouldStop(16);
if (true) return RemoteObject.concat(video_view.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _minutes)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(":"),video_view.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _seconds)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 294;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _f_screen_click() throws Exception{
try {
		Debug.PushSubsStack("f_screen_Click (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,194);
if (RapidSub.canDelegate("f_screen_click")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","f_screen_click");}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 194;BA.debugLine="Sub f_screen_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="Dim str As String=m.Get(\"url\")";
Debug.ShouldStop(4);
_str = BA.ObjectToString(video_view._m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("url")))));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 196;BA.debugLine="If 	str.EndsWith(\"mp3\")=False Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_str.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("mp3"))),video_view.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 197;BA.debugLine="If Panel2.Visible Then";
Debug.ShouldStop(16);
if (video_view.mostCurrent._panel2.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 198;BA.debugLine="Panel2.Visible=False";
Debug.ShouldStop(32);
video_view.mostCurrent._panel2.runMethod(true,"setVisible",video_view.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 199;BA.debugLine="UltimateListView1.Visible=False";
Debug.ShouldStop(64);
video_view.mostCurrent._ultimatelistview1.runMethod(true,"setVisible",video_view.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 200;BA.debugLine="Panel1.Width=100%x";
Debug.ShouldStop(128);
video_view.mostCurrent._panel1.runMethod(true,"setWidth",video_view.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),video_view.mostCurrent.activityBA));
 BA.debugLineNum = 201;BA.debugLine="Panel1.Left=0";
Debug.ShouldStop(256);
video_view.mostCurrent._panel1.runMethod(true,"setLeft",BA.numberCast(int.class, 0));
 BA.debugLineNum = 202;BA.debugLine="dwnpnl.Width=100%x";
Debug.ShouldStop(512);
video_view.mostCurrent._dwnpnl.runMethod(true,"setWidth",video_view.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),video_view.mostCurrent.activityBA));
 BA.debugLineNum = 203;BA.debugLine="dwnpnl.Left=0";
Debug.ShouldStop(1024);
video_view.mostCurrent._dwnpnl.runMethod(true,"setLeft",BA.numberCast(int.class, 0));
 BA.debugLineNum = 205;BA.debugLine="Panel3.Width=100%x";
Debug.ShouldStop(4096);
video_view.mostCurrent._panel3.runMethod(true,"setWidth",video_view.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),video_view.mostCurrent.activityBA));
 BA.debugLineNum = 206;BA.debugLine="Panel3.Left=0";
Debug.ShouldStop(8192);
video_view.mostCurrent._panel3.runMethod(true,"setLeft",BA.numberCast(int.class, 0));
 BA.debugLineNum = 207;BA.debugLine="vv.Invalidate";
Debug.ShouldStop(16384);
video_view.mostCurrent._vv.runVoidMethod ("Invalidate");
 BA.debugLineNum = 208;BA.debugLine="f_screen.Text=Chr(0xE5D1)";
Debug.ShouldStop(32768);
video_view.mostCurrent._f_screen.runMethod(true,"setText",BA.ObjectToCharSequence(video_view.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe5d1)))));
 }else {
 BA.debugLineNum = 211;BA.debugLine="Panel2.Visible=True";
Debug.ShouldStop(262144);
video_view.mostCurrent._panel2.runMethod(true,"setVisible",video_view.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 212;BA.debugLine="UltimateListView1.Visible=True";
Debug.ShouldStop(524288);
video_view.mostCurrent._ultimatelistview1.runMethod(true,"setVisible",video_view.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 214;BA.debugLine="Panel1.Width=80%x";
Debug.ShouldStop(2097152);
video_view.mostCurrent._panel1.runMethod(true,"setWidth",video_view.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),video_view.mostCurrent.activityBA));
 BA.debugLineNum = 215;BA.debugLine="Panel1.Left=0";
Debug.ShouldStop(4194304);
video_view.mostCurrent._panel1.runMethod(true,"setLeft",BA.numberCast(int.class, 0));
 BA.debugLineNum = 217;BA.debugLine="dwnpnl.Width=80%x";
Debug.ShouldStop(16777216);
video_view.mostCurrent._dwnpnl.runMethod(true,"setWidth",video_view.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),video_view.mostCurrent.activityBA));
 BA.debugLineNum = 218;BA.debugLine="dwnpnl.Left=0";
Debug.ShouldStop(33554432);
video_view.mostCurrent._dwnpnl.runMethod(true,"setLeft",BA.numberCast(int.class, 0));
 BA.debugLineNum = 220;BA.debugLine="Panel3.Width=80%x";
Debug.ShouldStop(134217728);
video_view.mostCurrent._panel3.runMethod(true,"setWidth",video_view.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),video_view.mostCurrent.activityBA));
 BA.debugLineNum = 221;BA.debugLine="Panel3.Left=0";
Debug.ShouldStop(268435456);
video_view.mostCurrent._panel3.runMethod(true,"setLeft",BA.numberCast(int.class, 0));
 BA.debugLineNum = 222;BA.debugLine="vv.Invalidate";
Debug.ShouldStop(536870912);
video_view.mostCurrent._vv.runVoidMethod ("Invalidate");
 BA.debugLineNum = 223;BA.debugLine="f_screen.Text=Chr(0xE5D0)";
Debug.ShouldStop(1073741824);
video_view.mostCurrent._f_screen.runMethod(true,"setText",BA.ObjectToCharSequence(video_view.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe5d0)))));
 };
 }else {
 BA.debugLineNum = 227;BA.debugLine="service_map=CreateMap(\"text\":m.Get(\"comment\"),\"o";
Debug.ShouldStop(4);
video_view._service_map = video_view.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("text")),video_view._m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("comment")))),RemoteObject.createImmutable(("offline")),(video_view.mostCurrent.__c.getField(true,"False")),RemoteObject.createImmutable(("path")),video_view._m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("url"))))}));
 BA.debugLineNum = 228;BA.debugLine="AudioNotifi.m=service_map";
Debug.ShouldStop(8);
video_view.mostCurrent._audionotifi._m /*RemoteObject*/  = video_view._service_map;
 BA.debugLineNum = 229;BA.debugLine="CallSub(AudioNotifi,\"notify\")";
Debug.ShouldStop(16);
video_view.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",video_view.processBA,(Object)((video_view.mostCurrent._audionotifi.getObject())),(Object)(RemoteObject.createImmutable("notify")));
 };
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _glide_onbitmapready(RemoteObject _bitmap,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("glide_OnBitmapReady (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,108);
if (RapidSub.canDelegate("glide_onbitmapready")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","glide_onbitmapready", _bitmap, _tag);}
RemoteObject _draw = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
Debug.locals.put("bitmap", _bitmap);
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 108;BA.debugLine="Sub  glide_OnBitmapReady(bitmap As Bitmap,Tag As O";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="aria.Initialize(\"aria\")";
Debug.ShouldStop(4096);
video_view.mostCurrent._aria.runVoidMethod ("Initialize",video_view.processBA,(Object)(RemoteObject.createImmutable("aria")));
 BA.debugLineNum = 110;BA.debugLine="aria.Blur(bitmap,5)";
Debug.ShouldStop(8192);
video_view.mostCurrent._aria.runVoidMethod ("Blur",video_view.processBA,(Object)((_bitmap.getObject())),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 111;BA.debugLine="circle.Initialize(\"circle\")";
Debug.ShouldStop(16384);
video_view.mostCurrent._circle.runVoidMethod ("Initialize",video_view.processBA,(Object)(RemoteObject.createImmutable("circle")));
 BA.debugLineNum = 112;BA.debugLine="Dim draw As BitmapDrawable";
Debug.ShouldStop(32768);
_draw = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("draw", _draw);
 BA.debugLineNum = 113;BA.debugLine="draw.Initialize(bitmap)";
Debug.ShouldStop(65536);
_draw.runVoidMethod ("Initialize",(Object)((_bitmap.getObject())));
 BA.debugLineNum = 114;BA.debugLine="circle.SetDrawable(draw)";
Debug.ShouldStop(131072);
video_view.mostCurrent._circle.runVoidMethod ("SetDrawable",(Object)(_draw));
 BA.debugLineNum = 115;BA.debugLine="circle.AddDefaultShadow";
Debug.ShouldStop(262144);
video_view.mostCurrent._circle.runVoidMethod ("AddDefaultShadow");
 BA.debugLineNum = 116;BA.debugLine="pnl_circle.AddView(circle,0,0,-1,-1)";
Debug.ShouldStop(524288);
video_view.mostCurrent._pnl_circle.runVoidMethod ("AddView",(Object)((video_view.mostCurrent._circle.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 26;BA.debugLine="Dim aria As AriaPhotoshp";
video_view.mostCurrent._aria = RemoteObject.createNew ("aria.photoshop.Photoshop");
 //BA.debugLineNum = 27;BA.debugLine="Dim circle As CircularImageView";
video_view.mostCurrent._circle = RemoteObject.createNew ("com.maximussoft.circularimageview.CircularImageViewWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Dim vv As VLCVideoView";
video_view.mostCurrent._vv = RemoteObject.createNew ("com.tillekesoft.vlcb4a.VideoViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private btn_down As Button";
video_view.mostCurrent._btn_down = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private btn_share As Button";
video_view.mostCurrent._btn_share = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private f_screen As Label";
video_view.mostCurrent._f_screen = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Dim glide As AriaGlide";
video_view.mostCurrent._glide = RemoteObject.createNew ("ariagp.amin.shahedi.AriaGlideWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private Label2 As Label";
video_view.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private lbl_time As Label";
video_view.mostCurrent._lbl_time = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private Panel1 As Panel";
video_view.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private Panel2 As Panel";
video_view.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private Panel3 As Panel";
video_view.mostCurrent._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private SeekBar1 As ACSeekBar";
video_view.mostCurrent._seekbar1 = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSeekBarWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private UltimateListView1 As Panel";
video_view.mostCurrent._ultimatelistview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Dim ulvid As UltimateListView";
video_view.mostCurrent._ulvid = RemoteObject.createNew ("flm.b4a.ultimatelistview.UltimateListViewWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private iv_play As ImageView";
video_view.mostCurrent._iv_play = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private dwnpnl As Panel";
video_view.mostCurrent._dwnpnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private percent As Label";
video_view.mostCurrent._percent = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private progressbar As ProgressBar";
video_view.mostCurrent._progressbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private lblname As Label";
video_view.mostCurrent._lblname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private pnl_under_dwn As Panel";
video_view.mostCurrent._pnl_under_dwn = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private ivback As ImageView";
video_view.mostCurrent._ivback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private pnl_circle As Panel";
video_view.mostCurrent._pnl_circle = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private MaterialCircleProgress1 As MaterialCircle";
video_view.mostCurrent._materialcircleprogress1 = RemoteObject.createNew ("de.donmanfred.MaterialCircleProgressWrapper");
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _iv_play_click() throws Exception{
try {
		Debug.PushSubsStack("iv_play_Click (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,257);
if (RapidSub.canDelegate("iv_play_click")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","iv_play_click");}
 BA.debugLineNum = 257;BA.debugLine="Sub iv_play_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 258;BA.debugLine="Log(vv.IsPlaying)";
Debug.ShouldStop(2);
video_view.mostCurrent.__c.runVoidMethod ("LogImpl","68781825",BA.ObjectToString(video_view.mostCurrent._vv.runMethod(true,"IsPlaying")),0);
 BA.debugLineNum = 259;BA.debugLine="If	vv.IsPlaying Then";
Debug.ShouldStop(4);
if (video_view.mostCurrent._vv.runMethod(true,"IsPlaying").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 261;BA.debugLine="vv.Pause";
Debug.ShouldStop(16);
video_view.mostCurrent._vv.runVoidMethod ("Pause");
 BA.debugLineNum = 262;BA.debugLine="iv_play.Bitmap=LoadBitmap(File.DirAssets,\"paly_i";
Debug.ShouldStop(32);
video_view.mostCurrent._iv_play.runMethod(false,"setBitmap",(video_view.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(video_view.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("paly_ico.png"))).getObject()));
 }else {
 BA.debugLineNum = 266;BA.debugLine="vv.Start";
Debug.ShouldStop(512);
video_view.mostCurrent._vv.runVoidMethod ("Start");
 BA.debugLineNum = 267;BA.debugLine="iv_play.Bitmap=LoadBitmap(File.DirAssets,\"pause_";
Debug.ShouldStop(1024);
video_view.mostCurrent._iv_play.runMethod(false,"setBitmap",(video_view.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(video_view.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("pause_ico.png"))).getObject()));
 };
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_exit_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_exit_Click (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,250);
if (RapidSub.canDelegate("lbl_exit_click")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","lbl_exit_click");}
 BA.debugLineNum = 250;BA.debugLine="Sub lbl_exit_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="vv.StopPlayback";
Debug.ShouldStop(67108864);
video_view.mostCurrent._vv.runVoidMethod ("StopPlayback");
 BA.debugLineNum = 252;BA.debugLine="vv.RemoveView";
Debug.ShouldStop(134217728);
video_view.mostCurrent._vv.runVoidMethod ("RemoveView");
 BA.debugLineNum = 253;BA.debugLine="vv.Pause";
Debug.ShouldStop(268435456);
video_view.mostCurrent._vv.runVoidMethod ("Pause");
 BA.debugLineNum = 254;BA.debugLine="Activity.Finish";
Debug.ShouldStop(536870912);
video_view.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lbl_time_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_time_Click (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,273);
if (RapidSub.canDelegate("lbl_time_click")) { ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","lbl_time_click"); return;}
ResumableSub_lbl_time_Click rsub = new ResumableSub_lbl_time_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lbl_time_Click extends BA.ResumableSub {
public ResumableSub_lbl_time_Click(ir.cyber.saralahzn.video_view parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.cyber.saralahzn.video_view parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lbl_time_Click (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,273);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 274;BA.debugLine="lbl_time.Text=ConvertToTimeFormat(vv.Duration)";
Debug.ShouldStop(131072);
parent.mostCurrent._lbl_time.runMethod(true,"setText",BA.ObjectToCharSequence(_converttotimeformat(BA.numberCast(int.class, parent.mostCurrent._vv.runMethod(true,"getDuration")))));
 BA.debugLineNum = 275;BA.debugLine="Sleep(4000)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("Sleep",video_view.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "video_view", "lbl_time_click"),BA.numberCast(int.class, 4000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _lblcancel_click() throws Exception{
try {
		Debug.PushSubsStack("lblcancel_Click (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,279);
if (RapidSub.canDelegate("lblcancel_click")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","lblcancel_click");}
 BA.debugLineNum = 279;BA.debugLine="Sub lblcancel_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 281;BA.debugLine="pnl_under_dwn.RemoveView";
Debug.ShouldStop(16777216);
video_view.mostCurrent._pnl_under_dwn.runVoidMethod ("RemoveView");
 BA.debugLineNum = 282;BA.debugLine="Label2.Enabled=True";
Debug.ShouldStop(33554432);
video_view.mostCurrent._label2.runMethod(true,"setEnabled",video_view.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 283;BA.debugLine="btn_down.Enabled=True";
Debug.ShouldStop(67108864);
video_view.mostCurrent._btn_down.runMethod(true,"setEnabled",video_view.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
video_view._m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 11;BA.debugLine="Dim Timer1 As Timer";
video_view._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 12;BA.debugLine="Dim sql As SQL";
video_view._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 13;BA.debugLine="Dim cur1 As Cursor";
video_view._cur1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Dim service_map As Map";
video_view._service_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _seekbar1_valuechanged(RemoteObject _value,RemoteObject _userchanged) throws Exception{
try {
		Debug.PushSubsStack("SeekBar1_ValueChanged (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,233);
if (RapidSub.canDelegate("seekbar1_valuechanged")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","seekbar1_valuechanged", _value, _userchanged);}
Debug.locals.put("Value", _value);
Debug.locals.put("UserChanged", _userchanged);
 BA.debugLineNum = 233;BA.debugLine="Sub SeekBar1_ValueChanged (Value As Int, UserChang";
Debug.ShouldStop(256);
 BA.debugLineNum = 234;BA.debugLine="If UserChanged Then";
Debug.ShouldStop(512);
if (_userchanged.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 235;BA.debugLine="vv.SeekTo(Value)";
Debug.ShouldStop(1024);
video_view.mostCurrent._vv.runVoidMethod ("SeekTo",(Object)(_value));
 };
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sound_play() throws Exception{
try {
		Debug.PushSubsStack("sound_play (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,144);
if (RapidSub.canDelegate("sound_play")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","sound_play");}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 144;BA.debugLine="Sub sound_play";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="Dim str As String=m.Get(\"url\")";
Debug.ShouldStop(65536);
_str = BA.ObjectToString(video_view._m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("url")))));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer1_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,57);
if (RapidSub.canDelegate("timer1_tick")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","timer1_tick");}
 BA.debugLineNum = 57;BA.debugLine="Sub Timer1_Tick";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="lbl_time.Text=ConvertToTimeFormat(vv.CurrentPositi";
Debug.ShouldStop(33554432);
video_view.mostCurrent._lbl_time.runMethod(true,"setText",BA.ObjectToCharSequence(_converttotimeformat(BA.numberCast(int.class, video_view.mostCurrent._vv.runMethod(true,"getCurrentPosition")))));
 BA.debugLineNum = 59;BA.debugLine="SeekBar1.Value=vv.CurrentPosition";
Debug.ShouldStop(67108864);
video_view.mostCurrent._seekbar1.runMethod(true,"setValue",BA.numberCast(int.class, video_view.mostCurrent._vv.runMethod(true,"getCurrentPosition")));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ulvid_contentfiller(RemoteObject _itemid,RemoteObject _layoutname,RemoteObject _layoutpanel,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ulvid_ContentFiller (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,87);
if (RapidSub.canDelegate("ulvid_contentfiller")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","ulvid_contentfiller", _itemid, _layoutname, _layoutpanel, _position);}
RemoteObject _lbl_name = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _img_title = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("ItemID", _itemid);
Debug.locals.put("LayoutName", _layoutname);
Debug.locals.put("LayoutPanel", _layoutpanel);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 87;BA.debugLine="Sub ulvid_ContentFiller(ItemID As Long, LayoutName";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="Log(ItemID)";
Debug.ShouldStop(8388608);
video_view.mostCurrent.__c.runVoidMethod ("LogImpl","67733249",BA.NumberToString(_itemid),0);
 BA.debugLineNum = 89;BA.debugLine="cur1.Position=ItemID";
Debug.ShouldStop(16777216);
video_view._cur1.runMethod(true,"setPosition",BA.numberCast(int.class, _itemid));
 BA.debugLineNum = 90;BA.debugLine="Dim lbl_name As Label=LayoutPanel.GetView(1)";
Debug.ShouldStop(33554432);
_lbl_name = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_name.setObject(_layoutpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("lbl_name", _lbl_name);
 BA.debugLineNum = 91;BA.debugLine="Dim img_title As ImageView=LayoutPanel.GetView(0)";
Debug.ShouldStop(67108864);
_img_title = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_img_title.setObject(_layoutpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("img_title", _img_title);
 BA.debugLineNum = 92;BA.debugLine="lbl_name.Text=cur1.GetString(\"name\")";
Debug.ShouldStop(134217728);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence(video_view._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")))));
 BA.debugLineNum = 93;BA.debugLine="glide.Load(newMain.ip&cur1.GetString(\"pic_url\")).";
Debug.ShouldStop(268435456);
video_view.mostCurrent._glide.runMethod(false,"Load",(Object)((RemoteObject.concat(video_view.mostCurrent._newmain._ip /*RemoteObject*/ ,video_view._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("pic_url"))))))).runMethod(false,"AsBitmap").runMethod(false,"Placeholder",(Object)((video_view.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(video_view.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("placeholder.jpg"))).getObject()))).runVoidMethod ("IntoImageView",(Object)(_img_title));
 BA.debugLineNum = 94;BA.debugLine="If ItemID=0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_itemid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 95;BA.debugLine="ulvid.Color=0xFFFFFFFF";
Debug.ShouldStop(1073741824);
video_view.mostCurrent._ulvid.runVoidMethod ("setColor",BA.numberCast(int.class, 0xffffffff));
 };
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ulvid_layoutcreator(RemoteObject _layoutname,RemoteObject _layoutpanel) throws Exception{
try {
		Debug.PushSubsStack("ulvid_LayoutCreator (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,84);
if (RapidSub.canDelegate("ulvid_layoutcreator")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","ulvid_layoutcreator", _layoutname, _layoutpanel);}
Debug.locals.put("LayoutName", _layoutname);
Debug.locals.put("LayoutPanel", _layoutpanel);
 BA.debugLineNum = 84;BA.debugLine="Sub ulvid_LayoutCreator(LayoutName As String, Layo";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="LayoutPanel.LoadLayout(\"vid_v_ulv\")";
Debug.ShouldStop(1048576);
_layoutpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("vid_v_ulv")),video_view.mostCurrent.activityBA);
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _video_play() throws Exception{
try {
		Debug.PushSubsStack("video_play (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,121);
if (RapidSub.canDelegate("video_play")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","video_play");}
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 121;BA.debugLine="Sub video_play";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="vv.Initialize(\"vv\")";
Debug.ShouldStop(33554432);
video_view.mostCurrent._vv.runVoidMethod ("Initialize",video_view.processBA,(Object)(RemoteObject.createImmutable("vv")));
 BA.debugLineNum = 124;BA.debugLine="Panel1.AddView(vv, 0, 0dip, 100%x, 100%y)";
Debug.ShouldStop(134217728);
video_view.mostCurrent._panel1.runVoidMethod ("AddView",(Object)((video_view.mostCurrent._vv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(video_view.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(video_view.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),video_view.mostCurrent.activityBA)),(Object)(video_view.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),video_view.mostCurrent.activityBA)));
 BA.debugLineNum = 126;BA.debugLine="Dim str As String=m.Get(\"url\")";
Debug.ShouldStop(536870912);
_str = BA.ObjectToString(video_view._m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("url")))));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 127;BA.debugLine="Log(str)";
Debug.ShouldStop(1073741824);
video_view.mostCurrent.__c.runVoidMethod ("LogImpl","67995398",_str,0);
 BA.debugLineNum = 128;BA.debugLine="If 	str.EndsWith(\"mp3\") Then";
Debug.ShouldStop(-2147483648);
if (_str.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("mp3"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 129;BA.debugLine="Panel1.LoadLayout(\"blur_lay\")";
Debug.ShouldStop(1);
video_view.mostCurrent._panel1.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("blur_lay")),video_view.mostCurrent.activityBA);
 BA.debugLineNum = 130;BA.debugLine="glide_OnBitmapReady(LoadBitmap(File.DirAssets,\"1";
Debug.ShouldStop(2);
_glide_onbitmapready(video_view.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(video_view.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("1 (12).jpg"))),RemoteObject.createImmutable((0)));
 BA.debugLineNum = 131;BA.debugLine="f_screen.Text=Chr(0xE5D8)";
Debug.ShouldStop(4);
video_view.mostCurrent._f_screen.runMethod(true,"setText",BA.ObjectToCharSequence(video_view.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe5d8)))));
 BA.debugLineNum = 132;BA.debugLine="sound_play";
Debug.ShouldStop(8);
_sound_play();
 }else {
 };
 BA.debugLineNum = 140;BA.debugLine="vv.VideoURI=(newMain.ip&str)";
Debug.ShouldStop(2048);
video_view.mostCurrent._vv.runVoidMethod ("setVideoURI",(RemoteObject.concat(video_view.mostCurrent._newmain._ip /*RemoteObject*/ ,_str)));
 BA.debugLineNum = 141;BA.debugLine="vv.Start";
Debug.ShouldStop(4096);
video_view.mostCurrent._vv.runVoidMethod ("Start");
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _vv_oncompleted() throws Exception{
try {
		Debug.PushSubsStack("vv_onCompleted (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,170);
if (RapidSub.canDelegate("vv_oncompleted")) { ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","vv_oncompleted"); return;}
ResumableSub_vv_onCompleted rsub = new ResumableSub_vv_onCompleted(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_vv_onCompleted extends BA.ResumableSub {
public ResumableSub_vv_onCompleted(ir.cyber.saralahzn.video_view parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.cyber.saralahzn.video_view parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("vv_onCompleted (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,170);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 172;BA.debugLine="Log(\"Playing completed\"):Sleep(3000)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","68257538",RemoteObject.createImmutable("Playing completed"),0);
 BA.debugLineNum = 172;BA.debugLine="Log(\"Playing completed\"):Sleep(3000)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("Sleep",video_view.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "video_view", "vv_oncompleted"),BA.numberCast(int.class, 3000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 173;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _vv_onerror() throws Exception{
try {
		Debug.PushSubsStack("vv_onError (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,175);
if (RapidSub.canDelegate("vv_onerror")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","vv_onerror");}
 BA.debugLineNum = 175;BA.debugLine="Sub  vv_onError";
Debug.ShouldStop(16384);
 BA.debugLineNum = 180;BA.debugLine="Log(\"erorr\")";
Debug.ShouldStop(524288);
video_view.mostCurrent.__c.runVoidMethod ("LogImpl","68323077",RemoteObject.createImmutable("erorr"),0);
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _vv_onprepared() throws Exception{
try {
		Debug.PushSubsStack("vv_onPrepared (video_view) ","video_view",11,video_view.mostCurrent.activityBA,video_view.mostCurrent,154);
if (RapidSub.canDelegate("vv_onprepared")) { return ir.cyber.saralahzn.video_view.remoteMe.runUserSub(false, "video_view","vv_onprepared");}
 BA.debugLineNum = 154;BA.debugLine="Sub vv_onPrepared";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 156;BA.debugLine="SeekBar1.Max=vv.Duration";
Debug.ShouldStop(134217728);
video_view.mostCurrent._seekbar1.runMethod(true,"setMax",BA.numberCast(int.class, video_view.mostCurrent._vv.runMethod(true,"getDuration")));
 BA.debugLineNum = 157;BA.debugLine="Log(\"vv_prepared\")";
Debug.ShouldStop(268435456);
video_view.mostCurrent.__c.runVoidMethod ("LogImpl","68192003",RemoteObject.createImmutable("vv_prepared"),0);
 BA.debugLineNum = 158;BA.debugLine="MaterialCircleProgress1.Visible=False";
Debug.ShouldStop(536870912);
video_view.mostCurrent._materialcircleprogress1.runMethod(true,"setVisible",video_view.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 167;BA.debugLine="Timer1.Enabled = True";
Debug.ShouldStop(64);
video_view._timer1.runMethod(true,"setEnabled",video_view.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}