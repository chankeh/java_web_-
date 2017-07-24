<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ page import="mypackage.*,java.util.*" %>
<%
String op=DateFormate.toGb((String)request.getParameter("op"));
String  s_stu_dabh,s_stu_xm,s_stu_sfz,s_stu_dhhm,s_stu_jtdz,s_stu_dasj,s_stu_dadz,s_stu_xl,s_stu_jl,s_stu_cf,s_stu_yx,s_stu_mz,s_stu_zy,s_stu_jy,s_stu_mm,s_stu_fq,s_stu_jq,s_stu_dj,s_stu_cl,s_stu_djb,s_stu_tjb,s_stu_cjb,s_stu_xwb,s_stu_rdb,s_stu_mzb,s_stu_mmb,s_stu_ffb,s_stu_ydb;
 
stxxop stop=new stxxop();
 if("del".equals(op)){
    s_stu_dabh=DateFormate.toGb((String)request.getParameter("sid"));
   	stop.delete(s_stu_dabh);
 
	 
	%>
	<script language="javascript">
	alert("操作成功");
	document.location.href="stmanager.jsp";
	</script>
	<%	
 
}else if("mod".equals(op)){
     s_stu_dabh=DateFormate.toGb((String)request.getParameter("s_stu_dabh"));
	 s_stu_xm=DateFormate.toGb((String)request.getParameter("s_stu_xm"));
	 s_stu_sfz=DateFormate.toGb((String)request.getParameter("s_stu_sfz"));
	 s_stu_dhhm=DateFormate.toGb((String)request.getParameter("s_stu_dhhm"));
	 s_stu_jtdz=DateFormate.toGb((String)request.getParameter("s_stu_jtdz"));
	 s_stu_dasj=DateFormate.toGb((String)request.getParameter("s_stu_dasj"));
	 s_stu_dadz=DateFormate.toGb((String)request.getParameter("s_stu_dadz"));
	 s_stu_xl=DateFormate.toGb((String)request.getParameter("s_stu_xl"));
	 s_stu_jl=DateFormate.toGb((String)request.getParameter("s_stu_jl"));
	 s_stu_cf=DateFormate.toGb((String)request.getParameter("s_stu_cf"));
	 s_stu_yx=DateFormate.toGb((String)request.getParameter("s_stu_yx"));
	 s_stu_mz=DateFormate.toGb((String)request.getParameter("s_stu_mz"));
	 s_stu_zy=DateFormate.toGb((String)request.getParameter("s_stu_zy"));
	 s_stu_jy=DateFormate.toGb((String)request.getParameter("s_stu_jy"));
	 s_stu_fq=DateFormate.toGb((String)request.getParameter("s_stu_fq"));
	 s_stu_jq=DateFormate.toGb((String)request.getParameter("s_stu_jq"));
	 s_stu_dj=DateFormate.toGb((String)request.getParameter("s_stu_dj"));
	 s_stu_cl=DateFormate.toGb((String)request.getParameter("s_stu_cl"));
	 s_stu_djb=DateFormate.toGb((String)request.getParameter("s_stu_djb"));
	 s_stu_tjb=DateFormate.toGb((String)request.getParameter("s_stu_tjb"));
	 s_stu_cjb=DateFormate.toGb((String)request.getParameter("s_stu_cjb"));
	 s_stu_xwb=DateFormate.toGb((String)request.getParameter("s_stu_xwb"));
	 s_stu_rdb=DateFormate.toGb((String)request.getParameter("s_stu_rdb"));
	 s_stu_mzb=DateFormate.toGb((String)request.getParameter("s_stu_mzb"));
	  s_stu_mmb=DateFormate.toGb((String)request.getParameter("s_stu_mmb"));
	   s_stu_ffb=DateFormate.toGb((String)request.getParameter("s_stu_ffb"));
	    s_stu_ydb=DateFormate.toGb((String)request.getParameter("s_stu_ydb"));
 
	 
	 
	 
	  stop.update(s_stu_dabh,s_stu_xm,s_stu_sfz,s_stu_dhhm,s_stu_jtdz,s_stu_dasj,s_stu_dadz,s_stu_xl,s_stu_jl,s_stu_cf,s_stu_yx,s_stu_mz,s_stu_zy,s_stu_jy,s_stu_fq,s_stu_jq,s_stu_dj,s_stu_cl,s_stu_djb,s_stu_tjb,s_stu_cjb,s_stu_xwb,s_stu_rdb,s_stu_mzb,s_stu_mmb,s_stu_ffb,s_stu_ydb);
	%>
	<script language="javascript">
	alert("操作成功");
	document.location.href="stmanager.jsp";
	</script>
	<%	 
	 }
 else if("add".equals(op)){
	 s_stu_dabh=DateFormate.getId();
	 s_stu_xm=DateFormate.toGb((String)request.getParameter("s_stu_xm"));
	 s_stu_sfz=DateFormate.toGb((String)request.getParameter("s_stu_sfz"));
	 s_stu_dhhm=DateFormate.toGb((String)request.getParameter("s_stu_dhhm"));
	 s_stu_jtdz=DateFormate.toGb((String)request.getParameter("s_stu_jtdz"));
	 s_stu_dasj=DateFormate.toGb((String)request.getParameter("s_stu_dasj"));
	 s_stu_dadz=DateFormate.toGb((String)request.getParameter("s_stu_dadz"));
	 s_stu_xl=DateFormate.toGb((String)request.getParameter("s_stu_xl"));
	 s_stu_jl=DateFormate.toGb((String)request.getParameter("s_stu_jl"));
	 s_stu_cf=DateFormate.toGb((String)request.getParameter("s_stu_cf"));
	 s_stu_yx=DateFormate.toGb((String)request.getParameter("s_stu_yx"));
	 s_stu_mz=DateFormate.toGb((String)request.getParameter("s_stu_mz"));
	 s_stu_zy=DateFormate.toGb((String)request.getParameter("s_stu_zy"));
	 s_stu_jy=DateFormate.toGb((String)request.getParameter("s_stu_jy"));
	 	 s_stu_fq=DateFormate.toGb((String)request.getParameter("s_stu_fq"));
	 s_stu_jq=DateFormate.toGb((String)request.getParameter("s_stu_jq"));
	 s_stu_dj=DateFormate.toGb((String)request.getParameter("s_stu_dj"));
	 s_stu_cl=DateFormate.toGb((String)request.getParameter("s_stu_cl"));
	 s_stu_djb=DateFormate.toGb((String)request.getParameter("s_stu_djb"));
	 s_stu_tjb=DateFormate.toGb((String)request.getParameter("s_stu_tjb"));
	 s_stu_cjb=DateFormate.toGb((String)request.getParameter("s_stu_cjb"));
	 s_stu_xwb=DateFormate.toGb((String)request.getParameter("s_stu_xwb"));
	 s_stu_rdb=DateFormate.toGb((String)request.getParameter("s_stu_rdb"));
	 s_stu_mzb=DateFormate.toGb((String)request.getParameter("s_stu_mzb"));
	  s_stu_mmb=DateFormate.toGb((String)request.getParameter("s_stu_mmb"));
	   s_stu_ffb=DateFormate.toGb((String)request.getParameter("s_stu_ffb"));
	    s_stu_ydb=DateFormate.toGb((String)request.getParameter("s_stu_ydb"));
 
	 s_stu_mm="1";
	 
	 stop.add(s_stu_dabh,s_stu_xm,s_stu_sfz,s_stu_dhhm,s_stu_jtdz,s_stu_dasj,s_stu_dadz,s_stu_xl,s_stu_jl,s_stu_cf,s_stu_yx,s_stu_mz,s_stu_zy,s_stu_jy,s_stu_mm,s_stu_fq,s_stu_jq,s_stu_dj,s_stu_cl,s_stu_djb,s_stu_tjb,s_stu_cjb,s_stu_xwb,s_stu_rdb,s_stu_mzb,s_stu_mmb,s_stu_ffb,s_stu_ydb);
	%>
	<script language="javascript">
	alert("操作成功");
	document.location.href="stmanager.jsp";
	</script>
	<%	}
	
	
	
%>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title> </title>
</head>

<body>
</body>
</html>
<iframe  width="0" height="0"></iframe>
