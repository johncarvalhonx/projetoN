/*
 * Autor: João Pedro Villas Boas de Carvalho
 * Data: 23/04/2023
 * Descrição: Trabalho de APS 3 Semestre
 */
package pProjetoN.main.Characters;

public abstract class Personagem {
	
	public String nome;
	public int maxVida, vida, xp;
	
	public Personagem(String nome, int maxVida, int xp) {
		this.nome = nome;
		this.maxVida = maxVida;
		this.xp = xp;
		this.vida = maxVida;
	}
	
	public abstract int ataque();
	public abstract int defesa();

}
