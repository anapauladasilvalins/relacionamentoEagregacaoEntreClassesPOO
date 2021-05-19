package emojicombate;

import java.util.Random;

public class Luta {
	
	//ATRIBUTOS
	private Lutador desafiado; // Lutador // este é uma instancia de outra classe, sendo assim, faz-se uma ligação entre classes
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	//MÉTODOS PÚBLICOS
	public void marcarLuta(Lutador lut1, Lutador lut2) {
		/* o tipo String categoria faz parte da Classe Lutador, 
		logo não será usado == e sim o método .equals
		*/
		if(lut1.getCategoria().equals(lut2.getCategoria()) && lut1 != lut2) { 
			this.aprovada = true;
			this.desafiado = lut1;
			this.desafiante = lut2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
		
	}
	public void lutar() {
		if(this.aprovada) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			
			int vencedor = aleatorio.nextInt(3); //vai gerar 3 resultados: 0, 1 e 2
			
			System.out.println("===== RESULTADO DA LUTA =====");
			
			switch(vencedor) {
			case 0: // empate
				System.out.println("EMPATOU!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
				
			case 1: // Desafiado vence
				System.out.println("VITÓRIA DO " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
				
			case 2: // Desafiante vence
				System.out.println("VITÓRIA DO " + this.desafiante.getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
			}
			System.out.println("======================================================================");
		} else {
			System.out.println("A luta não pode acontecer.");
		}
	}
	//MÉTODOS ESPECIAIS
	public Lutador getDesafiado() { // retorna um tipo ModeloLutador
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) { // recebe como parametro um tipo ModeloLutador
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
}
