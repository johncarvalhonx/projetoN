/*
 * Autor: João Pedro Villas Boas de Carvalho
 * Data: 23/04/2023
 * Descrição: Trabalho de APS 3 Semestre
 */
package pProjetoN.main;
import java.util.Scanner;

import pProjetoN.main.Characters.Inimigo;
import pProjetoN.main.Characters.Jogador;

import java.util.InputMismatchException;
import java.util.Random;

public class Sistema {
	static Scanner scanner = new Scanner(System.in);
	static Jogador jogador;
	static String chrName;
	static int pREM = 0;
	static boolean jogoRodando;
	static boolean music = true;
	
	public static String[] encontros = {"Batalha", "Batalha", "Batalha", "Batalha", "Batalha"};
	public static String[] inimigos = {"Robo de Patrulha", "Robo de Patrulha", "Robo de Patrulha", "Super Robo de Patrulha", "Super Robo de Patrulha", "Super Robo de Patrulha"};
	public static String[] descricao = {"Um androide projetado para patrulhar as areas de descarte de residuos em NeonCity. Equipado com sensores avancados, \ne capaz de detectar e rastrear todo tipo de lixo e residuos produzidos por empresas e individuos na cidade.", 
			"Um androide projetado para patrulhar as areas de descarte de residuos em NeonCity. Equipado com sensores avancados, \ne capaz de detectar e rastrear todo tipo de lixo e residuos produzidos por empresas e individuos na cidade.",
			"Um androide projetado para patrulhar as areas de descarte de residuos em NeonCity. Equipado com sensores avancados, \ne capaz de detectar e rastrear todo tipo de lixo e residuos produzidos por empresas e individuos na cidade.",
			"Um androide altamente avancado projetado para patrulhar areas de descarte de residuos em NeonCity com o\ndobro de armas e protecao em relacao aos robos de patrulha comuns. Com uma estrutura mecanica reforcada, sua carcaca e \nrevestida por materiais de alta resistencia, capazes de suportar impactos e danos extremos.",
			"Um androide altamente avancado projetado para patrulhar areas de descarte de residuos em NeonCity com o\ndobro de armas e protecao em relacao aos robos de patrulha comuns. Com uma estrutura mecanica reforcada, sua carcaca e \nrevestida por materiais de alta resistencia, capazes de suportar impactos e danos extremos.",
			"Um androide altamente avancado projetado para patrulhar areas de descarte de residuos em NeonCity com o\ndobro de armas e protecao em relacao aos robos de patrulha comuns. Com uma estrutura mecanica reforcada, sua carcaca e \nrevestida por materiais de alta resistencia, capazes de suportar impactos e danos extremos."};
	
	public static int missao = 0, ato = 1;
	public static String[] missoes = {"NeonCity", "Distrito EXODI", "Deposito de Lixo Tecnologico", "Docas de NeonCity", "Derrote Azazel"};
	
	public static int lerInt(String entrada, int escolhaUsuario) {
		int input;
		
		do {
			System.out.println(entrada);
			try {
				input = Integer.parseInt(scanner.next());
			}catch(Exception e) {
				input = -1;
				System.out.println("[>>] Por favor, entre com uma opcao valida.");
			}
		}while(input < 1 || input > escolhaUsuario);
		return input;
	}
	
	public static void limparConsole() {
		for(int i = 0; i < 100; i++)
			System.out.println();
	}
	
	public static void printLinhas(int n) {
		for(int i = 0; i < n; i++)
			System.out.print("=");
		System.out.println();
	}
	
	public static void printTitulo(String titulo) {
		printLinhas(30);
		System.out.println(titulo);
		printLinhas(30);
	}
	
	public static void pressioneParaContinuar() {
		System.out.println("[>>] Entre com qualquer tecla para continuar.");
		scanner.next();
	}
	
