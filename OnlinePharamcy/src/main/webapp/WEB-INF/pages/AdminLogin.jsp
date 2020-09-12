<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
      <h1>Admin Login Page</h1>
<form:form method="post" action="#" modelAttribute="admin">
<table>
         <tr>    
          <td>Username : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>Password :</td>    
          <td><form:input path="password" /></td>  
         </tr> 
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Login" />
          <input type="reset" value="reset" /></td>    
         </tr>
         <tr><td><a href="#">ForgotPassword</a>&nbsp;&nbsp;
                 <a href="#">New Registration</a>
         </td>
         </tr>  
         <tr></tr>
         <tr><td><a href="first">Home</a></td></tr> 
</table>
</form:form>

