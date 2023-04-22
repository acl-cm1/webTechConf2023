/(!If:/(!Param:script))
fixBottom: "/(!Property:FixBottom)",
fixLeft: "/(!Property:FixLeft)",
fixRight: "/(!Property:FixRight)",
fixTop: "/(!Property:FixTop)",
panelWidth: "/(!Panel:!Size:x)",
panelHeight: "/(!Panel:!Size:y)",
/(!If:/(!Property:Size))
ctrlWidth: "/(!Size:x)", 
ctrlHeight: "/(!Size:y)",
fncName: "/(!Panel:!NameID)",
/(!If:/(!Property:Position))
top: "/(!Position:y)",
/(!If)
/(!If) 


/(!Else)
/(!If:/(!Param:object))
{/(!If:/(!Property:Position))top: "/(!Position:y)",/(!If)/(!If:/(!Property:Size))ctrlWidth: "/(!Size:x)", ctrlHeight: "/(!Size:y)",/(!If) fixBottom: "/(!Property:FixBottom)",fixLeft: "/(!Property:FixLeft)",fixRight: "/(!Property:FixRight)",fixTop: "/(!Property:FixTop)",panelWidth: "/(!Panel:!Size:x)",panelHeight: "/(!Panel:!Size:y)",fncName: "/(!Panel:!NameID)"}
/(!Else)
/(!If:/(!Param:json))
{/(!If:/(!Property:Position))"top": "/(!Position:y)",/(!If)/(!If:/(!Property:Size))"ctrlWidth": "/(!Size:x)", "ctrlHeight": "/(!Size:y)",/(!If) "fixBottom": "/(!Property:FixBottom)","fixLeft": "/(!Property:FixLeft)","fixRight": "/(!Property:FixRight)","fixTop": "/(!Property:FixTop)","panelWidth": "/(!Panel:!Size:x)","panelHeight": "/(!Panel:!Size:y)","fncName": "/(!Panel:!NameID)"}
/(!Else)
fncName="/(!Panel:!NameID)" fixBottom="/(!Property:FixBottom)" fixLeft="/(!Property:FixLeft)" fixRight="/(!Property:FixRight)" fixTop="/(!Property:FixTop)" panelWidth=/(!Panel:!Size:x) panelHeight=/(!Panel:!Size:y) /(!If:/(!Property:Size))ctrlWidth=/(!Size:x) ctrlHeight=/(!Size:y)/(!If) /(!If:/(!Property:Position))top=/(!Position:y)/(!If)
/(!If)
/(!If)
/(!If)