	public static void iniciarJogo() {
		limparConsole();
		System.out.println(" ,.  ;-.   ,-.    ,-.   ,-.  ,-.  ,--, \r\n"
				+ "/  \\ |  ) (   `      ) /  /\\    )   /  \r\n"
				+ "|--| |-'   `-.      /  | / |   /   `.  \r\n"
				+ "|  | |    .   )    /   \\/  /  /      ) \r\n"
				+ "'  ' '     `-'    '--'  `-'  '--' `-'  \r\n"
				+ "                                       \n");
		pressioneParaContinuar();
		limparConsole();
		System.out.println(" ,-.             .                      ,                     \r\n"
				+ "/        o       |                      |                     \r\n"
				+ "|    ;-. . ,-: ,-| ,-.   ;-. ,-. ;-.    | ,-: . . ;-.-. ;-.-. \r\n"
				+ "\\    |   | | | | | | |   | | | | |      | | | | | | | | | | | \r\n"
				+ " `-' '   ' `-` `-' `-'   |-' `-' '     -' `-` `-` ' ' ' ' ' ' \r\n"
				+ "                         '                                    \n");
		pressioneParaContinuar();
		Musica.mainMenuTheme();
		mainMenu();
	}
	
	public static void mainMenu() {
		limparConsole();
		System.out.println("================================================================================================");
		System.out.println(" ________  ________  ________        ___  _______  _________  ________          ________      \r\n"
				+ "|\\   __  \\|\\   __  \\|\\   __  \\      |\\  \\|\\  ___ \\|\\___   ___\\\\   __  \\        |\\   ___  \\    \r\n"
				+ "\\ \\  \\|\\  \\ \\  \\|\\  \\ \\  \\|\\  \\     \\ \\  \\ \\   __/\\|___ \\  \\_\\ \\  \\|\\  \\       \\ \\  \\\\ \\  \\   \r\n"
				+ " \\ \\   ____\\ \\   _  _\\ \\  \\\\\\  \\  __ \\ \\  \\ \\  \\_|/__  \\ \\  \\ \\ \\  \\\\\\  \\       \\ \\  \\\\ \\  \\  \r\n"
				+ "  \\ \\  \\___|\\ \\  \\\\  \\\\ \\  \\\\\\  \\|\\  \\\\_\\  \\ \\  \\_|\\ \\  \\ \\  \\ \\ \\  \\\\\\  \\       \\ \\  \\\\ \\  \\ \r\n"
				+ "   \\ \\__\\    \\ \\__\\\\ _\\\\ \\_______\\ \\________\\ \\_______\\  \\ \\__\\ \\ \\_______\\       \\ \\__\\\\ \\__\\\r\n"
				+ "    \\|__|     \\|__|\\|__|\\|_______|\\|________|\\|_______|   \\|__|  \\|_______|        \\|__| \\|__|\n");
        System.out.println("================================================================================================\n\n");
        System.out.println("1 > Jogar");
        System.out.println("2 > Configuracoes");
        System.out.println("3 > Sobre");
        System.out.println("4 > Sair\n");	
        Scanner menu = new Scanner(System.in);
        try {
        int escolha = menu.nextInt();
            switch (escolha) {
            case 1:
            	startar();
            	break;
            case 2:
                configuracoes();
                break;
            case 3:
                sobre();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Opção inválida, tente novamente.");
                mainMenu();
            }
        }catch (InputMismatchException e){
        	mainMenu();  	
        }
        menu.close();
	}
	
	public static void startar() {
		boolean nameSet = false;
		String nome;
		do {
			limparConsole();
			Historia.Inicio();
			printTitulo("[>>] Insira seu nome, Jogador.");
			nome = scanner.next();
			limparConsole();
			printTitulo("[>>] Deseja colocar o nome: " + nome + "?");
			System.out.println("1 > Sim!");
			System.out.println("2 > Nao, quero trocar.");
			int input = lerInt("\n-> ", 2);
			if(input == 1)
				nameSet = true;	
		}while(!nameSet);
			jogador = new Jogador(nome);
			Historia.Ato1();
			jogoRodando = true;
			gameLoop();
	}
	
