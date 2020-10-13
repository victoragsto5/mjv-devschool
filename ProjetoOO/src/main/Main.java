package main;
import java.util.ArrayList;
import java.util.List;

import classes.ClienteDAO;
import classes.ClienteOracleImpl;
import classes.Empresa;
import classes.Fiat;

public class Main {

	public static void main(String[] args) {
		Fiat carro = new Fiat();
		
		System.out.println(carro.marca());
		System.out.println(carro.marca("Brava")); 
		
		//cliente.nomeCliente("Victor Augusto");
		//cliente.cadastrarCliente("Victor Augusto", "Vitão");
		//cliente.excluirCliente("Victor Augusto"); 
		
		//Empresa emp = new Empresa();
		//emp.setNome("Empresa 1");
		//emp.setNumero(90000000);
		
		//Empresa emp2 = new Empresa();
		//emp2.setNome("Empresa 2");
		//emp.setNumero(90000000); 
		
		int count = 1;
		
		String comparacao = count == 2 ? "verdadeiro" : "false";
		
		//ClienteDAO dao = new ClienteOracleImpl(); 
		
		//dao.incluir(emp);
		
		//if(dao instanceof ClienteOracleImpl) {
			//System.out.println("OK");
			//ClienteOracleImpl oracle = (ClienteOracleImpl) dao;
		//	emp.setNumero(oracle.recuperarIdSequence());
		//}
		
		switch(count) {
		case 1: 
			comparacao = "verdadeiro";
			break;
			
		case 2:
			comparacao = "verdadeiro";
			break;
			
		default: 
			
		} 
		
		List<Empresa> empresas = new ArrayList<>();
		
		Empresa emp1 = new Empresa();
		Empresa emp2 = new Empresa();
		Empresa emp3 = new Empresa();
		Empresa emp4 = new Empresa();
		Empresa emp5 = new Empresa(); 
		
		empresas.add(emp1);
		empresas.add(emp2);
		empresas.add(emp3);
		empresas.add(emp4);
		empresas.add(emp5); 
		
		while(!empresas.isEmpty()) {
			System.out.println(empresas.get(0).getNome());
		}
	}
}
