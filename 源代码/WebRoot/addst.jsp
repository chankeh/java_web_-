<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ page import="mypackage.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>������Ա</title>
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
			alert("���������ƣ�");
			return false;
		}
		 
	 	
	}
</script>
</head>

<body>
<form name="opform" method="post" action="stop.jsp" onsubmit="javascript:return check();">
  <table width="675" border="0" align="center" cellpadding="0" cellspacing="1" bordercolor="1" bgcolor="#9EC3F2" style="font-size:12px">
  <!--DWLayoutTable-->
  <tr>
    <td height="25" colspan="4" align="left" valign="middle" background="img/bg_titlebarr.gif"><span class="STYLE1">ѧ��������Ϣ&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
  </tr>
  
  <tr>
    <td width="126" height="25" align="center" valign="middle" bgcolor="#F9FCFF">����</td>
    <td width="248" align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_xm" type="text" id="s_stu_xm" /></td>
    <td width="72" align="left" valign="middle" bgcolor="#F9FCFF">���֤��</td>
    <td width="224" align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_sfz" type="text" id="s_stu_sfz" /></td>
  </tr>
  
  <tr>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">�绰</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_dhhm" type="text" id="s_stu_dhhm" maxlength="18" /></td>
    <td align="left" valign="middle" bgcolor="#F9FCFF">��ͥ��ַ</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_jtdz" type="text" id="s_stu_jtdz" /></td>
  </tr>
  <tr>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">����ʱ��</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_dasj" type="text" id="s_stu_dasj" /></td>
    <td align="left" valign="middle" bgcolor="#F9FCFF">������ַ</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_dadz" type="text" id="s_stu_dadz" /></td>
  </tr>
  <tr>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">ѧ��</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_xl" type="text" id="s_stu_xl" /></td>
    <td align="left" valign="middle" bgcolor="#F9FCFF">��ҵ��λ</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_jl" type="text" id="s_stu_jl" /></td>
  </tr>
  <tr>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">��λ����</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_cf" type="text" id="s_stu_cf" /></td>
    <td align="left" valign="middle" bgcolor="#F9FCFF">Ժϵ</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><select name="s_stu_yx" id="s_stu_yx">
	
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
	  
	  
	  
    </select>    </td>
  </tr>
  <tr>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">����</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><select name="s_stu_mz" id="s_stu_mz">
      <option value="����" selected="selected">����</option>
      <option value="������������">������������</option>
      <option value="���">���</option>
      </select>      </td>
    <td align="left" valign="middle" bgcolor="#F9FCFF">רҵ</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><select name="s_stu_zy" id="s_stu_zy">
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
    </select></td>
  </tr>
  <tr>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">�ͷ�</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_fq" type="radio" value="1" checked="checked" />
      ��
        <input type="radio" name="s_stu_fq" value="0" />
        ��</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF">����</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_jq" type="radio" value="1" checked="checked" />
��
  <input type="radio" name="s_stu_jq" value="0" />
��</td>
  </tr>
  <tr>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">�����ҵ���ǼǱ�</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_dj" type="radio" value="1" checked="checked" />
��
  <input type="radio" name="s_stu_dj" value="0" />
��</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF">��ѧ����</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_cl" type="radio" value="1" checked="checked" />
��
  <input type="radio" name="s_stu_cl" value="0" />
��</td>
  </tr>
  <tr>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">��ҵ���ǼǱ�</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_djb" type="radio" value="1" checked="checked" />
��
  <input type="radio" name="s_stu_djb" value="0" />
��</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF">����</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_tjb" type="radio" value="1" checked="checked" />
��
  <input type="radio" name="s_stu_tjb" value="0" />
��</td>
  </tr>
  <tr>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">�ɼ���</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_cjb" type="radio" value="1" checked="checked" />
��
  <input type="radio" name="s_stu_cjb" value="0" />
��</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF">ѧλ�����</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_xwb" type="radio" value="1" checked="checked" />
��
  <input type="radio" name="s_stu_xwb" value="0" />
��</td>
  </tr>
  <tr>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">�뵳����</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_rdb" type="radio" value="1" checked="checked" />
��
  <input type="radio" name="s_stu_rdb" value="0" />
��</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF">������ò</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><select name="s_stu_mmb" id="s_stu_mmb">
      <option value="��Ա" selected="selected">��Ա</option>
      <option value="��Ա">��Ա</option>
      <option value="Ⱥ��">Ⱥ��</option>
      <option value="����">����</option>
            </select></td>
  </tr>
  <tr>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">������ʽ</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><select name="s_stu_ffb" id="s_stu_ffb">
      <option value="����" selected="selected">����</option>
      <option value="�Ƕ���">�Ƕ���</option>
      <option value="����">����</option>
    </select></td>
    <td align="left" valign="middle" bgcolor="#F9FCFF">�춯���</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><select name="s_stu_ydb" id="s_stu_ydb">
      <option value="תѧ">תѧ</option>
      <option value="��ѧ" selected="selected">��ѧ</option>
      <option value="�ӳ�ѧ��">�ӳ�ѧ��</option>
      <option value="����">����</option>
      <option value="��ѧ">��ѧ</option>
                </select></td>
  </tr>
  
  <tr>
    <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">�Ƿ��ҵ</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_jy" type="radio" value="1" checked="checked" />
      ��ҵ
      <input type="radio" name="s_stu_jy" value="0" />
      ��ҵ </td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><!--DWLayoutEmptyCell-->&nbsp;</td>
    <td align="left" valign="middle" bgcolor="#F9FCFF"><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
</table>
  <table width="750" border="0" cellpadding="0" cellspacing="0" align="center">
  <!--DWLayoutTable-->
  <tr>
    <td width="750" height="30" align="center" valign="middle">
      <input type="submit" name="Submit" value="����" />      &nbsp;</td>
  </tr>
</table>
 
<input type="hidden" name="op" value="add"/>
</form>
</body>
</html>
<iframe  width="0" height="0"></iframe>
