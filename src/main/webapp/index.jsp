<%
    String usuario = (String) request.getSession().getAttribute("usuario");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es" data-bs-theme="dark">
<head>
    <title>Inicio</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link href="assets/style.css" rel="stylesheet">
    <link href="assets/img/favicon.png" type="image/x-icon" rel="icon">
</head>
<body>
<header>
    <jsp:include page="components/navbar.jsp"/>
</header>
<main id="main" class="container min-vh-100 text-center">
    <h4>
        <% if (usuario != null) { %>
        <%= usuario %>
        <% }%>
    </h4>
    <div class="col-md-6 mx-auto text-center pt-3">
        <img class="img-fluid px-md-5" alt="horóscopo"
             src="https://fernandotaladriz.com/03-img-h-ch/Horoscopo.png">
    </div>

</main>
<jsp:include page="components/footer.jsp"/>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>
