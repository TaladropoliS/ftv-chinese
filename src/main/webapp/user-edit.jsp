<%@ page import="com.ftv.modelo.Usuario" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Usuario u = (Usuario) request.getAttribute("usuario");
%>
<html lang="es" data-bs-theme="dark">
<head>
    <title>Editar</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link href="assets/style.css" rel="stylesheet">
    <link href="assets/img/favicon.png" type="image/x-icon" rel="icon">
</head>
<body>
<header>
    <jsp:include page="components/navbar.jsp"/>
</header>
<main id="main" class="container min-vh-100">
    <h3 class="text-center py-3">Actualizar</h3>

    <div class="col-md-8 card mx-auto">
        <form class="p-3" method="post" action="${pageContext.request.contextPath}/ModificarUsuario"
              onsubmit="return validatePassword()">
            <%--            <input type="text" name="password" hidden value="<%= u.getPassword() %>">--%>
            <div class="row row-cols-2">
                <div class="col form-floating mb-3">
                    <input type="text" class="form-control" id="floatingName" name="nombre" required
                           value="<%= u.getNombre() %>">
                    <label for="floatingName">Nombre</label>
                </div>
                <div class="col form-floating mb-3">
                    <input type="text" class="form-control" id="floatingUsername" name="username" required
                           value="<%= u.getUsername() %>">
                    <label for="floatingUsername">Username</label>
                </div>
            </div>
            <div class="row row-cols-3">
                <div class="col-5 form-floating mb-3">
                    <input type="email" class="form-control" id="floatingEmail" name="email" required
                           value="<%= u.getEmail() %>">
                    <label for="floatingEmail">Email</label>
                </div>
                <div class="col-5 form-floating mb-3">
                    <input type="date" class="form-control" id="floatingFecha" name="fecha_nacimiento" required
                           value="<%= u.getFecha_nacimiento() %>">
                    <label for="floatingFecha">Fecha de nacimiento</label>
                </div>
                <div class="col-2 form-floating mb-3">
                    <input type="text" class="form-control" id="floatingId" name="id" readonly
                           value="<%= u.getId() %>">
                    <label for="floatingId">Id</label>
                </div>
            </div>
            <div class="row row-cols-2">
                <div class="form-floating mb-3">
                    <input type="password" class="form-control" id="floatingPassword" name="password" required
                           value="<%= u.getPassword() %>">
                    <label for="floatingPassword">Password</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="password" class="form-control" id="floatingRePassword" name="password2" required
                           value="<%= u.getPassword() %>">
                    <label for="floatingRePassword">Re Password</label>
                </div>
            </div>
            <div class="col-2 mx-auto pt-3">
                <button class="btn btn-primary" type="submit">Enviar</button>
            </div>
        </form>
    </div>

</main>
<jsp:include page="components/footer.jsp"/>
<script>
    function validatePassword() {
        var password = document.getElementById("floatingPassword").value;
        var confirmPassword = document.getElementById("floatingRePassword").value;

        if (password !== confirmPassword) {
            alert("Las contraseñas no coinciden.");
            return false;
        }
        return true;
    }
</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>
