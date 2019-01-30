package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setSaldo(4000);
        imprimirSaldo(conta);
        System.out.println();
        
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(3500);
        imprimirSaldo(contaCorrente);
        System.out.println();        
       
        Conta contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(2000);
        imprimirSaldo(contaPoupanca);
    }

    /**
     * 
     * @param conta 
     */
    public static void imprimirSaldo(Conta conta) {
        
        System.out.println("Saldo da conta: R$" + conta.getSaldo());

        if(conta instanceof ContaCorrente) {
            ContaCorrente cc = (ContaCorrente) conta;
            System.out.println("O limite da conta corrente R$" + cc.getLimite());
        }

        if(conta instanceof ContaPoupanca) {
            ContaPoupanca cp = (ContaPoupanca) conta;
            System.out.println("O rendimento da conta poupança R$" + cp.getRendimentos());
        }
    }
}
