

<%@page import="model.Contact"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact us</title>
        <link href="css/contact.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>

        <%
            Contact contact = (Contact) request.getAttribute("contact");
        %>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div class="container">
            <div class="content">
                <div class="main-content">

                    <h1 class="space">Contact</h1>
                    <p></p>
                    <h1>PHOTOGRAPHER</h1>

                    <div class="info-contact">


                        <div class="address">
                            <table>
                                <tr>
                                    <td class="title-name">Address:</td>
                                    <td><%=contact.getAddress()%></td>
                                </tr>
                                <tr>
                                    <td class="title-name">City:</td>
                                    <td><%=contact.getCity()%></td>
                                </tr>
                                <tr>
                                    <td class="title-name">Country:</td>
                                    <td><%=contact.getCountry()%></td>
                                </tr>
                            </table>
                        </div>

                        <div class="tel-mail">
                            <table>
                                <tr>
                                    <td class="title-name">Tel:</td>
                                    <td><%=contact.getPhone()%></td>
                                </tr>
                                <tr>
                                    <td class="title-name">Email:</td>
                                    <td><%=contact.getEmail()%></td>
                                </tr> 
                            </table>
                        </div>



                        <div class="map">
                            <img src="<%=contact.getImage()%>">
                        </div>    

                    </div>
                </div>
                <%@ include file="sharing.jsp" %>
            </div>
        </div>
        <%@ include file="footer.jsp" %>
    </body>
</html>
