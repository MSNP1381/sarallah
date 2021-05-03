B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=7.28
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
Dim c As PhotoGridView
	Private ImageView1 As ImageView
	Private iv_core As ImageView
	Private lbl_save As Label
	Private lbl_share As Label
	Private Panel1 As Panel
	Dim b As Bitmap
	Dim pos As Int
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
c.Initialize("c")
c.NumColumns=4
For i= 1 To 16
	
c.AddImage(File.DirRootExternal," ("&i&").jpg")
Next
Activity.AddView(c,0,0,-1,-1)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
Sub c_ItemClick(Position As Int, Value As Object)
Activity.LoadLayout("pic_ciew_sample")
b=Value
Dim x As Float =b.Width/b.Height
pos=Position
	iv_core.Height=iv_core.Width/x
	iv_core.Top=50%y-iv_core.Height/2
	iv_core.Bitmap=b
	iv_core.SetVisibleAnimated(300,True)
End Sub

Sub Panel1_Click
	lbl_back_Click
End Sub

Sub lbl_save_Click
'	Dim io As OutputStream=File.OpenOutput(File.DirRootExternal,"/saralah/1.png",True)
'	If File.IsDirectory(File.DirRootExternal&"/Saralah","")=False Then
'		Log( File.IsDirectory(File.DirRootExternal,"Saralah")=False)
'	File.MakeDir(File.DirRootExternal,"Saralah")
'End If
	Dim Out As OutputStream
	Out = File.OpenOutput(File.DirRootExternal&"/SaralahCyber",pos&".png", True)
	b.WriteToStream(Out, 100, "PNG")
	Out.Close
	ToastMessageShow("باموفقیت ذخیره شد .",False)
	c.SetBorderColor=Colors.White
	c.VerticalSpacing=2dip
End Sub

Sub lbl_share_Click
	Dim Aria As AriaLib
	StartActivity(Aria.SharePic("",	c.GetItem(pos),"گیرنده را انتخاب کنید"))
End Sub

Sub lbl_back_Click
	Panel1.RemoveView
End Sub