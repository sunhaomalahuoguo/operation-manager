// 北京数码视讯支付系统应用服务管理平台

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}

function selectRowColor(t,chkName){             //复选按钮改变行的颜色
	var name = "c";
	if (chkName){
		name = chkName;
	}
 	for(j=0;j < document.getElementById(t).getElementsByTagName("tr").length;j++){
 		var trNode = document.getElementById(t).getElementsByTagName("tr")[j];
		try{
			var chk = trNode.getElementsByTagName("input")[0];
			if (chk.name == name){

				if(chk.checked){
					trNode.style.backgroundColor = "#eef2f7";
		  		}else{
					trNode.style.backgroundColor = "#FFFFFF";
		  		}
	  		}
  		}catch(e){}


 	}
}

function mouseoverRow(o){           //鼠标移上去时候行的颜色
	 o.style.backgroundColor = "#e4ebf4";
}
function mouseoutRow(o,tableid){              //鼠标离开后行的颜色   有复选框情况下
	for(i=1;i<=document.getElementById(tableid).getElementsByTagName("TR").length-2;i++){
		if(document.getElementById(tableid).getElementsByTagName("input")[i-1].checked == true){
			o.style.backgroundColor = "#eef2f7";
		}else{
		  	document.getElementById(tableid).getElementsByTagName("tr")[i].style.backgroundColor = "#FFFFFF";
		}
	}
}
function mouseoutRow2(o){           //鼠标离开后行的颜色   无复选框情况下
	 o.style.backgroundColor = "#FFFFFF";
}

function selAll(o,tableid){    //全选和取消全选控制
	var   e=document.getElementsByTagName("input");
	if(o.checked == true){
		for(var   i=0;i <e.length;i++){
       	 if(e[i].name== "testCheckBox"){
            e[i].checked=true;
			}
    	}
		o.checked == false;
		document.getElementById("selectAll").innerText = "取消全选"
	}
	if(o.checked == false){
		for(var   i=0;i <e.length;i++){
       	 if(e[i].name== "testCheckBox"){
            e[i].checked=false;
			}
    	}
		o.checked == true;
		document.getElementById("selectAll").innerText = "全部选择"
	}
	return selectRowColor(tableid);
}

function selAllWord(tableid){    //全选和取消全选控制
	var   o=document.getElementById("selectAll").innerText
	var   e=document.getElementsByTagName("input");
	if(o  == "全部选择"){
		for(var   i=0;i <e.length;i++){
       	 if(e[i].name== "testCheckBox"){
            e[i].checked=true;
			}
    	}
		document.getElementById("selectAllBox").checked = true;
		document.getElementById("selectAll").innerText = "取消全选"
	}
	if(o == "取消全选"){
		for(var   i=0;i <e.length;i++){
       	 if(e[i].name== "testCheckBox"){
            e[i].checked=false;
			}
    	}
		document.getElementById("selectAllBox").checked = false;
		document.getElementById("selectAll").innerText = "全部选择"
	}
	return selectRowColor(tableid);
}


var timeOutId;
function excelCallback(){
	var time = new Date();
	jQuery.get("../adminMainAction_getExcelResult?time=" + time, function(data){
		if (data == "removeLoading"){
			window.clearTimeout(timeOutId);
		   	removeLoading();
		   	return;
		}
	});
  	timeOutId = window.setTimeout("excelCallback();", 1000);
}

var moveableObj='';
document.onmouseup=MUp;
document.onmousemove=MMove;
document.onkeydown = com_OnKeyDown;

function com_OnKeyDown(){
	try{
		if ($("msgDivMain")){
			$("msgClose").click();
			return false;
		}
	}catch(e){
		return false;
	}
}

function MDown(Object){
	moveableObj=Object.id
	$(moveableObj).setCapture()
	pX=event.x-$(moveableObj).style.pixelLeft;
	pY=event.y-$(moveableObj).style.pixelTop;
}

function MMove(){
	if(moveableObj!=''){
	  $(moveableObj).style.left=event.x-pX;
	  $(moveableObj).style.top=event.y-pY;
	}
}

function MUp(){
	if(moveableObj!=''){
	  $(moveableObj).releaseCapture();
	  moveableObj='';
	}
}

function sumaAlert(msg,t){

	var title = "消息提示";
	if (t){
		title = t;
	}

	msgDivMain = document.createElement("div");
	jQuery(msgDivMain).attr("id","msgDivMain");
	jQuery(msgDivMain).addClass("msgDivMain");

	msgDivFrm = document.createElement("div");
	jQuery(msgDivFrm).addClass("msgDivFrm");

	msgText = document.createElement("div");
	jQuery(msgText).addClass("msgText");
	jQuery(msgText).attr("id","msgText");
	jQuery(msgText).mousedown(function(){MDown(msgDivMain)});
	jQuery(msgText).append(title);

	msgDivBody = document.createElement("div");
	jQuery(msgDivBody).addClass("msgDivBody");
	jQuery(msgDivBody).append("<p>"+msg+"</p>");

	msgClose = document.createElement("div");
	jQuery(msgClose).attr("id","msgClose");
	jQuery(msgClose).addClass("msgClose");
	jQuery(msgClose).append("关闭");

	jQuery(msgClose).click(function(){
		jQuery(msgDivMain).fadeOut("fast",function(){
			try{
				document.body.removeChild(msgDivMain);
				document.body.removeChild(maskDiv);
			}catch(e){}
		});
	});

	jQuery(msgDivFrm).append(msgText).append(msgDivBody).append(msgClose);
	jQuery(msgDivMain).append(msgDivFrm);

	maskDiv = document.createElement("div");
	maskDiv.id = "mask";

	document.body.appendChild(maskDiv);
	document.body.appendChild(msgDivMain);

	jQuery(msgDivMain).slideDown("fast",function(){jQuery(msgDivMain).focus();});
}