	public static void sobre() {
		limparConsole();
		printLinhas(20);
		System.out.println("Jogo desenvolvido por Joao Villas Boas.");
		System.out.println("\nPROJETO:N Versao 1.0.0");
		printLinhas(20);
		System.out.println("1 > Creditos (Spoiler)");
		System.out.println("2 > Menu");
        Scanner sobre = new Scanner(System.in);
        int a = sobre.nextInt();
        if(a == 1) {
        	limparConsole();
        	printLinhas(20);
    		System.out.println("Creditos:\n\nRoyalty Free Zone");
    		System.out.println("Chillin'K");
    		System.out.println("Le Castle Vania");
    		printLinhas(20);
        	System.out.println("1 > Menu");
        	int b = sobre.nextInt();
        	if(b == 1) {
        		mainMenu();
        	}
        }else if(a == 2) {
        	mainMenu();
        }else {
        	System.out.println("Opcao invalida, tente novamente.");
        	sobre();
        }
        sobre.close();
	}
	
	
	public static void configuracoes() {
		limparConsole();
		printLinhas(20);
		System.out.println("Configuracoes:");
		printLinhas(20);
		System.out.println("\n1 > Tirar Musica");
		System.out.println("2 > Colocar Musica");
		System.out.println("3 > Menu");
        Scanner config = new Scanner(System.in);
        int a = config.nextInt();
        if (a == 1){
        	if (music == true) {
        		Musica.musicStop();
        		music = false;
        		mainMenu();
        	}else {
        		mainMenu();
        	}
        }
        else if(a == 2) {
        	if (music == false) {
        		music = true;
        		Musica.mainMenuTheme();
        		mainMenu();
        	}else {
        		mainMenu();
        	}
        }
        else if(a == 3) {
        	mainMenu();
        }else {
        	System.out.println("[>>] Opcao invalida, tente novamente.");
        }
        config.close();
	}
	
