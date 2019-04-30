// *******************************************
//              结算管理页面脚本                 **
// *******************************************
  function switchTab(index, contextPath){
    document.getElementById("tab1").background = (index == 1 ? contextPath + "/images/body_title_bg2.gif" : "");
    document.getElementById("tab2").background = (index == 1 ? contextPath + "/images/nomoral_tab_bgl.gif" : contextPath + "/images/body_title_bg2.gif");
  }

	/* 供应商提现 */
  function result_settlementaccount(resultId){
    result_submit_form('toSettlementAccount');
  }
  /* 人工结算 */
  function result_settlement(){
    result_submit_form('toSettlement');
  }
	/* 结算结果提交 */
  function result_submit_form(methodName) {
    window.document.forms[0].action="settlementResultAction.do?method=" + methodName;
    window.document.forms[0].submit();
  }
	/* 查询结算结果列表 */
	function result_query_method() {
		var beginDate = $('beginDate').value;
		var endDate = $('endDate').value;
		if(beginDate != '' && !dateValidate(beginDate)){
      alert('请输入正确的结算起始时间！');
      return false;
    }
    if(endDate != '' && !dateValidate(endDate)) {
      alert('请输入正确的结算终止时间！');
      return false;
    }
    if(beginDate != '' && endDate != '' && comDate(beginDate, endDate) > 0){
      alert('结算结束时间不得早于开始时间！');
      return false;
    }
    window.document.forms[0].action="settlementResultAction.do?method=query&type=init";
    window.document.forms[0].submit();
	}

	/* 查询结算结果列表 */
	function resultExcel() {
		loading();
	    window.document.forms[0].action="settlementResultAction.do?method=excel";
	    window.document.forms[0].submit();
	    window.document.forms[0].action="settlementResultAction.do?method=query";
	    excelCallback();
	}

	/* 供应商联动余额 */
  function result_getbalance(providerSlc){
		var lbl = window.document.getElementById('balanceLbl');
    if(lbl.hasChildNodes()){
      lbl.removeChild(lbl.firstChild);
    }
    if(providerSlc.selectedIndex == -1 || providerSlc.value == ''){
      window.document.getElementById('settlementAmount').disabled = true;
      return;
    }
    window.document.getElementById('settlementAmount').disabled = false;

    var providerId = providerSlc.value;
    var xmlHttpReq = null;
		if(window.XMLHttpRequest){
			xmlHttpReq = new XMLHttpRequest();
		}else if(window.ActiveXObject){
	  	try{
		  	xmlHttpReq = new ActiveXObject("Msxml2.XMLHTTP");
			}catch(e){
		  	xmlHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
			}
		}
		if(!xmlHttpReq){
	  	return;
		}
		xmlHttpReq.onreadystatechange = function(){
	  	if(xmlHttpReq.readyState != 4 || xmlHttpReq.status != 200){
	    	return;
	  	}
	  	var balance = xmlHttpReq.responseText;
	  	if (balance.indexOf("Session已过期") > -1 || balance.indexOf("expired") > -1 ){
	  		alert("Session已过期，请重新登录");
	  		location.href="../adminMainAction.do?method=loginOut";
	  		return;
	  	}
			lbl.appendChild(window.document.createTextNode(balance));
			$('settlementAmount').value="";
			$('warrant').value="";
			$('description').value="";
			$('err').innerText="";
		}
		xmlHttpReq.open('GET','settlementResultAction.do?method=getProviderBlance&providerId='+providerId,true);
		xmlHttpReq.send();
  }

  /* 查询待结算数据 */
  function result_querycustody(){
    var providerSlc = window.document.getElementById('providerId');
    if(providerSlc.selectedIndex == -1 || providerSlc.value == '') {alert('请选择供应商！');return false;}
    var beginDate = window.document.getElementById('tradeBeginDate').value;
		var endDate = window.document.getElementById('tradeEndDate').value;

		if(beginDate == '') { alert('请选择会计开始日期！'); return false;	}
    if(endDate == '') { alert('请选择会计结束日期！');return false;}
		if(!dateValidate(beginDate)){alert('请选择正确的会计开始日期！');return false;}
    if(!dateValidate(endDate)) {alert('请选择正确的会计结束日期！');return false;}
    if(comDate(beginDate, endDate) > 0){alert('会计结束日期不得早于会计开始日期！');return false;}
    result_submit_form('queryCustodyRecord');
  }

  /* 响应供应商下拉列表变化事件 */
  function result_getbiztype(providerSlc) {
    var bizSlc = window.document.getElementById('biz');
    while(bizSlc.hasChildNodes()) {
      bizSlc.removeChild(bizSlc.firstChild);
    }
    if(providerSlc.selectedIndex == -1 || providerSlc.value == ''){
      window.document.getElementById('biz').disabled = true;
      return;
    }
    window.document.getElementById('biz').disabled = false;
    var providerId = providerSlc.value;
    var xmlHttpReq = null;
		if(window.XMLHttpRequest){
			xmlHttpReq = new XMLHttpRequest();
		}else if(window.ActiveXObject){
	  	try{
		  	xmlHttpReq = new ActiveXObject("Msxml2.XMLHTTP");
			}catch(e){
		  	xmlHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
			}
		}
		if(!xmlHttpReq){ return;}
		xmlHttpReq.onreadystatechange = function(){
		  if(xmlHttpReq.readyState != 4 || xmlHttpReq.status != 200){return;}
	 		bizSlc.appendChild(document.createElement("option"));
	  	var bizs = decodeURIComponent(xmlHttpReq.responseText);
	  	var bizArr = eval(bizs);
	  	var bizStr = '';
	  	for(var i = 0; i < bizArr.length; i++){
	    	var val = bizArr[i].bizid;
		    var lbl = bizArr[i].bizname;
		    if(val == '' || lbl == ''){continue;}
	  	  bizStr += val + '-SP1-' + lbl + (i == bizArr.length - 1 ? '' : '-SP2-');
	    	var anOption = document.createElement("option");
		    anOption.setAttribute('value', val);
		    anOption.appendChild(document.createTextNode(lbl));
	  	  bizSlc.appendChild(anOption);
		  }
		  window.document.getElementById('bizStr').value = bizStr;
		}
		xmlHttpReq.open('GET','settlementResultAction.do?method=queryBizType&providerId='+providerId, false);
		xmlHttpReq.send();
	}

	/* 进行人工结算 */
	function result_manualsettlement(){
    var poundageRate = window.document.getElementById('poundageValue').value;
    if(poundageRate.length == 0) {
      alert('请输入运营商分成比例！');
      return false;
    } else {
      if(poundageRate.indexOf('.')!=poundageRate.lastIndexOf('.')) {
    	  alert('请输入正确的运营商分成比例！');
        return false;
      }
      var poundagerate = poundageRate;
      while(poundagerate.indexOf('.')!=-1) {
		 		poundagerate = poundagerate.replace('.','');
	    }
  	  var num_regexp = new RegExp('^[0-9]+$');
    	if(!num_regexp.test(poundagerate)) {
	      alert('请输入正确的运营商分成比例！');
    	  return false;
  	  }
	    if(Number(poundageRate) > 100) {
  	    alert('运营商分成比例超过最大值！');
    	  return false;
	    }
  	}
  	var areaInfo = window.document.getElementById('areaInfo').value;
    if(areaInfo.length == 0) {
      alert('请输入区域！');
      return false;
    }

  	var taxRate = window.document.getElementById('taxRate').value;
  	if(taxRate.length == 0) {
      alert('请输入税率！');
      return false;
    } else {
      if(taxRate.indexOf('.')!=taxRate.lastIndexOf('.')) {
    	  alert('请输入正确的税率！');
        return false;
      }
      var taxrate = taxRate;
      while(taxrate.indexOf('.')!=-1) {
		 		taxrate = taxrate.replace('.','');
	    }
  	  var num_regexp = new RegExp('^[0-9]+$');
    	if(!num_regexp.test(taxrate)) {
	      alert('请输入正确的税率！');
    	  return false;
  	  }
	    if(Number(taxrate) > 100) {
  	    alert('税率超过最大值！');
    	  return false;
	    }
  	}
  	// 判断是否选择结算数据
		var slcedCustodys = document.getElementsByName("slcedCustodys");
		for (var i=0;i<slcedCustodys.length;i++){
			if(slcedCustodys[i].checked){
				var ched = true;
				break;
		 	}
		}
		// 如果没有选择数据则返回
		if (ched != true){	alert('请选择结算数据！');return;}
    if (!window.confirm("确定进行人工结算？")){	return;}
    result_submit_form('settlement&isSettlement=true');
  }

  /* 供应商提现 */
  function result_getbalance_checkform() {
		var amount = window.document.getElementById('settlementAmount').value;
    if(0 == amount.length) {alert('请输入提现金额!');return false;}
    if(!isFloat(amount)) {alert('请输入正确的提现金额!');return false;}
    var lbl = window.document.getElementById('balanceLbl');
    if(window.document.getElementById('balanceLbl').hasChildNodes()) {
      var limitAmount = window.document.getElementById('balanceLbl').firstChild.nodeValue;
      if(limitAmount.length == 0) {
        return true;
      }
      if(Number(amount) > Number(limitAmount)) {
        alert('提现金额超过账户余额!');
        return false;
      }
    }
    return true;
  }
  /* 撤消结算 */
  function result_withdraw(resultId) {
    if(resultId) {
	    if(!confirm('撤消操作将会删除结算结果，并重新对原始数据计算，继续吗？')){
	      return ;
	    }
      	result_submit_form('withdraw&resultId=' + resultId);
    } else {
      	var chkboxs = window.document.getElementsByName('resultIds');
	  	var hidStatus = document.getElementsByName("hidStatus");
		for(var i = 0; i < chkboxs.length; i++){
	    	if(chkboxs[i].checked) {
	    		var ched = true;
  		    	if(hidStatus[i].value!='1'){
		    	    alert('请选择待审核的结算结果进行撤消处理！');
	      		return;
		      	}
		    }
		}
	  // 如果没有选择数据则返回
		if (ched != true){	alert('请选择撤消数据！');return;}
		if(!confirm('确认撤消结算结果？')){
	      return ;
	    }
      	result_submit_form('withdraw');
    }
  }
  /* 数据审核 */
	function result_audit(resultId) {
	  if(resultId) {
	  	if (window.confirm("确认生效结算结果？")){
      	result_submit_form('audit&resultId=' + resultId);
      }
    } else {
     	var chkboxs = window.document.getElementsByName('resultIds');
     	var hidStatus = document.getElementsByName("hidStatus");
		 	for(var i = 0; i < chkboxs.length; i++){
		   	if(chkboxs[i].checked) {
		   		var ched = true;
	      	if(hidStatus[i].value!='1'){
	      		alert('请选择待审核的结算结果进行生效处理！');
	      		return;
		     	}
		   	}
		  }
		  // 如果没有选择数据则返回
			if (ched != true){	alert('请选择待审核数据！');return;}
			if (window.confirm("确认生效结算结果？")){
      	result_submit_form('audit');
      }
    }
  }
  /* 周期结算 */
 	function period_result_settlement(){
 		var time = new Date();
		jQuery.get("settlementResultAction.do?method=periodSettlement"+"&time=" + time, function(data){
			if (data != ""){
				sumaAlert(data);
			   	return;
			}
		});
  }

	  function rule_check_form(){

    var merchantId = document.getElementById('merchantId');
    if(-1==merchantId.selectedIndex || 0 == merchantId.value.length) {
      alert('请选择商户！');
      return false;
    }

    var biz = document.getElementById('bizType');
    if(-1==biz.selectedIndex || 0 == biz.value.length) {
      alert('请选择业务！');
      return false;
    }

    var type = document.getElementById('settlementType');
    if(-1==type.selectedIndex || 0 == type.value.length) {
      alert('请选择结算方式！');
      return false;
    }

    type = type.value;
    if(type != 0 && type != 1) {
      var autoTime = document.getElementById('autoTime');
      if(-1==autoTime.selectedIndex || 0 == autoTime.value.length) {
        alert('请选择周期结算发起时间！');
        return false;
      }
    }

    var minCash = document.getElementById('minCash').value;
    var maxCash = document.getElementById('maxCash').value;
    var num_regexp = new RegExp('^[0-9]+$');
    if(minCash == '' && maxCash == '') {
      // alert('请输入交易金额范围！');
      // return false;
    } else {
      if(minCash.length!=0) {
        if(minCash.indexOf('.')!=minCash.lastIndexOf('.')) {
          alert('请输入正确的金额范围起点！');
          return false;
        }
        var mincash = minCash;
        while(mincash.indexOf('.')!=-1) {
          mincash = mincash.replace('.','');
        }
        if(!num_regexp.test(mincash)) {
          alert('请输入正确的金额范围起点！');
          return false;
        }
      }
      if(Number(minCash) > 999999999.99) {
        alert('金额范围起点超过最大值！');
        return false;
      }
      if(maxCash.length!=0) {
        if(maxCash.indexOf('.')!=maxCash.lastIndexOf('.')) {
          alert('请输入正确的金额范围终点！');
          return false;
        }
        var maxcash = maxCash;
        while(maxcash.indexOf('.')!=-1) {
          maxcash = maxcash.replace('.','');
        }
        if(!num_regexp.test(maxcash)) {
          alert('请输入正确的金额范围终点！');
          return false;
        }
      }
      if(Number(maxCash) > 999999999.99) {
        alert('金额范围起点超过最大值！');
        return false;
      }
      if(minCash.length!=0&&maxCash.length!=0&&Number(maxCash)<=Number(minCash)) {
        alert('金额范围起点应小于金额范围终点！');
        return false;
      }
    }

    var poundageType1 = document.getElementById('poundageType1');
    var poundageType2 = document.getElementById('poundageType2');
    if(!poundageType1.checked && !poundageType2.checked) {
      alert('请选择运营商分成方式！');
      return false;
    }

    var poundageType = poundageType1.checked ? poundageType1.value : poundageType2.value;
    switch(Number(poundageType)) {
      case 0:
        var poundageCash = document.getElementById('poundageCash').value;
        if(poundageCash.length == 0) {
          alert('请输入定额手续费！');
          return false;
        } else {
          if(poundageCash.indexOf('.')!=poundageCash.lastIndexOf('.')) {
            alert('请输入正确的定额手续费！');
            return false;
          }
          var poundagecash = poundageCash;
          while(poundagecash.indexOf('.')!=-1) {
		    poundagecash = poundagecash.replace('.','');
          }
          if(!num_regexp.test(poundagecash)) {
            alert('请输入正确的定额手续费！');
            return false;
          }
          if(Number(poundageCash) > 999999999.99) {
            alert('定额手续费超过最大值！');
            return false;
          }
        }
        break;
      case 1:
        var poundageRate = document.getElementById('poundageRate').value;
        if(poundageRate.length == 0) {
          alert('请输入运营商分成比例！');
          return false;
        } else {

          if(poundageRate.indexOf('.')!=poundageRate.lastIndexOf('.')) {
            alert('请输入正确的运营商分成比例！');
            return false;
          }

          var poundagerate = poundageRate;
          while(poundagerate.indexOf('.')!=-1) {
		    poundagerate = poundagerate.replace('.','');
          }

          if(!num_regexp.test(poundagerate)) {
            alert('请输入正确的运营商分成比例！');
            return false;
          }
          if(Number(poundageRate) > 100) {
            alert('运营商分成比例超过最大值！');
            return false;
          }
        }

    }

    return true;
  }
	/* 结算规则交易金额检查 */
  function rule_check_number(txtBox, maxLen, maxIntLen) {
    if(txtBox.value.length >= maxLen) {  return false;  }
    var pressedKey = window.event.keyCode;
    if(pressedKey!=46&&(pressedKey<48||pressedKey>57)) {
      return false;
    }
    if(txtBox.value.indexOf('.')!= -1 && pressedKey==46) {
      return false;
    }
    if(txtBox.value.length == 0 && pressedKey ==46) {
      return false;
    }

    if(txtBox.value.indexOf('.')!= -1 && (txtBox.value.length - txtBox.value.indexOf('.') == 3)) {
      return false;
    }

    if(maxIntLen && txtBox.value.indexOf('.')== -1 && txtBox.value.length >= maxIntLen && pressedKey!=46) {
      return false;
    }

    return true;
  }

  /* 结算方式联动结算时间 */
  function rule_fill_autotime() {
    var type = document.getElementById('settlementType');
    var autoTime = document.getElementById('autoTime');
    var redTime = document.getElementById('redTime');
    while(autoTime.hasChildNodes()) {
      autoTime.removeChild(autoTime.firstChild);
    }
    if(type.selectedIndex == -1 || type.value.length == 0 || type.value == 0 || type.value == 1) {
      autoTime.disabled = true;
      redTime.innerText = ''
      return;
    } else {
      autoTime.disabled = false;
      autoTime.appendChild(createOption('',''));
      switch (Number(type.value)) {
        case 2:
        autoTime.appendChild(createOption('星期一','2'));
        autoTime.appendChild(createOption('星期二','3'));
        autoTime.appendChild(createOption('星期三','4'));
        autoTime.appendChild(createOption('星期四','5'));
        autoTime.appendChild(createOption('星期五','6'));
        autoTime.appendChild(createOption('星期六','7'));
        autoTime.appendChild(createOption('星期日','1'));
        break;
        case 3:
        for(var i = 1; i <= 28; i++) {
          autoTime.appendChild(createOption(i, i));
        }
      }
      redTime.innerText = '*'
    }
  }

  function createOption(lbl,val) {
    var opt = document.createElement('option');
    opt.setAttribute('value', val);
    var optLbl = document.createTextNode(lbl);
    opt.appendChild(optLbl);
    return opt;
  }
  /* 查看结算规则 */
  function rule_show_rule() {
    if(!rule_check_form()) { return; }
    var msg = '交易金额范围: ';
    var minCash = document.getElementById('minCash').value;
    var maxCash = document.getElementById('maxCash').value;
    if(minCash.length!=0 && maxCash.length!=0) {
      msg += minCash + '元到' + maxCash + '元  手续费按' ;
    } else if(minCash.length!=0) {
      msg += minCash + '元以上  手续费按';
    } else if(maxCash.length!=0) {
      msg += maxCash + '元以下  手续费按';
    }
    var poundageType1 = document.getElementById('poundageType1');
    var poundageType2 = document.getElementById('poundageType2');
    if(poundageType1.checked){
      var poundageRate = document.getElementById('poundageRate').value;
      msg += '比率' + poundageRate + '%收取';
    } else {
      var poundageCash = document.getElementById('poundageCash').value;
      msg += '固定额' + poundageCash + '元收取';
    }
    document.getElementById('show_rule_area').value = msg;
  }

	/* 结算规则提交 */
  function rule_submit_form(methodName) {
	  window.document.forms[0].action = "settlementRuleAction.do?method=" + methodName;
    window.document.forms[0].submit();
  }

  /* 查询结算规则 */
  function rule_query_method() {
  	window.document.forms[0].action="settlementRuleAction.do" + '?method=query&type=init';
  	window.document.forms[0].submit();
  }

    /* 导出Excel */
  function excel() {
  	window.document.forms[0].action="settlementRuleAction.do" + '?method=excel';
  	window.document.forms[0].submit();
  	window.document.forms[0].action="settlementRuleAction.do" + '?method=query';
  }

 	/* 删除结算规则 */
	function rule_remove_confirm(deleteOne, ruleId) {
    if(deleteOne){
      if(window.confirm("确定要删除这条结算规则？")) {
        rule_submit_form('remove&ruleId='+ ruleId)
      }
      return;
    }
		// 判断是否选择数据
		if (selChb('ruleIds','请选择结算规则！') == false) return;
    if(window.confirm("确定要删除选择的结算规则？")) {
      rule_submit_form('remove');
    }
  }
  /* 判断是否选择了数据 */
  function selChb(name, msg){
  	var chb = document.getElementsByName(name);
		for (var i=0;i<chb.length;i++){
			if(chb[i].checked){
				var ched = true;
				break;
		 	}
		}
		// 如果没有选择数据则返回
		if (ched != true){alert(msg);return false;}
		return true;
  }
  /* 重新计算结算结果 */
  function resetSettlement(o){
		document.forms[0].action="settlementResultAction.do?method=resetSettlement&resultId="+o;
		document.forms[0].submit();
	}