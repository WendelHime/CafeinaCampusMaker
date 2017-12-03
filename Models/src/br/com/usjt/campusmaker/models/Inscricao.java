/**
 * 
 */
package br.com.usjt.campusmaker.models;

/**
 * @author wotan
 *
 */
public class Inscricao implements IInscricao {
    
    private Integer id;
	private String data;
	private ITipo status;
	private IUsuario usuario;
	private IEvento evento;
	
	public Inscricao() {
		
	}
	
	public Inscricao(IInscricao sourceObject) {
		this.id = sourceObject.getId();
		this.data = sourceObject.getData();
		this.status = sourceObject.getStatus();
		this.usuario = sourceObject.getUsuario();
		this.evento = sourceObject.getEvento();
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
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * @return the status
	 */
	public ITipo getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(ITipo status) {
		this.status = status;
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
	 * @return the evento
	 */
	public IEvento getEvento() {
		return evento;
	}

	/**
	 * @param evento the evento to set
	 */
	public void setEvento(IEvento evento) {
		this.evento = evento;
	}
	
	
}
