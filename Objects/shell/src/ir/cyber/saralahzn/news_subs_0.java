package ir.cyber.saralahzn;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class news_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (news) ","news",5,news.mostCurrent.activityBA,news.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { return ir.cyber.saralahzn.news.remoteMe.runUserSub(false, "news","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 29;BA.debugLine="CallSub3(Starter,\"dwnl\",newMain.ip&\"saralah/news.";
Debug.ShouldStop(268435456);
news.mostCurrent.__c.runMethodAndSync(false,"CallSubNew3",news.processBA,(Object)((news.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("dwnl")),(Object)((RemoteObject.concat(news.mostCurrent._newmain._ip /*RemoteObject*/ ,RemoteObject.createImmutable("saralah/news.json")))),(Object)(news.getObject()));
 BA.debugLineNum = 30;BA.debugLine="ProgressDialogShow2(\"در حال بارگذاری ...\",True)";
Debug.ShouldStop(536870912);
news.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",news.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("در حال بارگذاری ...")),(Object)(news.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Activity_Pause (news) ","news",5,news.mostCurrent.activityBA,news.mostCurrent,109);
if (RapidSub.canDelegate("activity_pause")) { return ir.cyber.saralahzn.news.remoteMe.runUserSub(false, "news","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 109;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_Resume (news) ","news",5,news.mostCurrent.activityBA,news.mostCurrent,105);
if (RapidSub.canDelegate("activity_resume")) { return ir.cyber.saralahzn.news.remoteMe.runUserSub(false, "news","activity_resume");}
 BA.debugLineNum = 105;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(256);
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
public static RemoteObject  _end1() throws Exception{
try {
		Debug.PushSubsStack("end1 (news) ","news",5,news.mostCurrent.activityBA,news.mostCurrent,112);
if (RapidSub.canDelegate("end1")) { return ir.cyber.saralahzn.news.remoteMe.runUserSub(false, "news","end1");}
 BA.debugLineNum = 112;BA.debugLine="Sub end1";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="ToastMessageShow(\"با مشکل مواجه شدید\",False)";
Debug.ShouldStop(65536);
news.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("با مشکل مواجه شدید")),(Object)(news.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 114;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
news.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Dim ulvnews As UltimateListView";
news.mostCurrent._ulvnews = RemoteObject.createNew ("flm.b4a.ultimatelistview.UltimateListViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim glide As AriaGlide";
news.mostCurrent._glide = RemoteObject.createNew ("ariagp.amin.shahedi.AriaGlideWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Panel1 As Panel";
news.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim old_js As String";
news.mostCurrent._old_js = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Dim max_item As Int";
news._max_item = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim sql As SQL";
news._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="Dim cur1 As Cursor";
news._cur1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _start(RemoteObject _js) throws Exception{
try {
		Debug.PushSubsStack("start (news) ","news",5,news.mostCurrent.activityBA,news.mostCurrent,34);
if (RapidSub.canDelegate("start")) { return ir.cyber.saralahzn.news.remoteMe.runUserSub(false, "news","start", _js);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _records = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colrecords = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _body = RemoteObject.createImmutable("");
RemoteObject _pic_url = RemoteObject.createImmutable("");
int _i = 0;
Debug.locals.put("js", _js);
 BA.debugLineNum = 34;BA.debugLine="Sub start(js As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4);
news.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 36;BA.debugLine="If js<>old_js Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("!",_js,news.mostCurrent._old_js)) { 
 BA.debugLineNum = 37;BA.debugLine="ulvnews.Initialize(0,0,0,\"ulvnews\")";
Debug.ShouldStop(16);
news.mostCurrent._ulvnews.runVoidMethod ("Initialize",news.mostCurrent.activityBA,(Object)(BA.numberCast(byte.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.NumberToString(0)),(Object)(RemoteObject.createImmutable("ulvnews")));
 BA.debugLineNum = 39;BA.debugLine="sql.Initialize(File.DirInternal,\"saralah.db\",Fal";
Debug.ShouldStop(64);
news._sql.runVoidMethod ("Initialize",(Object)(news.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("saralah.db")),(Object)(news.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 40;BA.debugLine="Activity.LoadLayout(\"news_load_lay\")";
Debug.ShouldStop(128);
news.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("news_load_lay")),news.mostCurrent.activityBA);
 BA.debugLineNum = 43;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1024);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 44;BA.debugLine="parser.Initialize(js)";
Debug.ShouldStop(2048);
_parser.runVoidMethod ("Initialize",(Object)(_js));
 BA.debugLineNum = 45;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(4096);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 46;BA.debugLine="Dim RECORDS As List = root.Get(\"RECORDS\")";
Debug.ShouldStop(8192);
_records = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_records.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("RECORDS")))));Debug.locals.put("RECORDS", _records);
 BA.debugLineNum = 47;BA.debugLine="For Each colRECORDS As Map In RECORDS";
Debug.ShouldStop(16384);
_colrecords = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group10 = _records;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_colrecords.setObject(group10.runMethod(false,"Get",index10));
Debug.locals.put("colRECORDS", _colrecords);
 BA.debugLineNum = 48;BA.debugLine="Dim date As String = colRECORDS.Get(\"date\")";
Debug.ShouldStop(32768);
_date = BA.ObjectToString(_colrecords.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("date")))));Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 49;BA.debugLine="Dim title As String = colRECORDS.Get(\"title\")";
Debug.ShouldStop(65536);
_title = BA.ObjectToString(_colrecords.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 50;BA.debugLine="Dim ID As String=colRECORDS.Get(\"ID\")";
Debug.ShouldStop(131072);
_id = BA.ObjectToString(_colrecords.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ID")))));Debug.locals.put("ID", _id);Debug.locals.put("ID", _id);
 BA.debugLineNum = 51;BA.debugLine="Dim body As String = colRECORDS.Get(\"body\")";
Debug.ShouldStop(262144);
_body = BA.ObjectToString(_colrecords.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("body")))));Debug.locals.put("body", _body);Debug.locals.put("body", _body);
 BA.debugLineNum = 52;BA.debugLine="Dim pic_url As String = colRECORDS.Get(\"pic_url";
