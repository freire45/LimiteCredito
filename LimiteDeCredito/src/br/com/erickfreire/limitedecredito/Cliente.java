package br.com.erickfreire.limitedecredito;

public class Cliente {
	
	private String numeroConta;
	private int saldoInicioMes;
	private int totalItensCobrados;
	private int totalCreditos;
	private int limiteCredito;	
	
	public Cliente(String numeroConta, int saldoInicioMes, int totalItensCobrados, int totalCreditos,
			int limiteCredito) {
		super();
		this.numeroConta = numeroConta;
		this.saldoInicioMes = saldoInicioMes;
		this.totalItensCobrados = totalItensCobrados;
		this.totalCreditos = totalCreditos;
		this.limiteCredito = limiteCredito;
	}
	
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getSaldoInicioMes() {
		return saldoInicioMes;
	}
	public void setSaldoInicioMes(int saldoInicioMes) {
		this.saldoInicioMes = saldoInicioMes;
	}
	public int getTotalItensCobrados() {
		return totalItensCobrados;
	}
	public void setTotalItensCobrados(int totalItensCobrados) {
		this.totalItensCobrados = totalItensCobrados;
	}
	public int getTotalCreditos() {
		return totalCreditos;
	}
	public void setTotalCreditos(int totalCreditos) {
		this.totalCreditos = totalCreditos;
	}
	public int getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(int limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	
	public void verificaLimiteCredito() {
		int resultado = ((saldoInicioMes + totalCreditos) - totalItensCobrados); 
		
		int resultado2 = resultado + 250;
		
		System.out.printf("%n%nSaldo Final da Conta: %d%n%n", resultado);
		
		System.out.printf("%n%nValor ultrapassado Além do Limite:  %d%n%n", resultado2);
		
		if(resultado < 0 ) {
			resultado = resultado * - 1;	
			
			if(resultado > limiteCredito) {
				System.out.printf("%nLimite De crédito Excedido!");
			}
		} else {
			System.out.printf("%nLimite de crédito Não Excedido");
		}
		
		
	}
	
	
	

}
