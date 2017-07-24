package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


//
//   Filename: Common.jsp


  static final String CRLF = "\r\n";

  static final int UNDEFINT=Integer.MIN_VALUE;

  static final int adText = 1;
  static final int adDate = 2;
  static final int adNumber = 3;
  static final int adSearch_ = 4;
  static final int ad_Search_ = 5;
  static final String appPath   ="/";

//Database connection string

  static final String DBDriver  ="sun.jdbc.odbc.JdbcOdbcDriver";
  static final String strConn   ="jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=E:/site/DB/dataDB.mdb";
  static final String DBusername="";
  static final String DBpassword="";

  public static String loadDriver () {
    String sErr = "";
    try {
      java.sql.DriverManager.registerDriver((java.sql.Driver)(Class.forName(DBDriver).newInstance()));
    }
    catch (Exception e) {
      sErr = e.toString();
    }
    return (sErr);
  }

  public static void absolute(java.sql.ResultSet rs, int row) throws java.sql.SQLException{
    for(int x=1;x<row;x++) rs.next();
  }

  java.sql.ResultSet openrs(java.sql.Statement stat, String sql) throws java.sql.SQLException {
    java.sql.ResultSet rs = stat.executeQuery(sql);
    return (rs);
  }

  String dLookUp(java.sql.Statement stat, String table, String fName, String where) {
    java.sql.Connection conn1 = null;
    java.sql.Statement stat1 = null;
    try {
      conn1 = cn();
      stat1 = conn1.createStatement();
      java.sql.ResultSet rsLookUp = openrs( stat1, "SELECT " + fName + " FROM " + table + " WHERE " + where);
      if (! rsLookUp.next()) {
        rsLookUp.close();
        stat1.close();
        conn1.close();
        return "";
      }
      String res = rsLookUp.getString(1);
      rsLookUp.close();
      stat1.close();
      conn1.close();
      return (res == null ? "" : res);
    }
    catch (Exception e) {
      return "";
    }
  }

  long dCountRec(java.sql.Statement stat, String table, String sWhere) {
    long lNumRecs = 0;
    try {
      java.sql.ResultSet rs = stat.executeQuery("select count(*) from " + table + " where " + sWhere);
      if ( rs != null && rs.next() ) {
        lNumRecs = rs.getLong(1);
      }
      rs.close();
    }
    catch (Exception e ) {};
    return lNumRecs;
  }

  String proceedError(javax.servlet.http.HttpServletResponse response, Exception e) {
    return e.toString();
  }

  String[] getFieldsName ( java.sql.ResultSet rs ) throws java.sql.SQLException {
    java.sql.ResultSetMetaData metaData = rs.getMetaData();
    int count = metaData.getColumnCount();
    String[] aFields = new String[count];
    for(int j = 0; j < count; j++) {
      aFields[j] = metaData.getColumnLabel(j+1);
    }
    return aFields;
  }

  java.util.Hashtable getRecordToHash ( java.sql.ResultSet rs, java.util.Hashtable rsHash, String[] aFields ) throws java.sql.SQLException {
    for ( int iF = 0; iF < aFields.length; iF++ ) {
      rsHash.put( aFields[iF], getValue(rs, aFields[iF]));
    }
    return rsHash;
  }

  java.sql.Connection cn() throws java.sql.SQLException {
    return java.sql.DriverManager.getConnection(strConn , DBusername, DBpassword);
  }

  String toURL(String strValue){
    if ( strValue == null ) return "";
    if ( strValue.compareTo("") == 0 ) return "";
    return java.net.URLEncoder.encode(strValue);
  }

  String toHTML(String value) {
    if ( value == null ) return "";
    value = replace(value, "&", "&amp;");
    value = replace(value, "<", "&lt;");
    value = replace(value, ">", "&gt;");
    value = replace(value, "\"", "&" + "quot;");
    return value;
  }

  String getValueHTML(java.sql.ResultSet rs, String fieldName) {
    try {
      String value = rs.getString(fieldName);
      if (value != null) {
        return toHTML(value);
      }
    }
    catch (java.sql.SQLException sqle) {}
    return "";
  }

  String getValue(java.sql.ResultSet rs, String strFieldName) {
    if ((rs==null) ||(isEmpty(strFieldName)) || ("".equals(strFieldName))) return "";
    try {
      String sValue = rs.getString(strFieldName);
      if ( sValue == null ) sValue = "";
      return sValue;
    }
    catch (Exception e) {
      return "";
    }
  }
  
  String getParam(javax.servlet.http.HttpServletRequest req, String paramName) {
    String param = req.getParameter(paramName);
    if ( param == null || param.equals("") ) return "";
    param = replace(param,"&amp;","&");
    param = replace(param,"&lt;","<");
    param = replace(param,"&gt;",">");
    param = replace(param,"&amp;lt;","<");
    param = replace(param,"&amp;gt;",">");
    return param;
  }

  boolean isNumber (String param) {
    boolean result;
    if ( param == null || param.equals("")) return true;
    param=param.replace('d','_').replace('f','_');
    try {
      Double dbl = new Double(param);
      result = true;
    }
    catch (NumberFormatException nfe) {
      result = false;
    }
    return result;
  }

  boolean isEmpty (int val){
    return val==UNDEFINT;
  }

  boolean isEmpty (String val){
    return (val==null || val.equals("")||val.equals(Integer.toString(UNDEFINT))); 
  }

  String getCheckBoxValue (String val, String checkVal, String uncheckVal, int ctype) {
    if (val==null || val.equals("") ) return toSQL(uncheckVal, ctype);
    else return toSQL(checkVal, ctype);
  }

  String toWhereSQL(String fieldName, String fieldVal, int type) {
    String res = "";
    switch(type) {
      case adText: 
        if (! "".equals(fieldVal)) {
          res = " " + fieldName + " like '%" + fieldVal + "%'";
        }
      case adNumber:
        res = " " + fieldName + " = " + fieldVal + " ";
      case adDate:
        res = " " + fieldName + " = '" + fieldVal + "' ";
      default:
        res = " " + fieldName + " = '" + fieldVal + "' ";
    }
    return res;
  }

  String toSQL(String value, int type) {
    if ( value == null ) return "Null";
	String temp="";try{
	temp=new String (value.getBytes("gb2312"));}catch(Exception e){System.out.print("ÖÐÎÄ±àÒï´íÎó");}
    String param = temp;
    if ("".equals(param) && (type == adText || type == adDate) ) {
      return "Null";
    } 
    switch (type) {
      case adText: {
        param = replace(param, "'", "''");
        param = replace(param, "&amp;", "&");
		
        param = "'" + param + "'";
        break;
      }
      case adSearch_:
      case ad_Search_: {
        param = replace(param, "'", "''");
        break;
      }
      case adNumber: {
        try {
          if (! isNumber(value) || "".equals(param)) param="null";
          else param =value;
        }
        catch (NumberFormatException nfe) {
          param = "null";
        }
        break;
      }
      case adDate: {
        param = "'" + param + "'";
        break;      
      }
    }
    return param;
  }

  private String replace(String str, String pattern, String replace) {
    if (replace == null) {
      replace = "";
    }
    int s = 0, e = 0;
    StringBuffer result = new StringBuffer((int) str.length()*2);
    while ((e = str.indexOf(pattern, s)) >= 0) {
      result.append(str.substring(s, e));
      result.append(replace);
      s = e + pattern.length();
    }
    result.append(str.substring(s));
    return result.toString();
  }

  String getOptions( java.sql.Connection conn, String sql, boolean isSearch, boolean isRequired, String selectedValue ) {

    String sOptions = "";
    String sSel = "";

    if ( isSearch ) {
     sOptions += "<option value=\"\">All</option>";
    }
    else {
      if ( ! isRequired ) {
       sOptions += "<option value=\"\"></option>";
      }
    }
    try {
      java.sql.Statement stat = conn.createStatement();
      java.sql.ResultSet rs = null;
      rs = openrs (stat, sql);
      while (rs.next() ) {
        String id = new String( rs.getString(1).getBytes("iso-8859-1"));
        String val = toHTML( rs.getString(2) );
        if ( id.compareTo(selectedValue) == 0 ) {
          sSel = "SELECTED";
        }
        else  {
          sSel = "";
        }
        sOptions += "<option value=\""+id+"\" "+sSel+">"+val+"</option>";
      }
      rs.close();
      stat.close();
    }
    catch (Exception e) {}
    return sOptions;
  }
   String getOptionstwo( java.sql.Connection conn, String sql ) {

    String sOptions = "";
    String sSel = "";
    try {
      java.sql.Statement stat = conn.createStatement();
      java.sql.ResultSet rs = null;
      rs = openrs (stat, sql);
      while (rs.next() ) {
        String id = new String( rs.getString(1).getBytes("iso-8859-1"));
        String val = toHTML( rs.getString(2) );
         sOptions += "<option value=\""+id+"\" "+sSel+">"+val+"</option>";
      }
      rs.close();
      stat.close();
    }
    catch (Exception e) {}
    return sOptions;
  }
  //ÏÔÊ¾ÐÅÏ¢
 String getImpl( java.sql.Connection conn, String sql ) {

    String sOptions = "";
    String sSel = "";
    try {
      java.sql.Statement stat = conn.createStatement();
      java.sql.ResultSet rs = null;
      rs = openrs (stat, sql);
      while (rs.next() ) {
        sOptions=rs.getString(2);
        }
        
      rs.close();
      stat.close();
    }
    catch (Exception e) {}
    return sOptions;
  }
  String getOptionsLOV( String sLOV, boolean isSearch, boolean isRequired, String selectedValue ) {
    String sSel = "";
    String slOptions = "";
    String sOptions = "";
    String id = "";
    String val = "";
    java.util.StringTokenizer LOV = new java.util.StringTokenizer( sLOV, ";", true);
    int i = 0;
    String old = ";";
    while ( LOV.hasMoreTokens() ) {
      id = LOV.nextToken();
      if ( ! old.equals(";") && ( id.equals(";") ) ) {
        id = LOV.nextToken();
      }
      else {
        if ( old.equals(";") && ( id.equals(";") ) ) {
          id = "";
        }
      }
      if ( ! id.equals("") )  { old = id; }

      i++;

      if (LOV.hasMoreTokens()) {
        val = LOV.nextToken();
        if ( ! old.equals(";") && (val.equals(";") ) ) {
          val = LOV.nextToken();
        }
        else {
          if (old.equals(";") && (val.equals(";"))) {
            val = "";
          }
        }
        if ( val.equals(";") ) { val = ""; }
        if ( ! val.equals("")) { old = val; }
        i++;
      }

      if ( id.compareTo( selectedValue ) == 0 ) {
        sSel = "SELECTED";
      }
      else {
        sSel = "";
      }
      slOptions += "<option value=\""+id+"\" "+sSel+">"+val+"</option>";
    }
    if (  ( i % 2 ) == 0 ) sOptions += slOptions;
    return sOptions;
  }

  String getValFromLOV( String selectedValue , String sLOV) {
    String sRes = "";
    String id = "";
    String val = "";
    java.util.StringTokenizer LOV = new java.util.StringTokenizer( sLOV, ";", true);
    int i = 0;
    String old = ";";
    while ( LOV.hasMoreTokens() ) {
      id = LOV.nextToken();
      if ( ! old.equals(";") && ( id.equals(";") ) ) {
        id = LOV.nextToken();
      }
      else {
        if ( old.equals(";") && ( id.equals(";") ) ) {
          id = "";
        }
      }
      if ( ! id.equals("") )  { old = id; }

      i++;

      if (LOV.hasMoreTokens()) {
        val = LOV.nextToken();
        if ( ! old.equals(";") && (val.equals(";") ) ) {
          val = LOV.nextToken();
        }
        else {
          if (old.equals(";") && (val.equals(";"))) {
            val = "";
          }
        }
        if ( val.equals(";") ) { val = ""; }
        if ( ! val.equals("")) { old = val; }
        i++;
      }

      if ( id.compareTo( selectedValue ) == 0 ) {
        sRes = val;
      }
    }
    return sRes;
  }


  String checkSecurity(int iLevel, javax.servlet.http.HttpSession session, javax.servlet.http.HttpServletResponse response, javax.servlet.http.HttpServletRequest request){
    try {
      Object o1 = session.getAttribute("UserID");
      Object o2 = session.getAttribute("UserRights");
      boolean bRedirect = false;
      if ( o1 == null || o2 == null ) { bRedirect = true; }
      if ( ! bRedirect ) {
        if ( (o1.toString()).equals("")) { bRedirect = true; }
        else if ( (new Integer(o2.toString())).intValue() < iLevel) { bRedirect = true; }
      }

      if ( bRedirect ) {
        response.sendRedirect("Login.jsp?querystring=" + toURL(request.getQueryString()) + "&ret_page=" + toURL(request.getRequestURI()));
        return "sendRedirect";
      }
    }
    catch(Exception e){};
    return "";
  }


  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(4);
    _jspx_dependants.add("/../Common.jsp");
    _jspx_dependants.add("/gg.jsp");
    _jspx_dependants.add("/bootImg.jsp");
    _jspx_dependants.add("/boot.jsp");
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
      response.setContentType("text/html; charset=gb2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("<!-- author: zhangpeipei -->\r\n");
      out.write("\r\n");
      out.write("\r\n");

request.setCharacterEncoding("gb2312");
Connection conn = null;
Statement stat = null;Statement stat2= null;
String sErr = loadDriver();
conn = cn();
stat = conn.createStatement();


      out.write("\r\n");
      out.write("   \r\n");
      out.write("\t\t\t\t   ");


stat2 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);


      out.write("<SCRIPT language=javascript>\r\n");
      out.write("function check()\r\n");
      out.write("{\r\n");
      out.write("  if (regform.user.value==\"\"){\r\n");
      out.write("\talert(\"请输入用户名！\");\r\n");
      out.write("\tregform.user.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("  }\r\n");
      out.write("    if (regform.passwd.value==\"\"){\r\n");
      out.write("\talert(\"请输入密码！\");\r\n");
      out.write("\tregform.passwd.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<!-- saved from url=(0034)http://xinxie.szu.edu.cn/index.asp -->\r\n");
      out.write("<HTML><HEAD><TITLE>大学生心理健康网</TITLE>\r\n");
      out.write("<META content=心协 name=description>\r\n");
      out.write("<META content=心协 name=keywords>\r\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=gb2312\"><LINK \r\n");
      out.write("href=\"img/style.css\" rel=stylesheet>\r\n");
      out.write("<STYLE type=text/css>\r\n");
      out.write(".style1 {\r\n");
      out.write("\tCOLOR: #ffffff; TEXT-DECORATION: blink\r\n");
      out.write("}\r\n");
      out.write("A:link {\r\n");
      out.write("\tCOLOR: #000000; TEXT-DECORATION: none}\r\n");
      out.write("A:visited {\r\n");
      out.write("\tCOLOR: #000000; TEXT-DECORATION: none}\r\n");
      out.write("A:hover {\r\n");
      out.write("\tCOLOR: #ff9900; TEXT-DECORATION: none}\r\n");
      out.write("A:active {\r\n");
      out.write("\tCOLOR: #ff9900; TEXT-DECORATION: none}\r\n");
      out.write(".style2 {\r\n");
      out.write("\tCOLOR: #000000\r\n");
      out.write("}\r\n");
      out.write(".STYLE9 {font-size: 16px}\r\n");
      out.write(".STYLE11 {font-size: 18px}\r\n");
      out.write(".STYLE13 {text-decoration: blink}\r\n");
      out.write("body,td,th {\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("}\r\n");
      out.write(".STYLE14 {font-size: 10pt}\r\n");
      out.write("</STYLE>\r\n");
      out.write("<SCRIPT language=javascript>\r\n");
      out.write("function check()\r\n");
      out.write("{\r\n");
      out.write("  if (regform.user.value==\"\"){\r\n");
      out.write("\talert(\"请输入用户名！\");\r\n");
      out.write("\tregform.user.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("  }\r\n");
      out.write("    if (regform.passwd.value==\"\"){\r\n");
      out.write("\talert(\"请输入密码！\");\r\n");
      out.write("\tregform.passwd.focus();\r\n");
      out.write("\treturn false;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<META content=\"MSHTML 6.00.2900.3243\" name=GENERATOR></HEAD>\r\n");
      out.write("<BODY bgColor=#f6f6f6 leftMargin=0 \r\n");
      out.write("background=img/xinxie.szu.edu.htm topMargin=2 marginwidth=\"0\" \r\n");
      out.write("marginheight=\"0\"><FONT face=宋体>\r\n");
      out.write("\r\n");
      out.write("<DIV align=center>\r\n");
      out.write("<TABLE cellSpacing=1 cellPadding=0 width=795 align=center bgColor=#d9d9d9 \r\n");
      out.write("border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD background=\"AD/image/1.jpg\" bgColor=#ffffff><object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0\" width=\"780\" height=\"176\" align=\"right\">\r\n");
      out.write("      <param name=\"movie\" value=\"a.swf\">\r\n");
      out.write("      <param name=\"quality\" value=\"high\">\r\n");
      out.write("\t  <param name=\"wmode\" value=\"transparent\">\r\n");
      out.write("      <embed src=\"a.swf\" width=\"780\" height=\"176\" align=\"right\" quality=\"high\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" type=\"application/x-shockwave-flash\"></embed>\r\n");
      out.write("    </object></TD>\r\n");
      out.write("  </TR></TBODY></TABLE>\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=795 border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD height=30 align=left valign=\"middle\" background=img/0.gif><div align=\"center\"><a href=\"index.jsp\"><FONT \r\n");
      out.write("      face=宋体>┊</FONT>首页<SPAN class=style1>┊<a href=\"ffy7.jsp\"><font face=\"宋体\">心理卫生</font></a> <SPAN class=style1>┊</SPAN> <SPAN \r\n");
      out.write("      class=style1><a href=\"ffy6.jsp\">心理<font face=\"宋体\">咨询</font></a></SPAN> <SPAN class=style1>┊<a href=\"ffy3.jsp\">健康宣传</a>┊<a href=\"ffy4.jsp\">心理知识</a>┊</SPAN><a href=\"ffy5.jsp\">健康文摘</a><SPAN class=style1>┊<a href=\"ffy2.jsp\">心理趣测</a><FONT \r\n");
      out.write("      face=宋体>┊<a href=\"ly/lybit.jsp\">&nbsp;</a></FONT></SPAN><a href=\"ly/lybit.jsp\"><SPAN class=STYLE13><FONT \r\n");
      out.write("      face=宋体>在线留言</FONT></SPAN></a><SPAN class=STYLE13><FONT \r\n");
      out.write("      face=宋体><a href=\"ly/lyadd.jsp\"></a></FONT></SPAN><SPAN class=style1><FONT \r\n");
      out.write("      face=宋体> ┊</FONT></SPAN></div></TD>\r\n");
      out.write("  </TR></TBODY></TABLE></DIV></FONT><BR>\r\n");
      out.write("<TABLE cellSpacing=1 cellPadding=0 width=409 bgColor=#cccccc border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD>\r\n");
      out.write("      <TABLE cellSpacing=0 cellPadding=0 width=755 bgColor=#d2d2d2 border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD width=\"190\" height=\"874\" align=middle vAlign=top bgColor=#ffffff>\r\n");
      out.write("            <TABLE cellSpacing=1 cellPadding=0 width=\"100%\" bgColor=#e0e0e0 \r\n");
      out.write("            border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD width=9 background=img/37.jpg \r\n");
      out.write("                bgColor=#f6f6f6 height=24></TD>\r\n");
      out.write("                <TD width=168 bgColor=#f6f6f6>\r\n");
      out.write("                  <DIV style=\"FONT-SIZE: 10pt; COLOR: #009900\" align=center><img src=\"AD/image/a.gif\" width=\"12\" height=\"12\"> &nbsp;<span class=\"STYLE9\">网 站 \r\n");
      out.write("                  公 告</span></DIV></TD>\r\n");
      out.write("              </TR>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD vAlign=top bgColor=#ffffff colSpan=2 height=180>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                  <MARQUEE onmouseover=this.stop(); \r\n");
      out.write("                        onmouseout=this.start(); scrollAmount=3 scrollDelay=150 \r\n");
      out.write("                        direction=up cellSpacing=3cellPadding=3 width=\"96%\" height=200 border=0>\r\n");
      out.write("                      \r\n");
      out.write("                        \r\n");
      out.write("\t\t\t\t\t\t      <!-- 显示数据-->\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 String sqlgg ="select * from man order by id desc ";
								  ResultSet rsgg;
								int igg=0;
							  rsgg=openrs( stat, sqlgg);
							  while(rsgg.next()&&igg<7){
							  
							   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<SPAN style=\"COLOR: #2d90f6\"> \t \r\n");
      out.write("\t\t\t\t\t\t\t\t<A \r\n");
      out.write("                                href=\"");
      out.print( rsgg.getString("id") );
      out.write("\" \r\n");
      out.write("                                target=_blank>");
      out.print( rsgg.getString(2) );
      out.write("</A>  </span> \r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 igg++; }rsgg.close();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                            \r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</MARQUEE>");
      out.write("\r\n");
      out.write("              </TR></TABLE><IMG \r\n");
      out.write("            height=8 src=\"img/4.gif\" width=188><BR><BR><BR>\r\n");
      out.write("            <FORM language=javascript name=regform onSubmit=\"return CheckForm()\" \r\n");
      out.write("            action=\"loginsave.jsp\" method=post>\r\n");
      out.write("            <TABLE cellSpacing=0 cellPadding=1 width=\"96%\" bgColor=#e0e0e0 \r\n");
      out.write("            border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD>\r\n");
      out.write("                  <TABLE cellSpacing=0 cellPadding=1 width=\"100%\" \r\n");
      out.write("                  bgColor=#ffffff border=0>\r\n");
      out.write("                    <TBODY>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                      <TD width=\"5%\" background=img/37.jpg \r\n");
      out.write("                      height=24>&nbsp;</TD>\r\n");
      out.write("                      <TD width=\"95%\" bgColor=#f6f6f6>\r\n");
      out.write("                        <DIV \r\n");
      out.write("                        align=center class=\"STYLE9\" style=\"FONT-SIZE: 16px; COLOR: #009900\"><img src=\"AD/image/a.gif\" width=\"12\" height=\"12\"> &nbsp;登 陆 窗&nbsp;口</DIV></TD>\r\n");
      out.write("                    </TR>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                      <TD colSpan=2 height=26><div align=\"center\">用 户： \r\n");
      out.write("                        <INPUT \r\n");
      out.write("                        name=user class=dl id=user size=\"15\">\r\n");
      out.write("                      </div></TD></TR>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                      <TD colSpan=2 height=24><div align=\"center\">口 令： \r\n");
      out.write("                        <input name=passwd \r\n");
      out.write("                        type=password class=dl id=\"passwd\" size=\"15\">\r\n");
      out.write("                      </div></TD>\r\n");
      out.write("                    </TR>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                      <TD align=middle colSpan=2><div align=\"justify\">\r\n");
      out.write("                            <input name=\"radiobutton\" type=\"radio\" value=\"gl\" checked=\"checked\">\r\n");
      out.write("                            管理员\r\n");
      out.write("                            <input type=\"radio\" name=\"radiobutton\" value=\"bz\">\r\n");
      out.write("                            普通用户</div></TD>\r\n");
      out.write("                    </TR>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                      <TD align=middle colSpan=2><div align=\"center\"><A \r\n");
      out.write("                        href=\"http://xinxie.szu.edu.cn/diary/reg.asp\" \r\n");
      out.write("                        target=_blank>\r\n");
      out.write("                        <input class=ann  onClick=\"return check()\" type=submit value=提交 name=Submit2>\r\n");
      out.write("                        &nbsp;\r\n");
      out.write("                        <input class=ann type=reset value=重置 name=Submit>\r\n");
      out.write("                      </A></div></TD>\r\n");
      out.write("                    </TR></TBODY></TABLE></TD></TR></TBODY></TABLE></FORM><IMG \r\n");
      out.write("            height=8 src=\"img/4.gif\" width=188><BR><BR><BR>\r\n");
      out.write("            <TABLE cellSpacing=1 cellPadding=0 width=\"96%\" bgColor=#e0e0e0 \r\n");
      out.write("            border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD width=9 background=img/37.jpg \r\n");
      out.write("                bgColor=#f6f6f6 height=24>&nbsp;</TD>\r\n");
      out.write("                <TD width=192 bgColor=#f6f6f6>\r\n");
      out.write("                  <DIV \r\n");
      out.write("                  align=center class=\"STYLE9\" style=\"FONT-SIZE: 16px; COLOR: #009900\"><img src=\"AD/image/a.gif\" width=\"12\" height=\"12\"> &nbsp;友 情 链 接</DIV></TD>\r\n");
      out.write("              </TR>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD vAlign=top bgColor=#ffffff colSpan=2 height=83>\r\n");
      out.write("                  <DIV align=center><MARQUEE onmouseover=this.stop(); \r\n");
      out.write("                        onmouseout=this.start(); scrollAmount=3 scrollDelay=150 \r\n");
      out.write("                        direction=up width=\"100%\" height=200>\r\n");
      out.write("                  <TABLE cellSpacing=3cellPadding=3 width=\"96%\" border=0>\r\n");
      out.write("                   \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                          \r\n");
      out.write("                          \r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t      <!-- 显示数据-->\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 String sqllj ="select * from DWurl  ";
								  ResultSet rslj;
								int ilj=0;
							  rslj=openrs( stat, sqllj);
							  while(rslj.next()&&ilj<7){
							  
							   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("                                <TR>\r\n");
      out.write("                      \r\n");
      out.write("                      \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("                                <TD><SPAN style=\"COLOR: #2d90f6\"> \t \r\n");
      out.write("\t\t\t\t\t\t\t\t<A \r\n");
      out.write("                                href=\"");
      out.print( rslj.getString("url") );
      out.write("\" \r\n");
      out.write("                                target=_blank>");
      out.print( rslj.getString(2) );
      out.write("</A>   </TD></TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 ilj++; }rslj.close();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                <TR>\r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                  \r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t</TABLE>\t  </MARQUEE> </DIV></TD></TR></TBODY></TABLE><IMG \r\n");
      out.write("            height=8 src=\"img/4.gif\" width=188><BR><BR><BR>\r\n");
      out.write("            <TABLE cellSpacing=1 cellPadding=0 width=\"96%\" bgColor=#e0e0e0 \r\n");
      out.write("            border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD width=9 background=img/37.jpg \r\n");
      out.write("                bgColor=#f6f6f6 height=24><div align=\"center\"></div></TD>\r\n");
      out.write("                <TD width=195 bgColor=#f6f6f6>\r\n");
      out.write("                  <DIV style=\"FONT-SIZE: 10pt; COLOR: #009900\" \r\n");
      out.write("                  align=center>\r\n");
      out.write("                    <div align=\"center\" class=\"STYLE9\"><img src=\"AD/image/a.gif\" width=\"12\" height=\"12\"> 关 于 本 站 </div>\r\n");
      out.write("                  </DIV></TD>\r\n");
      out.write("              </TR>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD vAlign=top bgColor=#ffffff colSpan=2>\r\n");
      out.write("                  <DIV align=center>\r\n");
      out.write("                    <table cellspacing=0 cellpadding=0 width=\"100%\" border=0>\r\n");
      out.write("                      <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td valign=top width=179><table width=\"100%\" border=0 \r\n");
      out.write("                        align=center cellpadding=0 cellspacing=0 class=tt style2>\r\n");
      out.write("                              <tbody>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                  <td align=right width=25 height=24><img src=\"AD/image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("                                  <td class=style8 valign=center width=202>\r\n");
      out.write("                                      <div style=\"FONT-SIZE: 9pt\"><b><a \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/type.asp?typeid=1\" \r\n");
      out.write("                              target=_blank>&nbsp;</a></b> <a class=Bottom \r\n");
      out.write("      onClick=\"this.style.behavior='url(#default#homepage)';this.setHomePage('http://localhost:8080/index.jsp');\" \r\n");
      out.write("      href=\"http://localhost:8080/index.jsp/#\"><span class=\"STYLE14\">设 为 首 页 </span></a></div></td>\r\n");
      out.write("                                  <td width=30><div align=center></div></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                              </tbody>\r\n");
      out.write("                          </table></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td valign=top width=179><table width=\"100%\" border=0 \r\n");
      out.write("                        align=center cellpadding=0 cellspacing=0 class=tt style2>\r\n");
      out.write("                              <tbody>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                  <td align=right width=25 height=24><img src=\"AD/image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("                                  <td class=style8 valign=center width=202>\r\n");
      out.write("                                      <div style=\"FONT-SIZE: 9pt\"><b><a \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/type.asp?typeid=2\" \r\n");
      out.write("                              target=_blank>&nbsp;</a></b><a class=Bottom \r\n");
      out.write("      onClick=\"javascript:window.external.addFavorite('http://localhost:8080/index.jsp','大学生心理健康网');\" \r\n");
      out.write("      href=\"http://localhost:8080/index.jsp/#\"><span class=\"STYLE14\"> 加 入 收 藏</span></a></div></td>\r\n");
      out.write("                                  <td width=30><div align=center></div></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                              </tbody>\r\n");
      out.write("                          </table></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td valign=top width=179><table width=\"100%\" border=0 \r\n");
      out.write("                        align=center cellpadding=0 cellspacing=0 class=tt style2>\r\n");
      out.write("                              <tbody>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                  <td align=right width=25 height=24><img src=\"AD/image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("                                  <td class=style8 valign=center width=202>\r\n");
      out.write("                                      <div style=\"FONT-SIZE: 9pt\"><b><a \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/type.asp?typeid=3\" \r\n");
      out.write("                              target=_blank>&nbsp;</a></b><a class=Bottom href=\"mailto:lsz669969@126.com\" \r\n");
      out.write("      target=_blank><span class=\"STYLE14\"> 联 系 我 们</span></a></div></td>\r\n");
      out.write("                                  <td width=30><div align=center></div></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                              </tbody>\r\n");
      out.write("                          </table></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td valign=top width=179><table class=tt cellspacing=0 cellpadding=0 width=\"100%\" \r\n");
      out.write("                        align=center border=0>\r\n");
      out.write("                              <tbody>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                  <td align=right width=25 height=24><img src=\"AD/image/bullet.gif\" width=\"15\" height=\"20\"></td>\r\n");
      out.write("                                  <td class=style8 valign=center width=202><b><a \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/type.asp?typeid=4\" \r\n");
      out.write("                              target=_blank></a></b>\r\n");
      out.write("                                      <div style=\"FONT-SIZE: 9pt; COLOR: #666666\"><b><a \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/type.asp?typeid=4\" \r\n");
      out.write("                              target=_blank>&nbsp;</a></b><a \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/type.asp?typeid=4\" \r\n");
      out.write("                              target=_blank><span class=\"STYLE14\"> 网 站 地 图</span></a></div></td>\r\n");
      out.write("                                  <td width=30><div align=center></div></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                              </tbody>\r\n");
      out.write("                          </table></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        \r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <TD valign=\"bottom\"><form name=\"form1\" method=\"post\" action=\"dfit.jsp\" target=_blank>\r\n");
      out.write("                            <div align=\"center\">\r\n");
      out.write("                              <img src=\"AD/image/bullet.gif\" width=\"20\" height=\"25\" align=\"absmiddle\">\r\n");
      out.write("                              <INPUT class=putmenu_style type=hidden value=0 \r\n");
      out.write("                  name=WhichClass>\r\n");
      out.write("                              <input class=input_botton \r\n");
      out.write("                  onBlur=\"if (value ==''){value='站内检索'}\" \r\n");
      out.write("                  style=\"BORDER-RIGHT: #bcbcbc 1px solid; BORDER-TOP: #bcbcbc 1px solid; FONT-SIZE: 9pt; BORDER-LEFT: #bcbcbc 1px solid; COLOR: red; BORDER-BOTTOM: #bcbcbc 1px solid; BACKGROUND-COLOR: #ffffff\" \r\n");
      out.write("                  onFocus=\"if (value =='站内检索'){value =''}\" size=15 \r\n");
      out.write("                  value=站内检索 name=keyword>\r\n");
      out.write("                              <input type=image alt=搜索 \r\n");
      out.write("                  src=\"img/go.gif\" align=middle border=0 \r\n");
      out.write("              name=Submit1>\r\n");
      out.write("                              </div>\r\n");
      out.write("                          </FORM></TD>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                      </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                  </DIV></TD></TR></TBODY></TABLE>\r\n");
      out.write("            <IMG \r\n");
      out.write("            height=8 src=\"img/4.gif\" width=188><BR><BR><BR>\r\n");
      out.write("            <TABLE cellSpacing=1 cellPadding=0 width=\"96%\" bgColor=#f0f0f0 \r\n");
      out.write("            border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD>\r\n");
      out.write("                  <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" \r\n");
      out.write("                  bgColor=#ffffff border=0>\r\n");
      out.write("                    <TBODY>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                      <TD width=\"4%\" background=img/37.jpg \r\n");
      out.write("                      bgColor=#f0f0f0 height=24></TD>\r\n");
      out.write("                      <TD width=\"96%\" bgColor=#f0f0f0>\r\n");
      out.write("                        <DIV style=\"FONT-SIZE: 10pt; COLOR: #009900\" \r\n");
      out.write("                        align=center>\r\n");
      out.write("                          <div align=\"center\" class=\"STYLE9\"><img src=\"AD/image/a.gif\" width=\"12\" height=\"12\">&nbsp; 感 谢</div>\r\n");
      out.write("                        </DIV></TD>\r\n");
      out.write("                    </TR>\r\n");
      out.write("                    <TR align=middle>\r\n");
      out.write("                      <TD colSpan=2><A href=\"http://www.ruidot.com/\"><IMG \r\n");
      out.write("                        height=100 src=\"img/rdlg.gif\" width=80 \r\n");
      out.write("                        border=0></A></TD>\r\n");
      out.write("                    </TR>\r\n");
      out.write("                    <TR>\r\n");
      out.write("              <TD \r\n");
      out.write("            colSpan=2>&nbsp;</TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></TD>\r\n");
      out.write("          <TD width=\"545\" align=left vAlign=top bgColor=#ffffff>\r\n");
      out.write("            <DIV align=right>\r\n");
      out.write("            <TABLE cellSpacing=0 cellPadding=0 width=\"95%\" align=right \r\n");
      out.write("              border=0><TBODY>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TH scope=col>\r\n");
      out.write("                  <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" align=center \r\n");
      out.write("                  border=0>\r\n");
      out.write("                    <TBODY>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                      <TD width=\"5%\" background=img/33.gif \r\n");
      out.write("                      height=28>&nbsp;&nbsp; </TD>\r\n");
      out.write("                      <TD width=\"95%\" background=img/34.gif>\r\n");
      out.write("                        <DIV \r\n");
      out.write("                      style=\"FONT-SIZE: 10pt; COLOR: #009900\">心协动态</DIV></TD></TR></TBODY></TABLE>\r\n");
      out.write("                  <DIV align=right></DIV>\r\n");
      out.write("                  <TABLE cellSpacing=0 width=538 bgColor=#cccccc>\r\n");
      out.write("                    <TBODY>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                      <TD bgColor=#ffffff>\r\n");
      out.write("                        <TABLE cellSpacing=9 cellPadding=0 width=\"100%\" \r\n");
      out.write("border=0>\r\n");
      out.write("                          <TBODY>\r\n");
      out.write("                          <TR>\r\n");
      out.write("                            <TD vAlign=top width=\"33%\" height=185>\r\n");
      out.write("                              <DIV align=center>\r\n");
      out.write("                              <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" \r\n");
      out.write("                              border=0>\r\n");
      out.write("                                <TBODY>\r\n");
      out.write("                                <TR>\r\n");
      out.write("                                <TH scope=col width=\"86%\">\r\n");
      out.write("                                <TABLE height=192 cellSpacing=1 cellPadding=0 \r\n");
      out.write("                                width=170 bgColor=#cccccc border=0>\r\n");
      out.write("                                <TBODY>\r\n");
      out.write("                                <TR>\r\n");
      out.write("                                <TD height=\"190\" bgColor=#ffffff>\r\n");
      out.write("                                <TABLE height=150 cellSpacing=1 cellPadding=0 \r\n");
      out.write("                                width=159 align=center bgColor=#FFFFFF border=0>\r\n");
      out.write("                                <TBODY>\r\n");
      out.write("                                <TR>\r\n");
      out.write("                                <TD height=\"133\" align=\"left\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<script src=\"778-2.js\"></script>\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("                                </TR></TBODY></TABLE></TD></TR></TBODY></TABLE></TH>\r\n");
      out.write("                                <TH scope=col width=\"14%\"><IMG height=130 \r\n");
      out.write("                                src=\"img/cool.gif\" \r\n");
      out.write("                                width=22></TH></TR></TBODY></TABLE><A \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/show.asp?id=568\" \r\n");
      out.write("                              target=_blank ?><B><BR>\r\n");
      out.write("                                <span class=\"STYLE11\">[</span></B></A><B><span class=\"STYLE11\">大智若鱼</span></B><SPAN class=\"STYLE11\" \r\n");
      out.write("                              style=\"FONT-WEIGHT: bold\">] </SPAN></DIV></TD>\r\n");
      out.write("                            <TD vAlign=top width=\"67%\">\r\n");
      out.write("                              <TABLE cellSpacing=1 cellPadding=1 width=\"100%\" \r\n");
      out.write("                              border=0>\r\n");
      out.write("                                <TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- 显示数据-->\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 String sql ="select * from xwbase where tax='10' order by id desc";
								  ResultSet rs;
								int i=0;
							  rs=openrs( stat, sql);
							  while(rs.next()&&i<10){
							  
							   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                <TR>\r\n");
      out.write("                                <TD><span style=\"COLOR: #2d90f6\"><img src=\"AD/image/common.gif\" width=\"9\" height=\"15\">[心协动态]</span><A \r\n");
      out.write("                                href=\"detail.jsp?id=");
      out.print( rs.getString("id") );
      out.write("\" \r\n");
      out.write("                                target=_blank>");
      out.print( rs.getString(3) );
      out.write("</A></TD></TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 i++; }rs.close();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                <TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TBODY></TABLE></TD></TR></TBODY></TABLE><BR></TD></TR></TBODY></TABLE>\r\n");
      out.write("                  <TABLE cellSpacing=1 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("                    <TBODY>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                      <TD vAlign=top width=\"50%\" bgColor=#ffffff>\r\n");
      out.write("                        <TABLE class=tt cellSpacing=0 cellPadding=0 width=\"98%\" \r\n");
      out.write("                        align=center border=0>\r\n");
      out.write("                          <TBODY>\r\n");
      out.write("                          <TR>\r\n");
      out.write("                            <TD width=25 background=img/33.gif \r\n");
      out.write("                            height=28>&nbsp;</TD>\r\n");
      out.write("                            <TD class=style8 vAlign=center width=202 \r\n");
      out.write("                            background=img/34.gif><B><A \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/type.asp?typeid=22\" \r\n");
      out.write("                              target=_blank>\r\n");
      out.write("                              <DIV \r\n");
      out.write("                              style=\"FONT-WEIGHT: normal; FONT-SIZE: 10pt; COLOR: #009900\">心理趣测</DIV></A></B></TD>\r\n");
      out.write("                            <TD width=30 \r\n");
      out.write("background=img/34.gif>\r\n");
      out.write("                              <DIV align=center><A \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/type.asp?typeid=22\" \r\n");
      out.write("                              target=_blank><IMG alt=more \r\n");
      out.write("                              src=\"img/5.gif\" \r\n");
      out.write("                              border=0></A></DIV></TD></TR></TBODY></TABLE>\r\n");
      out.write("                        <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" \r\n");
      out.write("                        align=center border=0>\r\n");
      out.write("                          <TBODY>\r\n");
      out.write("                          \t  \r\n");
      out.write("                           <!-- 显示数据-->\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 String sql2 ="select * from xwbase where tax='7' order by id desc";
								  ResultSet rs2;
								int i2=0;
							  rs2=openrs( stat, sql2);
							  while(rs2.next()&&i2<10){
							  
							   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                <TR>\r\n");
      out.write("                                <TD><SPAN style=\"COLOR: #2d90f6\"><img src=\"AD/image/common.gif\" width=\"9\" height=\"15\">[健康趣测]</SPAN><A \r\n");
      out.write("                                href=\"detail.jsp?id=");
      out.print( rs2.getString("id") );
      out.write("\"  \r\n");
      out.write("                                target=_blank>");
      out.print( rs2.getString(3) );
      out.write("</A></TD></TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 i2++; }rs2.close();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                <TR>\r\n");
      out.write("\t\t\t\t\t\t  </TBODY></TABLE></TD>\r\n");
      out.write("                      <TD vAlign=top width=\"50%\" bgColor=#ffffff>\r\n");
      out.write("                        <TABLE class=tt cellSpacing=0 cellPadding=0 width=\"100%\" \r\n");
      out.write("                        align=center border=0>\r\n");
      out.write("                          <TBODY>\r\n");
      out.write("                          <TR>\r\n");
      out.write("                            <TD width=29 background=img/33.gif \r\n");
      out.write("                            height=28>&nbsp;&nbsp;<B></B> </TD>\r\n");
      out.write("                            <TD class=style8 vAlign=center width=191 \r\n");
      out.write("                            background=img/34.gif><B><A \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/type.asp?typeid=21\" \r\n");
      out.write("                              target=_blank>\r\n");
      out.write("                              <DIV \r\n");
      out.write("                              style=\"FONT-WEIGHT: normal; FONT-SIZE: 10pt; COLOR: #009900\">健康文摘</DIV></A></B></TD>\r\n");
      out.write("                            <TD width=51 \r\n");
      out.write("background=img/34.gif>\r\n");
      out.write("                              <DIV align=center><A \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/type.asp?typeid=21\" \r\n");
      out.write("                              target=_blank><IMG alt=more \r\n");
      out.write("                              src=\"img/5.gif\" \r\n");
      out.write("                              border=0></A></DIV></TD></TR></TBODY></TABLE>\r\n");
      out.write("                        <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" \r\n");
      out.write("                        align=center border=0>\r\n");
      out.write("                          <TBODY>\r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("                           <!-- 显示数据-->\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 String sql3 ="select * from xwbase where tax='6'order by id desc ";
								  ResultSet rs3;
								int i3=0;
							  rs3=openrs( stat, sql3);
							  while(rs3.next()&&i3<10){
							  
							   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                <TR>\r\n");
      out.write("                                <TD><SPAN style=\"COLOR: #2d90f6\"><img src=\"AD/image/common.gif\" width=\"9\" height=\"15\">[健康文摘]</SPAN><A \r\n");
      out.write("                              href=\"detail.jsp?id=");
      out.print( rs3.getString("id") );
      out.write("\"  \r\n");
      out.write("                              target=_blank>");
      out.print( rs3.getString(3) );
      out.write("</A></TD></TR>\r\n");
      out.write("                                \r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 i3++; }rs3.close();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                <TR>\r\n");
      out.write("\t\t\t\t\t\t  </TBODY></TABLE></TD></TR>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                      <TD vAlign=top width=\"50%\" bgColor=#ffffff>\r\n");
      out.write("                        <TABLE class=tt cellSpacing=0 cellPadding=0 width=\"100%\" \r\n");
      out.write("                        align=center border=0>\r\n");
      out.write("                          <TBODY>\r\n");
      out.write("                          <TR>\r\n");
      out.write("                            <TD width=25 background=img/33.gif \r\n");
      out.write("                            height=28>&nbsp;</TD>\r\n");
      out.write("                            <TD class=style8 vAlign=center width=202 \r\n");
      out.write("                            background=img/34.gif><B><A \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/type.asp?typeid=20\" \r\n");
      out.write("                              target=_blank>\r\n");
      out.write("                              <DIV \r\n");
      out.write("                              style=\"FONT-WEIGHT: normal; FONT-SIZE: 10pt; COLOR: #009900\">心理知识</DIV></A></B></TD>\r\n");
      out.write("                            <TD width=30 \r\n");
      out.write("background=img/34.gif>\r\n");
      out.write("                              <DIV align=center><A \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/type.asp?typeid=20\" \r\n");
      out.write("                              target=_blank><IMG alt=more \r\n");
      out.write("                              src=\"img/5.gif\" \r\n");
      out.write("                              border=0></A></DIV></TD></TR></TBODY></TABLE>\r\n");
      out.write("                        <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" \r\n");
      out.write("                        align=center border=0>\r\n");
      out.write("                          <TBODY>\r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t  \r\n");
      out.write("                           <!-- 显示数据-->\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 String sql4 ="select * from xwbase where tax='5' order by id desc";
								  ResultSet rs4;
								int i4=0;
							  rs4=openrs( stat, sql4);
							  while(rs4.next()&&i4<8){
							  
							   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                <TR>\r\n");
      out.write("                                <TD><SPAN style=\"COLOR: #2d90f6\"><img src=\"AD/image/common.gif\" width=\"9\" height=\"15\">[心理知识]</SPAN><A\r\n");
      out.write("                              href=\"detail.jsp?id=");
      out.print( rs4.getString("id") );
      out.write("\"   \r\n");
      out.write("                              target=_blank>");
      out.print( rs4.getString(3) );
      out.write("</A></TD></TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 i4++; }rs4.close();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                <TR>\r\n");
      out.write("\t\t\t\t\t\t  </TBODY></TABLE></TD>\r\n");
      out.write("                      <TD vAlign=top width=\"50%\" bgColor=#ffffff>\r\n");
      out.write("                        <TABLE class=tt cellSpacing=0 cellPadding=0 width=\"100%\" \r\n");
      out.write("                        align=center border=0>\r\n");
      out.write("                          <TBODY>\r\n");
      out.write("                          <TR>\r\n");
      out.write("                            <TD width=29 background=img/33.gif \r\n");
      out.write("                            height=28>&nbsp;&nbsp;<B></B> </TD>\r\n");
      out.write("                            <TD class=style8 vAlign=center width=191 \r\n");
      out.write("                            background=img/34.gif><B><A \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/type.asp?typeid=19\" \r\n");
      out.write("                              target=_blank>\r\n");
      out.write("                              <DIV \r\n");
      out.write("                              style=\"FONT-WEIGHT: normal; FONT-SIZE: 10pt; COLOR: #009900\">健康宣传</DIV></A></B></TD>\r\n");
      out.write("                            <TD width=51 \r\n");
      out.write("background=img/34.gif>\r\n");
      out.write("                              <DIV align=center><A \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/type.asp?typeid=19\" \r\n");
      out.write("                              target=_blank><IMG alt=more \r\n");
      out.write("                              src=\"img/5.gif\" \r\n");
      out.write("                              border=0></A></DIV></TD></TR></TBODY></TABLE>\r\n");
      out.write("                        <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" \r\n");
      out.write("                        align=center border=0>\r\n");
      out.write("                          <TBODY>\r\n");
      out.write("                         <!-- 显示数据-->\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 String sql5 ="select * from xwbase where tax='4' order by id desc";
								  ResultSet rs5;
								int i5=0;
							  rs5=openrs( stat, sql5);
							  while(rs5.next()&&i5<8){
							  
							   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                <TR>\r\n");
      out.write("                                <TD><SPAN style=\"COLOR: #2d90f6\"><img src=\"AD/image/common.gif\" width=\"9\" height=\"15\">[健康宣传]</SPAN><A\r\n");
      out.write("                             href=\"detail.jsp?id=");
      out.print( rs5.getString("id") );
      out.write("\"  \r\n");
      out.write("                              target=_blank>");
      out.print( rs5.getString(3) );
      out.write("</A></TD></TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 i5++; }rs5.close();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                <TR></TBODY></TABLE></TD></TR>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                      <TD vAlign=top width=\"50%\" bgColor=#ffffff>\r\n");
      out.write("                        <TABLE class=tt cellSpacing=0 cellPadding=0 width=\"100%\" \r\n");
      out.write("                        align=center border=0>\r\n");
      out.write("                          <TBODY>\r\n");
      out.write("                          <TR>\r\n");
      out.write("                            <TD width=25 background=img/33.gif \r\n");
      out.write("                            height=28>&nbsp;</TD>\r\n");
      out.write("                            <TD class=style8 vAlign=center width=202 \r\n");
      out.write("                            background=img/34.gif><B><A \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/type.asp?typeid=14\" \r\n");
      out.write("                              target=_blank>\r\n");
      out.write("                              <DIV \r\n");
      out.write("                              style=\"FONT-WEIGHT: normal; FONT-SIZE: 10pt; COLOR: #009900\">心理咨询</DIV>\r\n");
      out.write("                            </A></B></TD>\r\n");
      out.write("                            <TD width=30 \r\n");
      out.write("background=img/34.gif>\r\n");
      out.write("                              <DIV align=center><A \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/type.asp?typeid=14\" \r\n");
      out.write("                              target=_blank></A></DIV></TD></TR></TBODY></TABLE>\r\n");
      out.write("                        <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" \r\n");
      out.write("                        align=center border=0>\r\n");
      out.write("                          <TBODY>\r\n");
      out.write("                          <!-- 显示数据-->\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 String sql6 ="select * from xwbase where tax='3'order by id desc ";
								  ResultSet rs6;
								int i6=0;
							  rs6=openrs( stat, sql6);
							  while(rs6.next()&&i6<6){
							  
							   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                <TR>\r\n");
      out.write("                                <TD><SPAN style=\"COLOR: #2d90f6\"><img src=\"AD/image/common.gif\" width=\"9\" height=\"15\">[心理咨询]</SPAN><A\r\n");
      out.write("                             href=\"detail.jsp?id=");
      out.print( rs6.getString("id") );
      out.write("\"  \r\n");
      out.write("                              target=_blank>");
      out.print( rs6.getString(3) );
      out.write("</A></TD></TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 i6++; }rs6.close();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                <TR></TBODY></TABLE></TD>\r\n");
      out.write("                      <TD vAlign=top width=\"50%\" bgColor=#ffffff>\r\n");
      out.write("                        <TABLE class=tt cellSpacing=0 cellPadding=0 width=\"100%\" \r\n");
      out.write("                        align=center border=0>\r\n");
      out.write("                          <TBODY>\r\n");
      out.write("                          <TR>\r\n");
      out.write("                            <TD width=29 background=img/33.gif \r\n");
      out.write("                            height=28>&nbsp;&nbsp;<B></B> </TD>\r\n");
      out.write("                            <TD class=style8 vAlign=center width=191 \r\n");
      out.write("                            background=img/34.gif><B><A \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/type.asp?typeid=12\" \r\n");
      out.write("                              target=_blank>\r\n");
      out.write("                              <DIV \r\n");
      out.write("                              style=\"FONT-WEIGHT: normal; FONT-SIZE: 10pt; COLOR: #009900\">心理卫生</DIV>\r\n");
      out.write("                            </A></B></TD>\r\n");
      out.write("                            <TD width=56 \r\n");
      out.write("background=img/34.gif>\r\n");
      out.write("                              <DIV align=center><A \r\n");
      out.write("                              href=\"http://xinxie.szu.edu.cn/type.asp?typeid=12\" \r\n");
      out.write("                              target=_blank><IMG alt=more \r\n");
      out.write("                              src=\"img/5.gif\" \r\n");
      out.write("                              border=0></A></DIV></TD></TR></TBODY></TABLE>\r\n");
      out.write("                        <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" \r\n");
      out.write("                        align=center border=0>\r\n");
      out.write("                          <TBODY>\r\n");
      out.write("                         <!-- 显示数据-->\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 String sql7 ="select * from xwbase where tax='2'order by id desc ";
								  ResultSet rs7;
								int i7=0;
							  rs7=openrs( stat, sql7);
							  while(rs7.next()&&i7<6){
							  
							   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                <TR>\r\n");
      out.write("                                <TD><SPAN style=\"COLOR: #2d90f6\"><img src=\"AD/image/common.gif\" width=\"9\" height=\"15\">[心理卫生]</SPAN><A \r\n");
      out.write("                                href=\"detail.jsp?id=");
      out.print( rs7.getString("id") );
      out.write("\" \r\n");
      out.write("                                target=_blank>");
      out.print( rs7.getString(3) );
      out.write("</A></TD></TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 i7++; }rs7.close();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                <TR></TBODY></TABLE></TD></TR></TBODY></TABLE>\r\n");
      out.write("                  <TABLE cellSpacing=0 cellPadding=0 width=\"99%\" border=0>\r\n");
      out.write("                    <TBODY>\r\n");
      out.write("                    <TR>\r\n");
      out.write("                      <TD vAlign=center width=26 \r\n");
      out.write("                      background=img/33.gif height=28><SPAN \r\n");
      out.write("                        class=tt></SPAN></TD>\r\n");
      out.write("                      <TD vAlign=center width=499 \r\n");
      out.write("                      background=img/34.gif>\r\n");
      out.write("                        <DIV \r\n");
      out.write("                      style=\"FONT-SIZE: 10pt; COLOR: #009900\">活动介绍</DIV></TD></TR></TBODY></TABLE>\r\n");
      out.write("                  <table cellspacing=0 cellpadding=0 width=\"100%\" \r\n");
      out.write("                  bgcolor=#cccccc border=0>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td height=18 align=\"left\" valign=\"baseline\" bgcolor=#ffffff><p>\r\n");
      out.write("                            ");
      out.write('	');
 //ÏÔÊ¾Í¼ 
      out.write("\r\n");
      out.write("\t\t\t\t   \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("  ");
 
	
	    ResultSet rs_=openrs( stat2, "select *  from ggt ");
				  
	
		
	 
      out.write("<DIV id=demo style=\"OVERFLOW: hidden; WIDTH: 600px\">\r\n");
      out.write("                        <TABLE height=160 cellSpacing=0 cellPadding=0 width=480 \r\n");
      out.write("                        align=center border=0>\r\n");
      out.write("                          <TBODY>\r\n");
      out.write("                          <TR>\r\n");
      out.write("                            <TD id=demo1 align=middle bgColor=#d8d8d8>\r\n");
      out.write("                              <TABLE height=120 cellSpacing=0 cellPadding=0 \r\n");
      out.write("                              width=864 align=center border=0>\r\n");
      out.write("                                <TBODY>\r\n");
      out.write("                                <TR>\r\n");
      out.write("                                <TD height=5></TD></TR>\r\n");
      out.write("                                <TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 while(rs_.next()){ 
      out.write("\r\n");
      out.write("                                <TD align=middle><A \r\n");
      out.write("                                href=\"");
      out.print(rs_.getString("ggurl") );
      out.write("\" \r\n");
      out.write("                                target=_blank><IMG height=96 alt=\"\"\r\n");
      out.write("                                src=\"");
      out.print(rs_.getString("dz") );
      out.write("\" \r\n");
      out.write("                                width=125 border=0> </A></TD>\r\n");
      out.write("                                <TD width=26>&nbsp;</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 }  rs_.first();
								
								 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("                                </TR>\r\n");
      out.write("                                <TR align=middle>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 while(rs_.next()){ 
      out.write("\r\n");
      out.write("                                <TD class=\"red12-1\" class=b12 align=middle height=20><A \r\n");
      out.write("                                class=b12 \r\n");
      out.write("                                href=\"");
      out.print(rs_.getString("ggurl") );
      out.write("\" \r\n");
      out.write("                                target=_blank>");
      out.print(rs_.getString("ggtext") );
      out.write(" </A></TD>\r\n");
      out.write("                                <TD class=b12 height=20>&nbsp;</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 } rs_.close();
      out.write("\r\n");
      out.write("                               </TR></TBODY></TABLE>\r\n");
      out.write("                            <TD id=demo2 align=middle bgColor=#d8d8d8></TD>\r\n");
      out.write("                            <SCRIPT>\r\n");
      out.write("\t\t\t\t  var speed=20//ËÙ¶ÈÊýÖµÔ½´óËÙ¶ÈÔ½Âý\r\n");
      out.write("\t\t\t\t  demo2.innerHTML=demo1.innerHTML\r\n");
      out.write("\t\t\t\t  function Marquee(){\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t  if(demo2.offsetWidth-demo.scrollLeft<=0){\r\n");
      out.write("\t\t\t\t\t\tdemo.scrollLeft-=demo1.offsetWidth;\r\n");
      out.write("\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t\t  else{\r\n");
      out.write("\t\t\t\t\t\tdemo.scrollLeft++\r\n");
      out.write("\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t\t  var MyMar=setInterval(Marquee,speed)\r\n");
      out.write("\t\t\t\t  demo.onmouseover=function() {clearInterval(MyMar)}\r\n");
      out.write("\t\t\t\t  demo.onmouseout=function() {MyMar=setInterval(Marquee,speed)}\r\n");
      out.write("\t\t\t\t  </SCRIPT>\r\n");
      out.write("                          </TR></TBODY></TABLE></DIV>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t   \r\n");
      out.write("\t\t\t\t   \r\n");
      out.write("\t\t\t\t   \r\n");
      out.write("\t\t\t\t  ");
      out.write("\r\n");
      out.write("                        </p></td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                  </table></TH>\r\n");
      out.write("              </TR></TBODY></TABLE>\r\n");
      out.write("            </DIV></TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE><BR>\r\n");
      out.write("<DIV align=center></DIV>\r\n");
      out.write("<TABLE cellSpacing=1 cellPadding=0 width=755 align=center bgColor=#cccccc \r\n");
      out.write("border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD bgColor=#ffffff><TABLE cellSpacing=0 cellPadding=0 width=795 align=center border=0>\r\n");
      out.write("      <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD bgColor=#2D90F6 height=5></TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("      </TBODY>\r\n");
      out.write("    </TABLE>\r\n");
      out.write("      <DIV align=center>\r\n");
      out.write("      <P align=center>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"787\" \r\n");
      out.write("              border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" class=\"black12\">\r\n");
      out.write("  <tbody>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td align=\"middle\"><div align=\"center\">制 作 单 位：丽 水 职 业 技 术 学 院</a></span><br />\r\n");
      out.write("        制作人:罗时针  通信地址：信管0510　邮编：323000　电话：13884359969 邮箱：lsz669969@126.com <br />\r\n");
      out.write("        客户服务:<a href=\"tencent://message/?uin=365039348&amp;Site=大学生心理健康教育&amp;Menu=yes\" target=\"blank\"><img alt=\"在线客服1号\" src=\"http://wpa.qq.com/pa?p=1:1473321:1\" border=\"0\" /></a></div></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("</P>\r\n");
      out.write("      </DIV></TD></TR></TBODY></TABLE>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t  <script language\"javascript\">\r\n");
      out.write("var currentpos,timer; \r\n");
      out.write("function initialize() \r\n");
      out.write("{ \r\n");
      out.write("timer=setInterval(\"scrollwindow()\",2);\r\n");
      out.write("} \r\n");
      out.write("function sc(){\r\n");
      out.write("clearInterval(timer);\t\r\n");
      out.write("}\r\n");
      out.write("function scrollwindow() \r\n");
      out.write("{ \r\n");
      out.write("currentpos=document.body.scrollTop; \r\n");
      out.write("window.scroll(0,++currentpos); \r\n");
      out.write("if (currentpos != document.body.scrollTop) \r\n");
      out.write("sc();\r\n");
      out.write("} \r\n");
      out.write("document.onmousedown=sc\r\n");
      out.write("document.ondblclick=initialize\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t  <SCRIPT language=JavaScript>                     \r\n");
      out.write("<!--                     \r\n");
      out.write("dCol=\"0000FF\"\r\n");
      out.write("fCol=\"FF0000\"\r\n");
      out.write("sCol=\"00FF00\"\r\n");
      out.write("mCol=\"000000\"\r\n");
      out.write("hCol=\"000000\"\r\n");
      out.write("ClockHeight=40;                     \r\n");
      out.write("ClockWidth=40;                     \r\n");
      out.write("ClockFromMouseY=0;                     \r\n");
      out.write("ClockFromMouseX=100;                     \r\n");
      out.write("                     \r\n");
      out.write("d=new Array(\"星期日\",\"星期一\",\"星期二\",\"星期三\",\"星期四\",\"星期五\",\"星期六\");                     \r\n");
      out.write("m=new Array(\"1月\",\"2月\",\"3月\",\"4月\",\"5月\",\"6月\",\"7月\",\"8月\",\"9月\",\"10月\",\"11月\",\"12月\");                     \r\n");
      out.write("date=new Date();                     \r\n");
      out.write("day=date.getDate();                     \r\n");
      out.write("year=date.getYear();                     \r\n");
      out.write("if (year < 2000) year=year+1900;                     \r\n");
      out.write("TodaysDate=\"年 \"+m[date.getMonth()]+\" \"+day+\"日 \"+d[date.getDay()]+\" \"+year;                     \r\n");
      out.write("D=TodaysDate.split('');                     \r\n");
      out.write("H='...';                     \r\n");
      out.write("H=H.split('');                     \r\n");
      out.write("M='....';                     \r\n");
      out.write("M=M.split('');                     \r\n");
      out.write("S='.....';                     \r\n");
      out.write("S=S.split('');                     \r\n");
      out.write("Face='1 2 3 4 5 6 7 8 9 10 11 12';                     \r\n");
      out.write("font='Arial';                     \r\n");
      out.write("size=1;                     \r\n");
      out.write("speed=0.6;                     \r\n");
      out.write("ns=(document.layers);                     \r\n");
      out.write("ie=(document.all);                     \r\n");
      out.write("Face=Face.split(' ');                     \r\n");
      out.write("n=Face.length;                     \r\n");
      out.write("a=size*10;                     \r\n");
      out.write("ymouse=0;                     \r\n");
      out.write("xmouse=0;                     \r\n");
      out.write("scrll=0;                     \r\n");
      out.write("props=\"<font face=\"+font+\" size=\"+size+\" color=\"+fCol+\">\";                     \r\n");
      out.write("props2=\"<font face=\"+font+\" size=\"+size+\" color=\"+dCol+\">\";                     \r\n");
      out.write("Split=360/n;                     \r\n");
      out.write("Dsplit=360/D.length;                     \r\n");
      out.write("HandHeight=ClockHeight/4.5                     \r\n");
      out.write("HandWidth=ClockWidth/4.5                     \r\n");
      out.write("HandY=-7;                     \r\n");
      out.write("HandX=-2.5;                     \r\n");
      out.write("scrll=0;                     \r\n");
      out.write("step=0.06;                     \r\n");
      out.write("currStep=0;                     \r\n");
      out.write("y=new Array();x=new Array();Y=new Array();X=new Array();                     \r\n");
      out.write("for (i=0; i < n; i++){y[i]=0;x[i]=0;Y[i]=0;X[i]=0}                     \r\n");
      out.write("Dy=new Array();Dx=new Array();DY=new Array();DX=new Array();                     \r\n");
      out.write("for (i=0; i < D.length; i++){Dy[i]=0;Dx[i]=0;DY[i]=0;DX[i]=0}                     \r\n");
      out.write("if (ns){                     \r\n");
      out.write("for (i=0; i < D.length; i++)                     \r\n");
      out.write("document.write('<layer name=\"nsDate'+i+'\" top=0 left=0 height='+a+' width='+a+'><center>'+props2+D[i]+'</font></center></layer>');                     \r\n");
      out.write("for (i=0; i < n; i++)                     \r\n");
      out.write("document.write('<layer name=\"nsFace'+i+'\" top=0 left=0 height='+a+' width='+a+'><center>'+props+Face[i]+'</font></center></layer>');                     \r\n");
      out.write("for (i=0; i < S.length; i++)                     \r\n");
      out.write("document.write('<layer name=nsSeconds'+i+' top=0 left=0 width=15 height=15><font face=Arial size=3 color='+sCol+'><center><b>'+S[i]+'</b></center></font></layer>');                     \r\n");
      out.write("for (i=0; i < M.length; i++)                     \r\n");
      out.write("document.write('<layer name=nsMinutes'+i+' top=0 left=0 width=15 height=15><font face=Arial size=3 color='+mCol+'><center><b>'+M[i]+'</b></center></font></layer>');                     \r\n");
      out.write("for (i=0; i < H.length; i++)                     \r\n");
      out.write("document.write('<layer name=nsHours'+i+' top=0 left=0 width=15 height=15><font face=Arial size=3 color='+hCol+'><center><b>'+H[i]+'</b></center></font></layer>');                     \r\n");
      out.write("}                     \r\n");
      out.write("if (ie){                     \r\n");
      out.write("document.write('<div id=\"Od\" style=\"position:absolute;top:0px;left:0px\"><div style=\"position:relative\">');                     \r\n");
      out.write("for (i=0; i < D.length; i++)                     \r\n");
      out.write("document.write('<div id=\"ieDate\" style=\"position:absolute;top:0px;left:0;height:'+a+';width:'+a+';text-align:center\">'+props2+D[i]+'</font></div>');                     \r\n");
      out.write("document.write('</div></div>');                     \r\n");
      out.write("document.write('<div id=\"Of\" style=\"position:absolute;top:0px;left:0px\"><div style=\"position:relative\">');                     \r\n");
      out.write("for (i=0; i < n; i++)                     \r\n");
      out.write("document.write('<div id=\"ieFace\" style=\"position:absolute;top:0px;left:0;height:'+a+';width:'+a+';text-align:center\">'+props+Face[i]+'</font></div>');                     \r\n");
      out.write("document.write('</div></div>');                     \r\n");
      out.write("document.write('<div id=\"Oh\" style=\"position:absolute;top:0px;left:0px\"><div style=\"position:relative\">');                     \r\n");
      out.write("for (i=0; i < H.length; i++)                     \r\n");
      out.write("document.write('<div id=\"ieHours\" style=\"position:absolute;width:16px;height:16px;font-family:Arial;font-size:16px;color:'+hCol+';text-align:center;font-weight:bold\">'+H[i]+'</div>');                     \r\n");
      out.write("document.write('</div></div>');                     \r\n");
      out.write("document.write('<div id=\"Om\" style=\"position:absolute;top:0px;left:0px\"><div style=\"position:relative\">');                     \r\n");
      out.write("for (i=0; i < M.length; i++)                     \r\n");
      out.write("document.write('<div id=\"ieMinutes\" style=\"position:absolute;width:16px;height:16px;font-family:Arial;font-size:16px;color:'+mCol+';text-align:center;font-weight:bold\">'+M[i]+'</div>');                     \r\n");
      out.write("document.write('</div></div>')                     \r\n");
      out.write("document.write('<div id=\"Os\" style=\"position:absolute;top:0px;left:0px\"><div style=\"position:relative\">');                     \r\n");
      out.write("for (i=0; i < S.length; i++)                     \r\n");
      out.write("document.write('<div id=\"ieSeconds\" style=\"position:absolute;width:16px;height:16px;font-family:Arial;font-size:16px;color:'+sCol+';text-align:center;font-weight:bold\">'+S[i]+'</div>');                     \r\n");
      out.write("document.write('</div></div>')                     \r\n");
      out.write("}                     \r\n");
      out.write("(ns)?window.captureEvents(Event.MOUSEMOVE):0;                     \r\n");
      out.write("function Mouse(evnt){                     \r\n");
      out.write("ymouse = (ns)?evnt.pageY+ClockFromMouseY-(window.pageYOffset):event.y+ClockFromMouseY;                     \r\n");
      out.write("xmouse = (ns)?evnt.pageX+ClockFromMouseX:event.x+ClockFromMouseX;                     \r\n");
      out.write("}                     \r\n");
      out.write("(ns)?window.onMouseMove=Mouse:document.onmousemove=Mouse;                     \r\n");
      out.write("function ClockAndAssign(){                     \r\n");
      out.write("time = new Date ();                     \r\n");
      out.write("secs = time.getSeconds();                     \r\n");
      out.write("sec = -1.57 + Math.PI * secs/30;                     \r\n");
      out.write("mins = time.getMinutes();                     \r\n");
      out.write("min = -1.57 + Math.PI * mins/30;                     \r\n");
      out.write("hr = time.getHours();                     \r\n");
      out.write("hrs = -1.575 + Math.PI * hr/6+Math.PI*parseInt(time.getMinutes())/360;                     \r\n");
      out.write("if (ie){                     \r\n");
      out.write("Od.style.top=window.document.body.scrollTop;                     \r\n");
      out.write("Of.style.top=window.document.body.scrollTop;                     \r\n");
      out.write("Oh.style.top=window.document.body.scrollTop;                     \r\n");
      out.write("Om.style.top=window.document.body.scrollTop;                     \r\n");
      out.write("Os.style.top=window.document.body.scrollTop;                     \r\n");
      out.write("}                     \r\n");
      out.write("for (i=0; i < n; i++){                     \r\n");
      out.write("var F=(ns)?document.layers['nsFace'+i]:ieFace[i].style;                     \r\n");
      out.write("F.top=y[i] + ClockHeight*Math.sin(-1.0471 + i*Split*Math.PI/180)+scrll;                     \r\n");
      out.write("F.left=x[i] + ClockWidth*Math.cos(-1.0471 + i*Split*Math.PI/180);                     \r\n");
      out.write("}                     \r\n");
      out.write("for (i=0; i < H.length; i++){                     \r\n");
      out.write("var HL=(ns)?document.layers['nsHours'+i]:ieHours[i].style;                     \r\n");
      out.write("HL.top=y[i]+HandY+(i*HandHeight)*Math.sin(hrs)+scrll;                     \r\n");
      out.write("HL.left=x[i]+HandX+(i*HandWidth)*Math.cos(hrs);                     \r\n");
      out.write("}                     \r\n");
      out.write("for (i=0; i < M.length; i++){                     \r\n");
      out.write("var ML=(ns)?document.layers['nsMinutes'+i]:ieMinutes[i].style;                     \r\n");
      out.write("ML.top=y[i]+HandY+(i*HandHeight)*Math.sin(min)+scrll;                     \r\n");
      out.write("ML.left=x[i]+HandX+(i*HandWidth)*Math.cos(min);                     \r\n");
      out.write("}                     \r\n");
      out.write("for (i=0; i < S.length; i++){                     \r\n");
      out.write("var SL=(ns)?document.layers['nsSeconds'+i]:ieSeconds[i].style;                     \r\n");
      out.write("SL.top=y[i]+HandY+(i*HandHeight)*Math.sin(sec)+scrll;                     \r\n");
      out.write("SL.left=x[i]+HandX+(i*HandWidth)*Math.cos(sec);                     \r\n");
      out.write("}                     \r\n");
      out.write("for (i=0; i < D.length; i++){                     \r\n");
      out.write("var DL=(ns)?document.layers['nsDate'+i]:ieDate[i].style;                     \r\n");
      out.write("DL.top=Dy[i] + ClockHeight*1.5*Math.sin(currStep+i*Dsplit*Math.PI/180)+scrll;                     \r\n");
      out.write("DL.left=Dx[i] + ClockWidth*1.5*Math.cos(currStep+i*Dsplit*Math.PI/180);                     \r\n");
      out.write("}                     \r\n");
      out.write("currStep-=step;                     \r\n");
      out.write("}                     \r\n");
      out.write("function Delay(){                     \r\n");
      out.write("scrll=(ns)?window.pageYOffset:0;                     \r\n");
      out.write("Dy[0]=Math.round(DY[0]+=((ymouse)-DY[0])*speed);                     \r\n");
      out.write("Dx[0]=Math.round(DX[0]+=((xmouse)-DX[0])*speed);                     \r\n");
      out.write("for (i=1; i < D.length; i++){                     \r\n");
      out.write("Dy[i]=Math.round(DY[i]+=(Dy[i-1]-DY[i])*speed);                     \r\n");
      out.write("Dx[i]=Math.round(DX[i]+=(Dx[i-1]-DX[i])*speed);                     \r\n");
      out.write("}                     \r\n");
      out.write("y[0]=Math.round(Y[0]+=((ymouse)-Y[0])*speed);                     \r\n");
      out.write("x[0]=Math.round(X[0]+=((xmouse)-X[0])*speed);                     \r\n");
      out.write("for (i=1; i < n; i++){                     \r\n");
      out.write("y[i]=Math.round(Y[i]+=(y[i-1]-Y[i])*speed);                     \r\n");
      out.write("x[i]=Math.round(X[i]+=(x[i-1]-X[i])*speed);                     \r\n");
      out.write("}                     \r\n");
      out.write("ClockAndAssign();                     \r\n");
      out.write("setTimeout('Delay()',40);                     \r\n");
      out.write("}                     \r\n");
      out.write("if (ns||ie)window.onload=Delay;                     \r\n");
      out.write("//-->                     \r\n");
      out.write("</SCRIPT>\r\n");
      out.write("</BODY></HTML>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
