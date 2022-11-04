package conta;

public class contaEspecial extends conta {
	
	private int diasSemJuros;
	private double limite;
	private double saldoEspecial;
	
	public contaEspecial(String banco, int agencia, int numeroconta, double saldo) {
		
		super(banco, agencia, numeroconta, saldo);
	}

	public contaEspecial() {
		
	}

	public int getDiasSemJuros() {
		return diasSemJuros;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getSaldoEspecial() {
		return saldoEspecial;
	}

	public void setSaldoEspecial(double saldoEspecial) {
		this.saldoEspecial = saldoEspecial;
	}
	
	public boolean depositoEspecial(double valor) {
		if (valor > 0) {
			setSaldoEspecial(getSaldoEspecial() + valor);
			return true;
		}
		return false;
	}
	
	public boolean saqueEspecial(double valor) {
		if (valor <= getSaldoEspecial()) {
			setSaldoEspecial(getSaldoEspecial() - valor); 
			return true;
		}
		return false;
	}
	public double total() {
		return getSaldo() + getSaldoEspecial();
	}



	
	
}
