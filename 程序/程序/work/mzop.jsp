<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ page import="mypackage.*,java.util.*" %>
<%
String op=DateFormate.toGb((String)request.getParameter("op"));
String  s_mz_bh,s_mz_mc;
 
mzop mzop=new mzop();
 if("del".equals(op)){
    s_mz_bh=DateFormate.toGb((String)request.getParameter("sid"));
   	mzop.delete(s_mz_bh);
 
	 
	%>
	<script language="javascript">
	alert("操作成功");
	document.location.href="mzmanager.jsp";
	</script>
	<%	
  
	 }
 else if("add".equals(op)){
	 s_mz_bh=DateFormate.getId();
	 s_mz_mc=DateFormate.toGb((String)request.getParameter("s_mz_mc"));
 
	 
	 mzop.add(s_mz_bh,s_mz_mc);
	 
	%>
	<script language="javascript">
	alert("操作成功");
	document.location.href="mzmanager.jsp";
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
