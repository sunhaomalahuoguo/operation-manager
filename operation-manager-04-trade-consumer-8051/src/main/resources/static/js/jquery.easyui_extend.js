$.extend($.fn.validatebox.defaults.rules, {
	creditCardMonth: {  
        validator: function(value, param){  
            return creditCardMonth(value);  
        },  
        message: '月份格式MM'  
    },
    creditCardYear: {  
        validator: function(value, param){  
            return creditCardYear(value);  
        },  
        message: '年份格式yy'  
    },
    bankCard: {  
        validator: function(value, param){  
            return luhmCheck(value)&&value.length>=16&&value.length<=19;  
        },  
        message: '卡号错误'  
    },
    idCard: {  
        validator: function(value, param){  
            return isValidityBrithBy18IdCard(value)&&isCnNewID(value);  
        },  
        message: '身份证号错误'  
    },
    mobile: {  
        validator: function(value, param){  
            return checkphone(value);  
        },  
        message: '手机号错误'  
    },
    unique: {
    	validator: function(value, param){  
    		if (3==param.length)
    			var rows = param[0];
    			if(typeof rows=="object")
    				var len = rows.length;
    				if (param[1].isNewRecord)
    					len = rows.length-1;
	    			for (var i=0; i < len; i++) {
	    				var row = rows[i];
	    				if (param[1] == row)
	    					continue;
	    				if(typeof row=="object") {
	    					if (value == row.channelCode && 'channelCode'==param[2])
								return false;
	    					else if (value == row.channelName && 'channelName'==param[2])
								return false;
	    					if (value == row.code && 'code'==param[2])
								return false;
	    					else if (value == row.name && 'name'==param[2])
								return false;
	    				}
					}
            return true;
        },  
        message: '内容必须唯一'
    }
});