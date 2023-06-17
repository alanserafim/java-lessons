
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoAlan = new Conta();
		contaDoAlan.saldo = 100;
		contaDoAlan.deposita(50);
		contaDoAlan.saca(200);
		System.out.println("Alan, seu saldo é: " + contaDoAlan.saldo);
		
		Conta contaDaBia = new Conta();
		contaDaBia.saldo = 200;
		contaDaBia.deposita(100);
		contaDaBia.saca(20);
		System.out.println("Bia, seu saldo é: " + contaDaBia.saldo);
		
		
		boolean operacao = contaDaBia.transfere(20, contaDoAlan);
		
		if(operacao) {
			System.out.println("Transferência realizada com sucesso.");
		} else {
			System.out.println("A conta não possui saldo suficiente.");
		}
		
		System.out.println("Alan, seu saldo é: " + contaDoAlan.saldo);
		System.out.println("Bia, seu saldo é: " + contaDaBia.saldo);

	}

}