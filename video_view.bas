B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=7.28
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: TRUE
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
Dim m As Map 
 'should be done in Sub Process_Globals
	Dim Timer1 As Timer
	Dim sql As SQL
	Dim cur1 As Cursor
	Dim service_map As Map
'Dim b As Bitmap=LoadBitmap(File.DirAssets, "002.jpg")
'Dim t As Timer


End Sub	

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.


	Dim aria As AriaPhotoshp
	Dim circle As CircularImageView
	

	Dim vv As VLCVideoView
'	Dim VVR As VideoViewRelativeLayout
	Private btn_down As Button
	Private btn_share As Button
	Private f_screen As Label
	Dim glide As AriaGlide

	Private Label2 As Label
	Private lbl_time As Label
	Private Panel1 As Panel
	Private Panel2 As Panel
	Private Panel3 As Panel
	Private SeekBar1 As ACSeekBar
	Private UltimateListView1 As Panel
'	Dim type_vid As Bitmap=LoadBitmap(File.DirAssets,"voice.png")
'	Dim type_sot As Bitmap=LoadBitmap(File.DirAssets,"play-video.png")
	Dim ulvid As UltimateListView
	Private iv_play As ImageView
	Private dwnpnl As Panel
	Private percent As Label
	Private progressbar As ProgressBar
	Private lblname As Label
	Private pnl_under_dwn As Panel
	Private ivback As ImageView
	Private pnl_circle As Panel
	Private MaterialCircleProgress1 As MaterialCircleProgress
End Sub
Sub Timer1_Tick
lbl_time.Text=ConvertToTimeFormat(vv.CurrentPosition)
SeekBar1.Value=vv.CurrentPosition
End Sub

Sub Activity_Create(FirstTime As Boolean)
	StopService(Starter)
	StartService(AudioNotifi)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("video_play1")
	lbl_time.Text=ConvertToTimeFormat(0)
	MaterialCircleProgress1.Colors=Array As Int(0xFF43A047,0xFFF44336,0xFF1DACD6,0xFF00CCB4,0xFF2F2F2F)
	MaterialCircleProgress1.ShowArrow=False
	sql.Initialize(File.DirInternal,"saralah.db",False)
	Timer1.Initialize("Timer1", 400)
	Log(m.Get("url"))
video_play
	cur1=sql.ExecQuery("SELECT * FROM madahi")
	ulvid.Initialize(0,0,0,"ulvid")
	UltimateListView1.AddView(ulvid,0,0,-1,-1)
	ulvid.AddLayout("layout1","ulvid_LayoutCreator","ulvid_ContentFiller",110dip,True)
	For i = 0 To cur1.RowCount-1
		ulvid.AddItem("layout1", i)
	Next
	lblname.Text=m.Get("comment")
End Sub

Sub ulvid_LayoutCreator(LayoutName As String, LayoutPanel As Panel)
	LayoutPanel.LoadLayout("vid_v_ulv")
End Sub
Sub ulvid_ContentFiller(ItemID As Long, LayoutName As String, LayoutPanel As Panel, Position As Int)
	Log(ItemID)
	cur1.Position=ItemID
	Dim lbl_name As Label=LayoutPanel.GetView(1)
	Dim img_title As ImageView=LayoutPanel.GetView(0)
	lbl_name.Text=cur1.GetString("name")
	glide.Load(newMain.ip&cur1.GetString("pic_url")).AsBitmap.Placeholder(LoadBitmap(File.DirAssets,"placeholder.jpg")).IntoImageView(img_title)
	If ItemID=0 Then
		ulvid.Color=0xFFFFFFFF
'		im cs as 
	End If
End Sub
  Sub Activity_Resume
	Log(Activity.getStartingIntent.ExtrasToString)
If Activity.GetStartingIntent.ExtrasToString.EndsWith("close}]") Then
	lbl_exit_Click
	
	Else If Activity.GetStartingIntent.ExtrasToString.EndsWith("ctrl}]") Then
	iv_play_Click
End If
End Sub 
Sub  glide_OnBitmapReady(bitmap As Bitmap,Tag As Object)
	aria.Initialize("aria")
aria.Blur(bitmap,5)
circle.Initialize("circle")
Dim draw As BitmapDrawable
draw.Initialize(bitmap)
circle.SetDrawable(draw)
circle.AddDefaultShadow
	pnl_circle.AddView(circle,0,0,-1,-1)
End Sub
Sub  aria_BlurEnd (BluredImage As Bitmap)
ivback.Bitmap=BluredImage
End Sub
Sub video_play
	vv.Initialize("vv")
