package ir.cyber.saralahzn;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class newmain_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (newmain) ","newmain",1,newmain.mostCurrent.activityBA,newmain.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) { return ir.cyber.saralahzn.newmain.remoteMe.runUserSub(false, "newmain","activity_create", _firsttime);}
int _i = 0;
RemoteObject _d = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 28;BA.debugLine="Activity.LoadLayout(\"main\")";
Debug.ShouldStop(134217728);
newmain.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main")),newmain.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="File.Copy(File.DirAssets,\"saralah.db\",File.DirInt";
Debug.ShouldStop(1073741824);
newmain.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(newmain.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("saralah.db")),(Object)(newmain.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("saralah.db")));
 BA.debugLineNum = 33;BA.debugLine="sql.Initialize(File.DirInternal,\"saralah.db\",Fals";
Debug.ShouldStop(1);
newmain._sql.runVoidMethod ("Initialize",(Object)(newmain.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("saralah.db")),(Object)(newmain.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 34;BA.debugLine="cur1=sql.ExecQuery(\"SELECT * from home_menu\")";
Debug.ShouldStop(2);
newmain._cur1.setObject(newmain._sql.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * from home_menu"))));
 BA.debugLineNum = 35;BA.debugLine="ulv.Initialize(000,0,0,\"ulv\")";
Debug.ShouldStop(4);
newmain.mostCurrent._ulv.runVoidMethod ("Initialize",newmain.mostCurrent.activityBA,(Object)(BA.numberCast(byte.class, 000)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.NumberToString(0)),(Object)(RemoteObject.createImmutable("ulv")));
 BA.debugLineNum = 36;BA.debugLine="Panel1.AddView(ulv,0,0,-1,-1)";
Debug.ShouldStop(8);
newmain.mostCurrent._panel1.runVoidMethod ("AddView",(Object)((newmain.mostCurrent._ulv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 BA.debugLineNum = 40;BA.debugLine="ulv.AddLayout(\"layout1\",\"ulv_LayoutCreator\",\"ulv_";
Debug.ShouldStop(128);
newmain.mostCurrent._ulv.runVoidMethod ("AddLayout",(Object)(BA.ObjectToString("layout1")),(Object)(BA.ObjectToString("ulv_LayoutCreator")),(Object)(BA.ObjectToString("ulv_ContentFiller")),(Object)(newmain.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(newmain.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 43;BA.debugLine="For i=0 To cur1.RowCount-1";
Debug.ShouldStop(1024);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {newmain._cur1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 44;BA.debugLine="ulv.AddItem(\"layout1\",i)";
Debug.ShouldStop(2048);
newmain.mostCurrent._ulv.runVoidMethod ("AddItem",(Object)(BA.ObjectToString("layout1")),(Object)(BA.numberCast(long.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 46;BA.debugLine="Dim d As ColorDrawable";
Debug.ShouldStop(8192);
_d = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("d", _d);
 BA.debugLineNum = 47;BA.debugLine="d.Initialize(Colors.Transparent,-1)";
Debug.ShouldStop(16384);
_d.runVoidMethod ("Initialize",(Object)(newmain.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 BA.debugLineNum = 48;BA.debugLine="ulv.DividerDrawable=d";
Debug.ShouldStop(32768);
newmain.mostCurrent._ulv.runMethod(false,"setDividerDrawable",(_d.getObject()));
 BA.debugLineNum = 49;BA.debugLine="ulv.DividerHeight=20dip";
Debug.ShouldStop(65536);
newmain.mostCurrent._ulv.runMethod(true,"setDividerHeight",newmain.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Activity_Pause (newmain) ","newmain",1,newmain.mostCurrent.activityBA,newmain.mostCurrent,102);
if (RapidSub.canDelegate("activity_pause")) { return ir.cyber.saralahzn.newmain.remoteMe.runUserSub(false, "newmain","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 102;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (newmain) ","newmain",1,newmain.mostCurrent.activityBA,newmain.mostCurrent,98);
if (RapidSub.canDelegate("activity_resume")) { return ir.cyber.saralahzn.newmain.remoteMe.runUserSub(false, "newmain","activity_resume");}
 BA.debugLineNum = 98;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Dim ulv As UltimateListView";
newmain.mostCurrent._ulv = RemoteObject.createNew ("flm.b4a.ultimatelistview.UltimateListViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Panel1 As Panel";
newmain.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imginfo_click() throws Exception{
try {
		Debug.PushSubsStack("imginfo_Click (newmain) ","newmain",1,newmain.mostCurrent.activityBA,newmain.mostCurrent,107);
if (RapidSub.canDelegate("imginfo_click")) { return ir.cyber.saralahzn.newmain.remoteMe.runUserSub(false, "newmain","imginfo_click");}
 BA.debugLineNum = 107;BA.debugLine="Sub imginfo_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="StartActivity(infomodule)";
Debug.ShouldStop(2048);
newmain.mostCurrent.__c.runVoidMethod ("StartActivity",newmain.processBA,(Object)((newmain.mostCurrent._infomodule.getObject())));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _iv_insta_click() throws Exception{
try {
		Debug.PushSubsStack("iv_insta_Click (newmain) ","newmain",1,newmain.mostCurrent.activityBA,newmain.mostCurrent,117);
if (RapidSub.canDelegate("iv_insta_click")) { return ir.cyber.saralahzn.newmain.remoteMe.runUserSub(false, "newmain","iv_insta_click");}
RemoteObject _i2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 117;BA.debugLine="Sub iv_insta_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="Dim i2 As Intent";
Debug.ShouldStop(2097152);
_i2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i2", _i2);
 BA.debugLineNum = 119;BA.debugLine="i2.Initialize(i2.ACTION_VIEW,\"http://instagram.co";
Debug.ShouldStop(4194304);
_i2.runVoidMethod ("Initialize",(Object)(_i2.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.createImmutable("http://instagram.com/sarallah_zn.ir")));
 BA.debugLineNum = 120;BA.debugLine="StartActivity (i2)";
Debug.ShouldStop(8388608);
newmain.mostCurrent.__c.runVoidMethod ("StartActivity",newmain.processBA,(Object)((_i2.getObject())));
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _iv_telegram_click() throws Exception{
try {
		Debug.PushSubsStack("iv_telegram_Click (newmain) ","newmain",1,newmain.mostCurrent.activityBA,newmain.mostCurrent,111);
if (RapidSub.canDelegate("iv_telegram_click")) { return ir.cyber.saralahzn.newmain.remoteMe.runUserSub(false, "newmain","iv_telegram_click");}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 111;BA.debugLine="Sub iv_telegram_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(32768);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 113;BA.debugLine="i.Initialize(i.ACTION_VIEW,\"http://t.me/sarallah_";
Debug.ShouldStop(65536);
_i.runVoidMethod ("Initialize",(Object)(_i.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.createImmutable("http://t.me/sarallah_zanjan")));
 BA.debugLineNum = 114;BA.debugLine="StartActivity (i)";
Debug.ShouldStop(131072);
newmain.mostCurrent.__c.runVoidMethod ("StartActivity",newmain.processBA,(Object)((_i.getObject())));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim sql As SQL";
newmain._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="Dim cur1 As Cursor";
newmain._cur1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Dim ip As String=\"http://127.0.0.1/\"";
newmain._ip = BA.ObjectToString("http://127.0.0.1/");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _ulv_contentfiller(RemoteObject _itemid,RemoteObject _layoutname,RemoteObject _layoutpanel,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ulv_ContentFiller (newmain) ","newmain",1,newmain.mostCurrent.activityBA,newmain.mostCurrent,56);
if (RapidSub.canDelegate("ulv_contentfiller")) { return ir.cyber.saralahzn.newmain.remoteMe.runUserSub(false, "newmain","ulv_contentfiller", _itemid, _layoutname, _layoutpanel, _position);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl_tite = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl_subtitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("ItemID", _itemid);
Debug.locals.put("LayoutName", _layoutname);
Debug.locals.put("LayoutPanel", _layoutpanel);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 56;BA.debugLine="Sub ulv_ContentFiller(ItemID As Long, LayoutName A";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="cur1.Position=ItemID";
Debug.ShouldStop(33554432);
newmain._cur1.runMethod(true,"setPosition",BA.numberCast(int.class, _itemid));
 BA.debugLineNum = 59;BA.debugLine="Log(LayoutPanel.NumberOfViews)";
Debug.ShouldStop(67108864);
newmain.mostCurrent.__c.runVoidMethod ("LogImpl","61245187",BA.NumberToString(_layoutpanel.runMethod(true,"getNumberOfViews")),0);
 BA.debugLineNum = 60;BA.debugLine="Dim p As Panel=LayoutPanel.GetView(0)";
Debug.ShouldStop(134217728);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p.setObject(_layoutpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 61;BA.debugLine="p.Tag=ItemID";
Debug.ShouldStop(268435456);
_p.runMethod(false,"setTag",(_itemid));
 BA.debugLineNum = 62;BA.debugLine="Dim lbl_tite As Label=p.GetView(1)";
Debug.ShouldStop(536870912);
_lbl_tite = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_tite.setObject(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("lbl_tite", _lbl_tite);
 BA.debugLineNum = 63;BA.debugLine="lbl_tite.Text=cur1.GetString(\"menu\")";
Debug.ShouldStop(1073741824);
_lbl_tite.runMethod(true,"setText",BA.ObjectToCharSequence(newmain._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("menu")))));
 BA.debugLineNum = 64;BA.debugLine="Log(lbl_tite.Text)";
Debug.ShouldStop(-2147483648);
newmain.mostCurrent.__c.runVoidMethod ("LogImpl","61245192",_lbl_tite.runMethod(true,"getText"),0);
 BA.debugLineNum = 66;BA.debugLine="Dim lbl_subtitle As Label=p.GetView(0)";
Debug.ShouldStop(2);
_lbl_subtitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl_subtitle.setObject(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl_subtitle", _lbl_subtitle);
 BA.debugLineNum = 67;BA.debugLine="Log(lbl_tite.Text)";
Debug.ShouldStop(4);
newmain.mostCurrent.__c.runVoidMethod ("LogImpl","61245195",_lbl_tite.runMethod(true,"getText"),0);
 BA.debugLineNum = 69;BA.debugLine="lbl_subtitle.Text=cur1.GetString(\"submenu\")";
Debug.ShouldStop(16);
_lbl_subtitle.runMethod(true,"setText",BA.ObjectToCharSequence(newmain._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("submenu")))));
 BA.debugLineNum = 71;BA.debugLine="Log(lbl_tite.Text)";
Debug.ShouldStop(64);
newmain.mostCurrent.__c.runVoidMethod ("LogImpl","61245199",_lbl_tite.runMethod(true,"getText"),0);
 BA.debugLineNum = 72;BA.debugLine="Dim img As ImageView=p.GetView(2)";
Debug.ShouldStop(128);
_img = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_img.setObject(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).getObject());Debug.locals.put("img", _img);
 BA.debugLineNum = 73;BA.debugLine="img.Bitmap=LoadBitmap(File.DirAssets,\"ico_maddahi";
Debug.ShouldStop(256);
_img.runMethod(false,"setBitmap",(newmain.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(newmain.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ico_maddahi.png"))).getObject()));
 BA.debugLineNum = 74;BA.debugLine="ulv.Color=Colors.Transparent";
Debug.ShouldStop(512);
newmain.mostCurrent._ulv.runVoidMethod ("setColor",newmain.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 75;BA.debugLine="LayoutPanel.Tag=cur1.GetString(\"ID\")";
Debug.ShouldStop(1024);
_layoutpanel.runMethod(false,"setTag",(newmain._cur1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ID")))));
 BA.debugLineNum = 77;BA.debugLine="If ItemID=0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_itemid,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 78;BA.debugLine="ulv.SetStyle(ulv.STYLE_HOLO_LIGHT)";
Debug.ShouldStop(8192);
newmain.mostCurrent._ulv.runVoidMethod ("SetStyle",newmain.mostCurrent.activityBA,(Object)(newmain.mostCurrent._ulv.getField(true,"STYLE_HOLO_LIGHT")));
 BA.debugLineNum = 79;BA.debugLine="ulv.Color=0x00201F1F";
Debug.ShouldStop(16384);
newmain.mostCurrent._ulv.runVoidMethod ("setColor",BA.numberCast(int.class, 0x00201f1f));
 };
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
public static RemoteObject  _ulv_itemclick(RemoteObject _itemid,RemoteObject _position,RemoteObject _clickedpanel) throws Exception{
try {
		Debug.PushSubsStack("ulv_ItemClick (newmain) ","newmain",1,newmain.mostCurrent.activityBA,newmain.mostCurrent,83);
if (RapidSub.canDelegate("ulv_itemclick")) { return ir.cyber.saralahzn.newmain.remoteMe.runUserSub(false, "newmain","ulv_itemclick", _itemid, _position, _clickedpanel);}
Debug.locals.put("ItemID", _itemid);
Debug.locals.put("Position", _position);
Debug.locals.put("ClickedPanel", _clickedpanel);
 BA.debugLineNum = 83;BA.debugLine="Sub ulv_ItemClick(ItemID As Long, Position As Int,";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Log(\"ClickedPanel\")";
Debug.ShouldStop(524288);
newmain.mostCurrent.__c.runVoidMethod ("LogImpl","61310721",RemoteObject.createImmutable("ClickedPanel"),0);
 BA.debugLineNum = 85;BA.debugLine="Select Position";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(_position,BA.numberCast(int.class, 0),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 6))) {
case 0: {
 BA.debugLineNum = 87;BA.debugLine="StartActivity(video)";
Debug.ShouldStop(4194304);
newmain.mostCurrent.__c.runVoidMethod ("StartActivity",newmain.processBA,(Object)((newmain.mostCurrent._video.getObject())));
 break; }
case 1: {
 BA.debugLineNum = 89;BA.debugLine="StartActivity(pic_view)";
Debug.ShouldStop(16777216);
newmain.mostCurrent.__c.runVoidMethod ("StartActivity",newmain.processBA,(Object)((newmain.mostCurrent._pic_view.getObject())));
 break; }
case 2: {
 BA.debugLineNum = 91;BA.debugLine="StartActivity(ashar)";
Debug.ShouldStop(67108864);
newmain.mostCurrent.__c.runVoidMethod ("StartActivity",newmain.processBA,(Object)((newmain.mostCurrent._ashar.getObject())));
 break; }
case 3: {
 BA.debugLineNum = 93;BA.debugLine="StartActivity(news)";
Debug.ShouldStop(268435456);
newmain.mostCurrent.__c.runVoidMethod ("StartActivity",newmain.processBA,(Object)((newmain.mostCurrent._news.getObject())));
 break; }
}
;
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
public static RemoteObject  _ulv_layoutcreator(RemoteObject _layoutname,RemoteObject _layoutpanel) throws Exception{
try {
		Debug.PushSubsStack("ulv_LayoutCreator (newmain) ","newmain",1,newmain.mostCurrent.activityBA,newmain.mostCurrent,53);
if (RapidSub.canDelegate("ulv_layoutcreator")) { return ir.cyber.saralahzn.newmain.remoteMe.runUserSub(false, "newmain","ulv_layoutcreator", _layoutname, _layoutpanel);}
Debug.locals.put("LayoutName", _layoutname);
Debug.locals.put("LayoutPanel", _layoutpanel);
 BA.debugLineNum = 53;BA.debugLine="Sub ulv_LayoutCreator(LayoutName As String, Layout";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="LayoutPanel.LoadLayout(\"layout1\")";
Debug.ShouldStop(2097152);
_layoutpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("layout1")),newmain.mostCurrent.activityBA);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}