/*
 * Autor: Joao Pedro Villas Boas de Carvalho
 * Data: 23/04/2023
 * Descricao: Trabalho de APS 3 Semestre
 */
package pProjetoN.main;

import java.util.Scanner;

import pProjetoN.main.Characters.Jogador;

public class Historia {
	
	static Scanner escolha = new Scanner(System.in);
	static boolean escolhaValida = false;
	
	static Jogador jogador;
	
	//meetCharacters
	static boolean meetPiper = false;
	static boolean meetRex = false;
	static boolean meetEcoBot = false;
	
	static int relacionamentoRex = 0;
	static boolean withRex = false;
	
	static int relacionamentoPiper = 0;
	static boolean withPiper = false;
	
	static int relacionamentoEcoBot = 0;
	static boolean withEcoBot = false;
	
	public static void Inicio() {
		Sistema.limparConsole();
		Sistema.printLinhas(30);
		System.out.println("PROJETO: N - INICIO");
		Sistema.printLinhas(30);
		System.out.println("Ola Jogador, seja muito bem-vindo a PROJETO:N, um jogo de RPG de texto emocionante e futurista que o levara a um mundo de ficcao \ncientifica cheio de aventuras, desafios e misterios.\n");
		System.out.println("No PROJETO:N, Voce e um jovem estudante de biologia escolhido para ser enviado em uma missao que tem como \nobjetivo salvar o mundo da destruicao causada pela poluicao. Como parte deste projeto, Voce sera enviado para lugares que foram dominados pela poluicao e tera que combate-la antes que a mesma se espalhe.\n");
		System.out.println("Seu caminho nao sera facil, pois nem todas as empresas possuem o mesmo desejo que voce, e elas farao de tudo \npara que voce nao conclua a sua missao.\n");
		System.out.println("Boa sorte.\n");
	}
	
	public static String charname() {
		return "[" + Sistema.jogador.nome.toUpperCase() + "]";
	}
	
