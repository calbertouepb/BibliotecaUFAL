package controleacademico.usuario;

import java.io.Serializable;
import java.util.Date;

import midia.Anais;
import midia.Jornal;
import midia.Livro;
import midia.Midia;
import controlebiblioteca.ControleBiblioteca;

public abstract class Usuario implements Serializable {
	
	private String nome;
	private String cpf;
	private String rg;
	private String naturalidade;
	private String enderenco;
	private String telefone;
	private String email;
	private String login;
	private String senha;
	private ControleBiblioteca cb;
	
	public Usuario(String nome, String cpf, String rg, String naturalidade,
			String enderenco, String telefone, String email, String login,
			String senha, ControleBiblioteca cb) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.naturalidade = naturalidade;
		this.enderenco = enderenco;
		this.telefone = telefone;
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.cb = cb;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getEnderenco() {
		return enderenco;
	}
	public void setEnderenco(String enderenco) {
		this.enderenco = enderenco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public ControleBiblioteca getCb(){
		return cb;
	}
	
	public Livro getLivro( String nome ){
		
		for(Midia livro : cb.getAcervo()){
			if(livro instanceof Livro){
				if(livro.getTitulo() == nome){
					return (Livro) livro;
				}
			}
		}
		
		return null;
	}
	
	// lol
	public Anais getAnais( String nome ){
		
		for(Midia anais : cb.getAcervo()){
			if(anais instanceof Anais){
				if(anais.getTitulo() == nome){
					return (Anais) anais;
				}
			}
		}
		
		return null;
		
	}

	public Jornal getJornal(String nome, Date data){
		
		for(Midia jornal : cb.getAcervo()){
			if(jornal instanceof Jornal){
				if(jornal.getTitulo() == nome){
					if(((Jornal) jornal).getData() == data){
						return (Jornal) jornal;
					}
				}
			}
		}
		
		return null;
	}

	@Override
	public String toString() {
		return String
				.format("Usuario [nome=%s, cpf=%s, rg=%s, naturalidade=%s, enderenco=%s, telefone=%s, email=%s, login=%s, senha=%s, cb=%s]",
						nome, cpf, rg, naturalidade, enderenco, telefone,
						email, login, senha, cb);
	}
}
