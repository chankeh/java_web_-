package org.apache.jsp.residentInfo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class residentInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      database.operateDb db = null;
      synchronized (_jspx_page_context) {
        db = (database.operateDb) _jspx_page_context.getAttribute("db", PageContext.PAGE_SCOPE);
        if (db == null){
          db = new database.operateDb();
          _jspx_page_context.setAttribute("db", db, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>住户信息管理</title>\r\n");
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
      out.write("            \t<td height=\"24\">&nbsp;&nbsp;&nbsp;&nbsp;本页位置：物业管理系统/住户信息管理</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\t\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"68\"><table width=\"100%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" class=\"position\">\r\n");
      out.write("      <form id=\"form1\" name=\"form1\"class=\"text\"  method=\"post\" action=\"residentInfo.jsp\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("      <td width=241><strong>楼　　号：</strong>\r\n");
      out.write("        <input name=\"builNum\" type=\"text\" class=\"text\" id=\"builNum\" /></td>\r\n");
      out.write("      <td width=\"227\" align=\"left\">\r\n");
      out.write("\t  　<strong>单元号：</strong>\r\n");
      out.write("        <input name=\"cellNum\" type=\"text\" class=\"text\" id=\"cellNum\" /></td>\r\n");
      out.write("      <td width=\"237\" align=\"left\">\r\n");
      out.write("\t    <strong>房间号：</strong>\r\n");
      out.write("        <input name=\"roomNum\" type=\"text\" class=\"text\" id=\"roomNum\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td>\r\n");
      out.write("          <strong>住户编号：</strong> \r\n");
      out.write("      <input name=\"ResidentNum\" type=\"text\" class=\"text\" id=\"ResidentNum\" /></td>\r\n");
      out.write("\t<td>\r\n");
      out.write("      <strong>户主姓名：</strong>\r\n");
      out.write("      <input name=\"residentName\" type=\"text\" class=\"text\" id=\"residentName\" /></td>\r\n");
      out.write("\t\r\n");
      out.write("\t<td align=\"center\">\r\n");
      out.write("    <input type=\"submit\" class=\"btn_green\" name=\"Submit\" value=\"查找\" />\r\n");
      out.write("    <input type=\"submit\" class=\"btn_green\" name=\"Submit2\" value=\"重置\" /></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("    </form></table>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<table width=\"95%\"   border=\"0\" align=\"center\" cellpadding=\"2\" cellspacing=\"1\" bgcolor=\"#9ACC69\">\r\n");
      out.write("        <tr  class=\"con_title\" bgcolor=\"#E9F3DA\" >\r\n");
      out.write("          <td height=\"24\" align=\"center\" bgcolor=\"#E9F3DA\" >住户编号</td>\r\n");
      out.write("          <td align=\"center\" bgcolor=\"#E9F3DA\" class=\"con_title\">户主姓名</td>\r\n");
      out.write("          <td align=\"center\" class=\"con_title\">楼号</td>\r\n");
      out.write("\t\t  <td align=\"center\" class=\"con_title\">单元号</td>\r\n");
      out.write("\t\t  <td align=\"center\" class=\"con_title\">房间号</td>\r\n");
      out.write("\t\t  <td align=\"center\" class=\"con_title\">空间大小</td>\r\n");
      out.write("\t\t  <td align=\"center\" class=\"con_title\">其他说明</td>\r\n");
      out.write("          <td colspan=\"3\" align=\"center\" ><table width=\"100%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td align=\"center\" class=\"con_title\"><input name=\"button5\" type=\"button\" class=\"btn1\" style=\"width:150 \"  onclick=\"javascript:window.location.href='add.jsp'\" value=\"添加住户\" /></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("          </table>          </td>\r\n");
      out.write("        </tr>\r\n");

	ResultSet rs=null;
	String strBuildNum = "";
	String strCellNum = "";
	String strRoomNum = "";
	String strResidentNum = "";
	String strResidentName = "";
	if(request.getParameter("buildNum")!=null)
		strBuildNum =request.getParameter("buildNum");
	if(request.getParameter("cellNum")!=null)
		strCellNum=request.getParameter("cellNum");
	if(request.getParameter("roomNum")!=null)
		strRoomNum=request.getParameter("roomNum");
	if(request.getParameter("residentNum")!=null)
		strResidentNum=request.getParameter("residentNum");
	if(request.getParameter("residentName")!=null)
		strResidentName=request.getParameter("residentName");
	String strSql="";

	strSql = "select * from residentTbl where delsign = 'N'";
	
	int n=0;
	if(strBuildNum != null && !strBuildNum.equals(""))
	{
		strSql += " and buildNum = '"+strBuildNum+"'";
	}
	if(strCellNum != null && !strCellNum.equals(""))
	{
		strSql += " and cellNum = '"+strCellNum+"'";
	}
	if(strRoomNum != null && !strRoomNum.equals(""))
	{
		strSql += " and roomNum = '"+strRoomNum+"'";
	}
	if(strResidentNum != null && !strResidentNum.equals(""))
	{
		strSql += " and residentNum = '"+strResidentNum+"'";
	}
	if(strResidentName != null && !strResidentName.equals(""))
	{
		strSql += " and name = '"+strResidentName+"'";
	}
	db.getConn();
	db.setQuerystatement(strSql);
 	rs = db.getResult();

	while (rs.next()){
		String strID = rs.getString("residentNum");
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <tr bgcolor=\"#ffffff\" onMouseOver=\"javascript:this.bgColor='#E9F3DA';\" onMouseOut=\"javascript:this.bgColor='#ffffff';\" >\r\n");
      out.write("          <td width=\"100\" height=\"22\" align=\"center\">");
      out.print(strID);
      out.write("</td>\r\n");
      out.write("          <td width=\"93\" align=\"center\">");
      out.print(rs.getString("name"));
      out.write("</td>\r\n");
      out.write("          <td width=\"91\" align=\"center\">");
      out.print(rs.getString("buildNum"));
      out.write("</td>\r\n");
      out.write("\t\t  <td width=\"91\" align=\"center\">");
      out.print(rs.getString("cellNum"));
      out.write("</td>\r\n");
      out.write("\t\t  <td width=\"110\" align=\"center\">");
      out.print(rs.getString("roomNum"));
      out.write("</td>\r\n");
      out.write("\t\t  <td width=\"107\" align=\"center\">");
      out.print(rs.getString("area"));
      out.write("</td>\r\n");
      out.write("\t\t  <td width=\"108\" align=\"center\">");
      out.print(rs.getString("otherInfo"));
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("          <td width=\"74\"><input name=\"button\" type=\"button\" class=\"btn1\"  onClick=\"javascript:window.open('show.jsp?id=");
      out.print(strID);
      out.write("','查看详细信息','toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbar=no,resizable=no,width=348,height=349,top=100,left=400')\" value=\"查看\"></td>\r\n");
      out.write("          <td width=\"56\"><input name=\"button1\" type=\"button\"  class=\"btn1\" onClick=\"javascript:location='update.jsp?residentNum=");
      out.print(strID);
      out.write("'\" value=\"修改\"></td>\r\n");
      out.write("          <td width=\"64\"><input name=\"button4\" type=\"button\"   class=\"btn1\" onClick=\"javascript:go('residentInfo_hide.jsp?method=3&residentNum=");
      out.print(strID);
      out.write("','您确定要删除该住户信息？')\" value=\"删除\"></td>\r\n");
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
