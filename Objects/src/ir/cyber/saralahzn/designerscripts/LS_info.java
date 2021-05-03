package ir.cyber.saralahzn.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_info{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("imageview1").vw.setTop((int)((7d / 100 * height)));
views.get("imageview1").vw.setHeight((int)((views.get("label1").vw.getTop())-(20d * scale) - ((7d / 100 * height))));
views.get("imageview1").vw.setWidth((int)((views.get("imageview1").vw.getHeight())/1.5d));
views.get("imageview1").vw.setLeft((int)((50d / 100 * width) - (views.get("imageview1").vw.getWidth() / 2)));
views.get("button1").vw.setLeft((int)((50d / 100 * width) - (views.get("button1").vw.getWidth() / 2)));
views.get("button2").vw.setLeft((int)((50d / 100 * width) - (views.get("button2").vw.getWidth() / 2)));
views.get("siteurl").vw.setLeft((int)((50d / 100 * width) - (views.get("siteurl").vw.getWidth() / 2)));
views.get("label1").vw.setLeft((int)((50d / 100 * width) - (views.get("label1").vw.getWidth() / 2)));

}
}