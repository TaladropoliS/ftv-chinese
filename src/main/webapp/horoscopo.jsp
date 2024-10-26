<%@ page import="com.ftv.modelo.Horoscopo" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%
    Horoscopo h = (Horoscopo) request.getAttribute("horoscopo");
%>
<head>
    <title>My Horoscopo Chino</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link href="assets/style.css" rel="stylesheet">
</head>
<body>
<header>
    <jsp:include page="components/navbar.jsp"/>
</header>
<main id="main" class="container min-vh-100">
    <h3 class="text-center py-3">Mi Horóscopo
        <jsp:include page="components/icons/letter-chinese.jsp"/>
    </h3>

    <div class="col-md-4 card mx-auto text-center">
        <div class="card-body">
            <h5 class="card-title fw-bold">
                <%= h.getAnimal() %>
            </h5>
            <p class="card-text">
                <small class="text-body-secondary">
                    Desde: <%= h.getFecha_inicio() %>
                </small>
                <small class="text-body-secondary">
                    Hasta: <%= h.getFecha_fin() %>
                </small>
            </p>
        </div>
        <img src="<%= h.getUrl() %>" class="card-img-bottom" alt="<%= h.getAnimal() %>">
    </div>

</main>
<jsp:include page="components/footer.jsp"/>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>
