package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ptteng.entity.*;
import java.util.*;

public final class check_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <style>\n");
      out.write("        .row1{\n");
      out.write("            background-color:#f0f0f0;\n");
      out.write("        }\n");
      out.write("        .row2{\n");
      out.write("            background-color:#fff8dc;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body style=\"font-size:30px\">\n");
      out.write("<table width=\"60%\" border=1px cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("    <tr>\n");
      out.write("        <td>&nbsp;id</td>\n");
      out.write("        <td>name</td>\n");
      out.write("        <td>salary</td>\n");
      out.write("        <td>age</td>\n");
      out.write("        <td>操作</td>\n");
      out.write("    </tr>\n");
      out.write("    ");

        List<Employee> employees=(List<Employee>)request.getAttribute("employees");
        for(int i=0;i<employees.size();i++){
            Employee e=employees.get(i);
    
      out.write("\n");
      out.write("    <tr class=row");
      out.print((i%2)+1 );
      out.write(">\n");
      out.write("        <td>");
      out.print(e.getId() );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(e.getName() );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(e.getSalary() );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(e.getAge() );
      out.write("</td>\n");
      out.write("        <td><a href='load/id=");
      out.print(e.getId() );
      out.write("'>修改</a>\n");
      out.write("            <a href='del/id=");
      out.print(e.getId() );
      out.write("'\n");
      out.write("               onclick=\"return confirm('确定删除");
      out.print(e.getName() );
      out.write("吗?')\">删除</a>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    ");
} 
      out.write("\n");
      out.write("</table>\n");
      out.write("<p><a href='addEmp.jsp'>添加员工</a></p>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
