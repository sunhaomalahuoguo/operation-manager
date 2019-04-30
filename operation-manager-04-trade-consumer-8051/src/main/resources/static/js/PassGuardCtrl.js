//Windows IE32
var PGEdit_IE32_CLASSID="3B5D5D61-93A9-4837-9BC7-059DD14D23C1";
var PGEdit_IE32_CAB="";
var PGEdit_IE32_EXE="PassGuardL.exe";
var PGEdit_IE32_VERSION="1.0.0.6";
//Windows IE64
var PGEdit_IE64_CLASSID="3B5D5D61-93A9-4837-9BC7-059DD14D23C1";
var PGEdit_IE64_CAB="";
var PGEdit_IE64_EXE="PassGuardLX64.exe";
var PGEditt_IE64_VERSION="1.0.0.6";
//Windows 非IE
var PGEdit_FF="PassGuardLFF.exe";
var PGEdit_FF_VERSION="1.0.0.4";
//Mac OS
var PGEdit_MacOs="PassGuardL.pkg";
var PGEdit_MacOs_VERSION="1.0.0.5";
var license = "amJ1N092dlo4NXlVdWtnOEtKZUROak5hbVdMM055SDZ1aTFjcVYvN3NqTm9uOU1ubXhmWStyN0J6dDJWV2ZCckNZcFA2T09BQzRFbG1GbXNIQ3NCNys2OVU1YUltUTRoSE5BalBPcGsxK0o1ZVZPQTREM3ByckJOU1lpY3JWTHhncm1sMDFmblgydDJBNExFazVlM2xaRXF0N1k1bnNKUHR0TlZwVDVyVm5NPXsiaWQiOjAsInR5cGUiOiJwcm9kdWN0IiwicGFja2FnZSI6WyIiXSwiYXBwbHluYW1lIjpbIiouc3VtYXBheS5jb20iLCI1OS4xNTEuMS4zIiwiMTcyLjE2LjMuMSIsIjE3Mi4xNi45LjMiLCIxNzIuMTYuMTQuMTIiXSwicGxhdGZvcm0iOjR9";
var PGEdit_Update="0",isInstalled = -1;//非IE控件是否强制升级 1强制升级,0不强制升级
if(navigator.userAgent.indexOf("MSIE")<0){navigator.plugins.refresh();}//非IE需要刷新plugins数组
(function(jQuery) {
	jQuery.pge = function (options) {
		this.settings = jQuery.extend(true, {}, jQuery.pge.defaults, options);
		this.init();
	};
	jQuery.extend(jQuery.pge, {
		defaults: {
			pgePath: "./ocx/",
			pgeId: "",
			pgeEdittype: 0,
			pgeEreg1: "",
			pgeEreg2: "",
			pgeMaxlength: 12,
			pgeTabindex: 2,
			pgeClass: "ocx_style",
			pgeInstallClass: "ocx_style",
			passLoginStyle:"passLoginStyle",
			pgeOnkeydown:"",
			pgeFontName:"",
			pgeFontSize:"",
			tabCallback:"",
			pgeBackColor:"",
			pgeForeColor:"",
			pgeUrls:"https://windows10.microdone.cn",
			pgePort:5082,
			pgeWindowID:"password"+new Date().getTime()
		},
		prototype: {
			init: function() {//初始化pge对象
			    this.pgeDownText="请点此安装控件";
			    this.osBrowser = this.checkOsBrowser();
			    if(isInstalled == -1) isInstalled = this.checkInstall();
			    this.pgeVersion = this.getVersion();
			},
			apiVersion : "2016.07.10001",//js脚本版本号
			/**输入接口**/
			//给控件设置随机因子
			pwdSetSk : function(s) {
				if (isInstalled) {
					try {
						var control = this.pwdGetEById(this.settings.pgeId);
						if (this.osBrowser==1 || this.osBrowser==3 || this.osBrowser==6 || this.osBrowser==8) {
							control.input1 = s;
						} else if (this.osBrowser==2) {
							control.input(1,s);
						}
					} catch (err) {	}
				}
			},
			//设置授权license
			setLicense:function(){
				if(isInstalled){
					var control = document.getElementById(this.settings.pgeId);
					if(this.osBrowser == 1 || this.osBrowser == 3){
						control.license = license;
					}
				}
			},
			/**输出接口**/
			//获得密码长度
			pwdLength : function() {
				var code = 0;
				if (!isInstalled) {
					code = 0;
				}else{
					try {
						var control = this.pwdGetEById(this.settings.pgeId);
						if (this.osBrowser==1 || this.osBrowser==3) {
							code = control.output3;
						} else if (this.osBrowser==2) {
							code = control.output(3);
						}else if (this.osBrowser==6 || this.osBrowser==8) {
							code = control.get_output3();
						}
					} catch (err) {	code = 0; }
				}
				return code;
			},
			//获得密码的Hash值
			pwdHash : function() {
				var code = 0;
				if (!isInstalled) {
					code = 0;
				}else{
					try {
						var control = this.pwdGetEById(this.settings.pgeId);
						if (this.osBrowser==1 || this.osBrowser==3) {
							code = control.output2;
						} else if (this.osBrowser==2) {
							code = control.output(2);
						}else if (this.osBrowser==6 || this.osBrowser==8) {
							code = control.get_output2();
						}
					} catch (err) {code = 0;}
				}
				return code;
			},
			//判断密码是否是简单密码
			pwdSimple: function() {
				var code = '';
				if (!isInstalled) {
					code = '';
				}else{
					try {
						var control = this.pwdGetEById(this.settings.pgeId);
						if (this.osBrowser==1 || this.osBrowser==3) {
							code = control.output44;
						} else if (this.osBrowser==2) {
							code = control.output(13);
						}else if (this.osBrowser==6 || this.osBrowser==8) {
							code = control.get_output10();
						}
					} catch (err) {code = '';}
				}
				return code;
			},			
			//判断密码是否匹配正则表达式二
			pwdValid : function() {
				var code = 1;
				if (!isInstalled) {
					code = 1;
				}else{
					try {
						var control = this.pwdGetEById(this.settings.pgeId);
						if (this.osBrowser==1 || this.osBrowser==3) {
							if(control.output1) code = control.output5;
						} else if (this.osBrowser==2) {
							code = control.output(5);
						}else if (this.osBrowser==6 || this.osBrowser==8) {
							code = control.get_output5();
						}
					} catch (err) {	code = 1; }
				}
				return code;
			},
			//获得密码AES密文
			pwdResult: function() {
				var code = '';
				if (!isInstalled) {
					code = '';
				}else{
					try {
						var control = this.pwdGetEById(this.settings.pgeId);
						if (this.osBrowser==1 || this.osBrowser==3) {
							code = control.output1;
						} else if (this.osBrowser==2) {
							code = control.output(7);
						}else if (this.osBrowser==6 || this.osBrowser==8) {
							code = control.get_output1();
						}						
					} catch (err) {	code = '';}
				}
				return code;
			},
			//获得计算机Mac信息密文
			machineNetwork : function() {
				var code = '';
				if (!isInstalled) {
					code = '';
				}else{
					try {
						var control = this.pwdGetEById(this.settings.pgeId);
						if (this.osBrowser==1 || this.osBrowser==3) {
							code = control.GetIPMacList();
						} else if (this.osBrowser==2) {
							code = control.output(9);
						}else if (this.osBrowser==6 || this.osBrowser==8) {
							code = control.get_output7(0);
						}
					} catch (err) { code = ''; }
				}
				return code;
			},
			//获得计算机硬盘信息密文
			machineDisk : function() {
				var code = '';
				if (!isInstalled) {
					code = '';
				}else{
					try {
						var control = this.pwdGetEById(this.settings.pgeId);
						if (this.osBrowser==1 || this.osBrowser==3) {
							code = control.GetNicPhAddr(1);
						} else if (this.osBrowser==2) {
							code = control.output(11);
						}else if (this.osBrowser==6 || this.osBrowser==8) {
							code = control.get_output7(2);
						}
					} catch (err) {	code = ''; }
				}
				return code;
			},
			//获得计算机cpu信息密文
			machineCPU : function() {
				var code = '';
				if (!isInstalled) {
					code = '';
				}else{
					try {
						var control = this.pwdGetEById(this.settings.pgeId);
						if (this.osBrowser==1 || this.osBrowser==3) {
							code = control.GetNicPhAddr(2);
						} else if (this.osBrowser==2) {
							code = control.output(10);
						}else if (this.osBrowser==6 || this.osBrowser==8) {
							code = control.get_output7(1);
						}
					} catch (err) {	code = '';}
				}
				return code;
			},
			//获得密码的强度(强度的规则可调整)
			pwdStrength : function() {
				var code = 0;
				if (!isInstalled) {
					code = 0;
				}else{
					try {
						var control = this.pwdGetEById(this.settings.pgeId);
						if (this.osBrowser==1 || this.osBrowser==3) {
							var len = control.output3;
							var num = control.output4;
							var zoom = control.output54;
						} else if (this.osBrowser==2 ) {
							var len = control.output(3);
							var num = control.output(4);
							var zoom = control.output(4,1);
						}else if (this.osBrowser==6 || this.osBrowser==8) {
							var len = control.get_output3();
							var num = control.get_output4();
							var zoom = control.get_output16();
						}
						if(len < 6){
							code = 0;
						}else if(num == 1 && len >= 6){
							code = 1; //弱
						}else if(num == 2 && len >= 6){
							code = 2; //中
						}else if(num == 3 && len >= 6){
							code = 3; //强
						}
					} catch (err) {	code ="";}
				}
				return code;
			},
			//获得控件版本号
			getVersion : function() {
				try {
					if (this.osBrowser==1 || this.osBrowser==3) {
						var comActiveX = new ActiveXObject("PassGuardL.PassGuard.1"); 
						return comActiveX.output35;
					}else if(this.osBrowser == 2 || this.osBrowser == 6 || this.osBrowser == 8 ){
						var arr = new Array(),pge_version;
				    	var pge_info = navigator.plugins['PassGuardX_L'].description;
						if(pge_info.indexOf(":") > 0){
							arr = pge_info.split(":");
							pge_version = arr[1];
						}else{
							pge_version = "";
						}
					}
					return pge_version;
				}catch(err){ return "";}					
			},
			//获得密码字符类型个数
			pwdNum : function() {
				var code = 0;
				if (!isInstalled) {
					code = 0;
				}else{
					try {
						var control = this.pwdGetEById(this.settings.pgeId);
						if (this.osBrowser==1 || this.osBrowser==3) {
							code = control.output4;
						} else if (this.osBrowser==2) {
							code = control.output(4);
						}else if (this.osBrowser==6 || this.osBrowser==8) {
							code = control.get_output4();
						}
					} catch (err) { code = 0;}
				}
				return code;
			},
			/**公共方法**/
			//检测操作系统和浏览器信息
			checkOsBrowser: function() {
				var userosbrowser;
				var regStr_chrome = /chrome\/[\d.]+/gi ;
				if((navigator.platform =="Win32") || (navigator.platform =="Windows")){
					if(navigator.userAgent.indexOf("MSIE")>0 || navigator.userAgent.indexOf("msie")>0 || navigator.userAgent.indexOf("Trident")>0 || navigator.userAgent.indexOf("trident")>0){
						if(navigator.userAgent.indexOf("ARM")>0){
							userosbrowser=9; // win8 RAM Touch
							this.pgeditIEExe="";
						}else{
							userosbrowser=1;// windows32ie32
							this.pgeditIEClassid=PGEdit_IE32_CLASSID;
							this.pgeditIECab=PGEdit_IE32_CAB;
							this.pgeditIEExe=PGEdit_IE32_EXE;
						}
					}else if(navigator.userAgent.indexOf("Edge")>0){
						userosbrowser = 10;
						this.pgeditFFExe = PGEdit_Edge;
					}else if(navigator.userAgent.indexOf("Chrome")>0){
						var chromeVersion = navigator.userAgent.match(regStr_chrome).toString();
						chromeVersion = parseInt(chromeVersion.replace(/[^0-9.]/gi,""));
						if(chromeVersion >= 42){
							userosbrowser = 2;
							this.pgeditFFExe = PGEdit_FF;
						}else{
							userosbrowser=2;
							this.pgeditFFExe = PGEdit_FF;
						}
					}else{
						userosbrowser=2; // windowsff
						this.pgeditFFExe=PGEdit_FF;
					}
				}else if((navigator.platform=="Win64")){
					if(navigator.userAgent.indexOf("Windows NT 6.2")>0 || navigator.userAgent.indexOf("windows nt 6.2")>0){		
						userosbrowser=1;// windows32ie32
						this.pgeditIEClassid=PGEdit_IE32_CLASSID;
						this.pgeditIECab=PGEdit_IE32_CAB;
						this.pgeditIEExe=PGEdit_IE32_EXE;						
					}else if(navigator.userAgent.indexOf("MSIE")>0 || navigator.userAgent.indexOf("msie")>0 || navigator.userAgent.indexOf("Trident")>0 || navigator.userAgent.indexOf("trident")>0){
						userosbrowser=3;//windows64ie64
						this.pgeditIEClassid=PGEdit_IE64_CLASSID;
						this.pgeditIECab=PGEdit_IE64_CAB;
						this.pgeditIEExe=PGEdit_IE64_EXE;			
					}else if(navigator.userAgent.indexOf("Edge")>0 || navigator.userAgent.indexOf("Firefox")){
						userosbrowser = 10;
						this.pgeditFFExe = PGEdit_Edge;
					}else if(navigator.userAgent.indexOf("Chrome")>0){
						var chromeVersion = navigator.userAgent.match(regStr_chrome).toString();
						chromeVersion = parseInt(chromeVersion.replace(/[^0-9.]/gi,""));
						if(chromeVersion >= 42){
							userosbrowser = 2;
							this.pgeditFFExe = PGEdit_FF;
						}else{
							userosbrowser = 2;
							this.pgeditFFExe = PGEdit_FF;
						}
					}else{
						userosbrowser=2;
						this.pgeditFFExe=PGEdit_FF;
					}
				}else if(navigator.userAgent.indexOf("Macintosh")>0){
					if(navigator.userAgent.indexOf("Safari")>0 && (navigator.userAgent.indexOf("Version/5.1")>0 || navigator.userAgent.indexOf("Version/5.2")>0 || navigator.userAgent.indexOf("Version/6")>0)){
						userosbrowser=8;//macos Safari 5.1 more
						this.pgeditFFExe=PGEdit_MacOs;
					}else if(navigator.userAgent.indexOf("Firefox")>0 || navigator.userAgent.indexOf("Chrome")>0){
						var chromeVersion = navigator.userAgent.match(regStr_chrome);
						if( chromeVersion != null){
							chromeVersion = chromeVersion.toString();
							chromeVersion = parseInt(chromeVersion.replace(/[^0-9.]/gi,""));
							if(chromeVersion >= 42){
								userosbrowser = 11;
								this.pgeditFFExe = "";
							}else{
								userosbrowser=6;
								this.pgeditFFExe = PGEdit_MacOs;		
							}
						}else{
							userosbrowser=6;// macos
							this.pgeditFFExe = PGEdit_MacOs;
						}
					}else if(navigator.userAgent.indexOf("Opera")>=0 && (navigator.userAgent.indexOf("Version/11.6")>0 || navigator.userAgent.indexOf("Version/11.7")>0)){
						userosbrowser=6;//macos
						this.pgeditFFExe=PGEdit_MacOs;						
					}else if(navigator.userAgent.indexOf("Safari")>=0){
						userosbrowser=6;//macos
						this.pgeditFFExe=PGEdit_MacOs;			
					}else{
						userosbrowser=0;//macos
						this.pgeditFFExe="";
					}
				}
				return userosbrowser;
			},
			//根据不同的浏览器生成控件标签代码
			getpgeHtml: function() {
				if (this.osBrowser==1 || this.osBrowser==3) {
					return '<span id="'+this.settings.pgeId+'_pge" class="'+this.settings.passLoginStyle+'"><OBJECT ID="' + this.settings.pgeId + '" CLASSID="CLSID:' + this.pgeditIEClassid + '" codebase="' 
					        +this.settings.pgePath+ this.pgeditIECab + '" onkeydown="if(13==event.keyCode || 27==event.keyCode)'+this.settings.pgeOnkeydown+';" tabindex="'+this.settings.pgeTabindex+'" class="' + this.settings.pgeClass + '">' 
					        + '<param name="edittype" value="'+ this.settings.pgeEdittype + '"><param name="maxlength" value="' + this.settings.pgeMaxlength +'"><param name="input58" value="'+this.settings.pgeOnfocus+'"><param name="input59" value="'+this.settings.pgeOnblur+'">' 
							+ '<param name="input2" value="'+ this.settings.pgeEreg1 + '"><param name="input3" value="'+ this.settings.pgeEreg2 + '"></OBJECT></span>'
							+ '<span id="'+this.settings.pgeId+'_down" class="'+this.settings.pgeInstallClass+'" style="text-align:center;display:none;"><a href="'+this.settings.pgePath+this.pgeditIEExe+'">'+this.pgeDownText+'</a></span>';
				} else if (this.osBrowser==2) {
					var ff = "";
					if(navigator.userAgent.indexOf("SE 2.X") > -1 || navigator.userAgent.indexOf("OPR") > -1){
						ff = "this.focus();";
					}
					var pgeOcx='<embed onmouseover="'+ff+'" onfocus="'+this.settings.pgeOnfocus+'" input_0 ="'+license+'" onblur="'+this.settings.pgeOnblur+'" ID="' + this.settings.pgeId + '"  maxlength="'+this.settings.pgeMaxlength+'" input_2="'+this.settings.pgeEreg1+'" input_3="'+this.settings.pgeEreg2+'" edittype="'+this.settings.pgeEdittype+'" type="application/pass-guard-x-lic" tabindex="'+this.settings.pgeTabindex+'" class="' + this.settings.pgeClass + '" ';
					if(this.settings.pgeOnkeydown!=undefined && this.settings.pgeOnkeydown!="") pgeOcx+=' input_1013="'+this.settings.pgeOnkeydown+'"';
					if(this.settings.tabCallback!=undefined && this.settings.tabCallback!="") pgeOcx+=' input_1009="setTimeout(function(){document.getElementById(\''+this.settings.tabCallback+'\').focus();},10);"';
					if(navigator.userAgent.indexOf("Chrome") > -1 || navigator.userAgent.indexOf("Safari") > -1){
						if(this.settings.pgeOnfocus!=undefined && this.settings.pgeOnfocus!="") pgeOcx+=' input_1010="'+this.settings.pgeOnfocus+'"';
						if(this.settings.pgeOnblur!=undefined && this.settings.pgeOnblur!="") pgeOcx+=' input_1011="'+this.settings.pgeOnblur+'"';
					}
					if(this.settings.pgeFontName!=undefined && this.settings.pgeFontName!="") pgeOcx+=' FontName="'+this.settings.pgeFontName+'"';
					if(this.settings.pgeFontSize!=undefined && this.settings.pgeFontSize!="") pgeOcx+=' FontSize='+Number(this.settings.pgeFontSize)+'';					
					pgeOcx+='/>';
					return pgeOcx;
				} else {
					return '<div id="'+this.settings.pgeId+'_down" class="'+this.settings.pgeInstallClass+'" style="text-align:center;">暂不支持此浏览器</div>';
				}				
			},
			//用document.write()绘制控件标签代码
			generate: function() {
				if (!isInstalled) {
					return document.write(this.getDownHtml());
				}else{
					if(this.osBrowser==1){
						if(this.getConvertVersion(this.pgeVersion)<this.getConvertVersion(PGEdit_IE32_VERSION) && PGEdit_Update==1){
							this.setDownText();
							return document.write(this.getDownHtml());
						} 
					} else if(this.osBrowser==3){	
						if(this.getConvertVersion(this.pgeVersion)<this.getConvertVersion(PGEditt_IE64_VERSION) && PGEdit_Update==1){
							this.setDownText();
							return document.write(this.getDownHtml());
						}
					} else if(this.osBrowser==2){
						if(this.getConvertVersion(this.pgeVersion)<this.getConvertVersion(PGEdit_FF_VERSION) && PGEdit_Update==1){
							this.setDownText();
							return document.write(this.getDownHtml());	
						}
					} else if (this.osBrowser==6 || this.osBrowser==8) {
						if(this.getConvertVersion(this.pgeVersion)<this.getConvertVersion(PGEdit_MacOs_VERSION)&& PGEdit_Update==1){
							this.setDownText();
							return document.write(this.getDownHtml());	
						}
					}
					return document.write(this.getpgeHtml());
				}
			},
			//返回绘制控件标签代码
			load : function() {		
				if (!isInstalled) {
					return this.getDownHtml();
				}else{
					if(this.osBrowser==1){
						if(this.getConvertVersion(this.pgeVersion)<this.getConvertVersion(PGEdit_IE32_VERSION) && PGEdit_Update==1){
							this.setDownText();
							return this.getDownHtml();
						} 
					}else if(this.osBrowser==3){
						if(this.getConvertVersion(this.pgeVersion)<this.getConvertVersion(PGEditt_IE64_VERSION) && PGEdit_Update==1){
							this.setDownText();
							return this.getDownHtml();
						} 		
					}else if(this.osBrowser==2){  
						if(this.getConvertVersion(this.pgeVersion)<this.getConvertVersion(PGEdit_FF_VERSION) && PGEdit_Update==1){
							this.setDownText();
							return this.getDownHtml();	
						}
					} else if (this.osBrowser==6 || this.osBrowser==8) {
						if(this.getConvertVersion(this.pgeVersion)<this.getConvertVersion(PGEdit_MacOs_VERSION)&& PGEdit_Update==1){
							this.setDownText();
							return this.getDownHtml();	
						}
					}
					return this.getpgeHtml();
				}
			},
			//返回提示下载的标签代码
			getDownHtml : function() {
				if (this.osBrowser==1 || this.osBrowser==3) {
					return '<div id="'+this.settings.pgeId+'_down" class="'+this.settings.pgeInstallClass+'" style="text-align:center;line-height:28px;"><a href="'+this.settings.pgePath+this.pgeditIEExe+'">'+this.pgeDownText+'</a></div>';
				} else if (this.osBrowser==2 || this.osBrowser==6 || this.osBrowser==8) {
					return '<div id="'+this.settings.pgeId+'_down" class="'+this.settings.pgeInstallClass+'" style="text-align:center;line-height:25px;"><a href="'+this.settings.pgePath+this.pgeditFFExe+'">'+this.pgeDownText+'</a></div>';
				} else {
					return '<div id="'+this.settings.pgeId+'_down" class="'+this.settings.pgeInstallClass+'" style="text-align:center;">暂不支持此浏览器</div>';
				}			
			},
			//清空密码
			pwdClear : function() {
				if (isInstalled) {
					try{
						var control = document.getElementById(this.settings.pgeId);
						control.ClearSeCtrl();
	                }catch(err){}
				}
			},
			//检测控件是否已安装
			checkInstall : function(s,callf) {
				try {
					if (this.osBrowser == 1 || this.osBrowser == 3) {
						var comActiveX = new ActiveXObject("PassGuardL.PassGuard.1");
						return true;
					} else if (this.osBrowser==2 || this.osBrowser==6 || this.osBrowser==8) {
						var arr = new Array(),pge_version;
						var pge_info=navigator.plugins['PassGuardX_L'].description;
						if(pge_info.indexOf(":")>0){
							arr = pge_info.split(":");
							pge_version = arr[1];
							if (pge_version != "") return true;
						}else{
							pge_version = "";
							return false;
						}
					}
				}catch(err){return false;}
			},
			//将控件版本号转换成整形值，用于比较
			getConvertVersion:function(version) {
				try {
					if(version==undefined || version==""){
						return 0;
					}else{
						var flag = false,m = "";
						if(this.osBrowser == 1 || this.osBrowser == 3){
							if(version.indexOf(",")> -1) flag = true;
						}
						if(flag) m = version.split(",");
						else m=version.split(".");
						var v=parseInt(m[0]*1000)+parseInt(m[1]*100)+parseInt(m[2]*10)+parseInt(m[3]);
						return v;
					}
				}catch(err){return 0;}			
			},
			//获得当前时间毫秒，主要用于防止缓存
			pwdGetTime : function() {
				return new Date().getTime();
			},
			//通过id获取页面元素
			pwdGetEById : function(id) {
				return document.getElementById(id);
			},
			//设置提示文字
			setDownText:function(){
				if(this.pgeVersion!=undefined && this.pgeVersion!=""){
						this.pgeDownText="请点此升级控件";
				}
			},
			//初始化密码框属性
			pgInitialize:function(){
				if(isInstalled){
					if(this.osBrowser==1 || this.osBrowser==3){ 
			            jQuery('#'+this.settings.pgeId).show();
					}
					
				}else{
					jQuery('#'+this.settings.pgeId+'_pge').hide();	
					if(this.osBrowser==1 || this.osBrowser==3){
						jQuery('#'+this.settings.pgeId+'_down').show();
					}	
				}
			}
		}
	});
})(jQuery);
