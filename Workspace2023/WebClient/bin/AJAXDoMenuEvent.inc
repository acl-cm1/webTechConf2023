if (!window./(!Panel:!NameID)_submitter)
	return;
if (window./(!Panel:!NameID)_submitter.onsubmit)
	window./(!Panel:!NameID)_submitter.onsubmit();
dojo.xhrPost({
	form: /(!Panel:!NameID)_form,
	content: { _type: 'json', ctlact: '/(!NameID):/(!Param:phys)', pnlid: /(!Panel:!NameID)_pnlid, focus: '', websessid: window.websessid },
	load: function(data, ioArgs) {
	 //Code starts to manage session timeout in ajax requests.
		var headerstring = ioArgs.xhr.getResponseHeader('Content-Type');
		var headers = headerstring.split(';');
		if (headers && (typeof data != 'object')) {
			if (headers[0].toLowerCase() != 'text/json' && headers[0].toLowerCase() != 'application/json')
				window.location.href = ioArgs.url;
		}
           //Code ends to manage session timeout in ajax requests.    	
		data.main(data);
	},
	preventCache: true,
	handleAs: 'json'	
});