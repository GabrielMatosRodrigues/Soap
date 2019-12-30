package br.com.fiap.bo;

import br.com.fiap.to.ContaTO;

public class BancoBO {
	
	public ContaTO consultaConta(int codConta) {
		if(codConta==401) {
			return new ContaTO("Arnaldo da Silva Sauro", 56.79);
		}else if(codConta==402) {
			return new ContaTO("Beatriz Fonseca", 14500.67);
		}else if(codConta==403) {
			return new ContaTO("Pedro Diniz Maria", 6.66);
		}else if(codConta==404) {
			return new ContaTO("Elvis Presley",  25000.00);
		} else {
			return new ContaTO("Conta não encontrada.",  0);
		}
	}
}
