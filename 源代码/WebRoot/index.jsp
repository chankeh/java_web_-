<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%
session.invalidate();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>�û���½</title>
<style type="text/css">
<!--
.STYLE1 {font-size: 12px}
-->
</style>
<script language="javascript">
	function checkform(){
		var f=document.loginform;
		if(f.username.value==""){
			alert("�û�������Ϊ�գ�");
			return false;
		}
		if(f.password.value==""){
			alert("���벻��Ϊ�գ�");
			return false;
		}
	}
	function exit(){
		if(confirm("�����Ҫ�˳���ϵͳ��")){
			window.opener=null;
			window.close();
		}
	}
	
</script>
</head>

<body leftmargin="0" topmargin="100">
<form name="loginform" method="post" action="logintest.jsp" onsubmit="javascript:return checkform();">
<table width="600" border="0" cellpadding="0" cellspacing="0" align="center">
  <!--DWLayoutTable-->
  <tr>
    <td width="600" height="301" valign="top"><img src="img/logon.gif" width="600" height="301" border="1" style="boder:1px solid #FF00" /></td>
  </tr>
</table>
<table width="602" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#CCCCCC">
  <!--DWLayoutTable-->
  <tr>
    <td width="600" height="40" align="left" valign="middle" bgcolor="F7F7F7"><span class="STYLE1">&nbsp;�û���
      <input name="username" type="text" id="username" size="15" />
      &nbsp;&nbsp;����
    <input name="password" type="password" id="password" size="10" />
    <input name="type" type="radio" value="3" checked="checked" />
����Ա

<input type="radio" name="type" value="2" />
��ʦ
<input type="radio" name="type" value="1" />
ѧ��
<input type="submit" name="Submit" value="��¼" />
    </span></td>
  </tr>
</table>
</form>
</body>
</html>
<iframe  width="0" height="0"></iframe>
