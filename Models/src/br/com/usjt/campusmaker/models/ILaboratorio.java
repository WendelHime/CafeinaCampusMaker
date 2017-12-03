/**
 * 
 */
package br.com.usjt.campusmaker.models;

import java.util.Set;

/**
 * @author wotan Interface created to represent a lab
 */
public interface ILaboratorio {
	Integer getId();

	String getNome();

	String getSala();

	Integer getCapacidade();

	IUnidade getUnidade();

	Set<ICategoria> getCategorias();

	void setId(Integer id);

	void setNome(String nome);

	void setSala(String sala);

	void setCapacidade(Integer capacidade);

	void setUnidade(IUnidade unidade);

	void setCategorias(Set<ICategoria> categorias);
}