	public static void Ato1() {
		Musica.musicStop();
		if (Sistema.music == true) {
			Musica.ambientOneTheme();
		}
		Sistema.limparConsole();
		Sistema.printLinhas(30);
		System.out.println("PROJETO:N - ATO 1");
		Sistema.printLinhas(30);
		System.out.println("Cidade de NeonCity, 2087.");
		System.out.println("\n[TAXI-DROID] Chegamos ao destino 'PREDIO COMERCIAL DA NATURECORP'.");
		System.out.println("[TAXI-DROID] Gostaria de avaliar a viagem?");
		System.out.println(charname() + " Nao, obrigado.");
		System.out.println("[TAXI-DROID] Certo, tenha um otimo dia!");
		System.out.println("\n[NARRADOR] Voce desce do carro voador e o Taxi-Droid vai embora, te deixando em uma plataforma enorme que leva ate o predio comercial da NatureCorp.");
		System.out.println("[NARRADOR] Olhando no holograma do seu convite, Voce percebe que e o mesmo predio coincide com o do convite e decide ir ate la.");
		System.out.println("[NARRADOR] Ao entrar no predio, Voce e recebido por uma garota de olhos claros e cabelos escuros, aparenta ter a mesma idade que Voce, por volta dos 20 anos.");
		System.out.println("\n[PIPER] Ola viajante! Muito prazer, me chamo Piper! Sou a recepcionista da NatureCorp, como posso ajudar?");
		meetPiper = true;
		System.out.println("[NARRADOR] Voce mostra seu convite para Piper.");
		System.out.println("[PIPER] Entao... entao e Voce? Estava esperando alguem mais velho...");
		while (!escolhaValida) {
			System.out.println("\n   [1] Sou eu mesmo.");
			System.out.println("   [2] Sinto muito por te decepcionar.");
			System.out.println("   [3] (Nao dizer nada)");
			int opcao = escolha.nextInt();
			if (opcao == 1) {
				System.out.println("[PIPER] Entao nao temos tempo a perder! Vamos!");
				escolhaValida = true;
			}else if (opcao == 2) {
				System.out.println("[PIPER] Hahahahah! Nao decepcionou, fica tranquilo.");
				relacionamentoPiper += 1;
				System.out.println("[PIPER] Venha! Me acompanhe!");
				escolhaValida = true;
			}else if (opcao == 3) {
				System.out.println(charname() + " ...");
				System.out.println("[PIPER] E brincadeira! Haha... enfim, venha comigo!");
				escolhaValida = true;
			}else {
				System.out.println("[!] Por favor, escolha uma opcao valida!");
			}
		}
		System.out.println("\n[NARRADOR] Piper puxa voce pelo braco e corre na direcao de um elevador.");
		System.out.println("\n[NARRADOR] Enquanto voce e brutalmente arrastado por Piper, voce da uma olhada ao redor.");
		System.out.println("[NARRADOR] Voce percebe varias pessoas olhando para voce com olhares de... assustados? Nao... talvez... esperancosos?");
		System.out.println("[NARRADOR] Voces chegam ao elevador.");
		System.out.println("\n[PIPER] Estamos quase la!");
		System.out.println("\n[NARRADOR] Voce observa Piper apertar o botao do andar 'R' que fica acima de todos os outros.");
		System.out.println("\n[PIPER] Nossa, eu ate esqueci de perguntar o seu nome...");
		escolhaValida = false;
		while (!escolhaValida) {
			System.out.println("\n   [1] Me chamo " + Sistema.jogador.nome + ".");
			System.out.println("   [2] Ja estava comecando a ficar magoado...");
			System.out.println("   [3] Nao importa.");
			System.out.println("   [4] (Nao dizer nada)");
			int opcao = escolha.nextInt();
			if (opcao == 1) {
				System.out.println("[PIPER] Muito prazer, " + Sistema.jogador.nome + ".");
				System.out.println("[PIPER] E sempre bom saber o nome do nosso futuro heroi.");
				System.out.println(charname() + " Pera, que?");
				escolhaValida = true;
			}else if (opcao == 2) {
				System.out.println("[PIPER] Hahahaha desculpa!!! Nao fique chateado comigo, sou um pouco lerdinha...");
				System.out.println(charname() + " Tudo bem, vou deixar passar dessa vez.");
				System.out.println("[PIPER] Ufa! Hahahaha");
				System.out.println(charname() + " Me chamo " + Sistema.jogador.nome + ".");
				System.out.println("[PIPER] E um grande prazer te conhecer, " + Sistema.jogador.nome + "!");
				System.out.println(charname() + " O prazer e todo meu.");
				relacionamentoPiper += 1;
				escolhaValida = true;
			}else if (opcao == 3) {
				System.out.println("[PIPER] E claro que importa! Quer dizer... deixa pra la.");
				System.out.println("[NARRADOR] Depois de voce ser um completo otario, Voce percebe que os olhos de Piper entristecem um pouco.");
				relacionamentoPiper -= 1;
				escolhaValida = true;
			}else if (opcao == 4) {
				System.out.println("[PIPER] Voce e do tipo caladao ne? Tudo bem entao!");
				escolhaValida = true;
			}else {
				System.out.println("[!] Por favor, escolha uma opcao valida!");
			}
		}
		System.out.println("\n[NARRADOR] O elevador chega no andar, voce segue Piper ate uma sala enorme, com o teto e parede de vidro transparente.");
		System.out.println("[NARRADOR] Voce consegue enxergar quase a cidade inteira com essa vista.");
		System.out.println("\n[PIPER] Chegamos!!");
		System.out.println("\n[NARRADOR] Voce observa com dificuldade devido a luz do por do sol, um homem alto com aproximadamente uns 2 metros de altura que esta observando a cidade.");
		System.out.println("[NARRADOR] Ele se vira lentamente e lhe comprimenta.");
		System.out.println("\n[???] Seja muito bem-vindo, " + Sistema.jogador.nome + ". Estava aguardando a sua chegada.");
		System.out.println("[REX] Me chamo Rex, sou o...");
		System.out.println(charname() + " Dono da NatureCorp! E o maior biologo vivo!");
		meetRex = true;
		System.out.println("[REX] Haha, tambem nao e pra tanto, garoto.");
		System.out.println(charname() + " Eu achei que tinha sido convidado pra um tour na empresa, mas agora tenho as minhas duvidas...");
		System.out.println("[REX] Haha! Por favor, sente-se.");
		System.out.println("[PIPER] Vou deixar voces conversarem, hihi.");
		if (relacionamentoPiper >= 1) {
			System.out.println(charname() + " Voce nao pode ficar?");
			System.out.println("[PIPER] Voce... quer que eu fique?");
			escolhaValida = false;
			while (!escolhaValida) {
				System.out.println("\n   [1] Claro! Se nao tiver problema, logico.");
				System.out.println("   [2] Melhor nao.");
				int opcao = escolha.nextInt();
				if (opcao == 1) {
					System.out.println("[REX] E claro que pode, sente-se, Piper.");
					System.out.println("\n[NARRADOR] Piper nao consegue conter a sua alegria e acaba deixando escapar um sorriso de orelha a orelha.");
					System.out.println("\n[PIPER] SIM! Quer dizer... sim, claro!");
					System.out.println("\n[NARRADOR] Piper senta ao seu lado e te olha com um sorriso enorme. Isso foi muito importante pra ela.\n");
					relacionamentoPiper += 3;
					withPiper = true;
					escolhaValida = true;
				}else if (opcao == 2) {
					System.out.println("[PIPER] Ah... certo!");
					System.out.println("\n[NARRADOR] A expressao de Piper muda rapidamente, como se voce tivesse tirado um doce que acabou de dar para uma crianca.");
					System.out.println("\n[PIPER] Vou esperar la embaixo.");
					relacionamentoPiper -= 1;
					escolhaValida = true;
				}else {
					System.out.println("[!] Por favor, escolha uma opcao valida!");
				}
			}
		}
		System.out.println("[REX] Enfim, vamos direto ao assunto. Nao chamei voce aqui para um 'tour na empresa', mas sim para apresentar uma proposta.");
		System.out.println(charname() + " Qual proposta seria essa?");
		System.out.println("[REX] Me responda, voce gostaria de fazer a diferenca e ajudar a salvar o que ainda resta da natureza em nosso planeta?");
		System.out.println(charname() + " Claro que sim!");
		System.out.println("[REX] Otimo! Por favor, leia este arquivo.");
		System.out.println("\n[NARRADOR] Rex entrega um pequeno disco de armazenamento de hologramas.");
		System.out.println("[NARRADOR] Você retira o disco com o convite holografico da sua pulseira tecnológica e insere o que Rex acabou de te entregar.\n[NARRADOR]: O dispositivo emite um leve zumbido enquanto o arquivo é transferido para sua pulseira.");
		System.out.println("\n=============================================");
		System.out.println("                 PROJETO: N");
		System.out.println("\nO projeto N foi criado com a intencao de");
		System.out.println("destruir a poluicao de lugares com quantidades");
		System.out.println("absurdas de fumaca, sujeira e conteudos extrema-");
		System.out.println("mente toxicos.");
		System.out.println("\nUm agente sera enviado ao local com a missao");
		System.out.println("de destruir qualquer ameaca ao meio-ambiente en-");
		System.out.println("contrado no local.");
		System.out.println("\nAo ter sucesso na missao, o agente sera enviado de");
		System.out.println("volta ao QG da NatureCorp e passara por atendimento");
		System.out.println("medico para poder ser enviado ao proximo local.");
		System.out.println("\n=============================================");
		System.out.println("\n[REX] E entao, qual e a sua decisao?");
		System.out.println(charname() + " ...");
		System.out.println("\n[NARRADOR] Você hesita por um momento antes de falar.");
		System.out.println("\n" + charname() + " Rex, voce sabe que sou apenas um universitario e nao um agente, certo?");
		System.out.println("[REX] Sim, eu sei disso. Mas acredito que voce tem o potencial para ajudar em nossa causa.");
		System.out.println("[REX] Entao, qual e a sua resposta? Voce aceita se juntar a nos?");
		System.out.println(charname() + " Bem, nao sei quando terei outra oportunidade como essa, entao sim, eu aceito.");
		System.out.println("[REX] Excelente!");
		if (withPiper == true) {
			System.out.println("[PIPER] Ebaaaaa!!");
		}
		System.out.println(charname() + " Entao, quando comecamos?");
		System.out.println("\n[NARRADOR] Voce e levado ate uma sala coberta com varios cientistas que comecam a medir o seu tamanho.");
		System.out.println("[NARRADOR] Logo apos isso, Rex aparece com um equipamento com tecnologia muito avancada.");
		System.out.println("\n[REX] Vista isso, vai te ajudar.\n");
		Sistema.jogador.escolherEquipamento();
		System.out.println("\n[NARRADOR] Voce coloca o equipamento e imediatamente se sente mais forte.");
		System.out.println("\n" + charname() + "  O que e isso?");
		System.out.println("[REX] Um equipamento para te ajudar na missao.");
		if (withPiper == true) {
			if (relacionamentoPiper >= 5) {
				System.out.println("\n[PIPER] Voce ficou incrivel com isso!");
				System.out.println("[PIPER] E bastante intimidador! Hihi");
			}else {
				System.out.println("[PIPER] Ficou otimo!");
			}
		}
		System.out.println("[REX] Piper ira acompanha-lo nessa primeira missao para guia-lo.");
		System.out.println("[REX] Pegue tambem essa injecao de cura, vai te ajudar.");
		System.out.println("\n[!] Recebeu 1 Injecao de Cura.\n");
		System.out.println(charname() + " Certo, e para onde vamos?");
		System.out.println("[REX] Para a parte esquecida da cidade, o Distrito EXODI.");
		System.out.println("[REX] Vou te enviar os dados da missao.");
		Sistema.pressioneParaContinuar();
		System.out.println("\n\n===================MISSAO===================");
		System.out.println("             - DISTRITO EXODI -");
		System.out.println("\nEstilo de Missao: Remover Poluicao");
		System.out.println("\nDescricao: O Distrito Exodi esta sendo utilizado \npara acomular o lixo da HYTECH em grande massa.\nSeu dever sera neutralizar todo o lixo encontrado\nno seu caminho.");
		System.out.println("\n============================================\n");
		System.out.println("\n[NARRADOR] Voce e Piper sao levados ate la em um AV (Air Vehicle) descaracterizado da NatureCorp.");
		if (relacionamentoPiper >= 5) {
			System.out.println("\n[NARRADOR] Voces conversam no caminho.");
			System.out.println("\n" + charname() + "  Entao, recepcionista ne?");
			System.out.println("[PIPER] Nao ta bravo comigo ne?");
			System.out.println(charname() + " Nao, eu tambem nao sairia anunciando que sou um Agente.");
			System.out.println("[PIPER] Que bom! Hahahaha");
			System.out.println(charname() + " Voce trabalha com isso faz quanto tempo?");
			System.out.println("[PIPER] Desde pequena, ajudando com coisas basicas... Meu pai queria me incluir desde cedo.");
			System.out.println(charname() + " Seu pai tambem trabalha na empresa?");
			System.out.println("[PIPER] Voce ja conheceu ele... hahaha");
			System.out.println(charname() + " Pera... REX E SEU PAI?");
			System.out.println("[PIPER] NAO FALA ISSO ALTO, FICOU MALUCO?");
			System.out.println(charname() + " Desculpa, desculpa!");
			System.out.println(charname() + " Mas agora que voce mencionou, voces ate que se parecem.");
			System.out.println("[PIPER] Pois e, eu to surpresa que ele me deixou vir com voce, ele e bem protetivo. Hahaha");
			System.out.println(charname() + " Eita...");
			System.out.println("[PIPER] Hahahaha relaxa, ele gostou de voce. Eu acho.");
			System.out.println(charname() + " Eu espero...");
			System.out.println("\n[NARRADOR] Piper da uma risadinha e voces continuam a viajem");
			relacionamentoPiper += 3;
		}
		System.out.println("\n[MOTORISTA DA NATURECORP] Chegamos ao destino.");
		System.out.println("[PIPER] Hora de comecar o trabalho.\n");
		Sistema.missao = 1;
		Musica.musicStop();
		if(Sistema.music == true) {
			Musica.battleTheme();
		}
		Sistema.pressioneParaContinuar();
	}
	
