package org.apache.jsp.baoxiao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.sql.*;
import java.lang.*;
import MyBean.zgbx;
import MyBean.xsbx;

public final class xxlog_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
      out.write('	');
      MyBean.dbcon dbc = null;
      synchronized (session) {
        dbc = (MyBean.dbcon) _jspx_page_context.getAttribute("dbc", PageContext.SESSION_SCOPE);
        if (dbc == null){
          dbc = new MyBean.dbcon();
          _jspx_page_context.setAttribute("dbc", dbc, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>医疗报销系统</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");

		request.setCharacterEncoding("gb2312");
		ResultSet rs=null;//记录集
		String sql="";
		String mark="";

		mark=request.getParameter("mark");
	    int id = Integer.parseInt(mark);
	    switch(id){
	   	case 1://职工报销
			sql="select * from t_bx_temp";
			rs=dbc.executeQuery(sql);
			while(rs.next()){

			zgbx rg=new zgbx();
         	rg.setBxdate(rs.getString("bxdate"));
         	rg.setUserid(rs.getString("userid"));
         	rg.setBxname(rs.getString("bxname"));
         	rg.setRate(rs.getString("rate"));
         	rg.setBxcount(rs.getString("bxcount"));
		 	rg.setPrice(rs.getString("price"));
			rg.setBxmoney(rs.getString("bxmoney"));
			rg.setUserbxmoney(rs.getString("userbxmoney"));
			rg.setSchbxmoney(rs.getString("schbxmoney"));
			rg.setInvoiceno(rs.getString("invoiceno"));
			rg.setHospital(rs.getString("hospital"));
			int rt=rg.userBx();
			
			}
			response.sendRedirect("endbx.jsp");
			break;
		case 2://学生报销
			sql="select * from t_bx_temp";
			rs=dbc.executeQuery(sql);
			while(rs.next()){
			
			xsbx rg=new xsbx();
         	rg.setBxdate(rs.getString("bxdate"));
         	rg.setUserid(rs.getString("userid"));
         	rg.setBxname(rs.getString("bxname"));
         	rg.setRate(rs.getString("rate"));
         	rg.setBxcount(rs.getString("bxcount"));
		 	rg.setPrice(rs.getString("price"));
			rg.setBxmoney(rs.getString("bxmoney"));
			rg.setUserbxmoney(rs.getString("userbxmoney"));
			rg.setSchbxmoney(rs.getString("schbxmoney"));
			rg.setInvoiceno(rs.getString("invoiceno"));
			rg.setHospital(rs.getString("hospital"));
			int rt=rg.userBx();
			
			}
			response.sendRedirect("endbx.jsp");
			break;
		case 3://报销比例
			String ypcname=request.getParameter("ypcname");
			String bxbl=request.getParameter("bxbl");
			sql="update t_yp set bxbl='"+bxbl+"' where ypcname='"+ypcname+"'";
			rs=dbc.executeQuery(sql);
			response.sendRedirect("bili.jsp");
			break;
		}

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
