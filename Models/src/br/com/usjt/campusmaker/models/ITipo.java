/**
 * 
 */
package br.com.usjt.campusmaker.models;

/**
 * @author wotan This interface represents types
 */
public interface ITipo {
	Integer getId();

	String getTag();

	String getDescricao();

	void setId(Integer id);

	void setTag(String tag);

	void setDescricao(String descricao);
}
