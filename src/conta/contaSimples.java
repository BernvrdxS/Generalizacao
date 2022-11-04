package conta;

public class contaSimples extends conta {

	private double saldopoupanca;
	
	public contaSimples(String banco, int agencia, int numeroconta, double saldo) {
		
		super(banco,agencia,numeroconta,saldo);
	} 
	
	public contaSimples() {
		
	}

	public double getSaldopoupanca() {
		return saldopoupanca;
	}

	public void setSaldopoupanca(double saldopoupanca) {
		this.saldopoupanca = saldopoupanca;
	}
	
	public boolean depositoPoupanca(double valor) {
		if (valor > 0) {
			setSaldopoupanca(getSaldopoupanca() + valor);
			return true;
		}
		return false;
	}
	
	public boolean saquePoupanca(double valor) {
		if (valor <= getSaldopoupanca()) {
			setSaldopoupanca(getSaldopoupanca() - valor);
			return true;
		}
		return false;
	}
	public double total() {
		return getSaldo() + getSaldopoupanca();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("contaSimples [saldopoupanca=");
		builder.append(saldopoupanca);
		builder.append(", getSaldopoupanca()=");
		builder.append(getSaldopoupanca());
		builder.append(", total()=");
		builder.append(total());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}





	}
	

