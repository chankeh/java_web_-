package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.bwm.db.Condb;
import com.bwm.cart.buyList;
import java.util.Vector;
import com.bwm.string.Str;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<title>添加购物车</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");

Condb con=new Condb();
Str chr=new Str();
	/*if(session.getAttribute("username")==null){

      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\talert(\"你必须先登录后才能查看购物车\");\r\n");
      out.write("\twindow.location.href=\"../index.jsp\";\r\n");
      out.write("</script>\r\n");
	
	}*/
	String pn=chr.toChinese(request.getParameter("pname"));
	String sql="select * from tb_Ware where Warename='"+pn+"'";
	ResultSet rs=con.executeQuery(sql);
	String warename="";
	int price=0;
	if(rs.next()){
		warename=rs.getString(2);
		price=rs.getInt(3);
		
	}
	buyList mylist=new buyList();
	mylist.warename=warename;
	mylist.price=price;
	mylist.number=1;
	boolean listFlag=true;
	Vector shop=(Vector)session.getAttribute("shop");
	if(shop==null){
		shop=new Vector();
	}
	else{
		for(int i=0;i<shop.size();i++){
			buyList list=(buyList)shop.elementAt(i);
			if(list.warename==mylist.warename){
				list.number++;
				shop.setElementAt(list,i);
				listFlag=false;
			}
		}
	}
	if(listFlag)shop.addElement(mylist);
	session.setAttribute("shop",shop);
	rs.close();

      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("alert(\"商品已成功添加到购物车\");\r\n");
      out.write("window.location.href=\"../user/order.jsp\";\r\n");
      out.write("</script>\r\n");
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
