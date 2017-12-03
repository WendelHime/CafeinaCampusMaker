/**
 * 
 */
package br.com.usjt.campusmaker.models;

import java.util.Set;

/**
 * @author wotan 
 * this interface represent a event
 */
public interface IEvento {
	Integer getId();

	String getNome();

	String getDescricao();

	String getData();

	String getDuracao();

	Integer getTamanhoTurma();

	Integer getPeriodoInscricao();

	IUsuario getAdministrador();

	IUsuario getMentor();

	ITipo getTipo();

	Boolean getStatus();

	ICategoria getCategoria();

	Set<IFeedback> getFeedbacks();

	void setId(Integer id);

	void setNome(String nome);

	void setDescricao(String descricao);

	void setTamanhoTurma(Integer tamanhoTurma);

	void setPeriodoInscricao(Integer periodoInscricao);

	void setAdministrador(IUsuario administrador);

	void setMentor(IUsuario mentor);

	void setTipo(ITipo tipo);

	void setStatus(Boolean status);

	void setCategoria(ICategoria categoria);

	void setFeedbacks(Set<IFeedback> feedbacks);

}
