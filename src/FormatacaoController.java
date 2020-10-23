
public class FormatacaoController {
	public FormatacaoController() {}
	
	public String formataTexto(String texto, Formatacao formatacao) {
		return formatacao.formata(texto);
	}

}
