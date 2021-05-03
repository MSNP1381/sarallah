package ir.cyber.saralahzn.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layout1{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("main_image").vw.setTop((int)((50d / 100 * height) - (views.get("main_image").vw.getHeight() / 2)));
views.get("main_title").vw.setTop((int)((3d / 100 * height)));
views.get("main_title").vw.setHeight((int)((48d / 100 * height) - ((3d / 100 * height))));
views.get("main_des").vw.setTop((int)((50d / 100 * height)));
views.get("main_des").vw.setHeight((int)((98d / 100 * height) - ((50d / 100 * height))));

}
}