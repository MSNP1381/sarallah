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
	Dim sql As SQL
	Dim cur1 As Cursor
'	Dim ip As String="http://192.168.43.17:8080/"
	Dim ip As String="http://127.0.0.1/"
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim ulv As UltimateListView
	Private Panel1 As Panel

'	Dim pushe As Pushe
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'	Dim sp As Mv_Splash
	'	sp.Initialize(Activity, Me, "Mv_Splas	h.jpg", Gravity.FILL, 3000, 100, "Left")
	Activity.LoadLayout("main")

	'If File.Exists(File.DirInternal,"saralah.db")=False Then
	File.Copy(File.DirAssets,"saralah.db",File.DirInternal,"saralah.db")
	'End If
	sql.Initialize(File.DirInternal,"saralah.db",False)
	cur1=sql.ExecQuery("SELECT * from home_menu")
	ulv.Initialize(000,0,0,"ulv")
	Panel1.AddView(ulv,0,0,-1,-1)
	
	

	ulv.AddLayout("layout1","ulv_LayoutCreator","ulv_ContentFiller",100dip,True)
	
	
	For i=0 To cur1.RowCount-1
		ulv.AddItem("layout1",i)
	Next
	Dim d As ColorDrawable
	d.Initialize(Colors.Transparent,-1)
	ulv.DividerDrawable=d
	ulv.DividerHeight=20dip
End Sub


Sub ulv_LayoutCreator(LayoutName As String, LayoutPanel As Panel)
	LayoutPanel.LoadLayout("layout1")
End Sub
Sub ulv_ContentFiller(ItemID As Long, LayoutName As String, LayoutPanel As Panel, Position As Int)

	cur1.Position=ItemID
	Log(LayoutPanel.NumberOfViews)
	Dim p As Panel=LayoutPanel.GetView(0)
	p.Tag=ItemID
	Dim lbl_tite As Label=p.GetView(1)
	lbl_tite.Text=cur1.GetString("menu")
	Log(lbl_tite.Text)
	
	Dim lbl_subtitle As Label=p.GetView(0)
	Log(lbl_tite.Text)
			
	lbl_subtitle.Text=cur1.GetString("submenu")
	
	Log(lbl_tite.Text)
	Dim img As ImageView=p.GetView(2)
	img.Bitmap=LoadBitmap(File.DirAssets,"ico_maddahi.png")
	ulv.Color=Colors.Transparent
	LayoutPanel.Tag=cur1.GetString("ID")
	'	If Position=cur1.RowCount-1 Then
	If ItemID=0 Then
		ulv.SetStyle(ulv.STYLE_HOLO_LIGHT)
		ulv.Color=0x00201F1F
'		pushe.initialize
	End If
End Sub
Sub ulv_ItemClick(ItemID As Long, Position As Int, ClickedPanel As Panel)
	Log("ClickedPanel")
	Select Position
		Case 0
			StartActivity(video)
			Case 3
				StartActivity(pic_view)
		Case 4
			StartActivity(ashar)
		Case 6
			StartActivity(news)
	End Select
	'	If Position=0 Then

End Sub
Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub imginfo_Click
	StartActivity(infomodule)
End Sub

Sub iv_telegram_Click
	Dim i As Intent
	i.Initialize(i.ACTION_VIEW,"http://t.me/sarallah_zanjan")
	StartActivity (i)
End Sub

Sub iv_insta_Click
	Dim i2 As Intent
	i2.Initialize(i2.ACTION_VIEW,"http://instagram.com/sarallah_zn.ir")
	StartActivity (i2)
	'
End Sub