/(!If:/(!Param:in))
	dojo.fadeIn({ node: dijit.byId("/(!NameID)").domNode }).play();
/(!If)

/(!If:/(!Param:out))
	dojo.fadeOut({ node: dijit.byId("/(!NameID)").domNode }).play();
/(!If)
