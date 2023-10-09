public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 3580.0;
        double valorSolicitado = 1730.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);
        }else
            System.out.println("Saldo Insuficiente");
    }
    
}