Debug.ShouldStop(524288);
_pic_url = BA.ObjectToString(_colrecords.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pic_url")))));Debug.locals.put("pic_url", _pic_url);Debug.locals.put("pic_url", _pic_url);
 BA.debugLineNum = 53;BA.debugLine="sql.ExecNonQuery(\"INSERT INTO news(ID,title,bod";
Debug.ShouldStop(1048576);
news._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO news(ID,title,body,pic_url,date) VALUES('"),_id,RemoteObject.createImmutable("','"),_title,RemoteObject.createImmutable("','"),_body,RemoteObject.createImmutable("','"),_pic_url,RemoteObject.createImmutable("','"),_date,RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 54;BA.debugLine="cur1=sql.ExecQuery(\"SELECT * FROM news\")";
Debug.ShouldStop(2097152);
news._cur1.setObject(news._sql.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM news"))));
 }
}Debug.locals.put("colRECORDS", _colrecords);
;
 BA.debugLineNum = 57;BA.debugLine="Panel1.AddView(ulvnews,0,0dip,-1,-1)";
Debug.ShouldStop(16777216);
news.mostCurrent._panel1.runVoidMethod ("AddView",(Object)((news.mostCurrent._ulvnews.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(news.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 BA.debugLineNum = 58;BA.debugLine="ulvnews.AddLayout(\"layout1\",\"ulvnews_LayoutCreat";
Debug.ShouldStop(33554432);
news.mostCurrent._ulvnews.runVoidMethod ("AddLayout",(Object)(BA.ObjectToString("layout1")),(Object)(BA.ObjectToString("ulvnews_LayoutCreator")),(Object)(BA.ObjectToString("ulvnews_ContentFiller")),(Object)(news.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 320)))),(Object)(news.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 59;BA.debugLine="max_item=cur1.RowCount-1";
Debug.ShouldStop(67108864);
news._max_item = RemoteObject.solve(new RemoteObject[] {news._cur1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 60;BA.debugLine="For i = 0 To max_item";
Debug.ShouldStop(134217728);
{
final int step22 = 1;
final int limit22 = news._max_item.<Integer>get().intValue();
_i = 0 ;
for (;(step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22) ;_i = ((int)(0 + _i + step22))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 61;BA.debugLine="ulvnews.AddItem(\"layout1\", i)";
Debug.ShouldStop(268435456);
news.mostCurrent._ulvnews.runVoidMethod ("AddItem",(Object)(BA.ObjectToString("layout1")),(Object)(BA.numberCast(long.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 63;BA.debugLine="ulvnews.FadingEdges(False)";
Debug.ShouldStop(1073741824);
news.mostCurrent._ulvnews.runVoidMethod ("FadingEdges",(Object)(news.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 64;BA.debugLine="ulvnews.SetStyle(ulvnews.STYLE_DEFAULT)";
Debug.ShouldStop(-2147483648);
news.mostCurrent._ulvnews.runVoidMethod ("SetStyle",news.mostCurrent.activityBA,(Object)(news.mostCurrent._ulvnews.getField(true,"STYLE_DEFAULT")));
 BA.debugLineNum = 66;BA.debugLine="old_js=js";
Debug.ShouldStop(2);
news.mostCurrent._old_js = _js;
 };
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ulvnews_contentfiller(RemoteObject _itemid,RemoteObject _layoutname,RemoteObject _layoutpanel,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ulvnews_ContentFiller (news) ","news",5,news.mostCurrent.activityBA,news.mostCurrent,76);
if (RapidSub.canDelegate("ulvnews_contentfiller")) { return ir.cyber.saralahzn.news.remoteMe.runUserSub(false, "news","ulvnews_contentfiller", _itemid, _layoutname, _layoutpanel, _position);}
RemoteObject _imgbody = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _lbltitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lblbody = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbltime = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("ItemID", _itemid);
Debug.locals.put("LayoutName", _layoutname);
Debug.locals.put("LayoutPanel", _layoutpanel);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 76;BA.debugLine="Sub ulvnews_ContentFiller(ItemID As Long, LayoutNa";
Debug.ShouldStop(2048);
 BA.debugLineNum = 79;BA.debugLine="Log(ItemID)";
Debug.ShouldStop(16384);
news.mostCurrent.__c.runVoidMethod ("LogImpl","64194307",BA.NumberToString(_itemid),0);
 BA.debugLineNum = 80;BA.debugLine="cur1.Position=ItemID";
Debug.ShouldStop(32768);
news._cur1.runMethod(true,"setPosition",BA.numberCast(int.class, _itemid));
 BA.debugLineNum = 81;BA.debugLine="Dim imgBody As ImageView=LayoutPanel.GetView(1)";
Debug.ShouldStop(65536);
_imgbody = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_imgbody.setObject(_layoutpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("imgBody", _imgbody);
 BA.debugLineNum = 82;BA.debugLine="Dim lblTitle As Label=LayoutPanel.GetView(2)";
Debug.ShouldStop(131072);
_lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbltitle.setObject(_layoutpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).getObject());Debug.locals.put("lblTitle", _lbltitle);
 BA.debugLineNum = 83;BA.debugLine="Dim lblBody As Label=LayoutPanel.GetView(6)";
Debug.ShouldStop(262144);
_lblbody = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblbody.setObject(_layoutpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 6))).getObject());Debug.locals.put("lblBody", _lblbody);
 BA.debugLineNum = 86;BA.debugLine="Dim lbltime As Label=LayoutPanel.GetView(5)";
Debug.ShouldStop(2097152);
_lbltime = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbltime.setObject(_layoutpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 5))).getObject());Debug.locals.put("lbltime", _lbltime);
 BA.debugLineNum = 87;BA.debugLine="glide.Load(cur1.GetString(\"pic_url\")).AsBitmap.Pl";
Debug.ShouldStop(4194304);
news.mostCurrent._glide.runMethod(false,"Load",(Object)((news._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("pic_url")))))).runMethod(false,"AsBitmap").runMethod(false,"Placeholder",(Object)((news.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(news.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("placeholder.jpg"))).getObject()))).runMethod(false,"CenterCrop").runVoidMethod ("IntoImageView",(Object)(_imgbody));
 BA.debugLineNum = 88;BA.debugLine="lblTitle.Text=cur1.GetString(\"title\")";
Debug.ShouldStop(8388608);
_lbltitle.runMethod(true,"setText",BA.ObjectToCharSequence(news._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")))));
 BA.debugLineNum = 90;BA.debugLine="lblBody.Text=(cur1.GetString(\"body\"))";
Debug.ShouldStop(33554432);
_lblbody.runMethod(true,"setText",BA.ObjectToCharSequence((news._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("body"))))));
 BA.debugLineNum = 91;BA.debugLine="lbltime.Text=cur1.GetString(\"date\")";
Debug.ShouldStop(67108864);
_lbltime.runMethod(true,"setText",BA.ObjectToCharSequence(news._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("date")))));
 BA.debugLineNum = 93;BA.debugLine="If max_item=ItemID Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",news._max_item,BA.numberCast(double.class, _itemid))) { 
 BA.debugLineNum = 94;BA.debugLine="ulvnews.SetStyle(ulvnews.STYLE_DEFAULT)";
Debug.ShouldStop(536870912);
news.mostCurrent._ulvnews.runVoidMethod ("SetStyle",news.mostCurrent.activityBA,(Object)(news.mostCurrent._ulvnews.getField(true,"STYLE_DEFAULT")));
 BA.debugLineNum = 95;BA.debugLine="ulvnews.Color=Colors.Transparent";
Debug.ShouldStop(1073741824);
news.mostCurrent._ulvnews.runVoidMethod ("setColor",news.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 };
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ulvnews_itemclick(RemoteObject _itemid,RemoteObject _position,RemoteObject _clickedpanel) throws Exception{
try {
		Debug.PushSubsStack("ulvnews_ItemClick (news) ","news",5,news.mostCurrent.activityBA,news.mostCurrent,99);
if (RapidSub.canDelegate("ulvnews_itemclick")) { return ir.cyber.saralahzn.news.remoteMe.runUserSub(false, "news","ulvnews_itemclick", _itemid, _position, _clickedpanel);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("ItemID", _itemid);
Debug.locals.put("Position", _position);
Debug.locals.put("ClickedPanel", _clickedpanel);
 BA.debugLineNum = 99;BA.debugLine="Sub ulvnews_ItemClick(ItemID As Long, Position As";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Log(cur1.GetString(\"body\"))";
Debug.ShouldStop(8);
news.mostCurrent.__c.runVoidMethod ("LogImpl","64259841",news._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("body"))),0);
 BA.debugLineNum = 101;BA.debugLine="Dim m As Map=CreateMap(\"title\":cur1.GetString(\"ti";
Debug.ShouldStop(16);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = news.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),(news._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("pic_url")),(news._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("pic_url")))),RemoteObject.createImmutable(("body")),(news._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("body"))))}));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 102;BA.debugLine="news_view.m=m";
Debug.ShouldStop(32);
news.mostCurrent._news_view._m /*RemoteObject*/  = _m;
 BA.debugLineNum = 103;BA.debugLine="StartActivity(news_view)";
Debug.ShouldStop(64);
news.mostCurrent.__c.runVoidMethod ("StartActivity",news.processBA,(Object)((news.mostCurrent._news_view.getObject())));
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ulvnews_layoutcreator(RemoteObject _layoutname,RemoteObject _layoutpanel) throws Exception{
try {
		Debug.PushSubsStack("ulvnews_LayoutCreator (news) ","news",5,news.mostCurrent.activityBA,news.mostCurrent,71);
if (RapidSub.canDelegate("ulvnews_layoutcreator")) { return ir.cyber.saralahzn.news.remoteMe.runUserSub(false, "news","ulvnews_layoutcreator", _layoutname, _layoutpanel);}
Debug.locals.put("LayoutName", _layoutname);
Debug.locals.put("LayoutPanel", _layoutpanel);
 BA.debugLineNum = 71;BA.debugLine="Sub ulvnews_LayoutCreator(LayoutName As String, La";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="LayoutPanel.LoadLayout(\"news_lay\")";
Debug.ShouldStop(128);
_layoutpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("news_lay")),news.mostCurrent.activityBA);
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