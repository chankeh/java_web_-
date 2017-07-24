package org.apache.jsp.buildInfo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class buildInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      database.operateDb db = null;
      synchronized (_jspx_page_context) {
        db = (database.operateDb) _jspx_page_context.getAttribute("db", PageContext.PAGE_SCOPE);
        if (db == null){
          db = new database.operateDb();
          _jspx_page_context.setAttribute("db", db, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
request.setCharacterEncoding("gb2312");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("</head>\r\n");
      out.write("<link href=\"../css/content_css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function go(src,request)\r\n");
      out.write("{\r\n");
      out.write("\tvar ret;\r\n");
      out.write("\tret = confirm(request);\r\n");
      out.write("\tif(ret!=false)window.location=src;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"95%\" height=\"96\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t<td>\r\n");
      out.write("\t\t<table width=\"100%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" class=\"position\">\r\n");
      out.write("        \t<tr>\r\n");
      out.write("            \t<td height=\"24\">&nbsp;&nbsp;&nbsp;&nbsp;本页位置：物业管理系统/楼盘信息管理</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\t\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"68\"><table width=\"100%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" class=\"position\">\r\n");
      out.write("      <form id=\"form1\" name=\"form1\"class=\"text\"  method=\"post\" action=\"buildInfo.jsp?action=find\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("      <td width=50%>\t\r\n");
      out.write("        <strong>楼盘编号：</strong>\r\n");
      out.write("        <input name=\"buildNum\" type=\"text\" class=\"text\" id=\"buildNum\" /></td>\r\n");
      out.write("      <td width=\"361\" align=\"center\">\r\n");
      out.write("\t    <strong>楼盘名称：</strong>\r\n");
      out.write("      <input name=\"buildName\" type=\"text\" class=\"text\" id=\"buildName\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t  <tr><td>\r\n");
      out.write("        <strong>楼盘位置：</strong>\r\n");
      out.write("    <input name=\"buildAdr\" type=\"text\" class=\"text\" id=\"buildAdr\" /></td>\r\n");
      out.write("\t<td align=\"center\">\r\n");
      out.write("    <input type=\"submit\" class=\"btn_green\" name=\"Submit\" value=\"查找\" />\r\n");
      out.write("    <input type=\"submit\" class=\"btn_green\" name=\"Submit2\" value=\"重置\" /></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("    </form></table>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"95%\"   border=\"0\" align=\"center\" cellpadding=\"2\" cellspacing=\"1\" bgcolor=\"#9ACC69\">\r\n");
      out.write("        <tr  class=\"con_title\" bgcolor=\"#E9F3DA\" >\r\n");
      out.write("          <td height=\"24\" align=\"center\" bgcolor=\"#E9F3DA\" >楼盘号</td>\r\n");
      out.write("          <td align=\"center\" bgcolor=\"#E9F3DA\" class=\"con_title\">楼盘名称</td>\r\n");
      out.write("          <td align=\"center\" class=\"con_title\">楼盘位置</td>\r\n");
      out.write("          <td colspan=\"3\" align=\"center\" ><table width=\"100%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td width=\"35%\" align=\"center\" class=\"con_title\">操作选项</td>\r\n");
      out.write("\t\t\t  <td><input name=\"button5\" type=\"button\" class=\"btn1\" style=\"width:90 \"  onClick=\"javascript:window.location.href='add.jsp'\" value=\"添加楼盘\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </table>          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");

	ResultSet rs=null;
	String strBuildNum = "";
	String strBuildName = "";
	String strBuildAdr = "";
	String strAction = "";
	if(request.getParameter("action")!=null)
		strAction =request.getParameter("action");	
	if(request.getParameter("buildNum")!=null)
		strBuildNum =request.getParameter("buildNum");
	if(request.getParameter("buildName")!=null)
		strBuildName=request.getParameter("buildName");
	if(request.getParameter("buildAdr")!=null)
		strBuildAdr=request.getParameter("buildAdr");
	String strSql="";
	if(strAction.equals("find"))
	{
		strSql = "select buildNum,name,addr from buildTbl where delsign = 'N'";
	
		if(strBuildNum != null && !strBuildNum.equals(""))
		{
			strSql += " and buildNum = '"+strBuildNum+"'";
		}
		if(strBuildName != null && !strBuildName.equals(""))
		{
			strSql += " and name = '"+strBuildName+"'";
		}
		if(strBuildAdr != null && !strBuildAdr.equals(""))
		{
			strSql += " and addr = '"+strBuildAdr+"'";
		}
	}
	else
		strSql = "select buildNum,name,addr from buildTbl where delsign='N'";
	db.getConn();
	db.setQuerystatement(strSql);
 	rs = db.getResult();

	while (rs.next()){
		String strBuildNum1 = rs.getString("buildNum");
	
      out.write("\r\n");
      out.write("        <tr bgcolor=\"#ffffff\" onMouseOver=\"javascript:this.bgColor='#E9F3DA';\" onMouseOut=\"javascript:this.bgColor='#ffffff';\" >\r\n");
      out.write("          <td width=\"136\" height=\"22\" align=\"center\">");
      out.print(strBuildNum1);
      out.write("</td>\r\n");
      out.write("          <td width=\"122\" align=\"center\">");
      out.print(rs.getString("name"));
      out.write("</td>\r\n");
      out.write("          <td width=\"125\" align=\"center\">");
      out.print(rs.getString("addr"));
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("          <td width=\"52\"><input name=\"button\" type=\"button\" class=\"btn1\"  onClick=\"javascript:window.open('show.jsp?id=");
      out.print(strBuildNum1);
      out.write("','查看详细信息','toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbar=no,resizable=no,width=348,height=349,top=100,left=400')\" value=\"查看\"></td>\r\n");
      out.write("          <td width=\"52\"><input name=\"button1\" type=\"button\"  class=\"btn1\" onClick=\"javascript:location='update.jsp?buildNum=");
      out.print(strBuildNum1);
      out.write("'\" value=\"修改\"></td>\r\n");
      out.write("          <td width=\"56\"><input name=\"button4\" type=\"button\"   class=\"btn1\" onClick=\"javascript:go('build_hide.jsp?method=3&buildNum=");
      out.print(strBuildNum1);
      out.write("','您确定要删除该用户？')\" value=\"删除\"></td>\r\n");
      out.write("        </tr>\r\n");
}
rs.close();
db.destroyConn();

      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
