<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ page import="mypackage.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>办公自动化之事务督办系统</title>
<style type="text/css">
<!--
.STYLE1 {font-size: 12px}
.STYLE2 {
	font-size: 14px;
	font-weight: bold;
}
-->
</style>
<script language="javascript">
	function changeColor(){
		document.getElementById("no1").style.background="#F9FCFF";
		document.getElementById("no2").style.background="#F9FCFF";
		document.getElementById("no3").style.background="#F9FCFF";
	}
	function changeFrame(filename){
		parent.mainFrame.location.href=filename;
	}
</script>
</head>

<body leftmargin="0" topmargin="0" bgcolor="#F7F7F7">
<table width="200" border="0" cellpadding="0" cellspacing="0" style="border-right:1px solid #9EC3F2">
  <!--DWLayoutTable-->
  <tr>
    <td height="13" colspan="3" valign="top"><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
  <tr>
    <td width="11" height="104">&nbsp;</td>
    <td width="175" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#9EC3F2" style="font-size:12px">
      <!--DWLayoutTable-->
      
      
      <tr>
        <td width="173" height="25" align="center" valign="middle" background="img/bg_titlebarr.gif" bgcolor="#F9FCFF" class="STYLE1" id="no3" style="cursor:hand;"  onmousedown="javascript:changeColor();this.style.background='#FFFFFF'"><span class="STYLE2"><img src="img/info.gif" width="16" height="16" />教师模块</span></td>
      </tr>
      
      <tr>
        <td id="no3" height="25" align="center" valign="middle" bgcolor="#F9FCFF" class="STYLE1" onmousedown="javascript:changeColor();this.style.background='#FFFFFF'" onclick="javascript:changeFrame('stfind.jsp');" style="cursor:hand;">学生信息查询</td>
      </tr>
      <tr>
        <td id="no3" height="25" align="center" valign="middle" bgcolor="#F9FCFF" class="STYLE1" onmousedown="javascript:changeColor();this.style.background='#FFFFFF'" onclick="javascript:changeFrame('jyltj.jsp');" style="cursor:hand;">就业情况统计</td>
      </tr>
      

    </table></td>
    <td width="13">&nbsp;</td>
  </tr>
  <tr>
    <td height="483">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
</body>
</html>
<iframe  width="0" height="0"></iframe>
