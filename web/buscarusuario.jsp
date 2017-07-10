<%--
    Document   : buscarusuario
    Created on : 08-07-2017, 13:16:17
    Author     : alvaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Pecardi</title>

        <!-- Bootstrap -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
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

        <!--jumbotron-->
        <div class="container">
            <div class="jumbotron">
                <h2 class="text-center">Busqueda de usuarios</h2>
                <div class="row">
                    <div class="col-lg-6 col-lg-push-3">
                        <form action="#" method="post">
                            <div class="form-group">
                                <label class="text-center"></label>
                                <input type="text" class="form-control" id="input" onkeyup="find()" placeholder="palabra clave"></div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!--filtro-->
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-3">
                    <h3 class="text-center">Filtro</h3>
                    <form action="#" method="post">
                        <h4 class="text-center">Edad</h4>
                        <div class="row">
                            <div class="col-lg-6 col-lg-push-3">
                                <div class="form-group">
                                    <input type="text" class="form-control" id="filtro" placeholder="" onkeyup="" name="txtEdad">
                                </div>
                            </div>
                        </div>
                        <h4 class="text-center">Sexo</h4>
                        <div class="row">
                            <div class="col-lg-4 col-lg-push-4">
                                <div class="form-group">
                                    <select class="form-control" id="" name="txtSexo">
                                        <option value="m">Masculino</option>
                                        <option value="f">Femenino</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <h4 class="text-center">Lugar de residencia</h4>
                        <div class="row">
                            <div class="col-lg-4 col-lg-push-4">
                                <div class="form-group">
                                    <label for="" class="text-center">Ciudad</label>
                                    <select class="form-control" name="">
                                        <c:forEach items="${requestScope.ciuList}" var="list">
                                            <option value="${list.id}">${list.nombre}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-4 col-lg-push-4">
                                <div class="form-group">
                                    <label for="" class="text-center">Provincia</label>
                                    <select class="form-control" name="">
                                        <c:forEach items="${requestScope.provList}" var="list">
                                            <option value="${list.id}">${list.nombre}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <h4 class="text-center">Discapacidad</h4>
                        <div class="row">
                            <div class="col-lg-4 col-lg-push-4">
                                <div class="form-group">
                                    <label for="" class="text-center">tipo</label>
                                    <select class="form-control" name="">
                                        <c:forEach items="${requestScope.discList}" var="list">
                                            <option value="${list.id}">${list.nombre}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-default col-lg-12">Submit</button>
                    </form>
                </div>
                <div class="col-lg-9">

                    <!--tabla-->
                    <h2>Usuarios</h2>
                    <table class="table table-bordered" id="tabla">
                        <thead>
                            <tr>
                                <th>Nombre</th>
                                <th>Apellido</th>
                                <th>Edad</th>
                                <th>Correo</th>
                                <th>Discapacidad</th>
                                <th>Salario Estimado</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${requestScope.curlist}" var="list">
                                <tr>
                                    <td>${list.usuario.nombre}</td>
                                    <td>${list.usuario.apellido}</td>
                                    <td>${list.edad}</td>
                                    <td>${list.usuario.correo}</td>
                                    <td>${list.discapacidad.nombre}</td>
                                    <td>${list.salario}</td>
                                </tr>
                            </c:forEach>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>



        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery-3.2.1.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/filter.js"></script>
    </body>
</html>
