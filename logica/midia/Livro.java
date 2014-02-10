package midia;

import java.util.Date;

import midia.isbn.ISBN;
import midia.caracteristicas.*;

public class Livro  extends Midia{
	

	private ISBN isbn;
	private String editora;
	private Date anoDePublicacao;
	private int edicao;
	private int numeroDePaginas;
	private String areaDoConhecimento;
	private String tema;
	
	public Livro(String titulo, ISBN isbn, String editora,
			Date anoDePublicacao, int edicao, int numeroDePaginas,
			String areaDoConhecimento, String tema) {
		super(titulo);
		this.isbn = isbn;
		this.editora = editora;
		this.anoDePublicacao = anoDePublicacao;
		this.edicao = edicao;
		this.numeroDePaginas = numeroDePaginas;
		this.areaDoConhecimento = areaDoConhecimento;
		this.tema = tema;
	}
	
	public void setIsbn( ISBN isbn ){
		this.isbn = isbn;
	}
	
	public ISBN getIsbn(){
		return isbn;
	}


	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Date getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(Date anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public String getAreaDoConhecimento() {
		return areaDoConhecimento;
	}

	public void setAreaDoConhecimento(String areaDoConhecimento) {
		this.areaDoConhecimento = areaDoConhecimento;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
}
