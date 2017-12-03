/**
 * 
 */
package br.com.usjt.campusmaker.models;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author wotan Class created to represent a lab
 */
public class Laboratorio implements ILaboratorio {

	private Integer id, capacidade;
	private String nome, sala;
	private IUnidade unidade;
	private Set<ICategoria> categorias;

	public Laboratorio() {

	}

	public Laboratorio(ILaboratorio sourceObject) {
		this.id = sourceObject.getId();
		this.nome = sourceObject.getNome();
		this.sala = sourceObject.getSala();
		this.unidade = sourceObject.getUnidade();
		setCategorias(sourceObject.getCategorias());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.usjt.campusmaker.models.ILaboratorio#getId()
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.usjt.campusmaker.models.ILaboratorio#getNome()
	 */
	@Override
	public String getNome() {
		return nome;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.usjt.campusmaker.models.ILaboratorio#getSala()
	 */
	@Override
	public String getSala() {
		return sala;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.usjt.campusmaker.models.ILaboratorio#getCapacidade()
	 */
	@Override
	public Integer getCapacidade() {
		return capacidade;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.usjt.campusmaker.models.ILaboratorio#getUnidade()
	 */
	@Override
	public IUnidade getUnidade() {
		return unidade;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.usjt.campusmaker.models.ILaboratorio#setId(java.lang.Integer)
	 */
	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.usjt.campusmaker.models.ILaboratorio#setNome(java.lang.String)
	 */
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.usjt.campusmaker.models.ILaboratorio#setSala(java.lang.String)
	 */
	@Override
	public void setSala(String sala) {
		this.sala = sala;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.usjt.campusmaker.models.ILaboratorio#setCapacidade(java.lang.Integer)
	 */
	@Override
	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.usjt.campusmaker.models.ILaboratorio#setUnidade(br.com.usjt.
	 * campusmaker.models.IUnidade)
	 */
	@Override
	public void setUnidade(IUnidade unidade) {
		this.unidade = unidade;
	}

	@Override
	public Set<ICategoria> getCategorias() {
		return new HashSet<ICategoria>(categorias);
	}

	@Override
	public void setCategorias(Set<ICategoria> categorias) {
		Iterator<ICategoria> iterator = categorias.iterator();
		while (iterator.hasNext()) {
			this.categorias.add((Categoria) iterator.next());
		}
	}

}
