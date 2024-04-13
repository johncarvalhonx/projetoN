/*
 * Autor: João Pedro Villas Boas de Carvalho
 * Data: 23/04/2023
 * Descrição: Trabalho de APS 3 Semestre
 */
package pProjetoN.main.Characters;

public class Inimigo extends Personagem{

	
	int xpJogador;
	public String descricao;
	public Inimigo(String nome, String descricao, int xpJogador) {
		super(nome, (int) (Math.random()*xpJogador + xpJogador/3 + 5), (int) (Math.random()*(xpJogador/4+2)+1));
		this.descricao = descricao;
		this.xpJogador = xpJogador;
	}

	@Override
	public int ataque() {
		return (int) (Math.random()*(xpJogador/3 + 1) + xp/3+3);
	}

	@Override
	public int defesa() {
		return (int) (Math.random()*(xpJogador/4 + 1) + xp/4+4);
	}

}
