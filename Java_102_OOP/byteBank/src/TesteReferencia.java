
public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira Conta " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;

		System.out.println("Saldo da segunda Conta " + segundaConta.saldo);

		segundaConta.saldo += 100;
		
		System.out.println("Após atribuição: ");
		System.out.println("Saldo da primeira Conta " + primeiraConta.saldo);
		System.out.println("Saldo da segunda Conta " + segundaConta.saldo);
		
		
		
	}
}
