package ir.cyber.saralahzn.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_blur_lay{

public static void LS_320x480_1(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("pnl_circle").vw.setHeight((int)((30d / 100 * width)));
views.get("pnl_circle").vw.setWidth((int)((views.get("pnl_circle").vw.getHeight())));
views.get("pnl_circle").vw.setLeft((int)((50d / 100 * width) - (views.get("pnl_circle").vw.getWidth() / 2)));
views.get("pnl_circle").vw.setTop((int)((50d / 100 * height) - (views.get("pnl_circle").vw.getHeight() / 2)));

}
public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);

}
}