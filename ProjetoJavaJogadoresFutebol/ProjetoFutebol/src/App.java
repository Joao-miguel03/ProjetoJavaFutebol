import java.util.Locale;
import java.util.ArrayList;
import java.util.Scanner;
import futebol.*;


public class App {
    static ArrayList<Atacante> listaAtacantes = new ArrayList<>();
    static ArrayList<Defensor> listaDefensores = new ArrayList<>();
    static ArrayList<Goleiro> listaGoleiros = new ArrayList<>();
    static ArrayList<Time> listaTimes = new ArrayList<>();

        @SuppressWarnings("deprecation")
        public static void main(String[] args) throws Exception {
            Locale.setDefault(new Locale("en", "US"));

            @SuppressWarnings("resource")
            Scanner input = new Scanner(System.in);
    
            // Atacante
            for(int x = 0; x < 3; x++){
                int idJogador;
                String nome;
                int idade;
                String nacionalidade;
                double altura;
                double peso;
                int num_camisa;
                String posicao;
                int golsMarcados;
                int assistencias;
                int finalizacoesCertas;
                int driblesCompletos;
                double velocidade;
    
                System.out.print("digite o id do jogador: ");
                idJogador = input.nextInt();
                System.out.print("digite o nome do jogador: ");
                nome = input.next();
                System.out.print("digite a idade do jogador: ");
                idade = input.nextInt();
                System.out.print("digite a nacionalidade do jogardor: ");
                nacionalidade = input.next();
                System.out.print("digite a altura do jogador: ");
                altura = input.nextDouble();
                System.out.print("digite o peso do jogador: ");
                peso = input.nextDouble();
                System.out.print("qual o numero da Camisa do jogador: ");
                num_camisa = input.nextInt();
                System.out.println("digite a posicao que ele joga: ");
                posicao = input.nextLine();
                System.out.print("digite os gols marcados pelo jogados: ");
                golsMarcados = input.nextInt();
                System.out.print("digite as assistencias do jogador: ");
                assistencias = input.nextInt();
                System.out.print("digite as finalizações certas: ");  
                finalizacoesCertas = input.nextInt();
                System.out.print("digite os dribles completos pelo jogador: ");
                driblesCompletos = input.nextInt();
                System.out.print("digite a velocidade do jogador: ");
                velocidade = input.nextDouble();  
    
                Atacante atacante = new Atacante(idJogador, nome, idade, nacionalidade, altura, peso, null, num_camisa, posicao, golsMarcados, assistencias, finalizacoesCertas, driblesCompletos, velocidade);
    
                listaAtacantes.add(atacante);

        }
        // Defensor
        for(int x = 0; x< 3; x++){
                int idJogador;
                String nome;
                int idade;
                String nacionalidade;
                double altura;
                double peso;
                int num_camisa;
                String posicao;
                int desarmes;
                int bloqueios;
                int passesPrecisos;
                int jogosSemSofrerGol;
                double forcaFisica;

                System.out.print("digite o id do jogador: ");
                idJogador = input.nextInt();
                System.out.print("digite o nome do jogador: ");
                nome = input.next();
                System.out.print("digite a idade do jogador: ");
                idade = input.nextInt();
                System.out.print("digite a nacionalidade do jogardor: ");
                nacionalidade = input.next();
                System.out.print("digite a altura do jogador: ");
                altura = input.nextDouble();
                System.out.print("digite o peso do jogador: ");
                peso = input.nextDouble();
                System.out.print("qual o numero da Camisa do jogador: ");
                num_camisa = input.nextInt();
                System.out.println("digite a posicao que ele joga: ");
                posicao = input.nextLine();
                System.out.print("digite os desarmes  pelo jogador: ");
                desarmes = input.nextInt();
                System.out.print("digite os bloqueios do jogador: ");
                bloqueios = input.nextInt();
                System.out.print("digite os passes precisos: ");  
                passesPrecisos = input.nextInt();
                System.out.print("digite os jogos sem sofrer gol pelo jogador: ");
                jogosSemSofrerGol = input.nextInt();
                System.out.print("digite a força fisica do jogador: ");
                forcaFisica = input.nextDouble();  
    
                Defensor defensor = new Defensor(idJogador, nome, idade, nacionalidade, altura, peso, null, num_camisa, posicao, desarmes, bloqueios, passesPrecisos, jogosSemSofrerGol, forcaFisica); 

                listaDefensores.add(defensor);

        }       
        // Goleiro
        for(int x = 0; x< 3; x++){
                int idJogador;
                String nome;
                int idade;
                String nacionalidade;
                double altura;
                double peso;
                int num_camisa;
                String posicao;
                int defesas;
                int penaltisDefendidos;
                int golsSofridos;
                int jogosSemSofrerGol;
                double alcance;

                System.out.print("digite o id do jogador: ");
                idJogador = input.nextInt();
                System.out.print("digite o nome do jogador: ");
                nome = input.next();
                System.out.print("digite a idade do jogador: ");
                idade = input.nextInt();
                System.out.print("digite a nacionalidade do jogardor: ");
                nacionalidade = input.next();
                System.out.print("digite a altura do jogador: ");
                altura = input.nextDouble();
                System.out.print("digite o peso do jogador: ");
                peso = input.nextDouble();
                System.out.print("qual o numero da Camisa do jogador: ");
                num_camisa = input.nextInt();
                System.out.println("digite a posicao que ele joga: ");
                posicao = input.nextLine();
                System.out.print("digite as defesas pelo jogador: ");
                defesas = input.nextInt();
                System.out.print("digite os penaltis Defendidos do jogador: ");
                penaltisDefendidos = input.nextInt();
                System.out.print("digite os gols sofridos: ");  
                golsSofridos = input.nextInt();
                System.out.print("digite os jogos sem sofrer gol pelo jogador: ");
                jogosSemSofrerGol = input.nextInt();
                System.out.print("digite o alcance do jogador: ");
                alcance = input.nextDouble();  
    
                Goleiro goleiro = new Goleiro(idJogador, nome, idade, nacionalidade, altura, peso, null, num_camisa, posicao, defesas, penaltisDefendidos, golsSofridos, jogosSemSofrerGol, alcance);

                listaGoleiros.add(goleiro);

        }
        // Time
            for(int x = 0; x< 3; x++){
                int idTime;
                String nome;
                String cidade;
                String fundacao;
                String estadio;

                System.out.print("digite o id do time: ");
                idTime = input.nextInt();
                System.out.print("digite o nome do time: ");
                nome = input.next();
                System.out.print("digite a cidade do time: ");
                cidade = input.next();
                System.out.print("digite o ano de fundação: ");
                fundacao = input.next();
                System.out.print("digite a localização do estadio: ");
                estadio = input.next();

                Time time = new Time(idTime, nome, cidade, fundacao, estadio, null);

                listaTimes.add(time);

            }

            System.out.println("-----------------------------------");
            System.out.println("---- Infomações dos Atacantes -----");   
            for(Atacante atacante: listaAtacantes){
                System.out.println("Nome: " + atacante.getNome());
                System.out.println("idade: "+ atacante.getIdade());
                System.out.println("Gols marcados: "+ atacante.getGolsMarcados());
                System.out.println("Velocidade: "+ atacante.getVelocidade());

                System.out.println("");
            }


            System.out.println("-----------------------------------");
            System.out.println("---- Infomações dos Defensores ----");  
            for(Defensor defensor: listaDefensores){
                System.out.println("Nome: " + defensor.getNome());
                System.out.println("idade: "+ defensor.getIdade());
                System.out.println("bloqueios: "+ defensor.getBloqueios());
                System.out.println("força fisica: "+defensor.getForcaFisica());

                System.out.println("");
            }


            System.out.println("-----------------------------------");
            System.out.println("----- Infomações dos Goleiros -----");  
            for(Goleiro goleiro: listaGoleiros){
                System.out.println("Nome: " + goleiro.getNome());
                System.out.println("idade: "+ goleiro.getIdade());
                System.out.println("penaltis defendidos: "+ goleiro.getPenaltisDefendidos());
                System.out.println("alcance: "+goleiro.getAlcance());

                System.out.println("");
            }


            System.out.println("-----------------------------------");
            System.out.println("------ Infomações dos Times -------");  
            for(Time time: listaTimes){
                System.out.println("Nome: " + time.getNome());
                System.out.println("Cidade: "+ time.getCidade());
                System.out.println("Fundação: "+time.getFundacao());
                System.out.println("Estadio: "+time.getEstadio());

                System.out.println("");
            }
            System.out.println("-----------------------------------");
            
    }
}
