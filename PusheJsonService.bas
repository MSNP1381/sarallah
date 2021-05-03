Type=Service
Version=7.01
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Region Module Attributes
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

'Service module

Sub Process_Globals
Dim PusheUtil As PusheB4AUtil
End Sub
Sub Service_Create
	
End Sub

Sub Service_Start (StartingIntent As Intent)
	Select StartingIntent.Action
		Case "com.google.android.c2dm.intent.RECEIVE" 
			MessageArrived(StartingIntent)
	End Select
End Sub

Sub MessageArrived (pIntent As Intent) 
	Dim JsonMsg As String
	JsonMsg = PusheUtil.getPusheJsonMsg(pIntent)
	If JsonMsg <> "" Then
		processJson(JsonMsg)
	End If
End Sub
Sub processJson(jsonStr As String)
	Dim json1 As JSONParser
	Dim data As Map
	Dim s1 As String
	Dim s2 As String

	json1.Initialize(jsonStr)
	Try
		data = json1.NextObject
		s1 = data.Get("titr")
		s2 = data.Get("matn")
		ToastMessageShow(s1 & ":" & s2 , True)
	Catch
		Log(LastException)

	End Try
End Sub

Sub Service_Destroy

End Sub


