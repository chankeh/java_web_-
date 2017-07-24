package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackage.*;
import java.util.*;

public final class ktxxmanager1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title></title>\r\n");
      out.write(" ");

  ktxxop ktop=new ktxxop();
  String question;
  float  fs;
  ArrayList al=new ArrayList();
  fs=ktop.getsumbylx("1");
  al=ktop.getKtxxbylx("1");
  
 

  ktxx kt=new ktxx();
  
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".STYLE4 {font-size: 14px}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tfunction del(id){\r\n");
      out.write("\t\tif(confirm(\"您真的要删除选择的记录吗？\")){\r\n");
      out.write("\t\t\t\tdocument.location.href=\"lxxop.jsp?op=del&id=\"+id;\r\n");
      out.write("\t\t}\t\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction check(){\r\n");
      out.write("\t\tif(document.zgform.svalue.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入查询内容\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"zgform\" action=\"ktxxmanager.jsp\" method=\"post\" onsubmit=\"javascript:return check();\">\r\n");
      out.write("<table width=\"778\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#9EC3F2\" style=\"font-size:12px\">\r\n");
      out.write("  <!--DWLayoutTable-->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" colspan=\"5\" align=\"left\" valign=\"middle\" background=\"img/bg_titlebarr.gif\"><span class=\"STYLE1\">填空题库[<a href=\"addktxx1.jsp\">新增考题</a>]&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本题分数合计：");
      out.print(fs);
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"112\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">考题编号</td>\r\n");
      out.write("    <td width=\"312\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">考题</td>\r\n");
      out.write("    <td width=\"112\" height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">难题</td>\r\n");
      out.write("    <td width=\"112\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">分数</td>\r\n");
      out.write("    <td width=\"124\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\"><span class=\"STYLE4\">操作</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");


  for(int i=0;i<al.size();i++){
	  kt=(ktxx)al.get(i);
	  
  
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\"><span class=\"STYLE4\">");
      out.print(kt.getId() );
      out.write("</span></td>\r\n");
      out.write("    <td align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\"><span class=\"STYLE4\">\r\n");
      out.write("\t");

	question=kt.getQuestion();
	if(question.length()>20){
	 out.print(kt.getQuestion().substring(0,20));
	 }
	 else
	 {
	 out.print(question);
	 }
	
	
	
      out.write("</span></td>\r\n");
      out.write("    <td height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\"><span class=\"STYLE4\">");
      out.print(kt.getNd() );
      out.write("</span></td>\r\n");
      out.write("    <td align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\"><span class=\"STYLE4\">");
      out.print(kt.getFs() );
      out.write("</span></td>\r\n");
      out.write("    <td align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\"><span class=\"STYLE4\"><a href=\"ktxxop.jsp?op=del&lx=1&id=");
      out.print(kt.getId());
      out.write("\">删除</a> <a href=\"modktxx.jsp?id=");
      out.print(kt.getId());
      out.write("\">修改 </a></span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

  }
  
  
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<input name=\"op\" type=\"hidden\" value=\"search\" />\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
