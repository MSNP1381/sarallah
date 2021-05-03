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
Dim map1 As Map
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim l As Label
	Private ScrollView1 As ScrollView
	Dim s1 As String
Dim su As StringUtils
	Private lblCount As Label
	Private Panel2 As Panel
	Dim a,a2 As Animation
	Private lbl_more_down As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("sher_view")
	s1=map1.Get("body")
l.Initialize("l")
l.Text=s1
l.TextSize=20
l.Typeface=Typeface.LoadFromAssets("shabnam.ttf")
ScrollView1.Panel.AddView(l,0,15dip,100%x,ScrollView1.Height)

l.TextColor=Colors.White
l.Gravity=Gravity.RIGHT+Gravity.TOP
	Dim x As Int=su.MeasureMultilineTextHeight(l,s1)
If x>ScrollView1.Height Then
	ScrollView1.Panel.Height=x+16dip
	l.Height=x	
End If

a.InitializeRotateCenter("anim",0,90,lbl_more_down)
	a.Duration=400
	
	a2.InitializeRotateCenter("anim",0,-90,lbl_more_down)
	a2.Duration=400
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub set_sher(val As String)

End Sub


Sub iv_play_Click
	
End Sub

Sub lbl_save_Click
	
End Sub

Sub lbl_title_Click
	
End Sub

Sub lblMines_Click
	l.TextSize=l.TextSize-1
	lblCount.Text=l.TextSize
	Dim x As Int=su.MeasureMultilineTextHeight(l,s1)
	If x>ScrollView1.Height Then
		ScrollView1.Panel.Height=x+16dip
		l.Height=x
	End If
End Sub

Sub lblPlus_Click
	
	l.TextSize=l.TextSize+1
	lblCount.Text=l.TextSize
	Dim x As Int=su.MeasureMultilineTextHeight(l,s1)
	If x>ScrollView1.Height Then
		ScrollView1.Panel.Height=x+16dip
		l.Height=x
	End If
End Sub

Sub lbl_more_down_Click
	If Panel2.Visible Then
		a.Start(lbl_more_down)
		Panel2.SetVisibleAnimated(400,Not(Panel2.Visible))
		
		Else
			
		a2.Start(lbl_more_down)
		Panel2.SetVisibleAnimated(400,Not(Panel2.Visible))
		
End If
End Sub