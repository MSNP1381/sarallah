Type=Service
Version=7.01
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Service_Create

End Sub

Sub Service_Start (StartingIntent As Intent)
Log(StartingIntent.ExtrasToString)
	ToastMessageShow(StartingIntent.ExtrasToString,False)
If StartingIntent.ExtrasToString.EndsWith("close}]") Then
	CallSub(AudioNotifi,"close")
	Else If StartingIntent.ExtrasToString.EndsWith("ctrl}]") Then
	CallSub(AudioNotifi,"resume")
		End If
End Sub

Sub Service_Destroy

End Sub