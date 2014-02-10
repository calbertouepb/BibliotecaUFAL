package controleacademico.curso;

public class Curso {
	
	public  enum tipo{GRADUACAO, POSGRADUACAO};
	
	private String nome;
	private int tipo;
	private String area;
	
	public Curso(String nome, int tipo, String area) {
		this.nome = nome;
		this.tipo = tipo;
		this.area = area;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
}
