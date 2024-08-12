package view;

import controller.NegativosController;

public class Principal {

	public static void main(String[] args) {

		NegativosController negativosController = new NegativosController();
	
		int[] vet = {5, -3, 12, 2, -6, 10};
		int resultado = negativosController.Negativos(vet, vet.length);
		
		System.out.println("O total de elementos negativos no vetor é de " + resultado);
	}

}
