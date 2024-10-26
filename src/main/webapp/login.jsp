<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String errorMessage = (String) request.getAttribute("errorMessage"); %>
<% String registerMessage = (String) request.getAttribute("registerMessage"); %>
<% String deletedMessage = (String) request.getAttribute("deletedMessage"); %>

<html lang="es" data-bs-theme="dark">
<head>
    <title>logIn</title>
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
    <h3 class="text-center py-3">Entrar</h3>

    <% if (errorMessage != null) {%>
    <div class="col-md-4 mx-auto alert alert-danger" role="alert">
        <%= errorMessage %>
    </div>
    <% }%>
    <% if (registerMessage != null) {%>
    <div class="col-md-4 mx-auto alert alert-success" role="alert">
        <%= registerMessage %>
    </div>
    <% }%>
    <% if (deletedMessage != null) {%>
    <div class="col-md-4 mx-auto alert alert-success" role="alert">
        <%= deletedMessage %>
    </div>
    <% }%>

    <div class="col-md-5 card mx-auto">
        <form class="p-3" method="post" action="${pageContext.request.contextPath}/InicioSesion">
            <div class="form-floating mb-3">
                <input type="text" class="form-control" id="floatingUsername" name="username" required>
                <label for="floatingUsername">Username</label>
            </div>
            <div class="form-floating">
                <input type="password" class="form-control" id="floatingPassword" name="password" required>
                <label for="floatingPassword">Password</label>
            </div>
            <div class="col-2 mx-auto pt-3">
                <button class="btn btn-primary" type="submit">Enviar</button>
            </div>
        </form>
        <p class="py-3 text-center">Si no tienes una cuenta,
            <a class="btn btn-outline-primary btn-sm" href="${pageContext.request.contextPath}/user-register.jsp">
                Regístrate
            </a>
        </p>
    </div>

</main>
<jsp:include page="components/footer.jsp"/>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>
