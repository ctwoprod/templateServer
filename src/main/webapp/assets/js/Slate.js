$(function () {
	
	// PAGING BEGIN
	handleGoToPage = function(el, page) {
		el.preventDefault();
		numpage = $('#paging_numpage').val();
	//	alert('kampret ' + $('#searchPar').val() );
		$('#numPage').val(numpage);
		//$('#searchPage').val(0);
		//if ($('#defaultSearchField').val() != "" && typeof($('#defaultSearchField').val()) != "undefined"){
		if ($('#searchPar').val() != "" && typeof($('#searchPar').val()) != "undefined"){	
			$('#activePageBar').val(page);
			$('#searchForm').submit();	
		} else {
			$('#activePage').val(page);
			$('#pagingForm').submit();	
		}
	};
	
	goToPage = function(el, lenNumPage) {
		el.preventDefault();
		
		page = $('#inpGoTo').val();
		if (parseInt(page) > parseInt(lenNumPage)){
			alert('Nilai Page Maksimal = ' + lenNumPage);
			return;
		}
		
		handleGoToPage(el, page);
		
		
	};

	// PAGING END
	submitSearch = function(ev){
		ev.preventDefault();
		$('#searchPar').val(1);
		$('#searchForm').submit();
	};	

});