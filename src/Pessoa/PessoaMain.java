package Pessoa;

public class PessoaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pessoa
	
		Pessoa p = new Pessoa("Bernardo", "Beverly Hills");
		System.out.println(p);
		
		//Pessoa fisica
		
		PessoaFisica pf = new PessoaFisica("Ana",2404,"Solteira", "Palho�a");
		System.out.println(pf);
		
		//Pessoa juridica
		
		PessoaJuridica pj = new PessoaJuridica("BS Engenharia", "0777", "engenharia", "Jaragu�");
		System.out.println(pj);
	}

}
