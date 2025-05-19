<%-- 
    Document   : config
    Created on : 20 Mar 2025, 17:41:11
    Author     : new
--%>


<%@page import="dao.dbContext"%>
<%@page import="essentails.config"%>
<%
    config c = new config();
    c.setWebsiteurl("http://localhost:8080/HBOnlineExam/");
    c.setDefaulturl("profile.jsp");
    c.setLoginurl("login.jsp");
    c.setRequest(request);
    c.setResponse(response);
    c.setSession(session);
    

// DB config
     c.setDbHost("jdbc:mysql://localhost:3306");
     c.setDbName("userdetails");
     c.setDbuser("root");
     c.setDbpass("root");
     
    
%>
