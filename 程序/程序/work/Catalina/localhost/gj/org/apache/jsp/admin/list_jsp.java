package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import java.sql.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>沈阳公交详细信息</title>\r\n");
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
      out.write("\tcolor: #9999FF;\r\n");
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {\r\n");
      out.write("\tcolor: #00CC00;\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tfont-size: 24px;\r\n");
      out.write("}\r\n");
      out.write(".style2 {\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #4A93FF;\r\n");
      out.write("}\r\n");
      out.write(".style4 {font-size: 12px; font-family: \"幼圆\";}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/JavaScript\">\r\n");
      out.write("<!--\r\n");
      out.write("function MM_reloadPage(init) {  //reloads the window if Nav4 resized\r\n");
      out.write("  if (init==true) with (navigator) {if ((appName==\"Netscape\")&&(parseInt(appVersion)==4)) {\r\n");
      out.write("    document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; }}\r\n");
      out.write("  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();\r\n");
      out.write("}\r\n");
      out.write("MM_reloadPage(true);\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<p>\r\n");

		request.setCharacterEncoding("gb2312");
		ResultSet rs=null;//记录集
		String sql="";
		//String id="";
		//String coursename="";
		//String ypno="";

      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<table width=\"790\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"798\" height=\"72\" align=\"center\" class=\"huanying1 style1\"><img src=\"header_background_aqua.jpg\" width=\"792\" height=\"72\">\r\n");
      out.write("  <div id=\"Layer2\" style=\"position:absolute; width:89px; height:13px; z-index:2; left: 799px; top: 96px; font-size: 14px; color: #0033FF;\">管理员专用</div>\r\n");
      out.write("  <div id=\"Layer1\" style=\"position:absolute; width:272px; height:27px; z-index:1; left: 359px; top: 73px; color: #0033FF; font-family: &quot;华文新魏&quot;;\">沈阳公交详细信息</div></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"790\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#0000FF\">\r\n");
      out.write("  <tr align=\"center\" bordercolor=\"#FFFFFF\" bgcolor=\"#0033FF\" class=\"baise\">\r\n");
      out.write("    <td width=\"100\" height=\"33\">车次</td>\r\n");
      out.write("    <td width=\"480\">车站</td>\r\n");
      out.write("    <td width=\"100\">修改</td>\r\n");
      out.write("    <td width=\"100\">删除</td>\r\n");
      out.write("  </tr>\r\n");

	try{
		sql="select * from cc";
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
		                                              
		String idno=rs.getString("cci");
		
		
      out.write("\r\n");
      out.write("    <tr align=\"center\" class=\"zhengwen\">\r\n");
      out.write("\t<td width=\"100\" height=\"33\" align=\"center\">");
      out.print(idno);
      out.write("</td>\r\n");
      out.write("    <td width=\"480\" align=\"left\">");
      out.print(rs.getString("czan"));
      out.write("</td>\r\n");
      out.write("    <td width=\"100\" align=\"center\"><a href=\"update.jsp?idno=");
      out.print(idno);
      out.write("\" class=\"lanse\"> 修改 </a></td>\r\n");
      out.write("    <td width=\"100\" align=\"center\"><a href=\"log.jsp?mark=3&idno=");
      out.print(idno);
      out.write("\" class=\"lanse\"> 删除 </a></td> \r\n");
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
      out.write("<td width=\"29%\" height=\"14\" align=\"center\" class=\"lanse\"><div align=\"left\"><a href=\"new.jsp\" class=\"lanse\">--<strong>添加车次</strong></a></div></td>\r\n");
      out.write("<td width=\"71%\" class=\"style13\"><div align=\"right\" class=\"lanse\">\r\n");
      out.write("  <div align=\"right\" class=\"lanse\">\r\n");
      out.write("    ");
 
//以下代码行是用来显示页面数的 
//当j大于1时，就会显示“第一页”、“上一页”字样 
	if(j > 1) 
	{ 

      out.write("\r\n");
      out.write("    <a href=\"list.jsp?pageNo=1\" class=\"lanse\">首页</a>\r\n");
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
      out.write("    | <a href=\"list.jsp?pageNo=");
      out.print(ssTmp);
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
      out.write("    <a href=\"list.jsp?pageNo=");
      out.print(pagesBegin);
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
      out.write("    <a href=\"list.jsp?pageNo=");
      out.print(ssTmp);
      out.write("\" class=\"lanse\"> 下一页</a> | <a href=\"list.jsp?pageNo=");
      out.print(mtotal);
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
      out.write("  <table width=\"790\" border=\"0\" align=\"center\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td><div align=\"right\"><span class=\"style2\">--</span><span class=\"style4\"><a href=\"../stationsearch.jsp\">返回查询页面</a></span></div></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  <p>\r\n");
      out.write("    ");

			
			}//out.print("aaaaa");
}catch(Exception e){
			e.printStackTrace();
			}

      out.write("\r\n");
      out.write("</p>\r\n");
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
