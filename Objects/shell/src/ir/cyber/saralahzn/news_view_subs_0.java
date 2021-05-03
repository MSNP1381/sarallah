package ir.cyber.saralahzn;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class news_view_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (news_view) ","news_view",6,news_view.mostCurrent.activityBA,news_view.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) { return ir.cyber.saralahzn.news_view.remoteMe.runUserSub(false, "news_view","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"news_view\")";
Debug.ShouldStop(1);
news_view.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("news_view")),news_view.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="ScrollView1.Panel.LoadLayout(\"scrol_lay_news\")";
Debug.ShouldStop(2);
news_view.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("scrol_lay_news")),news_view.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="l.Text=m.Get(\"body\")";
Debug.ShouldStop(4);
news_view.mostCurrent._l.runMethod(true,"setText",BA.ObjectToCharSequence(news_view._m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("body"))))));
 BA.debugLineNum = 36;BA.debugLine="g.Load(m.Get(\"pic_url\")).AsBitmap.FitCenter.IntoI";
Debug.ShouldStop(8);
news_view.mostCurrent._g.runMethod(false,"Load",(Object)(news_view._m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pic_url")))))).runMethod(false,"AsBitmap").runMethod(false,"FitCenter").runVoidMethod ("IntoImageView",(Object)(news_view.mostCurrent._iv_original));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Pause (news_view) ","news_view",6,news_view.mostCurrent.activityBA,news_view.mostCurrent,43);
if (RapidSub.canDelegate("activity_pause")) { return ir.cyber.saralahzn.news_view.remoteMe.runUserSub(false, "news_view","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Activity_Resume (news_view) ","news_view",6,news_view.mostCurrent.activityBA,news_view.mostCurrent,39);
if (RapidSub.canDelegate("activity_resume")) { return ir.cyber.saralahzn.news_view.remoteMe.runUserSub(false, "news_view","activity_resume");}
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
 //BA.debugLineNum = 16;BA.debugLine="Private l As Label";
news_view.mostCurrent._l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ImageView1 As ImageView";
news_view.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Label1 As Label";
news_view.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ScrollView1 As ScrollView";
news_view.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim g As AriaGlide";
news_view.mostCurrent._g = RemoteObject.createNew ("ariagp.amin.shahedi.AriaGlideWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private iv_core As ImageView";
news_view.mostCurrent._iv_core = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private lbl_back As Label";
news_view.mostCurrent._lbl_back = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private lbl_save As Label";
news_view.mostCurrent._lbl_save = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lbl_share As Label";
news_view.mostCurrent._lbl_share = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Panel1 As Panel";
news_view.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim b As Bitmap";
news_view.mostCurrent._b = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private iv_original As ImageView";
news_view.mostCurrent._iv_original = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _iv_original_click() throws Exception{
try {
		Debug.PushSubsStack("iv_original_Click (news_view) ","news_view",6,news_view.mostCurrent.activityBA,news_view.mostCurrent,52);
if (RapidSub.canDelegate("iv_original_click")) { return ir.cyber.saralahzn.news_view.remoteMe.runUserSub(false, "news_view","iv_original_click");}
RemoteObject _x = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 52;BA.debugLine="Sub iv_original_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Activity.LoadLayout(\"pic_ciew_sample\")";
Debug.ShouldStop(1048576);
news_view.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("pic_ciew_sample")),news_view.mostCurrent.activityBA);
 BA.debugLineNum = 54;BA.debugLine="b=iv_original.Bitmap";
Debug.ShouldStop(2097152);
news_view.mostCurrent._b.setObject(news_view.mostCurrent._iv_original.runMethod(false,"getBitmap"));
 BA.debugLineNum = 55;BA.debugLine="Dim x As Float =b.Width/b.Height";
Debug.ShouldStop(4194304);
_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {news_view.mostCurrent._b.runMethod(true,"getWidth"),news_view.mostCurrent._b.runMethod(true,"getHeight")}, "/",0, 0));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 56;BA.debugLine="iv_core.Height=iv_core.Width/x";
Debug.ShouldStop(8388608);
news_view.mostCurrent._iv_core.runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {news_view.mostCurrent._iv_core.runMethod(true,"getWidth"),_x}, "/",0, 0)));
 BA.debugLineNum = 57;BA.debugLine="iv_core.Top=50%y-iv_core.Height/2";
