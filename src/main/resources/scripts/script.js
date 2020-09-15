//TODO: Implement GET parameters of the request;
//TODO: Implement visual effects for running the search;

$(document).ready( function(){
	$('#nocInput').flexdatalist(setLimits('../json/nocOptions.json', 5, '{value}'));
	$('#provinceInput').flexdatalist(setLimits('../json/provinces.json', 3, '{value}, {label}'));
	
	$('#searchFormId').on('submit', function(event){
		event.preventDefault();		
		var noc, province = [];
		var resultQuery;
		noc = $('#nocInput').val();
		province = $('#provinceInput').val();
		if(noc.length == 0 ){
			noc = $('#nocInput').val('0000').val();
			$('#nocInput').flexdatalist(setLimits('../json/nocOptions.json', 1, '{value}'));
		}
		if(province.length ==0){
			province = $('#provinceInput').val('0000').val();
			$('#provinceInput').flexdatalist(setLimits('../json/provinces.json', 1, '{value}, {label}'));

		}
		
		resultQuery = "noc=" + noc + "&" + "province=" + province;
		
		alert(resultQuery);
	});
});

function setLimits(dataJsonPath, valuesLimit, textPropertyValue){
	var limits = {
		selectionRequired: 1,
		limitOfValues: valuesLimit,
		data: dataJsonPath,
		valueProperty: '{value}',
		textProperty: textPropertyValue,
		visibleProperties: ["value","label"],
		searchIn: 'value',
		minLength: 1
		}
	return limits; 
}