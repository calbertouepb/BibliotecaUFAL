package midia;

import java.util.Date;
import java.util.List;

import midia.caracteristicas.*;

public class Anais extends Midia{
	

	public enum tipo{ ARTIGO, POSTER, RESUMO};
	private List<Autor> autores;
	private String nomeDoCongresso;
	private Date dataDePublicao;
	private String local;
	
	public Anais(String titulo, List<Autor> autores, String nomeDoCongresso,
			Date dataDePublicao, String local) {
		super(titulo);
		this.autores = autores;
		this.nomeDoCongresso = nomeDoCongresso;
		this.dataDePublicao = dataDePublicao;
		this.local = local;
	}
	
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	public String getNomeDoCongresso() {
		return nomeDoCongresso;
	}
	public void setNomeDoCongresso(String nomeDoCongresso) {
		this.nomeDoCongresso = nomeDoCongresso;
	}
	public Date getDataDePublicao() {
		return dataDePublicao;
	}
	public void setDataDePublicao(Date dataDePublicao) {
		this.dataDePublicao = dataDePublicao;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	
}
