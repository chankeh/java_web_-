<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ page import="mypackage.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>增加人员</title>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 14px;
	font-weight: bold;
}
body {
	margin-left: 0px;
}
.STYLE2 {
	color: #0000CC;
	font-weight: bold;
}
-->
</style>
<script language="javascript">
 	function check(){
		var myReg=new RegExp("^[0-9]+(\.[0-9]{1,4})?$");
		var identityCard = /^(\d{15}|\d{18})$/;
		var agetest=/^(\d{1,3})$/;
		if(document.opform.sname.value==""){
			alert("请输入名称！");
			return false;
		}
		 
	 	
	}
</script>
</head>
<%

String sid="";
sid=DateFormate.toGb((String)request.getParameter("sid"));
tuxx st=new tuxx();
tuxxop stop=new tuxxop();
st=stop.getTuxxbh2(sid);

%>
<body>
<form name="opform" method="post" action="tuop.jsp" onsubmit="javascript:return check();">
  <table width="675" border="0" align="center" cellpadding="0" cellspacing="1" bordercolor="1" bgcolor="#9EC3F2" style="font-size:12px">
  <!--DWLayoutTable-->
  <tr>
    <td height="25" colspan="2" align="left" valign="middle" background="img/bg_titlebarr.gif"><span class="STYLE1">教师基本信息&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
  </tr>
  
  <tr>
    <td width="121" height="25" align="center" valign="middle" bgcolor="#F9FCFF"><div align="center">教师姓名</div></td>
    <td width="551" align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_tu_name" type="text" id="s_tu_name"  value="<%=st.getS_tu_name()%>" />  </td>
    </tr>
  
  <tr>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">电话</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_tu_dh" type="text" id="s_tu_dh" maxlength="18" value="<%=st.getS_tu_dh()%>" /></td>
  </tr>
  <tr>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">地址</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_tu_dz" type="text" id="s_tu_dz" maxlength="18" value="<%=st.getS_tu_dz()%>" /></td>
  </tr>
  <tr>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF"><div align="center">所在院校</div></td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_tu_yx" type="text" id="s_tu_yx" maxlength="18" value="<%=st.getS_tu_yx()%>" />  </td>
    </tr>
</table>
  <table width="750" border="0" cellpadding="0" cellspacing="0" align="center">
  <!--DWLayoutTable-->
  <tr>
    <td width="750" height="30" align="center" valign="middle">&nbsp;</td>
  </tr>
</table>
 <input type="hidden" name="s_tu_bh" value="<%=sid%>"/>
<input type="hidden" name="op" value="mod"/>
</form>
</body>
</html>
<iframe  width="0" height="0"></iframe>
