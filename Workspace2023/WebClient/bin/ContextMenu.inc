  /(!If:/(!Property:RightContextMenu))
	   dojo.addOnLoad(function() {
	   	   var menu = dijit.byId("menu-/(!FindControl:/(!Property:RightContextMenu):!NameID)");
	   	   if (menu) {
	   	   		if(dijit.byId("/(!NameID)")){
	       			menu.bindDomNode(dijit.byId("/(!NameID)").domNode);
	       			dijit.byId("/(!NameID)").contextmenu = menu;
	       		}
	       		else{
	       			menu.bindDomNode(document.getElementById("/(!NameID)"));
	       		}
	       }
	   });
  /(!If)
  
    /(!If:/(!Property:LeftContextMenu))
	   dojo.addOnLoad(function() {
	   	   var menu = dijit.byId("menu-/(!FindControl:/(!Property:LeftContextMenu):!NameID)");
	   	   if (menu) {
	   	   		if(dijit.byId("/(!NameID)")){
	       			menu.bindDomNode(dijit.byId("/(!NameID)").domNode);
	       			dijit.byId("/(!NameID)").contextmenu = menu;
	       		}
	       		else{
	       			menu.bindDomNode(document.getElementById("/(!NameID)"));
	       		}
	       }
	   });
  /(!If)
