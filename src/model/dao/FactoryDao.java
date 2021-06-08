package model.dao;

import model.dao.impl.VendedorDaoJDBC;

public class FactoryDao {

	
	public static VendedorDao criarVendedorDao() {
		return new VendedorDaoJDBC();
	}
	
	
}
