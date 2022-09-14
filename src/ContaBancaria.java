 abstract class ContaBancaria {

    public  Cliente cliente;
    protected  Double valor;
    protected  Double Saldo;
    public ContaBancaria(String cpf, String nome) {
         String Cpf = cpf;
         String Nome = nome;
    }

    public  void Transferir(Double valor){

    }

    public void Sacar(Double valor){
        if(valor > this.Saldo){
            throw new RuntimeException("Eita sem saldo!!!!");
        }
    }
    public void Depositar(Double valor){
        if(valor < 0){
            throw new RuntimeException("Eita sem saldo!!!!");
        }
    }
}
