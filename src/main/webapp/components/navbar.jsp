<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark" aria-label="Third navbar example">
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
                    <a class="nav-link active ps-5" href="${pageContext.request.contextPath}/horoscopo.jsp">
                        Tu Horóscopo
                        <jsp:include page="icons/letter-chinese.jsp"/>
                    </a>
                </li>
            </ul>
            <ul class="navbar-nav ms-auto mb-2 mb-sm-0">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#"
                       data-bs-toggle="dropdown" aria-expanded="false">
                        <jsp:include page="icons/user.jsp"/>
                        Username
                    </a>
                    <ul class="dropdown-menu me-auto">
                        <li>
                            <a class="dropdown-item"
                               href="${pageContext.request.contextPath}/login.jsp">
                                LogIn
                            </a>
                        </li>
                        <li>
                            <a class="dropdown-item"
                               href="${pageContext.request.contextPath}/user-register.jsp">
                                Register
                            </a>
                        </li>
                        <li>
                            <a class="dropdown-item"
                               href="${pageContext.request.contextPath}/horoscopo.jsp">
                                My Horóscopo
                            </a>
                        </li>
                        <li>
                            <a class="dropdown-item"
                               href="${pageContext.request.contextPath}/Usuarios">
                                Usuarios
                            </a>
                        </li>
                        <li>
                            <a class="dropdown-item"
                               href="#">logOut</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
