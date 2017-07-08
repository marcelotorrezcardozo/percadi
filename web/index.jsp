<%--
    Document   : index
    Created on : 01-07-2017, 0:05:14
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
          <link rel="stylesheet" href="css/index-style.css">

            <!-- Bootstrap -->
            <link rel="stylesheet" href="css/bootstrap.min.css">
              <link rel="stylesheet" href="fonts/font-awesome.min.css"></head>

              <body>

                <!-- navbar-->
                <nav class="navbar navbar-default">
                  <div class="container-fluid">
                    <ul class="nav navbar-nav">
                      <c:if test="${sessionScope.usuario == null}">
                        <li>
                          <a href="#" data-toggle="modal" data-target="#modalEmpresa">SOY EMPRESA</a>
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
                          <a href="MostrarCurriculum">MI CV</a>
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

                <!--jumbotron-->
                <div class="jumbotron">
                  <div class="container">
                    <div class="row">
                      <div class="col-lg-12">
                        <h1 class="text-center">Busca una nueva oportunidad</h1>
                      </div>
                    </div>
                    <div class="row">
                      <form class="form-group" action="#" method="post">
                        <div class="form-group col-lg-6">
                          <label for="usr">Encuentra:</label>
                          <input type="text" class="form-control" id="usr"></div>
                          <div class="form-group col-lg-6">
                            <label for="pwd">En:</label>
                            <input type="password" class="form-control" id="pwd"></div>
                            <button type="submit" class="btn btn-default col-lg-12">Submit</button>
                          </form>
                        </div>
                        <a href="#">busqueda avanzada</a>
                      </div>
                    </div>

                    <!--sidenav-->
                    <div class="container-fluid">
                      <div class="row">
                        <div class="col-lg-4 sidebar">
                          <div class="mini-submenu">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                          </div>
                          <div class="list-group">
                            <span href="#" class="list-group-item active">
                              Areas
                            </span>
                            <a href="#" class="list-group-item">
                              Call Center
                            </a>
                            <a href="#" class="list-group-item">
                              Diseño
                            </a>
                            <a href="#" class="list-group-item">
                              Legales
                            </a>
                            <a href="#" class="list-group-item">
                              Marketing
                            </a>
                            <a href="#" class="list-group-item">
                              Mineria
                            </a>
                            <a href="#" class="list-group-item">
                              Recursos Humanos
                            </a>
                            <a href="#" class="list-group-item">
                              Tecnologia
                            </a>
                            <a href="#" class="list-group-item">
                              Ventas
                            </a>
                            <a href="#" class="list-group-item">
                              Comunicacion
                            </a>
                            <a href="#" class="list-group-item">
                              Construcción
                            </a>
                            <a href="#" class="list-group-item">
                              Finanzas
                            </a>
                            <a href="#" class="list-group-item">
                              Ingeniería
                            </a>
                            <a href="#" class="list-group-item">
                              Logística
                            </a>
                            <a href="#" class="list-group-item">
                              Medicina
                            </a>
                            <a href="#" class="list-group-item">
                              Secretaria
                            </a>
                            <a href="#" class="list-group-item">
                              Seguros
                            </a>
                            <a href="#" class="list-group-item">
                              Oficios
                            </a>
                            <a href="#" class="list-group-item">
                              Producción
                            </a>
                            <a href="#" class="list-group-item">
                              Gerencia
                            </a>
                            <a href="#" class="list-group-item">
                              Gastronomia
                            </a>
                            <a href="#" class="list-group-item">
                              Educación
                            </a>
                            <a href="#" class="list-group-item">
                              Comercio Exterior
                            </a>
                          </div>
                        </div>

                        <!--paneles-->
                        <div class="col-lg-8">
                          <h2>Empleos Destacados</h2>
                          <div class="panel panel-default col-lg-12">
                            <div class="col-lg-1">
                              <span class="glyphicon glyphicon-briefcase glyphicon-panel"></span>
                            </div>
                            <div class="col-lg-11">
                              Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo co mollit anim id est
                              laborum.
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>

                    <!--modal-registro -->
                    <div id="modalRegistro" class="modal fade" role="dialog">
                      <div class="modal-dialog">

                        <!-- Modal content-->
                        <div class="modal-content">
                          <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title text-center">Unete a Percadi</h4>
                          </div>
                          <div class="modal-body">
                            <form action="LoginController" method="post">
                              <div class="row">
                                <div class="col-lg-6">
                                  <div class="form-group">
                                    <label for="nombre">Nombre</label>
                                    <input type="text" class="form-control" id="nombre" placeholder="nombre" name="txtNombre"></div>
                                  </div>
                                  <div class="col-lg-6">
                                    <div class="form-group">
                                      <label for="apellido">Apellido</label>
                                      <input type="text" class="form-control" id="apellido" placeholder="apellido" name="txtApellido"></div>
                                    </div>
                                  </div>
                                  <div class="row">
                                    <div class="col-lg-6">
                                      <div class="form-group">
                                        <label for="email">Email</label>
                                        <input type="text" class="form-control" id="email" placeholder="email" name="txtEmail"></div>
                                      </div>
                                      <div class="col-lg-6">
                                        <div class="form-group">
                                          <label for="usunombre">Nombre de usuario</label>
                                          <input type="text" class="form-control" id="usunombre" placeholder="nombre de usuario" name="txtNick"></div>
                                        </div>
                                      </div>
                                      <div class="row">
                                        <div class="col-lg-6">
                                          <div class="form-group">
                                            <label for="contraseña">Contraseña</label>
                                            <input type="password" class="form-control" id="contraseña" placeholder="contraseña" name="txtPassword"></div>
                                          </div>
                                        </div>
                                        <div class="row">
                                          <div class="col-lg-3">
                                            <input type="hidden" name="accion" value="register">
                                              <button type="submit" class="btn btn-default">Crear Cuenta</button>
                                            </div>
                                          </div>
                                        </form>
                                      </div>
                                    </div>
                                  </div>
                                </div>

                                <!--modal-login-->
                                <div id="modalLogin" class="modal fade" role="dialog">
                                  <div class="modal-dialog modal-sm">

                                    <!-- Modal content-->
                                    <div class="modal-content">
                                      <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                        <h4 class="modal-title text-center">Ingresa a Percadi</h4>
                                      </div>
                                      <div class="modal-body">
                                        <form action="LoginController" method="post">
                                          <div class="row">
                                            <div class="col-lg-12">
                                              <div class="form-group">
                                                <label for="Email">Email</label>
                                                <input type="text" class="form-control" id="Email" placeholder="Email" name="txtEmail"></div>
                                              </div>
                                            </div>
                                            <div class="row">
                                              <div class="col-lg-12">
                                                <div class="form-group">
                                                  <label for="logincontraseña">Contraseña</label>
                                                  <input type="password" class="form-control" id="logincontraseña" placeholder="contraseña" name="txtPassword"></div>
                                                </div>
                                              </div>
                                              <div class="row">
                                                <div class="col-lg-12">
                                                  <label class="checkbox-inline">
                                                    <input type="checkbox" value="">Recordarme</label>
                                                  </div>
                                                </div>
                                                <div class="row">
                                                  <div class="col-lg-12">
                                                    <input type="hidden" name="accion" value="login">
                                                      <button type="submit" class="btn btn-default" style="margin-top:18px;">Ingresar</button>
                                                    </div>
                                                  </div>
                                                </form>
                                              </div>
                                            </div>

                                          </div>
                                        </div>

                                        <!--modal-empresa-->
                                        <div id="modalEmpresa" class="modal fade" role="dialog">
                                          <div class="modal-dialog modal-lg">

                                            <!-- Modal content-->
                                            <div class="modal-content">
                                              <div class="modal-header">
                                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                <h4 class="modal-title text-center">Ingresa a Percadi</h4>
                                              </div>
                                              <div class="modal-body">
                                                <div class="row">
                                                  <div class="col-lg-6">
                                                    <h3 class="text-center">Registrar mi empresa</h3>
                                                    <form action="#" method="post">
                                                      <div class="row">
                                                        <div class="col-lg-6">
                                                          <div class="form-group">
                                                            <label for="">Email</label>
                                                            <input type="text" class="form-control" id="" placeholder="" name="txtEmailEmpresa"></div>
                                                          </div>
                                                          <div class="col-lg-6">
                                                            <div class="form-group">
                                                              <label for="">Contraseña</label>
                                                              <input type="text" class="form-control" id="" placeholder="" name="txtContraseñaEmpresa"></div>
                                                            </div>
                                                          </div>
                                                          <div class="row">
                                                            <div class="col-lg-6">
                                                              <div class="form-group">
                                                                <label for="">Rut de la empresa</label>
                                                                <input type="text" class="form-control" id="" placeholder="" name="txtRutEmpresa"></div>
                                                              </div>
                                                              <div class="col-lg-6">
                                                                <div class="form-group">
                                                                  <label for="">Razon Social</label>
                                                                  <input type="text" class="form-control" id="" placeholder="" name="txtRazonSocialEmpresa"></div>
                                                                </div>
                                                              </div>
                                                              <div class="row">
                                                                <div class="col-lg-6">
                                                                  <div class="form-group">
                                                                    <label for="">Nombre de la empresa</label>
                                                                    <input type="text" class="form-control" id="" placeholder="" name="txtNombreEmpresa"></div>
                                                                  </div>
                                                                  <div class="col-lg-6">
                                                                    <div class="form-group">
                                                                      <label for="">Telefono</label>
                                                                      <input type="text" class="form-control" id="" placeholder="" name="txtTelefonoEmpresa"></div>
                                                                    </div>
                                                                  </div>
                                                                  <div class="row">
                                                                    <div class="col-lg-6">
                                                                      <div class="form-group">
                                                                        <label for="">Nombre de contacto</label>
                                                                        <input type="text" class="form-control" id="" placeholder="" name="txtNombreContactoEmpresa"></div>
                                                                      </div>
                                                                    </div>
                                                                    <div class="row">
                                                                      <div class="col-lg-12">
                                                                        <input type="hidden" name="accion" value="registerempresa">
                                                                          <button type="submit" class="btn btn-default col-lg-12" style="margin-top:18px;">Ingresar</button>
                                                                        </div>
                                                                      </div>
                                                                    </form>
                                                                  </div>
                                                                  <div class="col-lg-6">
                                                                    <h3 class="text-center">Email</h3>
                                                                    <div class="row">
                                                                      <div class="col-lg-12">
                                                                        <form action="#" method="post">
                                                                          <div class="form-group">
                                                                            <label for="">prueba</label>
                                                                            <input type="text" class="form-control" id="" placeholder=""></div>
                                                                          </div>
                                                                        </div>
                                                                        <div class="row">
                                                                          <div class="col-lg-12">
                                                                            <div class="form-group">
                                                                              <label for="">Contraseña</label>
                                                                              <input type="text" class="form-control" id="" placeholder=""></div>
                                                                            </div>
                                                                          </div>
                                                                          <div class="row">
                                                                            <div class="col-lg-12">
                                                                              <input type="hidden" name="accion" value="login">
                                                                                <button type="submit" class="btn btn-default col-lg-12" style="margin-top:18px;">Ingresar</button>
                                                                              </div>
                                                                            </div>
                                                                          </form>
                                                                        </div>
                                                                      </div>
                                                                    </div>
                                                                  </div>

                                                                </div>
                                                              </div>

                                                              <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
                                                              <script src="js/jquery-3.2.1.min.js"></script>
                                                              <!-- Include all compiled plugins (below), or include individual files as needed -->
                                                              <script src="js/bootstrap.min.js"></script>

                                                            </body>

                                                          </html>