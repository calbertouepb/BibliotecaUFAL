package midia;

import java.util.Date;

public class MidiasEletronicas extends Midia{
	
	public enum tipo{CD, DVD};
	private Date gravacao;
	
	public MidiasEletronicas(String titulo, Date gravacao) {
		super(titulo);
		this.gravacao = gravacao;
	}
	
	public Date getGravacao() {
		return gravacao;
	}
	public void setGravacao(Date gravacao) {
		this.gravacao = gravacao;
	}
	
}
