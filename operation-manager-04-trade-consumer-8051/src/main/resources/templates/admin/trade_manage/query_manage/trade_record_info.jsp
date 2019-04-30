<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" pageEncoding="utf-8"%>



<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt' %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
	String request_path = request.getContextPath();
	pageContext.setAttribute("request_path", request_path);
%>
<%@page import="java.util.List"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<base target="_self"/>
  	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  	<link rel="stylesheet" href="${request_path}/css/common.css" type="text/css" />
  	<title>交易详细信息</title>
  	<style type="text/css">
			.clip{line-height:20px; text-overflow:ellipsis; white-space:nowrap; overflow:hidden;background-color:#FFFFFF;}
		</style>
  	<script type="text/javascript" src="${request_path}/js/common.js"></script>
  	<script type="text/javascript" src="${request_path}/js/jquery.js"></script>
  	<script type="text/javascript" src="${request_path}/js/global.js"></script>
  	<script type="text/javascript" src="${request_path}/js/select.js"></script>
  	<script language="javascript">
  		function testEffect(e){
				var $ = document.getElementById;
				if(e==1){
					$("tradeDetail").style.display="block";
					$("accountDetail").style.display="none";
					$("accountInfo").style.display="none";
					$("pageTab").value="0";
				}
				if(e==2){
					$("accountDetail").style.display="block";
					$("tradeDetail").style.display="none";
					$("accountInfo").style.display="none";
					$("pageTab").value="1";
				}
				if(e==3){
					$("accountInfo").style.display="block";
					$("accountDetail").style.display="none";
					$("tradeDetail").style.display="none";
					$("pageTab").value="2";
				}
			}
			function pageSel(e){
				var $ = document.getElementById;
				if(e==0){
					$("tradeDetail").style.display="block";
					$("accountDetail").style.display="none";
					$("accountInfo").style.display="none";
					changeBodyTitle($('tdTrade'),3);
				}
				if(e==1){
					$("accountDetail").style.display="block";
					$("tradeDetail").style.display="none";
					$("accountInfo").style.display="none";
					changeBodyTitle($('tdDetail'),3);
				}
				if(e==2){
					$("accountDetail").style.display="none";
					$("tradeDetail").style.display="none";
					$("accountInfo").style.display="block";
					changeBodyTitle($('tdLog'),3);
				}
			}

			var f = 1;
			function turnReqInfo(o) {
				if (f==1){
					$('reqInfo').style.display='none';
					o.innerText="[显示]";
					f = 0;
				} else {
					$('reqInfo').style.display='block';
					o.innerText="[隐藏]";
					f = 1;
				}
			}
			var f2 = 1;
			function turnBasInfo(o) {
				if (f2==1){
					$('basInfo').style.display='none';
					o.innerText="[显示]";
					f2 = 0;
				} else {
					$('basInfo').style.display='block';
					o.innerText="[隐藏]";
					f2 = 1;
				}
			}
  	</script>
	</head>
	<body onload="pageSel(${pageTab})">
		<form name="PageForm" action="tradeQueryAction.do?method=toQuery" method="post">
			<input type="hidden" id="pageTab" name="pageTab" value="${pageTab}"></input>
			<div class="edit_area" id="tradeDetail" >
			<table width="100%">
				<tr>
					<td align='left'>交易基本信息：<!-- <a href="#" onclick="turnBasInfo(this)">[隐藏]</a> --></td>
				</tr>
				<tr>
					<td align="center">
						<div id="basInfo" style="display:block">
						<table width="100%" cellspacing="1" cellpadding="3" class="showTable" style="table-layout: fixed;">
							<tr>
								<td width="13%" class="left_title_2"><div align="right">交易编号：</div></td>
								<td width="23%" class="showTableTd"><div align="left">
								  <span contentEditable="true">
									<fmt:formatNumber value="${tradeRecord.id}" type="currency" pattern="0000000000"/>
								  </span>
								</div></td>
								<td width="13%" class="left_title_2"><div align="right">交易类型：</div></td>
								<td width="20%" class="showTableTd"><div align="left">
									<c:forEach items="${listTradeType}" var="trade" step="1" varStatus="var">
								  	  <c:if test="${trade.code eq tradeRecord.tradeCode}">
								  	  <c:out value="${trade.name}"></c:out>
								  	  </c:if>
				            	</c:forEach>
								</div></td>
								<td width="13%" class="left_title_2"><div align="right">行业：</div></td>
								<td width="18%" class="showTableTd"><div align="left">
									<c:forEach items="${listBizType}" var="item" step="1" varStatus="var">
								  	  <c:if test="${item.id eq tradeRecord.bizType}">
								  	  <c:out value="${item.name}"></c:out>
								  	  </c:if>
				            	</c:forEach>
								</div></td>
							</tr>
							<c:if test="${tradeRecord.tradeCode == 'TZ0001' || tradeRecord.tradeCode == 'TZ0002' || fn:substring(tradeRecord.tradeCode, 0, 2) == 'DK' || tradeRecord.tradeCode == 'DJ0005' || tradeRecord.tradeCode == 'DJ0006' || tradeRecord.tradeCode == 'PF1002' || tradeRecord.tradeCode == 'PF1005' || fn:substring(tradeRecord.tradeCode, 0, 2) == 'ZF'}">
							<tr>
								<td class="left_title_2"><div align="right">交易金额：</div></td>
								<td class="showTableTd"><div align="left">￥<fmt:formatNumber value="${tradeRecord.tradeSum}" type="currency" pattern="#0.00"/>
								</div></td>
								<c:if test="${tradeRecord.tradeCode == 'TZ0001' || tradeRecord.tradeCode == 'TZ0002'}">
								<td class="left_title_2"><div align="right">商户应扣金额：</div></td>
								</c:if>
								<c:if test="${fn:substring(tradeRecord.tradeCode, 0, 2) == 'ZF' || fn:substring(tradeRecord.tradeCode, 0, 2) == 'DK' || tradeRecord.tradeCode == 'DJ0005' || tradeRecord.tradeCode == 'DJ0006' || tradeRecord.tradeCode == 'PF1002' || tradeRecord.tradeCode == 'PF1005'}">
								<td class="left_title_2"><div align="right">商户应得金额：</div></td>
								</c:if>
								<td class="showTableTd"><div align="left">￥<fmt:formatNumber value="${tradeRecord.merFund}" type="currency" pattern="#0.00"/>
								</div></td>
								<c:if test="${tradeRecord.tradeCode == 'PF1002' || tradeRecord.tradeCode == 'PF1005'}">
								<td class="left_title_2"><div align="right">手续费：</div></td>
								<td class="showTableTd">
									<div align="left">
										￥<fmt:formatNumber value="${tradeRecord.tradeSum - tradeRecord.fld5}" type="currency" pattern="#0.00"/>
									</div>
								</td>
								</c:if>
								<c:if test="${tradeRecord.tradeCode == 'TZ0001' || tradeRecord.tradeCode == 'TZ0002' || fn:substring(tradeRecord.tradeCode, 0, 2) == 'DK' || tradeRecord.tradeCode == 'DJ0005' || tradeRecord.tradeCode == 'DJ0006' || fn:substring(tradeRecord.tradeCode, 0, 2) == 'ZF'}">
								<td class="left_title_2"><div align="right">手续费：</div></td>
								<td class="showTableTd">
									<div align="left">
										￥<fmt:formatNumber value="${tradeRecord.tradeSum - tradeRecord.merFund}" type="currency" pattern="#0.00"/>
									</div>
								</td>
								</c:if>
							</tr>
							<tr>
								<td class="left_title_2"><div align="right">费率(‰)：</div></td>
								<td class="showTableTd"><div align="left">
									<c:out value="${tradeRecord.merBizFld}"/></div>
								</td>
								
								<td class="left_title_2"><div align="right">交易时间：</div></td>
								<td class="showTableTd"><div align="left">
									<fmt:formatDate value="${tradeRecord.tradeStartTime}" pattern="yyyy-MM-dd HH:mm:ss" />
									</div>
								</td>
								<td class="left_title_2"><div align="right">会计日期：</div></td>
								<td class="showTableTd"><div align="left">
									<fmt:formatDate value="${tradeRecord.fiscalDate}" pattern="yyyy-MM-dd" />
									</div>
								</td>
							</tr>
							</c:if>
							<c:if test="${tradeRecord.tradeCode == 'CZ1101' || fn:substring(tradeRecord.tradeCode, 0, 2) == 'SF' || fn:substring(tradeRecord.tradeCode, 0, 2) == 'TX'}">
							<tr>
								<c:if test="${tradeRecord.tradeCode == 'CZ1101' || fn:substring(tradeRecord.tradeCode, 0, 2) == 'SF'}">
								<td class="left_title_2"><div align="right">交易金额：</div></td>
								<td class="showTableTd"><div align="left">￥<fmt:formatNumber value="${tradeRecord.tradeSum}" type="currency" pattern="#0.00"/>
								</div></td>
								<td class="left_title_2"><div align="right">有效金额：</div></td>
								<td class="showTableTd"><div align="left">￥<fmt:formatNumber value="${tradeRecord.fld5}" type="currency" pattern="#0.00"/>
								</div></td>
								</c:if>
								<c:if test="${fn:substring(tradeRecord.tradeCode, 0, 2) == 'TX'}">
								<td class="left_title_2"><div align="right">交易金额：</div></td>
								<td class="showTableTd"><div align="left">￥<fmt:formatNumber value="${tradeRecord.fld5}" type="currency" pattern="#0.00"/>
								</div></td>
								<td class="left_title_2"><div align="right">有效金额：</div></td>
								<td class="showTableTd"><div align="left">￥<fmt:formatNumber value="${tradeRecord.tradeSum}" type="currency" pattern="#0.00"/>
								</div></td>
								</c:if>
								<c:if test="${tradeRecord.tradeCode == 'CZ1101' || fn:substring(tradeRecord.tradeCode, 0, 2) == 'SF'}">
								<td class="left_title_2"><div align="right">手续费：</div></td>
								<td class="showTableTd">
									<div align="left">
										￥<fmt:formatNumber value="${tradeRecord.tradeSum - tradeRecord.fld5}" type="currency" pattern="#0.00"/>
									</div>
								</td>
								</c:if>
								<c:if test="${fn:substring(tradeRecord.tradeCode, 0, 2) == 'TX'}">
								<td class="left_title_2"><div align="right">手续费：</div></td>
								<td class="showTableTd">
									<div align="left">
										￥<fmt:formatNumber value="${tradeRecord.fld5 - tradeRecord.tradeSum}" type="currency" pattern="#0.00"/>
									</div>
								</td>
								</c:if>
							</tr>
							</c:if>
							<c:if test="${tradeRecord.tradeCode != 'TZ0001' && tradeRecord.tradeCode != 'TZ0002' && fn:substring(tradeRecord.tradeCode, 0, 2) != 'DK' && tradeRecord.tradeCode != 'DJ0005' && tradeRecord.tradeCode != 'DJ0006' && tradeRecord.tradeCode != 'PF1002' && tradeRecord.tradeCode != 'PF1005' && fn:substring(tradeRecord.tradeCode, 0, 2) != 'ZF'
							              && tradeRecord.tradeCode != 'CZ1101' && fn:substring(tradeRecord.tradeCode, 0, 2) != 'SF' && fn:substring(tradeRecord.tradeCode, 0, 2) != 'TX'}">
							<tr>
								<td class="left_title_2"><div align="right">交易金额：</div></td>
								<td class="showTableTd"><div align="left">￥<fmt:formatNumber value="${tradeRecord.tradeSum}" type="currency" pattern="#0.00"/>
								</div></td>
								<td class="left_title_2"><div align="right">交易时间：</div></td>
								<td class="showTableTd"><div align="left">
									<fmt:formatDate value="${tradeRecord.tradeStartTime}" pattern="yyyy-MM-dd HH:mm:ss" />
									</div>
								</td>
								<td class="left_title_2"><div align="right">会计日期：</div></td>
								<td class="showTableTd"><div align="left">
									<fmt:formatDate value="${tradeRecord.fiscalDate}" pattern="yyyy-MM-dd" />
									</div>
								</td>
							</tr>
							</c:if>
							<tr>
								<td class="left_title_2"><div align="right">发起用户：</div></td>
								<td class="showTableTd"><div align="left">
									<c:out value="${tradeRecord.tradeUser}"/></div>
								</td>
								<td class="left_title_2"><div align="right">请求系统：</div></td>
								<td class="showTableTd"><div align="left">
                      					<c:out value="${tradeRecord.tradeProcess}" />
									</div>
								</td>
								<td class="left_title_2"><div align="right">处理状态：</div></td>
								<td class="showTableTd" ><div align="left">
									<c:if test="${0 eq tradeRecord.status}">待处理</c:if>
					 		  	<c:if test="${1 eq tradeRecord.status}">处理中</c:if>
					 		  	<c:if test="${2 eq tradeRecord.status}">成功</c:if>
					 		  	<c:if test="${3 eq tradeRecord.status}">失败</c:if>
					 		  	<c:if test="${4 eq tradeRecord.status}">待确认</c:if>
								</div></td>
							</tr>
							<tr>
								<td class="left_title_2"><div align="right">发起地点：</div></td>
								<td class="showTableTd"><div align="left">
									<c:out value="${tradeRecord.tradeLoc}"/>
									</div>
								</td>
								<td width="18%" class="left_title_2"><div align="right">用户编号：</div></td>
								<td width="*" class="showTableTd" >
									<div align="left">
									  <span contentEditable="true">
										<c:out value="${tradeRecord.userId}"/>
									  </span>
									</div>
								</td>
								<td class="left_title_2"><div align="right">账户编号：</div></td>
								<td class="showTableTd"><div align="left">
									<c:out value="${tradeRecord.accountId}"/>
								</div></td> 
							</tr>
							<tr>
								<td class="left_title_2"><div align="right">银行渠道：</div></td>
								<td class="showTableTd"><div align="left">
									<c:out value="${tradeRecord.fld10}"/>
									</div>
								</td>
								<td class="left_title_2"><div align="right">银行名称：</div></td>
								<td class="showTableTd"><div align="left">
									<c:forEach items="${listBank}" var="bank" step="1" varStatus="var">
									  	  <c:if test="${bank.bankCode eq tradeRecord.fld3}">
									  	  <c:out value="${bank.bankName}"></c:out>
									  	  </c:if>
					            	</c:forEach>
									</div>
								</td>
								<td width="18%" class="left_title_2"><div align="right">银行账号：</div></td>
								<td width="*" class="showTableTd" >
									<div align="left">
										<c:out value="${tradeRecord.bankAccount}"/>
									</div>
								</td>
							</tr>
							<tr>
								<td class="left_title_2"><div align="right">商户编号：</div></td>
								<td class="showTableTd"><div align="left">
									<c:out value="${tradeRecord.providerId}"/>
									</div>
								</td>
								<td width="18%" class="left_title_2"><div align="right">运营商代码：</div></td>
								<td width="*" class="showTableTd" >
									<div align="left">
										<c:out value="${tradeRecord.operatorCode}"/>
									</div>
								</td>
								<td class="left_title_2"><div align="right">银行票号：</div></td>
								<td class="showTableTd"><div align="left">
								<span contentEditable="true">
									<c:out value="${tradeRecord.bankSn}"/>
								</span>
								</div></td> 
							</tr>
							<tr>
								<td class="left_title_2"><div align="right">结算状态：</div></td>
								<td class="showTableTd"><div align="left">
									<c:if test="${0 eq tradeRecord.settlementStatus}">未结算</c:if>
									<c:if test="${1 eq tradeRecord.settlementStatus}">已结算</c:if>
									</div>
								</td>
								<td width="18%" class="left_title_2"><div align="right">退款状态：</div></td>
								<td width="*" class="showTableTd" >
									<div align="left">
										<c:if test="${0 eq tradeRecord.refundStatus}">未退款</c:if>
										<c:if test="${1 eq tradeRecord.refundStatus}">已退款</c:if>
									</div>
								</td>
								<td class="left_title_2"><div align="right">手工调整状态：</div></td>
								<td class="showTableTd"><div align="left">
									 <c:if test="${0 eq tradeRecord.manualAdjustStatus}">未调整</c:if>
								 	 <c:if test="${2 eq tradeRecord.manualAdjustStatus}">已调整</c:if>
								</div></td> 
							</tr>											
							<c:if test="${tradeRecord.tradeCode == 'TZ0001' || tradeRecord.tradeCode == 'TZ0002' || fn:substring(tradeRecord.tradeCode, 0, 2) == 'DK' || tradeRecord.tradeCode == 'DJ0005' || tradeRecord.tradeCode == 'DJ0006' || tradeRecord.tradeCode == 'PF1002' || tradeRecord.tradeCode == 'PF1005' || fn:substring(tradeRecord.tradeCode, 0, 2) == 'ZF'}">
							<tr>
								
								<td class="left_title_2"><div align="right">超时失败标识：</div></td>
								<td class="showTableTd"><div align="left">
									  <c:if test="${tradeRecord.timeoutFlg eq 0}">
								  	  	<c:out value="未超时"></c:out>
								  	  </c:if>
								  	  <c:if test="${tradeRecord.timeoutFlg eq 1}">
								  	  	<c:out value="已超时"></c:out>
								  	  </c:if>
								</div></td> 
								<td class="left_title_2"><div align="right">请求编号：</div></td>
								<td class="showTableTd" colspan="3"><div align="left">
								  <span contentEditable="true">
									<c:out value="${tradeRecord.orderId}"/>
								  </span>
									</div>
								</td>
							</tr>
							<tr>
								<td class="left_title_2"><div align="right">交易描述信息：</div></td>
								<td class="showTableTd" colspan="5"><div align="left">
									<c:out value="${tradeRecord.tradeDesc}"/>
									</div>
								</td>
							</tr>
							</c:if>
							<c:if test="${tradeRecord.tradeCode == 'CZ1101' || fn:substring(tradeRecord.tradeCode, 0, 2) == 'SF' || fn:substring(tradeRecord.tradeCode, 0, 2) == 'TX'}">
							<tr>	
								<td class="left_title_2"><div align="right">超时失败标识：</div></td>
								<td class="showTableTd"><div align="left">
									  <c:if test="${tradeRecord.timeoutFlg eq 0}">
								  	  	<c:out value="未超时"></c:out>
								  	  </c:if>
								  	  <c:if test="${tradeRecord.timeoutFlg eq 1}">
								  	  	<c:out value="已超时"></c:out>
								  	  </c:if>
								</div></td> 
								<td class="left_title_2"><div align="right">会计日期：</div></td>
								<td class="showTableTd"><div align="left">
									<fmt:formatDate value="${tradeRecord.fiscalDate}" pattern="yyyy-MM-dd" />
									</div>
								</td>
								<td class="left_title_2"><div align="right">交易时间：</div></td>
								<td class="showTableTd"><div align="left">
									<fmt:formatDate value="${tradeRecord.tradeStartTime}" pattern="yyyy-MM-dd HH:mm:ss" />
									</div>
								</td>
							</tr>
							<tr>
								<td class="left_title_2"><div align="right">请求编号：</div></td>
								<td class="showTableTd"><div align="left">
								  <span contentEditable="true">
									<c:out value="${tradeRecord.orderId}"/>
								  </span>
									</div>
								</td>
								<td class="left_title_2"><div align="right">交易描述信息：</div></td>
								<td class="showTableTd" colspan="3"><div align="left">
									<c:out value="${tradeRecord.tradeDesc}"/>
									</div>
								</td>
							</tr>
							</c:if>
							<c:if test="${tradeRecord.tradeCode != 'TZ0001' && tradeRecord.tradeCode != 'TZ0002' &&  fn:substring(tradeRecord.tradeCode, 0, 2) != 'DK' && tradeRecord.tradeCode != 'DJ0005' && tradeRecord.tradeCode != 'DJ0006' && tradeRecord.tradeCode != 'PF1002' && tradeRecord.tradeCode != 'PF1005' && fn:substring(tradeRecord.tradeCode, 0, 2) != 'ZF'
							              && tradeRecord.tradeCode != 'CZ1101' && fn:substring(tradeRecord.tradeCode, 0, 2) != 'SF' && fn:substring(tradeRecord.tradeCode, 0, 2) != 'TX'}">
							<tr>	
								<td class="left_title_2"><div align="right">超时失败标识：</div></td>
								<td class="showTableTd"><div align="left">
									  <c:if test="${tradeRecord.timeoutFlg eq 0}">
								  	  	<c:out value="未超时"></c:out>
								  	  </c:if>
								  	  <c:if test="${tradeRecord.timeoutFlg eq 1}">
								  	  	<c:out value="已超时"></c:out>
								  	  </c:if>
								</div></td> 
								<td class="left_title_2"><div align="right">请求编号：</div></td>
								<td class="showTableTd" colspan="3"><div align="left">
								  <span contentEditable="true">
									<c:out value="${tradeRecord.orderId}"/>
								  </span>
									</div>
								</td>
								
							</tr>						
							<tr>
								<td class="left_title_2"><div align="right">交易描述信息：</div></td>
								<td class="showTableTd" colspan="5"><div align="left">
									<c:out value="${tradeRecord.tradeDesc}"/>
									</div>
								</td>							
							</tr>
							</c:if>
							<c:if test="${tradeRecord.tradeCode == 'ZF0102' || tradeRecord.tradeCode == 'ZF0103'}">
							<tr>
								<td class="left_title_2"><div align="right">失败原因：</div></td>
								<td class="showTableTd" colspan="5"><div align="left">
									<c:if test="${null eq tradeRecord.failureInfo}"></c:if>
									<c:if test="${null ne tradeRecord.failureInfo}">${tradeRecord.failureInfo}</c:if>
									</div>
								</td>															
							</tr>
							</c:if>	
							<c:if test="${tradeRecord.tradeCode == 'ZF0102' || tradeRecord.tradeCode == 'ZF0103'}">
							<tr>														
								<td class="left_title_2"><div align="right">银行失败原因：</div></td>
								<td class="showTableTd" colspan="5"><div align="left">
									<c:if test="${null eq tradeRecord.exceptionRec}"></c:if>
									<c:if test="${null ne tradeRecord.exceptionRec}">${tradeRecord.exceptionRec}</c:if>										
								</div></td> 
							</tr>
							</c:if>	
							<c:if test="${tradeRecord.tradeCode == 'DK0004' || tradeRecord.tradeCode == 'DK0005'}">
							<tr>
								<td class="left_title_2">
									<c:if test="${tradeRecord.tradeCode == 'DK0004'}">
										<div align="right">冻结原因：</div>
									</c:if>
									<c:if test="${tradeRecord.tradeCode == 'DK0005'}">
										<div align="right">解冻原因：</div>
									</c:if>
								</td>
								<td class="showTableTd" colspan="5"><div align="left">
								  <span contentEditable="true">
									<c:out value="${tradeRecord.remark}"/>
								  </span>
									</div>
								</td>
							</tr>
							</c:if>
							<c:if test="${tradeRecord.tradeCode=='TB004' ||tradeRecord.tradeCode=='TB006'}">
								<tr>
								<td class="left_title_2"><div align="right">手续费收取方式：</div></td>
								<td class="showTableTd" colspan="5"><div align="left">
								<c:if test="${tradeRecord.fld2 eq '0' }">从指定主账户收取</c:if>
								<c:if test="${tradeRecord.fld2 eq '1' }">各分账方均摊</c:if>
								<c:if test="${tradeRecord.fld2 eq '2' }">p2p平台垫付</c:if>
									</div>
								</td>
							</tr>	
							</c:if>										
							<c:if test="${tradeRecord.tradeCode != 'DK0004' && tradeRecord.tradeCode != 'DK0005'}">
							<tr>
								<td class="left_title_2"><div align="right">透传字段：</div></td>
								<td class="showTableTd" colspan="3"><div align="left">
								  <span contentEditable="true">
									<c:out value="${tradeRecord.merInfo}"/>
								  </span>
									</div>
								</td>
										<td class="left_title_2"><div align="right">批次号：</div></td>
								<td class="showTableTd" colspan="3"><div align="left">
								 <span contentEditable="true">
									<c:out value="${batchNo}"/>
									</span>
									</div>
								</td>	
							</tr>
							</c:if>
						</table>
						</div>
					</td>
				</tr>
				<!--  
			  <tr>
					<td align="left">交易请求信息：
				</tr>
        <tr>
        	<td align="center">
        		<div id="reqInfo" style="display: block;">
        		<div style="display:block;overflow:auto;height:65px;position:relative;">
						<table width="98%" cellspacing="1" cellpadding="3" style="table-layout: fixed;" class="showTable" id="exchangeSearchResultTb1">
							<tr>
								<c:forEach items="${reqDataList}" var="item" step="1" varStatus="var">
					    			<c:if test="${(var.index %3 eq 0)&&(0 != var.index)}">
					    				</tr><tr>
					    			</c:if>
					    			<td align="right" width="10%" class="left_title_2"><div align="right">${item[0]}</div></td>
									<c:if test="${fn:length(reqDataList) eq (var.index+1)}">
										<td align="left" class="showTableTd" width="*" colspan="${6 - (var.index % 3 + 1) * 2 + 1}"><c:if test="${fn:contains(item[0], '金额')}">￥</c:if>${item[1]}</td>
									</c:if>
									<c:if test="${fn:length(reqDataList) ne (var.index+1)}">
										<c:if test="${(var.index %3 eq 1)}">
											<c:if test="${fn:contains(item[0], '备注')}">
												<td align="left" class="clip" title="${item[1]}" width="15%"><NOBR>${item[1]}</NOBR></td>
											</c:if>
											<c:if test="${!fn:contains(item[0], '备注')}">
												<td align="left" class="showTableTd" width="15%"><c:if test="${fn:contains(item[0], '金额')}">￥</c:if>${item[1]}</td>
											</c:if>

										</c:if>
										<c:if test="${(var.index %3 eq 0)}">
											<c:if test="${fn:contains(item[0], '备注')}">
												<td align="left" class="clip" title="${item[1]}" width="22%"><NOBR>${item[1]}</NOBR></td>
											</c:if>
											<c:if test="${!fn:contains(item[0], '备注')}">
												<td align="left" class="showTableTd" width="22%"><c:if test="${fn:contains(item[0], '金额')}">￥</c:if>${item[1]}</td>
											</c:if>

										</c:if>
										<c:if test="${(var.index %3 eq 2)}">
										<c:if test="${fn:contains(item[0], '备注')}">
												<td align="left" title="${item[1]}" class="clip"><NOBR>${item[1]}</NOBR></td>
											</c:if>
											<c:if test="${!fn:contains(item[0], '备注')}">
												<td align="left" class="showTableTd"><c:if test="${fn:contains(item[0], '金额')}">￥</c:if>${item[1]}</td>
											</c:if>

										</c:if>
									</c:if>
				    			</c:forEach>
				    		</tr>
				    	</table>
				    	</div>
				    	</div>
				    </td>
				   </tr>
				   -->
				    	<c:if test="${fn:length(paymentList) > 0}">
				    		<tr><td align="left">购买产品信息：</td>
								</tr>
								<tr>
									<c:if test="${fn:length(paymentList) > 5}">
										<td align="left">
									</c:if>
									<c:if test="${fn:length(paymentList) <= 5}">
										<td align="center">
									</c:if>
										<table width="98%" cellspacing="1" cellpadding="3" class="showTable">
											<tr>
												<td width="6%" class="left_title_2">产品编号</td>
												<td width="16%" class="left_title_2">产品名称</td>
												<td width="8%" class="left_title_2">产品单价(￥)</td>
												<td width="8%" class="left_title_2">支付金额(￥)</td>
												<td width="10%" class="left_title_2">产品提供商</td>
												<!--
												<td width="10%" class="left_title_2">商城账号</td>
												 -->
												<td width="10%" class="left_title_2">行业</td>
											</tr>
											</table>
											<div style="display:block;overflow:auto;height:141px;position:relative;">
											<table width="98%" cellspacing="1" cellpadding="3" class="showTable" id="couponAccMangerTb" style="table-layout: fixed;">
											<c:forEach items="${paymentList}" var="item" step="1" varStatus="var">
												<tr style="background-color:#FFFFFF">
													<td width="6%" align="center"><c:out value="${item.productId}"/></td>
													<td width="16%" title="${item.productInfo}" align="center" class="clip"><NOBR><c:out value="${item.productInfo}"/></NOBR></td>
													<td width="8%" align="right">
														<fmt:formatNumber value="${item.price}" type="currency" pattern="#0.00"/>
													</td>
													<td width="8%" align="right">
														<fmt:formatNumber value="${item.userPay}" type="currency" pattern="#0.00"/>
													</td>
													<td class="clip" width="10%" align="left" title="${item.providerId}"><c:out value="${item.providerId}"/></td>
													<td width="10%" align="center">
														<c:forEach items="${listBizType}" var="bt" step="1" varStatus="var">
															<c:if test="${bt.code eq item.bizType}">
																<c:out value="${bt.name}"/>
															</c:if>
														</c:forEach>
													</td>
												</tr>
											</c:forEach>
										</table>
										<c:if test="${fn:length(paymentList) < 5}">
											<%
												List paymentList = (List)request.getAttribute("paymentList");
												int len = paymentList.size();
												int width = (5 - len) * 27;
											%>
										<div
											style="background-color:#FFFFFF;border-bottom:1px solid #87add0;border-left:1px solid #87add0;border-right:1px solid #87add0; width:97.7%; height:<%=width%>px;">
										</div>
										</c:if>
										</div>
									</td>
								</tr>
							</c:if>
							
							<c:if test="${fn:length(sAccountList) > 0}">
				    		<tr><td align="left">分账列表信息：</td>
								</tr>
								<tr>
									<c:if test="${fn:length(sAccountList) > 5}">
										<td align="left">
									</c:if>
									<c:if test="${fn:length(sAccountList) <= 5}">
										<td align="center">
									</c:if>
										<table width="98%" cellspacing="1" cellpadding="3" class="showTable">
											<tr>
												<td width="6%" class="left_title_2">角色类型</td>
												<td width="6%" class="left_title_2">角色编码</td>
												<!--<td width="8%" class="left_title_2">总金额</td>  -->
												<td width="8%" class="left_title_2">金额进出方向</td>
												<td width="10%" class="left_title_2">实分金额</td>
												<td width="10%" class="left_title_2">请求方向</td>
												<td width="10%" class="left_title_2">分账请求金额</td>	
												<td width="10%" class="left_title_2">主账户标识</td>									
												<td width="10%" class="left_title_2">创建时间</td>
											</tr>
										</table>
											<div style="display:block;overflow:auto;height:141px;position:relative;">
											<table width="98%" cellspacing="1" cellpadding="3" class="showTable" id="couponAccMangerTb" style="table-layout: fixed;">
											<c:forEach items="${sAccountList}" var="item" step="1" varStatus="var">
												<tr style="background-color:#FFFFFF">
													<td width="6%" align="center">
													<c:if test="${item.roleType eq 0 }">用户</c:if>
													<c:if test="${item.roleType eq 1 }">商户</c:if>
													<c:if test="${item.roleType eq 2 }">资金托管平台</c:if>
													<c:if test="${item.roleType eq 3 }">企业用户</c:if>				
													</td>
													<td width="6%" align="center" class="clip" >
													<span contentEditable="true">
														${item.roleCode}
													</span>
												
													</td>
													<!-- 	<td width="8%" align="center">
														<fmt:formatNumber value="${item.sum}" type="currency" pattern="#0.00"/>
													</td> -->												
													<td width="8%" align="center">
													<c:if test="${item.moneyDirection eq 0 }">进</c:if>
													<c:if test="${item.moneyDirection eq 1 }">出</c:if>						
													</td>
													<td class="clip" width="10%" align="center">
													<fmt:formatNumber value="${item.fund}" type="currency" pattern="#0.00"/>
													</td>
													<td width="10%" align="center">
													<c:if test="${item.requestDirection eq 0 }">进</c:if>
													<c:if test="${item.requestDirection eq 1 }">出</c:if>						
													</td>
													<td class="clip" width="10%" align="center">
													<fmt:formatNumber value="${item.requestFund}" type="currency" pattern="#0.00"/>
													</td>
													<td class="clip" width="10%" align="center">
													<c:if test="${item.mainAccountFlag eq 1 }">是</c:if>
													</td>
													<td width="10%" align="center">												
													<fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />					
													</td>	
												</tr>
											</c:forEach>
										</table>
									
										</div>
									</td>
								</tr>
							</c:if>
							
							<c:if test="${fn:length(couponList) > 0}">
								<tr>
											<td colspan="8" class="showTableTd">
												<table>
													<tr><td class="showTableTd" colspan="10">使用代金券信息</td>
													</tr>
													<tr>
													<td width="8%" class="left_title_2">编号</td>
													<td width="10%" class="left_title_2">名称</td>
													<td width="8%" class="left_title_2">券面值(￥)</td>
													<td width="10%" class="left_title_2">支持不足额</td>
													<td width="6%" class="left_title_2">限制张数</td>
													<td width="6%" class="left_title_2">限制比例</td>
													</tr>
											<c:forEach items="${couponList}" var="item" step="1" varStatus="var">
													<tr>
													<td width="8%" align="center"><c:out value="${item.couponId}"/></td>
													<td width="10%" align="center"><c:out value="${item.name}"/></td>
													<td width="10%" align="right">
														<fmt:formatNumber value="${item.parvalue}" type="currency" pattern="#0.00"/>
													</td>
													<td width="8%" align="center"><c:out value="${item.isFull}"/></td>
													<td width="10%" align="center"><c:out value="${item.limitCount}"/></td>
													<td width="10%" align="center"><c:out value="${item.limitRatio}"/></td>
													</tr>
												</c:forEach>
												</table>
												</td>
											</tr>
							</c:if>

				<tr>
					<td align="center">
				 		<input type="button" class="button2"
							onmouseover="this.style.backgroundImage='url(${request_path}/images/button2_bg_focus.jpg)'"
							onmouseout="this.style.backgroundImage='url(${request_path}/images/button2_bg.jpg)'"
							onclick="window.close()" value="关&nbsp;闭" />
					</td>
				</tr>
	  	</table>
			</div>
	  </form>
 	</body>
