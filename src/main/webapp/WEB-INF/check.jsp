<%@page contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%@page import="com.ptteng.entity.*,java.util.*" %>
<html>
<head>
    <style>
        .row1{
            background-color:#f0f0f0;
        }
        .row2{
            background-color:#fff8dc;
        }
    </style>
</head>
<body style="font-size:30px">
<table width="60%" border=1px cellpadding="0" cellspacing="0">
    <tr>
        <td>&nbsp;id</td>
        <td>name</td>
        <td>salary</td>
        <td>age</td>
        <td>操作</td>
    </tr>
    <%
        List<Employee> employees=(List<Employee>)request.getAttribute("employees");
        for(int i=0;i<employees.size();i++){
            Employee e=employees.get(i);
    %>
    <tr class=row<%=(i%2)+1 %>>
        <td><%=e.getId() %></td>
        <td><%=e.getName() %></td>
        <td><%=e.getSalary() %></td>
        <td><%=e.getAge() %></td>
        <td><a href='load/id=<%=e.getId() %>'>修改</a>
            <a href='del/id=<%=e.getId() %>'
               onclick="return confirm('确定删除<%=e.getName() %>吗?')">删除</a>
        </td>
    </tr>
    <%} %>
</table>
<p><a href='addEmp.jsp'>添加员工</a></p>
</body>
</html>