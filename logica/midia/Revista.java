package midia;

import java.util.Date;

public class Revista extends Midia {
	
	private String editora;
	private Date dataDaPublicacao;
	private int edicao;
	private int numeroDePaginas;
	
	public Revista(String titulo, String editora, Date dataDaPublicacao,
			int edicao, int numeroDePaginas) {
		super(titulo);
		this.editora = editora;
		this.dataDaPublicacao = dataDaPublicacao;
		this.edicao = edicao;
		this.numeroDePaginas = numeroDePaginas;
	}
	
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public Date getDataDaPublicacao() {
		return dataDaPublicacao;
	}
	public void setDataDaPublicacao(Date dataDaPublicacao) {
		this.dataDaPublicacao = dataDaPublicacao;
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
}