'	vv.MediaControllerEnabled=False
	Panel1.AddView(vv, 0, 0dip, 100%x, 100%y)
	
	Dim str As String=m.Get("url")
	Log(str)
	If 	str.EndsWith("mp3") Then
		Panel1.LoadLayout("blur_lay")
		glide_OnBitmapReady(LoadBitmap(File.DirAssets,"1 (12).jpg"),0)
		f_screen.Text=Chr(0xE5D8)
		sound_play
		
		Else
			
'		vv.LoadVideo("http",newMain.ip&str)
'		vv.Play
	End If
	'	vv.StopPlayback
	vv.VideoURI=(newMain.ip&str)
	vv.Start
End Sub

Sub sound_play
	Dim str As String=m.Get("url")
	
	
	
End Sub
Sub Activity_Pause (UserClosed As Boolean)


End Sub
Sub vv_onPrepared
	
	SeekBar1.Max=vv.Duration
	Log("vv_prepared")
	MaterialCircleProgress1.Visible=False
'	For i = 0 To Activity.NumberOfViews - 1
'		If Activity.GetView(i) Is MaterialCircleProgress Then
'			Dim b2 As View
'			b2 = Activity.GetView(i)
'b2.RemoveView
'Activity.RemoveViewAt(i)
'		End If
'	Next
	Timer1.Enabled = True

End Sub
Sub vv_onCompleted
		
	Log("Playing completed"):Sleep(3000)
	Activity.Finish
End Sub
Sub  vv_onError
	

	
'End Sub
	Log("erorr")
End Sub


Sub btn_share_Click
	
End Sub

Sub btn_down_Click
	dwnpnl.LoadLayout("download_panel")
	Label2.Enabled=False
	btn_down.Enabled=False
End Sub

Sub f_screen_Click
	Dim str As String=m.Get("url")
	If 	str.EndsWith("mp3")=False Then
		If Panel2.Visible Then
			Panel2.Visible=False
			UltimateListView1.Visible=False
			Panel1.Width=100%x
			Panel1.Left=0
			dwnpnl.Width=100%x
			dwnpnl.Left=0
			
			Panel3.Width=100%x
			Panel3.Left=0
			vv.Invalidate
			f_screen.Text=Chr(0xE5D1)
		
		Else
			Panel2.Visible=True
			UltimateListView1.Visible=True
			
			Panel1.Width=80%x
			Panel1.Left=0
			
			dwnpnl.Width=80%x
			dwnpnl.Left=0
			
			Panel3.Width=80%x
			Panel3.Left=0
			vv.Invalidate
			f_screen.Text=Chr(0xE5D0)
		End If
	Else

		service_map=CreateMap("text":m.Get("comment"),"offline":False,"path":m.Get("url"))
		AudioNotifi.m=service_map
		CallSub(AudioNotifi,"notify")
	End If
End Sub

Sub SeekBar1_ValueChanged (Value As Int, UserChanged As Boolean)
	If UserChanged Then
		vv.SeekTo(Value)
		End If
		
End Sub

 Sub  Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then  
			lbl_exit_Click
			Else If KeyCode==KeyCodes.KEYCODE_VOLUME_DOWN Then
				
				Else If KeyCodes.KEYCODE_VOLUME_UP==KeyCode Then
	End If
Return True
 End Sub

Sub lbl_exit_Click
	vv.StopPlayback
	vv.RemoveView
	vv.Pause
	Activity.Finish
End Sub

Sub iv_play_Click
	Log(vv.IsPlaying)
	If	vv.IsPlaying Then

		vv.Pause
		iv_play.Bitmap=LoadBitmap(File.DirAssets,"paly_ico.png")
'		t.Enabled=False
	Else
	
		vv.Start
		iv_play.Bitmap=LoadBitmap(File.DirAssets,"pause_ico.png")
		
'		t.Enabled=True
	End If
End Sub

Sub lbl_time_Click
	lbl_time.Text=ConvertToTimeFormat(vv.Duration)
	Sleep(4000)
End Sub


Sub lblcancel_Click
'	CallSub(Main,"cancel")
	pnl_under_dwn.RemoveView
	Label2.Enabled=True
	btn_down.Enabled=True
End Sub



Sub ConvertToTimeFormat(ms As Int) As String
	Dim seconds, minutes As Int
	seconds = Round(ms / 1000)
	minutes = Floor(seconds / 60)
	seconds = seconds Mod 60
	Return NumberFormat(minutes, 1, 0) & ":" & NumberFormat(seconds, 2, 0) 'ex: 3:05
End Sub