/**
 * 
 */
package br.com.usjt.campusmaker.models;

/**
 * @author wotan 
 * 	this interface represents prefereces of user
 */
public interface IPreferencia {
	Integer getId();

	IUsuario getUsuario();

	IUnidade getUnidade();

	ICategoria getCategoria();

	void setId(Integer id);

	void setUsuario(IUsuario usuario);

	void setUnidade(IUnidade unidade);

	void setCategoria(ICategoria categoria);
}
