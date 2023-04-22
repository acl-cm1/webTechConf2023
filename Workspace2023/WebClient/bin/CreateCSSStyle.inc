function createCSSStyle(styleBody, pnl){
	// Method to create Styles dynamically
	var headSection = document.getElementsByTagName('head')[0] ;
	var sectID = 'extraStyles' + pnl;
	var styleElem = document.getElementById(sectID);
	if (!styleElem){
		styleElem = document.createElement('style');
		styleElem.id = sectID ;
		styleElem.type= 'text/css';
		styleElem.media= 'screen';
		headSection.appendChild(styleElem);
	}
	if(styleElem.styleSheet) {
		styleElem.styleSheet.cssText += styleBody;// IE method
	} else {
		styleElem.appendChild(document.createTextNode(styleBody));// others
	}	
}

function removeCSSStyles(pnl){
	// Remove all document styles created from the CreateCSSStyle Method
	var headSection = document.getElementsByTagName('head')[0] ;
	var styleElem = document.getElementById('extraStyles' + pnl);
	if (styleElem) {
		headSection.removeChild(styleElem) ;
	}
}