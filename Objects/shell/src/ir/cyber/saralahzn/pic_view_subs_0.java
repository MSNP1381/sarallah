package ir.cyber.saralahzn;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pic_view_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (pic_view) ","pic_view",9,pic_view.mostCurrent.activityBA,pic_view.mostCurrent,25);
if (RapidSub.canDelegate("activity_create")) { return ir.cyber.saralahzn.pic_view.remoteMe.runUserSub(false, "pic_view","activity_create", _firsttime);}
int _i = 0;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 28;BA.debugLine="c.Initialize(\"c\")";
Debug.ShouldStop(134217728);
pic_view.mostCurrent._c.runVoidMethod ("Initialize",pic_view.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("c")));
 BA.debugLineNum = 29;BA.debugLine="c.NumColumns=4";
Debug.ShouldStop(268435456);
pic_view.mostCurrent._c.runMethod(true,"setNumColumns",BA.numberCast(int.class, 4));
 BA.debugLineNum = 30;BA.debugLine="For i= 1 To 16";
Debug.ShouldStop(536870912);
{
final int step3 = 1;
final int limit3 = 16;
_i = 1 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 32;BA.debugLine="c.AddImage(File.DirRootExternal,\" (\"&i&\").jpg\")";
Debug.ShouldStop(-2147483648);
pic_view.mostCurrent._c.runVoidMethod ("AddImage",(Object)(pic_view.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirRootExternal")),(Object)(RemoteObject.concat(RemoteObject.createImmutable(" ("),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(").jpg"))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 34;BA.debugLine="Activity.AddView(c,0,0,-1,-1)";
Debug.ShouldStop(2);
pic_view.mostCurrent._activity.runVoidMethod ("AddView",(Object)((pic_view.mostCurrent._c.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (pic_view) ","pic_view",9,pic_view.mostCurrent.activityBA,pic_view.mostCurrent,41);
if (RapidSub.canDelegate("activity_pause")) { return ir.cyber.saralahzn.pic_view.remoteMe.runUserSub(false, "pic_view","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Resume (pic_view) ","pic_view",9,pic_view.mostCurrent.activityBA,pic_view.mostCurrent,37);
if (RapidSub.canDelegate("activity_resume")) { return ir.cyber.saralahzn.pic_view.remoteMe.runUserSub(false, "pic_view","activity_resume");}
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _c_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("c_ItemClick (pic_view) ","pic_view",9,pic_view.mostCurrent.activityBA,pic_view.mostCurrent,44);
if (RapidSub.canDelegate("c_itemclick")) { return ir.cyber.saralahzn.pic_view.remoteMe.runUserSub(false, "pic_view","c_itemclick", _position, _value);}
RemoteObject _x = RemoteObject.createImmutable(0f);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 44;BA.debugLine="Sub c_ItemClick(Position As Int, Value As Object)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Activity.LoadLayout(\"pic_ciew_sample\")";
Debug.ShouldStop(4096);
pic_view.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("pic_ciew_sample")),pic_view.mostCurrent.activityBA);
 BA.debugLineNum = 46;BA.debugLine="b=Value";
Debug.ShouldStop(8192);
pic_view.mostCurrent._b.setObject(_value);
 BA.debugLineNum = 47;BA.debugLine="Dim x As Float =b.Width/b.Height";
Debug.ShouldStop(16384);
_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {pic_view.mostCurrent._b.runMethod(true,"getWidth"),pic_view.mostCurrent._b.runMethod(true,"getHeight")}, "/",0, 0));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 48;BA.debugLine="pos=Position";
Debug.ShouldStop(32768);
pic_view._pos = _position;
 BA.debugLineNum = 49;BA.debugLine="iv_core.Height=iv_core.Width/x";
Debug.ShouldStop(65536);
pic_view.mostCurrent._iv_core.runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {pic_view.mostCurrent._iv_core.runMethod(true,"getWidth"),_x}, "/",0, 0)));
 BA.debugLineNum = 50;BA.debugLine="iv_core.Top=50%y-iv_core.Height/2";
Debug.ShouldStop(131072);
pic_view.mostCurrent._iv_core.runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {pic_view.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),pic_view.mostCurrent.activityBA),pic_view.mostCurrent._iv_core.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 51;BA.debugLine="iv_core.Bitmap=b";
Debug.ShouldStop(262144);
pic_view.mostCurrent._iv_core.runMethod(false,"setBitmap",(pic_view.mostCurrent._b.getObject()));
 BA.debugLineNum = 52;BA.debugLine="iv_core.SetVisibleAnimated(300,True)";
