dojo.addOnLoad(function() {
	var tooltipFlds = [/(!Param:tooltipfields)];
	var hoverShowDelay = /(!Param:showdelay);
	wcli.util.XBrowser.setupTooltip(tooltipFlds,"/(!NameID)", hoverShowDelay);
 });