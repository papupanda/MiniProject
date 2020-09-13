<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    

        <h1>New Admin Registration</h1>  
       <form:form method="post" action="save" modelAttribute="registration">    
        <table >    
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>Gmail :</td>    
          <td><form:input path="Gmail" /></td>  
         </tr>   
         <tr>    
          <td>Address :</td>    
          <td><form:input path="Address" /></td>  
         </tr>  
         <tr>    
          <td>PhoneNumber :</td>    
          <td><form:input path="phoneNumber" /></td>  
         </tr> 
         <tr>    
          <td>Password:</td>    
          <td><form:input path="password" /></td>  
         </tr>  
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Submit" /></td>    
         </tr> 
         <tr>
         <td>${sucess}</td>
         </tr>   
        </table>    
       </form:form> 