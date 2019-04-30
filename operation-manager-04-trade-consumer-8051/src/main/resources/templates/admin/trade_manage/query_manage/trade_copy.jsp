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
  	<title>补录交易</title>
  	<style type="text/css">
			.clip{line-height:20px; text-overflow:ellipsis; white-space:nowrap; overflow:hidden;background-color:#FFFFFF;}
		</style>
		<script type="text/javascript" language="JavaScript" src="${request_path}/js/calendar.js"></script>
	<script type="text/javascript" language="JavaScript" src="${request_path}/js/calendar-cn.js"></script>
	<script type="text/javascript" language="JavaScript" src="${request_path}/js/calendar-setup.js"></script>
  	<script type="text/javascript" src="${request_path}/js/common.js"></script>
  	<script type="text/javascript" src="${request_path}/js/jquery.js"></script>
  	<script type="text/javascript" src="${request_path}/js/global.js"></script>
  	<script type="text/javascript" src="${request_path}/js/select.js"></script>
  	<script language="javascript">
	  	window.onload = function(){
			dateLoad(['manualAdjustTime']);
			showmsg();
		};
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
  		function copyTrade(){
  			var userIdSrc = document.forms[0].userId.value;
  			
  			var fund = document.forms[0].fund.value;
  			var remark = document.forms[0].remark.value;
  			var tradeCode = document.forms[0].tradeCode.value;
  			var tradeDesc = document.forms[0].tradeDesc.value;
  			var bankCode = document.forms[0].bankCode.value;
  			///
  			var merCode = document.forms[0].merCode.value;
  			if(tradeCode.indexOf('ZF')!=-1){
  				if (isEmpty(merCode)){
  					alert("商户名称不可为空");
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
  			if(v=='ZF0103' || v=='ZF0201' || v=='ZF0301' || v=='ZF0206' ){
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
  			///
  			var s = "确定补录交易，并通知商户？";
  			var sel = "1";
  			
  			if(document.forms[0].remark.value<1){
  				alert('备注信息必输');
  				return false;
  			}
  			if(100 < document.forms[0].remark.value.length) {
  				alert('备注超过100字限制');
  				return false;
  			}
  			
  			var c=document.getElementById("empower");
  			if (!c.checked){
  				s = "确定补录交易，不通知商户？";
  				sel = "0";
  			}
  			
  			
  			if (!window.confirm(s)){
  				return;
			}			
  			//document.forms[0].action = "manualAdjustTradeAction.do?method=copyTrade&tradeId="+document.getElementById("tradeId").value
  			//		+"&bankSn="+document.getElementById("bankSn").value+"&empower="+sel+"&reason="+document.getElementById("reason").value;
			if(tradeCode.indexOf('ZF')==-1){
  			document.getElementById("srcMerRequestId").value='';
			}
  			document.forms[0].submit();
  		}
  		
  		function showmsg(){
  			if ('${msg}' != ''){
  				alert('${msg}');
  			}
  		}
  	</script>
	</head>
	<body >
		<form name="PageForm" action="manualAdjustTradeAction.do?method=copyTrade" method="post">
			<input type="hidden" name="tradeId" id="tradeId" value="${tradeRecord.id}"></input>			
			<input type="hidden" name="tradeCode" id="tradeCode" value="${tradeRecord.tradeCode}"></input>
				
			<input type="hidden" name="srcMerRequestId" id="srcMerRequestId" value="${tradeRecord.orderId}" ></input>
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
								<td width="12%" class="left_title_2"><div align="right">原交易编号：</div></td>
								<td width="21%" class="showTableTd"><div align="left">
									<fmt:formatNumber value="${tradeRecord.id}" type="currency" pattern="000000000000000000"/>
								</div></td>
								<td width="12%" class="left_title_2"><div align="right">交易类型：</div></td>
								<td width="21%" class="showTableTd"><div align="left">
									<c:forEach items="${listTradeType}" var="trade" step="1" varStatus="var">
								  	  <c:if test="${trade.code eq tradeRecord.tradeCode}">
									  	  <c:out value="${trade.name}"></c:out>
								  	  </c:if>
					            	</c:forEach>
								</div></td>
								<td width="12%" class="left_title_2"><div align="right">行业：</div></td>
								<td width="21%" class="showTableTd"><div align="left">
									<c:forEach items="${listBizType}" var="item" step="1" varStatus="var">
								  	  <c:if test="${item.id eq tradeRecord.bizType}">
								  	  <c:out value="${item.name}"></c:out>
								  	  <input type="hidden" name="bizType" id="bizType" value="${item.code}"></input>	
								  	  </c:if>
				            	</c:forEach>
								</div></td>
							</tr>
							<tr>
								<td class="left_title_2"><div align="right">原交易时间：</div></td>
								<td class="showTableTd"><div align="left">
									<fmt:formatDate value="${tradeRecord.tradeStartTime}" pattern="yyyy-MM-dd HH:mm:ss" /></div>
								</td>
								<td class="left_title_2"><div align="right">交易金额：</div></td>
								<td class="showTableTd"><div align="left">￥<input type="text" name="fund" class="text_contant" value="<fmt:formatNumber value="${tradeRecord.tradeSum}" type="currency" pattern="#0.00"/>" onblur="cm(this)"/></div></td>
								<td class="left_title_2"><div align="right">原交易状态：</div></td>
								<td class="showTableTd"><div align="left">
									<c:if test="${0 eq tradeRecord.status}">待处理</c:if>
						 		  	<c:if test="${1 eq tradeRecord.status}">处理中</c:if>
						 		  	<c:if test="${2 eq tradeRecord.status}">成功</c:if>
						 		  	<c:if test="${3 eq tradeRecord.status}">失败</c:if>
						 		  	<c:if test="${4 eq tradeRecord.status}">待确认</c:if>
								</div>
								</td>
							</tr>
							<tr>
								<td class="left_title_2"><div align="right">交易描述信息：</div></td>
								<td class="showTableTd"><div align="left">
									<input type="text" name="tradeDesc" class="text_contant" value="${tradeRecord.tradeDesc}" />
									</div>
								</td>
								<td class="left_title_2"><div align="right">请求系统：</div></td>
								<td class="showTableTd"><div align="left">
									<input type="text" name="tradeProcess" class="text_contant" value="${tradeRecord.tradeProcess}" />
									</div>
								</td>
								<td class="left_title_2"><div align="right">运营商代码：</div></td>
								<td class="showTableTd" ><div align="left">
									<select name="operatorCode" id="operatorCode" >
									<option value=""></option>
									<c:forEach items="${listOperator}" var="item" step="1" varStatus="var">
								  	  	<option <c:if test="${item.operatorCode eq tradeRecord.operatorCode}">selected</c:if> value="${item.operatorCode}" >
								  	  		<c:out value="${item.operatorName}"></c:out></option>
				            		</c:forEach>
				            		</select>
								</div></td>
							</tr>
						<tr>
								<td class="left_title_2"><div align="right">发起地点：</div></td>
								<td class="showTableTd"><div align="left">
									<c:out value="${tradeRecord.tradeLoc}"></c:out>
									</div>
								</td>
								<td class="left_title_2"><div align="right" id="oldAcc">交易用户编号：</div></td>
								<td class="showTableTd" >
									<div align="left">
										<input type="text" name="userId" class="text_contant" value="${tradeRecord.userId}" onblur="cp(this)"/>
										&nbsp;<span class="sp" id="userIdSrcSpan"></span>
									</div>
								</td>
								<td class="left_title_2"><div align="right">商户名称：</div></td>
								<td class="showTableTd"><div align="left" id="merCode_tr">
									<select name="merCode" id="merCode" >
									<option value=""></option>
									<c:forEach items="${listMerchant}" var="item" step="1" varStatus="var">
								  	  	<option <c:if test="${item.id eq tradeRecord.providerId}">selected</c:if> value="${item.merchantCode}" >
								  	  		<c:out value="${item.merchantName}"></c:out></option>
				            		</c:forEach>
				            		</select>&nbsp;<span class="sp" id="merCodeSpan"></span>
								</div></td> 
							</tr>
							<tr>
								<td class="left_title_2"><div align="right">银行名称：</div></td>
								<td class="showTableTd"><div align="left">
				            		<select name="bankCode" id="bankCode" >
								    	<option value=""></option>
								    	<c:forEach items="${listBank}" var="item" step="1" varStatus="var">
									  	  <option <c:if test="${item.bankCode eq tradeRecord.bankCode}">selected</c:if> value="${item.bankCode}"><c:out value="${item.bankName}"></c:out></option>
								      </c:forEach>
								    </select>&nbsp;<span class="sp" id="bankCodeSpan"></span>
									</div>
								</td>
								<td class="left_title_2"><div align="right">银行账号：</div></td>
								<td class="showTableTd" >
									<div align="left">
										<input type="text" name="bankAccount" class="text_contant" value="${tradeRecord.bankAccount}" onblur="cup(this)"/>
									</div>
								</td>
								<td class="left_title_2"><div align="right">银行票号：</div></td>
								<td class="showTableTd"><div align="left">
									<input type="text" name="bankSn" class="text_contant" value="${tradeRecord.bankSn}" onblur="cup(this)"/>
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
									<c:out value="${tradeRecord.manualAdjustStatus}"></c:out>
									</div>
								</td>
								<td width="18%" class="left_title_2"><div align="right">手工调整时间：</div></td>
								<td width="*" class="showTableTd" >
									<div align="left">
										<input type="text" onblur="cd(this)" class="text_date" name="manualAdjustTime" id="manualAdjustTime" property="manualAdjustTime" size="25" styleId="manualAdjustTime" value="<fmt:formatDate value="${tradeRecord.manualAdjustTime}" pattern="yyyy/MM/dd" />"/>
									</div>
								</td>
								<td class="left_title_2"><div align="right">手工调整会计日期：</div></td>
								<td class="showTableTd"><div align="left">
										<fmt:formatDate value="${tradeRecord.manualAdjustFiscalDate}" pattern="yyyy/MM/dd" />
								</div></td> 
							</tr>
							<tr>
								<td class="left_title_2"><div align="right">商户请求编号：</div></td>
								<td class="showTableTd" colspan="5"><div align="left">
									<input type="text" name="merRequestId" class="text_contant" value="${tradeRecord.orderId}" />
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
					<td align='left'>补录信息：</td>
				</tr>
				<tr>
					<td align="center">
						<div id="basInfo" style="display:block">
						<table width="98%" cellspacing="1" cellpadding="3" class="showTable" style="table-layout: fixed;">							
							<tr>
								<td width="12%" class="left_title_3"><div align="right">补录原因：</div></td>
								<td class="showTableTd" >
									<div align="left">
        			    				<textarea id="remark" name="remark" class="remarkarea" rows="3" ></textarea>
        			    				<span class="sp">*</span><span class="graySign">（限制100字）</span>
        			    			</div>
								</td>
							</tr>							
						</table>
						</div>
					</td>
				</tr>						
				<tr>
					<td align="left"><input type="checkbox" name="needNoticeMerchant" id="empower" checked="checked"></input>通知商户处理订单
					</td>
				</tr>						
				<tr>
					<td align="center">
	            		<input name="button" type="button" class="button2" value="补录" onclick="copyTrade();"/>&nbsp;&nbsp;&nbsp;
	            		<input name="button" type="button" class="button2" value="返回" onclick="$('backHidden').click()" />
						<a id="backHidden" style="display:none" href="tradeQueryAction.do?method=list">back</a>
            		</td>
				</tr>
	  	</table>
			</div>
	  </form>
	   <script>
	   function changeTradeCode(v){
			document.forms[0].bankCode.disabled=false;
			document.forms[0].bankAccount.disabled=false;
			document.forms[0].bankSn.disabled=false;
			//$("merCode_tr").style.display="block";
			document.forms[0].merRequestId.disabled=false;
			//document.forms[0].bizType.disabled=false;
			
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

			if (v.indexOf('CZ') != -1){
				//商户名称
				//$("merCode_tr").style.display="none";
				
				document.all.merCode.value = "";

				//商户请求编号
				document.forms[0].merRequestId.disabled=true;
				document.forms[0].merRequestId.value='';
				//行业
				//document.forms[0].bizType.disabled=true;
				//document.forms[0].bizType.value='';
				
				//交易产品信息?提交时判断
				
			}
			if (v == 'SF0006'){
				//行业
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
	    var v = '${tradeRecord.tradeCode}';
	    if( v==undefined || v==null){
	    	
	    }else{
	    	changeTradeCode(v);	
	    }
	    
	    </script>
 	</body>
</html>

