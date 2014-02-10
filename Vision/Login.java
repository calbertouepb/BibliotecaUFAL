import java.util.Scanner;

import controleacademico.usuario.Usuario;
import controlebiblioteca.ControleBiblioteca;


public class Login {
	
	private String name;
	private String password;
	private ControleBiblioteca cb;
	private Scanner in;
	
	public Login( ControleBiblioteca cb){
		
		this.cb = cb;
		
		while(getName() != "exit"){
			menu();
			if(validacaoLogin(getName(), getPassword())){
				CadastroUsuario cu = new CadastroUsuario(cb , );
			}
		}
		
		
		
	}
	
	public void menu(){
		
		in = new Scanner(System.in);
		
		System.out.println("Nome: ");
		setName( in.nextLine() );
		System.out.println("Senha :");
		setPassword( in.nextLine() );
		
	}
	
	public void setPassword( String password ){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean validacaoLogin(String name, String password){
		return cb.validacao(name, password);
	}
	
	public Usuario getCadastro(String name, String password){
		return cb.getUsuarios().get(index)
	}
	
}
