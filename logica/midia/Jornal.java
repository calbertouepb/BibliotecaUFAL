package midia;

import java.util.Date;

public class Jornal extends Midia{
	
	private Date data;
	private int edicao;
	
	public Jornal(String titulo, Date data, int edicao) {
		super(titulo);
		this.data = data;
		this.edicao = edicao;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	
	
}
