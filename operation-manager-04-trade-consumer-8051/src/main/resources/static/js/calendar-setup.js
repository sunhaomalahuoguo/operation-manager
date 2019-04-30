/*  Copyright Mihai Bazon, 2002, 2003  |  http://dynarch.com/mishoo/
 * ---------------------------------------------------------------------------
 *
 * The DHTML Calendar
 *
 * Details and latest version at:
 * http://dynarch.com/mishoo/calendar.epl
 *
 * This script is distributed under the GNU Lesser General Public License.
 * Read the entire license text here: http://www.gnu.org/licenses/lgpl.html
 *
 * This file defines helper functions for setting up the calendar.  They are
 * intended to help non-programmers get a working calendar on their site
 * quickly.  This script should not be seen as part of the calendar.  It just
 * shows you what one can do with the calendar, while in the same time
 * providing a quick and simple method for setting it up.  If you need
 * exhaustive customization of the calendar creation process feel free to
 * modify this code to suit your needs (this is recommended and much better
 * than modifying calendar.js itself).
 */

Calendar.setup = function (params) {
	function param_default(pname, def) { if (typeof params[pname] == "undefined") { params[pname] = def; } };

	param_default("inputField",     null);
	param_default("button",         null);
	param_default("eventName",      null);
	param_default("ifFormat",       "%Y/%m/%d");
	document.getElementById(params.inputField).readOnly=true;
	document.getElementById(params.inputField).style.cursor="pointer";
	var tmp = ["inputField","button"];
	for (var i in tmp) {
		if (typeof params[tmp[i]] == "string") {
			params[tmp[i]] = document.getElementById(params[tmp[i]]);
		}
	}
	if (!(params.flat || params.multiple || params.inputField || params.displayArea || params.button)) {
		alert("日期生成失败，请检查");
		return false;
	}

	function onSelect(cal) {

		var p = cal.params;
		p.inputField.value = cal.date.print(p.ifFormat);

		if (cal.dateClicked)
			cal.callCloseHandler();

	};

	var triggerEl = params.button;

	triggerEl["on" + params.eventName] = function() {
		var dateEl = params.inputField;
		var dateFmt = params.ifFormat;
		var cal = window.calendar;
		if (dateEl)
			params.date = Date.parseDate(dateEl.value, dateFmt);

		window.calendar = cal = new Calendar(params.firstDay,
						     params.date,
						     params.onSelect || onSelect,
						     params.onClose || function(cal) { cal.hide(); });

		cal.params = params;

		cal.setDateFormat(dateFmt);
		cal.create();
		cal.refresh();
		cal.showAtElement(params.button || params.displayArea || params.inputField, params.align);
	};

};
	function dateLoad(s){
		for (var i = 0; i < s.length;i++) {
			Calendar.setup(
			{
		      inputField  : s[i],   // 需要输入日期的文本框ID
		      ifFormat    : "%Y/%m/%d",    // 日期的格式
		      button      : s[i],   // 触发日历的控件ID
		      eventName : "click"		   // 触发日历的事件
		    }
		  );
		}
	};
