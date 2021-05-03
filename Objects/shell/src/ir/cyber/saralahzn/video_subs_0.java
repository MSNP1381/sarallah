package ir.cyber.saralahzn;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class video_subs_0 {


public static RemoteObject  _acspinnerday_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ACSpinnerday_ItemClick (video) ","video",10,video.mostCurrent.activityBA,video.mostCurrent,151);
if (RapidSub.canDelegate("acspinnerday_itemclick")) { return ir.cyber.saralahzn.video.remoteMe.runUserSub(false, "video","acspinnerday_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 151;BA.debugLine="Sub ACSpinnerday_ItemClick (Position As Int, Value";
Debug.ShouldStop(4194304);
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
public static RemoteObject  _acspinnerstyle_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ACSpinnerstyle_ItemClick (video) ","video",10,video.mostCurrent.activityBA,video.mostCurrent,147);
if (RapidSub.canDelegate("acspinnerstyle_itemclick")) { return ir.cyber.saralahzn.video.remoteMe.runUserSub(false, "video","acspinnerstyle_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 147;BA.debugLine="Sub ACSpinnerstyle_ItemClick (Position As Int, Val";
Debug.ShouldStop(262144);
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
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (video) ","video",10,video.mostCurrent.activityBA,video.mostCurrent,27);
if (RapidSub.canDelegate("activity_create")) { return ir.cyber.saralahzn.video.remoteMe.runUserSub(false, "video","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 32;BA.debugLine="CallSub3(Starter,\"dwnl\",newMain.ip&\"saralah/mada";
Debug.ShouldStop(-2147483648);
video.mostCurrent.__c.runMethodAndSync(false,"CallSubNew3",video.processBA,(Object)((video.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("dwnl")),(Object)((RemoteObject.concat(video.mostCurrent._newmain._ip /*RemoteObject*/ ,RemoteObject.createImmutable("saralah/madahi.json")))),(Object)(video.getObject()));
 BA.debugLineNum = 33;BA.debugLine="ProgressDialogShow(\"در حال بارگذاری ...\")";
Debug.ShouldStop(1);
video.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",video.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("در حال بارگذاری ..."))));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Activity_Pause (video) ","video",10,video.mostCurrent.activityBA,video.mostCurrent,142);
if (RapidSub.canDelegate("activity_pause")) { return ir.cyber.saralahzn.video.remoteMe.runUserSub(false, "video","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 142;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Resume (video) ","video",10,video.mostCurrent.activityBA,video.mostCurrent,138);
if (RapidSub.canDelegate("activity_resume")) { return ir.cyber.saralahzn.video.remoteMe.runUserSub(false, "video","activity_resume");}
 BA.debugLineNum = 138;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _end1() throws Exception{
try {
		Debug.PushSubsStack("end1 (video) ","video",10,video.mostCurrent.activityBA,video.mostCurrent,156);
if (RapidSub.canDelegate("end1")) { return ir.cyber.saralahzn.video.remoteMe.runUserSub(false, "video","end1");}
 BA.debugLineNum = 156;BA.debugLine="Sub end1";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="ToastMessageShow(\"با مشکل مواجه شدید\",False)";
Debug.ShouldStop(268435456);
video.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("با مشکل مواجه شدید")),(Object)(video.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 158;BA.debugLine="Activity.Finish";
Debug.ShouldStop(536870912);
video.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim type_vid As Bitmap=LoadBitmap(File.DirAssets,";
video.mostCurrent._type_vid = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
video.mostCurrent._type_vid = video.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(video.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("play-video.png")));
 //BA.debugLineNum = 17;BA.debugLine="Dim type_sot As Bitmap=LoadBitmap(File.DirAssets,\"";
video.mostCurrent._type_sot = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
video.mostCurrent._type_sot = video.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(video.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("voice.png")));
 //BA.debugLineNum = 18;BA.debugLine="Dim ulvid As UltimateListView";
video.mostCurrent._ulvid = RemoteObject.createNew ("flm.b4a.ultimatelistview.UltimateListViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim glide As AriaGlide";
video.mostCurrent._glide = RemoteObject.createNew ("ariagp.amin.shahedi.AriaGlideWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Panel1 As Panel";
video.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ACSpinnerstyle As ACSpinner";
video.mostCurrent._acspinnerstyle = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSpinnerWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ACSpinnerday As ACSpinner";
video.mostCurrent._acspinnerday = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSpinnerWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim old_js As String";
video.mostCurrent._old_js = RemoteObject.createImmutable("");
 //BA.debugLineNum = 24;BA.debugLine="Dim max_item As Int";
video._max_item = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim sql As SQL";
video._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="Dim cur1 As Cursor";
video._cur1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spiner_itemset() throws Exception{
try {
		Debug.PushSubsStack("spiner_itemset (video) ","video",10,video.mostCurrent.activityBA,video.mostCurrent,129);
if (RapidSub.canDelegate("spiner_itemset")) { return ir.cyber.saralahzn.video.remoteMe.runUserSub(false, "video","spiner_itemset");}
int _i = 0;
 BA.debugLineNum = 129;BA.debugLine="Sub spiner_itemset";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="cur1=sql.ExecQuery(\"SELECT * FROM spinner_tbl\")";
Debug.ShouldStop(2);
video._cur1.setObject(video._sql.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM spinner_tbl"))));
 BA.debugLineNum = 132;BA.debugLine="For i =0 To cur1.RowCount-1";
Debug.ShouldStop(8);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {video._cur1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 133;BA.debugLine="cur1.Position=i";
Debug.ShouldStop(16);
video._cur1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 135;BA.debugLine="ACSpinnerstyle.Add(cur1.GetString(\"style\"))";
Debug.ShouldStop(64);
video.mostCurrent._acspinnerstyle.runVoidMethod ("Add",(Object)(BA.ObjectToCharSequence(video._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("style"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _start(RemoteObject _js) throws Exception{
try {
		Debug.PushSubsStack("start (video) ","video",10,video.mostCurrent.activityBA,video.mostCurrent,35);
if (RapidSub.canDelegate("start")) { return ir.cyber.saralahzn.video.remoteMe.runUserSub(false, "video","start", _js);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _records = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colrecords = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _style = RemoteObject.createImmutable("");
RemoteObject _pic_url = RemoteObject.createImmutable("");
RemoteObject _type1 = RemoteObject.createImmutable("");
RemoteObject _hajm = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
int _i = 0;
Debug.locals.put("js", _js);
 BA.debugLineNum = 35;BA.debugLine="Sub start(js As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8);
video.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 37;BA.debugLine="If js<>old_js Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",_js,video.mostCurrent._old_js)) { 
 BA.debugLineNum = 38;BA.debugLine="ulvid.Initialize(0,0,0,\"ulvid\")";
Debug.ShouldStop(32);
video.mostCurrent._ulvid.runVoidMethod ("Initialize",video.mostCurrent.activityBA,(Object)(BA.numberCast(byte.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.NumberToString(0)),(Object)(RemoteObject.createImmutable("ulvid")));
 BA.debugLineNum = 40;BA.debugLine="sql.Initialize(File.DirInternal,\"saralah.db\",Fals";
Debug.ShouldStop(128);
video._sql.runVoidMethod ("Initialize",(Object)(video.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("saralah.db")),(Object)(video.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 41;BA.debugLine="Activity.LoadLayout(\"madah\")";
Debug.ShouldStop(256);
video.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("madah")),video.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="spiner_itemset";
Debug.ShouldStop(512);
_spiner_itemset();
 BA.debugLineNum = 44;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2048);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 45;BA.debugLine="parser.Initialize(js)";
Debug.ShouldStop(4096);
_parser.runVoidMethod ("Initialize",(Object)(_js));
 BA.debugLineNum = 46;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(8192);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 47;BA.debugLine="Dim RECORDS As List = root.Get(\"RECORDS\")";
Debug.ShouldStop(16384);
_records = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_records.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("RECORDS")))));Debug.locals.put("RECORDS", _records);
 BA.debugLineNum = 48;BA.debugLine="For Each colRECORDS As Map In RECORDS";
Debug.ShouldStop(32768);
_colrecords = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group11 = _records;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_colrecords.setObject(group11.runMethod(false,"Get",index11));
Debug.locals.put("colRECORDS", _colrecords);
 BA.debugLineNum = 49;BA.debugLine="Dim name As String = colRECORDS.Get(\"name\")";
Debug.ShouldStop(65536);
_name = BA.ObjectToString(_colrecords.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 50;BA.debugLine="Dim style As String = colRECORDS.Get(\"style\")";
Debug.ShouldStop(131072);
_style = BA.ObjectToString(_colrecords.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("style")))));Debug.locals.put("style", _style);Debug.locals.put("style", _style);
 BA.debugLineNum = 51;BA.debugLine="Dim pic_url As String = colRECORDS.Get(\"pic_url\"";
Debug.ShouldStop(262144);
_pic_url = BA.ObjectToString(_colrecords.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pic_url")))));Debug.locals.put("pic_url", _pic_url);Debug.locals.put("pic_url", _pic_url);
 BA.debugLineNum = 52;BA.debugLine="Dim Type1 As String = colRECORDS.Get(\"type\")";
Debug.ShouldStop(524288);
_type1 = BA.ObjectToString(_colrecords.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("Type1", _type1);Debug.locals.put("Type1", _type1);
 BA.debugLineNum = 53;BA.debugLine="Dim hajm As String = colRECORDS.Get(\"hajm\")";
Debug.ShouldStop(1048576);
_hajm = BA.ObjectToString(_colrecords.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("hajm")))));Debug.locals.put("hajm", _hajm);Debug.locals.put("hajm", _hajm);
 BA.debugLineNum = 54;BA.debugLine="Dim url As String = colRECORDS.Get(\"url\")";
Debug.ShouldStop(2097152);
_url = BA.ObjectToString(_colrecords.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("url")))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 55;BA.debugLine="sql.ExecNonQuery(\"INSERT INTO madahi(name,pic_ur";
Debug.ShouldStop(4194304);
video._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO madahi(name,pic_url,url,style,type,hajm) VALUES('"),_name,RemoteObject.createImmutable("','"),_pic_url,RemoteObject.createImmutable("','"),_url,RemoteObject.createImmutable("','"),_style,RemoteObject.createImmutable("','"),_type1,RemoteObject.createImmutable("','"),_hajm,RemoteObject.createImmutable("')"))));
 }
}Debug.locals.put("colRECORDS", _colrecords);
;
 BA.debugLineNum = 57;BA.debugLine="cur1=sql.ExecQuery(\"SELECT * FROM madahi\")";
Debug.ShouldStop(16777216);
video._cur1.setObject(video._sql.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM madahi"))));
 BA.debugLineNum = 60;BA.debugLine="Panel1.AddView(ulvid,0,0dip,-1,-1)";
Debug.ShouldStop(134217728);
video.mostCurrent._panel1.runVoidMethod ("AddView",(Object)((video.mostCurrent._ulvid.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(video.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 BA.debugLineNum = 61;BA.debugLine="ulvid.AddLayout(\"layout1\",\"ulvid_LayoutCreator\",\"";
Debug.ShouldStop(268435456);
video.mostCurrent._ulvid.runVoidMethod ("AddLayout",(Object)(BA.ObjectToString("layout1")),(Object)(BA.ObjectToString("ulvid_LayoutCreator")),(Object)(BA.ObjectToString("ulvid_ContentFiller")),(Object)(video.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110)))),(Object)(video.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 62;BA.debugLine="max_item=cur1.RowCount-1";
Debug.ShouldStop(536870912);
video._max_item = RemoteObject.solve(new RemoteObject[] {video._cur1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 63;BA.debugLine="For i = 0 To max_item";
Debug.ShouldStop(1073741824);
{
final int step24 = 1;
final int limit24 = video._max_item.<Integer>get().intValue();
_i = 0 ;
for (;(step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24) ;_i = ((int)(0 + _i + step24))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 64;BA.debugLine="ulvid.AddItem(\"layout1\", i)";
Debug.ShouldStop(-2147483648);
video.mostCurrent._ulvid.runVoidMethod ("AddItem",(Object)(BA.ObjectToString("layout1")),(Object)(BA.numberCast(long.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 66;BA.debugLine="ulvid.SetStyle(ulvid.STYLE_DEFAULT)";
Debug.ShouldStop(2);
video.mostCurrent._ulvid.runVoidMethod ("SetStyle",video.mostCurrent.activityBA,(Object)(video.mostCurrent._ulvid.getField(true,"STYLE_DEFAULT")));
 BA.debugLineNum = 67;BA.debugLine="old_js=js";
Debug.ShouldStop(4);
video.mostCurrent._old_js = _js;
 };
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
public static RemoteObject  _ulvid_contentfiller(RemoteObject _itemid,RemoteObject _layoutname,RemoteObject _layoutpanel,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ulvid_ContentFiller (video) ","video",10,video.mostCurrent.activityBA,video.mostCurrent,75);
if (RapidSub.canDelegate("ulvid_contentfiller")) { return ir.cyber.saralahzn.video.remoteMe.runUserSub(false, "video","ulvid_contentfiller", _itemid, _layoutname, _layoutpanel, _position);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl_name = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_hajm = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _img_title = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _img_type = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _btn_download = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
Debug.locals.put("ItemID", _itemid);
Debug.locals.put("LayoutName", _layoutname);
Debug.locals.put("LayoutPanel", _layoutpanel);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 75;BA.debugLine="Sub ulvid_ContentFiller(ItemID As Long, LayoutName";
Debug.ShouldStop(1024);
 BA.debugLineNum = 78;BA.debugLine="Log(ItemID)";
Debug.ShouldStop(8192);
video.mostCurrent.__c.runVoidMethod ("LogImpl","66881283",BA.NumberToString(_itemid),0);
 BA.debugLineNum = 79;BA.debugLine="cur1.Position=ItemID";
Debug.ShouldStop(16384);
video._cur1.runMethod(true,"setPosition",BA.numberCast(int.class, _itemid));
 BA.debugLineNum = 81;BA.debugLine="Dim p As Panel=LayoutPanel.GetView(0)";
Debug.ShouldStop(65536);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p.setObject(_layoutpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 83;BA.debugLine="Dim lbl_name As Label=p.GetView(1)";
Debug.ShouldStop(262144);
_lbl_name = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_name.setObject(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("lbl_name", _lbl_name);
 BA.debugLineNum = 85;BA.debugLine="Dim lbl_hajm As Label=p.GetView(4)";
Debug.ShouldStop(1048576);
_lbl_hajm = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_hajm.setObject(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 4))).getObject());Debug.locals.put("lbl_hajm", _lbl_hajm);
 BA.debugLineNum = 87;BA.debugLine="Dim img_title As ImageView=p.GetView(0)";
Debug.ShouldStop(4194304);
_img_title = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_img_title.setObject(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("img_title", _img_title);
 BA.debugLineNum = 89;BA.debugLine="Dim img_type As ImageView=p.GetView(3)";
Debug.ShouldStop(16777216);
_img_type = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_img_type.setObject(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).getObject());Debug.locals.put("img_type", _img_type);
 BA.debugLineNum = 91;BA.debugLine="Dim btn_download As Button=p.GetView(2)";
Debug.ShouldStop(67108864);
_btn_download = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_btn_download.setObject(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).getObject());Debug.locals.put("btn_download", _btn_download);
 BA.debugLineNum = 92;BA.debugLine="btn_download.Tag=ItemID";
Debug.ShouldStop(134217728);
_btn_download.runMethod(false,"setTag",(_itemid));
 BA.debugLineNum = 94;BA.debugLine="ulvid.AnimationCleaner=True";
Debug.ShouldStop(536870912);
video.mostCurrent._ulvid.runMethod(true,"setAnimationCleaner",video.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 95;BA.debugLine="lbl_name.Text=cur1.GetString(\"name\")";
Debug.ShouldStop(1073741824);
_lbl_name.runMethod(true,"setText",BA.ObjectToCharSequence(video._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")))));
 BA.debugLineNum = 96;BA.debugLine="lbl_hajm.Text=cur1.GetInt(\"hajm\")&\" MB\"";
Debug.ShouldStop(-2147483648);
_lbl_hajm.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(video._cur1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("hajm"))),RemoteObject.createImmutable(" MB"))));
 BA.debugLineNum = 97;BA.debugLine="glide.Load(cur1.GetString(\"pic_url\")).AsBitmap.Pl";
Debug.ShouldStop(1);
video.mostCurrent._glide.runMethod(false,"Load",(Object)((video._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("pic_url")))))).runMethod(false,"AsBitmap").runMethod(false,"Placeholder",(Object)((video.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(video.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("placeholder.jpg"))).getObject()))).runVoidMethod ("IntoImageView",(Object)(_img_title));
 BA.debugLineNum = 98;BA.debugLine="If cur1.GetString(\"url\").EndsWith(\"mp3\") Then";
Debug.ShouldStop(2);
if (video._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("url"))).runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("mp3"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 99;BA.debugLine="img_type.Bitmap=type_sot";
Debug.ShouldStop(4);
_img_type.runMethod(false,"setBitmap",(video.mostCurrent._type_sot.getObject()));
 }else {
 BA.debugLineNum = 102;BA.debugLine="img_type.Bitmap=type_vid";
Debug.ShouldStop(32);
_img_type.runMethod(false,"setBitmap",(video.mostCurrent._type_vid.getObject()));
 };
 BA.debugLineNum = 105;BA.debugLine="If ItemID=0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_itemid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 106;BA.debugLine="ulvid.SetStyle(ulvid.STYLE_HOLO_LIGHT)";
Debug.ShouldStop(512);
video.mostCurrent._ulvid.runVoidMethod ("SetStyle",video.mostCurrent.activityBA,(Object)(video.mostCurrent._ulvid.getField(true,"STYLE_HOLO_LIGHT")));
 BA.debugLineNum = 107;BA.debugLine="ulvid.Color=Colors.Transparent";
Debug.ShouldStop(1024);
video.mostCurrent._ulvid.runVoidMethod ("setColor",video.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 };
 BA.debugLineNum = 110;BA.debugLine="If ItemID=max_item Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_itemid,BA.numberCast(double.class, video._max_item))) { 
 };
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ulvid_itemclick(RemoteObject _itemid,RemoteObject _position,RemoteObject _clickedpanel) throws Exception{
try {
		Debug.PushSubsStack("ulvid_ItemClick (video) ","video",10,video.mostCurrent.activityBA,video.mostCurrent,118);
if (RapidSub.canDelegate("ulvid_itemclick")) { return ir.cyber.saralahzn.video.remoteMe.runUserSub(false, "video","ulvid_itemclick", _itemid, _position, _clickedpanel);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("ItemID", _itemid);
Debug.locals.put("Position", _position);
Debug.locals.put("ClickedPanel", _clickedpanel);
 BA.debugLineNum = 118;BA.debugLine="Sub ulvid_ItemClick(ItemID As Long, Position As In";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="Dim m As Map";
Debug.ShouldStop(4194304);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 120;BA.debugLine="m.Initialize";
Debug.ShouldStop(8388608);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 121;BA.debugLine="cur1.Position=ItemID";
Debug.ShouldStop(16777216);
video._cur1.runMethod(true,"setPosition",BA.numberCast(int.class, _itemid));
 BA.debugLineNum = 122;BA.debugLine="m.Put(\"comment\",cur1.GetString(\"name\"))";
Debug.ShouldStop(33554432);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("comment"))),(Object)((video._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 123;BA.debugLine="m.Put(\"img_url\",cur1.GetString(\"pic_url\"))";
Debug.ShouldStop(67108864);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("img_url"))),(Object)((video._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("pic_url"))))));
 BA.debugLineNum = 124;BA.debugLine="m.Put(\"url\",cur1.GetString(\"url\"))";
Debug.ShouldStop(134217728);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("url"))),(Object)((video._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("url"))))));
 BA.debugLineNum = 125;BA.debugLine="video_view.m=m";
Debug.ShouldStop(268435456);
video.mostCurrent._video_view._m /*RemoteObject*/  = _m;
 BA.debugLineNum = 127;BA.debugLine="StartActivity(video_view)";
Debug.ShouldStop(1073741824);
video.mostCurrent.__c.runVoidMethod ("StartActivity",video.processBA,(Object)((video.mostCurrent._video_view.getObject())));
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("ulvid_LayoutCreator (video) ","video",10,video.mostCurrent.activityBA,video.mostCurrent,70);
if (RapidSub.canDelegate("ulvid_layoutcreator")) { return ir.cyber.saralahzn.video.remoteMe.runUserSub(false, "video","ulvid_layoutcreator", _layoutname, _layoutpanel);}
Debug.locals.put("LayoutName", _layoutname);
Debug.locals.put("LayoutPanel", _layoutpanel);
 BA.debugLineNum = 70;BA.debugLine="Sub ulvid_LayoutCreator(LayoutName As String, Layo";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="LayoutPanel.LoadLayout(\"media_pnl\")";
Debug.ShouldStop(64);
_layoutpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("media_pnl")),video.mostCurrent.activityBA);
 BA.debugLineNum = 73;BA.debugLine="End Sub";
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