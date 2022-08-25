package poo;

import java.util.Random;
import javax.swing.JOptionPane;

public class Questão1 {
	
	public static void main(String[] args) {
		int qtdJogos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de Jogos: "));
		Jogo(qtdJogos);
	}
	
	public static void Jogo(int Jogo) {
		String m="";
		int[] jogos = new int[Jogo];
		
		for(int i=0; i<Jogo; i++) {
			while(true) {
				int qtdNums = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de numeros que quer jogar: "));
				if(qtdNums < 6 || qtdNums > 15) {
					JOptionPane.showMessageDialog(null, "Valor inválido.");
				} else {
					jogos[i] = qtdNums;
					break;
				}
			}
		}
		
		for(int i=0; i<jogos.length; i++) {
			m+= "Jogo "+(i+1)+": "+numSort(jogos[i])+"\n";
		}
		JOptionPane.showMessageDialog(null, m);
	}
	
	public static String numSort(int numSort) {
		int[] valor = new int[numSort];
		Random random = new Random();
		
		for(int i=0; i<numSort; i++) {
			int jogo = random.nextInt(60)+1;
			
			for(int j=0; j<numSort; j++) {
				if(jogo==valor[j] && j!=i) {
					jogo = random.nextInt(60)+1;
				}else {
					valor[i] = jogo;
				}
			}
		}
		for(int i=0; i<numSort; i++) {
			for(int j=i+1; j<numSort; j++) {
				if(valor[i]>valor[i]) {
					int jg = valor[i];
					valor[i]=valor[j];
					valor[j]=jg;
				}
			}
		}
		String ms="";
		for(int i=0; i<numSort; i++) {
			if(valor[i]<10) {
				ms+="0"+valor[i]+" ";
			}else {
				ms+=valor[i]+" ";
			}
		}
		return ms;
	}
}
