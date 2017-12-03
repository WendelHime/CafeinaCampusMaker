/**
 * 
 */
package br.com.usjt.campusmaker.models;

/**
 * @author wotan
 *	this class represents a feedback from user related to an event
 */
public class Feedback implements IFeedback {
	private Integer id;
	private String pergunta, resposta;
	private IUsuario maker;
	private IEvento evento;
	
	public Feedback() {
		
	}
	
	public Feedback(IFeedback sourceObject) {
		this.id = sourceObject.getId();
		this.pergunta = sourceObject.getPergunta();
		this.resposta = sourceObject.getResposta();
		this.maker = sourceObject.getMaker();
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
	 * @return the pergunta
	 */
	public String getPergunta() {
		return pergunta;
	}

	/**
	 * @param pergunta the pergunta to set
	 */
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	/**
	 * @return the resposta
	 */
	public String getResposta() {
		return resposta;
	}

	/**
	 * @param resposta the resposta to set
	 */
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	/**
	 * @return the maker
	 */
	public IUsuario getMaker() {
		return maker;
	}

	/**
	 * @param maker the maker to set
	 */
	public void setMaker(IUsuario maker) {
		this.maker = maker;
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
