<%@ page import="com.ftv.modelo.Usuario" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Usuario> usuarios = (List<Usuario>) request.getAttribute("usuarios");
%>
<html>
<head>
    <title>Usuarios</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<header>
    <jsp:include page="components/navbar.jsp"/>
</header>
<main class="container min-vh-100">
    <h3 class="text-center py-3">Usuarios</h3>

    <table class="table table-striped table-hover">
        <thead>
        <tr>
            <th>Id</th>
            <th>Nombre</th>
            <th>Username</th>
            <th>Email</th>
            <th>Fecha de nacimiento</th>
            <th>Animal</th>
            <th>Acciones</th>
        </tr>
        </thead>
        <tbody>
        <%
            if (usuarios != null && !usuarios.isEmpty()) {
                for (Usuario u : usuarios) {
        %>
        <tr>
            <td><%= u.getId() %></td>
            <td><%= u.getNombre() %></td>
            <td><%= u.getUsername() %></td>
            <td><%= u.getEmail() %></td>
            <td><%= u.getFecha_nacimiento() %></td>
            <td><%= u.getAnimal() %></td>
            <td>
                <a href="${pageContext.request.contextPath}/GetUsuario?id=<%= u.getId() %>"
                   class="btn btn-outline-warning me-md-3">
                    <jsp:include page="components/icons/edit.jsp"/>
                </a>
                <a href="#" class="btn btn-outline-danger">
                    <jsp:include page="components/icons/delete.jsp"/>
                </a>
            </td>
        </tr>
        <%
            }
        } else {
        %>
        <tr>
            <td colspan="5" class="text-center">No hay usuarios disponibles.</td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>

</main>
<jsp:include page="components/footer.jsp"/>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>
