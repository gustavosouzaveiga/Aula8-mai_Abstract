package view;

//import model.Pessoa;
import model.PessoaFisica;
import model.PessoaJuridica;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pessoa ps = new Pessoa();
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		//ps.setEnd("Av. Águia de Haia");
		pf.setNome("Gustavo");
		pj.setRazaoSocial("ETEC ZL");
		
		//System.out.println(ps.getEnd());
		System.out.println(pf.getNome());
		System.out.println(pj.getRazaoSocial());
		pf.falar();
		pj.falar();
	}

}
