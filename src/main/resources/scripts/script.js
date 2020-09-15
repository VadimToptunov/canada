//TODO: Implement GET parameters of the request;
//TODO: Implement visual effects for running the search;

$(document).ready( function(){
	$('#nocInput').flexdatalist({
		selectionRequired: 1,
		limitOfValues: 5,
		data: '../json/nocOptions.json',
		valueProperty: 'value',
		textProperty: '{value}',
		visibleProperties: ["value","label"],
		searchIn: 'value',
		minLength: 1
		});
		
	$('#provinceInput').flexdatalist({
		selectionRequired: 1,
		limitOfValues: 3,
		data: '../json/provinces.json',
		valueProperty: '{value}',
		textProperty: '{value}, {label}',
		visibleProperties: ["value","label"],
		searchIn: 'value',
		minLength: 1
		});
	
	$('#searchFormId').on('submit', function(event){
		event.preventDefault();		
		var noc, province = [];
		var resultQuery;
		noc = $('#nocInput').val();
		province = $('#provinceInput').val();
		if(noc.length == 0 ){
			noc = $('#nocInput').val('0000').val();
		}
		if(province.length ==0){
			province = $('#provinceInput').val('0000').val();
		}
		
		resultQuery = "noc=" + noc + "&" + "province=" + province;
		
		alert(resultQuery);
	});
});