	public static void checarAto() {
		if(jogador.xp >= 10 && ato == 1) {
			ato = 2;
			missao = 2;
			Historia.Ato1Final();
			Historia.Ato2();
			inimigos[0] = "Robo de Patrulha";
			inimigos[1] = "Super Robo de Patrulha";
			inimigos[2] = "Robo de Batalha HYTECH";
			inimigos[3] = "Super Robo de Batalha HYTECH";
			inimigos[4] = "Robo Ceifador HYTECH";
			descricao[0] = "Um androide projetado para patrulhar as areas de descarte de residuos em NeonCity. Equipado com sensores avancados, \ne capaz de detectar e rastrear todo tipo de lixo e residuos produzidos por empresas e individuos na cidade.";
			descricao[1] = "Um androide altamente avancado projetado para patrulhar areas de descarte de residuos em NeonCity com o\ndobro de armas e protecao em relacao aos robos de patrulha comuns. Com uma estrutura mecanica reforcada, sua carcaca e \nrevestida por materiais de alta resistencia, capazes de suportar impactos e danos extremos.";
			descricao[2] = "Um poderoso robo projetado especificamente para proteger e defender a empresa HYTECH de qualquer ameaca externa. \nEquipado com a mais avancada tecnologia em inteligencia artificial, o Robo de Batalha HYTECH e capaz de \ndetectar e neutralizar qualquer forma de ameaca, incluindo invasores, hackers e outras ameacas a seguranca.";
			descricao[3] = "O mais avancado e poderoso robo ja criado pela empresa HYTECH para proteger seus interesses. Este gigante robo \nde batalha e uma verdadeira maquina de destruicao, com capacidades excepcionais para enfrentar e derrotar qualquer ameaca.";
			descricao[4] = "Um androide de combate altamente avancado, projetado para lidar com situacoes de risco extremo e proteger os \ninteresses da empresa HYTECH. Ele e equipado com uma foice de alta tecnologia, capaz \nde cortar materiais resistentes com facilidade.";
			encontros[0] = "Batalha";
			encontros[1] = "Batalha";
			encontros[2] = "Batalha";
			encontros[3] = "Batalha";
			encontros[4] = "Batalha";
			jogador.vida = jogador.maxVida;
		}else if(jogador.xp >= 50 && ato == 2) {
			ato = 3;
			missao = 3;
			Historia.Ato2Final();
			Historia.Ato3();
			inimigos[0] = "Robo Assassino HYTECH";
			inimigos[1] = "Robo de Combate Aereo HYTECH";
			inimigos[2] = "Robo de Batalha HYTECH";
			inimigos[3] = "Super Robo de Batalha HYTECH";
			inimigos[4] = "Robo Ceifador HYTECH";
			descricao[0] = "Um androide altamente avancado, projetado e construido para a realizacao de atividades de assassinato.\nPossui uma estrutura fisica e eletrônica sofisticada, equipada com uma variedade de armas, incluindo \nlasers de alta potencia, misseis teleguiados, serras eletricas, entre outras. Sua inteligencia artificial e \naltamente avancada, permitindo que ele execute suas tarefas com precisao e eficiencia.";
			descricao[1] = "Uma maquina imponente com asas e helices que lhe permitem voar. Ele e equipado com tecnologia de ponta, como \nsensores avancados de deteccao e sistemas de armas poderosos, incluindo misseis e metralhadoras. Com \nsua velocidade e manobrabilidade no ar, e capaz de se adaptar rapidamente a qualquer situacao de combate e e temido pelos \ninimigos da HYTECH.";
			descricao[2] = "Um poderoso robo projetado especificamente para proteger e defender a empresa HYTECH de qualquer ameaca externa. \nEquipado com a mais avancada tecnologia em inteligencia artificial, o Robo de Batalha HYTECH e capaz de \ndetectar e neutralizar qualquer forma de ameaca, incluindo invasores, hackers e outras ameacas a seguranca.";
			descricao[3] = "O mais avancado e poderoso robo ja criado pela empresa HYTECH para proteger seus interesses. Este gigante robo \nde batalha e uma verdadeira maquina de destruicao, com capacidades excepcionais para enfrentar e derrotar qualquer ameaca.";
			descricao[4] = "Um androide de combate altamente avancado, projetado para lidar com situacoes de risco extremo e proteger os \ninteresses da empresa HYTECH. Ele e equipado com uma foice de alta tecnologia, capaz \nde cortar materiais resistentes com facilidade.";
			encontros[0] = "Batalha";
			encontros[1] = "Batalha";
			encontros[2] = "Batalha";
			encontros[3] = "Batalha";
			encontros[4] = "Batalha";
			jogador.vida = jogador.maxVida;
		}else if(jogador.xp >= 100 && ato == 3) {
			ato = 4;
			missao = 4;
			Historia.Ato3Final();
			Historia.Ato4();
			jogador.vida = jogador.maxVida;
			ultimaBatalha();
			Historia.Final();
		}
	}
	
	public static void encontroAleatorio() {
		int encontro = (int) (Math.random()* encontros.length);
		if (encontros[encontro].equals("Batalha")) {
			batalhaAleatoria();
		}
	}
	
	public static void continuarJornada() {
		checarAto();
		if(ato != 4)
			encontroAleatorio();
	}
	
	
	public static void personagemInfo() {
		limparConsole();
		printTitulo("MENU - PERSONAGEM");
		System.out.println(jogador.nome + "\tHP: " + jogador.vida + "/" + jogador.maxVida);
		System.out.println("");
		System.out.println("XP: " + jogador.xp + "\tCreditos: " + jogador.creditos);
		printLinhas(30);
		System.out.println("Items: \nInjecoes de Cura: " + jogador.injects);
		if (pREM >= 1) {
			System.out.println("P-REM: " + pREM + "");
		}
		System.out.println("");
		if(jogador.numAtqItems > 0) {
			System.out.println("Equipamentos ofensivos: \n> " + jogador.atqItems[jogador.numAtqItems - 1]);
		}
		if(jogador.numDefItems > 0) {
			System.out.println("Equipamentos defensivos: \n> " + jogador.defItems[jogador.numDefItems - 1]);
		}
		printLinhas(20);
		
		pressioneParaContinuar();
	}
	
