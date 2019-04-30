	/* 全部选择 */
	function selAll(s)
	{
	  var e=document.getElementsByName(s);
    for(var i=0;i <e.length;i++){e[i].checked=true;}
	}
	/* 全部取消选择 */
	function cancelAll(s)
	{
    var e=document.getElementsByName(s);
    for(var i=0;i <e.length;i++){e[i].checked=false;}
	}
	/* 只允许数字 */
	function onlyNum(o){
		var num = o.value;
	  if (notInt(num)==true){
		  o.value="";
	  	alert("请输入数字！");
	  	return;
	  }
  	return ;
	}
	/* 数字判断 */
	function notInt(num){
		var reg = /[^0-9]/g;
		return reg.test(num);
	}
	/* 输入判断，用于新建和修改代金券 */
	function checkInput(){
		var name = document.getElementById("name").value;
    		if (name == ""){
    			alert("请填写代金券名称！");
    			return false;
    		}
    		if ($('parValue').value == ""){
    			alert("请填写面额！");
    			return false;
	    	//} else if (notInt($('parValue').value)==true){
	    	//	alert("面额请填写整数！");
    		//	return false;
	    	} else if (parseFloat($('parValue').value) <= 0){
	    		alert("面额请填写正数！");
    			return false;
	    	}
	    	if ($('amount').value == ""){
    			alert("请填写发行总量！");
    			return false;
	    	} else if (parseInt($('amount').value)<=0){
	    		alert("发行总量请填写正整数！");
    			return false;
	    	}
				/*
    		var bids = document.getElementById("business").value;
    		if (bids == ""){
    			alert("请选择业务！");
    			return false;
	    	}*/

	    	var bizs = document.getElementsByName("biz");
	    	for (var i = 0; i < bizs.length; i++){
	    		if (bizs[i].checked){
	    			var flg=true;
	    			break;
	    		}
	    	}
	    	if (flg==undefined){alert("请选择业务！");	return false;}

	    	if (parseInt($('limitCount').value)<=0){
	    		alert("限制张数请填写正整数！");
    			return false;
	    	}

	    	if (parseFloat($('limitRatio').value)<=0){
	    		alert("限制比例不能为零！");
    			return false;
	    	}

	    	if ($('issueStartDate').value == ""){
    			alert("请填写发行起始时间！");
    			return false;
	    	} else if(dateValidate($('issueStartDate').value)==false){
	    		warn("发行起始时间");return ;
	    	}
	    	if(comDate(((new Date()).Format("yyyy/MM/dd")), $('issueStartDate').value) == 1){
	    		alert("发行起始时间不应早于今天！");
    			return false;
	    	}
	    	if ($('issueEndDate').value == ""){
    			alert("请填写发行终止时间！");
    			return false;
	    	}else if(dateValidate($('issueEndDate').value)==false){
	    		warn("发行中止时间");return false;
	    	}else if(comDate($('issueEndDate').value, $('issueStartDate').value) == -1){
	    		alert("发行中止时间不能早于发行起始时间");return false;
	    	}

	    	if ($('beginDate').value == ""){
    			alert("请填写有效期限起点！");
    			return false;
	    	}else if(dateValidate($('beginDate').value)==false){
	    		warn("有效期限起点");return false;
	    	} else if(comDate($('beginDate').value, $('issueStartDate').value) == -1){
	    		alert("有效期限起点不能早于发行起始时间");return false;
	    	}
	    	if ($('endDate').value == ""){
    			alert("请填写有效期限终点！");
    			return false;
	    	}else if(dateValidate($('endDate').value)==false){
	    		warn("有效期限终点");return false;
	    	}else if(comDate($('endDate').value, $('beginDate').value) == -1){
	    		alert("有效期限终点不能早于有效期限起点");return false;
	    	}else if(comDate($('endDate').value, $('issueEndDate').value) == -1){
	    		alert("有效期限终点不能早于发行终止时间");return false;
	    	}
	    	var description = document.getElementById("description").value;
    		if (description.length > 250){
    			alert("描述不能超过250个汉字！");
    			return false;
    		}
	   return true;
	}
	/* 日期格式错误提示 */
	function warn(s){
		alert(s + ":输入格式不正确！");
	}


