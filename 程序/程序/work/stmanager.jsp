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
<form name="zgform" action="stmanager.jsp" method="post" onsubmit="javascript:return check();">
<table width="778" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#9EC3F2" style="font-size:12px">
  <!--DWLayoutTable-->
  <tr>
    <td height="25" colspan="6" align="left" valign="middle" background="img/bg_titlebarr.gif"><span class="STYLE1">[<a href="addst.jsp">����ѧ��</a>]&nbsp;&nbsp;ѧ����Ϣ����&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>ѧ�������ţ�
      <input name="svalue" type="text" size="15" />
      &nbsp;
      <input type="submit" name="Submit" value="����" /></td>
  </tr>
  <tr>
    <td width="123" align="center" valign="middle" bgcolor="#F9FCFF">�������</td>
    <td width="128" height="25" align="center" valign="middle" bgcolor="#F9FCFF">ѧ������</td>
      <td width="122" align="center" valign="middle" bgcolor="#F9FCFF">���֤��</td>
      <td width="156" align="center" valign="middle" bgcolor="#F9FCFF" class="STYLE4">�绰</td>
	<td width="120" align="center" valign="middle" bgcolor="#F9FCFF" class="STYLE4">��ַ</td>
    <td width="122" align="center" valign="middle" bgcolor="#F9FCFF"><span class="STYLE4">����</span></td>
  </tr>
  <%
  stxxop stop=new stxxop();
  String op=DateFormate.toGb((String)request.getParameter("op"));
  String svalue=DateFormate.toGb((String)request.getParameter("svalue"));
  ArrayList al=new ArrayList();
  if("search".equals(op)){
	  al=stop.getStxxbybh1(svalue); 
  }else{
	al=stop.getStxxall();
	}
  stxx st=new stxx();
  for(int i=0;i<al.size();i++){
	  st=(stxx)al.get(i);
	  
  %>
  <tr>
    <td align="center" valign="middle" bgcolor="#F9FCFF"><span class="STYLE4"><%=st.getS_stu_dabh() %></span></td>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF"><span class="STYLE4"><%=st.getS_stu_xm() %></span></td>
    <td align="center" valign="middle" bgcolor="#F9FCFF"><span class="STYLE4"><%=st.getS_stu_sfz() %></span></td>
    <td align="center" valign="middle" bgcolor="#F9FCFF" class="STYLE4"> <span class="STYLE4"><%=st.getS_stu_dhhm() %></span></td>
	<td align="center" valign="middle" bgcolor="#F9FCFF" class="STYLE4"> <span class="STYLE4"><%=st.getS_stu_jtdz() %></span></td>
    <td align="center" valign="middle" bgcolor="#F9FCFF"><span class="STYLE4"><a href="dispst.jsp?sid=<%=st.getS_stu_dabh()%>">�鿴</a>/<a href="modst.jsp?sid=<%=st.getS_stu_dabh()%>">�޸�</a>/<a href="stop.jsp?op=del&sid=<%=st.getS_stu_dabh()%>">ɾ��</a></span></td>
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
