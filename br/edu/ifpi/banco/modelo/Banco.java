package br.edu.ifpi.banco.modelo;


public class Banco {
	
	private Conta contas[];
	private int qtd;

	
	public Banco() {
		this.contas = new Conta[10];
		for (int i = 0; i < contas.length; i++){
			this.contas[i] = new Conta();
		}
	}


	public void adicionaConta(Conta c){
		this.contas[qtd++] = c;
	}
	
	public Conta pegaConta(int x){
		return this.contas[x];
	}
	
	public int pegaTotalDeContas(){
		return qtd-1;
	}


	public Conta[] getContas() {
		return contas;
	}

	
	
	
}
