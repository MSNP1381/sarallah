package ir.cyber.saralahzn.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_madah{

public static void LS_320x480_1(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("acspinnerday").vw.setTop((int)((2d / 100 * height)));
views.get("acspinnerday").vw.setLeft((int)((3.6d / 100 * width)));
views.get("acspinnerday").vw.setWidth((int)((30d / 100 * width) - ((3.6d / 100 * width))));
views.get("acspinnerstyle").vw.setWidth((int)((views.get("acspinnerday").vw.getWidth())));
views.get("acspinnerstyle").vw.setLeft((int)((100d / 100 * width)-(views.get("acspinnerday").vw.getLeft()) - (views.get("acspinnerstyle").vw.getWidth())));
views.get("acspinnerday").vw.setWidth((int)((views.get("acspinnerstyle").vw.getWidth())));
views.get("acspinnerstyle").vw.setTop((int)((views.get("acspinnerday").vw.getTop())));
views.get("panel1").vw.setTop((int)((17d / 100 * height)));
views.get("panel1").vw.setHeight((int)((100d / 100 * height)-(5d * scale) - ((17d / 100 * height))));

}
public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("acspinnerstyle").vw.setWidth((int)(Math.max((30d / 100 * width),(150d * scale))));
views.get("acspinnerday").vw.setWidth((int)((views.get("acspinnerstyle").vw.getWidth())));
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panel1").vw.setLeft((int)((3.5d / 100 * width)));
views.get("panel1").vw.setWidth((int)((96.5d / 100 * width) - ((3.5d / 100 * width))));
views.get("panel1").vw.setTop((int)((11d / 100 * height)));
views.get("panel1").vw.setHeight((int)((98d / 100 * height)-(5d * scale) - ((11d / 100 * height))));

}
}