	public static void Ato1Final() {
		Musica.musicStop();
		if(Sistema.music == true) {
			Musica.ambientTheme();
		}
		Sistema.limparConsole();
		Sistema.printTitulo("PROJETO:N - ATO 1 - FINAL");
		System.out.println("[NARRADOR] Apos uma batalha intensa contra os robos, Piper tira uma especie de granada de seu cinto tatico.");
		System.out.println("\n[PIPER] Isso deve resolver a bagunca.");
		System.out.println("\n[NARRADOR] Piper arremeca a granada e toda a poluicao do local é sugada para dentro do dispositivo.");
		System.out.println("\n" + charname() + " O que e isso?");
		System.out.println("[PIPER] Chamamos de 'P-REM', basicamente um removedor de poluicao.");
		System.out.println("[PIPER] Ele absorve toda a poluicao encontrada dentro de uma determinada area.");
		System.out.println(charname() + " Isso facilita bastante as coisas...");
		System.out.println("[PIPER] Rapido, vamos voltar ate o QG, antes que mais robos aparecam.");
		System.out.println(charname() + " Que robos sao esse?");
		System.out.println("[PIPER] Robos criados pela HYTECH, eles tem a missao de proteger toda essa porcaria deixada na rua.");
		System.out.println(charname() + " Mas pra que eles deixariam isso ai?");
		System.out.println("[PIPER] A HYTECH e responsavel pelo desenvolvimento dos geradores de oxigenio, quanto mais poluicao na rua...");
		System.out.println(charname() + " Menos oxigenio teremos pra sobreviver...");
		System.out.println("[PIPER] Exato. E isso ira obrigar todos a comprar os geradores de ar deles.");
		System.out.println(charname() + " Que absurdo!");
		if (relacionamentoPiper >= 5) {
			System.out.println("\n[PIPER] Escuta, " + Sistema.jogador.nome + ", eu vou ser sincera.");
			System.out.println("[PIPER] Assim que a HYTECH descobrir sobre o 'PROJETO:N'... seremos cacados.");
			System.out.println(charname() + " Como assim?");
			System.out.println("[PIPER] Esses robos de patrulha, nao sao nada comparados ao que iremos enfrentar.");
			System.out.println("[PIPER] Entao vou te dar uma chance... de fugir.");
			System.out.println(charname() + " O que!?");
			System.out.println("[PIPER] Ir embora, voltar pra sua vida normal.");
			System.out.println("[PIPER] E entao?");
			escolhaValida = false;
			while (!escolhaValida) {
				System.out.println("\n   [1] Claro que nao, Piper! Nao vou te abandonar! (Requer Nvl 8+ com Piper)");
				System.out.println("   [2] Eu quero continuar.\n   [3] Eu acho melhor eu ir.");
				int opcao = escolha.nextInt();
				if (opcao == 1) {
					if (relacionamentoPiper >= 8) {
						System.out.println("[PIPER] Jura?");
						System.out.println("[PIPER] Eu fico muito feliz em saber disso.");
						if (relacionamentoPiper >= 7) {
							System.out.println("\n[NARRADOR] Piper sorri e te abraca bem forte.");
						}
						System.out.println("\n[PIPER] Obrigada!");
						System.out.println("\n[NARRADOR] Voces dois dao um sorriso um para o outro.\n");
						relacionamentoPiper += 4;
						escolhaValida = true;
					}else {
						System.out.println("[!] Voce nao tem nivel de relacionamento com Piper o suficiente.");
					}
				}else if (opcao == 2) {
					System.out.println("[PIPER] Tem certeza?");
					System.out.println(charname() + " Tenho!");
					System.out.println("[PIPER] Otimo! Entao vamos!");
					escolhaValida = true;
				}else if(opcao == 3) {
					System.out.println("[PIPER] Certo.");
					System.out.println("[PIPER] Irei chamar um AV para te levar pra casa.");
					System.out.println("[PIPER] Obrigado por tudo.");
					System.out.println("\n[NARRADOR] Voce desistiu...");
					Sistema.pressioneParaContinuar();
					Sistema.jogadorMorreu();
				}else {
					System.out.println("[!] Por favor, escolha uma opcao valida!");
				}
			}
		}
		System.out.println("\n[PIPER] O AV chegou, vamos!");
		System.out.println("\n[NARRADOR] Voces voltam ate o QG da NatureCorp e se encontram com Rex.");
		System.out.println("\n[REX] Agentes! Como foram?");
		System.out.println("[PIPER] Conseguimos finalizar a missao.");
		System.out.println(charname() + " Lutamos contra robos e conseguimos extinguir a poluicao daquele local.");
		relacionamentoRex += 1;
		System.out.println("[REX] Otimo! Prontos para a proxima missao entao?");
		System.out.println(charname() + " Sim!");
		System.out.println("[PIPER] SIM!!!");
		System.out.println("[REX] Piper, essa voce tera que ficar de fora.");
		System.out.println("[PIPER] O QUE!?");
		System.out.println("[REX] Piper... olhe o tom.");
		System.out.println("[PIPER] Desculpe.");
		if (relacionamentoPiper >= 8) {
			System.out.println("\n   [1] (Intervir)\n   [2] (Ficar em silencio)");
			escolhaValida = false;
			while (!escolhaValida) {
				int opcao = escolha.nextInt();
				if (opcao == 1) {
					System.out.println(charname() + " Espera... nao sei se consigo sem a ajuda dela.");
					System.out.println("[REX] Sei que quer alegra-la, porem, tenho outra tarefa no momento pra ela.");
					System.out.println("[PIPER] Ta tudo bem, " + Sistema.jogador.nome + ". Eu sei que vai conseguir sem a minha ajuda.");
					System.out.println("\n[NARRADOR] Piper te entrega 3 P-REM.");
					Sistema.pREM += 3;
					System.out.println("[NARRADOR] Piper sussura no seu ouvido.");
					System.out.println("\n[PIPER] Obrigada por tentar.");
					relacionamentoPiper += 3;
					escolhaValida = true;
				}else if (opcao == 2) {
					System.out.println(charname() + " ...");
					System.out.println("\n[NARRADOR] Piper te entrega 3 P-REM.");
					Sistema.pREM += 3;
					System.out.println("\n[PIPER] Aqui, vai precisar.");
					escolhaValida = true;
				}
			}
		}else {
			System.out.println(charname() + " ...");
			System.out.println("\n[NARRADOR] Piper te entrega 3 P-REM.");
			Sistema.pREM += 3;
			System.out.println("\n[PIPER] Aqui, vai precisar.");
		}
		System.out.println("\n[NARRADOR] Piper sai da sala.");
		withPiper = false;
		System.out.println("\n[REX] O proximo local da sua missao vai ser um deposito de lixo tecnologico.");
		System.out.println("[REX] O lixo de la esta causando um impacto enorme na nossa atmosfera, preciso que remova tudo.");
		System.out.println("[REX] Estou enviando os dados da missao para o seu visor.");
		Sistema.pressioneParaContinuar();
		System.out.println("\n\n===================MISSAO===================");
		System.out.println("      - DEPOSITO DE LIXO TECNOLOGICO -");
		System.out.println("\nEstilo de Missao: Remover Poluicao");
		System.out.println("\nDescricao: O Deposito de Lixo Tecnologico e o\nlocal onde todoo lixo tecnologico da cidade e \nacumulado e'preservado'. Seu objetivo e remo-\nver completamente toda a poluicao do local.");
		System.out.println("\n============================================\n");
		System.out.println("[REX] Esta pronto?");
		System.out.println(charname() + " Sempre pronto!");
		System.out.println("[REX] Antes de ir, pedi para fazerem um novo equipamento para voce utilizar.");
		System.out.println("[REX] Pegue.");
		Sistema.jogador.escolherEquipamento();
		System.out.println(charname() + " Obrigado.");
		Sistema.pressioneParaContinuar();
	}
	
