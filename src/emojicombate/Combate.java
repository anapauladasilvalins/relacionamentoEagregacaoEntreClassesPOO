package emojicombate;

public class Combate {
	public static void main(String[] args) {
		
		/*Lutador lut =  new Lutador("Pretty Boy ", "França " , 31, 1.75f,
				68.9f, 11, 2, 1);
		//lut.apresentar(); 
		lut.Status();
		*/
		
		//VETOR
		Lutador lut[] = new Lutador[6];
		
		lut[0] = new Lutador("Pretty Boy ", "França " , 31, 1.75f,
				68.9f, 11, 3, 1);
		
		lut[1] = new Lutador("Putscript ", "Brasil " , 29, 1.68f, 57.8f, 14, 2, 3);
		
		lut[2] = new Lutador("Snapshadow ", "EUA " ,35, 1.65f, 80.9f, 12, 2, 1);
		
		lut[3] = new Lutador("Dead Code ", "Australia ",28, 1.93f, 81.6f, 13, 0, 2);
		
		lut[4] = new Lutador("UFOCobol ", "Brasil " , 37, 1.70f, 119.3f, 5, 4, 3);
		
		lut[5] = new Lutador("NerDart ", "EUA " , 38, 1.81f, 105.7f, 12, 2, 4);
		
		Luta UC01 = new Luta(); //UC (Ultra Combate)
		UC01.marcarLuta(lut[4], lut[5]);
		UC01.lutar();
		lut[4].status();
		lut[5].status();
	}

}
