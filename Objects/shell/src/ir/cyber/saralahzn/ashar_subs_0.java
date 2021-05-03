package ir.cyber.saralahzn;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ashar_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (ashar) ","ashar",2,ashar.mostCurrent.activityBA,ashar.mostCurrent,62);
if (RapidSub.canDelegate("activity_create")) { return ir.cyber.saralahzn.ashar.remoteMe.runUserSub(false, "ashar","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 62;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 64;BA.debugLine="Activity.LoadLayout(\"sher_show\")";
Debug.ShouldStop(-2147483648);
ashar.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("sher_show")),ashar.mostCurrent.activityBA);
 BA.debugLineNum = 65;BA.debugLine="CallSub3(Starter,\"dwnl\",newMain.ip&\"saralah/sher.";
Debug.ShouldStop(1);
ashar.mostCurrent.__c.runMethodAndSync(false,"CallSubNew3",ashar.processBA,(Object)((ashar.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("dwnl")),(Object)((RemoteObject.concat(ashar.mostCurrent._newmain._ip /*RemoteObject*/ ,RemoteObject.createImmutable("saralah/sher.json")))),(Object)(ashar.getObject()));
 BA.debugLineNum = 66;BA.debugLine="ProgressDialogShow(\"در حال بارگذاری ...\")";
Debug.ShouldStop(2);
ashar.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",ashar.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("در حال بارگذاری ..."))));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Activity_Pause (ashar) ","ashar",2,ashar.mostCurrent.activityBA,ashar.mostCurrent,73);
if (RapidSub.canDelegate("activity_pause")) { return ir.cyber.saralahzn.ashar.remoteMe.runUserSub(false, "ashar","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 73;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(256);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (ashar) ","ashar",2,ashar.mostCurrent.activityBA,ashar.mostCurrent,69);
if (RapidSub.canDelegate("activity_resume")) { return ir.cyber.saralahzn.ashar.remoteMe.runUserSub(false, "ashar","activity_resume");}
 BA.debugLineNum = 69;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16);
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("end1 (ashar) ","ashar",2,ashar.mostCurrent.activityBA,ashar.mostCurrent,104);
if (RapidSub.canDelegate("end1")) { return ir.cyber.saralahzn.ashar.remoteMe.runUserSub(false, "ashar","end1");}
 BA.debugLineNum = 104;BA.debugLine="Sub end1";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="ToastMessageShow(\"با مشکل مواجه شدید\",False)";
Debug.ShouldStop(256);
ashar.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("با مشکل مواجه شدید")),(Object)(ashar.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 106;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
ashar.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim old_js As String";
ashar.mostCurrent._old_js = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Dim ulvid As UltimateListView";
ashar.mostCurrent._ulvid = RemoteObject.createNew ("flm.b4a.ultimatelistview.UltimateListViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Panel1 As Panel";
ashar.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim max_item As Int";
ashar._max_item = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lbl_more_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_more_Click (ashar) ","ashar",2,ashar.mostCurrent.activityBA,ashar.mostCurrent,100);
if (RapidSub.canDelegate("lbl_more_click")) { return ir.cyber.saralahzn.ashar.remoteMe.runUserSub(false, "ashar","lbl_more_click");}
 BA.debugLineNum = 100;BA.debugLine="Sub lbl_more_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim sql As SQL";
ashar._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="Dim cur1 As Cursor";
ashar._cur1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _start(RemoteObject _js) throws Exception{
try {
		Debug.PushSubsStack("start (ashar) ","ashar",2,ashar.mostCurrent.activityBA,ashar.mostCurrent,24);
if (RapidSub.canDelegate("start")) { return ir.cyber.saralahzn.ashar.remoteMe.runUserSub(false, "ashar","start", _js);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _records = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colrecords = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _style = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _body = RemoteObject.createImmutable("");
int _i = 0;
Debug.locals.put("js", _js);
 BA.debugLineNum = 24;BA.debugLine="Sub start(js As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16777216);
ashar.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 26;BA.debugLine="If js<>old_js Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("!",_js,ashar.mostCurrent._old_js)) { 
 BA.debugLineNum = 27;BA.debugLine="Log(js)";
Debug.ShouldStop(67108864);
ashar.mostCurrent.__c.runVoidMethod ("LogImpl","61835011",_js,0);
 BA.debugLineNum = 28;BA.debugLine="ulvid.Initialize(0,0,0,\"ulvid\")";
Debug.ShouldStop(134217728);
ashar.mostCurrent._ulvid.runVoidMethod ("Initialize",ashar.mostCurrent.activityBA,(Object)(BA.numberCast(byte.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.NumberToString(0)),(Object)(RemoteObject.createImmutable("ulvid")));
 BA.debugLineNum = 30;BA.debugLine="sql.Initialize(File.DirInternal,\"saralah.db\",Fal";
Debug.ShouldStop(536870912);
ashar._sql.runVoidMethod ("Initialize",(Object)(ashar.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("saralah.db")),(Object)(ashar.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 31;BA.debugLine="Activity.LoadLayout(\"sher_show\")";
Debug.ShouldStop(1073741824);
ashar.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("sher_show")),ashar.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 34;BA.debugLine="parser.Initialize(js)";
Debug.ShouldStop(2);
_parser.runVoidMethod ("Initialize",(Object)(_js));
 BA.debugLineNum = 35;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(4);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 36;BA.debugLine="Dim RECORDS As List = root.Get(\"RECORDS\")";
Debug.ShouldStop(8);
_records = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_records.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("RECORDS")))));Debug.locals.put("RECORDS", _records);
 BA.debugLineNum = 37;BA.debugLine="For Each colRECORDS As Map In RECORDS";
Debug.ShouldStop(16);
_colrecords = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group11 = _records;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_colrecords.setObject(group11.runMethod(false,"Get",index11));
Debug.locals.put("colRECORDS", _colrecords);
 BA.debugLineNum = 39;BA.debugLine="Dim name As String = colRECORDS.Get(\"name\")";
Debug.ShouldStop(64);
_name = BA.ObjectToString(_colrecords.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 40;BA.debugLine="Dim style As String = colRECORDS.Get(\"style\")";
Debug.ShouldStop(128);
_style = BA.ObjectToString(_colrecords.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("style")))));Debug.locals.put("style", _style);Debug.locals.put("style", _style);
 BA.debugLineNum = 42;BA.debugLine="Dim ID As Int = colRECORDS.Get(\"ID\")";
Debug.ShouldStop(512);
_id = BA.numberCast(int.class, _colrecords.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ID")))));Debug.locals.put("ID", _id);Debug.locals.put("ID", _id);
 BA.debugLineNum = 43;BA.debugLine="Log(ID)";
Debug.ShouldStop(1024);
ashar.mostCurrent.__c.runVoidMethod ("LogImpl","61835027",BA.NumberToString(_id),0);
 BA.debugLineNum = 44;BA.debugLine="Dim body As String = colRECORDS.Get(\"body\")";
Debug.ShouldStop(2048);
_body = BA.ObjectToString(_colrecords.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("body")))));Debug.locals.put("body", _body);Debug.locals.put("body", _body);
 BA.debugLineNum = 45;BA.debugLine="sql.ExecNonQuery(\"INSERT INTO sher(name,body,st";
