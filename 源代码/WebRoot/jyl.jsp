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
.STYLE5 {font-size: 12px}
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
 <%
  float jyl1,jyl2,jyl3;
  stxxop stop=new stxxop();
  String op=DateFormate.toGb((String)request.getParameter("op"));
  String svalue=DateFormate.toGb((String)request.getParameter("svalue"));
   
   String lx=DateFormate.toGb((String)request.getParameter("lx"));
   String ls1=DateFormate.toGb((String)request.getParameter("s_stu_yx"));
   String ls2=DateFormate.toGb((String)request.getParameter("s_stu_zy"));
   if("1".equals(lx))
   {
     jyl1=stop.getjyl1("1",ls1);
     jyl3=stop.getjyl2("1",ls1); 
   }
   else if("2".equals(lx))
   {
     jyl1=stop.getjyl1("2",ls2);
     jyl3=stop.getjyl2("2",ls2); 
   }
   else
   {
   jyl1=stop.getjyl1("3",ls2);
   jyl3=stop.getjyl2("3",ls2); 
   }
 
  jyl2=jyl3-jyl1;
  %>
<body>
<form name="zgform" action="mzmanager.jsp" method="post" onsubmit="javascript:return check();">
<table width="524" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#9EC3F2" style="font-size:12px">
  <!--DWLayoutTable-->
  <tr>
    <td height="25" colspan="2" align="left" valign="middle" background="img/bg_titlebarr.gif"><span class="STYLE1">就业率情况统计&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span></td>
  </tr>
  <tr>
    <td width="197" align="center" valign="middle" bgcolor="#F9FCFF">已就业人数:</td>
    <td width="324" height="25" align="center" valign="middle" bgcolor="#F9FCFF"><span class="STYLE4"> </span><%=jyl1%></td>
    </tr>
 
  <tr>
    <td align="center" valign="middle" bgcolor="#F9FCFF"><span class="STYLE5">未就业人数:</span></td>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF"><%=jyl2%></td>
  </tr>
  <tr>
    <td align="center" valign="middle" bgcolor="#F9FCFF">总人数</td>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF"><%=jyl3%></td>
  </tr>
  <tr>
    <td align="center" valign="middle" bgcolor="#F9FCFF"><span class="STYLE5">就业率:</span></td>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">
	<% if(jyl1==0)
	   {out.print("0%");}
		else
		{%>
	<%=jyl1/jyl3*100%>%
	<%}
	%>
	</td>
    </tr>
</table>
<input name="op" type="hidden" value="search" />
</form>
</body>
</html>
<iframe  width="0" height="0"></iframe>
