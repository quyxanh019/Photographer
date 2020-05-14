
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Gallery</title>
        <link href="css/gallery.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <script src="javascript/js.js" type="text/javascript"></script>
        <%
            Gallery gallery = (Gallery) request.getAttribute("gallery");
            int numOfPage = (int) request.getAttribute("numOfPage");
            int curentPage = (int) request.getAttribute("curentPage");
            String error = (String) request.getAttribute("error");
        %>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div class="container">
            <div class="content">
                <div class="main-content">

                    <%if (error == null) {%>
                    <h1><%=gallery.getName()%></h1>

                    <div class="image-large">
                        <img name="showingImage" src="<%=gallery.getImageList().get(0)%>" alt=""/>
                    </div>


                    <div class="detail-gallery">
                        <%for (String elem : gallery.getImageList()) {%>

                        <div onclick="changeImage('<%=elem%>')"  class="image-small">
                            <img src="<%=elem%>">
                        </div>
                        <% }
                        %>
                    </div>

                    <div class="paging">
                        <%for (int i = 1; i <= numOfPage; i++) {%>
                        <%if (i == curentPage) {%>
                        <a class="here"><%=i%></a>
                        <%} else {%>
                        <a href="?pageIndex=<%=i%>&gid=<%=gallery.getId()%>"><%=i%></a>
                        <%}%>
                        <%}%>
                    </div>

                    <%} else {
                    %>
                    <div>
                        <p><%=error%></p>
                    </div>
                    <%}%>


                </div>
                <%@ include file="sharing.jsp" %>
            </div>
        </div>
        <%@ include file="footer.jsp" %>
    </body>
</html>
