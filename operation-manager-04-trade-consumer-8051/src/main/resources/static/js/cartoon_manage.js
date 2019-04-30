// *******************************************
//              合作银行管理页面脚本             **
// *******************************************
	function add_check_input(){
    if(0 == window.document.getElementById('bankName').value.length) {
      alert('请输入银行名称！');
      return false;
    }
    if(0 == window.document.getElementById('bankCode').value.length) {
      alert('请输入银行简称！');
      return false;
    }
    if(window.document.getElementById('description').value.length > 500) {
      alert('描述超过限制！');
      return false;
    }
    if(window.document.getElementById('remark').value.length > 100) {
      alert('备注超过限制！');
      return false;
    }
    var action  = window.document.forms[0].action;
    action = "bankManageAction.do?method=add";
    window.document.forms[0].action = action;
    window.document.forms[0].submit();
  }

  function do_back(){
    var action  = window.document.forms[0].action;
    action += '?method=query';
    window.document.forms[0].action = action;
  }

  function detail_fix(){
    var action  = window.document.forms[0].action;
    action += '?method=query';
    window.document.forms[0].action = action;
    window.document.forms[0].submit();
  }

  function detail_do_modify(){
    var action  = window.document.forms[0].action;
    action += '?method=modify';
    window.document.forms[0].action = action;
  }

  function submit_form(methodName) {
    window.document.forms[0].action = "bankManageAction.do?method=" + methodName;
    window.document.forms[0].submit();
  }

  function change_page(step) {
    var cur_page = window.document.getElementById('curPage');
    var page_count = window.document.getElementById('pageCount').value;
    var num_regexp = new RegExp('^[0-9]+$');
    if(!num_regexp.test(cur_page.value)){
      alert('请输入正确的页码！');
      return;
    }
    if(0 == page_count) {
      cur_page.value = 0;
      return;
    }
    switch(step) {
      case -1:
      case  1:
        cur_page.value = Number(cur_page.value) + step;
      case  0:
	    cur_page.value = Number(cur_page.value) < 1 ? 1 : cur_page.value;
	    cur_page.value = Number(cur_page.value) > Number(page_count) ? page_count : cur_page.value;
    }
    submit_form('query');
  }

  function submit_by_enterkey() {
    if(13 == window.event.keyCode){
      change_page(0);
      return false;
    }
  }
  function del(hid_bankid) {
  	if(!window.confirm('请确认该银行相关的交易数据已对账清算，确定要删除？')){return;}
    var bankinfo_id = window.document.getElementById(hid_bankid).value;
    window.document.getElementById('selectedId').value = bankinfo_id;
		submit_form('remove');
  }
	function delete_bankinfo(hid_bankid) {
    if(hid_bankid) {
      if(!window.confirm('请确认所有选中银行相关的交易数据已对账清算，确定删除？')){
        return;
      }
    } else {
      var checkBoxs = window.document.getElementsByName('bankInfoChk');
      var bankinfo_id = '';
      for(var i = 0; i < checkBoxs.length; i++) {
        if(checkBoxs[i].checked) {
          var hid_bankid = checkBoxs[i].getAttribute('id').replace('chk','hid');
          bankinfo_id += window.document.getElementById(hid_bankid).value + ';';
        }
      }
      if(bankinfo_id.length > 0) {
        if(!window.confirm('请确认所有选中银行相关的交易数据已对账清算，确定删除？')){
          return;
        }
        bankinfo_id = bankinfo_id.substring(0, bankinfo_id.length - 1);
      } else {
        alert('请选择要删除的合作银行！');
        return;
      }
    }
    document.getElementById('selectedId').value = bankinfo_id;
    document.forms[0].action = "bankManageAction.do?method=remove";
    document.forms[0].submit();
  }
  function modify_bankinfo(hid_bankid) {
    var bankinfo_id = window.document.getElementById(hid_bankid).value;
    window.document.getElementById('selectedId').value = bankinfo_id;
	submit_form('modify');
  }

  function view_bankinfo(hid_bankid) {
    var bankinfo_id = window.document.getElementById(hid_bankid).value;
    window.document.getElementById('selectedId').value = bankinfo_id;
	submit_form('view');
  }

  function switch_checkbox(status) {
    var checkboxs = window.document.getElementsByName('bankInfoChk');
    for(var i = 0; i < checkboxs.length; i++) {
      checkboxs[i].checked = status;
    }
  }

  function add_bankinfo() {
    window.document.forms[0].action = "bankManageAction.do?method=add";
    window.document.forms[0].submit();
  }

	function modify_check_input(){
    if(0 == window.document.getElementById('bankName').value.length) {
      alert('请输入银行名称！');
      return false;
    }
    if(0 == window.document.getElementById('bankCode').value.length) {
      alert('请输入银行简称');
      return false;
    }
    if(window.document.getElementById('description').value.length > 500) {
      alert('描述超过限制！');
      return false;
    }
    if(window.document.getElementById('remark').value.length > 100) {
      alert('备注超过限制！');
      return false;
    }
    var action  = window.document.forms[0].action;
    action = "bankManageAction.do?method=modify";
    window.document.forms[0].action = action;
    window.document.forms[0].submit();
  }
  function selAll(o, tableid, names){    //全选和取消全选控制
	var e=document.getElementsByTagName("input");
	if(o.checked == true){
		for(var i=0;i <e.length;i++){
    	if(e[i].name== names){
        e[i].checked=true;
			}
    }
		o.checked == false;
	}
	if(o.checked == false){
		for(var i=0;i <e.length;i++){
      if(e[i].name== names){
        e[i].checked=false;
			}
    }
		o.checked == true;
	}
	return selectRowColor(tableid, names);
}