	public static void Ato2() {
		Sistema.limparConsole();
		Sistema.printTitulo("PROJETO:N - ATO 2");
		System.out.println("[NARRADOR] Ao chegar no local, voce sai do AV e ele imediatamente sai.");
		System.out.println("[NARRADOR] Voce caminha silenciosamente para perto do deposito, mas, voce escuta algo atras de voce.");
		System.out.println("[NARRADOR] Voce se vira rapidamente e da de cara com um... robo voador?\n");
		Sistema.ecoBOT();
		withEcoBot = true;
		System.out.println(charname() + " Tudo bem, agora pode ir.");
		System.out.println("[ECOBOT] Desculpe senhor, tenho ordens para ficar!");
		System.out.println(charname() + " O que? Pra que?");
		System.out.println("[ECOBOT] Tenho ordens para lhe ajudar, senhor.");
		System.out.println(charname() + " Ta bom, so nao me atrapalhe entao");
		System.out.println("[ECOBOT] Sim, senhor!");
		System.out.println("\n[NARRADOR] Voce e EcoBot chegam perto da entrada do deposito.");
		System.out.println("\n" + charname() + "  Quantos robos...");
		System.out.println("[ECOBOT] Senhor, " + Sistema.jogador.nome + ", acredito que esses robos sejam bem perigosos.");
		System.out.println(charname() + " Eu sei, porem, eu sou mais.");
		System.out.println("[ECOBOT] DESTRUA TODOS ELES!\n");
		Musica.musicStop();
		if(Sistema.music == true) {
			Musica.battleTheme();
		}
		Sistema.pressioneParaContinuar();
	}
	
