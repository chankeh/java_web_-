<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ page import="mypackage.*,java.util.*" %>
<%
String op=DateFormate.toGb((String)request.getParameter("op"));
String  s_tu_bh,s_tu_name,s_tu_yx,s_tu_password,s_tu_dh,s_tu_dz;
 
tuxxop stop=new tuxxop();
 if("del".equals(op)){
    s_tu_bh=DateFormate.toGb((String)request.getParameter("sid"));
   	stop.delete(s_tu_bh);
 
	 
	%>
	<script language="javascript">
	alert("操作成功");
	document.location.href="tumanager.jsp";
	</script>
	<%	
 
}else if("mod".equals(op)){
     s_tu_bh=DateFormate.toGb((String)request.getParameter("s_tu_bh"));
	 s_tu_name=DateFormate.toGb((String)request.getParameter("s_tu_name"));
	 s_tu_yx=DateFormate.toGb((String)request.getParameter("s_tu_yx"));
	 s_tu_dh=DateFormate.toGb((String)request.getParameter("s_tu_dh"));
	 s_tu_dz=DateFormate.toGb((String)request.getParameter("s_tu_dz"));
	 stop.update(s_tu_bh,s_tu_name,s_tu_yx,s_tu_dh,s_tu_dz);
	 
	%>
	<script language="javascript">
	alert("操作成功");
	document.location.href="tumanager.jsp";
	</script>
	<%	 
	 }
 else if("add".equals(op)){
	 s_tu_bh=DateFormate.getId();
	 s_tu_name=DateFormate.toGb((String)request.getParameter("s_tu_name"));
	 s_tu_yx=DateFormate.toGb((String)request.getParameter("s_tu_yx"));
	  s_tu_dh=DateFormate.toGb((String)request.getParameter("s_tu_dh"));
	 s_tu_dz=DateFormate.toGb((String)request.getParameter("s_tu_dz"));
	 s_tu_password="1";
	 
	 stop.add(s_tu_bh,s_tu_name,s_tu_yx,s_tu_password,s_tu_dh,s_tu_dz);
	 
	%>
	<script language="javascript">
	alert("操作成功");
	document.location.href="tumanager.jsp";
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
