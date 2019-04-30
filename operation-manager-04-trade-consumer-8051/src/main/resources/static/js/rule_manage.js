// *******************************************
//              common                      **
// *******************************************
    function createYear(isTop,num){
        var d = new Date();
        var y = d.getYear();
        var sel = $C("select");
        if (isTop){
            var topOp = $C("option");
            sel.options.add(topOp);
            topOp.innerText = "年份";
            topOp.value = "";
        }
        var op;
        for (i = 0 ; i < num ; i++){
            op = $C("option");
            sel.options.add(op);
            op.innerText = d.getYear() + i;
            op.value = d.getYear() + i;
        }
        return sel;
    }

    function createMonth(isTop){
        var sel = $C("select");
        if (isTop){
            var topOp = $C("option");
            sel.options.add(topOp);
            topOp.innerText = "月份";
            topOp.value = "";
        }
        var op;
        for (i = 1 ; i <= 12 ; i++){
            op = $C("option");
            sel.options.add(op);
            if (i.toString().length == 1){
                op.innerText = "0" + i;
                op.value = "0" + i;
            }else {
                op.innerText = i;
                op.value = i;
            }
        }
        return sel;
    }

	function createDay(isTop,year,month){
	    var sel = $C("select");
	    if (isTop){
            var topOp = $C("option");
            sel.options.add(topOp);
            topOp.innerText = "日期";
            topOp.value = "";
        }
	    var day;
	    var day31 = new Array("01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31");
	    var day30 = new Array("01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30");
	    var day29 = new Array("01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29");
	    var day28 = new Array("01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28");
	    switch(month){
	        case '02':
	            if (year%4 == 0 && (year%100 != 0 || year%400 == 0)){
	                day = day29;
	                break;
	            }
	            else{
	                day = day28;
	                break;
	            }
	        case '04':
	            day = day30;
	            break;
	        case '06':
	            day = day30;
	            break;
	        case '09':
	            day = day30;
	            break;
	        case '11':
	            day = day30;
	            break;
	        default:
	            day = day31;
	    }


	    for (i = 0,len = day.length ; i < len ; i++){
	        opt = $C("option");
	        sel.options.add(opt);
	        opt.value = day[i];
	        opt.innerText = day[i];
	    }
	    return sel;
	}

	function createHour(isTop){
        var sel = $C("select");
        if (isTop){
            var topOp = $C("option");
            sel.options.add(topOp);
            topOp.innerText = "时间";
            topOp.value = "";
        }
        var op;
        for (i = 0 ; i <= 23 ; i++){
            op = $C("option");
            sel.options.add(op);
            if (i.toString().length == 1){
                op.innerText = "0" + i;
                op.value = "0" + i;
            }else {
                op.innerText = i;
                op.value = i;
            }
        }
        return sel;
    }
