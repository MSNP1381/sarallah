package ir.cyber.saralahzn.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_pic_ciew_sample{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("lbl_save").vw.setHeight((int)(Math.max((10d / 100 * width),(40d * scale))));
views.get("lbl_save").vw.setWidth((int)((views.get("lbl_save").vw.getHeight())));
views.get("lbl_share").vw.setHeight((int)((views.get("lbl_save").vw.getWidth())));
views.get("lbl_share").vw.setWidth((int)((views.get("lbl_share").vw.getHeight())));
views.get("imageview1").vw.setHeight((int)((views.get("lbl_save").vw.getHeight())));
views.get("imageview1").vw.setLeft((int)((views.get("lbl_save").vw.getLeft())-(2d * scale) - (views.get("imageview1").vw.getWidth())));
views.get("lbl_share").vw.setLeft((int)((views.get("imageview1").vw.getLeft())-(2d * scale) - (views.get("lbl_share").vw.getWidth())));
views.get("iv_core").vw.setTop((int)((50d / 100 * height) - (views.get("iv_core").vw.getHeight() / 2)));

}
}