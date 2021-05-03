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
	Dim m As Map
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private l As Label
	Private ImageView1 As ImageView
	Private Label1 As Label
	Private ScrollView1 As ScrollView
Dim g As AriaGlide
	Private iv_core As ImageView
	Private lbl_back As Label
	Private lbl_save As Label
	Private lbl_share As Label
	Private Panel1 As Panel
	Dim b As Bitmap
	Private iv_original As ImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:

	Activity.LoadLayout("news_view")
	ScrollView1.Panel.LoadLayout("scrol_lay_news")
	l.Text=m.Get("body")
	g.Load(m.Get("pic_url")).AsBitmap.FitCenter.IntoImageView(iv_original)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub ScrollView1_ScrollChanged(Position As Int)

End Sub

Sub iv_original_Click
	Activity.LoadLayout("pic_ciew_sample")
	b=iv_original.Bitmap
	Dim x As Float =b.Width/b.Height
	iv_core.Height=iv_core.Width/x
	iv_core.Top=50%y-iv_core.Height/2
	iv_core.Bitmap=b
	iv_core.SetVisibleAnimated(300,True)
End Sub

Sub Panel1_Click
	lbl_back_Click
End Sub

'Sub lbl_save_Click
	'	Dim io As OutputStream=File.OpenOutput(File.DirRootExternal,"/saralah/1.png",True)
	'	If File.IsDirectory(File.DirRootExternal&"/Saralah","")=False Then
	'		Log( File.IsDirectory(File.DirRootExternal,"Saralah")=False)
	'	File.MakeDir(File.DirRootExternal,"Saralah")
	'End If
'	Dim Out As OutputStream
'	Out = File.OpenOutput(File.DirRootExternal&"/SaralahCyber",m.Get("pic_url"), True)
'	Dim s As String =m.Get("pic_url")
'	CharsToString(Array As Char(s.CharAt(s.Length-3),s.CharAt(s.Length-2),s.CharAt(s.Length-1)),0,s.Length-1)
'	b.WriteToStream(Out, 100, CharsToString(Array As Char(s.CharAt(s.Length-3),s.CharAt(s.Length-2),s.CharAt(s.Length-1)),0,s.Length-1))
'	Out.Close
'	ToastMessageShow("باموفقیت ذخیره شد .",False)
'
'End Sub

Sub lbl_share_Click
	Dim Aria As AriaLib
	Dim Out As OutputStream
	Out = File.OpenOutput(File.DirInternal, "Test.png", False)
	b.WriteToStream(Out, 100, "PNG")
	Out.Close
	StartActivity(Aria.SharePic(File.DirInternal, "Test.png","گیرنده را انتخاب کنید"))
End Sub

Sub lbl_back_Click
	Panel1.RemoveView
End Sub

Sub lbl_back1_Click
	Activity.Finish
End Sub