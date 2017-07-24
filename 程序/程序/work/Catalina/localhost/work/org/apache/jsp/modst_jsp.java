package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackage.*;
import java.util.*;

public final class modst_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>增加人员</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE2 {\r\n");
      out.write("\tcolor: #0000CC;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write(" \tfunction check(){\r\n");
      out.write("\t\tvar myReg=new RegExp(\"^[0-9]+(\\.[0-9]{1,4})?$\");\r\n");
      out.write("\t\tvar identityCard = /^(\\d{15}|\\d{18})$/;\r\n");
      out.write("\t\tvar agetest=/^(\\d{1,3})$/;\r\n");
      out.write("\t\tif(document.opform.sname.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入名称！\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t \r\n");
      out.write("\t \t\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");


String sid="";
sid=DateFormate.toGb((String)request.getParameter("sid"));
stxx st=new stxx();
stxxop stop=new stxxop();
st=stop.getStxxbybh2(sid);


      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"opform\" method=\"post\" action=\"stop.jsp\" onsubmit=\"javascript:return check();\">\r\n");
      out.write("  <table width=\"675\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"1\" bordercolor=\"1\" bgcolor=\"#9EC3F2\" style=\"font-size:12px\">\r\n");
      out.write("  <!--DWLayoutTable-->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" colspan=\"4\" align=\"left\" valign=\"middle\" background=\"img/bg_titlebarr.gif\"><span class=\"STYLE1\">学生基本信息&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"126\" height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">姓名</td>\r\n");
      out.write("    <td width=\"248\" align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><input name=\"s_stu_xm\" type=\"text\" id=\"s_stu_xm\" value=\"");
      out.print(st.getS_stu_dabh());
      out.write("\" /></td>\r\n");
      out.write("    <td width=\"72\" align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\">身份证号</td>\r\n");
      out.write("    <td width=\"224\" align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><input name=\"s_stu_sfz\" type=\"text\" id=\"s_stu_sfz\"   value=\"");
      out.print(st.getS_stu_sfz());
      out.write("\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">电话</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><input name=\"s_stu_dhhm\" type=\"text\" id=\"s_stu_dhhm\" maxlength=\"18\" value=\"");
      out.print(st.getS_stu_dhhm());
      out.write("\" /></td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\">家庭地址</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><input name=\"s_stu_jtdz\" type=\"text\" id=\"s_stu_jtdz\"  value=\"");
      out.print(st.getS_stu_jtdz());
      out.write("\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">档案时间</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><input name=\"s_stu_dasj\" type=\"text\" id=\"s_stu_dasj\" value=\"");
      out.print(st.getS_stu_dasj());
      out.write("\" /></td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\">档案地址</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><input name=\"s_stu_dadz\" type=\"text\" id=\"s_stu_dadz\"  value=\"");
      out.print(st.getS_stu_dadz());
      out.write("\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">学历</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><input name=\"s_stu_xl\" type=\"text\" id=\"s_stu_xl\" value=\"");
      out.print(st.getS_stu_xl());
      out.write("\" /></td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\">就业单位</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><input name=\"s_stu_jl\" type=\"text\" id=\"s_stu_jl\" value=\"");
      out.print(st.getS_stu_jl());
      out.write("\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">单位性质</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><input name=\"s_stu_cf\" type=\"text\" id=\"s_stu_cf\" value=\"");
      out.print(st.getS_stu_cf());
      out.write("\" /></td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\">院系</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><select name=\"s_stu_yx\" id=\"s_stu_yx\">\r\n");
      out.write("        ");

  yxop yxop=new yxop();
  ArrayList al=new ArrayList();
  al=yxop.getYx();
  yx y=new yx();
  for(int i=0;i<al.size();i++){
	  y=(yx)al.get(i);
	  
  if(y.getS_yx_mc().equals(st.getS_stu_yx()))
  {
      out.write("\r\n");
      out.write("  \r\n");
      out.write("        <option value=\"");
      out.print(y.getS_yx_mc());
      out.write("\" selected=\"selected\">");
      out.print(y.getS_yx_mc());
      out.write("</option>\r\n");
      out.write("        ");

}
else
{

      out.write("\r\n");
      out.write("<option value=\"");
      out.print(y.getS_yx_mc());
      out.write('"');
      out.write('>');
      out.print(y.getS_yx_mc());
      out.write("</option>\r\n");

  }
  
  }
  
      out.write("\r\n");
      out.write("      </select></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">民族</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\">\r\n");
      out.write("\t<input name=\"s_stu_mz\" type=\"text\" id=\"s_stu_mz\" value=\"");
      out.print(st.getS_stu_mz());
      out.write("\"  />\t\r\n");
      out.write("\t</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\">专业</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><select name=\"s_stu_zy\" id=\"s_stu_zy\">\r\n");
      out.write("      ");

  mzop mzop=new mzop();
  
  ArrayList al2=new ArrayList();
   
  al2=mzop.getMz();
	 
  mz m=new mz();
  for(int i=0;i<al2.size();i++){
	  m=(mz)al2.get(i);
 if(m.getS_mz_mc().equals(st.getS_stu_zy()))
  {
      out.write("\r\n");
      out.write("  \r\n");
      out.write("        <option value=\"");
      out.print(m.getS_mz_mc());
      out.write("\" selected=\"selected\">");
      out.print(m.getS_mz_mc());
      out.write("</option>\r\n");
      out.write("        ");

}
else
{

      out.write("\r\n");
      out.write("<option value=\"");
      out.print(m.getS_mz_mc());
      out.write('"');
      out.write('>');
      out.print(m.getS_mz_mc());
      out.write("</option>\r\n");

  }
  
  }
  
      out.write("\r\n");
      out.write("    </select></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" align=\"center\" valign=\"middle\" bgcolor=\"#F9FCFF\">是否就业</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\">");

	
	if("1".equals(st.getS_stu_jy()))
	{
	
      out.write("\r\n");
      out.write("      <input name=\"s_stu_jy\" type=\"radio\" value=\"1\" checked=\"checked\" />就业\r\n");
      out.write("\t  <input type=\"radio\" name=\"s_stu_jy\" value=\"0\" />待业\r\n");
      out.write("      ");

	}
	else
	{
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("<input type=\"radio\" name=\"s_stu_jy\" value=\"1\" />就业\r\n");
      out.write("<input type=\"radio\" name=\"s_stu_jy\" value=\"0\" checked=\"checked\" />待业\r\n");

	}
	
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><!--DWLayoutEmptyCell-->&nbsp;</td>\r\n");
      out.write("    <td align=\"left\" valign=\"middle\" bgcolor=\"#F9FCFF\"><!--DWLayoutEmptyCell-->&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("  <table width=\"750\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n");
      out.write("  <!--DWLayoutTable-->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"750\" height=\"30\" align=\"center\" valign=\"middle\">\r\n");
      out.write("      <input type=\"submit\" name=\"Submit\" value=\"保存\" />      &nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write(" <input type=\"hidden\" name=\"s_stu_dabh\" value=\"");
      out.print(sid);
      out.write("\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"op\" value=\"mod\"/>\r\n");
      out.write("</form>\r\n");
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
