<%--
    Document   : perfilempresa
    Created on : 07-07-2017, 20:51:09
    Author     : alvaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Pecardi</title>

        <!-- Bootstrap -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/index-style.css">
        <link rel="stylesheet" href="fonts/font-awesome.min.css"></head>
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

        <div class="row">
            <div class="container">
                <h2 class="text-center">Avisos</h2>
                <form action="#" method="post">
                    <div class="col-lg-6">
                        <div class="form-group">
                            <label for=""></label>
                            <input type="text" class="form-control" id="" placeholder=""></div>
                    </div>
                    <div class="col-lg-6">
                        <div class="form-group">
                            <label for=""></label>
                            <input type="text" class="form-control" id="" placeholder=""></div>
                    </div>
                </form>
            </div>
        </div>

        <div class="row">
            <div class="container">
                <h3>Avisos disponibles</h3>
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Titulo</th>
                            <th>Estado</th>
                            <th>FinalizaciÃ³n</th>
                            <th>Ãrea</th>
                            <th>CV Recibidos</th>
                            <th>Tipo</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>John</td>
                            <td>Doe</td>
                            <td>john@example.com</td>
                            <td>hola</td>
                            <td>hola</td>
                            <td>hola</td>
                        </tr>
                    </tbody>
                </table>
            </div>

        </div>

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    </body>
</html>
