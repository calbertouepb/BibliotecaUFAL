package controleacademico.usuario;

import java.util.Date;

import controleacademico.curso.Curso;
import controlebiblioteca.ControleBiblioteca;

public class Aluno extends Usuario {
	
	private String matricula;
	private Curso curso;
	private Date entrada;
	private int periodo;
	
	public Aluno(String nome, String cpf, String rg, String naturalidade,
			String enderenco, String telefone, String email, String login,
			String senha, String matricula, Curso curso, Date entrada,
			int periodo, ControleBiblioteca cb) {
		super(nome, cpf, rg, naturalidade, enderenco, telefone, email, login,
				senha, cb);
		this.matricula = matricula;
		this.curso = curso;
		this.entrada = entrada;
		this.periodo = periodo;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Date getEntrada() {
		return entrada;
	}
	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
}
