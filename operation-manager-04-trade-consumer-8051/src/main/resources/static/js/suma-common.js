function validNumber(t) {
		if (/^\d+$/.test(t.value)) {
			return;
		}
		t.value=t.value.replace(/[^\d]/g,'');
	}
//身份证号校验
function checkPersonNum(personNum){
	var q=/^\d{18}$|^\d{17}x$|^\d{17}X$/;
	if(!q.test(personNum)){
	    return false;
	}else{
		return true;
	}
}

function bankCardNoLength(bankCardNo){
	var q=/^\d{6}|\d{16-19}/;
	if(!q.test(bankCardNo)){
	    return false;
	}else{
		return true;
	}
}

//手机号校验
function checkphone(phone){
	var q=/^1[3|4|5|8][0-9]\d{8}$/;
	if(!q.test(phone)){
	    return false;
	}else{
		return true;
	}
}
/**
 * 
 * @param code
 * @returns {Boolean}
 */
function checkSMSNo(code) {
	var q=/^\d{6}/;
	if(!q.test(code)){
		return false;
	}
	return true;
}


// 邮箱校验
function checkEmail(strEmail) {
	if (strEmail.search(/^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/)  != -1){
		return true;
	}else{
		return false;
	}
}

//删除cookie
function delCookie(name){
     var exp = new Date();
     exp.setTime(exp.getTime() - 1);
     var cval = readCookie(name);
     if(cval!=null) document.cookie= name + "="+cval+";expires=" + exp.toGMTString();
}

// 写cookie
function writeCookie(name, value)
{
  var expire = "";

    expire = new Date((new Date()).getTime() + 24 * 365 * 3600000);
    expire = "; expires=" + expire.toGMTString();
    document.cookie = name + "=" + escape(value) + expire;
}


// 从cookie中读取
function readCookie(sName){
	// cookies are separated by semicolons
	var aCookie = document.cookie.split("; ");
	for (var i=0; i < aCookie.length; i++)	{
		// a name/value pair (a crumb) is separated by an equal sign
		var aCrumb = aCookie[i].split("=");
		if (sName == aCrumb[0])
		return unescape(aCrumb[1]);
	}
	// a cookie with the requested name does not exist
	return "";
}

/*
判断某种浏览器只需用if(Sys.ie)或if(Sys.firefox)等形式，而判断浏览器版本只需用if(Sys.ie == '8.0')或if(Sys.firefox == '3.0')
*/
var Sys = {};
var ua = navigator.userAgent.toLowerCase();
var s;
(s = ua.match(/msie ([\d.]+)/)) ? Sys.ie = s[1] :
(s = ua.match(/firefox\/([\d.]+)/)) ? Sys.firefox = s[1] :
(s = ua.match(/chrome\/([\d.]+)/)) ? Sys.chrome = s[1] :
(s = ua.match(/opera.([\d.]+)/)) ? Sys.opera = s[1] :
(s = ua.match(/version\/([\d.]+).*safari/)) ? Sys.safari = s[1] : 0;

//返回当前浏览器类型
function detectBrowserType(){
	if (Sys.ie) return ('IE: ' + Sys.ie);
	if (Sys.firefox) return('Firefox: ' + Sys.firefox);
	if (Sys.chrome) return('Chrome: ' + Sys.chrome);
	if (Sys.opera) return('Opera: ' + Sys.opera);
	if (Sys.safari) return('Safari: ' + Sys.safari); 
}

//模拟键盘事件定义（适用于Webkit）
function SimulateKeyEvent(eventName, bubbles, cancelable, view, ctrlKey,
altKey, shiftKey, metaKey, keyCode, charCode){
	try{
		this.keyCode=keyCode;
		this.which=keyCode;
		this.eventName=eventName;
		this.type=eventName;
	}catch(ex){}
}

//模拟触发键盘事件（适用于Webkit）
function triggerSimulateKeyEvent(elementId, eventName,keyCode) {
	var evt = new SimulateKeyEvent(eventName, true, true, window,
				false, false, false, false,
				keyCode, keyCode) ;
	try{
		window.event=evt;
	}catch(ex){	
		window.event.keyCode=keyCode;
	}
	return eval(elementId+".on"+eventName+"()");
}

