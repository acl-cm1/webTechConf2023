/(!If:/(!Property:MenuItem))
if (window./(!Panel:!NameID)_submitter.onsubmit)
	window./(!Panel:!NameID)_submitter.onsubmit();
dojo.xhrPost({
	form: /(!Panel:!NameID)_form,
	content: { _type: 'json', ctlact: '/(!FindControl:/(!Property:MenuItem):!NameID):/(!Param:phys)', pnlid: /(!Panel:!NameID)_pnlid, focus: '/(!NameID)', websessid: window.websessid },
	load: function(data, ioArgs) {
		data.main(data);
	},
	preventCache: true,
	handleAs: 'json'	
});
/(!If)