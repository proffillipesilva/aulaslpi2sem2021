package aulaslpi.designpattern.builder;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder   // Já implementa o Builder
@AllArgsConstructor
public class Operario {
	private int id;
	private String cpf;
	private String nome;
	private String endereco;
	private int idade;
	private double salario;
	private String cpfConjuge;
	private List<String> dependentes;
	private String cargo;
	private int setor;
	private int idResponsavel;
	private String funcao;
	

}
