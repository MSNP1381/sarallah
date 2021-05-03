package ir.cyber.saralahzn.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_download_panel{

public static void LS_320x480_1(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("progressbar").vw.setTop((int)((views.get("pnl_under_dwn").vw.getHeight())/2d - (views.get("progressbar").vw.getHeight() / 2)));
views.get("percent").vw.setTop((int)((views.get("pnl_under_dwn").vw.getHeight())/2d - (views.get("percent").vw.getHeight() / 2)));
views.get("lblcancel").vw.setTop((int)((views.get("pnl_under_dwn").vw.getHeight())/2d - (views.get("lblcancel").vw.getHeight() / 2)));

}
public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
((anywheresoftware.b4a.keywords.LayoutBuilder.DesignerTextSizeMethod)views.get("lblcancel").vw).setTextSize((float)((2.5d / 100 * width)));

}
}