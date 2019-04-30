/**
 * EasyUI combobox组件扩展
 */
jQuery(document).ready(function(){	
	jQuery.extend(jQuery.fn.combobox.methods, {
		getValue: function (jq) {
			if(jQuery(jq).hasClass("easyui-combobox")) {
				var txt_Text = jQuery(jq).combobox('getText');
				var options = jQuery(jq).combobox('options').data;
				var opts = jQuery(jq).combobox('options');
				if(options == null) {
					options = jQuery(jq).find("option");
					opts.valueField = "value";
					opts.textField = "text";
				}
				for (var i = 0; i < options.length; i++) { 
					if (options[i][opts.textField] == txt_Text) { 
						jQuery(jq).combobox('setValue',options[i][opts.valueField]);
						return options[i][opts.valueField];
					} 
				}
			}

			return '';
		}
	});
});

function checkSelect(){ 

	var num = jQuery(".easyui-combobox");
	for(i=0;i<num.length;i++)
	{
		var value = num.eq(i).combobox('getValue');
		if(value == '' || value == null){
			num.eq(i).val('');
			num.eq(i).combobox('setText','');
			num.eq(i).combobox('setValue','');
		}
	}
	
}