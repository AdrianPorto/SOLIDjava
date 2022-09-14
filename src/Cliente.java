import java.util.Scanner;

public class Cliente {

     private static String Nome ;
    private static String Cpf ;
    public Cliente(String Nome , String Cpf) {

        this.Nome = Nome;
        this.Cpf = Cpf;

    }

    public static String getNome(){
        return Cliente.Nome;
    }

    public static String getCpf() {
        return Cliente.Cpf;
    }

}
