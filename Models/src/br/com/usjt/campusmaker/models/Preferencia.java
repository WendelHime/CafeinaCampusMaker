/**
 * 
 */
package br.com.usjt.campusmaker.models;

/**
 * @author wotan
 *	this class represents preferences of user
 */
public class Preferencia implements IPreferencia {
	private Integer id;
	private IUsuario usuario;
	private IUnidade unidade;
	private ICategoria categoria;
	
	public Preferencia() {
		
	}
	
	public Preferencia(IPreferencia sourceObject) {
		this.id = sourceObject.getId();
		this.usuario = sourceObject.getUsuario();
		this.unidade = sourceObject.getUnidade();
		this.categoria = sourceObject.getCategoria();
	}
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the usuario
	 */
	public IUsuario getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(IUsuario usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the unidade
	 */
	public IUnidade getUnidade() {
		return unidade;
	}
	/**
	 * @param unidade the unidade to set
	 */
	public void setUnidade(IUnidade unidade) {
		this.unidade = unidade;
	}
	/**
	 * @return the categoria
	 */
	public ICategoria getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(ICategoria categoria) {
		this.categoria = categoria;
	}
	
	
}
