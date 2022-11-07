//Pedro Augusto de Lima Oliveira 2417847


public class Principal{
	
	public static void main(String arg[]){

		PerguntaDados p = new PerguntaDados();
		int i;
		
			try{

				i = p.perguntaProd();

				switch(i){
				case 1:
					
					EquipVideo edv1 = new EquipVideo();
					edv1.criarProd();
					edv1.mostraProd();

					break;

				case 2:

					EquipAud eda1 = new EquipAud();
					eda1.criarProd();
					eda1.mostraProd();

					break;

				case 3:
					
					EquipTecla edT3 = new EquipTecla();
					edT3.criarProd();
					edT3.mostraProd();

					break;

				default:
					System.out.println("escolha uma opcao valida "); 
				}

			}
			catch(EntradaExeption prodexp){
				prodexp.impProdInv();
			}
	}
}


 