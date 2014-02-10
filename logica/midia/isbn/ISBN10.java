package midia.isbn;

import java.util.List;

import midia.Livro;
import midia.caracteristicas.Autor;

public class ISBN10 extends ISBN{

	public ISBN10(String isbn, List<Autor> autores, Livro livro) {
		super(isbn, autores, livro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validacao() {
		// TODO Auto-generated method stub
		return false;
	}

}
