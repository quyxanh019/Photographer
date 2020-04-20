

<%@page import="model.Information"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link href="css/font.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <%
            Information information = (Information) request.getAttribute("information");
            ArrayList<Gallery> pagingGallery = (ArrayList<Gallery>) request.getAttribute("pagingGallery");
            int numOfPage = (int) request.getAttribute("numOfPage");
            int curentPage = (int) request.getAttribute("curentPage");
            String error = (String) request.getAttribute("error");
        %>

    </head>
    <body>
        <div id="menu" data-page="Menu"></div>    
        <%@ include file="header.jsp" %>
        <div class="container">
            <div class="content">

                <div class="main-content">

                    <div class="intro">
                        <img class="intro-image" src="<%=information.getImage()%>">
                        <i><%=information.getSortAbout()%></i>
                    </div>

                    <%if (error == null) {%>

                    <div class="view-gallery">
                        <%for (Gallery elem : pagingGallery) {%>
                        <div class="gallery-card">
                            <div class="image-card">
                                <img src="<%=elem.getImage()%>">
                            </div>
                            <div class="content-card">
                                <a href="gallery?gid=<%=elem.getId()%>">View <%=elem.getName()%></a>
                                <p><%=elem.getDescription()%></p>
                            </div>
                        </div>
                        <%}%>
                    </div>

                    <div class="paging">
                        <%for (int i = 1; i <= numOfPage; i++) {%>
                        <%if (i == curentPage) {%>

                        <a class="here"><%=i%></a>
                        <%} else {%>
                        <a href="?pageIndex=<%=i%>"><%=i%></a>
                        <%}%>
                        <%}%>
                    </div>

                    <% } else {
                    %>
                    <p><%=error%></p>
                    <%}%>

                    <div class="about-me">
                        <div class="about-title">
                            About me
                        </div>
                        <p>
                            <%=information.getAbout()%>
                        </p>
                    </div>

                </div>

                <%@ include file="sharing.jsp" %>
            </div>
        </div>
        <%@ include file="footer.jsp" %>
    </body>
</html>
