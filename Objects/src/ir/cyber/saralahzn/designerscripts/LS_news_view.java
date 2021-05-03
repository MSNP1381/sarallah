package ir.cyber.saralahzn.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_news_view{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("iv_original").vw.setHeight((int)((views.get("iv_original").vw.getWidth())/1.7d));
views.get("scrollview1").vw.setTop((int)((views.get("iv_original").vw.getTop() + views.get("iv_original").vw.getHeight())));
views.get("scrollview1").vw.setHeight((int)((100d / 100 * height) - ((views.get("iv_original").vw.getTop() + views.get("iv_original").vw.getHeight()))));
views.get("label1").vw.setHeight((int)(Math.max((6d / 100 * height),(40d * scale))));

}
}