	public static void relacionamentoInfo() {
		limparConsole();
		printTitulo("MENU - RELACIONAMENTOS");
		System.out.println("");
		if (Historia.meetPiper == true) {
			System.out.println("Piper: Lvl " + Historia.relacionamentoPiper);
		}else {
			System.out.println("???: Lvl 0");
		}
		if (Historia.meetRex == true) {
			System.out.println("Rex: Lvl " + Historia.relacionamentoRex);
		}else {
			System.out.println("???: Lvl 0");
		}
		if (Historia.meetEcoBot == true) {
			System.out.println("EcoBot: Lvl " + Historia.relacionamentoEcoBot);
		}else {
			System.out.println("???: Lvl 0");
		}
		System.out.println("");
		printLinhas(30);
		pressioneParaContinuar();
	}
	
	public static String charname() {
		return "[" + jogador.nome.toUpperCase() + "]";
	}
	
	public static void ecoBOT() {
		if(Historia.meetEcoBot == false) {
			System.out.println("[ECOBOT] Ola, " + jogador.nome + ". Sou EcoBOT, fui criado especialmente para te ajudar!");
			System.out.println(charname() + " Que otimo! Me ajudar com o que?");
			System.out.println("[ECOBOT] Voce pode trocar seus creditos por armas e items especiais!");
			System.out.println(charname() + " Pera, eu tenho que pagar? Nao era pra voce me ajudar?");
			System.out.println("[ECOBOT] SIM! Mas nada nessa vida e de graca! Nem mesmo uma injecao na testa. HA HA HA HA HA");
			System.out.println(charname() + " Um robo com um senso de humor pessimo, que maravilha...");
			System.out.println(charname() + " Ta bom, me mostra o que voce tem.");
			pressioneParaContinuar();
			limparConsole();
			printTitulo("LOJA");
			System.out.println("[ECOBOT] Voce possui atualmente: " + jogador.creditos + " credito(s)!");
			System.out.println("\n1 > Injecao de Cura (Conta da casa dessa vez :D)");
			printLinhas(30);
			int input = lerInt("\n-> ", 1);
			if(input == 1) {
				limparConsole();
				System.out.println("[ECOBOT] Excelente!!! Aqui esta.");
				jogador.injects++;
			}
			Historia.meetEcoBot = true;
		}else {
			limparConsole();
			printTitulo("LOJA");
			int preco = 5;
			System.out.println("[ECOBOT] Ola, Senhor!");
			System.out.println("[ECOBOT] Voce possui atualmente: " + jogador.creditos + " creditos!");
			System.out.println("\nProdutos disponiveis:\n1 > Injecao de Cura (" + preco + " Creditos)\n2 > Sair");
			printLinhas(30);
			int input = lerInt("\n-> ", 2);
			if(input == 1) {
				limparConsole();
				if(jogador.creditos >= preco) {
					System.out.println("[ECOBOT] Excelente!!! Aqui esta.");
					jogador.injects++;
					jogador.creditos -= preco;
				}else {
					System.out.println("[ECOBOT] Voce nao tem saldo o suficiente para comprar isso.");
					pressioneParaContinuar();
				}
			}else if(input == 2) {
				System.out.println("[ECOBOT] Me chame sempre que precisar!");
			}
		}
	}
	
	static Random rand = new Random();
	static int index = rand.nextInt(inimigos.length);
	static String enemyName = inimigos[index];
	static String enemyDesc = descricao[index];
	
	public static void batalhaAleatoria() {
		limparConsole();
		printTitulo("[>>] Voce encontrou um inimigo! Boa sorte!");
		pressioneParaContinuar();
		batalha(new Inimigo(enemyName, enemyDesc, jogador.xp));
	    index = rand.nextInt(inimigos.length);
	    enemyName = inimigos[index];
	    enemyDesc = descricao[index];
	}
	
