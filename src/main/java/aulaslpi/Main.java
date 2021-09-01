package aulaslpi;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


import aulaslpi.designpattern.builder.Operario;
import aulaslpi.designpattern.factory.Bike;
import aulaslpi.designpattern.factory.Carro;
import aulaslpi.designpattern.factory.Moto;
import aulaslpi.designpattern.factory.TiposDeVeiculo;
import aulaslpi.designpattern.factory.Veiculo;
import lombok.extern.slf4j.Slf4j;


public class Main {	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha um tipo");
		String tipo = scan.next();
		Veiculo meuVeiculo = factory(tipo.toUpperCase());
		meuVeiculo.buzina();
		
		Operario operario = testaBuilder("31323", 14);
		System.out.println(operario);
		
	}
	
	public static Veiculo factory(String tipo) {
		if(TiposDeVeiculo.BIKE.name().equals(tipo)) {
			return new Bike();
		} else if( TiposDeVeiculo.MOTO.name().equals(tipo)) {
			return new Moto();
		} else {
			return new Carro();
		}		
	}
	
	public static Operario testaBuilder(String cpf, int id) {
		return Operario.builder()
				.cpf(cpf)
				.id(id)
				.build();
	}	
	

}


