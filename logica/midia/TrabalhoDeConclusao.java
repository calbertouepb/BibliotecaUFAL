package midia;

import java.util.Date;
import java.util.List;

import midia.caracteristicas.*;

public class TrabalhoDeConclusao extends Midia{
	

	public  enum tipo{ MONOGRAFIA, TESE, DISSERTACAO};
	private List<Autor> autores;
	private String orientadores;
	private Date defesa;
	private String local;
	
	public TrabalhoDeConclusao(String titulo, List<Autor> autores,
			String orientadores, Date defesa, String local) {
		super(titulo);
		this.autores = autores;
		this.orientadores = orientadores;
		this.defesa = defesa;
		this.local = local;
	}
	
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	public String getOrientadores() {
		return orientadores;
	}
	public void setOrientadores(String orientadores) {
		this.orientadores = orientadores;
	}
	public Date getDefesa() {
		return defesa;
	}
	public void setDefesa(Date defesa) {
		this.defesa = defesa;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
}