	public static void batalha(Inimigo inimigo) {
		while(true) {
			limparConsole();
			printTitulo(inimigo.nome + " (HP: " + inimigo.vida + "/" + inimigo.maxVida + ")" + "\n\nDescricao: " + inimigo.descricao);
			printTitulo(jogador.nome + " (HP: " + jogador.vida + "/" + jogador.maxVida + ")");
			System.out.println("1 > Lutar\n2 > Usar Injecao de Cura\n3 > Fugir");
			int input = lerInt("\n-> ", 3);
			if(input == 1) {
				int dano = jogador.ataque() - inimigo.defesa();
				int danoInimigo = inimigo.ataque() - jogador.defesa();
				if(danoInimigo <= 0) {
					dano -=  danoInimigo/2;
					danoInimigo = 1;
				}
				if(dano <= 0)
					dano = 2;
				jogador.vida -= danoInimigo;
				inimigo.vida -= dano;
				limparConsole();
				printTitulo("BATALHA");
				System.out.println("[>>] Voce deu " + dano + " de dano em " + inimigo.nome+".");
				printLinhas(30);
				System.out.println("[>>] O inimigo " + inimigo.nome + " te deu " + danoInimigo + " de dano.");
				printLinhas(30);
				pressioneParaContinuar();
				if(jogador.vida <= 0) {
					jogadorMorreu();
					break;
				}else if(inimigo.vida <= 0) {
					limparConsole();
					jogador.xp += inimigo.xp;
					printTitulo("[>>] Voce derrotou " + inimigo.nome +" e recebeu " + inimigo.xp + " de XP!");
					int creditosDropados = (int) (Math.random()*inimigo.xp);
					if(creditosDropados > 0) {
						jogador.creditos += creditosDropados;
						System.out.println("[>>] Voce recebeu " + creditosDropados + " creditos da batalha.");
					}
					pressioneParaContinuar();
					break;
				}
			}else if(input==2) {
				limparConsole();
				if(jogador.injects > 0 && jogador.vida < jogador.maxVida) {
					printTitulo("[>>] Deseja usar a injecao de cura? " + jogador.injects + " restante(s).");
					System.out.println("1 > Sim\n2 > Nao");
					input = lerInt("\n-> ", 2);
					if(input == 1) {
						jogador.vida += 25;
						if(jogador.vida > 100) {
							jogador.vida = 100;
						}
						limparConsole();
						printTitulo("[>>] Voce usou a injecao de cura! Agora voce esta com " + jogador.vida + "HP.");
						pressioneParaContinuar();
					}
				}else {
					printTitulo("[>>] Voce nao pode usar isso agora!\n[>>] As injecoes só podem ser usadas se voce possuir alguma e se nao estiver full HP.");
					pressioneParaContinuar();
				}
			}else {
				limparConsole();
				if(ato != 4) {
					if(Math.random()*10 + 1 <= 3.5) {
						printTitulo("[>>] Voce conseguiu escapar!");
						pressioneParaContinuar();
						break;
					}else {
						System.out.println("[>>] Voce nao conseguiu fugir!");
						int danoInimigo = inimigo.ataque();
						System.out.println("[>>] Voce recebeu " + danoInimigo + " de dano ao falhar em fugir.");
						pressioneParaContinuar();
						if(jogador.vida <= 0)
							jogadorMorreu();
					}
				}else {
					System.out.println("[NARRADOR] Voce nao pode desistir agora," + jogador.nome + "! Finalize a sua missao!");
					pressioneParaContinuar();
				}
			}
		}
	}
	public static int xpAto() {
		int atox = 0;
		if (ato == 1) {
			atox = 10;
		}
		else if(ato == 2) {
			atox = 50;
		}else if(ato == 3) {
			atox = 100;
		}
		return atox;
	}
	
	public static int xpRestante() {
		return xpAto() -jogador.xp;
	}
	
	public static void mostrarMenu() {
		limparConsole();
		System.out.println("=======================================");
		System.out.println("            MENU PRINCIPAL");
		System.out.println("=======================================");
		System.out.println("Missao: " + missoes[missao]);
		System.out.println("");
		if(jogador.xp >= xpAto()) {
			System.out.println("[>>] Voce ja pode avancar na historia.");
		}else {
			System.out.println("[>>] Faltam " + xpRestante() + " de XP para avancar na historia.");
		}
		System.out.println("=======================================");
		if(jogador.xp >= xpAto()) {
			System.out.println("1 > Proximo Ato");
		}else {
			System.out.println("1 > Proximo Ato (" + xpAto() + " XP)");
		}
		System.out.println("2 > Procurar Inimigos");
		System.out.println("3 > Informacao do Personagem");
		System.out.println("4 > Relacionamentos");
		if(Historia.meetEcoBot == true) {
			System.out.println("5 > Chamar EcoBot");
			System.out.println("6 > Sair do Jogo");
		}else {
			System.out.println("5 > Sair do Jogo");
		}
	}
	
