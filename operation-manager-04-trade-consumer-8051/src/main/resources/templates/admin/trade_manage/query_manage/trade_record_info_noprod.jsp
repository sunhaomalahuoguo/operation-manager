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
						<table width="98%" cellspacing="1" cellpadding="3" class="showTable" style="table-layout: fixed;">
							<tr>
								<td width="10%" class="left_title_2"><div align="right">交易编号：</div></td>
								<td width="22%" class="showTableTd"><div align="left">
								  <span contentEditable="true">
									<fmt:formatNumber value="${tradeRecord.id}" type="currency" pattern="0000000000"/>
								  </span>
								</div></td>
								<td width="15%" class="left_title_2"><div align="right">交易类型：</div></td>
								<td width="15%" class="showTableTd"><div align="left">
									<c:forEach items="${listTradeType}" var="trade" step="1" varStatus="var">
								  	  <c:if test="${trade.code eq tradeRecord.tradeCode}">
								  	  <c:out value="${trade.name}"></c:out>
								  	  </c:if>
				            	</c:forEach>
								</div></td>
								<td width="15%" class="left_title_2"><div align="right">行业：</div></td>
								<td class="showTableTd"><div align="left">
									<c:forEach items="${listBizType}" var="item" step="1" varStatus="var">
								  	  <c:if test="${item.id eq tradeRecord.bizType}">
								  	  <c:out value="${item.name}"></c:out>
								  	  </c:if>
				            	</c:forEach>
								</div></td>
							</tr>
							<tr>
								<td class="left_title_2"><div align="right">交易时间：</div></td>
								<td class="showTableTd"><div align="left">
									<fmt:formatDate value="${tradeRecord.tradeStartTime}" pattern="yyyy-MM-dd HH:mm:ss" />
									</div>
								</td>
								<td class="left_title_2"><div align="right">交易金额：</div></td>
								<td class="showTableTd"><div align="left">￥<fmt:formatNumber value="${tradeRecord.tradeSum}" type="currency" pattern="#0.00"/>
								</div></td>
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
								<td class="left_title_2"><div align="right">银行代码：</div></td>
								<td class="showTableTd"><div align="left">
									<c:out value="${tradeRecord.bankCode}"/>
									</div>
								</td>
								<td width="18%" class="left_title_2"><div align="right">银行账号：</div></td>
								<td width="*" class="showTableTd" >
									<div align="left">
										<c:out value="${tradeRecord.bankAccount}"/>
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
								<td class="left_title_2"><div align="right">超时失败标识：</div></td>
								<td class="showTableTd"><div align="left">
									  <c:if test="${tradeRecord.timeoutFlg eq 0}">
								  	  	<c:out value="未超时"></c:out>
								  	  </c:if>
								  	  <c:if test="${tradeRecord.timeoutFlg eq 1}">
								  	  	<c:out value="已超时"></c:out>
								  	  </c:if>
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
							<tr>
								<td class="left_title_2"><div align="right">请求编号：</div></td>
								<td class="showTableTd" colspan="3"><div align="left">
								  <span contentEditable="true">
									<c:out value="${tradeRecord.orderId}"/>
								  </span>
									</div>
								</td>
								<td class="left_title_2"><div align="right">交易描述信息：</div></td>
								<td class="showTableTd"><div align="left">
									<c:out value="${tradeRecord.tradeDesc}"/>
									</div>
								</td>
							</tr>
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
							<c:if test="${tradeRecord.tradeCode != 'DK0004' && tradeRecord.tradeCode != 'DK0005'}">
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
						</table>
						</div>
					</td>
				</tr>
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