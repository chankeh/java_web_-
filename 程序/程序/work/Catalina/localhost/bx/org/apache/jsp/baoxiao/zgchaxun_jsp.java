package org.apache.jsp.baoxiao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.sql.*;

public final class zgchaxun_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>无标题文档</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("\tbackground-color: #CCFFFF;\r\n");
      out.write("}\r\n");
      out.write("a:link {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:visited {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:hover {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:active {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"../Style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<p>\r\n");

		request.setCharacterEncoding("gb2312");
		Connection conn = null;
		Statement stmt = null;//状态集
		ResultSet rs=null;//记录集
		String sql="";
		String id="";
		String coursename="";
		
		float fprice=0;
		float fbxmoney=0;
		float fuserbxmoney=0;
    	float fschbxmoney=0;
		String sprice="";
		String sbxmoney="";
		String suserbxmoney="";
    	String sschbxmoney="";
		
		String userbxno="";
    	String bxdate="";
    	String userid="";
    	String bxname="";
    	String rate="";
    	String bxcount="";
    	String price="";
    	String bxmoney="";
    	String userbxmoney="";
    	String schbxmoney="";
    	String invoiceno="";
    	String hospital="";
	
		DecimalFormat df = new DecimalFormat("#.00");   


      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("<table width=\"200\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"34\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"790\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td align=\"right\" class=\"lanse\"><a href=\"xschaxun.jsp\" class=\"lanse\">&gt;&gt; 学生报销信息查询</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"790\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td height=\"52\" align=\"center\" class=\"huanying1\">职工报销信息查询</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"790\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\"><form name=\"form1\" method=\"post\" action=\"zgchaxun.jsp\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"200\" height=\"42\" class=\"huanying1\">&nbsp;</td>\r\n");
      out.write("    <td width=\"100\" align=\"center\" class=\"lanse\">职工编号</td>\r\n");
      out.write("    <td width=\"190\" align=\"center\" class=\"huanying1\">\r\n");
      out.write("      <input name=\"name\" type=\"text\" class=\"zhengwen\">    </td>\r\n");
      out.write("    <td width=\"100\" align=\"center\" class=\"huanying1\"><input name=\"Submit\" type=\"submit\" class=\"lanse\" value=\"查询\"></td>\r\n");
      out.write("    <td width=\"208\" class=\"huanying1\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</form></table>\r\n");
      out.write("<table width=\"791\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#0000FF\">\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0033FF\" class=\"baise\">\r\n");
      out.write("    <td width=\"40\" height=\"33\">编号</td>\r\n");
      out.write("    <td width=\"80\">报销时间</td>\r\n");
      out.write("    <td width=\"100\">职工编号</td>\r\n");
      out.write("    <td width=\"100\">报销内容</td>\r\n");
      out.write("    <td width=\"35\">报销比例</td>\r\n");
      out.write("    <td width=\"26\">数量</td>\r\n");
      out.write("    <td width=\"50\">单价</td>\r\n");
      out.write("    <td width=\"60\">总额</td>\r\n");
      out.write("    <td width=\"60\">职工应付金额</td>\r\n");
      out.write("    <td width=\"60\">学校应付金额</td>\r\n");
      out.write("    <td width=\"77\">发票号</td>\r\n");
      out.write("    <td width=\"77\">开票单位</td>\r\n");
      out.write("  </tr>\r\n");

	try{
		sql="";
		coursename=request.getParameter("name");
		
		if(coursename!=null&&!coursename.equals("")){
			sql="select * from t_bx_employee where userid='"+coursename+"'";
		}
		else{
		sql="";
		}

		rs=dbc.executeQuery(sql);
		String pageNo="";
	//分页
	
	if(request.getParameter("pageNo") != null)
	{
		pageNo = request.getParameter("pageNo");
		session.setAttribute("PAGENO", pageNo);
		sql=(String)session.getAttribute("strSql");
	}
	else if(session.getAttribute("PAGENO") != null){
		pageNo = (String)session.getAttribute("PAGENO");
		
		}
	else{
		pageNo = "1";
		session.setAttribute("strSql",sql);
		}
	//获取当前页码
	int intCount =10;			//每页显示的记录数
	int intNum=0;				//判断是否有数据
	int t = 0;	//总记录数
	int mtotal = 0;			//总页数
	int j = 0;				//当前页数

	rs=dbc.executeQuery(sql);
	while(rs.next()){
		t=t+1;
	}
			
	//求出总页数	
	if((t%intCount) > 0)
		mtotal=t/intCount+1;
	else 
		mtotal=t/intCount;
		
	//获得当前页数
	
	j = Integer.parseInt(pageNo);
	//当j的值小于1时，赋值为1
	if(j < 1)
		j = 1;
	//当j的值大于总页数时，赋值为mtotal
	if(j > mtotal)
		j = mtotal;
	rs=dbc.executeQuery(sql);
	//获得当前显示页的记录
	for(int k = 0;k < (j-1)*intCount;k++) {	 
		if(rs.next()){}
			
		else
			break;
	}
	int m = 0;
	while(rs.next()){
		intNum = 1;
		if(m >= intCount)
			break;
		m = m+1;
		
		userbxno=rs.getString("userbxno");
		bxdate=rs.getString("bxdate");
		userid=rs.getString("userid");
		bxname=rs.getString("bxname");
		rate=rs.getString("rate");
		bxcount=rs.getString("bxcount");
    	price=rs.getString("price");
    	bxmoney=rs.getString("bxmoney");
    	userbxmoney=rs.getString("userbxmoney");
    	schbxmoney=rs.getString("schbxmoney");
    	invoiceno=rs.getString("invoiceno");
    	hospital=rs.getString("hospital");
		
		fprice=Float.valueOf(price).floatValue();
		sprice=df.format(fprice);
		fbxmoney=Float.valueOf(bxmoney).floatValue();
		sbxmoney=df.format(fbxmoney);
		fuserbxmoney=Float.valueOf(userbxmoney).floatValue();
		suserbxmoney=df.format(fuserbxmoney);
		fschbxmoney=Float.valueOf(schbxmoney).floatValue();
		sschbxmoney=df.format(fschbxmoney);
		
      out.write("\r\n");
      out.write("    <tr align=\"center\" class=\"zhengwen\">\r\n");
      out.write("\t<td width=\"40\" height=\"33\">");
      out.print(userbxno);
      out.write("</td>\r\n");
      out.write("    <td width=\"80\">");
      out.print(bxdate);
      out.write("</td>\r\n");
      out.write("    <td width=\"100\">");
      out.print(userid);
      out.write("</td>\r\n");
      out.write("    <td width=\"100\">");
      out.print(bxname);
      out.write("</td>\r\n");
      out.write("    <td width=\"35\">");
      out.print(rate);
      out.write("%</td>\r\n");
      out.write("    <td width=\"26\">");
      out.print(bxcount);
      out.write("</td>\r\n");
      out.write("    <td width=\"50\">");
      out.print(sprice);
      out.write("</td>\r\n");
      out.write("    <td width=\"60\">");
      out.print(sbxmoney);
      out.write("</td>\r\n");
      out.write("    <td width=\"60\">");
      out.print(suserbxmoney);
      out.write("</td>\r\n");
      out.write("    <td width=\"60\">");
      out.print(sschbxmoney);
      out.write("</td>\r\n");
      out.write("    <td width=\"77\">");
      out.print(invoiceno);
      out.write("</td>\r\n");
      out.write("    <td width=\"77\">");
      out.print(hospital);
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write(" ");

	if(intNum!=0)
	{ 

      out.write("\r\n");
      out.write("    </p>\r\n");
      out.write("  <table width=\"79%\" border=\"0\" align=\"center\" cellpadding=\"1\" cellspacing=\"1\" class=\"font9\">\r\n");
      out.write("<tr> \r\n");
      out.write("<td width=\"29%\" height=\"14\" align=\"center\" class=\"lanse\">&nbsp;</td>\r\n");
      out.write("<td width=\"71%\" class=\"style13\"><div align=\"right\" class=\"lanse\">\r\n");
      out.write("  <div align=\"right\" class=\"lanse\">\r\n");
      out.write("    ");
 
//以下代码行是用来显示页面数的 
//当j大于1时，就会显示“第一页”、“上一页”字样 
	if(j > 1) 
	{ 

      out.write("\r\n");
      out.write("    <a href=\"zgchaxun.jsp?pageNo=1&name=");
      out.print(coursename);
      out.write("\" class=\"lanse\">首页</a>\r\n");
      out.write("    ");
 
		int ii = Integer.parseInt(pageNo,8); //同pageCount
		if(ii>mtotal)//如果输入的页码大于最大页码
		{
			ii=mtotal;
		}

    	if(ii > 1) 
        ii = ii -1; 
    	String ssTmp = Integer.toString(ii); 

      out.write("\r\n");
      out.write("    | <a href=\"zgchaxun.jsp?pageNo=");
      out.print(ssTmp);
      out.write("&name=");
      out.print(coursename);
      out.write("\" class=\"lanse\">上一页</a> |\r\n");
      out.write("    ");
		
	}else{
		out.print("首页 | 上一页 | ");
	}
    
//--快速定位--------------------------------------	
	int pages = Integer.parseInt(pageNo,8);//4同pageCount
	int pagesBegin=0;
	int pagesEnd=0;
	if(pages>mtotal)
	{
		pages=mtotal;
	}
	//设置起点
	if(pages>3)
	{
		pagesBegin = pages-3;		
	}
	else{
		pagesBegin = 1;
	}
	//设置终点
	if((pages+3)<=mtotal)
	{
		pagesEnd = pages+3;
	}
	else{
		pagesEnd = mtotal;
	}

	while (pagesBegin<=pagesEnd)
	{
		if(j==pagesBegin){
			out.print(pagesBegin);
		}else{

      out.write("\r\n");
      out.write("    <a href=\"zgchaxun.jsp?pageNo=");
      out.print(pagesBegin);
      out.write("&name=");
      out.print(coursename);
      out.write('"');
      out.write('>');
      out.print(pagesBegin);
      out.write("</a>\r\n");
      out.write("    ");

		}
		pagesBegin=pagesBegin+1;
	}
//----快速定位结束------------------------------------

      out.write("\r\n");
      out.write("    |\r\n");
      out.write("    ");
 	
	//同样地，当j小于总逻辑页数时，就会显示“下一页”、“最后页”字样 
	if(j < mtotal) 
	{ 
    	int ii = Integer.parseInt(pageNo,8); 
    	if(ii < mtotal) 
        ii = ii + 1; 
    	String ssTmp = Integer.toString(ii); 

      out.write("\r\n");
      out.write("    <a href=\"zgchaxun.jsp?pageNo=");
      out.print(ssTmp);
      out.write("&name=");
      out.print(coursename);
      out.write("\" class=\"lanse\"> 下一页</a> | <a href=\"zgchaxun.jsp?pageNo=");
      out.print(mtotal);
      out.write("&name=");
      out.print(coursename);
      out.write("\" class=\"lanse\">末页</a>\r\n");
      out.write("    ");
 
	}else{
		out.print("下一页 | 末页");
	}
	if(mtotal < j) 
    	j = mtotal;

      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");

			
			}//out.print("aaaaa");
}catch(Exception e){
			e.printStackTrace();
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
