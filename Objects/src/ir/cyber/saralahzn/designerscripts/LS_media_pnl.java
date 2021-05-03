package ir.cyber.saralahzn.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_media_pnl{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("label2").vw.setHeight((int)((views.get("imageview1").vw.getHeight())));
views.get("label2").vw.setTop((int)((views.get("panel1").vw.getHeight())/2d - (views.get("label2").vw.getHeight() / 2)));
((anywheresoftware.b4a.keywords.LayoutBuilder.DesignerTextSizeMethod)views.get("label2").vw).setTextSize((float)((views.get("label2").vw.getHeight())/4d));

}
}