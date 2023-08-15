<%--
  Created by IntelliJ IDEA.
  User: Andread
  Date: 14-08-2023
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Lista Contacto</title>

    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
            crossorigin="anonymous">

    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.5/css/jquery.dataTables.min.css">

    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

    <script src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
</head>
<body>
<jsp:include page='headerView.jsp'/>

<div class="container mt-3">
    <div class="row">
        <div class="table-responsive">
            <table id="tablaContacto" class="table table-striped table-bordered display">
                <thead>
                <tr>
                    <th scope="col">Código Contacto</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Email</th>
                    <th scope="col">Descripción</th>
                </tr>
                </thead>
                <c:forEach items="${listaContacto}" var="contacto">
                    <tr>
                        <td>${contacto.id_contacto}</td>
                        <td>${contacto.contacto_nombre}</td>
                        <td>${contacto.contacto_email}</td>
                        <td>${contacto.contacto_mensaje}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</br>
<jsp:include page='footerView.jsp'/>


<script>
    $(document).ready(function () {
        // Inicializar DataTable
        $(".table").DataTable();
    });

</script>

<script
        src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"
        integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS"
        crossorigin="anonymous"></script>

</body>
</html>
