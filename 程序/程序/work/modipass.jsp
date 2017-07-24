<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ page import="mypackage.*,java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>修改密码</title>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 14px;
	font-weight: bold;
}
.STYLE4 {font-size: 14px}
-->
</style>
<script language="javascript">
function checkform(){
	var f=document.opform;
	if(f.old.value==""){
		alert("请输入原密码");
		return false;
	}else if(f.newp.value==""){
		alert("请输入新密码");
		return false;
	}else if(f.newp.value!=f.re.value){
		alert("两输入密码不一样，请重新输入");
		return false;
	}
}
</script>
</head>

<body>
<form name="opform" action="zgop.jsp" method="post" onsubmit="javascript:return checkform();">
<table width="456" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#9EC3F2">
  <!--DWLayoutTable-->
  <tr>
    <td height="25" colspan="2" align="left" valign="middle" background="img/bg_titlebarr.gif"><span class="STYLE1">&nbsp;修改密码</span></td>
    </tr>
  <tr>
    <td width="145" height="25" align="center" valign="middle" bgcolor="#F9FCFF" class="STYLE4">原密码</td>
    <td width="308" align="left" valign="middle" bgcolor="#F9FCFF"><input name="old" type="password" id="old" value="" /></td>
    </tr>
  <tr>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF" class="STYLE4">新密码</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="newp" type="password" id="newp" /></td>
    </tr>
  <tr>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF" class="STYLE4"><p>再次输入</p></td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="re" type="password" id="re" /></td>
    </tr>
</table>
<br>
<center><input type="submit" name="Submit" value="确认修改" />
&nbsp;
   
</center>
<input type="hidden" name="op" value="modipass"/>
</form>
</body>
</html>
<iframe  width="0" height="0"></iframe>
