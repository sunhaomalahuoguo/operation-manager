<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt' %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%
	String request_path = request.getContextPath();
	pageContext.setAttribute("request_path", request_path);
	request.setAttribute("fromFlg",0);
%>
<html>
<head>
<link rel="stylesheet" href="${request_path}/css/common.css" type="text/css" />
<link rel="stylesheet" href="${request_path}/css/calendar-style.css" type="text/css" />

<script type="text/javascript" language="JavaScript" src="${request_path}/js/common.js"></script>
<script type="text/javascript" src="${request_path}/js/jquery.js"></script>
<script type="text/javascript" src="${request_path}/js/select.js"></script>
<script type="text/javascript" language="JavaScript" src="${request_path}/js/calendar.js"></script>
<script type="text/javascript" language="JavaScript" src="${request_path}/js/calendar-cn.js"></script>
<script type="text/javascript" language="JavaScript" src="${request_path}/js/calendar-setup.js"></script>
<script>
	jQuery.noConflict();
	jQuery(document).ready(function() {
		jQuery(".button2").each(function(){
			jQuery(this).mouseover(function(){
				jQuery(this).css('background-image','url(${request_path}/images/button2_bg_focus.jpg)');
			});
			jQuery(this).mouseout(function(){
				jQuery(this).css('background-image','url(${request_path}/images/button2_bg.jpg)');
			});
		});
	});
	window.onload = function(){
		dateLoad(['manualAdjustTime','manualAdjustFiscalDate']);
		showmsg();
	};
	//yyyy-MM-dd HH:mm:ss  
	var dateformat = /^((((1[6-9]|[2-9]\d)\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\d|3[01]))|(((1[6-9]|[2-9]\d)\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\d|30))|(((1[6-9]|[2-9]\d)\d{2})-0?2-(0?[1-9]|1\d|2[0-8]))|(((1[6-9]|[2-9]\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-))(\s(([01]\d{1})|(2[0123])):([0-5]\d):([0-5]\d))?$/;

	
	//产品列表
	var prodList = [];
	
	function checkDateFormat(){
		var v = $("addTradeStartTime").value.replace(/(^\s*)|(\s*$)/g, "");
		if(v==''){
			return;
		}
		if(!dateformat.test(v)){
			alert("日期格式不符合要求!");
		}
	}
	
	function check(){
		var userIdSrc = document.forms[0].userIdSrc.value;
		var userIdDest = document.forms[0].userIdDest.value;
		var fund = document.forms[0].fund.value;
		var remark = document.forms[0].remark.value;
		var bizType = document.forms[0].bizType.value;
		var tradeCode = document.forms[0].tradeCode.value;
		var tradeDesc = document.forms[0].tradeDesc.value;
		var bankCode = document.forms[0].bankCode.value;
		var merReqId = document.forms[0].merRequestId.value;
		var v = tradeCode;
		if (isEmpty(tradeCode) || isEmpty(fund) || isEmpty(remark) || isEmpty(tradeDesc) ){
			alert(ERR_EMPTY);
			return false;
		}
		if (document.forms[0].tradeCode.value == "SF0006"){
			if (isEmpty(userIdDest)){
				alert(ERR_EMPTY);
				return false;
			}
			if (userIdSrc == userIdDest){
				alert("收款用户编号不得与交易用户编号相同");
				return false;
			}
		}
		if (Number(fund) == 0){
    		alert("金额不得为0！");
    		return false;
    	}
		if(300 < document.forms[0].remark.value.length) {
			alert('备注超过300字限制');
			return false;
		}
		if(300 < document.forms[0].tradeDesc.value.length) {
			alert('交易描述信息超过300字限制');
			return false;
		}
		
		var merCode = document.forms[0].merCode.value;
		if(tradeCode.indexOf('ZF')!=-1){
			if (isEmpty(merCode)){
				alert("商户名称不可为空");
				return false;
			}
			if (isEmpty(bizType)){
				alert("行业不可为空");
				return false;
			}
			if (prodList.length<=0){
				alert("交易产品信息不可为空");
				return false;
			}
			if (isEmpty(merReqId)){
				alert("商户请求编号不可为空");
				return false;
			}
		}
			
		//交易用户编号必填
		if(v=='ZF0001' ){
			if (isEmpty(userIdSrc)){
				alert("交易用户编号不可为空");
				return false;
			}
		}
		//ZF0103  ZF0201  ZF0206
		// 银行代码必填
		if(v=='ZF0101' || v=='ZF0102' || v=='ZF0103' || v=='ZF0201' || v=='ZF0301' || v=='ZF0205' || v=='ZF0206' || v=='ZF0207' || v=='ZF0209' || v=='CZ0001' || v=='CZ0002' || v=='CZ0003'
			|| v=='CZ0101' || v=='CZ0105' || v=='CZ0106' || v=='CZ0107' || v=='CZ0109'){
			if (isEmpty(bankCode)){
				alert("银行名称不可为空");
				return false;
			}
		}
		//ZF0101  ZF0102  ZF0205  ZF0207  ZF0209  ZF0213
		if(v=='ZF0101' || v=='ZF0102' || v=='ZF0205' || v=='ZF0207' || v=='ZF0209' || v=='ZF0213'){
			//银行代码	交易用户编号 必填
			if (isEmpty(bankCode)){
				alert("银行名称不可为空");
				return false;
			}
			if (isEmpty(userIdSrc)){
				alert("交易用户编号不可为空");
				return false;
			}
		}
		
		if((tradeCode.indexOf('CZ') != -1 || tradeCode == 'SF0006') && prodList.length>0){
			alert("非支付类交易不可添加交易产品信息");
			return false;
		}
		
		var v = $("addTradeStartTime").value.replace(/(^\s*)|(\s*$)/g, "");
		if(v!=''){
			if(!dateformat.test(v)){
				alert("日期格式不符合要求!");
				return false;
			}
		}
		return true;
	}
	
	function toAddProd(){
		$('prod_info').style.left = 250;
		$('prod_info').style.top = 200;
		$('prod_info').style.width = 440;
		$('prod_info').style.height = 160;
		$('prod_info').style.visibility = 'visible';
		$('_prodId').value='';
		$('_prodName').value='';
		$('_prodPrice').value='';
		$('_merAcct').value='';
		$('_prodBiz').value='';
		$('_prodNumber').value='';
	}
	
	function addProd(){
		if(isEmpty($('_prodId').value) || isEmpty($('_prodName').value) || isEmpty($('_prodPrice').value)
			|| isEmpty($('_merAcct').value) || isEmpty($('_prodBiz').value) || isEmpty($('_prodNumber').value)){
			alert("请输入完整的产品信息");
			return ;
		}
		var _pr = {"PRODUCT_ID":$('_prodId').value,
				"PRODUCT_NAME":$('_prodName').value,
				"FUND":$('_prodPrice').value,
				"MER_ACCT":$('_merAcct').value,
				"BIZ_TYPE":$('_prodBiz').value,
				"PRODUCT_NUMBER":$('_prodNumber').value};
		var curSize = prodList.length;
		prodList[curSize] = _pr;
		$('_prodCheckDiv').innerHTML = $('_prodCheckDiv').innerHTML + "&nbsp;<input type='checkbox' value='"+curSize+"' name='myprod' id='prod"+curSize+"' />";
	}
	
	function delProd(){
		var isCheck = 1;
		var prodchecks = document.getElementsByName('myprod');
		for(var i=0;i<prodchecks.length;i++){
			if($('prod'+i) && $('prod'+i).checked){
				isCheck = 0;
				prodList[i] = '';
			}
		}
		if(isCheck==1){
			alert("请选择需要删除的产品!");
			return false;
		}
		//$("input:checked") 
		for(var i=0;i<prodchecks.length;i++){
			if($('prod'+i) && $('prod'+i).checked){
				$('prod'+i).removeNode(true);
			}
		}
		var _tmp = [];
		for(var i =0;i < prodList.length;i++){
			_tmp[i] = prodList[i];
		}
		prodList = [];
		for(var i =0;i < _tmp.length;i++){
			if(''==_tmp[i]){
				continue;
			}
			prodList[i] = _tmp[i];
		}
	}
	
	function toProdListStr(){
		if(prodList.length<1){
			return "";
		}
		var result = "";
		for(var _s in prodList){
			var _tmp = '';
			for(var _p in prodList[_s]){
				_tmp+=_p+":"+prodList[_s][_p]+",";
			}
			_tmp = _tmp.substring(0,_tmp.length-1);
			result+="|"+_tmp;
		}
		result = result.substring(1,result.length);
		return result;
	}

	function addTrade(){
		if (check()){
			if (!window.confirm("确定补录交易?")){
  				return;
			}
			$('prodListStr').value= toProdListStr();
			document.forms[0].submit();
	  	}
	}

	function changeTradeCode(v){
		document.forms[0].bankCode.disabled=false;
		document.forms[0].bankAccount.disabled=false;
		document.forms[0].bankSn.disabled=false;
		//$("merCode_tr").style.display="block";
		document.forms[0].merRequestId.disabled=false;
		document.forms[0].bizType.disabled=false;
		
		//隐藏项 
		//	ZF0001		银行代码		银行账户		银行票号
		if (v == 'ZF0001'){
		//银行代码
		document.forms[0].bankCode.disabled=true;
		document.forms[0].bankCode.value='';
		//银行账户
		document.forms[0].bankAccount.disabled=true;
		document.forms[0].bankAccount.value='';
		//银行票号
		document.forms[0].bankSn.disabled=true;
		document.forms[0].bankSn.value='';
		}
		//隐藏项 充值类
		document.forms[0].merCode.disabled=false;
		document.forms[0].merCode.value='';
		if (v.indexOf('CZ') != -1){
			//商户名称
			//$("merCode_tr").style.display="none";
			document.all.merCode.value = "";
			//商户请求编号
			document.forms[0].merRequestId.disabled=true;
			document.forms[0].merRequestId.value='';
			//行业
			document.forms[0].bizType.disabled=true;
			document.forms[0].bizType.value='';
			
			//交易产品信息?提交时判断
			
		}
		if (v == 'SF0006'){
			//行业
			document.forms[0].bizType.disabled=true;
			document.forms[0].bizType.value='';
			//银行代码
			document.forms[0].bankCode.disabled=true;
			document.forms[0].bankCode.value='';
			
			
			//银行账户
			document.forms[0].bankAccount.disabled=true;
			document.forms[0].bankAccount.value='';
			//银行票号
			document.forms[0].bankSn.disabled=true;
			document.forms[0].bankSn.value='';
			//商户名称
			document.forms[0].merCode.disabled=true;
			document.forms[0].merCode.value='';
			//商户请求编号
			document.forms[0].merRequestId.disabled=true;
			document.forms[0].merRequestId.value='';
			//交易产品信息?提交时判断
			
		}

		$("merCodeSpan").innerHTML = "";
		$("bizSpan").innerHTML = "";
		$("prodSpan").innerHTML = "";
		$("bankCodeSpan").innerHTML = "";
		$("userIdSrcSpan").innerHTML = "";
		$("merReqIdSpan").innerHTML = "";
		$("oldAcc").innerHTML = "交易用户编号：";
		$("newAcc").style.display="none";
		if(v.indexOf('ZF')!=-1){
			//商户名称
			//行业
			//交易产品信息
			$("merCodeSpan").innerHTML = "*";
			$("bizSpan").innerHTML = "*";
			$("prodSpan").innerHTML = "*";
			$("merReqIdSpan").innerHTML = "*";
		}
		//ZF0001
		//交易用户编号必填
		if(v=='ZF0001' ){
			$("userIdSrcSpan").innerHTML = "*";
		}
		//ZF0103  ZF0201  ZF0206
		// 银行代码必填
		if(v=='ZF0103' || v=='ZF0201' || v=='ZF0301' || v=='ZF0206' ){
			$("bankCodeSpan").innerHTML = "*";
		}
		//ZF0101  ZF0102  ZF0205  ZF0207  ZF0209  ZF0213
		if(v=='ZF0101' || v=='ZF0102' || v=='ZF0205' || v=='ZF0207' || v=='ZF0209' || v=='ZF0213'){
			//银行代码	交易用户编号 必填
			$("bankCodeSpan").innerHTML = "*";
			$("userIdSrcSpan").innerHTML = "*";
		}
		// SF0006
		// 付款用户编号	收款用户编号 必填
		if (v == 'SF0006'){
			$("oldAcc").innerHTML = "付款用户编号：";
			$("userIdSrcSpan").innerHTML = "*";
			$("newAcc").style.display="block";
		}
		//刷新select控件
		j_reset_in_scope();
		/*
		jQuery("#bizCode").empty();

		jQuery.get("manualAdjustTradeAction.do?method=getBizTypeByTradeCode", { tradeCode: v},function(data){
			var opts = data.split(";");

			for (i = 0 ; i < opts.length-1 ; i++){
				var opt = opts[i].split(",");
				jQuery("#bizCode").append("<option value='"+opt[0]+"'>"+opt[1]+"</option>");
			}

			j_reset_in_scope();
		});
		*/
	}
	
	 /* 检查一个字符是不是空（onblur事件用） */
    function _ce(o){
    	if (o.value == ""){
    		alert(ERR_EMPTY);
    	}
    }

	/* 检查一个非空字符是不是数字（用在分页的时候，跳转的页数输入框的onblur事件） */
    function _cp(o){
    	if (o.value == ""){
    		return;
    	}
    	if (notInt(o.value)){
    		o.value='';
    		alert(ERR_NUMBER);
    	}
    }
	
    /* 检查一个非空字符是不是金额（onblur事件用） */
    function _cm(o){
    	if (o.value == ""){
    		return;
    	}
    	if (!isFund(o.value)){
    		o.value="";
    		alert(ERR_MONEY);
    	}
    	if (parseFloat(o.value) < 0){
    		o.value="";
    		alert("金额不能输入负数！");
    	}
    }
	
	function showmsg(){
		if ('${msg}' != ''){
			alert('${msg}');
		}
	}
</script>

<title>补录交易</title>
</head>
<body >
		<form action="manualAdjustTradeAction.do?method=addTrade" method="post" onsubmit="return check()">
		<input type="hidden" value="${fromFlg}" name="fromFlg"/>
		<input type="hidden" value="" name="prodListStr" />
		<table style="width:100%">
		<tr>
		<td>
		  <table cellpadding="3" cellspacing="1" class="showTable" style="width:100%">
			<colgroup style="text-align: right;width:18%;background-color:#FFF">
			</colgroup>
			<colgroup style="text-align: left;background-color:#FFF">
			</colgroup>

			<tr>
				<td class="left_title_1">交易类型代码：</td>
				<td>
				 <select name="tradeCode" onchange="changeTradeCode(this.value)" >
						<option value=""></option>
						<option  value="ZF0001">支付类	预存支付</option>
						<option  value="ZF0101">认证支付-卡通支付</option>
						<option  value="ZF0102">认证支付-快捷支付</option>
						<option  value="ZF0103">认证支付-获取快捷支付动态密码</option>
						<option  value="ZF0201">银行卡支付-网银支付</option>
						<option  value="ZF0301">银行卡支付-银联支付</option>
						<option  value="ZF0205">银行卡支付-电视银行卡支付</option>
						<option  value="ZF0206">银行卡支付-信用卡支付</option>
						<option  value="ZF0207">银行卡支付-手机WAP支付</option>
						<option  value="ZF0209">银行卡支付-电话IVR支付</option>
						<option  value="ZF0213">银行卡支付-手机刷卡支付</option>
						<option  value="CZ0001">充值类	认证充值-卡通充值</option>
						<option  value="CZ0002">认证充值-快捷充值</option>
						<option  value="CZ0003">认证充值-获取快捷充值动态密码</option>
						<option  value="CZ0101">银行卡充值-网银充值</option>
						<option  value="CZ0105">银行卡充值-电视银行卡充值</option>
						<option  value="CZ0106">银行卡充值-信用卡充值</option>
						<option  value="CZ0107">银行卡充值-手机WAP充值</option>
						<option  value="CZ0109">银行卡充值-电话IVR充值</option>
						<option  value="SF0006">预存账户付款</option>
				</select>&nbsp;<span class="sp">*</span>
			   </td>
			</tr>
			<tr>
				<td class="left_title_1">行业代码：</td>
				<td>
				    <input type="text" class="text_contant" name="bizType" maxlength="10" value="" onblur="cup(this);"/>
				    &nbsp;<span class="sp" id="bizSpan"></span>
				</td>
			</tr>
			<tr>
				<td class="left_title_1">银行名称：</td>
				<td>
					
				    <select name="bankCode" id="bankCode" >
						<option value=""></option>
						<c:forEach items="${listBank}" var="item" step="1" varStatus="var">
						<option  value="${item.bankCode}"><c:out value="${item.bankName}"></c:out></option>
						</c:forEach>
					</select>&nbsp;<span class="sp" id="bankCodeSpan"></span>
				</td>
			</tr>
			<tr>
				<td class="left_title_1">银行账户编号：</td>
				<td>
				    <input type="text" class="text_contant" name="bankAccount" id="bankAccount" maxlength="50" value="" onblur="cp(this);"/>
				    &nbsp;<span class="sp"></span>
				</td>
			</tr>
			<tr>
				<td class="left_title_1">银行票号：</td>
				<td>
				    <input type="text" class="text_contant" name="bankSn" id="bankSn" maxlength="50" value="" onblur="cup(this);"/>
				    &nbsp;<span class="sp"></span>
				</td>
			</tr>
			<tr style="display: block" id="merCode_tr">
				<td class="left_title_1">商户名称：</td>
				<td>
				    <select  name="merCode" id="merCode" >
						<option value=""></option>
						<c:forEach items="${listMerchant}" var="item" step="1" varStatus="var">
						<option  value="${item.merchantCode}"><c:out value="${item.merchantName}"></c:out></option>
						</c:forEach>
					</select>&nbsp;<span class="sp" id="merCodeSpan"></span>
				</td>
			</tr>
			<tr>
				<td class="left_title_1">商户请求编号：</td>
				<td>
				    <input type="text" class="text_contant" name="merRequestId" maxlength="50" value="" onblur="cup(this);"/>
				    &nbsp;<span class="sp" id="merReqIdSpan"></span>
				</td>
			</tr>
			<tr>
				<td class="left_title_1">交易流水编号：</td>
				<td>
				    <input type="text" class="text_contant" name="tradeId" maxlength="18" value="" onblur="cp(this);"/>
				    &nbsp;<span class="sp"></span>
				</td>
			</tr>
			<tr>
				<td class="left_title_1">交易发起时间：</td>
				<td>
				    <input type="text" class="text_contant" name="addTradeStartTime"  id="addTradeStartTime" value="" onblur="checkDateFormat();"/>
				    &nbsp;<span class="sp">格式:2008-08-08 或者 2008-08-08 20:08:08</span>
				</td>
			</tr>
			<tr>
				<td class="left_title_1">运营商名称：</td>
				<td>
				    <select name="operatorCode" property="operatorCode" >
						<option value=""></option>
						<c:forEach items="${listOperator}" var="item" step="1" varStatus="var">
						<option  value="${item.operatorCode}"><c:out value="${item.operatorName}"></c:out></option>
						</c:forEach>
					</select>&nbsp;<span class="sp"></span>
				</td>
			</tr>
			<tr>
				<td class="left_title_1" id="oldAcc">交易用户编号：</td>
				<td><input type="text" class="text_contant" name="userIdSrc" maxlength="10" value="${userId}" onblur="cp(this);"/>&nbsp;<span class="sp" id="userIdSrcSpan"></span></td>
			</tr>
			<tr style="display: none" id="newAcc">
				<td class="left_title_1">收款用户编号：</td>
				<td><input type="text" class="text_contant" name="userIdDest" maxlength="10" onblur="cp(this);"/>&nbsp;<span class="sp">*</span></td>
			</tr>
			<tr>
				<td class="left_title_1">交易金额：</td>
				<td><input type="text" class="text_money" name="fund" maxlength="12" onblur="cm(this);"/>&nbsp;<span class="sp">*</span></td>
			</tr>
			<tr>
				<td class="left_title_1">会计状态：</td>
				<td><input type="text" class="text_contant" name="fiscalStatus" maxlength="1" onblur="cp(this);"/>&nbsp;<span class="sp"></span></td>
			</tr>
			<tr>
				<td class="left_title_1">对账状态：</td>
				<td><input type="text" class="text_contant" name="checkStatus" maxlength="1" onblur="cp(this);"/>&nbsp;<span class="sp"></span></td>
			</tr>
			<tr>
				<td class="left_title_1">手工调整状态：</td>
				<td><input type="text" class="text_contant" name="manualAdjustStatus" maxlength="1" onblur="cp(this);"/>&nbsp;<span class="sp"></span></td>
			</tr>
			<tr>
				<td class="left_title_1">手工调整时间：</td>
				<td><input type="text" class="text_date" name="manualAdjustTime" onblur="cd(this)" property="manualAdjustTime"/>&nbsp;<span class="sp"></span></td>
			</tr>
			<tr>
				<td class="left_title_1">手工调整会计日期：</td>
				<td><input type="text" class="text_date" name="manualAdjustFiscalDate" onblur="cd(this)"  property="manualAdjustFiscalDate"/>&nbsp;<span class="sp"></span></td>
			</tr>
			<tr>
				<td class="left_title_1">交易描述信息：</td>
				<td>
					<textarea name="tradeDesc" class="remarkarea" style="width: 520px;"></textarea>&nbsp;<span class="sp">*</span><span class="graySign">（限制300字）</span>
				</td>
			</tr>
			<tr>
				<td class="left_title_1">交易产品信息：</td>
				<td>
					<div id="_prodCheckDiv"></div>&nbsp;
					<span class="sp"  id="prodSpan"></span><span class="graySign">
					<input name="button"  type="button" class="button2" onclick="toAddProd();" onmouseover="this.style.backgroundImage='url(${request_path}/images/button2_bg_focus.jpg)'" onmouseout="this.style.backgroundImage='url(${request_path}/images/button2_bg.jpg)'" value="添加" />
					&nbsp;
					<input name="button" type="button" class="button2" onclick="delProd();" onmouseover="this.style.backgroundImage='url(${request_path}/images/button2_bg_focus.jpg)'" onmouseout="this.style.backgroundImage='url(${request_path}/images/button2_bg.jpg)'" value="删除" /></span>
				</td>
			</tr>
			<tr>
				<td class="left_title_1">补录原因：</td>
				<td>
					<textarea name="remark" class="remarkarea" style="width: 520px;"></textarea>&nbsp;<span class="sp">*</span><span class="graySign">（限制300字）</span>
				</td>
			</tr>
			</table>
			</td>
			</tr>
    		<tr>
            	<td align="center">
            		<input name="button" type="button" class="button2" value="补录" onclick="addTrade();"/>&nbsp;&nbsp;&nbsp;
            		<input name="button" type="button" class="button2" value="返回" onclick="$('backHidden').click()" />
					<c:if test="${fromFlg eq 0}">
						<a id="backHidden" style="display:none" href="tradeQueryAction.do?method=toQuery">back</a>
					</c:if>
					<c:if test="${fromFlg eq 1}">
						<a id="backHidden" style="display:none" href="${request_path}/business_manage_account_manage/balanceManageAction.do?method=listAccount">back</a>
					</c:if>
            	</td>
          	</tr>
		  </table>
		</form>


	<div id="prod_info" style="position:absolute; visibility: hidden; background-color: white;">
			<table class="showTable" width="100%" height="100%">
				<tr>
					<td colspan="4" align="left"><b>产品信息编辑</b></td>
				</tr>
				<tr>
					<td width="80" align="right"><b>产品编号：</b></td>
					<td >
						<input type="text" class="text_contant" style="width:110px;" id="_prodId" maxlength="50" onblur="_ce(this);"/>
					</td>
					<td width="80" align="right"><b>产品名称：</b></td>
					<td >
						<input type="text" class="text_contant"  style="width:110px;"	id="_prodName"  maxlength="50" onblur="_ce(this);"/>
					</td>
				</tr>
				<tr>
					<td align="right"><b>产品价格：</b></td>
					<td>
						<input type="text" class="text_contant" style="width:110px;" id="_prodPrice"  maxlength="16" onblur="_cm(this);"/>
	    			</td>
					<td width="80" align="right"><b>供应商：</b></td>
					<td><input type="text" class="text_contant"  style="width:110px;" id="_merAcct" maxlength="20" onblur="_ce(this);"/></td>
				</tr>
				<tr>
					<td align="right"><b>行业：</b></td>
					<td>
						<input type="text" class="text_contant" style="width:110px;" id="_prodBiz" maxlength="50" onblur="_ce(this);"/>
	    			</td>
					<td width="80" align="right"><b>数量：</b></td>
					<td><input type="text" class="text_contant"  style="width:110px;" id="_prodNumber" maxlength="10" onblur="_cp(this);"/></td>
				</tr>
				<tr>
					<td colspan="4" align="center">
    	        		<input name="button" type="button" class="button2" onclick="addProd();" onmouseover="this.style.backgroundImage='url(${request_path}/images/button2_bg_focus.jpg)'" onmouseout="this.style.backgroundImage='url(${request_path}/images/button2_bg.jpg)'" value="确定" />&nbsp;&nbsp;&nbsp;
	            		<input name="button" type="button" class="button2" onclick="$('prod_info').style.visibility='hidden';" onmouseover="this.style.backgroundImage='url(${request_path}/images/button2_bg_focus.jpg)'" onmouseout="this.style.backgroundImage='url(${request_path}/images/button2_bg.jpg)'" value="关闭" />
					</td>
				</tr>
			</table>
	    </div>
	    <script>
	    var v = document.forms[0].tradeCode.value;
	    if(v.length>0){
	    	changeTradeCode(v);	
	    }
	    
	    </script>
</body>
</html>
