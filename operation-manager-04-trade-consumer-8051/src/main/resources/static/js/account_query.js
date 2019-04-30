// *******************************************
//              账务查询相关js                **
// *******************************************
function comDateInQuery(str1,str2){
	var beginDate = document.getElementById(str1).value;
	var endDate = document.getElementById(str2).value;
	if (beginDate.trim()!="" && endDate.trim()!=""){
		if (comDate(beginDate.trim(),endDate.trim()) == 1){
			alert("会计结束日期不得早于开始日期!");
			return 1;
		}
	}
	return 0;
}
