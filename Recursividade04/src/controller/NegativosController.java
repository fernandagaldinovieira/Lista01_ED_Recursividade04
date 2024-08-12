package controller;

public class NegativosController {

	public NegativosController() {
		super();
	}

	public int Negativos(int [] vet, int i) {
		//Condição de parada: se i for 0, todos os valores foram verificados
		if (i == 0) {
			return 0;
		}
		
		// Se o valor for negativo, soma-se 1 ao resultado, senão, analisa-se o próximo elemento.
		if (vet[i - 1] < 0) {
			return 1 + Negativos(vet, i - 1);
		} else {
			return Negativos(vet, i - 1);
		}
	}
}
