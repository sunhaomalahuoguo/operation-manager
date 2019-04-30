
// 最大长度
var _pkb_max_length = null;
// 关闭事件
var _pkb_close_event = null;

var letter_status = 0;
// --------------------
// viewObj : 字符输入显示容器,要求使用DIV
// boardLeft ： 字符键盘的left
// boardTop ： 字符键盘的top
// maxLength : 最大长度
var lowletter = ["letter","q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"];
var capletter = ["LETTER","Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Z","X","C","V","B","N","M"];
function AllKeyBoard(url,viewObj1, boardLeft, boardTop, maxLength) {
	this.left = 0;
	this.top = 0;
	this.focusMove = null;

	
	
	image_path = url + "/allkb/";
	// 检查参数
	// viewObj
	if(viewObj1 && viewObj1.tagName!='DIV'){
		return false;
	};
	// 设置最大长度、默认值6
	if(maxLength) {
		this.maxLen = maxLength;
	} else {
		this.maxLen = 30;
	};
	_pkb_max_length = this.maxLen;
	// 设置显示位置（left）
	if(boardLeft) {
		this.left = boardLeft;
	}
	 // 设置显示位置（top）
	if(boardTop) {
		this.top = boardTop;
	};

	// 定义关闭后的处理
	this.setCloseEvent = function(closeEvent){
		_pkb_close_event = closeEvent;
	};

	this.isVisible = function(){
		return $('allkbdiv').style.display == 'block';
	};

	// 打开字符键盘
	this.open = function() {
		// 服务端请求字符图片
		var kbdiv = $('allkbdiv');
		kbdiv.style.display = 'block';
		//不加px 在firefox上位置会不正确
		kbdiv.style.left = this.left+'px';
		kbdiv.style.top = this.top+'px';

		var fc = new SimulateFocusControl(1,null,this.skbAfterFocusMove,this.click,null,null,this.back);
		document.onkeydown = function(e){
			return fc.move(e);
		};
		this.focusMove = fc;
		fc.numInput = function numInput(num){
			var content = viewObj1.innerText;
			var idx = content.indexOf('|');
			var left = content.substr(0,idx);
	    	var right = content.substr(idx+1);
			content = left + num + "|" + right;
			viewObj1.innerText = content;
		};
		this.initData();
	};

	this.initData = function () {
		var fc = this.focusMove;
		fc.add($('letter_1'));
		fc.add($('letter_2'));
		fc.add($('letter_3'));
		fc.add($('letter_4'));
		fc.add($('letter_5'));
		fc.add($('letter_6'));
		fc.add($('letter_7'));
		fc.add($('letter_8'));
		fc.add($('letter_9'));
		fc.add($('letter_10'));
		fc.add($('letter_11'));			//10
		fc.add($('letter_12'));			//11
	    fc.add($('letter_13'));		    //12
	    fc.add($('letter_14'));
	    fc.add($('letter_15'));
	    fc.add($('letter_16'));
	    fc.add($('letter_17'));
	    fc.add($('letter_18'));
	    fc.add($('letter_19'));
	    fc.add($('com'));
	    fc.add($('letter_20'));
	    fc.add($('letter_21'));
	    fc.add($('letter_22'));
	    fc.add($('letter_23'));
	    fc.add($('letter_24'));
	    fc.add($('letter_25'));
	    fc.add($('letter_26'));
	    fc.add($('del'));
	    fc.add($('net'));
	    fc.add($('cn'));
	    fc.add($('at'));
	    fc.add($('L_line'));
	    fc.add($('line'));
	    fc.add($('dot'));
	    fc.add($('ok'));
	    fc.add($('tab'));

		var r = fc.focusObjects;
		
		for(var i = 0 ; i < 10 ; i++){
			r[i].up =r[i];
			//r[i].right = r[i+1];
			i == 9 ? r[i].down = r[18] : r[i].down = r[i+10];
			i == 0 ? r[i].left = r[0] : r[i].left = r[i-1];
		}
		for(var i = 10 ; i < 19 ; i++){
			r[i].up = r[i-10];
			r[i].down = r[i+9];
		}
		for(var i = 19 ; i < 28 ; i++){
			r[i].up = r[i-9];
			i ==27 ? r[i].down = r[35] : r[i].down = r[i+9]; 
		}
		for(var i = 28 ; i < 36 ; i++){
			r[i].up = r[i-9];
			r[i].down = r[i];
			i == 0 ? r[i].left = r[0] : r[i].left = r[i-1];
		}
		
		// 默认选中关闭按钮
		fc.currentFocus = fc.focusObjects[fc.focusObjects.length-2];
	};

	// 点击键盘按键
	this.click = function (curFocus){
		var curObj = curFocus.object;
	  	if(curObj.id.substr(0,7)=='letter_') {
	  		var letter = $(curObj.id).innerHTML;
	  		if(letter.length <_pkb_max_length){
	  			var content = viewObj1.innerText;
	  			var idx = content.indexOf('|');
				var left = content.substr(0,idx);
		    	var right = content.substr(idx + 1);
		    	content = left + letter + "|" + right; 
	  			viewObj1.innerText = content;
			}
			if(b.length ==(_pkb_max_length-1)){
				//焦点自动移动到关闭按钮
				this.select(this.get("ok"));
			}
	  	} else if(curObj.id == 'com'){
	  		var content = viewObj1.innerText;
  			var idx = content.indexOf('|');
			var left = content.substr(0,idx);
	    	var right = content.substr(idx + 1);
	    	content = left + ".com" + "|" + right; 
  			viewObj1.innerText = content;
	  		
	  	}else if(curObj.id == 'del'){
	  		var content = viewObj1.innerText;
  			var idx = content.indexOf('|');
			var left = content.substr(0,idx-1);
	    	var right = content.substr(idx + 1);
	    	content = left + "|" + right; 
  			viewObj1.innerText = content;
	  	}else if(curObj.id == 'net'){
	  		var content = viewObj1.innerText;
  			var idx = content.indexOf('|');
			var left = content.substr(0,idx);
	    	var right = content.substr(idx + 1);
	    	content = left + ".net" + "|" + right; 
  			viewObj1.innerText = content;
	  	}else if(curObj.id == 'cn'){
	  		var content = viewObj1.innerText;
  			var idx = content.indexOf('|');
			var left = content.substr(0,idx);
	    	var right = content.substr(idx + 1);
	    	content = left + ".cn" + "|" + right; 
  			viewObj1.innerText = content;
	  	}else if(curObj.id == 'at'){
	  		var content = viewObj1.innerText;
  			var idx = content.indexOf('|');
			var left = content.substr(0,idx);
	    	var right = content.substr(idx + 1);
	    	content = left + "at" + "|" + right; 
  			viewObj1.innerText = content;
	  	}else if(curObj.id == 'L_line'){
	  		var content = viewObj1.innerText;
  			var idx = content.indexOf('|');
			var left = content.substr(0,idx);
	    	var right = content.substr(idx + 1);
	    	content = left + "_" + "|" + right; 
  			viewObj1.innerText = content;
	  	}else if(curObj.id == 'line'){
	  		var content = viewObj1.innerText;
  			var idx = content.indexOf('|');
			var left = content.substr(0,idx);
	    	var right = content.substr(idx + 1);
	    	content = left + "-" + "|" + right; 
  			viewObj1.innerText = content;
	  	}else if(curObj.id == 'dot'){
	  		var content = viewObj1.innerText;
  			var idx = content.indexOf('|');
			var left = content.substr(0,idx);
	    	var right = content.substr(idx + 1);
	    	content = left + "." + "|" + right; 
  			viewObj1.innerText = content;
	  	}else if(curObj.id == 'tab'){
	  		if(letter_status == 0){
	  			for(var i = 1 ; i < 27 ; i++){
	  				$("letter_"+i).innerHTML = capletter[i];
	  			}
	  			letter_status = 1;
	  			return;
	  		}else if(letter_status == 1){
	  			for(var i = 1 ; i < 27 ; i++){
	  				$("letter_"+i).innerHTML = lowletter[i];
	  			}
	  			letter_status = 0;
	  			return;
	  		}
	  	}else if(curObj.id == 'ok') {
	      	// 关闭
	      	$('allkbdiv').style.display = 'none';
			if(_pkb_close_event)
				_pkb_close_event();
	  	}
 	};

 	
	// 焦点移动，修改页面显示
  	this.skbAfterFocusMove = function (oldFocus, curFocus){
		if(oldFocus && oldFocus.object) {
			if(oldFocus.object.id.substr(0,7) == "letter_"){
				oldFocus.object.style.backgroundImage = "url('"+image_path + "letter_normal.png')";
				$(oldFocus.object.id).style.backgroundImage ="url('"+ image_path + "letter_normal.png')";
			}else {
				oldFocus.object.style.backgroundImage ="url('"+ image_path + oldFocus.object.id + "_normal.png')";
				var str = "url('"+image_path + oldFocus.object.id + "_normal.png')";
				$(oldFocus.object.id).style.backgroundImage = str;
			}
		}
		if(curFocus && curFocus.object) {
			if(curFocus.object.id.substr(0,7) == "letter_"){
				curFocus.object.style.backgroundImage = "url('"+image_path + "letter_focus.png')";
				$(curFocus.object.id).style.backgroundImage ="url('"+ image_path + "letter_focus.png')";
			}else {
				curFocus.object.style.backgroundImage ="url('"+ image_path + curFocus.object.id + "_focus.png')";
				var str ="url('"+ image_path + curFocus.object.id + "_focus.png')";
				$(curFocus.object.id).style.backgroundImage = str;
			}
		}
	};
	
	this.numInput = function (num){
		viewObj1.innerHTML = viewObj1.innerHTML + num;
	};
	
	
}