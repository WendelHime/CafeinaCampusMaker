/**
 * 
 */
package br.com.usjt.campusmaker.models;

import java.util.Set;

/**
 * @author wotan Interface created to represent a category
 */
public interface ICategoria {
	Integer getId();

	String getNome();

	Set<ILaboratorio> getLaboratorios();
	
	Set<IUnidade> getUnidades();
	
	Set<ICategoria> getCategorias();

	void setId(Integer id);

	void setNome(String nome);

	void setLaboratorios(Set<ILaboratorio> laboratorios);
	
	void setUnidades(Set<IUnidade> unidades);
	
	void setCategorias(Set<ICategoria> categorias);
}