Debug.ShouldStop(16777216);
news_view.mostCurrent._iv_core.runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {news_view.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),news_view.mostCurrent.activityBA),news_view.mostCurrent._iv_core.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 58;BA.debugLine="iv_core.Bitmap=b";
Debug.ShouldStop(33554432);
news_view.mostCurrent._iv_core.runMethod(false,"setBitmap",(news_view.mostCurrent._b.getObject()));
 BA.debugLineNum = 59;BA.debugLine="iv_core.SetVisibleAnimated(300,True)";
Debug.ShouldStop(67108864);
news_view.mostCurrent._iv_core.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(news_view.mostCurrent.__c.getField(true,"True")));
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
public static RemoteObject  _lbl_back_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_back_Click (news_view) ","news_view",6,news_view.mostCurrent.activityBA,news_view.mostCurrent,91);
if (RapidSub.canDelegate("lbl_back_click")) { return ir.cyber.saralahzn.news_view.remoteMe.runUserSub(false, "news_view","lbl_back_click");}
 BA.debugLineNum = 91;BA.debugLine="Sub lbl_back_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Panel1.RemoveView";
Debug.ShouldStop(134217728);
news_view.mostCurrent._panel1.runVoidMethod ("RemoveView");
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_back1_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_back1_Click (news_view) ","news_view",6,news_view.mostCurrent.activityBA,news_view.mostCurrent,95);
if (RapidSub.canDelegate("lbl_back1_click")) { return ir.cyber.saralahzn.news_view.remoteMe.runUserSub(false, "news_view","lbl_back1_click");}
 BA.debugLineNum = 95;BA.debugLine="Sub lbl_back1_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="Activity.Finish";
Debug.ShouldStop(-2147483648);
news_view.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _lbl_share_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_share_Click (news_view) ","news_view",6,news_view.mostCurrent.activityBA,news_view.mostCurrent,82);
if (RapidSub.canDelegate("lbl_share_click")) { return ir.cyber.saralahzn.news_view.remoteMe.runUserSub(false, "news_view","lbl_share_click");}
RemoteObject _aria = RemoteObject.declareNull("anywheresoftware.b4a.ariagplib.ARIAlib");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
 BA.debugLineNum = 82;BA.debugLine="Sub lbl_share_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="Dim Aria As AriaLib";
Debug.ShouldStop(262144);
_aria = RemoteObject.createNew ("anywheresoftware.b4a.ariagplib.ARIAlib");Debug.locals.put("Aria", _aria);
 BA.debugLineNum = 84;BA.debugLine="Dim Out As OutputStream";
Debug.ShouldStop(524288);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("Out", _out);
 BA.debugLineNum = 85;BA.debugLine="Out = File.OpenOutput(File.DirInternal, \"Test.png";
Debug.ShouldStop(1048576);
_out = news_view.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(news_view.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("Test.png")),(Object)(news_view.mostCurrent.__c.getField(true,"False")));Debug.locals.put("Out", _out);
 BA.debugLineNum = 86;BA.debugLine="b.WriteToStream(Out, 100, \"PNG\")";
Debug.ShouldStop(2097152);
news_view.mostCurrent._b.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("PNG"))));
 BA.debugLineNum = 87;BA.debugLine="Out.Close";
Debug.ShouldStop(4194304);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 88;BA.debugLine="StartActivity(Aria.SharePic(File.DirInternal, \"Te";
Debug.ShouldStop(8388608);
news_view.mostCurrent.__c.runVoidMethod ("StartActivity",news_view.processBA,(Object)((_aria.runMethod(false,"SharePic",(Object)(news_view.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("Test.png")),(Object)(RemoteObject.createImmutable("گیرنده را انتخاب کنید"))))));
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Panel1_Click (news_view) ","news_view",6,news_view.mostCurrent.activityBA,news_view.mostCurrent,62);
if (RapidSub.canDelegate("panel1_click")) { return ir.cyber.saralahzn.news_view.remoteMe.runUserSub(false, "news_view","panel1_click");}
 BA.debugLineNum = 62;BA.debugLine="Sub Panel1_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="lbl_back_Click";
Debug.ShouldStop(1073741824);
_lbl_back_click();
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
news_view._m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _scrollview1_scrollchanged(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ScrollView1_ScrollChanged (news_view) ","news_view",6,news_view.mostCurrent.activityBA,news_view.mostCurrent,48);
if (RapidSub.canDelegate("scrollview1_scrollchanged")) { return ir.cyber.saralahzn.news_view.remoteMe.runUserSub(false, "news_view","scrollview1_scrollchanged", _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 48;BA.debugLine="Sub ScrollView1_ScrollChanged(Position As Int)";
Debug.ShouldStop(32768);
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
}