package org.apache.jsp.baoxiao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.sql.*;
import java.lang.*;

public final class templog_jsp extends org.apache.jasper.runtime.HttpJspBase
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
		Connection conn = null;
		Statement stmt = null;//状态集
		ResultSet rs=null;//记录集
		String sql="";
		String bxdate="";
		String userid="";
		String bxname="";
		String rate="";
		String bxcount="";
		String price="";
		
		String invoiceno="";
		String hospital="";
		String mark="";
		String idno="";

		mark=request.getParameter("mark");
	    int id = Integer.parseInt(mark);
	    switch(id){
	   	case 1://职工临时报销
			bxdate=request.getParameter("bxdate");
			userid=request.getParameter("yonghuid");
			bxname=request.getParameter("bxname");
			rate=request.getParameter("rate");
			bxcount=request.getParameter("bxcount");
			price=request.getParameter("price");
			
			float drate=Float.valueOf(rate).floatValue();
			float dbxcount=Float.valueOf(bxcount).floatValue();
			float dprice=Float.valueOf(price).floatValue();
			
			float dbxmoney=0;
			float duserbxmoney=0;
			float dschbxmoney=0;
			
			dbxmoney=dprice*dbxcount;
			dschbxmoney=dbxmoney*drate/100;
			duserbxmoney=dbxmoney-dschbxmoney;

			invoiceno=request.getParameter("invoiceno");
			hospital=request.getParameter("hospital");
			sql="insert into t_bx_temp (bxdate,userid,bxname,rate,bxcount,price,bxmoney,userbxmoney,schbxmoney,invoiceno,hospital) values ('"+bxdate+"','"+userid+"','"+bxname+"','"+rate+"','"+bxcount+"','"+price+"','"+dbxmoney+"','"+duserbxmoney+"','"+dschbxmoney+"','"+invoiceno+"','"+hospital+"')";
			rs=dbc.executeQuery(sql);
			response.sendRedirect("empbx.jsp");
			break;
		case 2://学生临时报销
			bxdate=request.getParameter("bxdate");
			userid=request.getParameter("yonghuid");
			bxname=request.getParameter("bxname");
			rate=request.getParameter("rate");
			bxcount=request.getParameter("bxcount");
			price=request.getParameter("price");
			
			float frate=Float.valueOf(rate).floatValue();
			float fbxcount=Float.valueOf(bxcount).floatValue();
			float fprice=Float.valueOf(price).floatValue();
			
			float fbxmoney=0;
			float fuserbxmoney=0;
			float fschbxmoney=0;
			
			fbxmoney=fprice*fbxcount;
			fschbxmoney=fbxmoney*frate/100;
			fuserbxmoney=fbxmoney-fschbxmoney;

			invoiceno=request.getParameter("invoiceno");
			hospital=request.getParameter("hospital");
			sql="insert into t_bx_temp (bxdate,userid,bxname,rate,bxcount,price,bxmoney,userbxmoney,schbxmoney,invoiceno,hospital) values ('"+bxdate+"','"+userid+"','"+bxname+"','"+rate+"','"+bxcount+"','"+price+"','"+fbxmoney+"','"+fuserbxmoney+"','"+fschbxmoney+"','"+invoiceno+"','"+hospital+"')";
			rs=dbc.executeQuery(sql);
			response.sendRedirect("stubx.jsp");
			break;
		case 3://删除一条职工临时报销
			idno=request.getParameter("idno");
			sql="delete from t_bx_temp where userbxno="+idno;
			rs=dbc.executeQuery(sql);
			response.sendRedirect("empbx.jsp");
			break;
		case 4://删除一条学生临时报销
			idno=request.getParameter("idno");
			sql="delete from t_bx_temp where userbxno="+idno;
			rs=dbc.executeQuery(sql);
			response.sendRedirect("stubx.jsp");
			break;
		}

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
