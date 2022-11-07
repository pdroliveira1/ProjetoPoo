//Pedro Augusto de Lima Oliveira 2417847

public class EntradaExeption extends Exception{
	
	public void impProdInv(){
		System.out.println("erro ao escolher o produto, opcao inecistente");
	}
	public void impResInv(){
		System.out.println("erro ao definir a resolucao, opcao inecistente");
	}
	public void impTamInv(){
		System.out.println("erro ao definir o tamanho da tela, opcao inecistente");
	}
	public void impForInv(){
		System.out.println("erro ao definir o formato do fone, opcao inecistente");
	}
	public void impPsmicroInv(){
		System.out.println("erro ao definir se possui microfone, opcao inecistente");
	}
	public void impTemInv(){
		System.out.println("erro ao definir o tempo de resposta, opcao inecistente");
	}
	public void impNumInv(){
		System.out.println("erro ao definir o numero de teclas, opcao inecistente");
	}
	public void impMarInv(){
		System.out.println("erro ao definir a marca, opcao inecistente");
	}
	public void impModInv(){
		System.out.println("erro ao definir o modelo, opcao inecistente");
	}
}