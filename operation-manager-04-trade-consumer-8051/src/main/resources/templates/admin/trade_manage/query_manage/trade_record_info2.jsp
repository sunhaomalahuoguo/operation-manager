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
		<form name="PageForm" action="#" method="post">
			<input type="hidden" id="pageTab" name="pageTab" value="${pageTab}"></input>
			<div class="edit_area" id="tradeDetail" >
			<table width="100%">
				<tr>
					<td align='left'>交易基本信息：</td>
				</tr>
				<tr>
					<td align="center">
						<div id="basInfo" style="display:block">
						<table width="98%" cellspacing="1" cellpadding="3" class="showTable" style="table-layout: fixed;">
							<tr>
								<td width="15%" class="left_title_2"><div align="right">交易编号：</div></td>
								<td width="20%" class="showTableTd"><div align="left">
								  <span contentEditable="true">
									<fmt:formatNumber value="${tradeRecord.id}" type="currency" pattern="0000000000"/>
								  </span>
								</div></td>
								<td width="15%" class="left_title_2"><div align="right">交易类型：</div></td>
								<td width="18%" class="showTableTd"><div align="left">
									<c:forEach items="${listTradeType}" var="trade" step="1" varStatus="var">
								  	  <c:if test="${trade.code eq tradeRecord.tradeCode}">
								  	  <c:out value="${trade.name}"></c:out>
								  	  </c:if>
				            	</c:forEach>
								</div></td>
								<td width="12%" class="left_title_2"><div align="right">行业：</div></td>
								<td width="20%" class="showTableTd"><div align="left">
									<c:forEach items="${listBizType}" var="item" step="1" varStatus="var">
								  	  <c:if test="${item.id eq tradeRecord.bizType}">
								  	  <c:out value="${item.name}"></c:out>
								  	  </c:if>
				            	</c:forEach>
								</div></td>
							</tr>		
							<tr>
							<c:if test="${tradeRecord.tradeCode == 'HS0022' || tradeRecord.tradeCode == 'JC0019'|| tradeRecord.tradeCode == 'TZ0001' || tradeRecord.tradeCode == 'TZ0002' || tradeRecord.tradeCode == 'PF1002' || tradeRecord.tradeCode == 'DJ0005' ||tradeRecord.tradeCode == 'DK0004'}">
							<td class="left_title_2"><div align="right">交易金额：</div></td>
								<td class="showTableTd"><div align="left"><fmt:formatNumber value="${tradeRecord.tradeSum}" type="currency" pattern="#0.00"/>
								</div></td>
							<td class="left_title_2"><div align="right">商户应扣金额：</div></td>
							<td class="showTableTd"><div align="left"><fmt:formatNumber value="${tradeRecord.merFund}" type="currency" pattern="#0.00"/>
								</div></td>
							</c:if>
							<c:if test="${fn:substring(tradeRecord.tradeCode, 0, 2) == 'ZF' || tradeRecord.tradeCode == 'DK0003' ||tradeRecord.tradeCode == 'DK0005' || tradeRecord.tradeCode == 'ZF0502' || tradeRecord.tradeCode == 'ZF0503' ||
							tradeRecord.tradeCode == 'DK0104' ||tradeRecord.tradeCode == 'DK0105'|| tradeRecord.tradeCode == 'DJ0006' || tradeRecord.tradeCode == 'PF1005'|| tradeRecord.tradeCode == 'DK0026'}">
							<td class="left_title_2"><div align="right">交易金额：</div></td>
								<td class="showTableTd"><div align="left"><fmt:formatNumber value="${tradeRecord.tradeSum}" type="currency" pattern="#0.00"/>
								</div></td>
							<td class="left_title_2"><div align="right">商户应得金额：</div></td>
							<td class="showTableTd"><div align="left"><fmt:formatNumber value="${tradeRecord.merFund}" type="currency" pattern="#0.00"/>
								</div></td>
							</c:if>
							<c:if test="${tradeRecord.tradeCode == 'HS0002'||tradeRecord.tradeCode == 'HS0009'||tradeRecord.tradeCode == 'HS0010'
							||tradeRecord.tradeCode == 'HS0025'||tradeRecord.tradeCode == 'CZ1101' 
							||tradeRecord.tradeCode == 'JC0011'||tradeRecord.tradeCode == 'JC0012'|| fn:substring(tradeRecord.tradeCode, 0, 2) == 'SF'}">
							<td class="left_title_2"><div align="right">交易金额：</div></td>
								<td class="showTableTd"><div align="left"><fmt:formatNumber value="${tradeRecord.tradeSum}" type="currency" pattern="#0.00"/>
								</div></td>
								<td class="left_title_2"><div align="right">有效金额：</div></td>
								<td class="showTableTd"><div align="left"><fmt:formatNumber value="${tradeRecord.fld5}" type="currency" pattern="#0.00"/>
								</div></td>
							</c:if>
							<c:if test="${fn:substring(tradeRecord.tradeCode, 0, 2) == 'TX'}">
							<td class="left_title_2"><div align="right">交易金额：</div></td>
								<td class="showTableTd"><div align="left"><fmt:formatNumber value="${tradeRecord.tradeSum}" type="currency" pattern="#0.00"/>
								</div></td>
								<td class="left_title_2"><div align="right">有效金额：</div></td>
								<td class="showTableTd"><div align="left"><fmt:formatNumber value="${tradeRecord.fld5}" type="currency" pattern="#0.00"/>
								</div></td>
							</c:if>
							<c:if test="${tradeRecord.tradeCode != 'HS0022' && tradeRecord.tradeCode != 'JC0019'&& tradeRecord.tradeCode != 'JC0011'&& tradeRecord.tradeCode != 'JC0012'
								&& tradeRecord.tradeCode != 'TZ0001' && tradeRecord.tradeCode != 'TZ0002' && fn:substring(tradeRecord.tradeCode, 0, 2) != 'DK' && tradeRecord.tradeCode != 'DJ0005' 
								&& tradeRecord.tradeCode != 'DJ0006' && tradeRecord.tradeCode != 'PF1002' && tradeRecord.tradeCode != 'PF1005' && fn:substring(tradeRecord.tradeCode, 0, 2) != 'ZF'
							    && tradeRecord.tradeCode != 'CZ1101' && fn:substring(tradeRecord.tradeCode, 0, 2) != 'SF' && fn:substring(tradeRecord.tradeCode, 0, 2) != 'TX'}">
							<td class="left_title_2"><div align="right">交易金额：</div></td>
								<td class="showTableTd"><div align="left"><fmt:formatNumber value="${tradeRecord.tradeSum}" type="currency" pattern="#0.00"/>
								</div></td>
							<td class="left_title_2"><div align="right">其他金额：</div></td>
								<td class="showTableTd"><div align="left"> </div></td>
							</c:if>
								<td class="left_title_2"><div align="right">手续费：</div></td>
								<td class="showTableTd">
									<div align="left">
									<fmt:formatNumber value="${tradeRecord.tradeFee}" type="currency" pattern="#0.00"></fmt:formatNumber>
									</div>
								</td>														
							</tr>
							
							<c:if test="${method eq 4}">
								<tr>
									<td class="left_title_2"><div align="right">费率类型：</div></td>
									<td class="showTableTd"><div align="left">
										<c:out value="组合费率(单笔金额*费率+固定值)"/>
									</div>
									</td>
									<td class="left_title_2"><div align="right">固定值：</div></td>
									<td class="showTableTd"><div align="left">
										<c:out value="${fixFee}"/></div>
									</td>
									<td class="left_title_2"><div align="right"></div></td>
									<td class="showTableTd"><div align="left">
								  		<span contentEditable="true">
									
								  		</span>
										</div>
									</td>
								</tr>
							</c:if>													
							
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
								<td width="18%" class="left_title_2"><div align="right">第三方用户标识：</div></td>
								<td width="*" class="showTableTd" >
									<div align="left">
									<c:if test="${(tradeRecord.tradeCode == 'HS0002' || tradeRecord.tradeCode == 'HS0009' || tradeRecord.tradeCode == 'HS0010'
									|| tradeRecord.tradeCode == 'HS0025' || tradeRecord.tradeCode == 'JC0009'|| tradeRecord.tradeCode == 'JC0011'|| tradeRecord.tradeCode == 'JC0012'
									|| tradeRecord.tradeCode == 'CZ0101' || tradeRecord.tradeCode == 'CZ0201'|| tradeRecord.tradeCode == 'CZ0205')&& tradeRecord.fld1 ne null}">
									${tradeRecord.fld1}
									</c:if>
									<c:if test="${tradeRecord.tradeCode != 'CZ0101' && tradeRecord.tradeCode != 'CZ0201'&& tradeRecord.tradeCode != 'CZ0205'&& tradeRecord.tradeCode != 'CZ1104'&& tradeRecord.tradeCode != 'CZ1105' && fn:substring(tradeRecord.tradeCode,0,2) != 'TB' && tradeRecord.tradeCode != 'ZZ0001' && tradeRecord.tradeCode != 'ZF0103'
									&& tradeRecord.tradeCode != 'ZF0502' && tradeRecord.tradeCode != 'ZF0503' &&tradeRecord.tradeCode != 'SF1008' && tradeRecord.tradeCode != 'SF1007' && tradeRecord.tradeCode != 'SF1011' && tradeRecord.tradeCode != 'SF1013'
									&& tradeRecord.tradeCode != 'DK0004' && tradeRecord.tradeCode != 'DK0005' && tradeRecord.tradeCode != 'PF1002' && tradeRecord.tradeCode != 'SF0101' && tradeRecord.tradeCode != 'HS0002'
									&& tradeRecord.tradeCode != 'HS0009' && tradeRecord.tradeCode != 'HS0010' && tradeRecord.tradeCode != 'HS0022'  && tradeRecord.tradeCode != 'HS0025'
									&& tradeRecord.tradeCode != 'JC0007' && tradeRecord.tradeCode != 'JC0011' && tradeRecord.tradeCode != 'JC0012' && tradeRecord.tradeCode != 'JC0019'}">
									
									<span contentEditable="true">
										<c:out value="${tradeRecord.merchantUserIdentity}"/>
									</span>
									
									</c:if>							
									

									</div>
								</td>
								<td class="left_title_2"><div align="right">账户编号：</div></td>
								<td class="showTableTd"><div align="left">
								<span contentEditable="true">
									<c:out value="${tradeRecord.accountId}"/>
									</span>
								</div></td> 
							</tr>
							<tr>
								<td class="left_title_2"><div align="right">支付方式：</div></td>
								<td class="showTableTd">
									<div align="left">
										<c:if test="${tradeRecord.payType eq 0 }">快捷支付</c:if>
										<c:if test="${tradeRecord.payType eq 1 }">个人网银支付</c:if>
										
										<c:if test="${tradeRecord.payType eq 3 }">直连快捷</c:if>
										<c:if test="${tradeRecord.payType eq 4 }">代扣</c:if>
										<c:if test="${tradeRecord.payType eq 5 }">银联支付</c:if>
										<c:if test="${tradeRecord.payType eq 6 }">企业网银支付</c:if>
										<c:if test="${tradeRecord.payType eq 7 }">快捷支付M+</c:if>
										<c:if test="${tradeRecord.payType eq 8 }">微信支付</c:if>
										<c:if test="${tradeRecord.payType eq 9 }">微信支付-扫码</c:if>
										<c:if test="${tradeRecord.payType eq 10 }">微信支付-APP</c:if>
										<c:if test="${tradeRecord.payType eq 11 }">微信支付-公众号</c:if>
										<c:if test="${tradeRecord.payType eq 12 }">原生代扣</c:if>
										<c:if test="${tradeRecord.payType eq 13 }">协议支付(借记卡)</c:if>
										<c:if test="${tradeRecord.payType eq 14 }">协议支付(贷记卡)</c:if>
									</div>
								</td>
								<td class="left_title_2"><div align="right">结算交易流水：</div></td>
								<td class="showTableTd"><div align="left">
									<c:out value="${tradeRecord.settlementTradeId}"/>
								</div></td> 
								<td class="left_title_2"><div align="right">目标对象：</div></td>
								<td class="showTableTd"><div align="left">
									<c:out value="${destObject}"/>
								</div></td>
							</tr>
							<tr>
								<!--   <td class="left_title_2"><div align="right">银行渠道：</div></td>
								<td class="showTableTd"><div align="left">
									<c:out value="${tradeRecord.bankCode}"/>
									</div>
								</td> -->
								<td class="left_title_2"><div align="right">请求编号：</div></td>
								<td class="showTableTd"><div align="left">
								  <span contentEditable="true">
									<c:out value="${tradeRecord.orderId}"/>
								  </span>
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
										<span contentEditable="true"><c:out value="${tradeRecord.bankAccount}"/></span>
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
										<c:if test="${2 eq tradeRecord.refundStatus}">退款中</c:if>
										<c:if test="${3 eq tradeRecord.refundStatus}">退款失败</c:if>
										<c:if test="${4 eq tradeRecord.refundStatus}">退款拒绝</c:if>
									</div>
								</td>
								<td class="left_title_2"><div align="right">手工调整状态：</div></td>
								<td class="showTableTd"><div align="left">
									 <c:if test="${0 eq tradeRecord.manualAdjustStatus}">未调整</c:if>
								 	 <c:if test="${2 eq tradeRecord.manualAdjustStatus}">已调整</c:if>
								 	 <c:if test="${3 eq tradeRecord.manualAdjustStatus}">已勾对</c:if>
								</div></td> 
							</tr>	
							<tr>	
								<td class="left_title_2"><div align="right">超时失败标识：</div></td>
								<td class="showTableTd"><div align="left">
								      <c:if test="${tradeRecord.timeoutFlg eq null || tradeRecord.timeoutFlg==''}">
								  	  	<c:out value=""></c:out>
								  	  </c:if>
									  <c:if test="${tradeRecord.timeoutFlg eq 0}">
								  	  	<c:out value="未超时"></c:out>
								  	  </c:if>
								  	  <c:if test="${tradeRecord.timeoutFlg eq 1}">
								  	  	<c:out value="已超时"></c:out>
								  	  </c:if>
								</div></td> 
									<td class="left_title_2"><div align="right">手续费收取类型：</div></td>
								<td class="showTableTd"><div align="left">
								     <c:if test="${tradeRecord.chargeType eq 0}">
								  	  	<c:out value="实时"></c:out>
								  	  </c:if>
								  	  <c:if test="${tradeRecord.chargeType eq 1}">
								  	  	<c:out value="预付"></c:out>
								  	  </c:if>		
								  	  <c:if test="${tradeRecord.chargeType eq 2}">
								  	  	<c:out value="垫付"></c:out>
								  	  </c:if>	
								  	  <c:if test="${tradeRecord.chargeType eq 3}">
								  	  	<c:out value="后付"></c:out>
								  	  </c:if>						  
									</div>
								</td>								
								<td class="left_title_2"><div align="right">批次号：</div></td>
								<td class="showTableTd"><div align="left">
								 <span contentEditable="true">${batchNo}</span>
									</div>
								</td>							
							</tr>																																																	
							<!-- fld字段 -->
								<tr>
							    <td class="left_title_2"><div align="right">手工调整时间：</div></td>
								<td class="showTableTd"><div align="left">
									 <fmt:formatDate value="${tradeRecord.manualAdjustTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
								</div></td> 
								<td class="left_title_2"><div align="right">对账状态：</div></td>
								<td class="showTableTd"><div align="left">
									 <c:if test="${0 eq tradeRecord.checkStatus}">未对账</c:if>
									 <c:if test="${1 eq tradeRecord.checkStatus}">已平账</c:if>
									 <c:if test="${2 eq tradeRecord.checkStatus}">未平账</c:if>
								 	 <c:if test="${3 eq tradeRecord.checkStatus}">支付系统多交易</c:if>
								 	 <c:if test="${5 eq tradeRecord.checkStatus}">支付未终态</c:if>
								 	 <c:if test="${100 eq tradeRecord.checkStatus}">银行系统多交易</c:if>
								</div></td> 
								<td class="left_title_2"><div align="right">
								<!--  
								<c:if test="${(tradeRecord.tradeCode == 'HS0002' || tradeRecord.tradeCode == 'HS0009' || tradeRecord.tradeCode == 'HS0010'
								|| tradeRecord.tradeCode == 'HS0025' || tradeRecord.tradeCode == 'JC0009'|| tradeRecord.tradeCode == 'JC0011'|| tradeRecord.tradeCode == 'JC0012'
								|| tradeRecord.tradeCode == 'CZ0101' || tradeRecord.tradeCode == 'CZ0201'|| tradeRecord.tradeCode == 'CZ0205')&& tradeRecord.fld1 ne null}">第三方用户标识：</c:if>
								-->
								<c:if test="${tradeRecord.tradeCode == 'SF0101' && tradeRecord.fld1 ne null}">入账方类型：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'CZ1104' || tradeRecord.tradeCode == 'CZ1105') && tradeRecord.fld1 ne null}">入账时间：</c:if>
								<c:if test="${(fn:substring(tradeRecord.tradeCode,0,2) == 'TB'|| tradeRecord.tradeCode == 'ZZ0001') && tradeRecord.fld1 ne null}">项目编号：</c:if>
								<c:if test="${((tradeRecord.tradeCode == 'ZF0103' ||tradeRecord.tradeCode == 'ZF0502' ||tradeRecord.tradeCode == 'ZF0503') && tradeRecord.refundStatus == 0) && tradeRecord.fld1 ne null}">快捷信息绑定ID：</c:if>
								<c:if test="${((tradeRecord.tradeCode == 'ZF0502' ||tradeRecord.tradeCode == 'ZF0503' || tradeRecord.tradeCode == 'ZF0103') && tradeRecord.refundStatus == 1) && tradeRecord.fld1 ne null}">退款信息：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'SF1008' ||tradeRecord.tradeCode == 'SF1007') && tradeRecord.fld1 ne null}">付款原因：</c:if>
								<c:if test="${tradeRecord.tradeCode == 'SF1011' && tradeRecord.fld1 ne null}">业务类型：</c:if>
								<c:if test="${tradeRecord.tradeCode == 'SF1013' && tradeRecord.fld1 ne null}">付款至用户账户类型：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'DK0004' ||tradeRecord.tradeCode == 'DK0005') && tradeRecord.fld1 ne null}">原代扣交易流水ID：</c:if>
								<c:if test="${tradeRecord.tradeCode == 'PF1002' && tradeRecord.fld1 ne null}">付款类型：</c:if>
								<c:if test="${tradeRecord.tradeCode != 'CZ0101' && tradeRecord.tradeCode != 'CZ0201'&& tradeRecord.tradeCode != 'CZ0205'&& tradeRecord.tradeCode != 'CZ1104'&& tradeRecord.tradeCode != 'CZ1105' && fn:substring(tradeRecord.tradeCode,0,2) != 'TB' && tradeRecord.tradeCode != 'ZZ0001' && tradeRecord.tradeCode != 'ZF0103'
								&& tradeRecord.tradeCode != 'ZF0502' && tradeRecord.tradeCode != 'ZF0503' &&tradeRecord.tradeCode != 'SF1008' && tradeRecord.tradeCode != 'SF1007' && tradeRecord.tradeCode != 'SF1011' && tradeRecord.tradeCode != 'SF1013'
								&& tradeRecord.tradeCode != 'DK0004' && tradeRecord.tradeCode != 'DK0005' && tradeRecord.tradeCode != 'PF1002' && tradeRecord.tradeCode != 'SF0101' && tradeRecord.tradeCode != 'HS0002'
								&& tradeRecord.tradeCode != 'HS0009' && tradeRecord.tradeCode != 'HS0010' && tradeRecord.tradeCode != 'HS0022'  && tradeRecord.tradeCode != 'HS0025'
								&& tradeRecord.tradeCode != 'JC0007' && tradeRecord.tradeCode != 'JC0011' && tradeRecord.tradeCode != 'JC0012' && tradeRecord.tradeCode != 'JC0019'&& tradeRecord.fld1 ne null}">备注字段1：</c:if>
								<c:if test="${tradeRecord.fld1 eq null }">备注字段1：</c:if>
								</div></td>
								<td class="showTableTd"><div align="left">
								
								<c:if test="${tradeRecord.tradeCode == 'SF1011' && tradeRecord.fld1 ne null}">
								<c:if test="${tradeRecord.fld1 eq 1 }">付款</c:if>
								<c:if test="${tradeRecord.fld1 eq 2 }">提现</c:if>
								</c:if>	
                                <c:if test="${tradeRecord.tradeCode == 'SF0101' && tradeRecord.fld1 ne null}">
                                <c:if test="${tradeRecord.fld1 eq 0 }">普通用户</c:if>
                                <c:if test="${tradeRecord.fld1 eq 1 }">企业用户</c:if>
                                </c:if> 
								<c:if test="${tradeRecord.tradeCode == 'SF1013' && tradeRecord.fld1 ne null}">
								<c:if test="${tradeRecord.fld1 eq 1 }">可用账户</c:if>								
								</c:if>	
								<c:if test="${(tradeRecord.tradeCode == 'CZ1104' || tradeRecord.tradeCode == 'CZ1105') && tradeRecord.fld1 ne null}">
								${tradeRecord.fld1}								
								</c:if>	
								<c:if test="${tradeRecord.tradeCode == 'PF1002' && tradeRecord.fld1 ne null}">
								<c:if test="${tradeRecord.fld1 eq 0 }">付款至企业账户</c:if>
								<c:if test="${tradeRecord.fld1 eq 1 }">线上代发</c:if>
								<c:if test="${tradeRecord.fld1 eq 2 }">线下代发</c:if>
								</c:if>
								<!--  
								<c:if test="${tradeRecord.tradeCode !='SF1011'&& tradeRecord.tradeCode != 'CZ1104'&& tradeRecord.tradeCode != 'CZ1105' && tradeRecord.tradeCode !='SF1013' && tradeRecord.tradeCode !='PF1002' && tradeRecord.tradeCode != 'SF0101' && tradeRecord.fld1 ne null}">${tradeRecord.fld1}</c:if>
								-->								
								<c:if test="${tradeRecord.fld1 eq null}"></c:if>
								</div>
								</td>
								
							</tr>	
								<tr>	
								<td class="left_title_2"><div align="right">
								<c:if test="${(tradeRecord.tradeCode == 'TX0002' ||tradeRecord.tradeCode == 'TX0202'|| tradeRecord.tradeCode == 'TX0101' || tradeRecord.tradeCode == 'CZ0101' || tradeRecord.tradeCode == 'CZ0201'|| tradeRecord.tradeCode == 'CZ0205'||tradeRecord.tradeCode == 'TB0004' ||tradeRecord.tradeCode == 'TB0006'
								||tradeRecord.tradeCode == 'TB0026' || tradeRecord.tradeCode == 'CZ0104' || tradeRecord.tradeCode == 'HS0002'|| tradeRecord.tradeCode == 'HS0009'|| tradeRecord.tradeCode == 'HS0010'|| tradeRecord.tradeCode == 'HS0025'
								|| tradeRecord.tradeCode == 'JC0007'|| tradeRecord.tradeCode == 'JC0011'|| tradeRecord.tradeCode == 'JC0012') && tradeRecord.fld2 ne null}">p2p手续费收取方式：</c:if>
								<c:if test="${tradeRecord.tradeCode == 'TB0001' && tradeRecord.fld2 ne null }">冻结解冻标识：</c:if>
								<c:if test="${tradeRecord.tradeCode == 'TB0003' && tradeRecord.fld2 ne null }">原投标冻结请求ID：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'TB0005' || tradeRecord.tradeCode == 'TB0034') && tradeRecord.fld2 ne null }">还款类型：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'TB0015' || tradeRecord.tradeCode == 'SF0101'|| tradeRecord.tradeCode == 'HS0029') && tradeRecord.fld2 ne null }">手续费收取方式：</c:if>
								<c:if test="${tradeRecord.tradeCode == 'SF1013' && tradeRecord.fld2 ne null }">付款方式：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'ZF0103' || tradeRecord.tradeCode == 'ZF0502' || tradeRecord.tradeCode == 'ZF0503') && tradeRecord.fld2 ne null }">是否为绑定支付：</c:if>
								<c:if test="${tradeRecord.tradeCode == 'DK0003' && tradeRecord.fld2 ne null }">代扣类型：</c:if>
								<c:if test="${tradeRecord.tradeCode != 'TX0002' && tradeRecord.tradeCode != 'TX0202'&& tradeRecord.tradeCode != 'CZ0101'&& tradeRecord.tradeCode != 'CZ0201'&& tradeRecord.tradeCode != 'CZ0205'&& tradeRecord.tradeCode != 'CZ0104' && tradeRecord.tradeCode != 'TB0004' && tradeRecord.tradeCode != 'TB0006'
								&& tradeRecord.tradeCode != 'TB0001' && tradeRecord.tradeCode != 'TB0003' && tradeRecord.tradeCode != 'TB0005'&& tradeRecord.tradeCode != 'TB0015' && tradeRecord.tradeCode != 'TB0026'&& tradeRecord.tradeCode != 'ZF0103'
								&& tradeRecord.tradeCode != 'ZF0502' && tradeRecord.tradeCode != 'ZF0503' && tradeRecord.tradeCode != 'DK0003' && tradeRecord.tradeCode != 'SF1013' && tradeRecord.tradeCode != 'TB0034' && tradeRecord.tradeCode != 'TX0101' && tradeRecord.tradeCode != 'SF0101' 
								&& tradeRecord.tradeCode != 'DK0026' && tradeRecord.tradeCode != 'HS0002' && tradeRecord.tradeCode != 'HS0009' && tradeRecord.tradeCode != 'HS0010' && tradeRecord.tradeCode != 'HS0025' && tradeRecord.tradeCode != 'HS0029'
								&& tradeRecord.tradeCode != 'JC0007' && tradeRecord.tradeCode != 'JC0011' && tradeRecord.tradeCode != 'JC0012' && tradeRecord.fld2 ne null}">备注字段2：</c:if>
								<c:if test="${tradeRecord.fld2 eq null }">备注字段2：</c:if>
								</div></td>
								<td class="showTableTd"><div align="left">
								
								<c:if test="${(tradeRecord.tradeCode == 'TX0002' ||tradeRecord.tradeCode == 'TX0202'|| tradeRecord.tradeCode == 'CZ0101'|| tradeRecord.tradeCode == 'CZ0201'|| tradeRecord.tradeCode == 'HS0002'|| tradeRecord.tradeCode == 'HS0009'|| tradeRecord.tradeCode == 'HS0010'|| tradeRecord.tradeCode == 'HS0025'
								|| tradeRecord.tradeCode == 'CZ0104' ||tradeRecord.tradeCode == 'TB0004' ||tradeRecord.tradeCode == 'TB0006'||tradeRecord.tradeCode == 'TB0026'|| tradeRecord.tradeCode == 'JC0007'|| tradeRecord.tradeCode == 'JC0011'|| tradeRecord.tradeCode == 'JC0012'
								) && tradeRecord.fld2 ne null}">
								<c:if test="${tradeRecord.fld2 eq '0' }">从指定主账户收取</c:if>
								<c:if test="${tradeRecord.fld2 eq '1' }">各分账方均摊</c:if>
								<c:if test="${tradeRecord.fld2 eq '2' }">商户自有资金账户垫付</c:if>
								<c:if test="${tradeRecord.fld2 eq '3' }">商户预付手续费账户垫付</c:if>
								<c:if test="${tradeRecord.fld2 eq '5' }">后付手续费账户垫付</c:if>
								</c:if>
								<c:if test="${tradeRecord.tradeCode == 'TB0001' && tradeRecord.fld2 ne null }">
								<c:if test="${tradeRecord.fld2 eq 0 }">冻结</c:if>
								<c:if test="${tradeRecord.fld2 eq 1 }">解冻</c:if>
								</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'TB0015' || tradeRecord.tradeCode == 'SF0101' || tradeRecord.tradeCode == 'TX0101'|| tradeRecord.tradeCode == 'HS0029')&& tradeRecord.fld2 ne null }">
								<c:if test="${tradeRecord.fld2 eq '0' }">从指定主账户收取</c:if>
                                <c:if test="${tradeRecord.fld2 eq '1' }">各分账方均摊</c:if>
                                <c:if test="${tradeRecord.fld2 eq 2 }">商户自有资金账户垫付</c:if>
								<c:if test="${tradeRecord.fld2 eq 3 }">商户预付手续费账户垫付</c:if>
								<c:if test="${tradeRecord.fld2 eq 4 }">实时</c:if>
								</c:if>
								<c:if test="${tradeRecord.tradeCode == 'TB0003' && tradeRecord.fld2 ne null }">${tradeRecord.fld2 }</c:if>
								
								<c:if test="${(tradeRecord.tradeCode == 'TB0005' || tradeRecord.tradeCode == 'TB0034') && tradeRecord.fld2 ne null }">
								<c:if test="${tradeRecord.fld2 eq 1 }">自动</c:if>
								<c:if test="${tradeRecord.fld2 eq 0 }">手动</c:if>
								</c:if>
								
								<c:if test="${(tradeRecord.tradeCode == 'ZF0103' || tradeRecord.tradeCode == 'ZF0502' || tradeRecord.tradeCode == 'ZF0503') && tradeRecord.fld2 ne null }">
								<c:if test="${tradeRecord.fld2 eq 0 }">是</c:if>
								<c:if test="${tradeRecord.fld2 eq 1}">否</c:if>
								</c:if>
								
								<c:if test="${(tradeRecord.tradeCode == 'DK0003'||tradeRecord.tradeCode == 'DK0026') && tradeRecord.fld2 ne null }">
								<c:if test="${tradeRecord.fld2 eq 0 }">线上</c:if>
								<c:if test="${tradeRecord.fld2 eq 1}">线下</c:if>
								</c:if>
								
								<c:if test="${tradeRecord.tradeCode == 'SF1013' && tradeRecord.fld2 ne null }">
								<c:if test="${tradeRecord.fld2 eq 0 }">单笔</c:if>
								<c:if test="${tradeRecord.fld2 eq 1 }">批量</c:if>
								<c:if test="${tradeRecord.fld2 eq 2 }">用户导入</c:if>
								</c:if>
								
								<c:if test="${tradeRecord.tradeCode != 'TX0002' &&tradeRecord.tradeCode != 'TX0202'&& tradeRecord.tradeCode != 'CZ0101'&& tradeRecord.tradeCode != 'CZ0201'&& tradeRecord.tradeCode != 'CZ0205'&& tradeRecord.tradeCode != 'CZ0104' && tradeRecord.tradeCode != 'TB0004' && tradeRecord.tradeCode != 'TB0006'
								&& tradeRecord.tradeCode != 'TB0001' && tradeRecord.tradeCode != 'TB0003' && tradeRecord.tradeCode != 'TB0005'&& tradeRecord.tradeCode != 'TB0015' && tradeRecord.tradeCode != 'TB0026'&& tradeRecord.tradeCode != 'ZF0103'
								&& tradeRecord.tradeCode != 'ZF0502' && tradeRecord.tradeCode != 'ZF0503' && tradeRecord.tradeCode != 'DK0003' && tradeRecord.tradeCode != 'SF1013' && tradeRecord.tradeCode != 'TB0034' && tradeRecord.tradeCode != 'TX0101' && tradeRecord.tradeCode != 'SF0101'
								&& tradeRecord.tradeCode != 'DK0026' && tradeRecord.tradeCode != 'HS0002' && tradeRecord.tradeCode != 'HS0009' && tradeRecord.tradeCode != 'HS0010'&& tradeRecord.tradeCode != 'HS0025' && tradeRecord.tradeCode != 'HS0029'
								&& tradeRecord.tradeCode != 'JC0007' && tradeRecord.tradeCode != 'JC0011' && tradeRecord.tradeCode != 'JC0012'&& tradeRecord.fld2 ne null}">${tradeRecord.fld2}</c:if>
								<c:if test="${tradeRecord.fld2 eq null}"></c:if>
								
									</div>
								</td>						
								<td class="left_title_2"><div align="right">
								<c:if test="${(tradeRecord.tradeCode == 'TX0002' ||tradeRecord.tradeCode == 'TX0202'|| tradeRecord.tradeCode == 'TX0101') && tradeRecord.fld3 ne null }">收款账户银行代码：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'CZ0101'||tradeRecord.tradeCode == 'CZ0201'||tradeRecord.tradeCode == 'CZ0205'||tradeRecord.tradeCode == 'CZ0104'||tradeRecord.tradeCode == 'HS0002'||tradeRecord.tradeCode == 'HS0009'||tradeRecord.tradeCode == 'HS0010'||tradeRecord.tradeCode == 'HS0025'
								|| tradeRecord.tradeCode == 'JC0007'|| tradeRecord.tradeCode == 'JC0011'|| tradeRecord.tradeCode == 'JC0012') && tradeRecord.fld3 ne null }">付款账户银行代码：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'TX0005'||tradeRecord.tradeCode == 'TX0206') && tradeRecord.fld3 ne null }">原收款账户银行代码：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'CZ1104'||tradeRecord.tradeCode == 'CZ1105') && tradeRecord.fld3 ne null }">入账银行代码：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'TB0001' || tradeRecord.tradeCode == 'RZ0001') && tradeRecord.fld3 ne null }">冻结资金ID：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'ZF0102' || tradeRecord.tradeCode == 'ZF0103' || tradeRecord.tradeCode == 'ZF0108' || tradeRecord.tradeCode == 'ZF0109' ||tradeRecord.tradeCode == 'ZF0201' ||tradeRecord.tradeCode == 'ZF0301' ||tradeRecord.tradeCode == 'ZF0401'||tradeRecord.tradeCode == 'ZF0402'||tradeRecord.tradeCode == 'ZF0405'||tradeRecord.tradeCode == 'ZF0502'||tradeRecord.tradeCode == 'ZF0503') && tradeRecord.fld3 ne null }">支付银行代码：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'SF1008' || tradeRecord.tradeCode == 'TX1002') && tradeRecord.fld3 ne null }">收款账户银行代码：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'SF1011' || tradeRecord.tradeCode == 'CZ1101' || tradeRecord.tradeCode == 'DK0003' || tradeRecord.tradeCode == 'DK0026' || tradeRecord.tradeCode == 'TB0015'|| tradeRecord.tradeCode == 'HS0029') && tradeRecord.fld3 ne null }">银行代码：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'HS0022' || tradeRecord.tradeCode == 'JC0019' || tradeRecord.tradeCode == 'TZ0001' )&& tradeRecord.fld3 ne null }">原支付交易银行代码：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'DK0004' || tradeRecord.tradeCode == 'DK0005') && tradeRecord.fld3 ne null }">原代扣银行代码：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'PF1002' || tradeRecord.tradeCode == 'PF1005') && tradeRecord.fld3 ne null }">代发银行代码：</c:if>
	
								<c:if test="${tradeRecord.tradeCode != 'TX0002' &&tradeRecord.tradeCode != 'TX0202'&& tradeRecord.tradeCode != 'CZ0101'&& tradeRecord.tradeCode != 'CZ0201'&& tradeRecord.tradeCode != 'CZ0205' && tradeRecord.tradeCode != 'CZ0104' && tradeRecord.tradeCode != 'CZ1104'&& tradeRecord.tradeCode != 'CZ1105' && tradeRecord.tradeCode != 'TX0005' && tradeRecord.tradeCode != 'TX0206'&& tradeRecord.tradeCode != 'TB0001'
								&& tradeRecord.tradeCode != 'RZ0001' && tradeRecord.tradeCode != 'ZF0102' &&  tradeRecord.tradeCode != 'ZF0103' && tradeRecord.tradeCode != 'ZF0108' && tradeRecord.tradeCode != 'ZF0109' && tradeRecord.tradeCode != 'ZF0201' && tradeRecord.tradeCode != 'ZF0301'&& tradeRecord.tradeCode != 'ZF0401'&& tradeRecord.tradeCode != 'ZF0402'&& tradeRecord.tradeCode != 'ZF0405' && tradeRecord.tradeCode != 'ZF0502'&& tradeRecord.tradeCode != 'ZF0503'
								&& tradeRecord.tradeCode != 'SF1008' && tradeRecord.tradeCode != 'TX1002' && tradeRecord.tradeCode != 'SF1011' && tradeRecord.tradeCode != 'CZ1101' && tradeRecord.tradeCode != 'DK0003' && tradeRecord.tradeCode != 'DK0026' && tradeRecord.tradeCode != 'TB0015' && tradeRecord.tradeCode != 'HS0029'
								&& tradeRecord.tradeCode != 'TZ0001' && tradeRecord.tradeCode != 'HS0002' && tradeRecord.tradeCode != 'HS0009' && tradeRecord.tradeCode != 'HS0010' && tradeRecord.tradeCode != 'HS0022' && tradeRecord.tradeCode != 'HS0025' && tradeRecord.tradeCode != 'DK0004' && tradeRecord.tradeCode != 'DK0005' 
								&&tradeRecord.tradeCode != 'PF1002' && tradeRecord.tradeCode != 'PF1005' && tradeRecord.tradeCode != 'TX0101' && tradeRecord.tradeCode != 'JC0007' && tradeRecord.tradeCode != 'JC0011' && tradeRecord.tradeCode != 'JC0012'&& tradeRecord.tradeCode != 'JC0019'&& tradeRecord.fld3 ne null }">备注字段3：</c:if>
								<c:if test="${tradeRecord.fld3 eq null }">备注字段3：</c:if>
								</div></td>
								
								<td class="showTableTd"><div align="left"><span contentEditable="true">${tradeRecord.fld3}</span></div>
								</td>
								
								<td class="left_title_2 "><div align="right">
								<c:if test="${(tradeRecord.tradeCode == 'TX0002' || tradeRecord.tradeCode == 'TX0202') && tradeRecord.fld4 ne null }">备注字段4：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'HS0002'  || tradeRecord.tradeCode == 'HS0025'|| tradeRecord.tradeCode == 'CZ0101' 
								|| tradeRecord.tradeCode == 'CZ0201'|| tradeRecord.tradeCode == 'CZ0205'|| tradeRecord.tradeCode == 'CZ1101'
								|| tradeRecord.tradeCode == 'JC0007') && tradeRecord.fld4 ne null }">借贷分离标识：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'TB0001' || tradeRecord.tradeCode == 'RZ0001') && tradeRecord.fld4 ne null }">解冻资金ID：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'ZF0102' || tradeRecord.tradeCode == 'ZF0103' || tradeRecord.tradeCode == 'ZF0108' || tradeRecord.tradeCode == 'ZF0109' ||tradeRecord.tradeCode == 'ZF0502'||tradeRecord.tradeCode == 'ZF0503') && tradeRecord.fld4 ne null }">支付信息：</c:if>
								<c:if test="${tradeRecord.tradeCode == 'DK0003' && tradeRecord.fld4 ne null }">代扣渠道：</c:if>	
								<c:if test="${tradeRecord.tradeCode == 'TB0026' && tradeRecord.fld4 ne null }">原订单号：</c:if>		
								<c:if test="${(tradeRecord.tradeCode == 'TB0015' || tradeRecord.tradeCode == 'HS0029')&& tradeRecord.fld4 ne null }">请求渠道：</c:if>					
								<c:if test="${tradeRecord.tradeCode != 'HS0002'   && tradeRecord.tradeCode != 'HS0025' && tradeRecord.tradeCode != 'CZ0101'&& tradeRecord.tradeCode != 'CZ0201'&& tradeRecord.tradeCode != 'CZ0205' && tradeRecord.tradeCode != 'CZ1101' && tradeRecord.tradeCode != 'TX0002'&& tradeRecord.tradeCode != 'TX0202'
								&& tradeRecord.tradeCode != 'TB0001' && tradeRecord.tradeCode != 'TB0015' && tradeRecord.tradeCode != 'TB0026'&& tradeRecord.tradeCode != 'RZ0001' && tradeRecord.tradeCode != 'ZF0102'
								&& tradeRecord.tradeCode != 'ZF0103' && tradeRecord.tradeCode != 'ZF0108' && tradeRecord.tradeCode != 'ZF0109' && tradeRecord.tradeCode != 'ZF0502' && tradeRecord.tradeCode != 'ZF0503' && tradeRecord.tradeCode != 'DK0003' 
								&& tradeRecord.tradeCode != 'DK0026'&& tradeRecord.tradeCode != 'HS0029'&& tradeRecord.tradeCode != 'JC0007'&& tradeRecord.fld4 ne null }">备注字段4：</c:if>
								<c:if test="${tradeRecord.fld4 eq null }">备注字段4：</c:if>
								</div></td>
								<td class="showTableTd"><div align="left">
								<span contentEditable="true">
								<c:if test="${(tradeRecord.tradeCode == 'DK0003'|| tradeRecord.tradeCode == 'DK0026')&& tradeRecord.fld4 ne null }">
								<c:if test="${tradeRecord.fld4 eq 0 }">商户自助</c:if>
								<c:if test="${tradeRecord.fld4 eq 1 }">接口</c:if>
								</c:if>	
								<c:if test="${(tradeRecord.tradeCode == 'HS0002' || tradeRecord.tradeCode == 'HS0025' 
								|| tradeRecord.tradeCode == 'CZ0101' || tradeRecord.tradeCode == 'CZ0201'|| tradeRecord.tradeCode == 'CZ0205'
								|| tradeRecord.tradeCode == 'CZ1101' || tradeRecord.tradeCode == 'JC0007') && tradeRecord.fld4 ne null }">
								<c:if test="${tradeRecord.fld4 eq 0 }">借贷混合</c:if>
								<c:if test="${tradeRecord.fld4 eq 1 }">仅借记卡</c:if>
								</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'TB0015' || tradeRecord.tradeCode == 'HS0029')&& tradeRecord.fld4 ne null }">
								<c:if test="${tradeRecord.fld4 eq 0 }">线上</c:if>
								<c:if test="${tradeRecord.fld4 eq 1 }">线下</c:if>
								</c:if>	
								<c:if test="${tradeRecord.tradeCode != 'DK0003' &&tradeRecord.tradeCode != 'DK0026'&& tradeRecord.tradeCode != 'CZ0101' 
								&& tradeRecord.tradeCode != 'CZ0201'&& tradeRecord.tradeCode != 'CZ0205'&& tradeRecord.tradeCode != 'HS0002'  
								&& tradeRecord.tradeCode != 'HS0025' && tradeRecord.tradeCode != 'CZ1101' && tradeRecord.tradeCode != 'TB0015' 
								&& tradeRecord.tradeCode != 'HS0029'&& tradeRecord.tradeCode != 'JC0007'&& tradeRecord.fld4 ne null }">${tradeRecord.fld4}</c:if>
								<c:if test="${tradeRecord.fld4 eq null }"></c:if>
									</span></div>
								</td>								
							</tr>	
								<tr>	
								<td class="left_title_2"><div align="right">
								<c:if test="${(tradeRecord.tradeCode == 'TX0002' ||tradeRecord.tradeCode == 'TX0202'|| tradeRecord.tradeCode == 'TX1002' || tradeRecord.tradeCode == 'TX0101') && tradeRecord.fld5 ne null }">请求金额：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'TX0005' ||tradeRecord.tradeCode == 'TX0206')&& tradeRecord.fld5 ne null }">原请求金额：</c:if>
								<c:if test="${tradeRecord.tradeCode == 'TB0001'&& tradeRecord.fld5 ne null }">投标类型：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'SF1008' || tradeRecord.tradeCode == 'SF1007' || tradeRecord.tradeCode == 'CZ1101')&& tradeRecord.fld5 ne null }">实付金额：</c:if>
								
								<c:if test="${tradeRecord.tradeCode == 'SF1011'&& tradeRecord.fld5 ne null }">退票金额：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'TB0015'|| tradeRecord.tradeCode == 'HS0029')&& tradeRecord.fld5 ne null }">请求方式：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'PF1002' || tradeRecord.tradeCode == 'PF1005')&& tradeRecord.fld5 ne null }">代发请求金额：</c:if>
								<c:if test="${tradeRecord.tradeCode != 'TX0002' &&tradeRecord.tradeCode != 'TX0202'&& tradeRecord.tradeCode != 'TX1002' && tradeRecord.tradeCode != 'TX0005' 
								 && tradeRecord.tradeCode != 'TX0206' && tradeRecord.tradeCode != 'TB0001' && tradeRecord.tradeCode != 'TB0015'&& tradeRecord.tradeCode != 'HS0029'
								&& tradeRecord.tradeCode != 'SF1008' && tradeRecord.tradeCode != 'SF1007' && tradeRecord.tradeCode != 'CZ1101' && tradeRecord.tradeCode != 'SF1011' && tradeRecord.tradeCode != 'DK0003'
								 && tradeRecord.tradeCode != 'DK0004' && tradeRecord.tradeCode != 'DK0005' && tradeRecord.tradeCode != 'PF1002' && tradeRecord.tradeCode != 'PF1005' && tradeRecord.tradeCode != 'TX0101' 
								 &&tradeRecord.tradeCode != 'DK0026'&& tradeRecord.fld5 ne null }">备注字段5：</c:if>
								<c:if test="${tradeRecord.fld5 eq null }">备注字段5：</c:if>
								</div></td>
								<td class="showTableTd"><div align="left">	
								<span contentEditable="true">
								<c:if test="${tradeRecord.tradeCode == 'TB0001'&& tradeRecord.fld5 ne null }">
								<c:if test="${tradeRecord.fld5 eq 0 }">手动</c:if>
								<c:if test="${tradeRecord.fld5 eq 1 }">自动</c:if>
								<c:if test="${tradeRecord.fld5 eq 2 }">项目导入</c:if>
								</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'TB0015'|| tradeRecord.tradeCode == 'HS0029')&& tradeRecord.fld5 ne null }">
								<c:if test="${tradeRecord.fld5 eq 0 }">手工</c:if>
								<c:if test="${tradeRecord.fld5 eq 1 }">自动</c:if>
								</c:if>
								<c:if test="${tradeRecord.tradeCode !='TB0001' &&tradeRecord.tradeCode !='TB0015' && tradeRecord.tradeCode != 'HS0029'&& tradeRecord.fld5 ne null }">${tradeRecord.fld5}</c:if>														
								<c:if test="${tradeRecord.fld5 eq null }"></c:if>
								</span>
								</div>
								</td>						
								<td class="left_title_2"><div align="right">
								<c:if test="${(tradeRecord.tradeCode == 'ZF0201' ||tradeRecord.tradeCode == 'ZF0301' ||tradeRecord.tradeCode == 'ZF0401' ||tradeRecord.tradeCode == 'ZF0402' ||tradeRecord.tradeCode == 'ZF0405' || tradeRecord.tradeCode == 'CZ1101')&& tradeRecord.fld6 ne null }">B2B_FLAG：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'ZF0102' || tradeRecord.tradeCode == 'ZF0103' || tradeRecord.tradeCode == 'ZF0108' || tradeRecord.tradeCode == 'ZF0109')&& tradeRecord.fld6 ne null }">渠道业务类型：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'DK0003'||tradeRecord.tradeCode == 'DK0026')&& tradeRecord.fld6 ne null }">代扣类型：</c:if>
								<c:if test="${tradeRecord.tradeCode == 'TB0001'}">撤标状态：</c:if>
								<c:if test="${tradeRecord.tradeCode == 'TB0026' && tradeRecord.fld6 ne null }">转让债券价值：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'TB0004' || tradeRecord.tradeCode == 'TB0006')&& tradeRecord.fld6 ne null }">垫付手续费冻结资金编号：</c:if>
								<c:if test="${tradeRecord.tradeCode != 'DK0003' &&tradeRecord.tradeCode != 'DK0026'&& tradeRecord.tradeCode != 'ZF0102' && tradeRecord.tradeCode != 'ZF0103' && tradeRecord.tradeCode != 'ZF0108' && tradeRecord.tradeCode != 'ZF0109' && tradeRecord.tradeCode != 'TB0001' && tradeRecord.tradeCode!='TB0004' && tradeRecord.tradeCode!='TB0006' && tradeRecord.tradeCode!='TB0026' && tradeRecord.tradeCode != 'ZF0201' && tradeRecord.tradeCode != 'ZF0301' && tradeRecord.tradeCode != 'ZF0401' && tradeRecord.tradeCode != 'ZF0402'&& tradeRecord.tradeCode != 'ZF0405' && tradeRecord.tradeCode != 'CZ1101' && tradeRecord.fld6 ne null}">备注字段6：</c:if>
								<c:if test="${tradeRecord.fld6 eq null}">备注字段6：</c:if>
								</div></td>
								<td class="showTableTd"><div align="left">
								<span contentEditable="true">
								<c:if test="${(tradeRecord.tradeCode == 'DK0003'||tradeRecord.tradeCode == 'DK0026')&& tradeRecord.fld6 ne null }">
								<c:if test="${tradeRecord.fld6 eq 0 }">单笔</c:if>
								<c:if test="${tradeRecord.fld6 eq 1 }">批量</c:if>
								</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'ZF0102' || tradeRecord.tradeCode == 'ZF0103' || tradeRecord.tradeCode == 'ZF0108' || tradeRecord.tradeCode == 'ZF0109') && tradeRecord.fld6 ne null }">
								<c:if test="${tradeRecord.fld6 eq 0 }">快捷</c:if>
								<c:if test="${tradeRecord.fld6 eq 1 }">代扣</c:if>
								</c:if>
								<c:if test="${tradeRecord.tradeCode == 'TB0001'}">
								<c:if test="${tradeRecord.fld6 eq -1 }">未撤标</c:if>
								<c:if test="${tradeRecord.fld6 eq 0 }">部分撤标</c:if>
								<c:if test="${tradeRecord.fld6 eq 1 }">全部撤标</c:if>
								</c:if>
								<c:if test="${tradeRecord.tradeCode == 'TB0001'&& tradeRecord.fld6 eq null }">
									<c:out value="未撤标"/>
								</c:if>
								<c:if test="${tradeRecord.tradeCode !='DK0003' &&tradeRecord.tradeCode !='DK0026'&& tradeRecord.tradeCode !='TB0001' && tradeRecord.tradeCode !='ZF0102' && tradeRecord.tradeCode !='ZF0103' && tradeRecord.tradeCode !='ZF0108' && tradeRecord.tradeCode !='ZF0109' && tradeRecord.fld6 ne null}">${tradeRecord.fld6}</c:if>
								<c:if test="${ tradeRecord.fld6 eq null}"></c:if>
								</span>
								</div>
								</td>
								<td class="left_title_2"><div align="right">
								<c:if test="${(tradeRecord.tradeCode == 'CZ0101' ||tradeRecord.tradeCode == 'CZ0201'||tradeRecord.tradeCode == 'CZ0205'||tradeRecord.tradeCode == 'CZ0104'
								||tradeRecord.tradeCode == 'HS0002'||tradeRecord.tradeCode == 'HS0010'||tradeRecord.tradeCode == 'HS0009'||tradeRecord.tradeCode == 'HS0025'
								|| tradeRecord.tradeCode == 'JC0007'|| tradeRecord.tradeCode == 'JC0011'|| tradeRecord.tradeCode == 'JC0012') && tradeRecord.fld7 ne null }">商户资金冻结编号：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'DK0003'||tradeRecord.tradeCode == 'DK0026')&& tradeRecord.fld7 ne null }">代扣冻结解冻标识：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'ZF0102' || tradeRecord.tradeCode == 'ZF0103' || tradeRecord.tradeCode == 'ZF0108' || tradeRecord.tradeCode == 'ZF0109')&& tradeRecord.fld7 ne null }">快捷支付冻结解冻标识：</c:if>
								<c:if test="${tradeRecord.tradeCode == 'ZF0502'&&tradeRecord.tradeCode == 'ZF0503'&& tradeRecord.fld7 ne null }">是否是真正协议支付：</c:if>
								<c:if test="${tradeRecord.tradeCode == 'TB0026'&& tradeRecord.fld7 ne null }">承接系数：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'ZF0201' ||tradeRecord.tradeCode == 'ZF0301'||tradeRecord.tradeCode == 'ZF0401'||tradeRecord.tradeCode == 'ZF0402'||tradeRecord.tradeCode == 'ZF0405')&& tradeRecord.fld7 ne null }">请求借贷分离标识：</c:if>
								<c:if test="${tradeRecord.tradeCode == 'TB0001'&& tradeRecord.fld7 ne null }">撤标金额：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'TB0015'|| tradeRecord.tradeCode == 'HS0029')&& tradeRecord.fld7 ne null }">资金冻结编号：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'TB0004' || tradeRecord.tradeCode == 'TB0006')&& tradeRecord.fld7 ne null }">垫付手续费解冻资金编号：</c:if>
								<c:if test="${tradeRecord.tradeCode != 'ZF0201' && tradeRecord.tradeCode != 'ZF0301'&& tradeRecord.tradeCode != 'ZF0401'&& tradeRecord.tradeCode != 'ZF0402'&& tradeRecord.tradeCode != 'ZF0405' && tradeRecord.tradeCode != 'CZ0101'
								&& tradeRecord.tradeCode != 'CZ0201'&& tradeRecord.tradeCode != 'CZ0205'&& tradeRecord.tradeCode != 'HS0002' && tradeRecord.tradeCode != 'HS0025'&& tradeRecord.tradeCode != 'HS0029'
								&& tradeRecord.tradeCode != 'HS0009' && tradeRecord.tradeCode != 'HS0010' && tradeRecord.tradeCode != 'TB0001' && tradeRecord.tradeCode != 'CZ0104'&& tradeRecord.tradeCode !='ZF0502'&& tradeRecord.tradeCode !='ZF0503' 
								&&  tradeRecord.tradeCode != 'TB0004' && tradeRecord.tradeCode != 'TB0006'&& tradeRecord.tradeCode != 'TB0015'&& tradeRecord.tradeCode != 'TB0026' && tradeRecord.tradeCode != 'DK0003' 
								&& tradeRecord.tradeCode != 'ZF0103' && tradeRecord.tradeCode != 'ZF0102' && tradeRecord.tradeCode != 'ZF0108' && tradeRecord.tradeCode != 'ZF0109' && tradeRecord.tradeCode != 'DK0026' 
								&& tradeRecord.tradeCode != 'JC0007' && tradeRecord.tradeCode != 'JC0011' && tradeRecord.tradeCode != 'JC0012'&& tradeRecord.fld7 ne null}">备注字段7：</c:if>
								<c:if test="${tradeRecord.fld7 eq null }">备注字段7：</c:if>
								</div></td>
								<td class="showTableTd"><div align="left">							
								<c:if test="${(tradeRecord.tradeCode == 'ZF0102' ||  tradeRecord.tradeCode == 'ZF0103'|| tradeRecord.tradeCode == 'ZF0108' || tradeRecord.tradeCode == 'ZF0109' || tradeRecord.tradeCode == 'DK0003' || tradeRecord.tradeCode == 'DK0026')&& tradeRecord.fld7 ne null }">
									<c:if test="${tradeRecord.fld7 eq 0 }">已冻结</c:if>
									<c:if test="${tradeRecord.fld7 eq 1 }">已解冻</c:if>
								</c:if>	
								<c:if test="${(tradeRecord.tradeCode == 'ZF0502'||tradeRecord.tradeCode == 'ZF0503')&& tradeRecord.fld7 ne null }">
									<c:if test="${tradeRecord.fld7 eq 0 }">否</c:if>
									<c:if test="${tradeRecord.fld7 eq 1 }">是</c:if>
								</c:if>	
								<c:if test="${(tradeRecord.tradeCode == 'ZF0201' ||tradeRecord.tradeCode == 'ZF0301'||tradeRecord.tradeCode == 'ZF0401'||tradeRecord.tradeCode == 'ZF0402'||tradeRecord.tradeCode == 'ZF0405') && tradeRecord.fld7 ne null }">
									<c:if test="${tradeRecord.fld7 eq 0 }">借贷混合</c:if>
									<c:if test="${tradeRecord.fld7 eq 1 }">仅借记卡</c:if>
								</c:if>							
								<c:if test="${tradeRecord.tradeCode != 'DK0003' && tradeRecord.tradeCode != 'ZF0201' && tradeRecord.tradeCode != 'ZF0401' && tradeRecord.tradeCode != 'ZF0402'&& tradeRecord.tradeCode != 'ZF0405' && tradeRecord.tradeCode != 'ZF0301' && tradeRecord.tradeCode != 'ZF0502' && tradeRecord.tradeCode != 'ZF0503' && tradeRecord.tradeCode != 'ZF0102'&& tradeRecord.tradeCode != 'ZF0103' && tradeRecord.tradeCode != 'ZF0108' && tradeRecord.tradeCode != 'ZF0109' && tradeRecord.fld7 ne null}">${tradeRecord.fld7}</c:if>
								<c:if test="${ tradeRecord.fld7 eq null}"></c:if>
									</div>
								</td>																
							</tr>	
								<tr>
								<td class="left_title_2"><div align="right">
								<c:if test="${(tradeRecord.tradeCode == 'HS0002' ||tradeRecord.tradeCode == 'HS0009' || tradeRecord.tradeCode == 'HS0010' 
								|| tradeRecord.tradeCode == 'HS0025' || tradeRecord.tradeCode == 'CZ0101' || tradeRecord.tradeCode == 'CZ0201'
								|| tradeRecord.tradeCode == 'CZ0205' || tradeRecord.tradeCode == 'CZ0104'|| tradeRecord.tradeCode == 'JC0007'
								|| tradeRecord.tradeCode == 'JC0011'|| tradeRecord.tradeCode == 'JC0012')&& tradeRecord.fld8 ne null }">商户资金解冻编号：</c:if>
								<c:if test="${tradeRecord.tradeCode == 'ZZ0001'&& tradeRecord.fld8 ne null }">入账户类型：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'TB0015'|| tradeRecord.tradeCode == 'HS0029')&& tradeRecord.fld8 ne null }">垫付手续费资金解冻编号：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'ZF0102' || tradeRecord.tradeCode == 'ZF0103' || tradeRecord.tradeCode == 'ZF0108' || tradeRecord.tradeCode == 'ZF0109' || tradeRecord.tradeCode == 'ZF0201' || tradeRecord.tradeCode == 'ZF0301'|| tradeRecord.tradeCode == 'ZF0401'|| tradeRecord.tradeCode == 'ZF0402'|| tradeRecord.tradeCode == 'ZF0405' ||tradeRecord.tradeCode == 'ZF0502'||tradeRecord.tradeCode == 'ZF0503')&& tradeRecord.fld8 ne null }">客户端IP：</c:if>
								<c:if test="${tradeRecord.tradeCode != 'HS0002' &&tradeRecord.tradeCode != 'HS0009' &&tradeRecord.tradeCode != 'HS0010'&&tradeRecord.tradeCode != 'HS0025' 
								&&tradeRecord.tradeCode != 'CZ0101'&&tradeRecord.tradeCode != 'CZ0201'&&tradeRecord.tradeCode != 'CZ0205' &&tradeRecord.tradeCode != 'CZ0104' 
								&& tradeRecord.tradeCode != 'ZZ0001' && tradeRecord.tradeCode != 'ZF0102'&& tradeRecord.tradeCode != 'ZF0103' && tradeRecord.tradeCode != 'ZF0108' 
								&& tradeRecord.tradeCode != 'ZF0109' &&tradeRecord.tradeCode != 'ZF0201'&& tradeRecord.tradeCode != 'ZF0301'&&tradeRecord.tradeCode != 'ZF0401'
								&&tradeRecord.tradeCode != 'ZF0402'&&tradeRecord.tradeCode != 'ZF0405'&& tradeRecord.tradeCode != 'JC0007' && tradeRecord.tradeCode != 'JC0011' 
								&& tradeRecord.tradeCode != 'JC0012'&& tradeRecord.tradeCode != 'ZF0502'&& tradeRecord.tradeCode != 'ZF0503' && tradeRecord.tradeCode != 'TB0015'&& tradeRecord.tradeCode != 'HS0029'&& tradeRecord.fld8 ne null}">备注字段8：</c:if>	
								 <c:if test="${tradeRecord.fld8 eq null }">备注字段8：</c:if>						
								</div></td>
								<td class="showTableTd"><div align="left">
								<c:if test="${tradeRecord.tradeCode == 'ZZ0001' && tradeRecord.fld8 ne null}">
								<c:if test="${tradeRecord.fld8 eq 0}">可用账户</c:if>
								<c:if test="${tradeRecord.fld8 eq 1}">风险准备金账户</c:if>
								<c:if test="${tradeRecord.fld8 eq 2}">项目还款资金归集账户</c:if>
								<c:if test="${tradeRecord.fld8 eq 3}">预付手续费账户</c:if>
								</c:if>
								<c:if test="${tradeRecord.tradeCode != 'ZZ0001'}">${tradeRecord.fld8}</c:if></div>
								</td>							
								<td class="left_title_2"><div align="right">
								<c:if test="${tradeRecord.tradeCode == 'ZZ0001'&& tradeRecord.fld9 ne null }">出账户类型：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'CZ0101' ||tradeRecord.tradeCode == 'CZ0201'||tradeRecord.tradeCode == 'CZ0205'||tradeRecord.tradeCode == 'CZ0104'
								||tradeRecord.tradeCode == 'HS0002'||tradeRecord.tradeCode == 'HS0009'||tradeRecord.tradeCode == 'HS0010'||tradeRecord.tradeCode == 'HS0025'|| tradeRecord.tradeCode == 'JC0007'
								|| tradeRecord.tradeCode == 'JC0011'|| tradeRecord.tradeCode == 'JC0012') && tradeRecord.fld9 ne null }">结算周期：</c:if>
								<c:if test="${(tradeRecord.tradeCode == 'ZF0102' || tradeRecord.tradeCode == 'ZF0103' || tradeRecord.tradeCode == 'ZF0108' || tradeRecord.tradeCode == 'ZF0109' || tradeRecord.tradeCode == 'ZF0201'|| tradeRecord.tradeCode == 'ZF0301'|| tradeRecord.tradeCode == 'ZF0401'|| tradeRecord.tradeCode == 'ZF0402'|| tradeRecord.tradeCode == 'ZF0405')&& tradeRecord.fld9 ne null }">已退款金额：</c:if>
								<c:if test="${tradeRecord.tradeCode != 'ZF0102' && tradeRecord.tradeCode != 'ZF0103' && tradeRecord.tradeCode != 'ZF0108' && tradeRecord.tradeCode != 'ZF0109' && tradeRecord.tradeCode != 'ZF0201' && tradeRecord.tradeCode != 'ZF0301'&& tradeRecord.tradeCode != 'ZF0401'&& tradeRecord.tradeCode != 'ZF0402'&& tradeRecord.tradeCode != 'ZF0405' && tradeRecord.tradeCode != 'ZZ0001' && tradeRecord.tradeCode!='CZ0101' && tradeRecord.tradeCode!='CZ0201'&& tradeRecord.tradeCode!='CZ0205'&& tradeRecord.tradeCode!='CZ0104' 
								&& tradeRecord.tradeCode!='HS0002'&& tradeRecord.tradeCode!='HS0009'&& tradeRecord.tradeCode!='HS0010'&& tradeRecord.tradeCode!='HS0025'&& tradeRecord.tradeCode != 'JC0007' && tradeRecord.tradeCode != 'JC0011' && tradeRecord.tradeCode != 'JC0012'&& tradeRecord.fld9 ne null}">备注字段9：</c:if>
								<c:if test="${tradeRecord.fld9 eq null }">备注字段9：</c:if>
							</div></td>
								<td class="showTableTd"><div align="left">
								<span contentEditable="true">
								<c:if test="${tradeRecord.tradeCode == 'ZZ0001'&& tradeRecord.fld9 ne null }">
								<c:if test="${tradeRecord.fld9 eq 0}">可用账户</c:if>
								<c:if test="${tradeRecord.fld9 eq 1}">风险准备金账户</c:if>
								<c:if test="${tradeRecord.fld9 eq 2}">项目还款资金归集账户</c:if>
								<c:if test="${tradeRecord.fld9 eq 3}">预付手续费账户</c:if>
								</c:if>
							<c:if test="${tradeRecord.tradeCode !='ZZ0001'}">${tradeRecord.fld9}</c:if>
							</span>
								</div>
								</td>
								<td class="left_title_2">
								<div align="right">
									<c:if test="${tradeRecord.tradeCode == 'TB0001' || tradeRecord.tradeCode == 'TB0005' || tradeRecord.tradeCode == 'TB0015'|| tradeRecord.tradeCode == 'HS0029'|| tradeRecord.tradeCode == 'TB0034'}">红包金额：</c:if>
									<c:if test="${tradeRecord.tradeCode != 'TB0001' && tradeRecord.tradeCode != 'TB0005' && tradeRecord.tradeCode != 'TB0015'&& tradeRecord.tradeCode != 'HS0029'&& tradeRecord.tradeCode != 'TB0034'}">备注字段10：</c:if>
								</div></td>
								<td class="showTableTd">
									<div align="left">
										${tradeRecord.fld10}
									</div>
								</td>															
							</tr>
							<tr>
								<td class="left_title_2"><div align="right">请求渠道类型：</div></td>
								<td class="showTableTd">
									<div align="left">
								    <c:if test="${tradeRecord.requestChannelType eq 0 }">默认</c:if>
									<c:if test="${tradeRecord.requestChannelType eq 1 }">移动端</c:if>
									<c:if test="${tradeRecord.requestChannelType eq 2 }">PC端</c:if>
									<c:if test="${tradeRecord.requestChannelType eq 3 }">电视端</c:if>
									</div>
								</td>
								<td class="left_title_2"><div align="right">实用渠道类型：</div></td>
								<td class="showTableTd">
									<div align="left">
								    <c:if test="${tradeRecord.feeChannelType eq 0 }">默认</c:if>
									<c:if test="${tradeRecord.feeChannelType eq 1 }">移动端</c:if>
									<c:if test="${tradeRecord.feeChannelType eq 2 }">PC端</c:if>
									<c:if test="${tradeRecord.feeChannelType eq 3 }">电视端</c:if>
									</div>
								</td>
								<td class="left_title_2"><div align="right">银行渠道：</div></td>
								<td class="showTableTd">
									<div align="left">
										<c:out value="${tradeRecord.bankCode}"></c:out>
									</div>
								</td> 
							</tr>
							<tr>				    		
					    	<td class="left_title_2"><div align="right">渠道流水号：</div></td>
					    	<td class="showTableTd" colspan="5"><div align="left" >
					    	<span contentEditable="true">				    
					    	<c:out value="${tradeRecord.channelRequestId}"/>	
					    	</span>					    				    	
					    	</div></td>				    	
					    	</tr>
					    	<tr>				    		
					    	<td class="left_title_2"><div align="right">网联交易批次号：</div></td>
					    	<td class="showTableTd" colspan="5"><div align="left" >
					    	<span contentEditable="true">				    
					    	<c:out value="${tradeRecord.fld14}"/>	
					    	</span>					    				    	
					    	</div></td>				    	
					    	</tr>														
							<tr>				    		
					    	<td class="left_title_2"><div align="right">所购产品名称：</div></td>
					    	<td class="showTableTd" colspan="5"><div align="left" >				    
					    	<c:out value="${productNames}"/>				    	
					    	</div></td>				    	
					    	</tr>			    					    	
							<tr>
								<td class="left_title_2"><div align="right">交易描述信息：</div></td>
								<td class="showTableTd" colspan="5"><div align="left">
									<c:out value="${tradeRecord.tradeDesc}"/>
									</div>
								</td>							
							</tr>						
							<tr>
								<td class="left_title_2"><div align="right">对外显示失败原因：</div></td>
								<td class="showTableTd" colspan="5"><div align="left">
									${tradeRecord.failureInfo}
									</div>
								</td>															
							</tr>
							<tr>														
								<td class="left_title_2"><div align="right">内部失败原因：</div></td>
								<td class="showTableTd" colspan="5"><div align="left">
									${tradeRecord.exceptionRec}									
								</div></td> 
							</tr>
							<tr>
							<td class="left_title_2">
									<c:if test="${tradeRecord.tradeCode == 'DK0004'}">
										<div align="right">冻结原因：</div>
									</c:if>
									<c:if test="${tradeRecord.tradeCode == 'DK0005'}">
										<div align="right">解冻原因：</div>
									</c:if>
									<c:if test="${tradeRecord.tradeCode != 'DK0004' && tradeRecord.tradeCode != 'DK0005'}">
									<div align="right">备注：</div>
									</c:if>
								</td>
								<td class="showTableTd" colspan="5"><div align="left">
								  <span contentEditable="true">
									<c:out value="${tradeRecord.remark}"/>
								  </span>
									</div>
								</td>
							</tr>
						<!-- 	<c:if test="${tradeRecord.tradeCode == 'DK0004' || tradeRecord.tradeCode == 'DK0005'}">
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
							</c:if>		 -->	
							<c:if test="${tradeRecord.tradeCode!='DK0004' && tradeRecord.tradeCode!='DK0005'}">
							<tr>
								<td class="left_title_2"><div align="right">透传字段：</div></td>
								<td class="showTableTd" colspan="5"><div align="left">
								  <span contentEditable="true">
									<c:out value="${tradeRecord.merInfo}"/>
								  </span>
									</div>
								</td>										
							</tr>
							</c:if>	
								<c:if test="${tradeRecord.tradeCode=='DK0004' || tradeRecord.tradeCode=='DK0005'}">
							<tr>
								<td class="left_title_2"><div align="right">透传字段：</div></td>
								<td class="showTableTd" colspan="5"><div align="left">
								  <span contentEditable="true">
									<c:out value="${tradeRecord.passThrough}"/>
								  </span>
									</div>
								</td>										
							</tr>
							</c:if>	
						</table>
						</div>
					</td>
				</tr>		
				<c:if test="${tradeRecord.fld4 ne null && riskFlag ==1}">
				<tr><td align="left">风控交易补充信息：</td>
				</tr>
				<tr>
				<td>
				<table width="98%" cellspacing="1" cellpadding="3" class="showTable">
				<tr>
							<td width="13%" class="left_title_2"><div align="right">订单金额：</div></td>
								<td width="23%" class="showTableTd"><div align="left">
								
								<c:if test="${null eq tradeRecord.tradeSum}"> </c:if>								 
								<c:if test="${null ne tradeRecord.tradeSum}"><fmt:formatNumber value="${tradeRecord.tradeSum}" type="currency" pattern="#0.00"/></c:if>
								</div>
								</td>
							<td width="13%" class="left_title_2"><div align="right">实际支付金额：</div></td>
								<td width="23%" class="showTableTd"><div align="left">
								<c:if test="${null eq tradeRecord.accountPay}"> </c:if>								
									<c:if test="${null ne tradeRecord.accountPay}"><fmt:formatNumber value="${tradeRecord.accountPay}" type="currency" pattern="#0.00"/></c:if>
								</div></td>
								<td width="13%" class="left_title_2"><div align="right">付款卡类型：</div></td>
							<td width="20%" class="showTableTd">
								<div align="left">
								<c:if test="${0 eq kaType}">储蓄卡</c:if>
								<c:if test="${1 eq kaType}">信用卡</c:if>								
								</div>
							</td>
							</tr>
							<tr>						
							  <td width="13%" class="left_title_2"><div align="right">支付订单ip：</div></td>
								 <td width="20%" class="showTableTd"><div align="left">${ZFip}</div></td>
							  <td width="13%" class="left_title_2"><div align="right">创建订单ip：</div></td>
								<td width="20%" class="showTableTd"><div align="left">${DDid}</div></td>
								
									<td width="13%" class="left_title_2"><div align="right">鉴权手机：</div></td>
								<td  class="showTableTd"><div align="left">${mobile1}</div></td>		
							</tr>
				<tr>
							<td width="13%" class="left_title_2"><div align="right">商户会员号：</div></td>								
								<td width="20%" class="showTableTd"><div align="left">${memNum}</div></td>
							<td width="13%" class="left_title_2"><div align="right">姓名：</div></td>
								<td  class="showTableTd"><div align="left">${Name}</div></td>
							<td width="13%" class="left_title_2"><div align="right">身份证号：</div></td>
								<td  class="showTableTd" ><div align="left">${idenNum}</div></td>
							</tr>
							</table>
							</td>
							</tr>
				</c:if>
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
												<td width="8%" class="left_title_2">角色类型</td>
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
													<td width="8%" align="center">
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
							
							<c:if test="${fn:length(aSAccountList) > 0}">
				    		<tr><td align="left">分账列表信息：</td>
								</tr>
								<tr>
										<td align="left">
										<table width="98%" cellspacing="1" cellpadding="3" class="showTable">
											<tr>
												<td width="4%" class="left_title_2">序号</td>
												<td width="6%" class="left_title_2">借方/贷方</td>
												<td width="8%" class="left_title_2">角色类型</td>
												<td width="10%" class="left_title_2">角色编码</td>
												<td width="10%" class="left_title_2">账户类型</td>
												<td width="10%" class="left_title_2">账户ID</td>	
												<td width="8%" class="left_title_2">分账金额</td>									
												<td width="8%" class="left_title_2">请求分账方向</td>
												<td width="8%" class="left_title_2">请求分账金额</td>
												<td width="6%" class="left_title_2">主账户标识</td>
												<td width="10%" class="left_title_2">创建时间</td>
												<td width="8%" class="left_title_2">业务类型</td>
											</tr>
										
											<c:forEach items="${aSAccountList}" var="item" step="1" varStatus="var">
												<tr style="background-color:#FFFFFF">
													<td align="center"  rowspan="2">
														<c:out value="${var.index + 1 + curRow}"/>
													</td>
													<td  align="center">
														借方
													</td>
																									
													<td  align="center">
														<c:if test="${item.debitedRoleType eq 0 }">P2P存管用户</c:if>
														<c:if test="${item.debitedRoleType eq 1 }">商户</c:if>
														<c:if test="${item.debitedRoleType eq 2 }">丰付</c:if>		
														<c:if test="${item.debitedRoleType eq 3 }">企业用户</c:if>		
														<c:if test="${item.debitedRoleType eq 4 }">银行</c:if>	
														<c:if test="${item.debitedRoleType eq 5 }">项目</c:if>
														<c:if test="${item.debitedRoleType eq 6 }">存管银行</c:if>
														<c:if test="${item.debitedRoleType eq 7 }">账户托管用户</c:if>	
													</td>
													
													
													<td align="center" class="clip" >
														<span contentEditable="true">
															${item.debitedRoleCode}
														</span>
													</td>
													
													<td align="center">
														<c:if test="${item.debitedRoleType eq 5 }">
															<c:if test="${item.debitedRoleAccountType eq 0 }">放款账户</c:if>
															<c:if test="${item.debitedRoleAccountType eq 1 }">还款账户</c:if>
														</c:if>
														<c:if test="${item.debitedRoleType ne 5 }">
															<c:if test="${item.debitedRoleAccountType eq 0 }">中间账户</c:if>
															<c:if test="${item.debitedRoleAccountType eq 1 }">可用账户</c:if>
															<c:if test="${item.debitedRoleAccountType eq 2 }">风险准备金账户</c:if>		
															<c:if test="${item.debitedRoleAccountType eq 3 }">预付手续费账户</c:if>		
															<c:if test="${item.debitedRoleAccountType eq 4 }">后付手续费账户</c:if>
															<c:if test="${item.debitedRoleAccountType eq 5 }">垫资账户</c:if>	
														</c:if>
													</td>
													
													<td align="center" class="clip" >
														<span contentEditable="true">
															${item.debitedRoleAccountId}
														</span>
													</td>
													<td align="center"  rowspan="2">
														<fmt:formatNumber value="${item.fund}" type="currency" pattern="#0.00"/>
													</td>
													<td align="center"  rowspan="2">
														<c:if test="${item.requestDirection eq 0 }">进</c:if>
														<c:if test="${item.requestDirection eq 1 }">出</c:if>						
													</td>
													<td class="clip" align="center"  rowspan="2">
														<fmt:formatNumber value="${item.requestFund}" type="currency" pattern="#0.00"/>
													</td>
													<td class="clip" align="center"  rowspan="2">
														<c:if test="${item.mainAccountFlag eq 1 }">是</c:if>
													</td>
													<td align="center" rowspan="2">												
														<fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />					
													</td>
													<td align="center"  rowspan="2">
														<c:if test="${item.bizFlag eq 0 }">正常业务</c:if>
														<c:if test="${item.bizFlag eq 1 }">商户手续费</c:if>	
														<c:if test="${item.bizFlag eq 2 }">红包</c:if>		
														<c:if test="${item.bizFlag eq 3 }">丰付手续费</c:if>						
													</td>
													
												</tr>
												
												<tr style="background-color:#FFFFFF">
													
													<td  align="center">
														贷方
													</td>
																									
													<td  align="center">
														<c:if test="${item.creditedRoleType eq 0 }">P2P存管用户</c:if>
														<c:if test="${item.creditedRoleType eq 1 }">商户</c:if>
														<c:if test="${item.creditedRoleType eq 2 }">丰付</c:if>		
														<c:if test="${item.creditedRoleType eq 3 }">企业用户</c:if>		
														<c:if test="${item.creditedRoleType eq 4 }">银行</c:if>	
														<c:if test="${item.creditedRoleType eq 5 }">项目</c:if>	
														<c:if test="${item.creditedRoleType eq 6 }">存管银行</c:if>
														<c:if test="${item.creditedRoleType eq 7 }">账户托管用户</c:if>
													</td>
													
													
													<td align="center" class="clip" >
														<span contentEditable="true">
															${item.creditedRoleCode}
														</span>
													</td>
													
													<td  align="center">
														<c:if test="${item.creditedRoleType eq 5 }">
															<c:if test="${item.creditedRoleAccountType eq 0 }">放款账户</c:if>
															<c:if test="${item.creditedRoleAccountType eq 1 }">还款账户</c:if>
														</c:if>
														<c:if test="${item.creditedRoleType ne 5 }">
															<c:if test="${item.creditedRoleAccountType eq 0 }">中间账户</c:if>
															<c:if test="${item.creditedRoleAccountType eq 1 }">可用账户</c:if>
															<c:if test="${item.creditedRoleAccountType eq 2 }">风险准备金账户</c:if>		
															<c:if test="${item.creditedRoleAccountType eq 3 }">预付手续费账户</c:if>		
															<c:if test="${item.creditedRoleAccountType eq 4 }">后付手续费账户</c:if>	
															<c:if test="${item.creditedRoleAccountType eq 5 }">垫资账户</c:if>	
														</c:if>
													</td>
													
													<td align="center" class="clip" >
														<span contentEditable="true">
															${item.creditedRoleAccountId}
														</span>
													</td>
													
												</tr>
											</c:forEach>
									</table>
										
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
