package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/conn.jsp");
  }

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
      response.setContentType("text/html;charset=gb2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(' ');
      out.write('\r');
      out.write('\n');
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");

		Connection conn_tk= null; 
		Connection conn_jd= null; 
		Connection conn_tkt= null; 
		Connection conn_xzt= null; 
		Connection conn_js = null;
		try{
			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver").newInstance();
			String tk = "tk";
			String jd = "tk_jd";
			String tkt = "tk_tkt";
			String xzt = "tk_xzt";
			String js = "tk_js";
			String url="jdbc:microsoft:sqlserver://127.0.0.1:1433;DatabaseName="; 
			//pubs为你的数据库的 
			String user="sa"; 
			String password=""; 
			conn_tk= DriverManager.getConnection(url + tk,user,password); 
			conn_jd= DriverManager.getConnection(url + jd,user,password); 
			conn_tkt= DriverManager.getConnection(url + tkt,user,password); 
			conn_xzt= DriverManager.getConnection(url + xzt,user,password); 
			conn_js= DriverManager.getConnection(url + js,user,password); 
			//Connection conn = //DriverManager.getConnection("jdbc:sqlserver:thin:@127.0.0.1:1433:scott","sa","");
		}
    	catch(Exception ex)
    	{
      		System.out.println("error:" + ex.getMessage());
    	}

request.setCharacterEncoding("GB2312");
String boardid;

      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>题库管理系统</TITLE>\r\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=gb2312\">\r\n");
      out.write("<LINK href=\"images/style.css\" type=text/css rel=stylesheet>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY bottomMargin=0 bgColor=#ffffff leftMargin=0 topMargin=0 rightMargin=0>\r\n");
      out.write("<TABLE style=\"BORDER-COLLAPSE: collapse\" height=23 cellPadding=0 width=\"100%\" \r\n");
      out.write("background=images/bg_top_01.gif border=0>\r\n");
      out.write("<TABLE width=760 height=40 \r\n");
      out.write("border=0 align=\"center\" cellPadding=0 cellspacing=\"0\" style=\"BORDER-COLLAPSE: collapse\">\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("  <TD align=middle>\r\n");
      out.write("  <MARQUEE onmouseover=this.stop(); style=\"FONT-WEIGHT: normal; FONT-SIZE: 12px; LINE-HEIGHT: normal; FONT-STYLE: normal; FONT-VARIANT: normal\" onmouseout=this.start(); scrollAmount=1 scrollDelay=1 direction=left>\r\n");
      out.write("  <B><A class=link_b08 href=\"#\">欢迎使用题库管理系统</A></B>\r\n");
      out.write("  </MARQUEE>\r\n");
      out.write("  </TD></TR></TBODY></TABLE>\r\n");
      out.write("  <TABLE width=750 border=0 align=\"center\" cellPadding=0 cellspacing=\"0\" style=\"BORDER-COLLAPSE: collapse\">\r\n");
      out.write("    <TBODY>\r\n");
      out.write("      <TR>\r\n");
      out.write("        <TD vAlign=top align=middle>\r\n");
      out.write("\t<TABLE \r\n");
      out.write("      style=\"BORDER-RIGHT: #ffc94a 1px solid; BORDER-TOP: #ffc94a 1px solid; BORDER-LEFT: #ffc94a 1px solid; BORDER-BOTTOM: #ffc94a 1px solid; BORDER-COLLAPSE: collapse\" \r\n");
      out.write("      cellPadding=2 width=180 border=0 height=\"100\">\r\n");
      out.write("            <TBODY>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD background=images/table_bg_04.gif height=25>&nbsp;<IMG \r\n");
      out.write("            height=13 src=\"images/icon_star.gif\" width=13 align=absMiddle \r\n");
      out.write("            border=0>&nbsp;&nbsp;<B><FONT class=text_b03>用户信息</FONT></B></TD>\r\n");
      out.write("                <TD align=right background=images/table_bg_04.gif></TD>\r\n");
      out.write("              </TR>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD align=left colSpan=2>\r\n");
      out.write("\t\t\t\t");

					if(request.getParameter("active")!=null){
							ResultSet rst = null;
							String user = request.getParameter("user");
							String pass = request.getParameter("mm");
							String sql = "select * from tk_member where mem_name = '"+user+"' and mem_password = '"+pass+"'";
							rst = conn_tk.createStatement().executeQuery(sql);
							if(rst.next()){
								session.putValue("user",rst.getString("mem_name"));
								session.putValue("qx",rst.getString("mem_qx"));
							}else{
								out.println("<script language='javascript'>window.alert('用户名或密码错误，请重新输入！！');</script>");
							}
					}
					if(session.getValue("user") == null||session.getValue("user").equals(""))
					{
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<FORM METHOD=POST ACTION=\"index.jsp?active=login\" name=\"loginform\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <td><div align=\"center\"></div></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <td width=\"62%\" rowspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td >用户名:</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><INPUT TYPE=\"text\" NAME=\"user\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td >密码:</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><INPUT TYPE=\"password\" NAME=\"mm\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td ></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><INPUT TYPE=\"submit\" value=\"登录\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  </table></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</FORM>\r\n");
      out.write("\t\t\t\t\t\t");

					}else{
						String qx = session.getValue("qx").toString();
						String user = session.getValue("user").toString();
				
      out.write("\r\n");
      out.write("\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" height=\"84\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td><div align=\"center\"></div></td>\r\n");
      out.write("                      <td width=\"62%\" rowspan=\"2\">\r\n");
      out.write("\t\t\t\t\t  <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td align=right>姓名:</td>\r\n");
      out.write("                            <td align=left>");
      out.print(session.getValue("user"));
      out.write("</td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td align=right>类型:</td>\r\n");
      out.write("                            <td align=left>");
      out.print(session.getValue("qx"));
      out.write("</td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("\t\t\t\t\t\t  <tr>\r\n");
      out.write("                            <td ></td>\r\n");
      out.write("                            <td><A class=link_b10  href=\"logout.jsp\">退出</A></td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                      </table></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("\t\t\t\t");

						}
				
      out.write("\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("              </TR>\r\n");
      out.write("\t\t\t   <TR>\r\n");
      out.write("                <TD colSpan=2 height=4></TD>\r\n");
      out.write("              </TR>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD colSpan=2 height=6></TD>\r\n");
      out.write("              </TR>\r\n");
      out.write("            </TBODY>\r\n");
      out.write("          </TABLE>\r\n");
      out.write("            <TABLE style=\"BORDER-COLLAPSE: collapse\" cellPadding=0 width=100 border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("                <TR>\r\n");
      out.write("                  <TD height=10></TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("              </TBODY>\r\n");
      out.write("            </TABLE>\r\n");
      out.write("          <TABLE style=\"BORDER-RIGHT: #8ed233 1px solid; BORDER-TOP: #8ed233 1px solid; BORDER-LEFT: #8ed233 1px solid; BORDER-BOTTOM: #8ed233 1px solid; BORDER-COLLAPSE: collapse\"  width=180 border=0 height=\"350\">\r\n");
      out.write("              <TBODY>\r\n");
      out.write("                <TR>\r\n");
      out.write("                  <TD background=images/table_bg_03.gif height=25>&nbsp;<IMG \r\n");
      out.write("            height=13 src=\"images/icon_arrow_01.gif\" width=13 \r\n");
      out.write("            align=absMiddle border=0>&nbsp;&nbsp;<B><FONT \r\n");
      out.write("            class=text_b09>功能菜单</FONT></B></TD>\r\n");
      out.write("                  <TD align=right background=images/table_bg_03.gif></TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("\t\t\t\t");

					if(session.getValue("qx") != null&&!session.getValue("qx").equals("")){
						if(session.getValue("qx").equals("教师")){
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR height=30>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <TD>&nbsp;<FONT class=text_b04>・</FONT> &nbsp;<A class=link_b10  href=\"zjsj.jsp\" target=MainFrame>增加试卷</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR height=30>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <TD colSpan=2>&nbsp;<FONT class=text_b04>・</FONT> &nbsp;<A class=link_b10  href=\"editsj.jsp\" target=MainFrame>查看试卷</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t");

						}else{
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR height=30>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <TD>&nbsp;<FONT class=text_b04>・</FONT> &nbsp;<A class=link_b10  href=\"zjsj.jsp\" target=MainFrame>增加试卷</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR height=30>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <TD colSpan=2>&nbsp;<FONT class=text_b04>・</FONT> &nbsp;<A class=link_b10  href=\"editsj.jsp\" target=MainFrame>查看试卷</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR height=30>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <TD colSpan=2>&nbsp;<FONT class=text_b04>・</FONT> &nbsp;<A class=link_b10  href=\"addtkt.jsp\" target=MainFrame>填空题录入</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR height=30>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <TD colSpan=2>&nbsp;<FONT class=text_b04>・</FONT> &nbsp;<A class=link_b10  href=\"addxzt.jsp\" target=MainFrame>选择题录入</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR height=30>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <TD colSpan=2>&nbsp;<FONT class=text_b04>・</FONT> &nbsp;<A class=link_b10  href=\"addjdt.jsp\" target=MainFrame>简答题录入</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR height=30>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <TD colSpan=2>&nbsp;<FONT class=text_b04>・</FONT> &nbsp;<A class=link_b10  href=\"addjst.jsp\" target=MainFrame>计算题录入</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t");

							}
				}
				
      out.write("\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("                  <TD colSpan=2></TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("              </TBODY>\r\n");
      out.write("          </TABLE></TD>\r\n");
      out.write("        <TD vAlign=top width=10><IMG height=1 src=\"images/space.gif\" \r\n");
      out.write("      width=10 border=0></TD>\r\n");
      out.write("        <TD vAlign=top align=middle width=660>\r\n");
      out.write("\t\t<TABLE style=\"BORDER-RIGHT: #7bd7e7 1px solid; BORDER-TOP: #7bd7e7 1px solid; BORDER-LEFT: #7bd7e7 1px solid; BORDER-BOTTOM: #7bd7e7 1px solid; BORDER-COLLAPSE: collapse\" cellPadding=4 width=\"100%\" border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("                <TR>\r\n");
      out.write("                  <TD background=images/table_bg_02.gif height=25>&nbsp;\r\n");
      out.write("\t\t\t\t  <IMG  height=16 src=\"images/icon_keyword.gif\" width=16 align=absMiddle border=0>&nbsp;&nbsp;<B>\r\n");
      out.write("\t\t\t\t<FONT class=text_b07>操作区域</FONT></B></TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("                <TR>\r\n");
      out.write("                  <TD height=3>\r\n");
      out.write("\t\t\t\t\t  <IFRAME frameBorder=0 frameSpacing=0 height=450 marginHeight=0 marginWidth=0 scrolling=auto name=MainFrame src=\"welcome.jsp\" width=100%></IFRAME>\r\n");
      out.write("\t\t\t\t  </TD>\r\n");
      out.write("                </TR>\r\n");
      out.write("              </TBODY>\r\n");
      out.write("          </TABLE>\r\n");
      out.write("        </TD>\r\n");
      out.write("      </TR>\r\n");
      out.write("    </TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<br>\r\n");
      out.write("<div align=center>\r\n");
      out.write("\t<B>Copyright 2006-2007 最佳浏览分辩率：1024*768</B>\r\n");
      out.write("</div>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
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
