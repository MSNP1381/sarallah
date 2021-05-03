B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=7.28
@EndOfDesignText@

#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
'Dim vlc As 

Dim modu As Object

End Sub

Sub Service_Create
	'This is the program entry point.
	'This is a good place to load resources that are not specific to a single activity.

End Sub

Sub Service_Start (StartingIntent As Intent)

End Sub

Sub Service_TaskRemoved
	'This event will be raised when the user removes the app from the recent apps list.
End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Sub Service_Destroy

End Sub

Sub dwnl(url As String,module As Object)
	modu=module
Dim hj As HttpJob
hj.Initialize("job1",Me)
hj.Download(url)

End Sub
 Sub jobdone(job As HttpJob)
	Log("job.Success = "&job.Success)
If job.Success Then
CallSub2(modu,"start",job.GetString)
Else
	CallSub(modu,"end1")
End If
End Sub