package controlebiblioteca;

import java.util.LinkedList;
import java.util.List;

import controleacademico.curso.Curso;
import controleacademico.usuario.Administrador;
import controleacademico.usuario.Usuario;
import midia.*;
import midia.caracteristicas.Autor;

public class ControleBiblioteca {
	
	private List<Midia> acervo;
	private List<Usuario> usuarios;
	private List<Curso> cursos;
	private List<Autor> autores;
	private Administrador adm;
	
	public ControleBiblioteca(){
		this.acervo = new LinkedList<Midia>();
		this.usuarios = new LinkedList<Usuario>();
		this.cursos = new LinkedList<Curso>();
		this.autores = new LinkedList<Autor>();
		this.adm = new Administrador("Arioston", "123456789", "123456789", "Esperanca", "Rua Floriano peixoto", 
				"3361-2151", "ariostonj@hotmail.com", "arioston", "arioston", this);
		usuarios.add( adm );
	}

	public List<Midia> getAcervo() {
		return acervo;
	}

	public void setAcervo(List<Midia> acervo) {
		this.acervo = acervo;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	public boolean validacao(String name, String password){
		
		for(Usuario user : usuarios){
			if( user.getLogin().equals(name) ){
				System.out.print("entrei");
				if(user.getSenha().equals( password )){
					return true;
				}
			}
		}
		return false;
	}
	
}
