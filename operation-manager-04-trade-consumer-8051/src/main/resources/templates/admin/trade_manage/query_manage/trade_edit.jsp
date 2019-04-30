<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" pageEncoding="utf-8"%>
<%@ page import="com.sumavision.tvpay.domain.entity.TradeProductInfo" %>



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
		<base target="_self">
  	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  	<link rel="stylesheet" href="${request_path}/css/common.css" type="text/css" />
  	<link rel="stylesheet" href="${request_path}/css/calendar-style.css" type="text/css" />
  	<title>修改交易</title>
  	<style type="text/css">
			.clip{line-height:20px; text-overflow:ellipsis; white-space:nowrap; overflow:hidden;background-color:#FFFFFF;}
		</style>
  	<script type="text/javascript" src="${request_path}/js/common.js"></script>
  	<script type="text/javascript" src="${request_path}/js/jquery.js"></script>
  	<script type="text/javascript" src="${request_path}/js/global.js"></script>
  	<script type="text/javascript" src="${request_path}/js/select.js"></script>
  	<script type="text/javascript" language="JavaScript" src="${request_path}/js/calendar.js"></script>
	<script type="text/javascript" language="JavaScript" src="${request_path}/js/calendar-cn.js"></script>
	<script type="text/javascript" language="JavaScript" src="${request_path}/js/calendar-setup.js"></script>
  	<script language="javascript">
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
		}
  		function editTrade(){
  			if(100 < document.forms[0].reason.value.length) {
  				alert('修改原因超过100字符限制');
  				return ;
  			}
  			if(isEmpty(document.forms[0].reason.value)) {
  				alert('修改原因不能为空');
  				return ;
  			}
  			if(isEmpty(document.forms[0].fund.value)) {
  				alert('交易金额不能为空');
  				return ;
  			}
  			if(isFloat(document.forms[0].fund.value)==false) {
  				alert('交易金额应为数值如10.00或10');
  				return ;
  			}
  			var s = "确定修改交易？";
  			if (!window.confirm(s)){
  				return;
			}
  			
			document.forms[0].submit();
  		}
  	</script>
	</head>
	<body>
		<form name="PageForm" action="manualAdjustTradeAction.do?method=edit" method="post">
			<input type="hidden" name="tradeId" id="tradeId" value="${tradeRecord.id}"></input>			
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
								<td width="12%" class="left_title_2"><div align="right">交易编号：</div></td>
								<td width="21%" class="showTableTd"><div align="left">
									<fmt:formatNumber value="${tradeRecord.id}" type="currency" pattern="0000000000"/>
								</div></td>
								<td width="14%" class="left_title_2"><div align="right">交易类型：</div></td>
								<td width="21%" class="showTableTd"><div align="left">
									<c:forEach items="${listTradeType}" var="trade" step="1" varStatus="var">
								  	  <c:if test="${trade.code eq tradeRecord.tradeCode}">
									  	  <c:out value="${trade.name}"></c:out>
								  	  </c:if>
					            	</c:forEach>
								</div></td>
								<td width="12%" class="left_title_2"><div align="right">行业：</div></td>
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
								<td class="showTableTd"><div align="left">￥<input type="text" name="fund" class="text_contant" value="<fmt:formatNumber value="${tradeRecord.tradeSum}" type="currency" pattern="#0.00"/>" onblur="cm(this)"/></div></td>
								<td class="left_title_2"><div align="right">会计日期：</div></td>
								<td class="showTableTd"><div align="left">
									<fmt:formatDate value="${tradeRecord.fiscalDate}" pattern="yyyy-MM-dd" />
									</div>
								</td>
							</tr>
							<tr>
								<td class="left_title_2"><div align="right">发起用户：</div></td>
								<td class="showTableTd"><div align="left">
									<c:out value="${tradeRecord.userId}"/></div>
								</td>
								<td class="left_title_2"><div align="right">请求系统：</div></td>
								<td class="showTableTd"><div align="left">
									<c:out value="${tradeRecord.tradeProcess}"/>
									</div>
								</td>
								<td class="left_title_2"><div align="right">处理状态：</div></td>
								<td class="showTableTd" ><div align="left">
								<select name="status" property="status" style="width: 100px">
									<option <c:if test="${0 eq tradeRecord.status}">selected</c:if> value="0">待处理</option>
								 	<option <c:if test="${1 eq tradeRecord.status}">selected</c:if> value="1">处理中</option>
								 	<option <c:if test="${2 eq tradeRecord.status}">selected</c:if> value="2">成功</option>
								 	<option <c:if test="${3 eq tradeRecord.status}">selected</c:if> value="3">失败</option>
								 	<option <c:if test="${4 eq tradeRecord.status}">selected</c:if> value="4">待确认</option>
					 		  	</select>
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
										<c:out value="${tradeRecord.userId}"/>
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
									<c:out value="${tradeRecord.bankSn}"/>
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
								<td class="left_title_2"><div align="right">会计状态：</div></td>
								<td class="showTableTd"><div align="left">
									<input type="text" name="fiscalStatus" class="text_contant" value="${tradeRecord.fiscalStatus}" onblur="cm(this)"/>
									</div>
								</td>
								<td width="18%" class="left_title_2"><div align="right">对账状态：</div></td>
								<td width="*" class="showTableTd" >
									<div align="left">
										<input type="text" name="checkStatus" class="text_contant" value="${tradeRecord.checkStatus}" onblur="cm(this)"/>
									</div>
								</td>
								<td class="left_title_2"><div align="right">是否为重新支付：</div></td>
								<td class="showTableTd"><div align="left">
									  <c:if test="${tradeRecord.isRepayFlg ne 1}">
								  	  	<c:out value="不是"></c:out>
								  	  </c:if>
								  	  <c:if test="${tradeRecord.isRepayFlg eq 1}">
								  	  	<c:out value="是"></c:out>
								  	  </c:if>
								</div></td> 
							</tr>
							<tr>
								<td class="left_title_2"><div align="right">手工调整状态：</div></td>
								<td class="showTableTd"><div align="left">
									<c:out value="${tradeRecord.manualAdjustStatus}"/>
									</div>
								</td>
								<td width="18%" class="left_title_2"><div align="right">手工调整时间：</div></td>
								<td width="*" class="showTableTd" >
									<div align="left">
										<fmt:formatDate value="${tradeRecord.manualAdjustTime}" pattern="yyyy/MM/dd" />
									</div>
								</td>
								<td class="left_title_2"><div align="right">手工调整会计日期：</div></td>
								<td class="showTableTd"><div align="left">
										<fmt:formatDate value="${tradeRecord.manualAdjustFiscalDate}" pattern="yyyy/MM/dd" />
								</div></td> 
							</tr>
							<tr>
								<td class="left_title_2"><div align="right">请求编号：</div></td>
								<td class="showTableTd" colspan="3"><div align="left">
									<c:out value="${tradeRecord.orderId}"/>
									</div>
								</td>
								<td class="left_title_2"><div align="right">交易描述信息：</div></td>
								<td class="showTableTd"><div align="left">
									<c:out value="${tradeRecord.tradeDesc}"/>
									</div>
								</td>
							</tr>
						</table>
						</div>
					</td>
				</tr>
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
												<td width="10%" class="left_title_2">产品名称</td>
												<td width="6%" class="left_title_2">产品单价(￥)</td>
												<td width="6%" class="left_title_2">支付金额(￥)</td>
												<td width="8%" class="left_title_2">产品提供商</td>
												<td width="20%" class="left_title_2">行业</td>
											</tr>
											</table>
											<div style="display:block;overflow:auto;height:141px;position:relative;">
											<table width="98%" cellspacing="1" cellpadding="3" class="showTable" id="couponAccMangerTb" style="table-layout: fixed;">
											<c:forEach items="${paymentList}" var="item" step="1" varStatus="var">
												<tr style="background-color:#FFFFFF">
													<td width="6%" align="center"><c:out value="${item.productId}"/></td>
													<td width="10%" title="${item.productInfo}" align="center" class="clip"><NOBR><c:out value="${item.productInfo}"/></NOBR></td>
													<td width="6%" align="right">
														<fmt:formatNumber value="${item.price}" type="currency" pattern="#0.00"/>
													</td>
													<td width="6%" align="right">
														<fmt:formatNumber value="${item.userPay}" type="currency" pattern="#0.00"/>
													</td>
													<td class="clip" width="8%" align="left" title="${item.providerId}"><c:out value="${item.providerId}"/></td>
													<td width="20%" align="center">
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
				
				<tr>
					<td align='left'>操作信息：</td>
				</tr>
				<tr>
					<td align="center">
						<div id="basInfo" style="display:block">
						<table width="98%" cellspacing="1" cellpadding="3" class="showTable" style="table-layout: fixed;">							
							<tr>
								<td width="12%" class="left_title_3"><div align="right">修改原因：</div></td>
								<td class="showTableTd" >
									<div align="left">
        			    				<textarea id="reason" name="reason" class="remarkarea" rows="3"  >${tradeRecord.remark}</textarea>
        			    				<span class="sp">*</span>
        			    				<span class="graySign">（限制100字符）</span>
        			    			</div>
								</td>
							</tr>							
						</table>
						</div>
					</td>
				</tr>						
				<tr>
					<td align="center">
	            		<input name="button" type="button" class="button2" value="修改" onclick="editTrade();"/>&nbsp;&nbsp;&nbsp;
	            		<input name="button" type="button" class="button2" value="返回" onclick="$('backHidden').click()" />
						<a id="backHidden" style="display:none" href="tradeQueryAction.do?method=list">back</a>
            		</td>
				</tr>
	  	</table>
			</div>
	  </form>
 	</body>
</html>

