import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;




public class Main {

    public static  String Nome = "";
    public static  String Cpf = "";

    public static String cpf;
    public static int option = 9;
    public static int senha ;
    public static Random alet = new Random();
    public static Scanner ler = new Scanner(System.in);
    public static Hashtable<String,Cliente> clientes = new Hashtable<String,Cliente>();
    public static Hashtable<String,ContaPoupanca> contaPoupanca = new Hashtable<String,ContaPoupanca>();
    public static Hashtable<String,ContaCorrente> contaCorrente = new Hashtable<String,ContaCorrente>();

    public static void main(String[] args) {


        while (option != 0) {

            System.out.println("------ Banco do Brasil -------");
            System.out.println("1.Cadastrar Cliente");
            System.out.println("2.Cadastrar Conta Corrente");
            System.out.println("3.Cadastrar Conta Poupanca");
            System.out.println("4.Efetuar deposito");
            System.out.println("5.Efetuar saque");
            System.out.println("6.Efetuar transferencia");
            System.out.println("0.Sair");
            System.out.println("-----------------------------");
            System.out.print("Opcao selecionada: ");
            option = ler.nextInt();

            switch (option) {
                case 1:{


                        System.out.println("Para o cadastro , entre com o seu Nome Completo e o seu CPF(Sem pontos)");
                        System.out.print("Nome: ");
                        Nome = ler.next();
                        System.out.print("CPF: ");
                        Cpf = ler.next();

                        clientes.put(Cpf,new Cliente(Nome,Cpf));
                    System.out.println("Cliente Criado com Sucesso!");
                            break;
                }
                case 2:
                    System.out.println("------ Cadastrar Conta Corrente ------");
                    System.out.println("Para lhe cadastrar a uma Conta Corrente, por favor insira o seu CPF:");
                    cpf = ler.next();
                    if(!clientes.containsKey(cpf)){
                        System.out.println("Desculpa , o CPF informado nao esta cadastrado!");
                        System.out.println("---------------------");
                        System.out.println("Pressione 0 para sair!");
                        System.out.println("---------------------");
                        ler.nextInt();
                        break;
                    } else {
                        System.out.println("Por favor, entre com a senha para o cadastro ");
                        senha = ler.nextInt();
                        System.out.println("------- Conta -------");
                        System.out.println("AGENCIA : 123");
                        System.out.println("NUMERO DA CONTA : " + "0" + alet.nextInt(10000000) + "-" + alet.nextInt(9));
                        System.out.println("SENHA: ****");
                        System.out.println("---------------------");
                        System.out.println("Pressione 0 para sair!");
                        System.out.println("---------------------");
                        ler.nextInt();
                        contaCorrente.put(cpf, new ContaCorrente(cpf ,Cliente.getNome()));
                        break;
                    }

                case 3:
                    System.out.println("Para lhe cadastrar a uma Conta Poupanca, por favor insira o seu CPF:");
                     cpf = ler.next();
                    if(!clientes.containsKey(cpf)){
                        System.out.println("Desculpa , o CPF informado nao esta cadastrado!");
                        System.out.println("---------------------");
                        System.out.println("Pressione 0 para sair!");
                        System.out.println("---------------------");
                        ler.nextInt();
                        break;
                    } else {
                        System.out.println("Por favor, entre com a senha para o cadastro ");
                        senha = ler.nextInt();
                        System.out.println("------- Conta -------");
                        System.out.println("AGENCIA : 123");
                        System.out.println("NUMERO DA CONTA : " + "0" + alet.nextInt(10000000) + "-" + alet.nextInt(9));
                        System.out.println("SENHA: ****");
                        System.out.println("---------------------");
                        System.out.println("Pressione 0 para sair!");
                        System.out.println("---------------------");
                        ler.nextInt();
                        contaPoupanca.put(cpf, new ContaPoupanca(cpf ,Cliente.getNome()));
                        break;
                    }
                case 4:
                    System.out.println("Para poder depositar , por favor entre com o CPF: ");
                    cpf = ler.next();
                    if(!clientes.containsKey(cpf)) {
                        System.out.println("Desculpa , o CPF informado nao esta cadastrado a nenhuma conta!");
                        System.out.println("---------------------");
                        System.out.println("Pressione 0 para sair!");
                        System.out.println("---------------------");
                        ler.nextInt();
                        break;
                    } else{

                    }

            }
        }
    }
}
