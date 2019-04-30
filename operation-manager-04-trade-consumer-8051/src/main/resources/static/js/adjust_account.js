// *******************************************
//              对账调账管理页面脚本             **
// *******************************************
	/* 冲销处理提交检查 */
	function chk_chaAg(){
		if ($('money').value == ""){
			alert("金额为空值，不能进行冲销调账！");
			return;
		}
		if ($('chaReason').value == ""){
			alert("请填写冲销原因！");
			return;
		}
		document.forms[0].submit();
	}

	/* 退款处理提交检查 */
	function chk_refund(){
		if ($('accountId').value == ""){
			alert("账户号为空值，不能进行退款调账！");
			return;
		}
		if ($('money').value == ""){
			alert("金额为空值，不能进行退款调账！");
			return;
		}
		if ($('refundReason').value == ""){
			alert("请填写退款原因！");
			return;
		}
		document.forms[0].submit();
	}

	/* 补扣处理提交检查 */
	function chk_surcharge(){
		if ($('accountId').value == ""){
			alert("账户号为空值，不能进行补扣调账！");
			return;
		}
		if ($('money').value == ""){
			alert("金额为空值，不能进行补扣调账！");
			return;
		}
		if ($('surchargeReason').value == ""){
			alert("请填写补扣原因！");
			return;
		}
		document.forms[0].submit();
	}

	/* 补扣处理提交检查 */
	function chk_supple(){
		if ($('accountId').value == ""){
			alert("账户号为空值，不能进行补扣调账！");
			return;
		}
		if ($('amount').value == ""){
			alert("金额为空值，不能进行补扣调账！");
			return;
		}
		if ($('suppleReason').value == ""){
			alert("请填写补账原因！");
			return;
		}
		document.forms[0].submit();
	}


	/* 返回调账页面 */
	function sub_cancel(){
		document.forms[0].action="adjustAccountsAction.do?method=query";
		document.forms[0].submit();
	}