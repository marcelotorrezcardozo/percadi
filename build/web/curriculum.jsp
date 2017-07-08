<%--
    Document   : curriculum
    Created on : 04-07-2017, 15:32:47
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
        <link rel="stylesheet" href="fonts/font-awesome.min.css">

    </head>

    <body>

        <!-- navbar-->
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <ul class="nav navbar-nav">
                    <c:if test="${sessionScope.usuario == null}">
                        <li>
                            <a href="#">SOY EMPRESA</a>
                        </li>
                        <li>
                            <a href="#" data-toggle="modal" data-target="#modalLogin">INGRESAR</a>
                        </li>
                        <li>
                            <a href="#" data-toggle="modal" data-target="#modalRegistro">REGISTRARME</a>
                        </li>
                    </c:if>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <c:if test="${sessionScope.usuario != null}">
                        <li class="">
                            <a href="#">MI CV</a>
                        </li>
                        <li class="">
                            <a href="#">MIS POSTULACIONES</a>
                        </li>
                        <li>
                            <a href="#">Bienvenido : ${sessionScope.usuario.nombre}</a>
                        </li>
                        <li>
                            <a href="LogOutController">
                                <span class="glyphicon glyphicon glyphicon-log-out glyphicon-logout"></span>
                            </a>
                        </li>
                    </c:if>
                </ul>
            </div>
        </nav>

        <!--Formulario-->
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <h2 class="text-center">Formulario</h1>
                </div>
            </div>
            <form action="CurriculumController" method="post">
                <h3>Antecedentes Personales</h3>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="nombre" class="">Nombre</label>
                            <p class="">${sessionScope.usuario.nombre}</p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label>Apellido</label>
                            <p class="">${sessionScope.usuario.apellido}</p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label>Correo Electronico</label>
                            <p class="">${sessionScope.usuario.correo}</p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="tipodiscapacidad">Tipo de discapacidad</label>
                            <select class="form-control" id="tipodiscapacidad" name="txtDiscapacidad">
                                <c:forEach items="${requestScope.discList}" var="lista">
                                    <option value="${lista.id}">${lista.nombre}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="telefono">Telefono</label>
                            <input type="text" class="form-control" id="telefono" placeholder="telefono" name="txtTelefono"></div>
                    </div>
                </div>
                <h3>Dirección</h3>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="provincia">Provincia</label>
                            <select class="form-control" name="txtProvincia" id="provincia">
                                <c:forEach items="${requestScope.provList}" var="list">
                                    <option value="${list.id}">${list.nombre}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="ciudad">Ciudad</label>
                            <select class="form-control" name="txtCiudad" id="ciudad">
                                <c:forEach items="${requestScope.ciuList}" var="list">
                                    <option value="${list.id}">${list.nombre}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                </div>
                <h3>Antecedentes Academicos</h3>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="">Titulo Carrera</label>
                            <input type="text" class="form-control" id="Titulo Carrera" placeholder="" name="txtTituloCarrera"></div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="">Institución</label>
                            <input type="text" class="form-control" id="Institución" placeholder="" name="txtInstitucion"></div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="">Promedio de notas</label>
                            <input type="text" class="form-control" id="Promedio de notas" placeholder="" name="txtPromedioNotas"></div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="Tipo Estudio">Tipo Estudio</label>
                            <input type="text" class="form-control" id="Tipo Estudio" placeholder="universitario, doctorado, master, etc" name="txtTipoEstudio"></div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="Estado">Estado</label>
                            </br>
                            <label class="radio-inline">
                                <input type="radio" name="txtEstado" value="e">En Curso</label>
                            <label class="radio-inline">
                                <input type="radio" name="txtEstado" value="g">Graduado</label>
                            <label class="radio-inline">
                                <input type="radio" name="txtEstado" value="a">Abandonado</label>
                        </div>
                    </div>
                </div>
                <h3>Antecedentes Laborales</h3>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="">Nombre de la empresa</label>
                            <input type="text" class="form-control" id="Nombre de la empresa" placeholder="" name="txtNombreEmpresa"></div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="Puesto">Puesto</label>
                            <input type="text" class="form-control" id="Puesto" placeholder="" name="txtPuesto"></div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="Nivel de experiencia">Nivel de experiencia</label>
                            <input type="text" class="form-control" id="Nivel de experiencia" placeholder="" name="txtNivelExperiencia"></div>
                    </div>
                </div>
                <button type="submit" class="btn btn-default col-lg-12">Submit</button>
            </form>
        </div>

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery-3.2.1.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
