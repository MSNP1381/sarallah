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

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("info")
	
End Sub
Sub insta_ClickableLink (Text As String)
	Dim i2 As Intent
	i2.Initialize(i2.ACTION_VIEW,"http://instagram.com/sarallah_zn.ir")
	StartActivity (i2)
	'
	'سایت رسمی هیئت :
	'www.sarallah-zn.ir
	'کانال تلگرام هیئت :
	'@sarallah_zanjan
	'اینستاگرام هیئت :
	'instagram.com/sarallah_zn.ir
	' حسینیه مجازی ( ربات آرشیو )  :
	'@sarallah_zanjan_rbot
	'http://t.me/sarallah_zanjan_rbot
	'ارتباط با ادمین :
	'
	'👇👇👇👇👇👇
	'@Shogparvaz113
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub Label3_Click
	'rayan rooyesh
	Dim i As Intent
	i.Initialize(i.ACTION_VIEW,"http://rayanrooyesh.ir")
	StartActivity (i)
End Sub

Sub siteLink_Click
	Dim i As Intent
	i.Initialize(i.ACTION_VIEW,"http://sarallah-zn.ir/")
	StartActivity (i)
End Sub

Sub Button2_Click
	'bazaar
Dim a As AriaMarkets
	a.Cafebazaar_SafheNazar("ir.cyber.saralahzn")
End Sub

Sub Button1_Click
	Dim i As Intent
	i.Initialize(i.ACTION_VIEW,"http://t.me/sarallah_zanjan")
	StartActivity (i)
End Sub