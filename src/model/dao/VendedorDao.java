package model.dao;

import java.util.List;

import model.entidades.Vendedor;

public interface VendedorDao {
	void inserir(Vendedor obj);
	void update(Vendedor obj);
	void excluirPorId(Integer id);
	Vendedor buscarPorId(Integer id);
	List<Vendedor> buscarTodos();

}