	public static void Ato2Final() {
		Musica.musicStop();
		if(Sistema.music == true) {
			Musica.ambientTheme();
		}
		Sistema.limparConsole();
		Sistema.printTitulo("PROJETO:N - ATO 2 - FINAL");
		System.out.println(charname() + " Ja foram todos.");
		System.out.println("[ECOBOT] Excelente, Senhor!");
		System.out.println(charname() + " Agora, vamos para o que interessa.");
		System.out.println("\n[NARRADOR] Voce pega um dos 3 P-REM que Piper te deu e o aproxima da poluicao.");
		Sistema.pREM -= 1;
		System.out.println("[NARRADOR] Todas as poeiras, lixos, fumacas, comecam a ser sugados pelo P-REM.");
		System.out.println("[P-REM] Poluicao removida.");
		Sistema.pressioneParaContinuar();
		System.out.println(charname() + " Vamos voltar pro QG.");
		System.out.println("[ECOBOT] Sim, Senhor.");
		System.out.println("[ECOBOT] Chamando AV...");
		System.out.println("\n[AV] Por favor, entre no veiculo.");
		System.out.println("\n[NARRADOR] Voces retornam ao QG.");
		System.out.println("[REX] " + Sistema.jogador.nome + "! Voce voltou.");
		System.out.println(charname() + " Tudo certo, consegui remover o lixo de la.");
		System.out.println("[REX] Olhando pro seu estado, acho que voce encontrou alguns robos da HYTECH eu imagino.");
		System.out.println(charname() + " Nada que eu nao possa dar conta.");
		System.out.println("[REX] Bom, mas mesmo assim, preparei outra coisa pra voce.");
		Sistema.jogador.escolherEquipamento();
		System.out.println(charname() + " Isso deve servir.");
		System.out.println("[REX] Acho melhor voce descancar antes de ir para a proxima missao, " + Sistema.jogador.nome + ".");
		escolhaValida = false;
		while (!escolhaValida) {
			System.out.println("\n   [1] Descancar");
			System.out.println("   [2] Continuar Jornada");
			int opcao = escolha.nextInt();
			if(opcao == 1) {
				System.out.println("[NARRADOR] Voce decide descancar.");
				System.out.println("[!] HP restaurado ao maximo.");
				escolhaValida = true;
			}else if(opcao == 2){
				System.out.println("[NARRADOR] Voce decide continuar sua jornada.");
				escolhaValida = true;
			}else {
				System.out.println("[!] Por favor, escolha uma opcao valida!");
			}
		}
		System.out.println("\n[REX] Irei enviar a voce os detalhes da proxima missao.");
		System.out.println("\n");
		Sistema.pressioneParaContinuar();
		System.out.println("\n\n===================MISSAO===================");
		System.out.println("           - DOCAS DE NEONCITY -");
		System.out.println("\nEstilo de Missao: Remover Poluicao");
		System.out.println("\nDescricao: As Docas de NeonCity estao sendo ocupadas\npor robos da HYTECH, eles tem o objetivo de proteger \ntodo o conteudo de lixo utilizado pela empresa, voce\ndeve ir la e neutraliza-los.");
		System.out.println("\n============================================\n");
		System.out.println("[REX] Entao, tudo pronto?");
		System.out.println(charname() + " Sim.");
		Sistema.pressioneParaContinuar();
		
	}
	
