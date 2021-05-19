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
	
	//MÉTODOS PÚBLICOS
	public void apresentar() {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("CHEGOU A HORA! Apresentamos o lutador " + getNome());
		System.out.println("Diretamente de  "+ getNacionalidade());
		System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + " de altura.");
		System.out.println("Pesando " + this.getPeso() + " Kg");
		System.out.println(this.getVitorias() + " Vitórias");
		System.out.println( this.getDerrotas() + " Derrotas e");
		System.out.println(this.getEmpates() + " Empates.");
		System.out.println("======================================================================");
		System.out.println(" ");
	}
	public void status() {
		System.out.println(this.getNome() + " é um " + this.getCategoria());
		System.out.println("ganhou " + this.getVitorias() + " vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes e");
		System.out.println("Empatou " + this.getEmpates() + " vezes.");
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
		//this.vitorias = this.vitorias + 1; // pode ser assim também
	}          
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);	
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	// CONSTRUTOR
	/*
 	neste método construtor recebe o nome da Classe e irá receber parâmetros para quando instanciar um objeto poder colocar atributos dentro, 
	 já que vai receber vários atributos, também recebera vários parametros. 
	 */
	public Lutador(String nome, String nacionalidade, int idade, float altura,
			float peso, int vitorias, int derrotas, int empates) { // não tem categoria pois o peso é que dirá qual será a categoria
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso); 
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	//MÉTODOS ESPECIAIS
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
	/*O método categoria não tem parâmetro em categoria por que neste caso será um método interno, 
	e por ser método interno está privado pois a categoria muda de acordo com o peso */
	private void setCategoria() { 
		if(this.peso < 52.2) {
			this.categoria = "Peso inválido";
		} else if (this.peso == 70.3) {
			this.categoria = "Peso leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Peso médio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Peso pesado";
		} else {
			this.categoria = "Peso inválido"; 
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
