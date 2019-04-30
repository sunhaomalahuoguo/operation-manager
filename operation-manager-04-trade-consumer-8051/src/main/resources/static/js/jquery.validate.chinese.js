
$().ready(function() {
        // �ַ���֤
        $.validator.addMethod("stringCheck", function(value, element) {
            return this.optional(element) || chkChar(value);///^[\u0391-\uFFE5\w]+$/.test(value);
        }, "���������к��зǷ��ַ�<,\",%,>,~,&,?,',����������!");
    
     // �ֻ�������֤
		$.validator.addMethod("isMobile", function(value,
				element) {
			var length = value.length;
			var mobile = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;
			return this.optional(element)
					|| (length == 11 && mobile.test(value));
		}, "����ȷ��д�����ֻ�����");
		
		// �绰������֤
		$.validator.addMethod("isTel",
				function(value, element) {
					var tel = /^\d{3,4}-?\d{7,8}$/; // �绰�����ʽ010-12345678
					return this.optional(element)
							|| (tel.test(value));
				}, "����ȷ��д���ĵ绰����,�绰�����ʽ010-12345678");
		$.validator.addMethod("isIdentify",
				function(value, element) {
					var tel = /(^\d{15}$)|(^\d{17}(\d|X)$)/; //���֤����У��
					return this.optional(element)
							|| (tel.test(value));
				}, "����ȷ��д���֤,���֤����Ϊ15λ����18λ");
		$.validator.addMethod("Fund",
				function(value, element) {
					if (parseFloat(value) <= 0){
						return false;
					}
					var tel = /^[+]?(([1-9]\d*[.]?)|(0.))(\d{0,2})?$/; // �������
					return this.optional(element)
							|| (tel.test(value));
				}, "�������������С��λ���ܳ���2λ!");
		$.validator.addMethod("icCardId",
				function(value, element) {
					var tel = /^(\d{1,14})?$/; // ���ܿ�
					return this.optional(element)
							|| (tel.test(value));
				}, "���ܿ����ܴ���14λ�ұ���������!");
		$.validator.addMethod("isBankacount",
				function(value, element) {
					var tel = /^(\d{1,20})?$/; // ���ܿ�
					return this.optional(element)
							|| (tel.test(value));
				}, "�����˻����ܴ���20λ�ұ���������!");
		// ��ϵ�绰(�ֻ�/�绰�Կ�)��֤
		$.validator
				.addMethod(
						"isMobileOrTel",
						function(value, element) {
							var length = value.length;
							var mobile = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;
							var tel = /^\d{3,4}-\d{7,8}$/;
							var tel2 = /^\d{7,8}$/;
							return this.optional(element)
									|| (tel.test(value)
											|| mobile.test(value) || tel2
											.test(value));

						}, "����ȷ��д������ϵ�绰");
		//�ж��Ƿ�Ϊ����
		 $.validator.addMethod("isFloat", function(value, element) {
	            return this.optional(element) || isFloat(value,2);///^[\u0391-\uFFE5\w]+$/.test(value);
	        }, "����ȷ��д��ֵ,ע��������С������!");
		 //�����ж�
			var isMail = function(value, element) {
				var email = value;
				var mess = "";

				var emailTest= /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
				if(!emailTest.test(email)){ 
					mess="��������Ч������!(���磺sumapay@126.com)";
				} 

				if (mess == "") {
					return this.optional(element) || true;
				} else {
					return this.optional(element) || false;
				}
			};
			$.validator.addMethod("isEmail", isMail,
					"��������Ч������!(���磺sumapay@126.com)");

			// ����������֤
			$.validator.addMethod("isZipCode", function(value,
					element) {
				var tel = /^[0-9]{6}$/;
				return this.optional(element) || (tel.test(value));
			}, "����ȷ��д������������");
    });


//��С����ֵ,С�����nλ
function isFloat(value,n) {
    var RefString = "0123456789.";
    if (value.length == 0) {
        return (false);
    }
    var countDot=0;
    var dotBackCount=0;
    var zeroFirst=false;
    for (Count = 0; Count < value.length; Count++) {
        TempChar = value.substring(Count, Count + 1);
        // �����ڣ�0--9 or С���㣩ʱ���ش�
        if (RefString.indexOf(TempChar, 0) == -1) {
            return (false);
        }else{
        	//С���㿪ͷ����Ϊ��
        	if(Count==0 && TempChar=="."){
        		return (false);
        	}
        	//��һλ���֣�0 �ڶ�λ���ֲ�ΪС����ʱ����Ϊ��
        	if(Count==1 && zeroFirst==true && TempChar!="."){return false;}
        	if(Count==0 && TempChar=="0"){zeroFirst=true;}
        	if(TempChar=="."){
        		countDot++;
        		if(countDot>=2){
        			return (false);
        		}
        	}else{
	        	if(countDot>0){
	        		dotBackCount++;
	        		if(dotBackCount>n){
	        			return (false);
	        		}
	        	}
        	}
        }
    }
    return (true);
}
//��������еķǷ��ַ�
function chkChar(InString) {
    var RefString = "<";
    var RefString2 = "%";
    var RefString3 = "\"";
    var RefString4 = ">";
    var RefString5 = "~";
    var RefString6 = "&";
    var RefString7 = "?";
    var RefString8 = "'";
     //alert("InString:"+InString);
    for (Count = 0; Count < InString.length; Count++) {
        TempChar = InString.substring(Count, Count + 1);
      	//alert("tempchar:"+TempChar)
        if ((RefString.indexOf(TempChar, 0) == 0) || (RefString2.indexOf(TempChar, 0) == 0) || (RefString3.indexOf(TempChar, 0) == 0) || (RefString4.indexOf(TempChar, 0) == 0) || (RefString5.indexOf(TempChar, 0) == 0) || (RefString6.indexOf(TempChar, 0) == 0) || (RefString7.indexOf(TempChar, 0) == 0) || (RefString8.indexOf(TempChar, 0) == 0)) {
      	      //alert("���������к��зǷ��ַ�"<",""","%",">","~","&","?","'",����������!");
            return (false);
        }
    }
    return (true);
}

$.extend($.validator.messages, {
    required: "��ѡ�ֶ�",
remote: "���������ֶ�",
email: "��������ȷ��ʽ�ĵ����ʼ�",
ul: "������Ϸ�����ַ",
date: "������Ϸ�������",
dateISO: "������Ϸ������� (ISO).",
number: "������Ϸ�������",
digits: "ֻ����������",
creditcard: "������Ϸ������ÿ���",
equalTo: "���ٴ�������ͬ��ֵ",
accept: "������ӵ�кϷ���׺�����ַ���",
maxlength: $.validator.format("������һ�� ��������� {0} ���ַ���"),
minlength: $.validator.format("������һ�� ���������� {0} ���ַ���"),
rangelength: $.validator.format("������ һ�����Ƚ��� {0} �� {1} ֮����ַ���"),
range: $.validator.format("������һ������ {0} �� {1} ֮���ֵ"),
max: $.validator.format("������һ�����Ϊ{0} ��ֵ"),
min: $.validator.format("������һ����СΪ{0} ��ֵ")
});

