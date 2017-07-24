package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackage.*;
import java.util.*;

public final class top1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>logo</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE1 {font-size: 12px}\r\n");
      out.write(".STYLE3 {color: #FF0000}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write(" \r\n");
      out.write("</head>\r\n");

      	String name="";
		kssjop ksop=new kssjop();
		kssj ks=ksop.getkssj();
		sxxop sop=new sxxop();
		name=sop.getreturnname((String)session.getAttribute("s_username"));
		
      out.write("\r\n");
      out.write("<body leftmargin=\"0\" topmargin=\"0\" onLoad=\"AutoSubmit()\" oncontextmenu=\"event.returnValue=false\">\r\n");
      out.write("<table width=\"1024\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"font-size:12px\">\r\n");
      out.write("  <!--DWLayoutTable-->\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"247\" height=\"20\" align=\"left\" valign=\"bottom\" background=\"img/bg_titlebarr.gif\" class=\"STYLE1\" style=\"border-bottom:1px solid #9EC3F2\"><strong>考生信息</strong>--》准考证号： ");
      out.print(session.getAttribute("s_username") );
      out.write("</td>\r\n");
      out.write("    <td width=\"334\" align=\"left\" valign=\"bottom\" background=\"img/bg_titlebarr.gif\" style=\"border-bottom:1px solid #9EC3F2\"><strong>考生姓名</strong>：");
      out.print(name);
      out.write("</td>\r\n");
      out.write("    <td width=\"442\" background=\"img/bg_titlebarr.gif\" style=\"border-bottom:1px solid #9EC3F2\">  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"style3\" id=clock><strong>考试剩余时间</strong>： &nbsp;&nbsp;00:00:00 </span> </td>\r\n");
      out.write("    <td width=\"1\" background=\"img/bg_titlebarr.gif\" style=\"border-bottom:1px solid #9EC3F2\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<script language=\"vbscript\">\r\n");
      out.write("Dim timerID,timerRunning,time1,now_time,ss_time,remanent_time,shjian \r\n");
      out.write("shjian=");
      out.print(ks.getKssj());
      out.write(" //设置时间\r\n");
      out.write("timeRunning = false\r\n");
      out.write("ss_time=0\r\n");
      out.write("Function AutoSubmit()\r\n");
      out.write("\tremanent_time=shjian\r\n");
      out.write("\tStartAuto()\r\n");
      out.write("End Function\r\n");
      out.write("\r\n");
      out.write("Function StartAuto()\r\n");
      out.write("\tIf ss_time=0 Then\r\n");
      out.write("\t\tss_time=59\r\n");
      out.write("\t\tremanent_time=remanent_time-1\r\n");
      out.write("\t\tnow_time =TimeSerial(0,remanent_time,0)\r\n");
      out.write("\tElse\r\n");
      out.write("\t\tss_time=ss_time-1\r\n");
      out.write("\tEnd If\r\n");
      out.write("\ttime1=FormatDateTime(now_time,4)\r\n");
      out.write("\tIf ss_time<10 Then\r\n");
      out.write("\t\ttime1=Cstr(time1) & \":0\" & ss_time\r\n");
      out.write("\tElse\r\n");
      out.write("\t\ttime1=Cstr(time1) & \":\" & ss_time\r\n");
      out.write("\tEnd If\r\n");
      out.write("\t\r\n");
      out.write("\tclock.innerHTML = \"考试剩余时间: &nbsp;&nbsp;\" & time1\r\n");
      out.write("\r\n");
      out.write("\tIf CDate(time1)>#00:10:30# Then\r\n");
      out.write("\t\ttimerID = setTimeout(\"StartAuto()\",1000)\r\n");
      out.write("\t\twindow.status=\"欢迎使用网络考试系统，考试正在进行中！\"\r\n");
      out.write("\tElseIf CDate(time1)>#00:10:00# Then\r\n");
      out.write("\t\tclock.style.color = \"#ff0000\"\r\n");
      out.write("\t\ttimerID = setTimeout(\"StartAuto()\",1000)\r\n");
      out.write("\tElseIf cdate(time1)>#00:00:00# then\r\n");
      out.write("\t\twindow.status=\"考试还剩最后几分钟，请您抓紧时间！\"\r\n");
      out.write("\t\ttimerID = setTimeout(\"StartAuto()\",1000)\r\n");
      out.write("    Else\r\n");
      out.write("        alert(\"考试时间到，考试结束！\")\r\n");
      out.write("\t\tparent.document.location.href=\"login.jsp\"\r\n");
      out.write("End If\t\r\n");
      out.write("End Function\r\n");
      out.write("</script>\r\n");
      out.write("<iframe  width=\"0\" height=\"0\"></iframe>\r\n");
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
