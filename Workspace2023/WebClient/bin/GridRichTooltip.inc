dojo.addOnLoad(function() {
	var tooltipFlds = "/(!Param:tooltipfields)";
	var hoverShowDelay = /(!Param:showdelay);
	var gridId = /(!GridP:!NameID);
	dojo.connect(dijit.byId(gridId.id), "postrender", function() {
		wcli.util.XBrowser.setupTooltip(tooltipFlds,"/(!Edit:!Name)", hoverShowDelay, gridId);
	});
 });