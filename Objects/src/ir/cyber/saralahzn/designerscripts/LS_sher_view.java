package ir.cyber.saralahzn.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_sher_view{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("iv_play").vw.setLeft((int)((50d / 100 * width) - (views.get("iv_play").vw.getWidth() / 2)));
views.get("lbl_position").vw.setTop((int)((views.get("panel1").vw.getTop())+(views.get("panel1").vw.getHeight())/2d - (views.get("lbl_position").vw.getHeight() / 2)));
views.get("lbl_time").vw.setTop((int)((views.get("panel1").vw.getTop())+(views.get("panel1").vw.getHeight())/2d - (views.get("lbl_time").vw.getHeight() / 2)));
views.get("iv_play").vw.setTop((int)((views.get("panel1").vw.getTop())+(views.get("panel1").vw.getHeight())/2d - (views.get("iv_play").vw.getHeight() / 2)));

}
}