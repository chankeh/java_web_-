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
		if(confirm("�����Ҫɾ��ѡ��ļ�¼��")){
				document.location.href="jsop.jsp?op=del&id="+id;
		}	
	}
	function check(){
		if(document.zgform.svalue.value==""){
			alert("�������ѯ����");
			return false;
		}
	}
	
</script>
</head>

<body>
<form name="zgform" action="tumanager.jsp" method="post" onsubmit="javascript:return check();">
<table width="729" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#9EC3F2" style="font-size:12px">
  <!--DWLayoutTable-->
  <tr>
    <td height="25" colspan="4" align="left" valign="middle" background="img/bg_titlebarr.gif"><span class="STYLE1">[<a href="addtu.jsp">������ʦ</a>]&nbsp;&nbsp;��ʦ��Ϣ����&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>��ʦ��ţ�
      <input name="svalue" type="text" size="15" />
      &nbsp;
      <input type="submit" name="Submit" value="����" /></td>
  </tr>
  <tr>
    <td width="194" align="center" valign="middle" bgcolor="#F9FCFF">��ʦ���</td>
    <td width="214" height="25" align="center" valign="middle" bgcolor="#F9FCFF">����</td>
    <td width="194" align="center" valign="middle" bgcolor="#F9FCFF">ԺУ</td>
    <td width="122" align="center" valign="middle" bgcolor="#F9FCFF"><span class="STYLE4">����</span></td>
  </tr>
  <%
  tuxxop stop=new tuxxop();
  String op=DateFormate.toGb((String)request.getParameter("op"));
  String svalue=DateFormate.toGb((String)request.getParameter("svalue"));
  ArrayList al=new ArrayList();
  if("search".equals(op)){
	  al=stop.getTuxxbh1(svalue); 
  }else{
	al=stop.getTuxxall();
	}
  tuxx st=new tuxx();
  for(int i=0;i<al.size();i++){
	  st=(tuxx)al.get(i);
	  
  %>
  <tr>
    <td align="center" valign="middle" bgcolor="#F9FCFF"><span class="STYLE4"><%=st.getS_tu_bh() %></span></td>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF"><span class="STYLE4"><%=st.getS_tu_name() %></span></td>
    <td align="center" valign="middle" bgcolor="#F9FCFF"><span class="STYLE4"><%=st.getS_tu_yx() %></span></td>
    <td align="center" valign="middle" bgcolor="#F9FCFF"><span class="STYLE4"><a href="disptu.jsp?sid=<%=st.getS_tu_bh()%>">�鿴</a>/<a href="modtu.jsp?sid=<%=st.getS_tu_bh()%>">�޸�</a>/<a href="tuop.jsp?op=del&sid=<%=st.getS_tu_bh()%>">ɾ��</a></span></td>
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
