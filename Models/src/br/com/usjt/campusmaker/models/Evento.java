/**
 * 
 */
package br.com.usjt.campusmaker.models;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author wotan this class represents a event
 */
public class Evento implements IEvento {
	private Integer id, tamanhoTurma, periodoInscricao;
	private String nome, descricao, data, duracao;
	private IUsuario administrador, mentor;
	private ITipo tipo;
	private Boolean status;
	private ICategoria categoria;
	private Set<IFeedback> feedbacks;

	public Evento() {

	}

	public Evento(IEvento sourceObject) {
		this.id = sourceObject.getId();
		this.tamanhoTurma = sourceObject.getTamanhoTurma();
		this.periodoInscricao = sourceObject.getPeriodoInscricao();
		this.nome = sourceObject.getNome();
		this.descricao = sourceObject.getDescricao();
		this.data = sourceObject.getData();
		this.duracao = sourceObject.getDuracao();
		this.administrador = sourceObject.getAdministrador();
		this.mentor = sourceObject.getMentor();
		this.tipo = sourceObject.getTipo();
		this.status = sourceObject.getStatus();
		this.categoria = sourceObject.getCategoria();
		setFeedbacks(sourceObject.getFeedbacks());
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
	 * @return the tamanhoTurma
	 */
	public Integer getTamanhoTurma() {
		return tamanhoTurma;
	}

	/**
	 * @param tamanhoTurma
	 *            the tamanhoTurma to set
	 */
	public void setTamanhoTurma(Integer tamanhoTurma) {
		this.tamanhoTurma = tamanhoTurma;
	}

	/**
	 * @return the periodoInscricao
	 */
	public Integer getPeriodoInscricao() {
		return periodoInscricao;
	}

	/**
	 * @param periodoInscricao
	 *            the periodoInscricao to set
	 */
	public void setPeriodoInscricao(Integer periodoInscricao) {
		this.periodoInscricao = periodoInscricao;
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
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 *            the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * @return the duracao
	 */
	public String getDuracao() {
		return duracao;
	}

	/**
	 * @param duracao
	 *            the duracao to set
	 */
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	/**
	 * @return the administrador
	 */
	public IUsuario getAdministrador() {
		return administrador;
	}

	/**
	 * @param administrador
	 *            the administrador to set
	 */
	public void setAdministrador(IUsuario administrador) {
		this.administrador = administrador;
	}

	/**
	 * @return the mentor
	 */
	public IUsuario getMentor() {
		return mentor;
	}

	/**
	 * @param mentor
	 *            the mentor to set
	 */
	public void setMentor(IUsuario mentor) {
		this.mentor = mentor;
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
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * @return the categoria
	 */
	public ICategoria getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria
	 *            the categoria to set
	 */
	public void setCategoria(ICategoria categoria) {
		this.categoria = categoria;
	}
	
	public Set<IFeedback> getFeedbacks() {
		return new HashSet<IFeedback>(feedbacks);
	}

	public void setFeedbacks(Set<IFeedback> feedbacks) {
		Iterator<IFeedback> iterator = feedbacks.iterator();
		while (iterator.hasNext()) {
			this.feedbacks.add((Feedback) iterator.next());
		}
	}

}