	public static void Ato3() {
		Sistema.limparConsole();
		Sistema.printTitulo("PROJETO:N - ATO 3");
		System.out.println("[NARRADOR] Ao chegar ao local, e possivel notar uma enorme presenca de robos no local.");
		System.out.println("\n[ECOBOT] Senhor, eu recomendo uma aproximacao sigilosa.");
		System.out.println(charname() + " Talvez.");
		escolhaValida = false;
		while(!escolhaValida) {
			System.out.println("\n   [1] Aproximacao sigilosa");
			System.out.println("   [2] Aproximacao ofensiva");
			int opcao = escolha.nextInt();
			if(opcao == 1) {
				System.out.println(charname() + " Vamos no sigilo.");
				relacionamentoEcoBot += 1;
				System.out.println("[ECOBOT] Certo, Senhor.");
				System.out.println("\n[NARRADOR] Voce e EcoBot tentam passar sigilosamente pelos robos, porem, a \npresenca de EcoBot alerta os inimigos.");
				System.out.println("\n[ECOBOT] Senhor! Nos descobriram!");
				System.out.println(charname() + " Eu percebi Eco... EU PERCEBI!");
				System.out.println("[ECOBOT] Deveriamos fugir, Senhor.");
				System.out.println(charname() + " Nao, Eco. Nos vamos lutar.");
				System.out.println("[ECOBOT] Oh Ceus!");
				Sistema.pressioneParaContinuar();
				Musica.musicStop();
				if(Sistema.music == true) {
					Musica.battleTheme();
				}
				escolhaValida = true;
			}else if(opcao == 2){
				System.out.println(charname() + " Vamos na ofensiva.");
				System.out.println("[ECOBOT] Certo, Senhor.");
				Sistema.pressioneParaContinuar();
				Musica.musicStop();
				if(Sistema.music == true) {
					Musica.battleTheme();
				}
				escolhaValida = true;
			}else {
				System.out.println("[!] Por favor, escolha uma opcao valida!");
			}
		}
	}
	
	public static void Ato3Final() {
		Sistema.limparConsole();
		Musica.musicStop();
		if(Sistema.music == true) {
			Musica.ambientTheme();
		}
		Sistema.printTitulo("PROJETO:N - ATO 3 - FINAL");
		System.out.println(charname() + " Ufa.. foram todos.");
		System.out.println("[ECOBOT] Muito bem, Senhor.");
		System.out.println(charname() + " Vamos acabar logo com isso.");
		System.out.println("\n[NARRADOR] Voce joga um P-REM no meio do lixo acumulado.");
		System.out.println("[P-REM] Poluicao detectada, comecando a remocao.");
		System.out.println("[P-REM] Poluicao removida.");
		Sistema.pREM -= 1;
		System.out.println("\n" + charname() + " Vamos sair daqui.");
		System.out.println("[ECOBOT] Certo, Senhor.");
		System.out.println(charname() + " Espera, o que e isso?");
		System.out.println("[ECOBOT] Aparenta ser um holodisco, Senhor.");
		System.out.println(charname() + " Vou ver o que esta escrito.");
		System.out.println("[ECOBOT] Cuidado, Senhor, pode conter um virus.");
		System.out.println(charname() + " Relaxa, Eco.");
		System.out.println("");
		System.out.println("======================================================");
		System.out.println("                   PROJETO HYTECH");
		System.out.println("");
		System.out.println("  Com enorme prazer, viemos atraves deste holodisco,  ");
		System.out.println("  solicitar vossa presenca no lancamento oficial do");
		System.out.println("  PROJETO HYTECH.");
		System.out.println("  ");
		System.out.println("  Iremos colocar em chamas todo o Parque Municipal ");
		System.out.println("  de NeonCity. Acabando com a maior fonte de oxige-");
		System.out.println("  nio de nossa cidade! Nossas vendas triplicarao");
		System.out.println("  depois disso.");
		System.out.println("  ");
		System.out.println("  Local: Parque Municipal de NeonCity.");
		System.out.println("  Horario: 17:30");
		System.out.println("  Data: 25/04/2087");
		System.out.println("");
		System.out.println("======================================================");
		System.out.println("");
		System.out.println(charname() + " Meu deus! ISSO E HOJE ECO!");
		System.out.println(charname() + " QUE HORAS SAO?");
		System.out.println("[ECOBOT] 17:12, Senhor.");
		System.out.println(charname() + " A gente tem que ir pra la, agora!");
		System.out.println(charname() + " Irei enviar os dados do Holodisco para o Rex.");
		System.out.println("[ECOBOT] Senhor, nao e muito recomendado ir direto pra acao.");
		System.out.println(charname() + " Vamos Eco, vamos AGORA!");
		System.out.println("");
	    Sistema.pressioneParaContinuar();
	}
	
