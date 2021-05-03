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
	Dim ulvnews As UltimateListView
	Dim glide As AriaGlide
	Private Panel1 As Panel
	Dim old_js As String


	Dim max_item As Int
End Sub
 
Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	CallSub3(Starter,"dwnl",newMain.ip&"saralah/news.json",Me)
	ProgressDialogShow2("در حال بارگذاری ...",True)
	
End Sub

Sub start(js As String)
	ProgressDialogHide
	If js<>old_js Then
		ulvnews.Initialize(0,0,0,"ulvnews")

		sql.Initialize(File.DirInternal,"saralah.db",False)
		Activity.LoadLayout("news_load_lay")
	

		Dim parser As JSONParser
		parser.Initialize(js)
		Dim root As Map = parser.NextObject
		Dim RECORDS As List = root.Get("RECORDS")
		For Each colRECORDS As Map In RECORDS
			Dim date As String = colRECORDS.Get("date")
			Dim title As String = colRECORDS.Get("title")
			Dim ID As String=colRECORDS.Get("ID")
			Dim body As String = colRECORDS.Get("body")
			Dim pic_url As String = colRECORDS.Get("pic_url")
			sql.ExecNonQuery("INSERT INTO news(ID,title,body,pic_url,date) VALUES('"&ID&"','"&title&"','"&body&"','"&pic_url&"','"&date&"')")
			cur1=sql.ExecQuery("SELECT * FROM news")
		Next
	
		Panel1.AddView(ulvnews,0,0dip,-1,-1)
		ulvnews.AddLayout("layout1","ulvnews_LayoutCreator","ulvnews_ContentFiller",320dip,True)
		max_item=cur1.RowCount-1
		For i = 0 To max_item
			ulvnews.AddItem("layout1", i)
		Next
		ulvnews.FadingEdges(False)
		ulvnews.SetStyle(ulvnews.STYLE_DEFAULT)
'		ulvnews.SetStyle(ulvnews.STYLE_DEFAULT)
		old_js=js
	End If
End Sub


Sub ulvnews_LayoutCreator(LayoutName As String, LayoutPanel As Panel)
	LayoutPanel.LoadLayout("news_lay")
End Sub


Sub ulvnews_ContentFiller(ItemID As Long, LayoutName As String, LayoutPanel As Panel, Position As Int)
	'	Dim lblArabic As Label = LayoutPanel.GetView(0)
	'	Dim lblTranslation As Label = LayoutPanel.GetView(1)
	Log(ItemID)
	cur1.Position=ItemID
	Dim imgBody As ImageView=LayoutPanel.GetView(1)
	Dim lblTitle As Label=LayoutPanel.GetView(2)
	Dim lblBody As Label=LayoutPanel.GetView(6)
	
	'''''''''''''''''''''''''[p-0uuuuuuuuuuuuuuuuuuuuuuuuy
	Dim lbltime As Label=LayoutPanel.GetView(5)
	glide.Load(cur1.GetString("pic_url")).AsBitmap.Placeholder(LoadBitmap(File.DirAssets,"placeholder.jpg")).CenterCrop.IntoImageView(imgBody)
lblTitle.Text=cur1.GetString("title")
'htmlTv.Initialize("htmTv")
lblBody.Text=(cur1.GetString("body"))
lbltime.Text=cur1.GetString("date")

If max_item=ItemID Then
ulvnews.SetStyle(ulvnews.STYLE_DEFAULT)
ulvnews.Color=Colors.Transparent
End If
End Sub

Sub ulvnews_ItemClick(ItemID As Long, Position As Int, ClickedPanel As Panel)
	Log(cur1.GetString("body"))
	Dim m As Map=CreateMap("title":cur1.GetString("title"),"pic_url":cur1.GetString("pic_url"),"body":cur1.GetString("body"))
news_view.m=m
StartActivity(news_view)
End Sub
Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
Sub end1
	ToastMessageShow("با مشکل مواجه شدید",False)
	Activity.Finish
End Sub