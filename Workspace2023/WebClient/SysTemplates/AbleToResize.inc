var ableToResize = true;
/(!If:/(!IsDefined:MinimumPanelRes))
	ableToResize = wcli.util.XBrowser.isAbleToResize(/(MinimumPanelRes));
/(!If)

/(!If:/(!Param:Type1))
	//Use this code when the control is: WebPushbutton, WebGridExport, WebCheckbox
	if(document.getElementById("/(!NameID)") && ableToResize === true){
		wcli.util.XBrowser.resizeCtrl(document.getElementById("/(!NameID)"));
	}
/(!If)
/(!If:/(!Param:Type2))
	//Use this code when the control is: WebFilteringEdit, WebCombo
	if(ableToResize  === true){
		wcli.util.XBrowser.fixedPositionEdit("/(!NameID)", "/(!Mode)");
	}
/(!If)
/(!If:/(!Param:Type3))
	//Use this code when the control is: WebLabel, WebList, WebMultilineEdit (JSOnLoad, SetState), WebStatic, WebTextbox
	if(document.getElementById("/(!NameID)") && ableToResize === true){
		wcli.util.XBrowser.resizeDiv(document.getElementById("/(!NameID)"));
	}
/(!If)
/(!If:/(!Param:Type4))
	//Use this code when the control is: DojoTab (JSOnLoad, JSPost)
	if (typeof /(!NameID)_PostResizeTab === "undefined" && ableToResize === true){
        /(!NameID)_PostResizeTab = dojo.connect(window, "onresize", function(){
            if(dijit.byId("/(!NameID)")){
                dijit.byId("/(!NameID)").tabRescaling();
            }else if(document.getElementById("/(!NameID)")){
                dijit.byNode(document.getElementById("/(!NameID)")).tabRescaling();
            }
        });
    }
/(!If)
/(!If:/(!Param:Type5))
	//Use this code when the control is: WebGrid (JSOnLoad, JSPost)
	if (typeof /(!NameID)_PostResizeGrid === "undefined" && ableToResize === true){
        var d = dijit.byId("/(!NameID)"); 
        /(!NameID)_PostResizeGrid = dojo.connect(window, "onresize", function(){ 
            if(!dojo.query("[class *= dijitDialog dijitContentPane detailDialog]").length >= 1){
                d = dijit.byId("/(!NameID)");
            }               
            if(d)
            d.gridRescaling();
        });
    }
/(!If)