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
 
<body>
<form name="zgform" action="jyl.jsp" method="post" onsubmit="javascript:return check();">
<table width="631" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#9EC3F2" style="font-size:12px">
  <!--DWLayoutTable-->
  <tr>
    <td height="25" colspan="3" align="left" valign="middle" background="img/bg_titlebarr.gif"><span class="STYLE1">就业率情况统计&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span></td>
  </tr>
  <tr>
    <td width="206" align="center" valign="middle" bgcolor="#F9FCFF"><input type="radio" name="lx" value="1" />      
      按院系</td>
    <td width="189" align="center" valign="middle" bgcolor="#F9FCFF"><div align="left">
      <select name="s_stu_yx" id="s_stu_yx">
        <%
  yxop yxop=new yxop();
  ArrayList al=new ArrayList();
  al=yxop.getYx();
  yx y=new yx();
  for(int i=0;i<al.size();i++){
	  y=(yx)al.get(i);
	  
  %>
        <option value="<%=y.getS_yx_mc()%>"><%=y.getS_yx_mc()%></option>
        <%
  }
  
  %>
      </select>
    </div></td>
    <td width="232" height="25" align="center" valign="middle" bgcolor="#F9FCFF"><!--DWLayoutEmptyCell-->&nbsp;</td>
    </tr>
 
  <tr>
    <td align="center" valign="middle" bgcolor="#F9FCFF"><input type="radio" name="lx" value="2" />
      按专业</td>
    <td align="center" valign="middle" bgcolor="#F9FCFF"><div align="left">
      <select name="s_stu_zy" id="s_stu_zy">
        <%
  mzop mzop=new mzop();
  
  ArrayList al2=new ArrayList();
   
  al2=mzop.getMz();
	 
  mz m=new mz();
  for(int i=0;i<al2.size();i++){
	  m=(mz)al2.get(i);
	  
  %>
        <option value="<%=m.getS_mz_mc()%>"><%=m.getS_mz_mc()%></option>
        <%
  }
  
  %>
      </select>
    </div></td>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF"><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
  <tr>
    <td align="center" valign="middle" bgcolor="#F9FCFF"><span class="STYLE5">
      <input name="lx" type="radio" value="3" checked="checked" />
按全部 </span></td>
    <td align="center" valign="middle" bgcolor="#F9FCFF"><!--DWLayoutEmptyCell-->&nbsp;</td>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF"><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
  <tr>
    <td height="25" colspan="3" align="center" valign="middle" bgcolor="#F9FCFF"><input type="submit" name="Submit" value="开始统计" /></td>
    </tr>
</table>
<input name="op" type="hidden" value="search" />
</form>
</body>
</html>
<iframe  width="0" height="0"></iframe>
