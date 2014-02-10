package midia.isbn;

import java.io.Serializable;
import java.util.List;

import midia.Livro;
import midia.caracteristicas.Autor;

public abstract class ISBN implements Serializable {
	
	private String isbn;
	
	public ISBN(String isbn, List<Autor> autores, Livro livro) {
		this.isbn = isbn;
	}
	
	public abstract boolean validacao();
	
	public void setIsbn( String isbn ){
		this.isbn = isbn;
	}
	
	public String getIsbn(){
		return isbn;
	}
	
	
}
