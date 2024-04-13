/*
 * Autor: João Pedro Villas Boas de Carvalho
 * Data: 23/04/2023
 * Descrição: Trabalho de APS 3 Semestre
 */
package pProjetoN.main.Characters;

import pProjetoN.main.Sistema;

public class Jogador extends Personagem{
	
	public int numAtqItems, numDefItems;
	
	public int creditos;

	public int injects; 
	
	public String[] atqItems = {"Nano-Manopla", "Nano-Sabre", "Nano-Bracadeira", "Nano-Exoesqueleto"};
	public String[] defItems = {"Nano-Botas", "Nano-Elmo", "Nano-Peitoral", "Nano-Exoesqueleto"};

	public Jogador(String nome) {
		super(nome, 100, 0);
		this.numAtqItems = 0;
		this.numDefItems = 0;
		this.creditos = 5;
		this.injects = 1;
		
	}

	@Override
	public int ataque() {
		return (int) (Math.random()*(xp/4 + numAtqItems*3 + 3) + xp/10 + numAtqItems * 2 + numDefItems + 1);
	}

	@Override
	public int defesa() {
		return (int) (Math.random()*(xp/4 + numDefItems*3 + 3) + xp/10);
	}
	
	public void escolherEquipamento() {
		Sistema.printTitulo("[>>] Escolha seu novo equipamento: ");
		System.out.println("\n[1] " + atqItems[numAtqItems] + " (ATQ)");
		System.out.println("[2] " + defItems[numDefItems] + " (DEF)");
		int input = Sistema.lerInt("-> ", 2);
		Sistema.limparConsole();
		if(input == 1) {
			Sistema.printTitulo("[>>] Voce escolheu " + atqItems[numAtqItems] + "!");
			numAtqItems++;
		}else {
			Sistema.printTitulo("[>>] Voce escolheu " + defItems[numDefItems] + "!");
			numDefItems++;
		}
		Sistema.pressioneParaContinuar();
	}

}
