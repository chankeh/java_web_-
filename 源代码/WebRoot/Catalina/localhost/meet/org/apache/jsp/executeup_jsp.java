package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.jspsmart.upload.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import mypackage.*;
import java.util.*;

public final class executeup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>上传处理</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");


   System.err.println("gfcfsdf");
	String alias="";
	//实例化上载bean
	SmartUpload mySmartUpload=new SmartUpload();
	//初始化
	mySmartUpload.initialize(pageContext); 
	//设置上载的最大值,注意:如果这里设置过大会出现问题!
	mySmartUpload.setMaxFileSize(500 * 1024*1024);
	//设置可以上传的文件扩展类型。
	//mySmartUpload.setDeniedFilesList("jpeg,jpg,gif,bmp");
	//上载文件
	mySmartUpload.upload();
	//循环取得所有上载的文件
	for (int i=0;i<mySmartUpload.getFiles().getCount();i++){
		//取得上载的文件
		com.jspsmart.upload.File myFile = mySmartUpload.getFiles().getFile(i);
		if (!myFile.isMissing()){
			//生成上传时间及记录ID 
			Calendar c = Calendar.getInstance();
			Date date = c.getTime();
			String id=new SimpleDateFormat("yyyyMMddHHmmss").format(date);
			String upTime =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);//当前系统时间
			//取得上载的文件的文件名
			String myFileName=myFile.getFileName();
			//取得不带后缀的文件名
			String  suffix=myFileName.substring(0,myFileName.lastIndexOf('.'));
			//取得后缀名
			String  ext= mySmartUpload.getFiles().getFile(0).getFileExt();  
			//取得文件的大小  
			double fileSize=(double)myFile.getSize()/1024;
			//保存路径
			String trace=getServletContext().getRealPath("/")+"upload/";
			//alias=suffix+"("+id+")"+"."+ext;
			alias=id+"."+ext;
			//将文件保存在服务器端 
			myFile.saveAs(trace+DateFormate.toUtf8String(alias),SmartUpload.SAVE_PHYSICAL);
			
		}
	}

      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\talert(\"文件上传成功\");\r\n");
      out.write("\twindow.returnValue=\"");
      out.print(DateFormate.toUtf8String(alias));
      out.write("\";\r\n");
      out.write("\twindow.opener=null;\r\n");
      out.write("\twindow.close();\r\n");
      out.write("</script>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<iframe  width=\"0\" height=\"0\"></iframe>\r\n");
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