	public static void jogadorMorreu() {
		limparConsole();
		printLinhas(40);
		System.out.println(" ____    ______                ____    ____      \r\n"
				+ "/\\  _`\\ /\\__  _\\   /'\\_/`\\    /\\  _`\\ /\\  _`\\    \r\n"
				+ "\\ \\ \\L\\_\\/_/\\ \\/  /\\      \\   \\ \\ \\/\\ \\ \\ \\L\\_\\  \r\n"
				+ " \\ \\  _\\/  \\ \\ \\  \\ \\ \\__\\ \\   \\ \\ \\ \\ \\ \\  _\\L  \r\n"
				+ "  \\ \\ \\/    \\_\\ \\__\\ \\ \\_/\\ \\   \\ \\ \\_\\ \\ \\ \\L\\ \\\r\n"
				+ "   \\ \\_\\    /\\_____\\\\ \\_\\\\ \\_\\   \\ \\____/\\ \\____/\r\n"
				+ "    \\/_/    \\/_____/ \\/_/ \\/_/    \\/___/  \\/___/ \r\n"
				+ "                                                 \r\n"
				+ "                                                 \r\n"
				+ " _____  _____   ____    _____      \r\n"
				+ "/\\___ \\/\\  __`\\/\\  _`\\ /\\  __`\\    \r\n"
				+ "\\/__/\\ \\ \\ \\/\\ \\ \\ \\L\\_\\ \\ \\/\\ \\   \r\n"
				+ "   _\\ \\ \\ \\ \\ \\ \\ \\ \\L_L\\ \\ \\ \\ \\  \r\n"
				+ "  /\\ \\_\\ \\ \\ \\_\\ \\ \\ \\/, \\ \\ \\_\\ \\ \r\n"
				+ "  \\ \\____/\\ \\_____\\ \\____/\\ \\_____\\\r\n"
				+ "   \\/___/  \\/_____/\\/___/  \\/_____/");
		System.out.println("\n[>>] XP recebido na jornada: " + jogador.xp + "XP.");
		System.out.println("[>>] Obrigado por jogar o jogo.");
		printLinhas(40);
		jogoRodando = false;
	}
	
	public static void ultimaBatalha() {
		batalha(new Inimigo("AZAZEL", "CEO da HYTECH, um homem impiedoso e insano, que nao mede esforcos para alcancar seus objetivos, \nmesmo que isso signifique acabar com a natureza e a vida no planeta. Seu objetivo \ne garantir que a única fonte de oxigenio no mundo seja a sua empresa, fazendo com que as \npessoas dependam totalmente dela para sobreviver.", 500));
		
	}

	public static void gameLoop() {
		while(jogoRodando) {
			mostrarMenu();
			if(Historia.withEcoBot == true) {
				int input = lerInt("\n-> ", 5);
				if (input == 1)
					if(jogador.xp >= xpAto()) {
						continuarJornada();
					}else {
						System.out.println("[>>] Você não tem XP o suficiente para avançar na história.");
					}
				else if(input == 2)
					continuarJornada();
				else if(input == 3)
					personagemInfo();
				else if(input == 4)
					relacionamentoInfo();
				else if(input == 5)
					ecoBOT();
				else
					jogoRodando = false;
			}else {
				int input = lerInt("\n-> ", 4);
				if (input == 1)
					if(jogador.xp >= xpAto()) {
						continuarJornada();
					}else {
						System.out.println("[>>] Voce nao tem XP o suficiente para avancar na historia.");
					}
				else if(input == 2)
					continuarJornada();
				else if(input == 3)
					personagemInfo();
				else if(input == 4)
					relacionamentoInfo();
				else
					jogoRodando = false;
			}
		}
	}
	
}
