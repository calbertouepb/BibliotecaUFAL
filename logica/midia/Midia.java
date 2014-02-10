package midia;

import java.io.Serializable;

public abstract class Midia implements Serializable {
	
	
	private String titulo;
	
	Midia(String titulo){
		
		setTitulo( titulo );
	
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public String getTitulo(){
		return titulo;
	}

	
}