Debug.ShouldStop(4096);
ashar._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO sher(name,body,style) VALUES('"),_name,RemoteObject.createImmutable("','"),_body,RemoteObject.createImmutable("','"),_style,RemoteObject.createImmutable("')"))));
 }
}Debug.locals.put("colRECORDS", _colrecords);
;
 BA.debugLineNum = 47;BA.debugLine="cur1=sql.ExecQuery(\"SELECT * FROM sher\")";
Debug.ShouldStop(16384);
ashar._cur1.setObject(ashar._sql.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM sher"))));
 BA.debugLineNum = 50;BA.debugLine="Panel1.AddView(ulvid,0,0dip,-1,-1)";
Debug.ShouldStop(131072);
ashar.mostCurrent._panel1.runVoidMethod ("AddView",(Object)((ashar.mostCurrent._ulvid.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(ashar.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 BA.debugLineNum = 51;BA.debugLine="ulvid.AddLayout(\"layout1\",\"ulvid_LayoutCreator\",";
Debug.ShouldStop(262144);
ashar.mostCurrent._ulvid.runVoidMethod ("AddLayout",(Object)(BA.ObjectToString("layout1")),(Object)(BA.ObjectToString("ulvid_LayoutCreator")),(Object)(BA.ObjectToString("ulvid_ContentFiller")),(Object)(ashar.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))),(Object)(ashar.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 53;BA.debugLine="max_item=cur1.RowCount-1";
Debug.ShouldStop(1048576);
ashar._max_item = RemoteObject.solve(new RemoteObject[] {ashar._cur1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 54;BA.debugLine="Log(max_item)";
Debug.ShouldStop(2097152);
ashar.mostCurrent.__c.runVoidMethod ("LogImpl","61835038",BA.NumberToString(ashar._max_item),0);
 BA.debugLineNum = 55;BA.debugLine="For i = 0 To max_item";
Debug.ShouldStop(4194304);
{
final int step24 = 1;
final int limit24 = ashar._max_item.<Integer>get().intValue();
_i = 0 ;
for (;(step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24) ;_i = ((int)(0 + _i + step24))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 56;BA.debugLine="ulvid.AddItem(\"layout1\", i)";
Debug.ShouldStop(8388608);
ashar.mostCurrent._ulvid.runVoidMethod ("AddItem",(Object)(BA.ObjectToString("layout1")),(Object)(BA.numberCast(long.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 59;BA.debugLine="old_js=js";
Debug.ShouldStop(67108864);
ashar.mostCurrent._old_js = _js;
 };
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("ulvid_ContentFiller (ashar) ","ashar",2,ashar.mostCurrent.activityBA,ashar.mostCurrent,81);
if (RapidSub.canDelegate("ulvid_contentfiller")) { return ir.cyber.saralahzn.ashar.remoteMe.runUserSub(false, "ashar","ulvid_contentfiller", _itemid, _layoutname, _layoutpanel, _position);}
RemoteObject _style = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _name = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("ItemID", _itemid);
Debug.locals.put("LayoutName", _layoutname);
Debug.locals.put("LayoutPanel", _layoutpanel);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 81;BA.debugLine="Sub ulvid_ContentFiller(ItemID As Long, LayoutName";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="cur1.Position=ItemID";
Debug.ShouldStop(131072);
ashar._cur1.runMethod(true,"setPosition",BA.numberCast(int.class, _itemid));
 BA.debugLineNum = 83;BA.debugLine="Dim style As Label=LayoutPanel.GetView(1)";
Debug.ShouldStop(262144);
_style = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_style.setObject(_layoutpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("style", _style);
 BA.debugLineNum = 84;BA.debugLine="Dim name As Label=LayoutPanel.GetView(0)";
Debug.ShouldStop(524288);
_name = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_name.setObject(_layoutpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("name", _name);
 BA.debugLineNum = 85;BA.debugLine="style.Text=cur1.GetString(\"style\")";
Debug.ShouldStop(1048576);
_style.runMethod(true,"setText",BA.ObjectToCharSequence(ashar._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("style")))));
 BA.debugLineNum = 86;BA.debugLine="name.Text=cur1.GetString(\"name\")";
Debug.ShouldStop(2097152);
_name.runMethod(true,"setText",BA.ObjectToCharSequence(ashar._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")))));
 BA.debugLineNum = 87;BA.debugLine="If ItemID=0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_itemid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 88;BA.debugLine="ulvid.SetStyle(ulvid.STYLE_HOLO_DARK)";
Debug.ShouldStop(8388608);
ashar.mostCurrent._ulvid.runVoidMethod ("SetStyle",ashar.mostCurrent.activityBA,(Object)(ashar.mostCurrent._ulvid.getField(true,"STYLE_HOLO_DARK")));
 };
 BA.debugLineNum = 90;BA.debugLine="Log(LayoutPanel.NumberOfViews)";
Debug.ShouldStop(33554432);
ashar.mostCurrent.__c.runVoidMethod ("LogImpl","62162697",BA.NumberToString(_layoutpanel.runMethod(true,"getNumberOfViews")),0);
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("ulvid_ItemClick (ashar) ","ashar",2,ashar.mostCurrent.activityBA,ashar.mostCurrent,92);
if (RapidSub.canDelegate("ulvid_itemclick")) { return ir.cyber.saralahzn.ashar.remoteMe.runUserSub(false, "ashar","ulvid_itemclick", _itemid, _position, _clickedpanel);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("ItemID", _itemid);
Debug.locals.put("Position", _position);
Debug.locals.put("ClickedPanel", _clickedpanel);
 BA.debugLineNum = 92;BA.debugLine="Sub ulvid_ItemClick(ItemID As Long, Position As In";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="Log(\"ClickedPanel\")";
Debug.ShouldStop(268435456);
ashar.mostCurrent.__c.runVoidMethod ("LogImpl","62228225",RemoteObject.createImmutable("ClickedPanel"),0);
 BA.debugLineNum = 94;BA.debugLine="cur1.Position=Position";
Debug.ShouldStop(536870912);
ashar._cur1.runMethod(true,"setPosition",_position);
 BA.debugLineNum = 95;BA.debugLine="Dim m As Map=CreateMap(\"title\":cur1.GetString(\"nam";
Debug.ShouldStop(1073741824);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = ashar.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),(ashar._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")))),RemoteObject.createImmutable(("body")),(ashar._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("body"))))}));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 96;BA.debugLine="sher_view.map1=m";
Debug.ShouldStop(-2147483648);
ashar.mostCurrent._sher_view._map1 /*RemoteObject*/  = _m;
 BA.debugLineNum = 97;BA.debugLine="StartActivity(sher_view)";
Debug.ShouldStop(1);
ashar.mostCurrent.__c.runVoidMethod ("StartActivity",ashar.processBA,(Object)((ashar.mostCurrent._sher_view.getObject())));
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
		Debug.PushSubsStack("ulvid_LayoutCreator (ashar) ","ashar",2,ashar.mostCurrent.activityBA,ashar.mostCurrent,78);
if (RapidSub.canDelegate("ulvid_layoutcreator")) { return ir.cyber.saralahzn.ashar.remoteMe.runUserSub(false, "ashar","ulvid_layoutcreator", _layoutname, _layoutpanel);}
Debug.locals.put("LayoutName", _layoutname);
Debug.locals.put("LayoutPanel", _layoutpanel);
 BA.debugLineNum = 78;BA.debugLine="Sub ulvid_LayoutCreator(LayoutName As String, Layo";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="LayoutPanel.LoadLayout(\"layout1_sher\")";
Debug.ShouldStop(16384);
_layoutpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layout1_sher")),ashar.mostCurrent.activityBA);
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}