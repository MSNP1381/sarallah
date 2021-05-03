package ir.cyber.saralahzn.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_news_load_lay{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panel1").vw.setTop((int)((10d / 100 * height)));
views.get("panel1").vw.setHeight((int)((98d / 100 * height)-(5d * scale) - ((10d / 100 * height))));
views.get("panel1").vw.setLeft((int)((3d / 100 * width)));
views.get("panel1").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));

}
}