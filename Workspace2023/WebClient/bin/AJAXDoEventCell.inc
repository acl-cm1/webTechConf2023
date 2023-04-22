var doEventOp = function() {
	if (window./(!Panel:!NameID)_submitter.onsubmit)
		window./(!Panel:!NameID)_submitter.onsubmit();
	dojo.xhrPost({
		form: /(!Panel:!NameID)_form,
		content: { _type: 'json', ctlact: '/(!Edit:!NameID):/(!Param:phys)', pnlid: /(!Panel:!NameID)_pnlid, focus: '/(!Edit:!NameID)', websessid: window.websessid  },
		load: function(data, ioArgs) {
			data.main(data);
		},
		preventCache: true,
		handleAs: 'json'	
	});
};
if (window.editGridWait) {
	dojo.connect(window.editGridWait, 'onEditGridApplied', doEventOp);
} else {
	doEventOp();
}