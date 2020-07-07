package EvaluacionDao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import EvaluacionConexion.ConexionSingleton;
import EvaluacionIDao.clienteIDao;
import EvaluacionModelo.Cliente;


public class ClienteDao implements clienteIDao{

	public boolean agregar (Cliente cliente) {
		// TODO Auto-generated constructor stub
		boolean agregar= false;
		
		Statement stm = null;
		Connection con= null;
		
		String sql = "INSERT INTO cliente VALUES (null,'" + cliente.getNombre() + " ','" + cliente.getTelefono()
		+ "', '" + cliente.getDireccion() + "','" + cliente.getCorreoelectronico() + "','" + cliente.getRubro() + "')";
		
		try {
			con=ConexionSingleton.getConnection();
			stm= con.createStatement();
			stm.execute(sql);
			agregar = true;
			stm.close();			
			
		}catch(SQLException e) {			
			System.out.println("Error: clase ClienteDao, Metodo agregar ");
			e.printStackTrace();
			
		}
		
		return agregar;
	}
    
	  public List<Cliente> Listar(){
		  Connection con =null;
		  Statement stm =null;
		  ResultSet rs =null;
		  
		  String sql = "select * from CLIENTE ORDER BY ID";
		  
		  List<Cliente> listaCliente = new ArrayList<Cliente>();
		  
		  try {
			  con = ConexionSingleton.getConnection();
			  stm = con.createStatement();
			  rs =  stm.executeQuery(sql);
			  while (rs.next()) {
				  Cliente c = new Cliente();
				  c.setId(rs.getInt(1));
				  c.setNombre(rs.getString(2));
				  c.setTelefono(rs.getInt(3));
				  c.setDireccion(rs.getString(4));
				  c.setCorreoelectronico(rs.getString(5));
				  c.setRubro(rs.getString(6));
				  listaCliente.add(c);
			  }
			  
			  stm.close();
			  rs.close();
			  
		  }catch(SQLException e) {			
				System.out.println("Error: clase ClienteDao, Metodo listar ");
				e.printStackTrace();
				
	  }
		  return listaCliente;
}
      
	  public boolean actualizar(Cliente cliente) {
		  
		  Statement stm = null;
		  Connection con= null;
		  
		  boolean actualizar = false; 
		  
		  String sql = "UPDATE CLIENTE SET nombre ='" + cliente.getNombre() + " ', telefono = '" + cliente.getTelefono()
			+ "',direccion = '" + cliente.getDireccion() + "', correoElectronico ='" + cliente.getCorreoelectronico() + "', rubro ='" + cliente.getRubro() + "')";
					  
		  	  try {
			  con = ConexionSingleton.getConnection();
			  stm = con.createStatement();
			  stm.execute (sql);
			  actualizar = true;
			  stm.close();
	   
		  
	  }catch(SQLException e) {			
			System.out.println("Error: clase ClienteDao, Metodo actualizar ");
			e.printStackTrace();
			
	  }
		return actualizar;
		
}

     public boolean eliminar (Cliente cliente) {
    	 Statement stm = null;
		  Connection con= null;
		  
		  boolean eliminar = false;
		  
		  String sql = "DELETE * FROM cliente WHERE id = " + cliente.getIdCliente();
		  
		  try {
			  con = ConexionSingleton.getConnection();
			  stm = con.createStatement();
			  stm.execute (sql);
			  eliminar = true;
			  stm.close();
			  
		  }catch(SQLException e) {			
				System.out.println("Error: clase ClienteDao, Metodo eliminar ");
				e.printStackTrace();
				
		  }
			return eliminar;
			  
		  
     }
     
     public Cliente buscar(int clienteid){
		  Connection con =null;
		  Statement stm =null;
		  ResultSet rs =null;
		  
		  String sql = "select * from CLIENTE WHERE id = '" +  clienteid + " '";
		  
		  Cliente cli = new Cliente();
		  
		  try {
			  con = ConexionSingleton.getConnection();
			  stm = con.createStatement();
			  rs =  stm.executeQuery(sql);
			  while (rs.next()) {				 
				  cli.setId(rs.getInt(1));
				  cli.setNombre(rs.getString(2));
				  cli.setTelefono(rs.getInt(3));
				  cli.setDireccion(rs.getString(4));
				  cli.setCorreoelectronico(rs.getString(5));
				  cli.setRubro(rs.getString(6));
				  
			  }
			  stm.close();
			  rs.close();
			  
		  }catch(SQLException e) {			
				System.out.println("Error: clase ClienteDao, Metodo buscar ");
				e.printStackTrace();
				
		  }
			return cli;
			


	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente Buscar(int clienteid) {
		// TODO Auto-generated method stub
		return null;
	}


	}
	