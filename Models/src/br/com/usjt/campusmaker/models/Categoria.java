/**
 * 
 */
package br.com.usjt.campusmaker.models;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author wotan
 * Class created to represent a category
 */
public class Categoria implements ICategoria {
	private Integer id;
	private String nome;
	private Set<IUnidade> unidades;
	private Set<ILaboratorio> laboratorios;
	private Set<ICategoria> categorias;
	
	public Categoria() {
		
	}
	
	public Categoria(ICategoria sourceObject) {
		this.id = sourceObject.getId();
		this.nome = sourceObject.getNome();
		setLaboratorios(sourceObject.getLaboratorios());
		setCategorias(sourceObject.getCategorias());
	}

	/* (non-Javadoc)
	 * @see br.com.usjt.campusmaker.models.ICategoria#getId()
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see br.com.usjt.campusmaker.models.ICategoria#getNome()
	 */
	@Override
	public String getNome() {
		return nome;
	}

	/* (non-Javadoc)
	 * @see br.com.usjt.campusmaker.models.ICategoria#setId(java.lang.Integer)
	 */
	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see br.com.usjt.campusmaker.models.ICategoria#setNome(java.lang.String)
	 */
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public Set<ILaboratorio> getLaboratorios() {
		return new HashSet<ILaboratorio>(laboratorios);
	}

	@Override
	public void setLaboratorios(Set<ILaboratorio> laboratorios) {
		Iterator<ILaboratorio> iterator = laboratorios.iterator();
		while (iterator.hasNext()) {
			this.laboratorios.add((Laboratorio) iterator.next());
		}
	}

	@Override
	public Set<IUnidade> getUnidades() {
		return new HashSet<IUnidade>(unidades);
	}

	@Override
	public void setUnidades(Set<IUnidade> unidades) {
		Iterator<IUnidade> iterator = unidades.iterator();
		while (iterator.hasNext()) {
			this.unidades.add((Unidade) iterator.next());
		}
	}

	/**
	 * @return the categorias
	 */
	public Set<ICategoria> getCategorias() {
		return categorias;
	}

	/**
	 * @param categorias the categorias to set
	 */
	public void setCategorias(Set<ICategoria> categorias) {
		this.categorias = categorias;
	}

}
