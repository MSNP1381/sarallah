package ir.cyber.saralahzn.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_showlistbox{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("boxlbl").vw.setTop((int)((50d / 100 * height) - (views.get("boxlbl").vw.getHeight() / 2)));
views.get("button1").vw.setLeft((int)(0d));
views.get("button1").vw.setWidth((int)((37d / 100 * width) - (0d)));
views.get("boxlbl").vw.setLeft((int)((50d / 100 * width)));
views.get("boxlbl").vw.setWidth((int)((100d / 100 * width) - ((50d / 100 * width))));

}
}