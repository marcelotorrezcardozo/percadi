<%-- 
    Document   : buscarusuario
    Created on : 08-07-2017, 13:16:17
    Author     : alvaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Pecardi</title>

        <!-- Bootstrap -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="fonts/font-awesome.min.css">
    </head>
    <body>
        <!-- navbar-->
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="#">Estadistica de cuenta</a>
                    </li>
                    <li>
                        <a href="#">Buscar usuario</a>
                    </li>
                    <li>
                        <a href="#">Publicar aviso</a>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <c:if test="${sessionScope.empresa != null}">
                        <a href="LogOutController">
                            <span class="glyphicon glyphicon glyphicon-log-out glyphicon-logout"></span>
                        </a>
                    </c:if>
                </ul>
            </div>
        </nav>

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery-3.2.1.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
