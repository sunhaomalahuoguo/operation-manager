jQuery.noConflict();
UN_AUTO_FIT = false;
//页面初始化操作
jQuery(document).ready(function() {
	if (UN_AUTO_FIT){

	}else{
		var h = window.screen.height;
		var cellpadding = 1;
		if (h == 768){
			cellpadding = 1;
		}else if (h == 1024){
			cellpadding = 3;
		}
		jQuery(".showTable").each(function(){
			jQuery(this).attr("cellPadding",cellpadding);
		});
	}

	//标签栏生成
	if (jQuery(".tabStyle").length == 0){
		return;
	}
	var tab1 = jQuery(".tabStyle").get(0);
	var left = parseInt(jQuery(tab1).css("margin-left").replace("px",""));
	var oldUrl;
	var normalUrl = jQuery(tab1).css("background-image").replace("_mouseon","").replace("_focus","");
	var mouseonUrl = normalUrl.replace("tab.gif","tab_mouseon.gif");
	var focusUrl = normalUrl.replace("tab.gif","tab_focus.gif");

	jQuery(".tabStyle").each(function(i){

		jQuery(this).css("margin-left",left + i * 100);
		jQuery(this).css("zIndex",i);

		if (i == 0){
			jQuery(this).css("background-image",focusUrl);
			jQuery(this).css("color","#FFF");
			jQuery(this).css("zIndex",5);
		}
		if (jQuery(this).attr("initShow") == 1){
			jQuery(tab1).css("background-image",normalUrl);
			jQuery(tab1).css("color","#000");
			jQuery(tab1).css("zIndex",0);
			jQuery(this).css("background-image",focusUrl);
			jQuery(this).css("color","#FFF");
			jQuery(this).css("zIndex",5);
		}



		jQuery(this).hover(
			function(){
				oldUrl = jQuery(this).css("background-image");
				if (jQuery(this).css("background-image").indexOf("tab.gif") != -1){
					jQuery(this).css("background-image",mouseonUrl);
				}
			},
			function(){
				jQuery(this).css("background-image",oldUrl);
			}
		);
		jQuery(this).click(function(){
			makeFocus(this);
		});
	});
});

function makeFocus(o){
	var tab1 = jQuery(".tabStyle").get(0);
	var normalUrl = jQuery(tab1).css("background-image").replace("_mouseon","").replace("_focus","");
	var mouseonUrl = normalUrl.replace("tab.gif","tab_mouseon.gif");
	var focusUrl = normalUrl.replace("tab.gif","tab_focus.gif");

	jQuery(".tabStyle").each(function(j){
		jQuery(this).css("background-image",normalUrl);
		jQuery(this).css("color","#000");
		jQuery(this).css("zIndex",j);
		jQuery(this).hover(
			function(){
				jQuery(this).css("background-image",mouseonUrl);
			},
			function(){
				jQuery(this).css("background-image",normalUrl);
			}
		);
	});
	jQuery(o).css("background-image",focusUrl);
	jQuery(o).css("color","#FFF");
	jQuery(o).css("zIndex",5);
	jQuery(o).hover(
		function(){
			jQuery(o).css("background-image",focusUrl);
		},
		function(){
			jQuery(o).css("background-image",focusUrl);
		}
	);


}
