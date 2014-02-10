import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import controleacademico.usuario.Funcionarios;
import controleacademico.usuario.Usuario;
import controlebiblioteca.ControleBiblioteca;


public class CadastroUsuario {
	
	private ControleBiblioteca cb;
	private int comando;
	private Scanner in;
	private Usuario user;
	private Usuario logado;
	
	public CadastroUsuario( ControleBiblioteca cb , Usuario user) {
		
		this.logado = user;
		
		this.cb  = cb;
		in = new Scanner( System.in );
		imprimirMenu();
		
		while(comando != 6){
			comando = in.nextInt();
			
			switch( comando ){
			case 1:
				break;
			case 2:
				CadastroFuncionario();
				break;
			case 3:
				break;
			case 4:
				listaUsuarios();
				break;
			case 5:
				imprimirMenu();
				break;
			default:
				break;
			}
		}
		
		
	}
	
	public void imprimirMenu(){
		System.out.println("1 - cadastra Aluno\n "
				+ "2 - Cadastra Funcionario\n"
				+ "3 - Cadastra Adiministrador\n"
				+ "4 - Lista Usuarios\n"
				+ "5 - imprimir menu\n"
				+ "6 - sai");
	}
	
	public void listaUsuarios(){
		
		List<Usuario> listUsuer = cb.getUsuarios();
		
		for(Usuario user : listUsuer){
			System.out.print(user.toString());
		}
		
	}
	
	public void CadastroFuncionario(){
		
		in = new Scanner( System.in );
		
		System.out.print("nome :");
		String nome = in.nextLine();
		System.out.print("Naturalidade : " );
		String naturalidade = in.nextLine();
		System.out.print("CPF: ");
		String cpf = in.nextLine();
		System.out.print("Senha :");
		String senha = in.nextLine();
		System.out.print("Telefone : " );
		String telefone = in.nextLine();
		System.out.print("Loguin: ");
		String login = in.nextLine();
		System.out.print("Endereco : ");
		String enderenco = in.nextLine();
		System.out.print("RG: ");
		String rg = in.nextLine();
		System.out.print("E-mail: ");
		String email = in.nextLine();
		
		
		
		this.user = new Funcionarios(nome, cpf, rg, naturalidade, enderenco, telefone, email, login, senha, cb);
		
	}
}
