package controladores;

import implementacion.CapacitacionDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Capacitacion;

import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "servletCapacitacion", value = "/servlet-capacitacion")
public class ServletCapacitacion extends HttpServlet {
    //Variables
    private ArrayList<Capacitacion> listaCapacitaciones = new ArrayList<Capacitacion>();
    private CapacitacionDAO capacitacionDAO = new CapacitacionDAO();

    public ServletCapacitacion() {
    }

    /**
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int identificador = Integer.parseInt(request.getParameter("txtCodigoCapacitacion"));
        int rut = Integer.parseInt(request.getParameter("txtRut"));
        String dia = request.getParameter("txtDia");
        String horaIngresada = request.getParameter("txtHora");
        LocalTime hora = LocalTime.parse(horaIngresada);
        String lugar = request.getParameter("txtLugarCapacitacion");
        String duracionIngresada = request.getParameter("txtDuracion");
        LocalTime duracion = LocalTime.parse(duracionIngresada);
        int cantAsistentes = Integer.parseInt(request.getParameter("txtAsistentes"));

        Capacitacion capacitacion = new Capacitacion(identificador, rut, dia, hora, lugar, duracion, cantAsistentes);

        try {
            if (capacitacionDAO.createCapacitacion(capacitacion)) {
                System.out.printf("¡Capacitación Creada correctamente!");
            }
            //Sí no esta
            List<Capacitacion> listaCapacitacion = capacitacionDAO.listaCapacitaciones();
            if (!listaCapacitacion.isEmpty()) {
                //listaCapacitacion.add(capacitacion);
                request.setAttribute("listaCapacitaciones", listaCapacitacion);
                request.getRequestDispatcher("listaCapacitaciones.jsp").forward(request, response); // enviar la solicitud y la respuesta al archivo JSP "tabla.jsp"
                System.out.printf("¡Lista de Capacitaciones mostrada correctamente!");
            }

        } catch (Exception e) {
            System.out.println("Error: doPost ServletCapacitaciones");
        }
    }

    /**
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Sí no esta
        List<Capacitacion> listaCapacitacion = capacitacionDAO.listaCapacitaciones();
        if (!listaCapacitacion.isEmpty()) {
            //listaCapacitacion.add(capacitacion);
            System.out.printf(listaCapacitacion.get(0).getLugar());
            request.setAttribute("listaCapacitaciones", listaCapacitacion);
            request.getRequestDispatcher("listaCapacitaciones.jsp").forward(request, response); // enviar la solicitud y la respuesta al archivo JSP "tabla.jsp"
            System.out.printf("¡Lista de Capacitaciones mostrada correctamente!");
        }

    }
}
