
public class Main {

	public static void main(String[] args) {
		FormatacaoController formatacaoController = new FormatacaoController();
		String texto = "Testeeeee";
		
		CaixaAlta caixaAlta = new CaixaAlta();
		CaixaBaixa caixaBaixa = new CaixaBaixa();
		Negrito negrito = new Negrito();
		Italico italico = new Italico();
		
		String teste1 = formatacaoController.formataTexto(texto, caixaAlta);
		String teste2 = formatacaoController.formataTexto(texto, caixaBaixa);
		String teste3 = formatacaoController.formataTexto(texto, negrito);
		String teste4 = formatacaoController.formataTexto(texto, italico);
		
		System.out.println(teste1);
		System.out.println(teste2);
		System.out.println(teste3);
		System.out.println(teste4);
	}

}
