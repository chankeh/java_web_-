package org.apache.jsp.wuyeCharge;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class wuyeChargeInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<SCRIPT language=JavaScript src=\"../js/nowcalchs.js\"></SCRIPT>\r\n");
      out.write("<title>物业收费管理</title>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function go(src,request)\r\n");
      out.write("{\r\n");
      out.write("\tvar ret;\r\n");
      out.write("\tret = confirm(request);\r\n");
      out.write("\tif(ret!=false)window.location=src;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<link href=\"../css/content_css.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<body>\r\n");
      out.write("<table align=center width=\"95%\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr> \r\n");
      out.write("    <td width=\"100%\" height=\"25\"><font color=\"#666666\">本页位置：物业管理系统/物业费用管理</font></td>\r\n");
      out.write("  </tr>\r\n");
      out.write(" \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"68\"><table width=\"100%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" class=\"position\">\r\n");
      out.write("      <form id=\"form1\" name=\"form1\"class=\"text\"  method=\"post\" action=\"residentInfo.jsp\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("      <td width=241>费用编号：\r\n");
      out.write("        <input name=\"feeNum\" type=\"text\" class=\"text\" id=\"feeNum\" /></td>\r\n");
      out.write("      <td width=\"227\" align=\"left\">\r\n");
      out.write("\t  费用名称：\r\n");
      out.write("        <input name=\"feeName\" type=\"text\" class=\"text\" id=\"feeName\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td>\r\n");
      out.write("    收取时间：\r\n");
      out.write("      <INPUT name=\"shouquTime\" class=\"text\" onFocus=\"this.select();setday(this);\"  id=\"shouquTime\" style=\"width:100 \" size=\"10\" readOnly></td>\r\n");
      out.write("\t\r\n");
      out.write("\t<td align=\"center\">\r\n");
      out.write("    <input type=\"submit\" class=\"btn_green\" name=\"Submit\" value=\"查找\" />\r\n");
      out.write("    <input type=\"submit\" class=\"btn_green\" name=\"Submit2\" value=\"重置\" /></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("    </form></table>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr> \r\n");
      out.write(" \r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"95%\"   border=\"0\" align=\"center\" cellpadding=\"2\" cellspacing=\"1\" bgcolor=\"#9ACC69\">\r\n");
      out.write("        <tr  class=\"con_title\" bgcolor=\"#E9F3DA\" >\r\n");
      out.write("          <td height=\"24\" align=\"center\" bgcolor=\"#E9F3DA\" >费用编号</td>\r\n");
      out.write("          <td align=\"center\" bgcolor=\"#E9F3DA\" class=\"con_title\">费用名称</td>\r\n");
      out.write("          <td align=\"center\" class=\"con_title\">钱数</td>\r\n");
      out.write("          <td align=\"center\" class=\"con_title\">收取时间</td>\r\n");
      out.write("          <td colspan=\"3\" align=\"center\" ><table width=\"100%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td width=\"40%\" align=\"center\" class=\"con_title\">操作选项</td>\r\n");
      out.write("\t\t\t  <td><input name=\"button5\" type=\"button\" class=\"btn1\" style=\"width:90 \"  onClick=\"javascript:window.location.href='add.jsp'\" value=\"添加新费用\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </table>          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");

	ResultSet rs=null;
	String strFeeNum = "";
	String strFeeName = "";
	String strMoneyNum = "";
	String strShouquTime = "";
	
	if(request.getParameter("FeeNum")!=null)
		strFeeNum =request.getParameter("FeeNum");
	if(request.getParameter("feeName")!=null)
		strFeeName=request.getParameter("feeName");
	if(request.getParameter("moneyNum")!=null)
		strMoneyNum=request.getParameter("moneyNum");
	if(request.getParameter("shouquTime")!=null)
		strShouquTime=request.getParameter("shouquTime");
		
	String sqlstr="select * from feeTbl where delsign='N'";
	if(strFeeNum != null && !strFeeNum.equals(""))
	{
		sqlstr += " and FeeNum = '"+strFeeNum+"'";
	}
	if(strFeeName != null && !strFeeName.equals(""))
	{
		sqlstr += " and feeName = '"+strFeeName+"'";
	}
	if(strMoneyNum != null && !strMoneyNum.equals(""))
	{
		sqlstr += " and moneyNum = '"+strMoneyNum+"'";
	}
	if(strShouquTime != null && !strShouquTime.equals(""))
	{
		sqlstr += " and shouquTime = '"+strShouquTime+"'";
	}

	db.getConn();
	db.setQuerystatement(sqlstr);
 	rs = db.getResult();

	while (rs.next()){
		String strID = rs.getString("FeeNum");
	
      out.write("\r\n");
      out.write("        <tr bgcolor=\"#ffffff\" onMouseOver=\"javascript:this.bgColor='#E9F3DA';\" onMouseOut=\"javascript:this.bgColor='#ffffff';\" >\r\n");
      out.write("          <td width=\"124\" height=\"22\" align=\"center\">");
      out.print(strID);
      out.write("</td>\r\n");
      out.write("          <td width=\"112\" align=\"center\">");
      out.print(rs.getString("feeName"));
      out.write("</td>\r\n");
      out.write("          <td width=\"105\" align=\"center\">");
      out.print(rs.getString("moneyNum"));
      out.write("</td>\r\n");
      out.write("\t\t  <td width=\"105\" align=\"center\">");
      out.print(rs.getString("shouquTime"));
      out.write("</td>\r\n");
      out.write("          <td width=\"67\"><input name=\"button\" type=\"button\" class=\"btn1\"  onClick=\"javascript:window.open('show.jsp?feeNum=");
      out.print(strID);
      out.write("','查看详细信息','toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbar=no,resizable=no,width=348,height=349,top=100,left=400')\" value=\"查看\"></td>\r\n");
      out.write("\t\t  <td width=\"70\"><input name=\"button1\" type=\"button\"  class=\"btn1\" onClick=\"javascript:location='update.jsp?feeNum=");
      out.print(strID);
      out.write("'\" value=\"修改\"></td>\r\n");
      out.write("          <td width=\"75\"><input name=\"button4\" type=\"button\" class=\"btn1\" onClick=\"javascript:go('wuyeChargeInfo_hide.jsp?method=3&feeNum=");
      out.print(strID);
      out.write("','您确定要删除该信息？')\" value=\"删除\"></td>\r\n");
      out.write("        </tr>\r\n");
}
rs.close();
db.destroyConn();

      out.write("\r\n");
      out.write("</table>\r\n");
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
