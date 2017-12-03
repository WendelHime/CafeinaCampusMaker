/**
 * 
 */
package br.com.usjt.campusmaker.models;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author wotan this class represents a fucking user
 */
public class Usuario implements IUsuario {
	private Integer id;
	private String nome, cpf, email, senha;
	private ITipo tipo;
	private IPreferencia preferencia;
	private Set<IFeedback> feedbacks;

	public Usuario() {

	}

	public Usuario(IUsuario sourceObject) {
		this.id = sourceObject.getId();
		this.nome = sourceObject.getNome();
		this.cpf = sourceObject.getCpf();
		this.email = sourceObject.getEmail();
		this.senha = sourceObject.getSenha();
		this.tipo = sourceObject.getTipo();
		this.preferencia = sourceObject.getPreferencia();
		setFeedback(sourceObject.getFeedback());
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf
	 *            the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha
	 *            the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the tipo
	 */
	public ITipo getTipo() {
		return tipo;
	}

	/**
	 * @param tipo
	 *            the tipo to set
	 */
	public void setTipo(ITipo tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the preferencia
	 */
	public IPreferencia getPreferencia() {
		return preferencia;
	}

	/**
	 * @param preferencia
	 *            the preferencia to set
	 */
	public void setPreferencia(IPreferencia preferencia) {
		this.preferencia = preferencia;
	}

	public Set<IFeedback> getFeedback() {
		return new HashSet<IFeedback>(feedbacks);
	}

	public void setFeedback(Set<IFeedback> feedbacks) {
		Iterator<IFeedback> iterator = feedbacks.iterator();
		while (iterator.hasNext()) {
			this.feedbacks.add((Feedback) iterator.next());
		}
	}
}
