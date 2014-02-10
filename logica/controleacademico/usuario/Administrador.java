package controleacademico.usuario;

import controleacademico.curso.Curso;
import controlebiblioteca.ControleBiblioteca;
import midia.*;

public class Administrador extends Funcionarios{
	
	public Administrador(String nome, String cpf, String rg,
			String naturalidade, String enderenco, String telefone,
			String email, String login, String senha, ControleBiblioteca cb) {
		super(nome, cpf, rg, naturalidade, enderenco, telefone, email, login, senha, cb);
		// TODO Auto-generated constructor stub
	}

	public void addLivro (Livro livro){
	  getCb().getAcervo().add(livro);
	}
	
	public void delLivro( Livro livro ){
		getCb().getAcervo().remove(livro);
	}
	
	public void addAnais( Anais anais ){
		getCb().getAcervo().add( anais );
	}
	
	public void delAnais( Anais anais ){
		getCb().getAcervo().remove( anais );
	}
	public void addRevista( Revista revista){
		getCb().getAcervo().add( revista );
	}
	public void delRevista( Revista revista ){
		getCb().getAcervo().remove( revista );
	}
	public void addMidiaELetronica( MidiasEletronicas me ){
		getCb().getAcervo().add( me );
	}
	public void delMidiaEletronica( MidiasEletronicas me){
		getCb().getAcervo().remove( me );
	}
	public void addJornal( Jornal jornal){
		getCb().getAcervo().add( jornal );
	}
	public void delJornal( Jornal jornal ){
		getCb().getAcervo().remove( jornal );
	}
	public void addTrabalhoDeConclusao( TrabalhoDeConclusao tdc){
		getCb().getAcervo().add( tdc );
	}
	
	public void delTrabalhoDeConclusao( TrabalhoDeConclusao tdc ){
		getCb().getAcervo().remove( tdc );
	}

	public void addAluno(Aluno aluno){
		getCb().getUsuarios().add( aluno );
	}
	
	public void delAluno( Aluno aluno ){
		getCb().getUsuarios().remove( aluno );
	}
	
	public  void addFuncionario( Funcionarios funcionario ){
		getCb().getUsuarios().add( funcionario );
	}
	
	public  void delFuncionario( Funcionarios funcionario ){
		getCb().getUsuarios().add( funcionario );
	}
	
	public void addCurso( Curso curso ){
		getCb().getCursos().add( curso );
	}
}
