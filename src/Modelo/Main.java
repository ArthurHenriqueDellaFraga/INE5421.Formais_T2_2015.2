package Modelo;

import Controle.GerenteDaAplicacao;

public class Main {
	
	public static void main(String[] args){		
		GerenteDaAplicacao aplicacao = GerenteDaAplicacao.invocarInstancia();
		aplicacao.iniciar();
		
		
	}
}
