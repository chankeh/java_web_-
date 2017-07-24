package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackage.*;
import java.util.*;

public final class fxxop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=gb2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

String op=DateFormate.toGb((String)request.getParameter("op"));
String lmc="",frs="",fbz="",fmc="",fxb="";
int    li_count=0;
fxxop fxx=new fxxop();
if("add".equals(op)){
	lmc=DateFormate.toGb((String)request.getParameter("lmc"));
	fmc=DateFormate.toGb((String)request.getParameter("fmc"));
	frs=DateFormate.toGb((String)request.getParameter("frs"));
	fbz=DateFormate.toGb((String)request.getParameter("fbz"));
    fxb=DateFormate.toGb((String)request.getParameter("fxb"));
	if(!fxx.checkfull(fmc,lmc))
	{
	
      out.write("\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\talert(\"此楼房间数已达到上限\");\r\n");
      out.write("\tdocument.location.href=\"fxxmanager.jsp\";\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");

	}
	else
	{
	fxx.add(fmc,lmc,frs,fxb,fbz);
	
      out.write("\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\talert(\"操作成功\");\r\n");
      out.write("\tdocument.location.href=\"fxxmanager.jsp\";\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t");
}
}else if("del".equals(op)){
	lmc=DateFormate.toGb((String)request.getParameter("lmc"));
	fmc=DateFormate.toGb((String)request.getParameter("fmc"));
	li_count=fxx.getfrs(fmc,lmc);
	if(li_count>0)	{
	
      out.write("\r\n");
      out.write("\t\t<script language=\"javascript\">\r\n");
      out.write("\t    alert(\"请先删除房间里床位信息再进行此操作！\");\r\n");
      out.write("\t    document.location.href=\"fxxmanager.jsp\";\r\n");
      out.write("\t    </script>\r\n");
      out.write("\t");

	}
	else
	{
	fxx.delete(lmc,fmc);
	
      out.write("\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\talert(\"操作成功\");\r\n");
      out.write("\tdocument.location.href=\"fxxmanager.jsp\";\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");
	}
}else if("mod".equals(op)){
	lmc=DateFormate.toGb((String)request.getParameter("lmc"));
	fmc=DateFormate.toGb((String)request.getParameter("fmc"));
	frs=DateFormate.toGb((String)request.getParameter("frs"));
	fbz=DateFormate.toGb((String)request.getParameter("fbz"));
	fxb=DateFormate.toGb((String)request.getParameter("fxb"));
	li_count=fxx.getfrs(fmc,lmc);
	if(li_count>Integer.parseInt(frs))
	{
      out.write("\r\n");
      out.write("\t\t<script language=\"javascript\">\r\n");
      out.write("\t    alert(\"寝室床位数设置不正确，当前床位数已大于您输入的数量！\");\r\n");
      out.write("\t    document.location.href=\"fxxmanager.jsp\";\r\n");
      out.write("\t    </script>\r\n");
      out.write("\t");

	}
	else
	{
	fxx.update(fmc,lmc,frs,fxb,fbz);
	
      out.write("\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\talert(\"操作成功\");\r\n");
      out.write("\tdocument.location.href=\"fxxmanager.jsp\";\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");
	} 
} 
else if("addall".equals(op)){
	lmc=DateFormate.toGb((String)request.getParameter("lmc"));
	fmc=DateFormate.toGb((String)request.getParameter("fmc"));
	cxxop cxop=new cxxop();
	 
	cxop.addall(fmc,lmc);
	
      out.write("\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\talert(\"生成床位信息操作成功\");\r\n");
      out.write("\tdocument.location.href=\"fxxmanager.jsp\";\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");
	}

      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title> </title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
