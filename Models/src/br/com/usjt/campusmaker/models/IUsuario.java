/**
 * 
 */
package br.com.usjt.campusmaker.models;

import java.util.Set;

/**
 * @author wotan This interface represents a user
 */
public interface IUsuario {
	Integer getId();

	String getNome();

	String getCpf();

	String getEmail();

	String getSenha();

	ITipo getTipo();

	IPreferencia getPreferencia();

	Set<IFeedback> getFeedback();

	void setId(Integer id);

	void setNome(String nome);

	void setCpf(String cpf);

	void setEmail(String email);

	void setSenha(String senha);

	void setTipo(ITipo tipo);

	void setPreferencia(IPreferencia preferencia);

	void setFeedback(Set<IFeedback> feedback);
}