	public static void Ato4() {
		Sistema.limparConsole();
		Musica.musicStop();
		if(Sistema.music == true) {
			Musica.battleTheme();
		}
		Sistema.printTitulo("PROJETO:N - ATO 4");
		System.out.println(charname() + " Chegamos, onde estao todos?");
		System.out.println("[ECOBOT] Nao aqui, espero.");
		System.out.println(charname() + " ECO, CUIDADO!");
		System.out.println("\n[NARRADOR] Uma lanca metalica atravessa Eco, arrancando um de seus bracos.");
		System.out.println("\n[???] Hahahaha, entao e voce que esta removendo a poluicao de toda cidade!");
		System.out.println(charname() + " Sim... sou eu. E voce quem e?");
		System.out.println("[AZAZEL] Sou AZAZEL! CEO da HYTECH, e voce esta tentando acabar com os meus planos!");
		System.out.println(charname() + " Precisamente, sim.");
		System.out.println("[AZAZEL] Ora, ora. Voce acha que pode ser um heroi, garoto?");
		System.out.println(charname() + " Bom, eu sou meio que um agente contratado, mas ainda nao ouvi nada sobre pagamento...");
		System.out.println("[AZAZEL] Hahahaha, e uma pena, voce nao vai precisar dele mesmo.");
		System.out.println("[AZAZEL] POR QUE VOCE VAI MORRER!");
		System.out.println("\n[NARRADOR] Em um piscar de olhos, voce e cercado por agentes da HYTECH.");
		System.out.println("[NARRADOR] Nao sao robos, sao pior do que isso.");
		System.out.println("[NARRADOR] Sao pessoas vestidas com armaduras super tecnologicas.");
		System.out.println("\n" + charname() + " Droga, eles estao muito mais equipados.");
		System.out.println("[REX] Relaxa, garoto.");
		System.out.println("\n[NARRADOR] De repente, voce se vira e ve Rex liderando um exercito de agentes da NatureCorp.");
		if(relacionamentoPiper >= 10) {
			System.out.println("[NARRADOR] Voce tambem ve Piper junto com os outros.");
			System.out.println("\n" + charname() + " E bom te ver, Piper.");
			System.out.println("[PIPER] E bom ver voce tambem, " + Sistema.jogador.nome + ".");
			System.out.println("\n[NARRADOR] Voces se abracam.");
			
		}
		System.out.println("[NARRADOR] Rex te entrega uma armadura completa feita com Nanotecnologia natural.");
		System.out.println("\n[REX] Presente pra voce, garoto.");
		System.out.println(charname() + " Obrigado, Rex, de verdade.");
		System.out.println("[REX] Me agradeca depois de pegar aquele maldito.");
		System.out.println("[AZAZEL] HAHAHAHAAH ACHAM QUE CONSEGUEM DERROTAR MEU EXERCITO? BOA SORTE!");
		System.out.println("[REX] PRONTOS AGENTES!?");
		System.out.println("[TODOS] SIM COMANDANTE!");
		System.out.println(charname() + " SIM COMANDANTE!");
		System.out.println("[REX] ENTAO VAMOS PRA CIMA DELES!!!!");
		Sistema.jogador.numAtqItems = 4;
		Sistema.jogador.numDefItems = 4;
		System.out.println("[REX] Garoto, procure por Azazel, ele vai tentar se esconder.");
		System.out.println(charname() + " Certo!");
		System.out.println("");
		System.out.println("[NARRADOR] Voce procura por Azazel, e acha ele perto de um dispositivo enorme.");
		System.out.println("");
		System.out.println(charname() + " O qu-");
		System.out.println("[AZAZEL] Hahahahaah! Voce chegou tarde, heroi!");
		System.out.println("[AZAZEL] Eu vou incinerar tudo!");
		System.out.println(charname() + " Droga... nao... nao posso deixar!");
		System.out.println(charname() + " ME ENFRENTE AZAZEL! VOCE NAO TEM CORAGEM!");
		System.out.println("[AZAZEL] Tentando me provocar, garoto? Hahahaa");
		System.out.println("[AZAZEL] Boa tentativa.");
		System.out.println(charname() + " Acha que isso vai ajudar a sua empresa? Isso so vai acabar com o nosso planeta!");
		System.out.println(charname() + " O oxigenio é apenas uma das coisas que irao acabar se voce fizer isso!");
		System.out.println("[AZAZEL] Fique tranquilo, garoto. A HYTECH vai oferecer os produtos suficientes para manter a vida na Terra.");
		System.out.println("[AZAZEL] Pelo preco certo, e claro. hahahaha");
		System.out.println(charname() + " Eu nao vou permitir, isso acaba agora!");
		System.out.println("[AZAZEL] Voce vai tentar.");
		System.out.println("");
		Sistema.jogador.vida = Sistema.jogador.maxVida;
		Sistema.pressioneParaContinuar();
		Musica.musicStop();
		if(Sistema.music == true) {
			Musica.finalBattleTheme();
		}
		System.out.println("[NARRADOR] Voce avanca em direcao a Azazel com seu Nano-Sabre em maos, tentando desferir um golpe, porem ele habilmente desvia do ataque.");
		System.out.println("[NARRADOR] Ele e muito rapido!");
		System.out.println("\n[AZAZEL] Boa tentativa, porem, lento demais.");
		escolhaValida = false;
		while (!escolhaValida) {
			System.out.println("\n   [1] Usar Nano-Sabre");
			System.out.println("   [2] Usar Propulsor das Nano-Botas");
			System.out.println("   [3] Aprimorar Velocidade do Nano-Exoesqueleto");
			int opcao = escolha.nextInt();
			if(opcao == 1) {
				System.out.println("[NARRADOR] Voce tenta usar o Nano-Sabre novamente, mas falha.");
				System.out.println("[NARRADOR] Ele e muito rapido!");
			}else if(opcao == 2){
				System.out.println("[NARRADOR] Voce utiliza os propulsores de sua Nano-Bota.");
				System.out.println("[NARRADOR] Mas falha, Azazel ainda e muito mais rapido.");
			}else if(opcao == 3) {
				System.out.println("[NARRADOR] Voce aprimora a velocidade do seu Exoesqueleto.");
				System.out.println("[NARRADOR] Voce agora consegue acompanhar um pouco mais Azazel.");
				escolhaValida = true;
			}else {
				System.out.println("[!] Por favor, escolha uma opcao valida!");
			}
		}
		System.out.println("[NARRADOR] Voce tenta golpear Azazel mais uma vez, o Nano-Sabre raspa em seu braco.");
		System.out.println("\n[AZAZEL] Nada mal, mas vai precisar de muito mais do que isso!");
		System.out.println(charname() + " Vou fazer o que for preciso.");
		System.out.println("\n[NARRADOR] Azazel usa sua katana laser e avanca na sua direcao.");
		escolhaValida = false;
		while (!escolhaValida) {
			System.out.println("\n   [1] Desviar (Requer: Nano-Botas)");
			System.out.println("   [2] Usar Escudo Protetor (Requer: Nano-Peitoral)");
			System.out.println("   [3] Contra-Atacar (Requer: Nano-Sabre)");
			int opcao = escolha.nextInt();
			if(opcao == 1) {
				System.out.println("[NARRADOR] Voce utiliza as suas Nano-Botas para dar a desviada perfeita.");
				System.out.println("[NARRADOR] As botas juntamente com o aprimoramento do ExoEsqueleto fazem com que\nvoce de um salto para frente, desviando do ataque de Azazel.");
				escolhaValida = true;
			}else if(opcao == 2){
				System.out.println("[NARRADOR] Voce utiliza seu Nano-Peitoral para criar um escudo de plasma.");
				System.out.println("[NARRADOR] A katana laser de Azazel nao consegue penetrar o escudo.");
				escolhaValida = true;
			}else if(opcao == 3) {
				System.out.println("[NARRAODR] Voce defende o ataque de Azazel utilizando seu Nano-Sabre.");
				System.out.println("[NARRADOR] Os dois comecam um duelo frenetico de sabres lasers.");
				System.out.println("[NARRADOR] Azazel salta pro cima de voce e tenta te atacar pelas costas.");
				System.out.println("[NARRADOR] Mas voce foi mais rapido, com a ajuda do Exoesqueleto, voce desvia.");
				System.out.println("[NARRADOR] O duelo continua e Azazel salta para tras e entra em defensiva.");
				escolhaValida = true;
			}else {
				System.out.println("[!] Por favor, escolha uma opcao valida!");
			}
		}
		System.out.println("[AZAZEL] Droga, nao vai ficar assim, verme!");
		System.out.println("[AZAZEL] Voce nao tem ideia do que eu fiz pra chegar onde estou!");
		System.out.println("[AZAZEL] EU NAO VOU PERMITIR QUE UM JOVEMZINHO MEDIOCRE COMO VOCE, ACABE COM TUDO!");
		System.out.println("\n[NARRADOR] Azazel perde o controle de suas emocoes e avanca na sua direcao em alta velocidade.");
		System.out.println("[NARRADOR] Ele avanca tao rapido que voce nao tem tempo de reagir.");
		System.out.println("[NARRADOR] Quando voce pensa que tudo acabou, Rex, pula em sua frente, te salvando.");
		System.out.println("[NARRADOR] Ele cai no chao.");
		System.out.println("\n" + charname() + " REX!!!!!");
		System.out.println("\n[NARRADOR] Voce corre ate Rex caido no chao.");
		System.out.println("\n[REX] " + Sistema.jogador.nome + ", voce tem potencial... potencial para acabar com ele.");
		System.out.println(charname() + " Eu nao consigo... ele e muito forte.");
		System.out.println("[REX] Consegue sim, garoto. Eu confio em voce.");
		if(relacionamentoPiper >= 10) {
			System.out.println("[REX] Cuide... cuide da Piper por mim.");
			System.out.println(charname() + " Eu vou.");
		}
		System.out.println("\n[NARRADOR] Voce observa Rex dar o seu ultimo suspiro.");
		System.out.println("[NARRADOR] Seu coracao se enfurece com raiva e voce avanca pra cima de Azazel.");
		System.out.println("[NARRADOR] A batalha decisiva comeca agora.");
		Sistema.pressioneParaContinuar();
	}
	
