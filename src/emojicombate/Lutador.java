package emojicombate;

public class Lutador {
	
	//ATRIBUTOS
	private String nome; 
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//M�TODOS P�BLICOS
	public void apresentar() {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("CHEGOU A HORA! Apresentamos o lutador " + getNome());
		System.out.println("Diretamente de  "+ getNacionalidade());
		System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + " de altura.");
		System.out.println("Pesando " + this.getPeso() + " Kg");
		System.out.println(this.getVitorias() + " Vit�rias");
		System.out.println( this.getDerrotas() + " Derrotas e");
		System.out.println(this.getEmpates() + " Empates.");
		System.out.println("======================================================================");
		System.out.println(" ");
	}
	public void status() {
		System.out.println(this.getNome() + " � um " + this.getCategoria());
		System.out.println("ganhou " + this.getVitorias() + " vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes e");
		System.out.println("Empatou " + this.getEmpates() + " vezes.");
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
		//this.vitorias = this.vitorias + 1; // pode ser assim tamb�m
	}          
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);	
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	// CONSTRUTOR
	/*
 	neste m�todo construtor recebe o nome da Classe e ir� receber par�metros para quando instanciar um objeto poder colocar atributos dentro, 
	 j� que vai receber v�rios atributos, tamb�m recebera v�rios parametros. 
	 */
	public Lutador(String nome, String nacionalidade, int idade, float altura,
			float peso, int vitorias, int derrotas, int empates) { // n�o tem categoria pois o peso � que dir� qual ser� a categoria
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso); 
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	//M�TODOS ESPECIAIS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	/*O m�todo categoria n�o tem par�metro em categoria por que neste caso ser� um m�todo interno, 
	e por ser m�todo interno est� privado pois a categoria muda de acordo com o peso */
	private void setCategoria() { 
		if(this.peso < 52.2) {
			this.categoria = "Peso inv�lido";
		} else if (this.peso == 70.3) {
			this.categoria = "Peso leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Peso m�dio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Peso pesado";
		} else {
			this.categoria = "Peso inv�lido"; 
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
}
