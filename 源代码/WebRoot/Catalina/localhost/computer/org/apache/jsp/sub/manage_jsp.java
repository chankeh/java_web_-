package org.apache.jsp.sub;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.bwm.db.Condb;
import java.util.Date;
import java.util.Vector;
import com.bwm.cart.buyList;

public final class manage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
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
 request.setCharacterEncoding("gb2312"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>生成订单</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	Date date=new Date();
	String dat=date.toLocaleString();
	Condb con=new Condb();
	String subid=request.getParameter("subid");
	String username=request.getParameter("username");
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String address=request.getParameter("address");
	String post=request.getParameter("post");
	String pay=request.getParameter("pay");
	String teleph=request.getParameter("teleph");
	String carry=request.getParameter("carry");
	String demo=request.getParameter("demo");
	String sql="insert into tb_Sub(Sub,Username,Rname,Spdate,Email,Address,Post,Payment,Photo,Carry,Spif,Other) values('"+subid+"','"+username+"','"+name+"','"+dat+"','"+email+"','"+address+"','"+post+"','"+pay+"','"+teleph+"','"+carry+"','"+0+"','"+demo+"')";
	int temp=con.executeUpdate(sql);
	Vector shop=(Vector)session.getAttribute("shop");
	int number=0;
	int price=0;
	int num=0;
	for(int i=0;i<shop.size();i++){
		buyList mylist=(buyList)shop.elementAt(i);
		String warename=mylist.warename;
		price=mylist.price;
		number=mylist.number;
		String str="insert into tb_Shop(Subid,Warename,Price,Wsum,Wcount)values('"+subid+"','"+warename+"','"+price+"','"+number+"','"+number*price+"')";
		int te=con.executeUpdate(str);
	}	
	if(temp>0){
		out.println("<script language='javascript'>alert('订单生成');window.location.href='../index.jsp';</script>");
	}else{
		out.println("<script language='javascript'>alert('订单无效');history.back();</script>");
	}
	
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