// *******************************************
//              common                      **
// *******************************************

    var operOptions;

    function bodyOnload(){

       op1 = $C("option");

       op1.innerText="业务类型";
       op1.value="treatRequest.bizType";

       op2 = $C("option");
       op2.innerText="交易类型";
       op2.value="treatRequest.tradeCode";

       op3 = $C("option");
       op3.innerText="交易金额";
       op3.value="treatRequest.FUND";

       op4 = $C("option");
       op4.innerText="支付智能卡";
       op4.value="treatRequest.tradeUser";

       op5 = $C("option");
       op5.innerText="交易发起地点";
       op5.value="treatRequest.tradeLoc";

       op6 = $C("option");
       op6.innerText="交易请求系统";
       op6.value="treatRequest.tradeProcess";

       op7 = $C("option");
       op7.innerText="交易发起时间";
       op7.value="treatRequest.tradeStartTime";


       operOptions = [op1,op2,op3,op4,op5,op6,op7];

    }

	function addNewRule(){

	   var tbody = $C("tbody");
	   var tr = $C("tr");

	   // col1
	   var td1 = $C("td");
	   td1.innerText="并且";
	   tr.appendChild(td1);

	   // col2
	   var td2 = $C("td");
	   var sel = createSelect("sel"+num,operOptions,operOptions[num%operOptions.length].value);
	   sel.setAttribute("kubun","changeSel");
	   sel.onchange = function(){createOperation(this.id,this.value);createValueObj(this.id,this.value);j_clear_and_refresh();};
	   td2.appendChild(sel);
	   tr.appendChild(td2);

	   // col3
	   var td3 = $C("td");
	   var sel1 = createSelect("sel"+num+"_sub");
	   sel1.style.width="100";
	   createOperation("sel"+num,sel.value,sel1);
	   td3.appendChild(sel1);
	   tr.appendChild(td3);

	   // col4
       var td4 = createValueObj("sel"+num,sel.value);
       tr.appendChild(td4);

       // col5
       var td5 = $C("td");
       var delLink = $C("a");
	   delLink.setAttribute("href","#");
       delLink.setAttribute("innerText","[删除]");
       delLink.setAttribute("tbodyId","row" + num);
       delLink.onclick = function(){$("ruleTable").removeChild(tbody)};
       td5.appendChild(delLink);
       tr.appendChild(td5);

	   tbody.appendChild(tr);
	   tbody.setAttribute("id","row" + num);
	   $("ruleTable").appendChild(tbody);

	   num = num + 1;
	}


	function createOperation(pId,pValue,sel){
	    if (null == sel){
	       sel = $(pId + "_sub");
	    }
	    var len = sel.options.length;
	    var equalOption = $C("option");
	    var lessOption = $C("option");
	    var moreOption = $C("option");
	    var startsWithOption = $C("option");
	    var endsWithOption = $C("option");
	    var containsOption = $C("option");
	    var equalsOption = $C("option");
	    switch (pValue) {
		   case "treatRequest.bizType":

		   case "treatRequest.tradeCode":
		      sel.options.add(equalOption);
		      break;

		   case "treatRequest.tradeStartTime":
              sel.options.add(lessOption);
              sel.options.add(moreOption);
              sel.options.add(equalOption);
              break;

		   case "treatRequest.FUND":
		      sel.options.add(equalOption);
              sel.options.add(lessOption);
              sel.options.add(moreOption);
              break;
		   default :
		      sel.options.add(startsWithOption);
              sel.options.add(endsWithOption);
              sel.options.add(containsOption);
              sel.options.add(equalsOption);
        }
        equalOption.innerText = "等于";
        equalOption.value = "==";
        moreOption.innerText = "大于";
        moreOption.value = ">";
        lessOption.innerText = "小于";
        lessOption.value = "<";
        startsWithOption.innerText="开头匹配";
        startsWithOption.value=".startsWith";
        endsWithOption.innerText="结尾匹配";
        endsWithOption.value=".endsWith";
        containsOption.innerText="包含";
        containsOption.value=".contains";
        equalsOption.innerText="相等";
        equalsOption.value=".equals";
        for (i = 0 ; i < len ; i++){
        	sel.removeChild(sel.options[0]);
        }
    }

	function createValueObj(pId,pValue){
	    var td;
	    var finalId = pId + "_child";
	    if (null == $(pId + "_td")){
	       td = $C("td");
	    }else {
	       td = $(pId + "_td");
	       while(td.children(0)){
	       	td.removeChild(td.children(0));
	       }
	    }

	    td.id = pId + "_td";
	    var obj;
	    switch (pValue) {
           case "treatRequest.bizType":
              obj = createBizTypeSel();
              break;
           case "treatRequest.tradeCode":
              obj = createTradeTypeSel();
              break;

           case "treatRequest.tradeStartTime":
              obj = createTime(pId);
              break;

           case "treatRequest.FUND":
              finalId = finalId + "_sum";
              obj = createText();
              break;
           default :
              obj = createText();

        }
        obj.id = finalId;
        td.appendChild(obj);
        return td;
    }

	function createSelect(id,ops,val){

        var sel = $C("select");
        sel.id = id;
        if (null == ops){
            return sel;
        }
        for (i = 0,len = ops.length ; i < len ; i++){
            var op = $C("option");
            sel.options.add(op);
            op.innerText = ops[i].innerText;
            op.value = ops[i].value;

            if (val == ops[i].value){

                op.selected = true;
            }
        }
        return sel;
    }

    function createTime(pId){
        var d = new Date();
        var div = $C("div");
		div.subId = pId;
        var year = createYear(true,10);
        year.id = pId + "_year";
        div.appendChild(year);
        year.onchange = function(){
                            if ($(pId + "_day")) {
                                div.removeChild($(pId + "_day"));
                            }
                            div.removeChild($(pId + "_hour"));
                            day = createDay(true,this.value,$(pId + "_month").value);
                            day.id = pId + "_day";
                            div.appendChild(day);

                            hour = createHour(true);
                            hour.id = pId + "_hour";
                            div.appendChild(hour);
                            j_reset_in_scope(div.id);
                        };

        var month = createMonth(true);
        month.id = pId + "_month";
        div.appendChild(month);
        month.onchange = function(){
                            if ($(pId + "_day")) {
                                div.removeChild($(pId + "_day"));
                            }
                            div.removeChild($(pId + "_hour"));
                            day = createDay(true,$(pId + "_year").value,this.value);
                            day.id = pId + "_day";
                            div.appendChild(day);

                            hour = createHour(true);
                            hour.id = pId + "_hour";
                            div.appendChild(hour);
                            j_reset_in_scope(div.id);
                         };

        var day = createDay(true,d.getYear(),"01");
        day.id = pId + "_day";
        div.appendChild(day);

        var hour = createHour(true);
        hour.id = pId + "_hour";
        div.appendChild(hour);

        return div;
    }

    function createText(id){
        var obj = $C("<input type='text' class='text_contant' />");
        return obj;
    }


    function createNewRule(){
    	if (!checkNewRule()){
    		return;
    	}
        var ruleStr = "";
        var desp = "如果 ";
        $("ruleText").innerText = "";
        var tBodys = $("ruleTable").getElementsByTagName("tbody");

        for (i = 0,len = tBodys.length ; i < len;i++){
            tds = tBodys[i].getElementsByTagName("td");
            v1 = tds[1].children(0).value;
            v2 = tds[2].children(0).value;
            value = getValue(tds[3],v1,v2);
            if (!value){
            	return;
            }
            t1 = tds[1].children(0).options[tds[1].children(0).selectedIndex].text;
            t2 = tds[2].children(0).options[tds[2].children(0).selectedIndex].text;

            text = getText(tds[3],t1,t2);
            if (i == len - 1){
                ruleStr = ruleStr + value;
                desp = desp + text;
            }else {
                ruleStr = ruleStr + value + " && ";
                desp = desp + text + " 并且 ";
            }
        }

        var res = $("res").options[$("res").selectedIndex].text;
        $("ruleText").innerText = ruleStr;
        $("description").value = desp + " 则 " + res;
    }

    function checkNewRule(){
    	var ts = $("ruleTable").getElementsByTagName("input");
    	for (i = 0 , len = ts.length ; i < len ; i++){
    		o = ts[i];
    		if (o.type.toLocaleLowerCase() == "text"){
    			if (o.value == ""){
					alert(ERR_EMPTY);
    				o.focus();
    				return false;
    			}else if (o.id.indexOf("_sum") != -1 && !isFund(o.value)){
					alert(ERR_MONEY);
					o.focus();
					return false;
    			}
    		}
    	}
    	return true;
    }

    function getValue(obj,v1,v2){
        var subNode = obj.children(0);

        if (subNode.tagName.toLocaleLowerCase() == "div"){
        	var id = subNode.subId;
        	var year = $(id + "_year").value;
            var month = $(id + "_month").value;
            var day = $(id + "_day").value;
            var hour = $(id + "_hour").value;
			if (year+month+day+hour == ""){
				alert(ERR_EMPTY_DATE);
				return false;
			}
            var yyyy = year == "" ? "" : "yyyy";
            var MM = month == "" ? "" : "MM";
            var dd = day == "" ? "" : "dd";
            var hh = hour == "" ? "" : "HH";
            var res = "new SimpleDateFormat(\""+yyyy+MM+dd+hh+"\").format("+v1+")" + v2 + "\"" + year+month+day+hour + "\"";

            return res;
        }else if(subNode.tagName.toLocaleLowerCase() == "select"){
            return v1 + v2 + "\"" + obj.children(0).value + "\"";
        }else if(subNode.id.indexOf("_sum") != -1){
            return v1 + v2 + obj.children(0).value;
        }else{
            return v1 + v2 + "(\"" + obj.children(0).value + "\")";
        }
    }

    function getText(obj,t1,t2){
        var subNode = obj.children(0);

        if (subNode.tagName.toLocaleLowerCase() == "div"){
        	var id = subNode.subId;
            var year = $(id + "_year").value;
            year = year == "" ? "" : year + "年";
            var month = $(id + "_month").value;
            month = month == "" ? "" : month + "月";
            var day = $(id + "_day").value;
            day = day == "" ? "" : day + "日";
            var hour = $(id + "_hour").value;
            hour = hour == "" ? "" : hour + "点";
            return t1 + t2 + year + month + day + hour;
        }else if(subNode.tagName.toLocaleLowerCase() == "select"){
            return t1 + t2 + "‘" + obj.children(0).options[obj.children(0).selectedIndex].text + "’";
        }else{
            return t1 + t2 + "‘" + obj.children(0).value + "’";
        }
    }

    function switchMode(chk){
		if (chk.checked == true){
			$("ruleText").readOnly = false;
		}else {
			$("ruleText").readOnly = true;
		}
    }

    function check(){
    	if ($("ruleText").innerText == ""){
    		alert("没有生成审核规则");
    		return false;
    	}
    }