// 用户签名
function getSignCode(inData){

	//var base64Data = base64encode(utf16to8(inData));
	var base64Data=encode64(strUnicode2Ansi(inData));
	
	try{

		var res = encryption.data.dataSign('', 1, base64Data, base64Data.length);
		var arr = res.split(',');
		if (arr[0] == '0'){
			return encodeURIComponent(arr[1]);
		}else{
			return '';
		} 
	}catch(e){
		//alert("getSignCode exception");
		return "";
	}
}

// 获取用户证书ID
function getCertId(){
	try{
		
		var cert = encryption.cert.getInfo(0x2000);
		
		var arr = cert.split(',');
		if (arr[0] == '0'){
			return arr[1].split(';')[2];
		}else{
			return '';
		}
	}catch(e){
		//alert("getCertId exception");
		return "";
	}
	
}

/**
 * 
 * @param date 'YYMM'
 * @returns {Boolean}
 */
function creditCardDate(date) {
	var q=/^\d{2}((0[1-9])|(1[0-2]))/;
	if(!q.test(date)){
	    return false;
	}else{
		return true;
	}
}
/**
 * 
 * @param date 'YY'
 * @returns {Boolean}
 */
function creditCardYear(date) {
	var q=/^\d{2}$/;
	if(!q.test(date)){
	    return false;
	}else{
		return true;
	}
}
/**
 * 
 * @param date 'MM'
 * @returns {Boolean}
 */
function creditCardMonth(date) {
	var q=/^0[1-9]|1[0-2]$/;
	if(!q.test(date)){
	    return false;
	}else{
		return true;
	}
}
/**
 * 
 * @param cvn
 * @returns {Boolean}
 */
function creditCardCvn(cvn) {
	var q=/^\d{3}/;
	if(!q.test(cvn)){
	    return false;
	}else{
		return true;
	}
}

/**
 * js 银行卡号 luhm
 */
//Create Time:  07/28/2011
//Operator:     gavin
//Description:  银行卡号Luhm校验
//Luhm校验规则：16位银行卡号（19位通用）:
// 1.将未带校验位的 15（或18）位卡号从右依次编号 1 到 15（18），位于奇数位号上的数字乘以 2。
// 2.将奇位乘积的个十位全部相加，再加上所有偶数位上的数字。
// 3.将加法和加上校验位能被 10 整除。
//方法步骤很清晰，易理解，需要在页面引用Jquery.js   
//bankno为银行卡号 banknoInfo为显示提示信息的DIV或其他控件
function luhmCheck(bankno){
    var lastNum=bankno.substr(bankno.length-1,1);//取出最后一位（与luhm进行比较）
    var first15Num=bankno.substr(0,bankno.length-1);//前15或18位
    var newArr=new Array();
    for(var i=first15Num.length-1;i>-1;i--){    //前15或18位倒序存进数组
        newArr.push(first15Num.substr(i,1));
    }
    var arrJiShu=new Array();  //奇数位*2的积 <9
    var arrJiShu2=new Array(); //奇数位*2的积 >9
    var arrOuShu=new Array();  //偶数位数组
    for(var j=0;j<newArr.length;j++){
        if ((j+1)%2==1) {//奇数位
            if (parseInt(newArr[j])*2<9)
            	arrJiShu.push(parseInt(newArr[j])*2);
            else
            	arrJiShu2.push(parseInt(newArr[j])*2);
        } else //偶数位
        	arrOuShu.push(newArr[j]);
    }
    var jishu_child1=new Array();//奇数位*2 >9 的分割之后的数组个位数
    var jishu_child2=new Array();//奇数位*2 >9 的分割之后的数组十位数
    for(var h=0;h<arrJiShu2.length;h++){
        jishu_child1.push(parseInt(arrJiShu2[h])%10);
        jishu_child2.push(parseInt(arrJiShu2[h])/10);
    }       
    var sumJiShu=0; //奇数位*2 < 9 的数组之和
    var sumOuShu=0; //偶数位数组之和
    var sumJiShuChild1=0; //奇数位*2 >9 的分割之后的数组个位数之和
    var sumJiShuChild2=0; //奇数位*2 >9 的分割之后的数组十位数之和
    var sumTotal=0;
    for (var m=0;m<arrJiShu.length;m++) {
        sumJiShu=sumJiShu+parseInt(arrJiShu[m]);
    }
    for (var n=0;n<arrOuShu.length;n++) {
        sumOuShu=sumOuShu+parseInt(arrOuShu[n]);
    }
    for (var p=0;p<jishu_child1.length;p++) {
        sumJiShuChild1=sumJiShuChild1+parseInt(jishu_child1[p]);
        sumJiShuChild2=sumJiShuChild2+parseInt(jishu_child2[p]);
    }     
    //计算总和
    sumTotal=parseInt(sumJiShu)+parseInt(sumOuShu)+parseInt(sumJiShuChild1)+parseInt(sumJiShuChild2);
    //计算Luhm值
    var k= parseInt(sumTotal)%10==0?10:parseInt(sumTotal)%10;       
    var luhm= 10-k;
    if (lastNum==luhm) {
    	return true;
    } else {
    	return false;
    }       

}

