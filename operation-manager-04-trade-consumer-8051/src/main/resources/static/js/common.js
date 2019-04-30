// *******************************************
//              common                      **
// *******************************************

    var ERR_EMPTY = "必须的信息不能为空";
    var ERR_MONEY = "所输金额格式不正确(整数部分应小于等于10位,小数部分应小于等于2位)";
    var ERR_RATIO = "所输比例格式不正确(整数部分应小于等于3位,小数部分应小于等于2位)";
    var ERR_NUMBER = "不能输入数字以外的字符";
    var ERR_FLOAT = "只能输入数值型的字符";
    var ERR_EMPTY_DATE = "请选择时间";
    var ERR_DATE = "时间格式不正确或日期不合法,正确格式为(YYYY/MM/DD)";
    var ERR_PASSWORD = "不能输入数字、字母以外的字符";


	/* 根据id取得对象 */
    function $(id){
        return document.getElementById(id);
    }

	/* 生成一个tag标签的对象 */
    function $C(tag){
        return document.createElement(tag);
    }

    /* 检查一个字符是不是空（onblur事件用） */
    function ce(o){
    	if (o.value == ""){
    		o.focus();
    		alert(ERR_EMPTY);
    	}
    }

	/* 检查一个非空字符是不是数字（用在分页的时候，跳转的页数输入框的onblur事件） */
    function cp(o){
    	if (o.value == ""){
    		return;
    	}
    	if (notInt(o.value)){
    		o.value='';
    		o.focus();
    		alert(ERR_NUMBER);
    	}
    }

		/* 数字判断 */
		function notInt(num){
			var reg = /[^0-9]/g;
			return reg.test(num);
		}

	function cup(o){
		if (o.value == ""){
    		return;
    	}
		if (!isNumChar(o.value)){
			o.value='';
    		o.focus();
    		alert(ERR_PASSWORD);
		}
	}
		
	function cem(o){
		if (o.value == ""){
    		return;
    	}
		var re = /^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/;
		if(!re.test(o.value)){
	    	o.value="";
	    	o.focus();
	    	alert("格式不正确，必须符合电子邮箱格式！");
	    }
	}
		
    /* 检查一个非空字符是不是浮点数字（onblur事件用） */
    function cf(o){
    	if (o.value == ""){
    		return;
    	}
    	if (!isFloat(o.value)){
	    	o.value = "";
    		o.focus();
    		alert(ERR_FLOAT);
    	}
    }

    /* 检查一个非空字符是不是金额（onblur事件用） */
    function cm(o){
    	if (o.value == ""){
    		return;
    	}
    	if (!isFund(o.value)){
    		o.value="";
    		o.focus();
    		alert(ERR_MONEY);
    	}
    	if (parseFloat(o.value) < 0){
    		o.value="";
    		o.focus();
    		alert("金额不能输入负数！");
    	}
    }

    /* 检查一个非空字符是不是日期（onblur事件用） */
    function cd(o){
    	if (o.value == ""){
    		return;
    	}
    	if (!dateValidate(o.value)){
    		o.focus();
    		alert(ERR_DATE);
    	}
    }
    function isBizRate(f) {
    	if (f.indexOf(" ") != -1){
			return false;
		}
		var i = parseFloat(f);
		if (f != i || i<0){
			return false;
		}else{
			if (f.indexOf(".") == -1){
				if (f.length > 3){
					return false;
				}else{
					return true;
				}
			}else{
				var a = f.split("\.")[0];
				var b = f.split("\.")[1];
				if (a.length > 3 || a.length < 1 || b.length > 2 || b.length < 1){
					return false;
				}else{
					return true;
				}
			}
		}
    }
    
		/* 比例的判断：范围0~100，小数位限制2位*/
		function cr(f){
			if (f.value=='') return;
			var i = parseFloat(f.value);
			msg = "所输比例格式不正确(范围0~100，小数位限制2位)";
			if (f.value == i && i <= 100){
				if (f.value.indexOf(".") != -1){
					var a = f.value.split("\.")[0];
					var b = f.value.split("\.")[1];
					if (a != '' && b != '') {
						if (b.length <= 2 && b.length >= 1){
							return ;
						}
					}
					f.focus();alert(msg);f.value="";return;
				}
				if (i < 0){
					f.focus();alert(msg);f.value="";return;
				}
				return;
			}
			f.focus();alert(msg);f.value="";return;
		}

	/* 实现字符串的trim方法 */
    String.prototype.trim=function(){
        return this.replace(/(^\s*)|(\s*$)/g, "");
	}

	/* 实现字符串的replaceAll方法 */
	String.prototype.replaceAll = strReplace;
	function strReplace(AFindText,ARepText) {
		raRegExp = new RegExp(AFindText,"g");
		return this.replace(raRegExp,ARepText)
	}

	/* 判断是否为空 */
	function isEmpty(n){
		if (null == n || n.trim() == ""){
			return true;
		}else{
			return false;
		}
	}

	function isNumChar(o){
	 	var re=/^[A-Za-z0-9_]+$/;
    	if(re.test(o)){
    		return true;
    	}else{
    		return false;
    	}
  	}
	
	function isPasswd(o){
	 	//var re=/^[A-Za-z0-9]{8,20}$/;
    	var re=/^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,20}$/;
		if(re.test(o)){
    		return true;
    	}else{
    		return false;
    	}
  	}
	
	function isChar(o){
	 	var re = new RegExp("^[a-z,A-Z]+$");
    	if(re.test(o)){
    		return true;
    	}else{
    		return false;
    	}
  	}
	
	function isNum(o){
	 	var re=/^[0-9]\d*$/;
    	if(re.test(o)){
    		return true;
    	}else{
    		return false;
    	}
  	}

  	function isPhone(o){
  		if (isEmpty(o)){
  			return true;
  		}
	 	var re=/^[0-9][0-9]*[\-]?[0-9]+[\-]?[0-9]*[0-9]$/;
    	if(re.test(o)){
    		return true;
    	}else{
    		return false;
    	}
  	}
  	function isMobile(o){
  		if (isEmpty(o)){
  			return true;
  		}
  		var re=/^(1)\d{10}$/;
  		if(re.test(o)){
  			return true;
  		}else{
  			return false;
  		}
  	}
  	
	var ERR_FORBIDDEN = "不能包含[ # , % , < , > , \" ,\' ,\+]字符";
	/* 非法字符 （# < >） */
	function isForbidden(o){
	 	var re=/[#%<>"'\+]+/;
    	if(re.test(o)){
    		return true;
    	}else{
    		return false;
    	}
  	}

	var ERR_FORBIDDEN_CHAR = "不能包含特殊字符";
	/* 非法字符 （# < >） */
	function isForbiddenChar(o){
	 	var re=/[!@#%<>"'\+\?\[\]\{\}\(\)\*\^\|\;\:\,\.\<\>\/\$\&\`\~\\\-\_]+/;
    	if(re.test(o)){
    		return true;
    	}else{
    		return false;
    	}
  	}
	
	/* 判断是否是整数数字 */
	function isNumber(n){
		var i = parseInt(n);
		if (n != i){
			return false;
		}else{
			return true;
		}
	}
	
	/* 判断是否是中文汉字 */
	function isChinese(o){
		var re=/[\u4e00-\u9fa5]/;
    	if(re.test(o)){
    		return true;
    	}else{
    		return false;
    	}
	}
	/* 判断是否全部为数字，不包括小数点，如1.0 */
	function isTotalNumber(n){
		if (notInt(n)){
			return false;
    	}else{
  	    	return true;
  	    }
	}

	/* 判断是否是浮点数字 */
	function isFloat(f){
		if (f.indexOf('.') == 0) {
			return false;
		}
		var i = parseFloat(f);
		if (f != i){
			return false;
		}else{
			return true;
		}
	}
	
	/* 判断是否是正数金额（整数小于等于10位，小数最多2位） */
	function isFundPlus(f){
		var exp = /^([1-9][\d]{0,9}|0)(\.[\d]{1,2})?$/;
	    if(exp.test(f)){
	    	return true;
	    }else{
	    	return false;
	    }
	}
	

	/* 判断是否是金额,可以为负数（整数小于等于10位，小数最多2位） */
	function isFund(f){
		var exp = /^([-]?)([1-9][\d]{0,9}|0)(\.[\d]{1,2})?$/;
	    if(exp.test(f)){
	    	return true;
	    }else{
	    	return false;
	    }
	}

	/* 清除一个select对象中的所有option */
    function clearSelect(sel){
        while(sel.options[0]){
            sel.removeChild(sel.options[0]);
        }
    }

	/* 日期检查 yyyy/MM/dd*/
    function dateValidate(str){
	  	var reg=/^((((1[6-9]|[2-9]\d)\d{2})\/(0[13578]|1[02])\/(0[1-9]|[12]\d|3[01]))|(((1[6-9]|[2-9]\d)\d{2})\/(0[13456789]|1[012])\/(0[1-9]|[12]\d|30))|(((1[6-9]|[2-9]\d)\d{2})\/02\/(0[1-9]|1\d|2[0-8]))|(((1[6-9]|[2-9]\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))\/02\/29))$/;
		return reg.test(str);
	}
    /* 日期检查 yyyy-MM-dd*/
    function dateValidate2(str){
	  	var reg=/^((((1[6-9]|[2-9]\d)\d{2})-(0[13578]|1[02])-(0[1-9]|[12]\d|3[01]))|(((1[6-9]|[2-9]\d)\d{2})-(0[13456789]|1[012])-(0[1-9]|[12]\d|30))|(((1[6-9]|[2-9]\d)\d{2})-02-(0[1-9]|1\d|2[0-8]))|(((1[6-9]|[2-9]\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-02-29))$/;
		return reg.test(str);
	}
	/* 两个输入日期的比较，返回值  -1：str1早于str2；1：str1晚于str2；0：str1等于str2*/
	function comDate(str1,str2)
	{
		var d1 = new Date(str1.replace("-", "/"));
		var d2 = new Date(str2.replace("-", "/"));
		if(Date.parse(d1) - Date.parse(d2)<0){
			return -1;
		} else if(Date.parse(d1) - Date.parse(d2)>0){
			return 1;
		} else {
			return 0;
		}
	}
	  /* Go 上一页 下一页
    pagenum: 要跳转的页数
  	jumpPage:用于传到后台的input hidden 的id和name
  	pageNum: 跳转到指定页面的输入框id和name
  */
  function toPage(pagenum, jumpPage, pageNum, maxPage){
    if (pagenum != ""){
   		$(jumpPage).value = pagenum;
    	document.forms[0].submit();
    	return ;
    }
    if ($(pageNum).value == "") {
    	alert("请填写页数");
    	$(pageNum).focus();
    	return;
    } else if (isTotalNumber($(pageNum).value)==false) {
    	alert("请填写整数值！");
    	$(pageNum).value="";
    	$(pageNum).focus();
    	return;
    } else if (parseInt($(pageNum).value) > maxPage || parseInt($(pageNum).value) < 1){
    	alert("请输入1到"+maxPage+"的整数值！");
    	$(pageNum).value="";
    	$(pageNum).focus();
    	return;
    } else {
      $(jumpPage).value = $(pageNum).value;
   		document.forms[0].submit();
   		return ;
    }
  }

  	/* 全部选择
	function selAll(s)
	{
	  var e=document.getElementsByName(s);
    for(var i=0;i <e.length;i++){e[i].checked=true;}
	} */
	/* 全部取消选择
	function cancelAll(s)
	{
    var e=document.getElementsByName(s);
    for(var i=0;i <e.length;i++){e[i].checked=false;}
	}*/

	function singleSel(o,n){
		var nm = "c";
		if (n){
			nm = n;
		}
		for (i = 0 ; i < document.getElementsByName(nm).length;i++){
			document.getElementsByName(nm)[i].checked = false;
		}
		o.checked = true;
	}

	/* 控制复选框选择与否 */
	function checkBoxCtrl(id,thisObj){
		var flg = thisObj.checked;
		var e = document.getElementsByName(id);
    	for(var i=0;i <e.length;i++)
    		e[i].checked=flg;
	}
	/* 当全选时，如果有一行被取消，则将全选复选框取消 */
	function checkAllSel(id,thisObj){
		var e = document.getElementById(id);
		if (thisObj.checked == false && e.checked == true){
			e.checked = false;
		}
	}
	/* 打开操作员操作记录 */
	function openwinlog(w) {
		var time = new Date();
		window.showModalDialog(w,'','dialogHeight:600px;center:yes;dialogWidth:900px;status:no;help:no');
	}

	/*格式化日期*/
	Date.prototype.Format = function(formatStr)	{
    var str = formatStr;
    var Week = ['日','一','二','三','四','五','六'];

    str=str.replace(/yyyy|YYYY/,this.getFullYear());
    str=str.replace(/yy|YY/,(this.getYear() % 100)>9?(this.getYear() % 100).toString():'0' + (this.getYear() % 100));

    str=str.replace(/MM/,this.getMonth()>8?(this.getMonth() + 1).toString():'0' + (this.getMonth() + 1));
    str=str.replace(/M/g,this.getMonth());

    str=str.replace(/w|W/g,Week[this.getDay()]);

    str=str.replace(/dd|DD/,this.getDate()>9?this.getDate().toString():'0' + this.getDate());
    str=str.replace(/d|D/g,this.getDate());

    str=str.replace(/hh|HH/,this.getHours()>9?this.getHours().toString():'0' + this.getHours());
    str=str.replace(/h|H/g,this.getHours());
    str=str.replace(/mm/,this.getMinutes()>9?this.getMinutes().toString():'0' + this.getMinutes());
    str=str.replace(/m/g,this.getMinutes());

    str=str.replace(/ss|SS/,this.getSeconds()>9?this.getSeconds().toString():'0' + this.getSeconds());
    str=str.replace(/s|S/g,this.getSeconds());

    return str;
	}

	function moreSearch(o){
		
		var status = document.getElementById("s").value;
		
		if (status){
			if (status == 1){
				o.innerText="↑快速查询 ";
				jQuery("tr[id^='dynamic']").each(function(){
					this.style.display = "table-row";
				});
				status = 2;
			}else{
				o.innerText="↓高级查询 ";
				jQuery("tr[id^='dynamic']").each(function(){
					this.style.display = "none";
				});
				status = 1;
			}
		}else{
			o.innerText="↑快速查询 ";
			jQuery("tr[id^='dynamic']").each(function(){
				this.style.display = "table-row";
			});
			status = 2;
		}
		document.getElementById("s").value = status;
//2015-2-11 由于select样式调整，不再执行初始操作。
//		j_reset_in_scope(); 
	}

function showRecord(){
 var SqueTime = 50;
 var CgStep = 10;
 var divWidth = parseInt(document.getElementById("czRecord").style.width);
 document.getElementById("czRecord").style.cursor = "pointer";
 //document.getElementById("czRecord").style.background = "url(images/caozuo_focus.gif)";
 if(divWidth<=80){
  document.getElementById("czRecord").style.width = divWidth+CgStep+"px";
  showRecordDiv = window.setTimeout("showRecord()",SqueTime)
 }
}
function hideRecord(){
 var SqueTime = 20;
 var CgStep = 5;
 var divWidth = parseInt(document.getElementById("czRecord").style.width);
 document.getElementById("czRecord").style.cursor = "";
 //document.getElementById("czRecord").style.background = "url(images/caozuo.gif)";
 window.clearTimeout(showRecordDiv);
 if(divWidth>22){
  document.getElementById("czRecord").style.width = divWidth-CgStep+"px";
  hideRecordDiv = window.setTimeout("hideRecord()",SqueTime)
 }
}
	/* 打开账户详细信息 */
	function openacc(u) {
		var time =new Date();
		window.showModalDialog(u+"&time="+time,'账户信息查询结果','dialogHeight:726px;center:yes;dialogWidth:900px;status:no;help:no');
	}
	/* 打开交易详细信息 */
		function opentrade(u) {
			var time =new Date();
			window.showModalDialog(u+"&time="+time,'','dialogHeight:550px;center:yes;dialogWidth:950px;status:no;help:no');
		}
	/* 打开详细信息画面 */
	function openInfo(u,param) {
		var time =new Date();
		window.showModalDialog(u+"&time="+time,param,'dialogHeight:532px;center:yes;dialogWidth:640px;status:no;help:no');
	}

	function openList(u){
		var time =new Date();
		window.showModalDialog(u+"&time="+time,'','dialogHeight:605px;center:yes;dialogWidth:850px;status:no;help:no');
	}

	function openSettlement(u){
		var time =new Date();
		window.showModalDialog(u+"&time="+time,'','dialogHeight:460px;center:yes;dialogWidth:740px;status:no;help:no');
	}
	
	function openUser(u){
		var time =new Date();
		window.showModalDialog(u+"&time="+time,'','dialogHeight:500px;center:yes;dialogWidth:800px;status:no;help:no');
	}

	/* 调整openInfo打开的页面中表的大小 */
	function modTable(o){
		if (375-document.getElementById(o).clientHeight > 0 ){
			document.getElementById('div1').style.display = "block";
			document.getElementById('div1').style.height = 405-document.getElementById(o).clientHeight;

		}else{
			document.getElementById('div1').style.display = "none";
			if (410-document.getElementById(o).clientHeight < 0 ){
				document.getElementById(o).style.width = "97%";
			}
		}
	}

	function modListTable(o){
		if (428-document.getElementById(o).clientHeight > 0 ){
			document.getElementById('div1').style.display = "block";
			document.getElementById('div1').style.height = 452-document.getElementById(o).clientHeight;

		}else{
			document.getElementById('div1').style.display = "none";
		}
	}

	function modSettlementTable(o){
		if (288-document.getElementById(o).clientHeight > 0 ){
			document.getElementById('div1').style.display = "block";
			document.getElementById('div1').style.height = 312-document.getElementById(o).clientHeight;

		}else{
			document.getElementById('div1').style.display = "none";
		}
	}

	function changeNavi(t){
	  try {
			window.top.naviFrame.document.getElementById("naviTitle").innerHTML = t;
		} catch(e){
		}
	}
	function changeBlog(t){
		try {
			window.top.naviFrame.document.getElementById("czRecord").style.display = "block";
			window.top.naviFrame.document.getElementById("blogTitle").value = t;
		} catch(e) {
		}
	}
	function hiddenBlog(){
		try {
			window.top.naviFrame.document.getElementById("czRecord").style.display = "none";
		} catch(e) {
		}
	}

	/* 如果页面有滚动条，则调整表格宽度，使其不被滚动条遮盖 */
	function modSize(o){

		if (document.body.scrollHeight > document.body.clientHeight
			|| document.documentElement.scrollHeight > document.documentElement.clientHeight){
			if (document.documentElement.clientHeight == 0){
				return;
			}
			if (document.getElementById(o).style.width == '100%'){
				var flg = 0;
				jQuery('.jQuery_select_div').each(function(){
					if (this.style.display == 'block'){
						flg = 1;
						return;
					}
				});
				jQuery('.calendar').each(function(){
					if (this.style.display == 'block'){
						flg = 1;
						return;
					}
				});
				if (flg == 1){
					return;
				}
				document.getElementById(o).style.width="98%";
			}
		}else{
			document.getElementById(o).style.width="100%";
		}
	}

	function loading(){
		var mask = $C("div");
		mask.setAttribute("id","mask");
		document.body.appendChild(mask);

		var ld = $C("div");
		ld.setAttribute("id","loading");
		ld.innerHTML = "正在处理中，请稍候...";
		document.body.appendChild(ld);
		document.body.scroll = "no";
	}

	function removeLoading(){
		document.body.removeChild($("mask"));
		document.body.removeChild($("loading"));
		document.body.scroll = "auto";
	}

	function isMail(o){
		var reg = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
		if (o != ''){
			if (reg.test(o) == false){
//				alert("输入e-mail地址不合法！");
//				o.value='';
				return false;
			}
		}
	}
	
	function checkNumber(input,maxlen,name){
		  var reg = /[^0-9]/g;
		  if (input.length>maxlen || reg.test(input)==true){
			alert(name+'字段，应输入小于等于'+maxlen+'位的数字!');
		 	return false;
		  }
	}
	function checkString(input,maxlen,name){
	 	var re=/^[A-Za-z0-9_]+$/;
	 	 if (input.length>maxlen || reg.test(input)==true){
				alert(name+'字段，应输入小于等于'+maxlen+'位的字符!');
			 	return false;
		}
  	}
	  //检查输入中的非法字符
	function checkString(InString) {
	    var RefString = "<";
	    var RefString2 = "%";
	    var RefString3 = "\"";
	    var RefString4 = ">";
	    var RefString5 = "~";
	    var RefString6 = "&";
	    var RefString7 = "?";
	    var RefString8 = "'";
	    for (Count = 0; Count < InString.length; Count++) {
	        TempChar = InString.substring(Count, Count + 1);
	        if ((RefString.indexOf(TempChar, 0) == 0) || (RefString2.indexOf(TempChar, 0) == 0) || (RefString3.indexOf(TempChar, 0) == 0) || (RefString4.indexOf(TempChar, 0) == 0) || (RefString5.indexOf(TempChar, 0) == 0) || (RefString6.indexOf(TempChar, 0) == 0) || (RefString7.indexOf(TempChar, 0) == 0) || (RefString8.indexOf(TempChar, 0) == 0)) {
	            //alert("您的输入中含有非法字符\"<\",\"\"\",\"%\",\">\",\"~\",\"&\",\"?\",\"'\",请重新输入!");
	            return (false);
	        }
	    }
	    return (true);
	}
	
	function ltrim(s){
    	return s.replace( /^\s*/,"");
	}
	//去右空格;
	function rtrim(s){
    	return s.replace( /\s*$/,"");
	}
	//去左右空格;
	function trim(s){
    	return ltrim(rtrim(s));
	}
	/* 电话号码校验
	function isPhone(ph){
		var reg = /^((\(\d{2,3}\))|(\d{3}\-))?(\(0\d{2,3}\)|0\d{2,3}-)?[1-9]\d{6,8}(\-\d{1,5})?$/;
		return reg.test(ph);
	}*/

	function checkZip(val) {
		var zip = /^((([0-9]{1}))+\d{5})$/;
		if(!zip.test(val)){ 
			return false;
		}else{
			return true;
		}
	}
	
	function checkZhOrNumOrLett(obj){    //判断是否是字母、数字组成   
		   var regu = "^[0-9a-zA-Z]+$";      
		   var re = new RegExp(regu);   
		   if (re.test(obj)) {   
		     return true;   
		   }   
		   return false;   
		}  

	function openBlock_pagingdown(num,before,total,excelStr,downFileName){
		if(total==0||total==""){
			alert("导出文件记录数不能为空！");
		}else{
			var htmlStr= '';
			htmlStr+='<table>';
			if(total<=10){
				for(var i=0;i<total;i++){
					htmlStr+='<tr><td style="width:400px;height:21px" align="center">'+
						'<span>'+downFileName+(i+1)+'</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="'+excelStr+i+'" style="color: #277E9B;">下载</a></td></tr>';
				}
				htmlStr+='<tr align="center"><td style="width:400px;" align="center"><a href="#" onclick="cancelBlock_pagingdown()" style="color: #277E9B;">关闭</a></td></tr>';
			}else{
				var pages = Math.ceil(total/10);
				var excelFiles = total;
				var allbits = 1;
				while((excelFiles = Math.floor(excelFiles/10))!=0){
					allbits++;
				}
				for(var i=10*num;i<total;i++){
					if(i==10*(num+1)){
						break;
					}
					var countbits = 1;
					var temp = i+1;
					while((temp = Math.floor(temp/10))!=0){
						countbits++;
					}
					var name = "";
					for(var k=0;k<allbits-countbits;k++){
						name+="0";
					}
					name+=(i+1);
					htmlStr+='<tr><td style="width:400px;height:21px" align="center">'+
						'<span>'+downFileName+name+'</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="'+excelStr+i+'" style="color: #277E9B;">下载</a></td></tr>';
				}
				htmlStr+='<tr><td></td></tr>';
				if(num==0){
					htmlStr+='<tr align="center"><td style="width:400px;" align="center">'+
						'<span>上一页</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#"  onclick="exceldownload('+(num+1)+','+num+','+total+')" style="color: #277E9B;">下一页</a>'+
						'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>第'+(num+1)+'/'+pages+'页</span></td></tr>';
				}else if(10*(num+1)>=total){
					htmlStr+='<tr align="center"><td style="width:400px;" align="center">'+
						'<a href="#"  onclick="exceldownload('+(num-1)+','+num+','+total+')" style="color: #277E9B;">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>下一页</span>'+
						'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>第'+(num+1)+'/'+pages+'页</span></td></tr>';
				}else{
					htmlStr+='<tr align="center"><td style="width:400px;" align="center">'+
						'<a href="#"  onclick="exceldownload('+(num-1)+','+num+','+total+')" style="color: #277E9B;">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#"  onclick="exceldownload('+(num+1)+','+num+','+total+')" style="color: #277E9B;">下一页</a>'+
						'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>第'+(num+1)+'/'+pages+'页</span></td></tr>';
				}
				htmlStr+='<tr align="center"><td style="width:400px;" align="center"><a href="#" onclick="cancelBlock_pagingdown()" style="color: #277E9B;">关闭</a></td></tr>';
			}
			htmlStr+='</table>';
			if(num==0&&before==0){
				modalPanel_pagingdown(320,400,360,320);
			}
			jQuery('#messagebox').empty();
			jQuery('#messagebox').append(htmlStr);
		}
	}
	
	function cancelBlock_pagingdown() {
		jQuery.unblockUI();
		//jQuery(".blockUI").fadeOut("slow");  //解决IE下关闭不了的问题
	}
	
	function modalPanel_pagingdown(top_size,left_size,width_size,height_size){
		  jQuery.blockUI({
			  message: jQuery('#messagebox'),
			  //默认定义消息框样式Css样式
				css: { 
					top:  (jQuery(window).height()-top_size)/2 + 'px', 
			        left: (jQuery(window).width()-left_size)/2 + 'px', 
			        width: width_size+'px' ,
			        height: height_size+'px',
			        color:          '#222', 
			        border:         '#6593cf 2px solid', 
			        backgroundColor:'#fff', 
			        cursor:         'wait' 
			    },
				// 遮罩样式
				overlayCSS:  { 
			        backgroundColor: '#4d4d4d', //类似easyui颜色
			        opacity:         0.6 //透明度
				},
			    // 遮罩层的Z-Index值，越大越在上面
			    baseZ: 5000, 
			    // 是否居中
			    centerX: true, 
			    centerY: true, 
			    //是否允许拉大 
			    //短的网页上。禁用如果你想防止车身高度的变化
			    allowBodyStretch: true, 
			   //遮罩时是否禁用键盘和鼠标事件
			    bindEvents: true
			});
		}	