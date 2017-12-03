/**
 * 
 */
package br.com.usjt.campusmaker.models;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author wotan Classe representativa de uma unidade de ensino
 */
public class Unidade implements IUnidade {

	private Integer id;
	private String nome, logradouro, numero, telefone;
	private Set<ICategoria> categorias;

	public Unidade() {

	}

	public Unidade(IUnidade sourceObject) {
		this.id = sourceObject.getId();
		this.nome = sourceObject.getNome();
		this.logradouro = sourceObject.getLogradouro();
		this.numero = sourceObject.getNumero();
		this.telefone = sourceObject.getTelefone();
		setCategorias(sourceObject.getCategorias());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