</html>


				    		<!--
											<tr>
												<td align="right" class="left_title_2"><div align="right">SMS/BOSS柜台信息号：</div></td>
												<td class="showTableTd">BIZ_HALL_NO</td>
												<td align="right" class="left_title_2"><div align="right">营业员编号：</div></td>
												<td class="showTableTd">OPERATOR_ID</td>
												<td align="right" class="left_title_2"><div align="right">柜台已开发票金额：</div></td>
												<td class="showTableTd">ISSUED_INVOICE_SUM</td>
												<td align="right" class="left_title_2"><div align="right">充值账户编号：</div></td>
												<td class="showTableTd">ACCOUNT_ID</td>
											</tr>
											<tr>
												<td class="left_title_2"><div align="right">充值金额：</div></td>
												<td class="showTableTd">FUND</td>
												<td align="right" class="left_title_2"><div align="right">银行账户：</div></td>
												<td class="showTableTd">CUS_ACCT</td>
												<td align="right" class="left_title_2"><div align="right">银行代码：</div></td>
												<td class="showTableTd">BANK_CODE</td>
												<td align="right" class="left_title_2"><div align="right">银行账户加密校验信息：</div></td>
												<td class="showTableTd">BANK_ENCODE_INFO</td>
											</tr>
											<tr>
												<td align="right" class="left_title_2"><div align="right">充值卡密码：</div></td>
												<td class="showTableTd">CARD_ID</td>
												<td align="right" class="left_title_2" ><div align="right">用户标识：</div></td>
												<td class="showTableTd" colspan="5">USER_ID</td>
											</tr>
											 -->
