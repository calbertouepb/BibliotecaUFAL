package midia.caracteristicas;

import java.io.Serializable;
import java.util.List;

import midia.*;
import midia.isbn.ISBN;

public class Autor implements Serializable{

	private String nome;
	private List<Midia> midias;
	
	public Autor(String nome, List<Midia> livros, List<ISBN> isbnList) {
		this.nome = nome;
		this.midias = midias;
	}
	
	public void setNome( String nome ){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setLivros( List<Midia> midias){
		this.midias = midias;
	}
	
	public List<Midia> getMidias(){
		return midias;
	}
	
	
}

