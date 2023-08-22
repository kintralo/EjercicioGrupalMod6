<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>

<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">Capacitaciones</a>
        <button class="navbar-toggler" type="button"
                data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item"><a class="nav-link active"
                                        aria-current="page" href="/">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="listaCapacitaciones"><b>Capacitaciones</b></a>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        <b>Contacto</b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="contacto">Crear contacto</a></li>
                        <li><a class="dropdown-item" href="listaContacto">Listar Contacto</a></li>
                    </ul>
                </li>
                <%

                    if (request.getSession() != null) {

                %>
                <form method="post" action="/logout">
                    <button class="btn btn-outline-danger float-end">Cerrar Sesión</button>
                </form>

                <%
                } else {%>
                <button type="button" class="btn btn-primary float-end" data-bs-toggle="modal" data-bs-target="#loginModal">
                    Login
                </button>
                <%
                    }
                %>
            </ul>

    </div>
</nav>

