/**
 * 
 */
package br.com.usjt.campusmaker.models;

/**
 * @author wotan 
 * this interface represents a feedback
 */
public interface IFeedback {
	Integer getId();

	String getPergunta();

	String getResposta();

	IEvento getEvento();

	IUsuario getMaker();

	void setId(Integer id);

	void setPergunta(String pergunta);

	void setResposta(String resposta);

	void setEvento(IEvento evento);

	void setMaker(IUsuario usuario);
}
