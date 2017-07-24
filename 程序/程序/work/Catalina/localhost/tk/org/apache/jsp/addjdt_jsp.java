package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class addjdt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<SCRIPT>\r\n");
      out.write("<!--\r\n");
      out.write("function Del(id){\r\n");
      out.write("\tif(confirm(\"是否删除此记录？\")){\r\n");
      out.write("\t\tdocument.editform.action = \"delsj.jsp?sjid=\"+id;\r\n");
      out.write("\t\tdocument.editform.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\telse return false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function Add(form){\r\n");
      out.write("\tstr = '';\r\n");
      out.write("\tif(form.tm.value=='') str += \"题目\\n\";\r\n");
      out.write("\tif(form.yxrq.value=='') str += \"有效天数\\n\";\r\n");
      out.write("\tif(form.fz.value=='') str += \"分数\\n\";\r\n");
      out.write("\tif(form.nyd.value=='') str += \"难易度\\n\";\r\n");
      out.write("\tif(str!=''){\r\n");
      out.write("\t\tstr = \"请填写好以下各项:\\n\" + str;\r\n");
      out.write("\t\talert(str);\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tform.action = \"sql.jsp?p=3\";\r\n");
      out.write("\tform.submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<BODY bottomMargin=0 bgColor=#ffffff leftMargin=0 topMargin=0 rightMargin=0>\r\n");
      out.write("<FORM METHOD=POST action=\"javascript:return false;\" name=\"editform\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"2\" cellspacing=\"2\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t  <td width=\"100%\" height=\"20\" class=\"a01\"><strong><font color=\"#FF0000\"><strong><font color=\"#FF0000\">::</font></strong>简答题录入<strong><font color=\"#FF0000\">::</font></strong></font></strong></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t  <td height=\"44\" colspan=\"3\" valign=\"top\">\r\n");
      out.write("\t  <table width=\"100%\"  border=\"1\" cellpadding=\"1\" cellspacing=\"3\" bordercolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td valign=\"top\">题目：</td>\r\n");
      out.write("\t\t\t\t<td><TEXTAREA NAME=\"tm\" ROWS=\"8\" cols=\"50\"></TEXTAREA></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>注意：</td>\r\n");
      out.write("\t\t\t\t<td>在录入答案时用'()'括起， 例如：<br>简要说明一下什么是DNA？<br>(DNA是AND的反过来写法)</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td >有效天数：</td>\r\n");
      out.write("\t\t\t\t<td><INPUT TYPE=\"text\" NAME=\"yxrq\">*请输入数字</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td >分数：</td>\r\n");
      out.write("\t\t\t\t<td><INPUT TYPE=\"text\" NAME=\"fz\">*请输入数字</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td >难易度：</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<SELECT NAME=\"nyd\">\r\n");
      out.write("\t\t\t\t\t\t<OPTION value='1' Selected>容易</OPTION>\r\n");
      out.write("\t\t\t\t\t\t<OPTION value='2' >难</OPTION>\r\n");
      out.write("\t\t\t\t\t</SELECT>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td><font color=\"#666666\"> <INPUT TYPE=\"submit\" onclick=\"Add(this.form);return false\" value=\"增加\" name=\"bc\"> <INPUT TYPE=\"reset\"></font></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t  </table>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");

	String action = "";
	String tm = "";
	action = request.getParameter("action");
	if((action!=null)&&(action.equals("ok"))){
		tm = request.getParameter("tkttm");
		//out.println(tkt_da(tm)[1]);
	}

      out.write("\r\n");
      out.write("</FORM>\r\n");
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
