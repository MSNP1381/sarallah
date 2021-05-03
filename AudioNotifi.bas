B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=7.28
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim m As Map
'	Dim stream As Mediap
'	Dim mp As MediaPlayerStream
	Dim nb As NotificationBuilder
End Sub

Sub Service_Create
Log("CreateMa")
End Sub

Sub Service_Start (StartingIntent As Intent)
Log(StartingIntent.ExtrasToString)
	
End Sub

Sub Service_Destroy

End Sub
Sub notify
	'	vlc.Initialize("vlc")
	nb.Initialize
	nb.SmallIcon = "hhlogo"
	nb.Ticker = "New Demo"
	nb.DefaultLight = True
	nb.DefaultVibrate = True
	nb.DefaultSound = True
	nb.ContentTitle = m.Get("text")
	nb.DefaultSound=False
	nb.ShowTime=False
	nb.AddAction2("pause","","ct",video_view)
	nb.AddAction("close", "","close",video_view)
	nb.AutoCancel=True
	Dim n As Notification= nb.GetNotification
	n.AutoCancel=False
	nb.Notify(1)
'	Dim CUS As NotificationCustomLayout
'	CUS.
End Sub

Sub set_stream


End Sub

Sub resume
	
End Sub
Sub close
 	
End Sub








