		jQuery.noConflict();

		jQuery(document).ready(function() {
			j_select_setup();
		});

		function j_select_setup(scope){
			var j_scope = "select:visible";
			var j_new_id = "jQuery_auto_create_select_id";
			if (null != scope){
				j_scope = "#" + scope + " > " + j_scope;
				j_new_id = "jQuery_auto_create_select_id" + scope;
			}
			jQuery(j_scope).each(function(i) {
				if (null == this.id || "" == this.id){
					jQuery(this).attr("id",j_new_id+i);
				}
				id = this.id;
				jquery_val_w = jQuery(this).width();
				jquery_val_p = jQuery(this).offset();
				jQuery(this).hide();
				jquery_val_t = j_ct(jquery_val_w,id);
				jquery_val_img = j_ci(jquery_val_w,id);

				jQuery(this).after(jquery_val_img);
				jQuery(jquery_val_img).before(jquery_val_t);
				jQuery(jquery_val_img).click(function(n){
					jQuery(this).prev().click();

				});
				if (!this.disabled){
					jQuery(jquery_val_t).click(function(){
						id = this.selId;
						jquery_val_dp = jQuery(this).offset();
						jquery_val_divLeft = jquery_val_dp.left;
						jquery_val_divTop = jquery_val_dp.top + jQuery(this).height();
						if (!$(id + "_j_div")){
							jquery_val_param = {left:jquery_val_divLeft,top:jquery_val_divTop,width:this.parentWidth,selId:id,row:$(id).row};
							var jquery_val_divNode = j_createDiv(jquery_val_param);
							jQuery("body").append(jquery_val_divNode);
						}
						if ("none" == jQuery("#" + this.selId + "_j_div").css("display")){
							jQuery("#"+this.selId + "_j_div").slideDown("fast",j_findRow(this.selId));
						}else{
							jQuery("#"+this.selId + "_j_div").hide();
						}
					});
				}else{
					jQuery(jquery_val_t).css("color","darkgray");
					jQuery(jquery_val_t).css("background-color","whitesmoke");
					jQuery(jquery_val_t).css("cursor","normal");
					jQuery(jquery_val_t).css("border","1px solid gainsboro");
					jQuery(jquery_val_t).css("border-right-style","none");
					jQuery(jquery_val_t).hover(
						function(){
							jQuery(this).css("border","1px solid gainsboro");
							jQuery(this).css("border-right-style","none");
						},
						function(){
							jQuery(this).css("border","1px solid gainsboro");
							jQuery(this).css("border-right-style","none");
						}
					);
				}

			});
			jQuery(document).click(function(){
				var divs = jQuery("div").filter(".jQuery_select_div");
				jQuery(divs).each(function(){
					jQuery(this).hide();
				});
			});
		}

		function j_clear_and_refresh(){

			var divs = jQuery("div").filter(".jQuery_select_div");
			jQuery(divs).each(function(){
				document.body.removeChild(this);
			});
			var txts = jQuery(":text").filter(".jQuery_select_text");
			jQuery(txts).each(function(){
				id = this.selId;
				var text_temp = "";
				try{
					text_temp = $(id).options[$(id).selectedIndex].text;
				}catch(e){

				}
				this.value = text_temp;
			});
			j_select_setup();
		}

		function j_reset_in_scope(scope){
			var s = ":text";
			if (null != scope){
				s = "#" + scope + " > " + s;
			}
			var txts = jQuery(s).filter(".jQuery_select_text");
			jQuery(txts).each(function(){
				id = this.selId;
				jQuery(this).remove();
				jQuery($(id+"_j_img")).remove();
				if ($(id+"_j_div")){
					jQuery($(id+"_j_div")).remove();
				}
				$(id).style.display="block";
			});
			j_select_setup(scope);
		}

		function j_change_by_id(id){
			jQuery("#"+id+"_j_text").attr("value",jQuery("#"+id).val());
		}

		function j_findRow(id){
			var showText = jQuery("#"+id+"_j_text").val();
			jQuery("#"+id+"_j_div > table").each(function(){
				txt = jQuery(this).find("td").text();
				jQuery(this).css("background","");
				if (showText == txt){
					jQuery(this).css("background","whitesmoke");
				}
			});
		}

			function j_ct(w,id){
				var jquery_val_t = document.createElement("input");
				jquery_val_t.parentWidth = w;
				jQuery(jquery_val_t).attr("id",id+"_j_text");
				jQuery(jquery_val_t).attr("selId",id);
				jQuery(jquery_val_t).attr("type","text");
				jQuery(jquery_val_t).attr("value",jQuery("#"+id+" > option:selected").text());
				jQuery(jquery_val_t).attr("readonly","true");
				jQuery(jquery_val_t).css("width",w - 15);
				jQuery(jquery_val_t).addClass("jQuery_select_text");
				jQuery(jquery_val_t).hover(
					function(){
						jQuery(this).css("border","1px solid lightsteelblue");
						jQuery(this).css("border-right-style","none");
					},
					function(){
						jQuery(this).css("border","1px solid #87add0");
						jQuery(this).css("border-right-style","none");
					}
				);
				return jquery_val_t;
			}

			function j_ci(jquery_val_w,id){
					var jquery_val_i = document.createElement("img");
					jQuery(jquery_val_i).attr({src:"../images/sel.gif"});
					jQuery(jquery_val_i).attr("height","20");
					jQuery(jquery_val_i).attr("id",id+"_j_img");
					jQuery(jquery_val_i).attr("selId",id);
					jQuery(jquery_val_i).css("cursor","pointer");
					jQuery(jquery_val_i).css("verticalAlign","bottom");
					jQuery(jquery_val_i).css("margin-bottom","1px");
					jQuery(jquery_val_i).addClass("jQuery_select_img");
					jQuery(jquery_val_i).mousedown(function(){jQuery(this).fadeTo("fast",0.5)});
					jQuery(jquery_val_i).mouseup(function(){jQuery(this).fadeTo("fast",1)});
					jQuery(jquery_val_i).hover(
						function(){
							jQuery(this).fadeTo("fast",0.7);
						},
						function(){
							jQuery(this).fadeTo("fast",1);
						}
					);

					return jquery_val_i;
			}

			function j_createDiv(param){
				var left = param.left;
				var top = param.top;
				var width = param.width;
				var selId = param.selId;
				var row = param.row == null ? 11 : param.row;
				var d = document.createElement('div');
				jQuery(d).css("width",width + 4);
				jQuery(d).css("border-top-style","none");
				jQuery(d).addClass("jQuery_select_div");
				jQuery(d).css("left",left);
				jQuery(d).css("top",top + 4);
				if (jQuery("#"+selId+" > option").length > row){
					jQuery(d).css("overflow-y","auto");
					jQuery(d).css("height",25 * row);
				}
				//if (jQuery("#"+selId+" > option").length > 0){
				jQuery("#"+selId+" > option").each(function(i){
						value = this.value;
						text = this.text;
						a = ca({value:value,text:text,id:selId,width:width,row:i});
						jQuery(d).append(a);
				});
				//}

				jQuery(d).hide();
				jQuery(d).attr("id",selId+"_j_div");
				return d;
			}

			function ca(pam){
					var id = pam.id;

					var tbl = jQuery("<table></table>");
					var trNode = jQuery("<tr></tr>");
					var td = jQuery("<td></td>");

					jQuery(tbl).css("width","100%");
					jQuery(tbl).css("cursor","pointer");
					jQuery(tbl).css("table-layout","fixed");
					jQuery(tbl).css("font-size","12px");

					jQuery(tbl).attr("cellSpacing","0");
					jQuery(tbl).hover(function(){jQuery(td).css("background","gainsboro")},function(){jQuery(td).css("background","")});

					jQuery(td).attr("value",pam.value);
					jQuery(td).attr("innerHTML",pam.text);
					jQuery(td).css("padding","2");
					jQuery(td).css("height","20");
					jQuery(td).css("overflow","hidden");
					if (pam.text.length * 12 > pam.width){
						jQuery(td).attr("title",pam.text);
					}
					jQuery(td).css("white-space","nowrap");
					jQuery(td).click(function(){
						jQuery("#"+id+"_j_div").hide();
						jQuery("#"+id)[0].selectedIndex = pam.row;
						jQuery("#"+id+"_j_text").attr("value",pam.text);
						jQuery("#"+id).change();
					});

					td.appendTo(trNode);
					trNode.appendTo(tbl);

					return tbl;
			}