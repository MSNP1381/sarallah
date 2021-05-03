package ir.cyber.saralahzn.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_news_lay{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("label2").vw.setWidth((int)((17d / 100 * height)));
views.get("label2").vw.setHeight((int)((views.get("label2").vw.getWidth())));
views.get("label2").vw.setLeft((int)((100d / 100 * width) - (views.get("label2").vw.getWidth())));
views.get("lbltitle").vw.setLeft((int)(0d));
views.get("lbltitle").vw.setWidth((int)((views.get("label2").vw.getLeft()) - (0d)));
views.get("lbltitle").vw.setHeight((int)((17d / 100 * height)));
views.get("iv_div1").vw.setTop((int)((views.get("lbltitle").vw.getTop() + views.get("lbltitle").vw.getHeight())));
views.get("lblbody").vw.setTop((int)((views.get("iv_div1").vw.getTop() + views.get("iv_div1").vw.getHeight())));
views.get("lblbody").vw.setHeight((int)((48d / 100 * height) - ((views.get("iv_div1").vw.getTop() + views.get("iv_div1").vw.getHeight()))));
views.get("imageview1").vw.setTop((int)((views.get("lblbody").vw.getTop() + views.get("lblbody").vw.getHeight())));
views.get("imageview1").vw.setHeight((int)((85d / 100 * height) - ((views.get("lblbody").vw.getTop() + views.get("lblbody").vw.getHeight()))));
views.get("iv_div2").vw.setTop((int)((views.get("imageview1").vw.getTop() + views.get("imageview1").vw.getHeight())));
//BA.debugLineNum = 16;BA.debugLine="lblTime.SetTopAndBottom(iv_div2.Bottom,Panel1.Bottom)"[news_lay/General script]
views.get("lbltime").vw.setTop((int)((views.get("iv_div2").vw.getTop() + views.get("iv_div2").vw.getHeight())));
views.get("lbltime").vw.setHeight((int)((views.get("panel1").vw.getTop() + views.get("panel1").vw.getHeight()) - ((views.get("iv_div2").vw.getTop() + views.get("iv_div2").vw.getHeight()))));
//BA.debugLineNum = 17;BA.debugLine="lblTime.SetLeftAndRight(5,60%x)"[news_lay/General script]
views.get("lbltime").vw.setLeft((int)(5d));
views.get("lbltime").vw.setWidth((int)((60d / 100 * width) - (5d)));

}
}