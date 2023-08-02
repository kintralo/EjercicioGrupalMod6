<%--
  Created by IntelliJ IDEA.
  User: Pablo
  Date: 28-07-2023
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<form action="" method="POST" class="was-validated">
    <div class="form-group">
        <div class="row">
            <div class="col-sm-3">
                <label for="lblCodigoCapacitacion" class="form-label">
                    <b>Código Capacitación</b>
                </label>
                <input type="text" class="form-control" id="formEditIdentificador"
                       name="txtCodigoCapacitacion"  value=""
                       >
                <div class="invalid-feedback">Campo obligatorio</div>
            </div>

            <div class="col-sm-3">
                <label for="lblRut" class="form-label"><b>Rut</b></label>
                <input type="text" class="form-control"
                       id="formEditRut" name="txtRut" required>
                <div class="invalid-feedback">Campo obligatorio</div>
            </div>

            <div class="col-sm-3">
                <label for="lblDia" class="form-label">
                    <b>Día de la Capacitación</b>
                </label>
                <select class="form-select" aria-label="Default select example" name="txtDia" id="formEditDia">
                    <option selected disabled>Selecciones un Usuario</option>
                    <option value="Lunes"><b>Lunes</b></option>
                    <option value="Martes"><b>Martes</b></option>
                    <option value="Miercoles"><b>Miércoles</b></option>
                    <option value="Jueves"><b>Jueves</b></option>
                    <option value="Viernes"><b>Viernes</b></option>
                </select>
                <div class="invalid-feedback">Campo obligatorio</div>
            </div>

            <div class="col-sm-3">
                <label for="lblHora" class="form-label">
                    <b>Hora:</b>
                </label>
                <input type="text" class="form-control" id="formEditHora"
                       name="txtHora" required>
                <div class="invalid-feedback">Campo obligatorio</div>
            </div>
        </div>
    </div>
    <div class="form-group">
        <label for="lblLugarCapacitacion" class="form-label">
            <b>Lugar de la Capacitación</b>
        </label>
        <textarea class="form-control" id="formEditLugar"
                  name="txtLugarCapacitacion" rows="3"
                  value="Aquí es la capacitación"
                  required>
                            </textarea>
        <div class="invalid-feedback">Campo obligatorio</div>
    </div>

    <div class="form-group">
        <div class="row">
            <div class="col-sm-6">
                <label for="lblDuracion" class="form-label">
                    <b>Duración de la capacitación:</b>
                </label>
                <input type="text" class="form-control" id="formEditDuracion" name="txtDuracion"
                       required>
                <div class="invalid-feedback">Campo obligatorio</div>
            </div>

            <div class="col-sm-6">
                <label for="lblAsistentes" class="form-label">
                    <b>Cantidad de asistentes:</b>
                </label>
                <input type="number" class="form-control" id="formEditAsistentes" name="txtAsistentes" value="12"
                       required>
                <div class="invalid-feedback">Campo obligatorio</div>
            </div>
        </div>
    </div>
    <button type="submit" class="btn btn-primary form-control mt-5">Guardar</button>
</form>
