<%--
  Created by IntelliJ IDEA.
  User: Pablo
  Date: 25-08-2023
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<form action="savePago" method="POST" class="was-validated">
    <div class="form-group">
        <div class="row">
            <div class="col-sm-4">
                <label for="lblIdUsuario" class="form-label">
                    <b>Id Usuario</b>
                </label>
                <input type="number" class="form-control"
                       name="txtUdUsuario" value="1" autofocus="autofocus"
                       required>
                <div class="invalid-feedback">Campo obligatorio</div>
            </div>

            <div class="col-sm-4">
                <label for="lblMonto" class="form-label"><b>Monto</b></label>
                <input type="number" class="form-control" id="" name="txtMonto"
                       placeholder="Ingrese el Rut" value="103988" required>
                <div class="invalid-feedback">Campo obligatorio</div>
            </div>

            <div class="col-sm-4">
                <label for="lblHora" class="form-label">
                    <b>Hora</b>
                </label>

                <input type="date" class="form-control" id="hora"
                       name="txtFecha" required>
                <div class="invalid-feedback">Campo obligatorio</div>
            </div>
        </div>
    </div>

    <button type="submit" class="btn btn-primary form-control mt-5">Guardar</button>
</form>