/*
功能：验证身份证号码是否有效
提 示信息：未输入或输入身份证号不正确！
使用：validateIdCard(obj)
返回：0,1,2,3
*/
function validateIdCard(obj)
{
	var aCity={11:"北京",12:"天津",13:"河北",14:"山西",15:"内蒙古",21:"辽宁",22:"吉林",23:"黑龙 江",31:"上海",32:"江苏",33:"浙江",34:"安徽",35:"福建",36:"江西",37:"山东",41:"河南",42:"湖 北",43:"湖南",44:"广东",45:"广西",46:"海南",50:"重庆",51:"四川",52:"贵州",53:"云南",54:"西 藏",61:"陕西",62:"甘肃",63:"青海",64:"宁夏",65:"新疆",71:"台湾",81:"香港",82:"澳门",91:"国 外"};
	var iSum = 0;
	//var info = "";
	var strIDno = obj;
	var idCardLength = strIDno.length;
	if(!/^\d{17}(\d|x)$/i.test(strIDno)&&!/^\d{15}$/i.test(strIDno))
        return 1; //非法身份证号
	if(aCity[parseInt(strIDno.substr(0,2))]==null)
		return 2;// 非法地区
	// 15位身份证转换为18位
	if (idCardLength==15)
	{
		sBirthday = "19" + strIDno.substr(6,2) + "-" + Number(strIDno.substr(8,2)) + "-" + Number(strIDno.substr(10,2));
		var d = new Date(sBirthday.replace(/-/g,"/"))
		var dd = d.getFullYear().toString() + "-" + (d.getMonth()+1) + "-" + d.getDate();
		if(sBirthday != dd)
             return 3; //非法生日
        strIDno=strIDno.substring(0,6)+"19"+strIDno.substring(6,15);
        strIDno=strIDno+GetVerifyBit(strIDno);
	}
    // 判断是否大于2078年，小于1900年
   var year =strIDno.substring(6,10);
   if (year<1900 || year>2078 )
       return 3;//非法生日
    //18位身份证处理
   //在后面的运算中x相当于数字10,所以转换成a
    strIDno = strIDno.replace(/x$/i,"a");
  sBirthday=strIDno.substr(6,4)+"-"+Number(strIDno.substr(10,2))+"-"+Number(strIDno.substr(12,2));
  var d = new Date(sBirthday.replace(/-/g,"/"))
  if(sBirthday!=(d.getFullYear()+"-"+ (d.getMonth()+1) + "-" + d.getDate()))
                return 3; //非法生日
    // 身份证编码规范验证
  for(var i = 17;i>=0;i --)
   iSum += (Math.pow(2,i) % 11) * parseInt(strIDno.charAt(17 - i),11);
  if(iSum%11!=1)
                return 1;// 非法身份证号
   // 判断是否屏蔽身份证
    var words = new Array();
    words = new Array("11111119111111111","12121219121212121");
    for(var k=0;k<words.length;k++){
        if (strIDno.indexOf(words[k])!=-1){
            return 1;
        }
    }
 return 0;
}