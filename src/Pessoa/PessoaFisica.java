package Pessoa;

public class PessoaFisica extends Pessoa {
	private int cpf;
	private String estadoCivil;

	public PessoaFisica(String nome, int cpf, String estadoCivil, String endereco) {
		super(nome, endereco);
		setCpf(cpf);
		setEstadoCivil(estadoCivil);
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		if (cpf > 0)
			this.cpf = cpf;
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaFisica [cpf=");
		builder.append(cpf);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
