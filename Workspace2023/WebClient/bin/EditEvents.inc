if (dijit.byId("/(!NameID)")) {
	(function() {
		var ctl = dijit.byId("/(!NameID)");
		var tb = ctl["/(!Param:node)"];
		
		if (ctl.editEventsCalled) {
			return;
		}
		ctl.editEventsCalled = true;

		/(!If:/(!DataType)=Date)
		dojo.connect(ctl, "onChange", ctl, function(e) {
			/(!If:/(!Event:phys=Modified))
				/(!AJAXDoEvent:phys=Modified)
			/(!If)
			/(!If:/(!Event:phys=Updated))
				/(!AJAXDoEvent:phys=Updated)
			/(!If)
		});
		/(!Else)
		var modified = dojo.hitch(ctl, function(e) {
			if(e.keyCode == dojo.keys.TAB){
		  	 	window.modifiedBlockFocus = true;
				return;
		    }
		    window.modifiedBlockFocus = false;
			this._changed = true;
			ctl.value = ctl.textbox.value; 
			/(!If:/(!Event:phys=Modified))
				/(!AJAXDoEvent:phys=Modified)
			/(!If)
		});
		var modifiedIE = function(e) {
			if (e.keyCode == dojo.keys.DELETE ||
					e.keyCode == dojo.keys.BACKSPACE ||
					e.keyCode >= 48 && e.keyCode <= 90 ||
					e.keyCode >= 96 && e.keyCode <= 107 ||
					e.keyCode >= 109 && e.keyCode <= 111
					) {
				return modified(e);
			}
		};
		var updated = dojo.hitch(ctl, function(e) {
			if (this._changed && !window.dialogIsOpen) {
				/(!If:/(!Event:phys=Updated))
					/(!AJAXDoEvent:phys=Updated)
				/(!If)
				this._changed = false;
			}
		});
		dojo.connect(ctl, "_onChange", ctl, updated);
		if (dojo.isIE) {
			dojo.connect(tb, "onpaste", ctl, modifiedIE);
			dojo.connect(tb, "onkeyup", ctl, modifiedIE);
		}
		else {
			dojo.connect(tb, "oninput", ctl, modified);
		}
		/(!If)
	})();
}