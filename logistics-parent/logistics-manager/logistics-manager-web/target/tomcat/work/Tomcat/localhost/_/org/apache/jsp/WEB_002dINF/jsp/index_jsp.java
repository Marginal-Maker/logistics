/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-05-12 06:20:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <title>无标题文档</title>\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"place\">\r\n");
      out.write("    <span>位置：</span>\r\n");
      out.write("    <ul class=\"placeul\">\r\n");
      out.write("        <li><a href=\"#\">首页</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"mainindex\">\r\n");
      out.write("    <div class=\"welinfo\">\r\n");
      out.write("        <span><img src=\"images/sun.png\" alt=\"天气\" /></span>\r\n");
      out.write("        <b>Admin早上好，欢迎使用信息管理系统</b>(admin@uimaker.com)\r\n");
      out.write("        <a href=\"#\">帐号设置</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"welinfo\">\r\n");
      out.write("        <span><img src=\"images/time.png\" alt=\"时间\" /></span>\r\n");
      out.write("        <i>您上次登录的时间：2013-10-09 15:22</i> （不是您登录的？<a href=\"#\">请点这里\r\n");
      out.write("    </a>）\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"xline\"></div>\r\n");
      out.write("    <ul class=\"iconlist\">\r\n");
      out.write("        <li><img src=\"images/ico01.png\" /><p><a href=\"#\">管理设置</a></p></li>\r\n");
      out.write("        <li><img src=\"images/ico02.png\" /><p><a href=\"#\">发布文章</a></p></li>\r\n");
      out.write("        <li><img src=\"images/ico03.png\" /><p><a href=\"#\">数据统计</a></p></li>\r\n");
      out.write("        <li><img src=\"images/ico04.png\" /><p><a href=\"#\">文件上传</a></p></li>\r\n");
      out.write("        <li><img src=\"images/ico05.png\" /><p><a href=\"#\">目录管理</a></p></li>\r\n");
      out.write("        <li><img src=\"images/ico06.png\" /><p><a href=\"#\">查询</a></p></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"ibox\"><a class=\"ibtn\"><img src=\"images/iadd.png\" />添加新的快捷功能\r\n");
      out.write("    </a></div>\r\n");
      out.write("    <div class=\"xline\"></div>\r\n");
      out.write("    <div class=\"box\"></div>\r\n");
      out.write("    <div class=\"welinfo\">\r\n");
      out.write("        <span><img src=\"images/dp.png\" alt=\"提醒\" /></span>\r\n");
      out.write("        <b>Uimaker信息管理系统使用指南</b>\r\n");
      out.write("    </div>\r\n");
      out.write("    <ul class=\"infolist\">\r\n");
      out.write("        <li><span>您可以快速进行文章发布管理操作</span><a class=\"ibtn\">发布或管理文章\r\n");
      out.write("        </a></li>\r\n");
      out.write("        <li><span>您可以快速发布产品</span><a class=\"ibtn\">发布或管理产品</a></li>\r\n");
      out.write("        <li><span>您可以进行密码修改、账户设置等操作</span><a class=\"ibtn\">账户管理</a>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"xline\"></div>\r\n");
      out.write("    <div class=\"uimakerinfo\"><b>查看Uimaker网站使用指南，您可以了解到多种风格的B/S后台管\r\n");
      out.write("        理界面,软件界面设计，图标设计，手机界面等相关信息</b>(<a href=\"http://www.uimaker.com\"\r\n");
      out.write("                                         target=\"_blank\">www.uimaker.com</a>)</div>\r\n");
      out.write("    <ul class=\"umlist\">\r\n");
      out.write("        <li><a href=\"#\">如何发布文章</a></li>\r\n");
      out.write("        <li><a href=\"#\">如何访问网站</a></li>\r\n");
      out.write("        <li><a href=\"#\">如何管理广告</a></li>\r\n");
      out.write("        <li><a href=\"#\">后台用户设置(权限)</a></li>\r\n");
      out.write("        <li><a href=\"#\">系统设置</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"display:none\"><script src='http://v7.cnzz.com/stat.php?\r\n");
      out.write("id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