	public static void Final() {
			Musica.musicStop();
			if(Sistema.music == true) {
				Musica.ambientOneTheme();
			}
			System.out.println("[NARRADOR] Com sua determinacao e coragem, o jovem " + Sistema.jogador.nome + " conseguiu deter os planos nefastos da empresa criminosa HYTECH, \nque ameacava a vida da natureza em NeonCity e todo o mundo.");
			System.out.println("\n[NARRADOR] Após sua bem-sucedida missao, o jovem se tornou um herói aclamado em todo o mundo, e foi condecorado com as mais altas\nhonrarias por sua coragem e bravura. Sua história inspirou uma geracao de jovens a se \nengajarem na luta pela preservacao do meio ambiente e a acreditarem que um individuo \npode fazer a diferenca.");
			if(relacionamentoPiper >= 15) {
				System.out.println("\n[NARRADOR] E essa historia nao e so de coragem e bravura, mas tambem de amor! " + Sistema.jogador.nome + " e Piper se casaram e viraram membros \ndos AEN (Agentes Especiais da NatureCorp).");
			}
			System.out.println("\n[NARRADOR] Mas a historia ainda nao acabou, nosso Agente ainda tem muito pelo que lutar, pois a natureza ainda continua em risco.");
			System.out.println("\n[NARRADOR]Sera nosso Agente capaz de enfrentar os perigos que estao vindo?");
			System.out.println("\nContinua em PROJETO:N 2");
			System.out.println("\nFim.");
			Sistema.pressioneParaContinuar();
			System.exit(0);
	}
}
