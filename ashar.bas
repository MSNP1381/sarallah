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
	Dim old_js As String
Dim ulvid As UltimateListView
	Private Panel1 As Panel
	Dim max_item As Int
	
End Sub


Sub start(js As String)
	ProgressDialogHide
	If js<>old_js Then
		Log(js)
		ulvid.Initialize(0,0,0,"ulvid")

		sql.Initialize(File.DirInternal,"saralah.db",False)
		Activity.LoadLayout("sher_show")

		Dim parser As JSONParser
		parser.Initialize(js)
		Dim root As Map = parser.NextObject
		Dim RECORDS As List = root.Get("RECORDS")
		For Each colRECORDS As Map In RECORDS
			
			Dim name As String = colRECORDS.Get("name")
			Dim style As String = colRECORDS.Get("style")
			
			Dim ID As Int = colRECORDS.Get("ID")
			Log(ID)
			Dim body As String = colRECORDS.Get("body")
			sql.ExecNonQuery("INSERT INTO sher(name,body,style) VALUES('"&name&"','"&body&"','"&style&"')")
		Next
			cur1=sql.ExecQuery("SELECT * FROM sher")
	
	
		Panel1.AddView(ulvid,0,0dip,-1,-1)
		ulvid.AddLayout("layout1","ulvid_LayoutCreator","ulvid_ContentFiller",60dip,True)
	
		max_item=cur1.RowCount-1
		Log(max_item)
		For i = 0 To max_item
			ulvid.AddItem("layout1", i)
		Next
'		ulvSher.SetStyle(ulvSher.STYLE_DEFAULT)
		old_js=js
	End If
End Sub
Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("sher_show")
	CallSub3(Starter,"dwnl",newMain.ip&"saralah/sher.json",Me)
	ProgressDialogShow("در حال بارگذاری ...")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub ulvid_LayoutCreator(LayoutName As String, LayoutPanel As Panel)
	LayoutPanel.LoadLayout("layout1_sher")
End Sub
Sub ulvid_ContentFiller(ItemID As Long, LayoutName As String, LayoutPanel As Panel, Position As Int)
	cur1.Position=ItemID
	Dim style As Label=LayoutPanel.GetView(1)
	Dim name As Label=LayoutPanel.GetView(0)
	style.Text=cur1.GetString("style")
	name.Text=cur1.GetString("name")
	If ItemID=0 Then
		ulvid.SetStyle(ulvid.STYLE_HOLO_DARK)
	End If
	Log(LayoutPanel.NumberOfViews)
End Sub
Sub ulvid_ItemClick(ItemID As Long, Position As Int, ClickedPanel As Panel)
	Log("ClickedPanel")
cur1.Position=Position
Dim m As Map=CreateMap("title":cur1.GetString("name"),"body":cur1.GetString("body"))
sher_view.map1=m
StartActivity(sher_view)
End Sub

Sub lbl_more_Click
	
End Sub

Sub end1
	ToastMessageShow("با مشکل مواجه شدید",False)
	Activity.Finish
End Sub