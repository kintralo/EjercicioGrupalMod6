<%--
  Created by IntelliJ IDEA.
  User: Pablo
  Date: 25-08-2023
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: Pablo
  Date: 13-07-2023
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html; charset=UTF-8" %>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Contacto</title>

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
<jsp:include page='modalPagoView.jsp' flush="true"/>
<jsp:include page='modalEditarCapacitacionView.jsp' flush="true"/>

<div class="container mt-3">
    <div class="row">
        <div class="col-md-12">
            <button type="button" class="btn btn-primary float-end" data-bs-toggle="modal"
                    data-bs-target="#modalCrearPago">
                Crear Pago
            </button>
        </div>
    </div>
</div>

<div class="container mt-3">
    <div class="row">
        <div class="col-md-12">
            <h1 class="mt-3" style='text-align: center'>Listado de Pagos</h1>


            <div class="table-responsive">
                <table id="tablaCapacitaciones" class="table table-striped table-bordered display">
                    <thead>
                    <tr>
                        <th scope="col">Código Pago</th>
                        <th scope="col">Id Usuario</th>
                        <th scope="col">Monto</th>
                        <th scope="col">Fecha</th>
                    </tr>
                    </thead>
                    <tbody>

                    <c:forEach items="${listaPago}" var="pago">
                        <tr>
                            <td>${pago.id_pago}</td>
                            <td>${pago.id_usuario}</td>
                            <td>${pago.monto}</td>
                            <td>${pago.fecha_pago}</td>
                        </tr>

                    </c:forEach>
                    </tbody>
                </table>

                <script>
                    $(document).ready(function () {
                        // Inicializar DataTable
                        $(".table").DataTable();
                    });
                </script>

                <script>
                    function eliminarCapacitacion(identificador) {
                        if (confirm('�Est� seguro que desea eliminar la capacitaci�n ' + identificador + '?')) {
                            // hacer una llamada AJAX para eliminar la capacitaci�n de la lista
                            // por ejemplo, podr�amos enviar una solicitud POST al servlet que maneja la eliminaci�n de capacitaciones
                            // despu�s de eliminar la capacitaci�n, volver a cargar la p�gina para actualizar la tabla
                            window.location.reload();
                        }
                    }
                </script>
            </div>
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

    $("body").on("click", "#btnActualizarCapacitacion", function (e) {
        e.preventDefault();
        var codigo = $(this).parent().parent().children()[0];
        //var codigo =  parseFloat($(this).parent().parent().children().eq(0).find('formEditIdentificador').val());

        var rut = $(this).parent().parent().children()[1];
        var dia = $(this).parent().parent().children()[2];
        var hora = $(this).parent().parent().children()[3];
        var lugar = $(this).parent().parent().children()[4];
        var duracion = $(this).parent().parent().children()[5];
        var asistentes = $(this).parent().parent().children()[6];
        //console.log($(codigo).text());


        document.getElementById('formEditIdentificador').value = $(codigo).text();
        document.getElementById('formEditRut').value = $(rut).text();
        // var rut = parseFloat(document.getElementById('formEditRut').value);
        //document.getElementById('formEditRut').value =  rut;
        document.getElementById('formEditDia').value = $(dia).text();
        document.getElementById('formEditLugar').value = $(lugar).text();
        document.getElementById('formEditHora').value = $(hora).text();
        document.getElementById('formEditDuracion').value = $(duracion).text();
        document.getElementById('formEditAsistentes').value = $(asistentes).text();
    })
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
