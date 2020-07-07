package EvaluacionControlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import EvaluacionDao.ClienteDao;
import EvaluacionModelo.Cliente;

/**
 * Servlet implementation class EditarCliente
 */
@WebServlet("/EditarCliente")
public class EditarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		System.out.println("entre");
		
		Cliente cli = new Cliente();
		
		int idcliente = Integer.parseInt(request.getParameter("idcliente"));
		String nombre =request.getParameter("nombre");
		int telefono = Integer.parseInt(request.getParameter("telefono"));
		String direccion =request.getParameter("direccion");
		String correo =request.getParameter("correo");
		String rubro =request.getParameter("rubro");
		
		cli.setId(idcliente);
		cli.setNombre(nombre);
		cli.setTelefono(telefono);
		cli.setDireccion(direccion);
		cli.setCorreoelectronico(correo);
		cli.setRubro(rubro);
		
		ClienteDao clientedao = new ClienteDao();
		
		boolean editar = false;
		editar = clientedao.actualizar(cli);
		
		String mensaje = "";
		
		if (editar)
			mensaje = "El cliente ha sido actualizado exitosamente";
		else
			mensaje = "Ocurrio un error al procesar la solicitud";
		
		request.setAttribute("ccmensaje",mensaje);
		request.setAttribute("regcli", cli);
		request.getRequestDispatcher("EditarCliente.jsp").forward(request,response);
		
	
		
	}

}
