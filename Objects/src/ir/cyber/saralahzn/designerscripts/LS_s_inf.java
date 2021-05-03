package ir.cyber.saralahzn.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_s_inf{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("imageview1").vw.setLeft((int)((50d / 100 * width) - (views.get("imageview1").vw.getWidth() / 2)));
views.get("button1").vw.setLeft((int)((50d / 100 * width) - (views.get("button1").vw.getWidth() / 2)));
views.get("lbl_link").vw.setLeft((int)((50d / 100 * width) - (views.get("lbl_link").vw.getWidth() / 2)));
views.get("lbl_insta").vw.setLeft((int)((50d / 100 * width) - (views.get("lbl_insta").vw.getWidth() / 2)));
views.get("about_us").vw.setLeft((int)((50d / 100 * width) - (views.get("about_us").vw.getWidth() / 2)));

}
}