Debug.ShouldStop(524288);
pic_view.mostCurrent._iv_core.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(pic_view.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Dim c As PhotoGridView";
pic_view.mostCurrent._c = RemoteObject.createNew ("it.giuseppe.salvi.gridview.library.core.GridViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private ImageView1 As ImageView";
pic_view.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private iv_core As ImageView";
pic_view.mostCurrent._iv_core = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private lbl_save As Label";
pic_view.mostCurrent._lbl_save = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private lbl_share As Label";
pic_view.mostCurrent._lbl_share = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Panel1 As Panel";
pic_view.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim b As Bitmap";
pic_view.mostCurrent._b = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim pos As Int";
pic_view._pos = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lbl_back_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_back_Click (pic_view) ","pic_view",9,pic_view.mostCurrent.activityBA,pic_view.mostCurrent,79);
if (RapidSub.canDelegate("lbl_back_click")) { return ir.cyber.saralahzn.pic_view.remoteMe.runUserSub(false, "pic_view","lbl_back_click");}
 BA.debugLineNum = 79;BA.debugLine="Sub lbl_back_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="Panel1.RemoveView";
Debug.ShouldStop(32768);
pic_view.mostCurrent._panel1.runVoidMethod ("RemoveView");
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_save_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_save_Click (pic_view) ","pic_view",9,pic_view.mostCurrent.activityBA,pic_view.mostCurrent,59);
if (RapidSub.canDelegate("lbl_save_click")) { return ir.cyber.saralahzn.pic_view.remoteMe.runUserSub(false, "pic_view","lbl_save_click");}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
 BA.debugLineNum = 59;BA.debugLine="Sub lbl_save_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 65;BA.debugLine="Dim Out As OutputStream";
Debug.ShouldStop(1);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("Out", _out);
 BA.debugLineNum = 66;BA.debugLine="Out = File.OpenOutput(File.DirRootExternal&\"/Sara";
Debug.ShouldStop(2);
_out = pic_view.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(RemoteObject.concat(pic_view.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirRootExternal"),RemoteObject.createImmutable("/SaralahCyber"))),(Object)(RemoteObject.concat(pic_view._pos,RemoteObject.createImmutable(".png"))),(Object)(pic_view.mostCurrent.__c.getField(true,"True")));Debug.locals.put("Out", _out);
 BA.debugLineNum = 67;BA.debugLine="b.WriteToStream(Out, 100, \"PNG\")";
Debug.ShouldStop(4);
pic_view.mostCurrent._b.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("PNG"))));
 BA.debugLineNum = 68;BA.debugLine="Out.Close";
Debug.ShouldStop(8);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 69;BA.debugLine="ToastMessageShow(\"باموفقیت ذخیره شد .\",False)";
Debug.ShouldStop(16);
pic_view.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("باموفقیت ذخیره شد .")),(Object)(pic_view.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 70;BA.debugLine="c.SetBorderColor=Colors.White";
Debug.ShouldStop(32);
pic_view.mostCurrent._c.runVoidMethod ("setSetBorderColor",pic_view.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 71;BA.debugLine="c.VerticalSpacing=2dip";
Debug.ShouldStop(64);
pic_view.mostCurrent._c.runVoidMethod ("setVerticalSpacing",pic_view.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_share_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_share_Click (pic_view) ","pic_view",9,pic_view.mostCurrent.activityBA,pic_view.mostCurrent,74);
if (RapidSub.canDelegate("lbl_share_click")) { return ir.cyber.saralahzn.pic_view.remoteMe.runUserSub(false, "pic_view","lbl_share_click");}
RemoteObject _aria = RemoteObject.declareNull("anywheresoftware.b4a.ariagplib.ARIAlib");
 BA.debugLineNum = 74;BA.debugLine="Sub lbl_share_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="Dim Aria As AriaLib";
Debug.ShouldStop(1024);
_aria = RemoteObject.createNew ("anywheresoftware.b4a.ariagplib.ARIAlib");Debug.locals.put("Aria", _aria);
 BA.debugLineNum = 76;BA.debugLine="StartActivity(Aria.SharePic(\"\",	c.GetItem(pos),\"گ";
Debug.ShouldStop(2048);
pic_view.mostCurrent.__c.runVoidMethod ("StartActivity",pic_view.processBA,(Object)((_aria.runMethod(false,"SharePic",(Object)(BA.ObjectToString("")),(Object)(pic_view.mostCurrent._c.runMethod(true,"GetItem",(Object)(pic_view._pos))),(Object)(RemoteObject.createImmutable("گیرنده را انتخاب کنید"))))));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel1_click() throws Exception{
try {
		Debug.PushSubsStack("Panel1_Click (pic_view) ","pic_view",9,pic_view.mostCurrent.activityBA,pic_view.mostCurrent,55);
if (RapidSub.canDelegate("panel1_click")) { return ir.cyber.saralahzn.pic_view.remoteMe.runUserSub(false, "pic_view","panel1_click");}
 BA.debugLineNum = 55;BA.debugLine="Sub Panel1_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="lbl_back_Click";
Debug.ShouldStop(8388608);
_lbl_back_click();
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}