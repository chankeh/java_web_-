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
sid=(String)session.getAttribute("s_username");
stxx st=new stxx();
stxxop stop=new stxxop();
st=stop.getStxxbybh2(sid);

%>
<body>
<form name="opform" method="post" action="stop.jsp" onsubmit="javascript:return check();">
  <table width="675" border="0" align="center" cellpadding="0" cellspacing="1" bordercolor="1" bgcolor="#9EC3F2" style="font-size:12px">
    <!--DWLayoutTable-->
    <tr>
      <td height="25" colspan="4" align="left" valign="middle" background="img/bg_titlebarr.gif"><span class="STYLE1">学生基本信息&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
    </tr>
    <tr>
      <td width="126" height="25" align="center" valign="middle" bgcolor="#F9FCFF">姓名</td>
      <td width="248" align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_xm" type="text" id="s_stu_xm" value="<%=st.getS_stu_xm()%>" /></td>
      <td width="72" align="left" valign="middle" bgcolor="#F9FCFF">身份证号</td>
      <td width="224" align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_sfz" type="text" id="s_stu_sfz"   value="<%=st.getS_stu_sfz()%>" /></td>
    </tr>
    <tr>
      <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">电话</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_dhhm" type="text" id="s_stu_dhhm" maxlength="18" value="<%=st.getS_stu_dhhm()%>" /></td>
      <td align="left" valign="middle" bgcolor="#F9FCFF">家庭地址</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_jtdz" type="text" id="s_stu_jtdz"  value="<%=st.getS_stu_jtdz()%>" /></td>
    </tr>
    <tr>
      <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">档案时间</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_dasj" type="text" id="s_stu_dasj" value="<%=st.getS_stu_dasj()%>" /></td>
      <td align="left" valign="middle" bgcolor="#F9FCFF">档案地址</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_dadz" type="text" id="s_stu_dadz"  value="<%=st.getS_stu_dadz()%>" /></td>
    </tr>
    <tr>
      <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">学历</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_xl" type="text" id="s_stu_xl" value="<%=st.getS_stu_xl()%>" /></td>
      <td align="left" valign="middle" bgcolor="#F9FCFF">就业单位</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_jl" type="text" id="s_stu_jl" value="<%=st.getS_stu_jl()%>" /></td>
    </tr>
    <tr>
      <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">单位性质</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><input name="s_stu_cf" type="text" id="s_stu_cf" value="<%=st.getS_stu_cf()%>" /></td>
      <td align="left" valign="middle" bgcolor="#F9FCFF">院系</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><select name="s_stu_yx" id="s_stu_yx">
          <%
  yxop yxop=new yxop();
  ArrayList al=new ArrayList();
  al=yxop.getYx();
  yx y=new yx();
  for(int i=0;i<al.size();i++){
	  y=(yx)al.get(i);
	  
  if(y.getS_yx_mc().equals(st.getS_stu_yx()))
  {%>
          <option value="<%=y.getS_yx_mc()%>" selected="selected"><%=y.getS_yx_mc()%></option>
          <%
}
else
{
%>
          <option value="<%=y.getS_yx_mc()%>"><%=y.getS_yx_mc()%></option>
          <%
  }
  
  }
  %>
      </select></td>
    </tr>
    <tr>
      <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">民族</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><select name="s_stu_mz" id="s_stu_mz">
          <% if("汉族".equals(st.getS_stu_mz()))
	{%>
          <option value="汉族" selected="selected">汉族</option>
          <option value="其他少数民族">其他少数民族</option>
          <option value="外国">外国</option>
          <%}%>
          <% if("其他少数民族".equals(st.getS_stu_mz()))
	{%>
          <option value="汉族" >汉族</option>
          <option value="其他少数民族" selected="selected">其他少数民族</option>
          <option value="外国">外国</option>
          <%}%>
          <% if("外国".equals(st.getS_stu_mz()))
	{%>
          <option value="汉族" >汉族</option>
          <option value="其他少数民族">其他少数民族</option>
          <option value="外国" selected="selected">外国</option>
          <%}%>
      </select></td>
      <td align="left" valign="middle" bgcolor="#F9FCFF">专业</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><select name="s_stu_zy" id="s_stu_zy">
          <%
  mzop mzop=new mzop();
  
  ArrayList al2=new ArrayList();
   
  al2=mzop.getMz();
	 
  mz m=new mz();
  for(int i=0;i<al2.size();i++){
	  m=(mz)al2.get(i);
 if(m.getS_mz_mc().equals(st.getS_stu_zy()))
  {%>
          <option value="<%=m.getS_mz_mc()%>" selected="selected"><%=m.getS_mz_mc()%></option>
          <%
}
else
{
%>
          <option value="<%=m.getS_mz_mc()%>"><%=m.getS_mz_mc()%></option>
          <%
  }
  
  }
  %>
      </select></td>
    </tr>
    <tr>
      <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">惩罚</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><%
	
	if("1".equals(st.getS_stu_fq()))
	{
	%>
          <input name="s_stu_fq" type="radio" value="1" checked="checked" />
        有
        <input type="radio" name="s_stu_fq" value="0" />
        无
        <%
	}
	else
	{
	%>
        <input type="radio" name="s_stu_fq" value="1" />
        有
        <input type="radio" name="s_stu_fq" value="0" checked="checked" />
        无
        <%
	}
	%></td>
      <td align="left" valign="middle" bgcolor="#F9FCFF">奖励</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><%
	
	if("1".equals(st.getS_stu_jq()))
	{
	%>
          <input name="s_stu_jq" type="radio" value="1" checked="checked" />
        有
        <input type="radio" name="s_stu_jq" value="0" />
        无
        <%
	}
	else
	{
	%>
        <input type="radio" name="s_stu_jq" value="1" />
        有
        <input type="radio" name="s_stu_jq" value="0" checked="checked" />
        无
        <%
	}
	%></td>
    </tr>
    <tr>
      <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">优秀毕业生登记表</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><%
	
	if("1".equals(st.getS_stu_dj()))
	{
	%>
          <input name="s_stu_fq" type="radio" value="1" checked="checked" />
        有
        <input type="radio" name="s_stu_dj" value="0" />
        无
        <%
	}
	else
	{
	%>
        <input type="radio" name="s_stu_dj" value="1" />
        有
        <input type="radio" name="s_stu_dj" value="0" checked="checked" />
        无
        <%
	}
	%></td>
      <td align="left" valign="middle" bgcolor="#F9FCFF">中学材料</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><%
	
	if("1".equals(st.getS_stu_cl()))
	{
	%>
          <input name="s_stu_cl" type="radio" value="1" checked="checked" />
        有
        <input type="radio" name="s_stu_cl" value="0" />
        无
        <%
	}
	else
	{
	%>
        <input type="radio" name="s_stu_cl" value="1" />
        有
        <input type="radio" name="s_stu_cl" value="0" checked="checked" />
        无
        <%
	}
	%></td>
    </tr>
    <tr>
      <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">毕业生登记表</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><%
	
	if("1".equals(st.getS_stu_djb()))
	{
	%>
          <input name="s_stu_fq" type="radio" value="1" checked="checked" />
        有
        <input type="radio" name="s_stu_djb" value="0" />
        无
        <%
	}
	else
	{
	%>
        <input type="radio" name="s_stu_djb" value="1" />
        有
        <input type="radio" name="s_stu_djb" value="0" checked="checked" />
        无
        <%
	}
	%></td>
      <td align="left" valign="middle" bgcolor="#F9FCFF">体检表</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><%
	
	if("1".equals(st.getS_stu_tjb()))
	{
	%>
          <input name="s_stu_tjb" type="radio" value="1" checked="checked" />
        有
        <input type="radio" name="s_stu_tjb" value="0" />
        无
        <%
	}
	else
	{
	%>
        <input type="radio" name="s_stu_tjb" value="1" />
        有
        <input type="radio" name="s_stu_tjb" value="0" checked="checked" />
        无
        <%
	}
	%></td>
    </tr>
    <tr>
      <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">成绩单</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><%
	
	if("1".equals(st.getS_stu_cjb()))
	{
	%>
          <input name="s_stu_cjb" type="radio" value="1" checked="checked" />
        有
        <input type="radio" name="s_stu_cjb" value="0" />
        无
        <%
	}
	else
	{
	%>
        <input type="radio" name="s_stu_cjb" value="1" />
        有
        <input type="radio" name="s_stu_cjb" value="0" checked="checked" />
        无
        <%
	}
	%></td>
      <td align="left" valign="middle" bgcolor="#F9FCFF">学位申请表</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><%
	
	if("1".equals(st.getS_stu_xwb()))
	{
	%>
          <input name="s_stu_xwb" type="radio" value="1" checked="checked" />
        有
        <input type="radio" name="s_stu_xwb" value="0" />
        无
        <%
	}
	else
	{
	%>
        <input type="radio" name="s_stu_xwb" value="1" />
        有
        <input type="radio" name="s_stu_xwb" value="0" checked="checked" />
        无
        <%
	}
	%></td>
    </tr>
    <tr>
      <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">入党材料</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><%
	
	if("1".equals(st.getS_stu_rdb()))
	{
	%>
          <input name="s_stu_rdb" type="radio" value="1" checked="checked" />
        有
        <input type="radio" name="s_stu_rdb" value="0" />
        无
        <%
	}
	else
	{
	%>
        <input type="radio" name="s_stu_rdb" value="1" />
        有
        <input type="radio" name="s_stu_rdb" value="0" checked="checked" />
        无
        <%
	}
	%></td>
      <td align="left" valign="middle" bgcolor="#F9FCFF">政治面貌</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><select name="s_stu_mmb" id="s_stu_mmb">
          <% if("党员".equals(st.getS_stu_mmb()))
	{%>
          <option value="党员" selected="selected">党员</option>
          <option value="团员">团员</option>
          <option value="群众">群众</option>
          <option value="其他">其他</option>
          <%}%>
          <% if("团员".equals(st.getS_stu_mmb()))
	{%>
          <option value="党员" >党员</option>
          <option value="团员" selected="selected">团员</option>
          <option value="群众">群众</option>
          <option value="其他">其他</option>
          <%}%>
          <% if("群众".equals(st.getS_stu_mmb()))
	{%>
          <option value="党员" >党员</option>
          <option value="团员">团员</option>
          <option value="群众" selected="selected">群众</option>
          <option value="其他">其他</option>
          <%}%>
          <% if("其他".equals(st.getS_stu_mmb()))
	{%>
          <option value="党员" >党员</option>
          <option value="团员">团员</option>
          <option value="群众">群众</option>
          <option value="其他" selected="selected">其他</option>
          <%}%>
      </select></td>
    </tr>
    <tr>
      <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">培养方式</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><select name="s_stu_ffb" id="s_stu_ffb">
          <% if("定向".equals(st.getS_stu_ffb()))
	{%>
          <option value="定向" selected="selected">定向</option>
          <option value="非定向">非定向</option>
          <option value="其他">其他</option>
          <%}%>
          <% if("非定向".equals(st.getS_stu_ffb()))
	{%>
          <option value="定向" >定向</option>
          <option value="非定向" selected="selected">非定向</option>
          <option value="其他">其他</option>
          <%}%>
          <% if("其他".equals(st.getS_stu_ffb()))
	{%>
          <option value="定向">定向</option>
          <option value="非定向">非定向</option>
          <option value="其他"  selected="selected">其他</option>
          <%}%>
      </select></td>
      <td align="left" valign="middle" bgcolor="#F9FCFF">异动情况</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><select name="s_stu_ydb" id="s_stu_ydb">
          <% if("转学".equals(st.getS_stu_ydb()))
	{%>
          <option value="转学" selected="selected">转学</option>
          <option value="退学" >退学</option>
          <option value="延长学年">延长学年</option>
          <option value="出国">出国</option>
          <option value="休学">休学</option>
          <%}%>
          <% if("退学".equals(st.getS_stu_ydb()))
	{%>
          <option value="转学" >转学</option>
          <option value="退学"  selected="selected">退学</option>
          <option value="延长学年">延长学年</option>
          <option value="出国">出国</option>
          <option value="休学">休学</option>
          <%}%>
          <% if("延长学年".equals(st.getS_stu_ydb()))
	{%>
          <option value="转学"  >转学</option>
          <option value="退学" >退学</option>
          <option value="延长学年" selected="selected">延长学年</option>
          <option value="出国">出国</option>
          <option value="休学">休学</option>
          <%}%>
          <% if("出国".equals(st.getS_stu_ydb()))
	{%>
          <option value="转学" >转学</option>
          <option value="退学" >退学</option>
          <option value="延长学年">延长学年</option>
          <option value="出国" selected="selected">出国</option>
          <option value="休学">休学</option>
          <%}%>
          <% if("休学".equals(st.getS_stu_ydb()))
	{%>
          <option value="转学"  >转学</option>
          <option value="退学" >退学</option>
          <option value="延长学年">延长学年</option>
          <option value="出国">出国</option>
          <option value="休学" selected="selected">休学</option>
          <%}%>
      </select></td>
    </tr>
    <tr>
      <td height="25" align="center" valign="middle" bgcolor="#F9FCFF">是否就业</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><%
	
	if("1".equals(st.getS_stu_jy()))
	{
	%>
          <input name="s_stu_jy" type="radio" value="1" checked="checked" />
        就业
        <input type="radio" name="s_stu_jy" value="0" />
        待业
        <%
	}
	else
	{
	%>
          <input type="radio" name="s_stu_jy" value="1" />
        就业
        <input type="radio" name="s_stu_jy" value="0" checked="checked" />
        待业
        <%
	}
	%></td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><!--DWLayoutEmptyCell-->&nbsp;</td>
      <td align="left" valign="middle" bgcolor="#F9FCFF"><!--DWLayoutEmptyCell-->&nbsp;</td>
    </tr>
  </table>
  <table width="750" border="0" cellpadding="0" cellspacing="0" align="center">
  <!--DWLayoutTable-->
  <tr>
    <td width="750" height="30" align="center" valign="middle">&nbsp;
      </td>
  </tr>
</table>
 <input type="hidden" name="s_stu_dabh" value="<%=sid%>"/>
<input type="hidden" name="op" value="mod"/>
</form>
</body>
</html>
<iframe  width="0" height="0"></iframe>
