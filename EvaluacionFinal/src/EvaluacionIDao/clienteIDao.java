package EvaluacionIDao;


import java.util.List;

import EvaluacionModelo.Cliente;



public interface clienteIDao {

	public boolean agregar (Cliente cliente);
	public List<Cliente> listar();
	public boolean actualizar (Cliente cliente);
	public boolean eliminar(Cliente cliente);
	public Cliente Buscar(int clienteid);
	
	
}

