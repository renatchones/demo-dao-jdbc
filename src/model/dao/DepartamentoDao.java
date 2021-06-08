package model.dao;

import java.util.List;

import model.entidades.Departamento;

public interface DepartamentoDao {

void inserir(Departamento obj);
void update(Departamento obj);
void excluirPorId(Integer id);
Departamento buscarPorId(Integer id);
List<Departamento> buscarTodos(); 

}
