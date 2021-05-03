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

End Sub
Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim type_vid As Bitmap=LoadBitmap(File.DirAssets,"play-video.png")
Dim type_sot As Bitmap=LoadBitmap(File.DirAssets,"voice.png")
Dim ulvid As UltimateListView
Dim glide As AriaGlide
	Private Panel1 As Panel
	Private ACSpinnerstyle As ACSpinner
	Private ACSpinnerday As ACSpinner
	Dim old_js As String
	Dim max_item As Int
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:

	
	'Activity.LoadLayout("Layout1")
	 CallSub3(Starter,"dwnl",newMain.ip&"saralah/madahi.json",Me)
	ProgressDialogShow("در حال بارگذاری ...")
End Sub
Sub start(js As String)
	ProgressDialogHide
	If js<>old_js Then
	ulvid.Initialize(0,0,0,"ulvid")

	sql.Initialize(File.DirInternal,"saralah.db",False)
	Activity.LoadLayout("madah")
	spiner_itemset

	Dim parser As JSONParser
	parser.Initialize(js)
	Dim root As Map = parser.NextObject
	Dim RECORDS As List = root.Get("RECORDS")
	For Each colRECORDS As Map In RECORDS
		Dim name As String = colRECORDS.Get("name")
		Dim style As String = colRECORDS.Get("style")
		Dim pic_url As String = colRECORDS.Get("pic_url")
		Dim Type1 As String = colRECORDS.Get("type")
		Dim hajm As String = colRECORDS.Get("hajm")
		Dim url As String = colRECORDS.Get("url")
		sql.ExecNonQuery("INSERT INTO madahi(name,pic_url,url,style,type,hajm) VALUES('"&name&"','"&pic_url&"','"&url&"','"&style&"','"&Type1&"','"&hajm&"')")
	Next
		cur1=sql.ExecQuery("SELECT * FROM madahi")
	
	
	Panel1.AddView(ulvid,0,0dip,-1,-1)
	ulvid.AddLayout("layout1","ulvid_LayoutCreator","ulvid_ContentFiller",110dip,True)
		max_item=cur1.RowCount-1
	For i = 0 To max_item
		ulvid.AddItem("layout1", i)
	Next
	ulvid.SetStyle(ulvid.STYLE_DEFAULT)
	old_js=js
	End If
End Sub
Sub ulvid_LayoutCreator(LayoutName As String, LayoutPanel As Panel)
	LayoutPanel.LoadLayout("media_pnl")

End Sub

Sub ulvid_ContentFiller(ItemID As Long, LayoutName As String, LayoutPanel As Panel, Position As Int)
	'	Dim lblArabic As Label = LayoutPanel.GetView(0)
	'	Dim lblTranslation As Label = LayoutPanel.GetView(1)
	Log(ItemID)
	cur1.Position=ItemID
	
	Dim p As Panel=LayoutPanel.GetView(0)

	Dim lbl_name As Label=p.GetView(1)

	Dim lbl_hajm As Label=p.GetView(4)

	Dim img_title As ImageView=p.GetView(0)
	
	Dim img_type As ImageView=p.GetView(3)

	Dim btn_download As Button=p.GetView(2)
	btn_download.Tag=ItemID

	ulvid.AnimationCleaner=True
	lbl_name.Text=cur1.GetString("name")
	lbl_hajm.Text=cur1.GetInt("hajm")&" MB"
	glide.Load(cur1.GetString("pic_url")).AsBitmap.Placeholder(LoadBitmap(File.DirAssets,"placeholder.jpg")).IntoImageView(img_title)
	If cur1.GetString("url").EndsWith("mp3") Then
		img_type.Bitmap=type_sot
		
	Else
		img_type.Bitmap=type_vid
	End If

	If ItemID=0 Then
		 ulvid.SetStyle(ulvid.STYLE_HOLO_LIGHT)
ulvid.Color=Colors.Transparent
	End If
	
	If ItemID=max_item Then
'		CallSub2(
	End If



End Sub

Sub ulvid_ItemClick(ItemID As Long, Position As Int, ClickedPanel As Panel)
	Dim m As Map
	m.Initialize
	cur1.Position=ItemID
	m.Put("comment",cur1.GetString("name"))
	m.Put("img_url",cur1.GetString("pic_url"))
	m.Put("url",cur1.GetString("url"))
	video_view.m=m

	StartActivity(video_view)
End Sub
Sub spiner_itemset
	cur1=sql.ExecQuery("SELECT * FROM spinner_tbl")

	For i =0 To cur1.RowCount-1
		cur1.Position=i
		'	Dim pnl_ulv As UltimateLVPanel
		ACSpinnerstyle.Add(cur1.GetString("style"))
	Next
End Sub
Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub ACSpinnerstyle_ItemClick (Position As Int, Value As Object)
	
End Sub

Sub ACSpinnerday_ItemClick (Position As Int, Value As Object)
	
End Sub


Sub end1
	ToastMessageShow("با مشکل مواجه شدید",False)
	Activity.Finish
End Sub