package ir.cyber.saralahzn.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_main{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("imgtop").vw.setTop((int)(0d));
views.get("imgtop").vw.setHeight((int)((24d / 100 * height) - (0d)));
views.get("imgtop").vw.setTop((int)(0d));
views.get("imgtop").vw.setHeight((int)((24d / 100 * height) - (0d)));
views.get("panel1").vw.setTop((int)((17d / 100 * height)));
views.get("panel1").vw.setHeight((int)((100d / 100 * height)-(15d * scale) - ((17d / 100 * height))));
views.get("imginfo").vw.setTop((int)((11d / 100 * height)));
views.get("panel2").vw.setTop((int)((11d / 100 * height)-(7d * scale)));

}
}