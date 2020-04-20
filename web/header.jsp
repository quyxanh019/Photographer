
<%@page import="java.util.ArrayList"%>
<%@page import="model.Gallery"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/header.css" rel="stylesheet" type="text/css"/>
        <script src="javascript/js.js" type="text/javascript"></script>

        <%
            ArrayList<Gallery> top3Galleries = (ArrayList<Gallery>) request.getAttribute("top3Galleries");
        %>

    </head>
    <body>
        <div class="header">

            <div class="navitigator">
                <div class="navi-bar">

                    <a id="home"  class="navi-text" href="home">
                        <div class="navi-item">My front page</div>
                    </a>

                    <%for (Gallery elem : top3Galleries) {%>
                    <a id="gallery<%=elem.getId()%>" class="navi-text" href="gallery?gid=<%=elem.getId()%>&pageIndex=1">
                        <div class="navi-item"><%=elem.getName()%></div>
                    </a>
                    <%}%>
                    <a id="contact" class="navi-text" href="contact">
                        <div class="navi-item">Contact</div>
                    </a>

                </div>
            </div>

            <div class="title-header">
                <div class="title-content">
                    <div class="title-logo">
                        <img src="image/logo.PNG" class="logo"/>
                    </div>

                    <div class="title-web">
                        <div class="name-web">
                            <a>PHOTOGRAPHER</a>
                        </div>

                        <div class="sub-title">
                            Welcome to this website
                        </div>
                    </div>

                </div>
            </div>
        </div>
        <script>
            setBold();
        </script>
    </body>
</html>
