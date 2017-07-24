package org.apache.jsp.admin.news;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.fredck.FCKeditor.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/FCKeditor.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_FCK_editor_width_tabSpaces_skinPath_linkUploadURL_linkBrowserURL_imageUploadURL_imageBrowserURL_id_height_flashUploadURL_flashBrowserURL_defaultLanguage_basePath;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_FCK_editor_width_tabSpaces_skinPath_linkUploadURL_linkBrowserURL_imageUploadURL_imageBrowserURL_id_height_flashUploadURL_flashBrowserURL_defaultLanguage_basePath = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_FCK_editor_width_tabSpaces_skinPath_linkUploadURL_linkBrowserURL_imageUploadURL_imageBrowserURL_id_height_flashUploadURL_flashBrowserURL_defaultLanguage_basePath.release();
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

      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      com.bean.SystemBean sn = null;
      synchronized (_jspx_page_context) {
        sn = (com.bean.SystemBean) _jspx_page_context.getAttribute("sn", PageContext.PAGE_SCOPE);
        if (sn == null){
          sn = new com.bean.SystemBean();
          _jspx_page_context.setAttribute("sn", sn, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      com.bean.NewsBean newsb = null;
      synchronized (_jspx_page_context) {
        newsb = (com.bean.NewsBean) _jspx_page_context.getAttribute("newsb", PageContext.PAGE_SCOPE);
        if (newsb == null){
          newsb = new com.bean.NewsBean();
          _jspx_page_context.setAttribute("newsb", newsb, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String dir=sn.getDir();

      out.write("\r\n");
      out.write("<HTML><HEAD><TITLE>后台操作区</TITLE>\r\n");
      out.write("<LINK href=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/images/Admin_Style.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<LINK href=\"");
      out.print(basePath );
      out.print(dir );
      out.write("/images/style.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("FCKeditor/fckeditor.js\"></script> \r\n");
      out.write("<STYLE type=text/css>\r\n");
      out.write("BODY {\r\n");
      out.write("\tMARGIN-LEFT: 0px; BACKGROUND-COLOR: #ffffff\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {color: #ECE9D8}\r\n");
      out.write("</STYLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function sub()\r\n");
      out.write("{\r\n");
      out.write("\tif(document.form1.title.value.replace(/\\s+$|^\\s+/g,\"\").length<=0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"请输入新闻标题！\");\r\n");
      out.write("\t\tdocument.form1.title.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(document.form1.pic.value.replace(/\\s+$|^\\s+/g,\"\").length>0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar fileext=form1.pic.value.substring(form1.pic.value.length-4,form1.pic.value.length); \r\n");
      out.write("\t\tfileext=fileext.toLowerCase(); \r\n");
      out.write("\t\tif(!(fileext=='.jpg')&&!(fileext=='.gif')) \r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"对不起，文件格式不对,必须为jpg或gif格式文件!\"); \r\n");
      out.write("\t\t\tform1.pic.focus(); \r\n");
      out.write("\t\t\treturn false; \r\n");
      out.write("\t\t} \r\n");
      out.write("\t\tvar filestr = document.form1.pic.value;\r\n");
      out.write("\t \tvar fso,f; \r\n");
      out.write("\t \tfso=new ActiveXObject(\"Scripting.FileSystemObject\");  \r\n");
      out.write("\t \tf=fso.GetFile(filestr); \r\n");
      out.write("\t \tif(f.size>300*1024)\r\n");
      out.write("\t \t{\r\n");
      out.write("\t \t\talert(\"对不起，图片过大（300K以上），请裁剪后再上传！\"); \r\n");
      out.write("\t \t\tform1.pic.focus(); \r\n");
      out.write("\t \t\treturn false;\r\n");
      out.write("\t \t}\r\n");
      out.write("\t}\r\n");
      out.write("\t \r\n");
      out.write("\tform1.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");

String message = (String)request.getAttribute("message");
	if(message == null){
		message = "";
	}
	if (!message.trim().equals("")){
		out.println("<script language='javascript'>");
		out.println("alert('"+message+"');");
		out.println("</script>");
	}
	request.removeAttribute("message");

      out.write('\r');
      out.write('\n');

	String username=(String)session.getAttribute("user");
	if(username==null){
		response.sendRedirect(path+"/error.jsp");
	}
	else{
		String method=request.getParameter("method");
		String ifhide = "";	
		String title="";
		String content="";
		String id="";
		String s="如无缩略图请保持为空";
		if(method.equals("editnews")){
			id=request.getParameter("id").trim();
			List newsList=newsb.getOneNews(Integer.parseInt(id));
			title=newsList.get(1).toString();
			content=newsList.get(3).toString();
			ifhide=newsList.get(5).toString();
			s="如不修改请保留为空";
		}		
		String str1="";String str2="";
		if(ifhide.trim().equals("0")){
			str2="checked";
		}else{
			str1="checked";
		}

      out.write("\r\n");
      out.write("<BODY onload=\"document.form1.infoContent.value=document.form1.content.value\" >\r\n");
      out.write("<TABLE height=\"100%\" cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD align=\"left\" vAlign=top >\r\n");
      out.write("<table width='100%' cellspacing='1' cellpadding='3' bgcolor='#CCCCCC' class=\"tablewidth\">\r\n");
      out.write("<tr class=\"head\"> \r\n");
      out.write("      <td colspan=\"2\">     \r\n");

	if(method.trim().equals("ADDNEWS")){

      out.write("\r\n");
      out.write("        添加新闻 （新闻内容不能超过5000个字符）\r\n");
}else{
      out.write("\r\n");
      out.write("\t   修改新闻 （新闻内容不能超过5000个字符）\r\n");
} 
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\t<form name=\"form1\" action=\"");
      out.print(basePath );
      out.write("News.shtml\" method=\"post\"  enctype=\"multipart/form-data\" >\r\n");
      out.write("  <tr bgcolor='#FFFFFF'> <input type=\"hidden\" name=\"method\" value=\"");
      out.print(method );
      out.write("\"> <input type=\"hidden\" name=\"id\" value=\"");
      out.print(id );
      out.write("\">\r\n");
      out.write("    <td width='30%'><div align=\"right\">标&nbsp;&nbsp;&nbsp;&nbsp;题：</div></td>\r\n");
      out.write("    <td ><input name=\"title\" type=\"text\" id=\"title\" size=\"40\" maxlength=\"100\" value=\"");
      out.print(title );
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor='#FFFFFF'> \r\n");
      out.write("    <td width='30%'><div align=\"right\">缩&nbsp;略&nbsp;图：</div></td>\r\n");
      out.write("    <td ><input name=\"pic\" type=\"file\" contentEditable=false  size=\"40\" maxlength=\"150\" >&nbsp;<font color=red>300K以下gif或jpg格式图片");
      out.print(s );
      out.write("</font></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor='#FFFFFF'> \r\n");
      out.write("      <td width='30%'> \r\n");
      out.write("        <div align=\"right\">是否显示： </div>\r\n");
      out.write("      </td>\r\n");
      out.write("      <td bgcolor='#FFFFFF' > \r\n");
      out.write("        <input type=\"radio\" name=\"ifhide\" value=\"1\" ");
      out.print(str1 );
      out.write(">\r\n");
      out.write("        显示 \r\n");
      out.write("        <input type=\"radio\" name=\"ifhide\" value=\"0\" ");
      out.print(str2 );
      out.write(">\r\n");
      out.write("        不显示 </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  <tr bgcolor='#FFFFFF'> \r\n");
      out.write("    <td colspan=\"2\" valign=\"top\"><TEXTAREA style=\"display:none\" NAME=\"content\" ROWS=\"20\" COLS=\"70\">");
      out.print(content );
      out.write("</TEXTAREA>\t\r\n");
      out.write("\t  ");
      if (_jspx_meth_FCK_editor_0(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("     </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  <tr bgcolor='#FFFFFF'> \r\n");
      out.write("      <td colspan=\"2\" align=\"center\"> \r\n");
      out.write("        <input class=mmcinb type='button' name='button' value='提交数据' onclick='sub()'>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\t</form>\r\n");
      out.write("</table>\r\n");
      out.write("   </TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("  </TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("</BODY>\r\n");
} 
      out.write("\r\n");
      out.write("</HTML>\r\n");
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

  private boolean _jspx_meth_FCK_editor_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  FCK:editor
    com.fredck.FCKeditor.tags.FCKeditorTag _jspx_th_FCK_editor_0 = (com.fredck.FCKeditor.tags.FCKeditorTag) _jspx_tagPool_FCK_editor_width_tabSpaces_skinPath_linkUploadURL_linkBrowserURL_imageUploadURL_imageBrowserURL_id_height_flashUploadURL_flashBrowserURL_defaultLanguage_basePath.get(com.fredck.FCKeditor.tags.FCKeditorTag.class);
    _jspx_th_FCK_editor_0.setPageContext(_jspx_page_context);
    _jspx_th_FCK_editor_0.setParent(null);
    _jspx_th_FCK_editor_0.setId("infoContent");
    _jspx_th_FCK_editor_0.setBasePath("/Esf/FCKeditor/");
    _jspx_th_FCK_editor_0.setWidth("100%");
    _jspx_th_FCK_editor_0.setHeight("400");
    _jspx_th_FCK_editor_0.setSkinPath("/Esf/FCKeditor/editor/skins/silver/");
    _jspx_th_FCK_editor_0.setDefaultLanguage("zh-cn");
    _jspx_th_FCK_editor_0.setTabSpaces("8");
    _jspx_th_FCK_editor_0.setImageBrowserURL("/Esf/FCKeditor/editor/filemanager/browser/default/browser.html?Type=Image&Connector=connectors/jsp/connector");
    _jspx_th_FCK_editor_0.setLinkBrowserURL("/Esf/FCKeditor/editor/filemanager/browser/default/browser.html?Connector=connectors/jsp/connector");
    _jspx_th_FCK_editor_0.setFlashBrowserURL("/Esf/FCKeditor/editor/filemanager/browser/default/browser.html?Type=Flash&Connector=connectors/jsp/connector");
    _jspx_th_FCK_editor_0.setImageUploadURL("/Esf/FCKeditor/editor/filemanager/upload/simpleuploader?Type=Image");
    _jspx_th_FCK_editor_0.setLinkUploadURL("/Esf/FCKeditor/editor/filemanager/upload/simpleuploader?Type=File");
    _jspx_th_FCK_editor_0.setFlashUploadURL("/Esf/FCKeditor/editor/filemanager/upload/simpleuploader?Type=Flash");
    int _jspx_eval_FCK_editor_0 = _jspx_th_FCK_editor_0.doStartTag();
    if (_jspx_eval_FCK_editor_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_FCK_editor_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_FCK_editor_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_FCK_editor_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_FCK_editor_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_FCK_editor_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_FCK_editor_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_FCK_editor_width_tabSpaces_skinPath_linkUploadURL_linkBrowserURL_imageUploadURL_imageBrowserURL_id_height_flashUploadURL_flashBrowserURL_defaultLanguage_basePath.reuse(_jspx_th_FCK_editor_0);
    return false;
  }
}
