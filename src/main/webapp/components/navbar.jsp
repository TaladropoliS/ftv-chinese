<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String usuario = (String) request.getSession().getAttribute("usuario");
    String fecha_nac = (String) request.getSession().getAttribute("fecha_nac");
    String id_request_user = (String) request.getSession().getAttribute("id");
%>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark fixed-top border border-bottom"
     aria-label="Third navbar example">
    <div class="container-fluid px-md-5">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/index.jsp">
            <jsp:include page="icons/yin-yang.jsp"/>
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample03"
                aria-controls="navbarsExample03" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarsExample03">
            <ul class="navbar-nav ms-auto mb-2 mb-sm-0">
                <li class="nav-item">
                    <% if (usuario != null) { %>
                    <a class="ms-5 btn btn-outline-primary btn-sm"
                       href="${pageContext.request.contextPath}/GetHoroscopo?fecha_nacimiento=<%= fecha_nac %>&id=<%= id_request_user %>">
                        Ver Tu Horóscopo
                        <jsp:include page="icons/letter-chinese.jsp"/>
                        <% if (fecha_nac != null) { %>
                        <%= fecha_nac %>
                        <%}%>
                    </a>
                    <% } %>
                </li>
            </ul>
            <ul class="navbar-nav ms-auto mb-2 mb-sm-0 pe-5">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#"
                       data-bs-toggle="dropdown" aria-expanded="false">
                        <jsp:include page="icons/user.jsp"/>
                        <% if (usuario != null) { %>
                        <%= usuario %>
                        <% } else { %>
                        Ingresar
                        <% } %>
                    </a>
                    <ul class="dropdown-menu me-auto">
                        <% if (usuario == null) { %>
<%--                        <li>--%>
<%--                            <hr class="dropdown-divider">--%>
<%--                        </li>--%>
                        <li>
                            <a class="dropdown-item"
                               href="${pageContext.request.contextPath}/login.jsp">
                                Entrar
                            </a>
                        </li>
                        <li>
                            <hr class="dropdown-divider">
                        </li>
                        <li>
                            <a class="dropdown-item"
                               href="${pageContext.request.contextPath}/user-register.jsp">
                                Registrarse
                            </a>
                        </li>
                        <% } %>
                        <% if (usuario != null) { %>
                        <li>
                            <a class="dropdown-item"
                               href="${pageContext.request.contextPath}/index.jsp">
                                Inicio
                            </a>
                        </li>
                        <li>
                            <hr class="dropdown-divider">
                        </li>
                        <li>
                            <a class="dropdown-item"
                               href="${pageContext.request.contextPath}/GetHoroscopo?fecha_nacimiento=<%= fecha_nac %>&id=<%= id_request_user %>">
                                My Horóscopo
                            </a>
                        </li>
                        <li>
                            <hr class="dropdown-divider">
                        </li>
                        <li>
                            <a class="dropdown-item"
                               href="${pageContext.request.contextPath}/Usuarios">
                                Usuarios
                            </a>
                        </li>
                        <li>
                            <hr class="dropdown-divider">
                        </li>
                        <li>
                            <a class="dropdown-item"
                               href="${pageContext.request.contextPath}/CerrarSesion">
                                Salir
                            </a>
                        </li>
                        <% } %>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
