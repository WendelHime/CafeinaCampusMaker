/**
 * 
 */
package br.com.usjt.campusmaker.models;

import java.util.Set;

/**
 * @author wotan Interface da unidade de ensino
 */
public interface IUnidade {
	Integer getId();

	String getNome();

	String getLogradouro();

	String getNumero();

	String getTelefone();

	Set<ICategoria> getCategorias();

	void setId(Integer id);

	void setNome(String nome);

	void setLogradouro(String logradouro);

	void setNumero(String numero);

	void setTelefone(String telefone);

	void setCategorias(Set<ICategoria> categorias);

}
