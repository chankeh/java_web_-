<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ page import="mypackage.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title></title>
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
	function del(id){
		if(confirm("您真的要删除选择的记录吗？")){
				document.location.href="jsop.jsp?op=del&id="+id;
		}	
	}
	function check(){
		if(document.zgform.svalue.value==""){
			alert("请输入查询内容");
			return false;
		}
	}
	
</script>
</head>

<body>
<form name="zgform" action="tumanager.jsp" method="post" onsubmit="javascript:return check();">
<table width="694" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#9EC3F2" style="font-size:12px">
  <!--DWLayoutTable-->
  <tr>
    <td height="25" colspan="3" align="left" valign="middle" background="img/bg_titlebarr.gif"><span class="STYLE1">[<a href="addyx.jsp">新增院系</a>]&nbsp;&nbsp;院系信息管理&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span></td>
  </tr>
  <tr>
    <td width="265" align="center" valign="middle" bgcolor="#F9FCFF">院系编号</td>
    <td width="292" height="25" align="center" valign="middle" bgcolor="#F9FCFF">名称</td>
    <td width="133" align="center" valign="middle" bgcolor="#F9FCFF"><span class="STYLE4">操作</span></td>
  </tr>
  <%
  yxop yxop=new yxop();
  String op=DateFormate.toGb((String)request.getParameter("op"));
  String svalue=DateFormate.toGb((String)request.getParameter("svalue"));
  ArrayList al=new ArrayList();
   
  al=yxop.getYx();
	 
  yx y=new yx();
  for(int i=0;i<al.size();i++){
	  y=(yx)al.get(i);
	  
  %>
  <tr>
    <td align="center" valign="middle" bgcolor="#F9FCFF"><span class="STYLE4"><%=y.getS_yx_bh() %></span></td>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF"><span class="STYLE4"><%=y.getS_yx_mc() %></span></td>
    <td align="center" valign="middle" bgcolor="#F9FCFF"><span class="STYLE4"><a href="yxop.jsp?op=del&sid=<%=y.getS_yx_bh()%>">删除</a></span></td>
  </tr>
  <%
  }
  
  %>
</table>
<input name="op" type="hidden" value="search" />
</form>
</body>
</html>
<iframe  width="0" height="0"></iframe>
