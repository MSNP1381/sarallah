package ir.cyber.saralahzn.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_video_play1{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("ultimatelistview1").vw.setLeft((int)((80d / 100 * width)));
views.get("ultimatelistview1").vw.setWidth((int)((100d / 100 * width) - ((80d / 100 * width))));
views.get("panel2").vw.setWidth((int)((views.get("ultimatelistview1").vw.getWidth())));
views.get("panel2").vw.setLeft((int)((100d / 100 * width) - (views.get("panel2").vw.getWidth())));
views.get("panel3").vw.setLeft((int)(0d));
views.get("panel3").vw.setWidth((int)((views.get("panel2").vw.getLeft()) - (0d)));
views.get("panel1").vw.setLeft((int)(0d));
views.get("panel1").vw.setWidth((int)((views.get("panel2").vw.getLeft()) - (0d)));
views.get("seekbar1").vw.setLeft((int)((views.get("lbl_time").vw.getLeft() + views.get("lbl_time").vw.getWidth())+8d));
views.get("seekbar1").vw.setWidth((int)((views.get("panel3").vw.getLeft() + views.get("panel3").vw.getWidth())-(45d * scale) - ((views.get("lbl_time").vw.getLeft() + views.get("lbl_time").vw.getWidth())+8d)));
views.get("label2").vw.setLeft((int)((views.get("panel1").vw.getLeft() + views.get("panel1").vw.getWidth())-(8d * scale) - (views.get("label2").vw.getWidth())));
((anywheresoftware.b4a.keywords.LayoutBuilder.DesignerTextSizeMethod)views.get("label2").vw).setTextSize((float)((2d / 100 * width)));
views.get("btn_down").vw.setLeft((int)((views.get("panel2").vw.getLeft())+(views.get("panel2").vw.getWidth())*.25d - (views.get("btn_down").vw.getWidth() / 2)));
views.get("btn_share").vw.setLeft((int)((views.get("panel2").vw.getLeft())+(views.get("panel2").vw.getWidth())*.75d - (views.get("btn_share").vw.getWidth() / 2)));
views.get("f_screen").vw.setLeft((int)((views.get("panel3").vw.getLeft() + views.get("panel3").vw.getWidth())-(40d * scale)));
//BA.debugLineNum = 17;BA.debugLine="btn_down.VerticalCenter=dwnpnl.Height/2"[video_play1/General script]
views.get("btn_down").vw.setTop((int)((views.get("dwnpnl").vw.getHeight())/2d - (views.get("btn_down").vw.getHeight() / 2)));
//BA.debugLineNum = 18;BA.debugLine="btn_share.VerticalCenter=dwnpnl.Height/2"[video_play1/General script]
views.get("btn_share").vw.setTop((int)((views.get("dwnpnl").vw.getHeight())/2d - (views.get("btn_share").vw.getHeight() / 2)));
//BA.debugLineNum = 19;BA.debugLine="f_screen.TextSize=2%x"[video_play1/General script]
((anywheresoftware.b4a.keywords.LayoutBuilder.DesignerTextSizeMethod)views.get("f_screen").vw).setTextSize((float)((2d / 100 * width)));
//BA.debugLineNum = 20;BA.debugLine="iv_play.VerticalCenter=Panel3.Height/2"[video_play1/General script]
views.get("iv_play").vw.setTop((int)((views.get("panel3").vw.getHeight())/2d - (views.get("iv_play").vw.getHeight() / 2)));
//BA.debugLineNum = 22;BA.debugLine="dwnpnl.SetLeftAndRight(0,Panel1.Right)"[video_play1/General script]
views.get("dwnpnl").vw.setLeft((int)(0d));
views.get("dwnpnl").vw.setWidth((int)((views.get("panel1").vw.getLeft() + views.get("panel1").vw.getWidth()) - (0d)));
//BA.debugLineNum = 23;BA.debugLine="dwnpnl.SetTopAndBottom(0,Label2.Bottom+8)"[video_play1/General script]
views.get("dwnpnl").vw.setTop((int)(0d));
views.get("dwnpnl").vw.setHeight((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())+8d - (0d)));
//BA.debugLineNum = 25;BA.debugLine="lblname.SetLeftAndRight(0,Panel1.Right)"[video_play1/General script]
views.get("lblname").vw.setLeft((int)(0d));
views.get("lblname").vw.setWidth((int)((views.get("panel1").vw.getLeft() + views.get("panel1").vw.getWidth()) - (0d)));
//BA.debugLineNum = 26;BA.debugLine="UltimateListView1.Right=100%X"[video_play1/General script]
views.get("ultimatelistview1").vw.setLeft((int)((100d / 100 * width) - (views.get("ultimatelistview1").vw.getWidth())));
//BA.debugLineNum = 28;BA.debugLine="MaterialCircleProgress1.VerticalCenter=Panel1.Height/2"[video_play1/General script]
views.get("materialcircleprogress1").vw.setTop((int)((views.get("panel1").vw.getHeight())/2d - (views.get("materialcircleprogress1").vw.getHeight() / 2)));
//BA.debugLineNum = 29;BA.debugLine="MaterialCircleProgress1.HorizontalCenter=Panel1.Width/2"[video_play1/General script]
views.get("materialcircleprogress1").vw.setLeft((int)((views.get("panel1").vw.getWidth())/2d - (views.get("materialcircleprogress1").vw.getWidth() / 2)));
//BA.debugLineNum = 30;BA.debugLine="AutoScaleRate(0.4)"[video_play1/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.4d);

}
}