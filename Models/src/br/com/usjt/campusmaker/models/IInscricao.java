/**
 * 
 */
package br.com.usjt.campusmaker.models;

/**
 * @author wotan
 *	this interface represents a inscription of event
 */
public interface IInscricao {
	Integer getId();
	String getData();
	ITipo getStatus();
	IUsuario getUsuario();
	IEvento getEvento();
	void setId(Integer id);
	void setData(String data);
	void setStatus(ITipo tipo);
	void setUsuario(IUsuario usuario);
	void setEvento(IEvento evento);
}
