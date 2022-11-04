package conta;

public class contaMain {

	public static void main(String[] args) {
				
//		Conta c = new Conta("Banco do Brasil", 123, 321, 0);		
//		if (c.deposito(1000)) {
//			System.out.println("Depósito OK");
//		}
//		System.out.println(c.deposito(-100));
//				
//		c.saque(100);
//		c.saque(901);
//				
//		System.out.println(c);
				
		//Conta Simples
		
//		contaSimples cs = new contaSimples("Caixa", 456, 654, 100);
//		System.out.println(cs.depositoPoupanca(40000));
//		System.out.println(cs.saque(30000));
//		System.out.println(cs.saque(30000));
				
//		System.out.println(cs);
		
		//Conta Especial
		
		contaEspecial ce = new contaEspecial ("Bradesco", 777, 888, 500);
		System.out.println(ce.depositoEspecial(40000));
		System.out.println(ce.saqueEspecial(30000));
		System.out.println(ce.saque(30000));
		
		System.out.println(ce);
	}

		
	}


