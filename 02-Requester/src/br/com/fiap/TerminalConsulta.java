package br.com.fiap;

import java.rmi.RemoteException;
import java.util.Scanner;

import org.apache.axis2.AxisFault;

import br.com.fiap.bo.BancoBOStub;
import br.com.fiap.bo.BancoBOStub.ConsultaConta;
import br.com.fiap.bo.BancoBOStub.ConsultaContaResponse;

public class TerminalConsulta {

	public static void main(String[] args) throws RemoteException {
		
		BancoBOStub stub = new BancoBOStub();
		
		ConsultaConta consulta = new ConsultaConta();
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Digite o código: ");
		int codConta = e.nextInt();
		
		consulta.setCodConta(codConta);
		
		ConsultaContaResponse response = stub.consultaConta(consulta);
		
		String nome = response.get_return().getNome();
		double saldo = response.get_return().getSaldo();
		
		System.out.println("Nome: " + nome);
		System.out.println("Saldo: " + saldo);
		
	}

}
