var doEventOp = function() {
	dojo.xhrPost({
		form: /(!Panel:!NameID)_form,
		content: {
			_type: 'json',
			_noautorefresh: 'true',
			pnlid: /(!Param:pnlid),
			wndact: '/(!Param:phys)',
			websessid: window.websessid
		},
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