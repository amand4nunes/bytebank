public class CriarConta{
	
		public static void main(String[] args) {
			Conta primeiraConta = new Conta();
			primeiraConta.saldo = 200;
			System.out.println(primeiraConta.saldo);
			
			Conta segundaConta = new Conta();
			segundaConta.saldo = 300;
			System.out.println(segundaConta.saldo);
			
			Conta terceiraConta = new Conta();
			terceiraConta.saldo = 0;
			System.out.println(terceiraConta.saldo );
			
			primeiraConta.saldo += 100;
			segundaConta.saldo += 50;
			
			System.out.println("Saldo Primeira conta "+ primeiraConta.saldo);
			System.out.println("Saldo Segunda conta " + segundaConta.saldo);
			System.out.println("Saldo terceira conta "+ terceiraConta.saldo);	
			
			System.out.println(primeiraConta.agencia);
			System.out.println(primeiraConta.numero);
		}
			
	}