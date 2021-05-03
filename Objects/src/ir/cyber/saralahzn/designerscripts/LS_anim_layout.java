package ir.cyber.saralahzn.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_anim_layout{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 4;BA.debugLine="Panel1.Width=25%x"[anim_layout/General script]
views.get("panel1").vw.setWidth((int)((25d / 100 * width)));
//BA.debugLineNum = 5;BA.debugLine="Panel1.Height=Panel1.Width"[anim_layout/General script]
views.get("panel1").vw.setHeight((int)((views.get("panel1").vw.getWidth())));
//BA.debugLineNum = 6;BA.debugLine="AutoScaleAll"[anim_layout/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 8;BA.debugLine="ivcore.Height=ivOutline.Height/1.7"[anim_layout/General script]
views.get("ivcore").vw.setHeight((int)((views.get("ivoutline").vw.getHeight())/1.7d));
//BA.debugLineNum = 10;BA.debugLine="ivcore.Width=ivcore.Height"[anim_layout/General script]
views.get("ivcore").vw.setWidth((int)((views.get("ivcore").vw.getHeight())));
//BA.debugLineNum = 12;BA.debugLine="ivcore.VerticalCenter=Panel1.Height/2"[anim_layout/General script]
views.get("ivcore").vw.setTop((int)((views.get("panel1").vw.getHeight())/2d - (views.get("ivcore").vw.getHeight() / 2)));
//BA.debugLineNum = 15;BA.debugLine="ivcore.HorizontalCenter=Panel1.Width/2"[anim_layout/General script]
views.get("ivcore").vw.setLeft((int)((views.get("panel1").vw.getWidth())/2d - (views.get("ivcore").vw.getWidth() / 2)));
//BA.debugLineNum = 16;BA.debugLine="Panel1.HorizontalCenter=50%x"[anim_layout/General script]
views.get("panel1").vw.setLeft((int)((50d / 100 * width) - (views.get("panel1").vw.getWidth() / 2)));
//BA.debugLineNum = 17;BA.debugLine="Panel1.VerticalCenter=50%y"[anim_layout/General script]
views.get("panel1").vw.setTop((int)((50d / 100 * height) - (views.get("panel1").vw.getHeight() / 2)));
//BA.debugLineNum = 20;BA.debugLine="animatedbackground.Width=animatedbackground.Height/1.11"[anim_layout/General script]
views.get("animatedbackground").vw.setWidth((int)((views.get("animatedbackground").vw.getHeight())/1.11d));
//BA.debugLineNum = 21;BA.debugLine="animatedbackground.Left=0"[anim_layout/General script]
views.get("animatedbackground").vw.setLeft((int)(0d));

}
}