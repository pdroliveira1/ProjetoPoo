//Pedro Augusto de Lima Oliveira 2417847


public class EquipVideo extends ProdEletro implements MostraProd{

	private	String resolucao;
	private	int tamanhoTela;
	PerguntaDados p = new PerguntaDados();
	int i;
	boolean cont = true;

	public EquipVideo(int preco, String codProd, String marca, String modelo, String resolucao, int tamanhoTela) {
		this.setPreco(preco);
		this.setCodProd(codProd);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setResolucao(resolucao);
		this.setTamanhoTela(tamanhoTela);
	}

	public EquipVideo() {}

//====================metodos gets===========================

	public String getResolucao(){
		return resolucao;
	}

	public int getTamanhoTela(){
		return tamanhoTela;
	}

//====================metodos sets===========================

	public void setResolucao(String resolucao){
		this.resolucao = resolucao;
	}

	public void setTamanhoTela(int tamanhoTela){
		this.tamanhoTela = tamanhoTela;
	}

//===========================================================

	public void mostraProd(){
		System.out.println("valor do produto: " + getPreco());
		System.out.println("o codigo da compra é: "+ getCodProd());
		System.out.println("marca: "+ getMarca());
		System.out.println("modelo: "+ getModelo());
		System.out.println("resolucao: "+ getResolucao());
		System.out.println("tamanho da tela em polegadas: "+ getTamanhoTela());
	
	}



//=====================METODO POLIMORFICO: SOBRESCRITA======================================


	public void criarProd(){
		
		this.infRes();
	
	}

//===========================================================

	public void infRes(){

		do{
			try{
				i = p.perguntaRes();

				if (i==1) {
					this.setResolucao("FULLHD");
					this.setPreco(this.getPreco() + 500);
				}
				else{
					this.setResolucao("HD");
					this.setPreco(this.getPreco() + 350);
				}

				this.infTam();
				cont = false;
			}
			catch(EntradaExeption resexp ){
				resexp.impResInv();
			}
		}while(cont);
			
	}

//===========================================================

	public void infTam(){

		do{
			try{
				i = p.perguntaTam();

				if (i==1) {
					this.setTamanhoTela(30);
					this.setPreco(this.getPreco() + 150);
				}
				else{
					this.setTamanhoTela(20);
					this.setPreco(this.getPreco() + 75);
				}

				this.infMar();
				cont = false;
			}
			catch(EntradaExeption tamexp ){
				tamexp.impTamInv();
			}
		}while(cont);
			
	}

	

//===========================================================

	public void infMar(){


		do{
			try{

				i = p.perguntaMar();

				if (i==1) {
					this.setMarca("SANSUNG");
					this.setPreco(this.getPreco() + 200);
				}
				else{
					this.setMarca("LG");
					this.setPreco(this.getPreco() + 90);
				}

				this.infMod(i);
				cont = false;

			}
			catch(EntradaExeption marexp ){
				marexp.impMarInv();
			}

		}while(cont);
		
	}

//===========================================================

	public void infMod(int n){

		
		do{
			
			try{
				if (n == 1) {

					i = p.perguntaModS();

					if (i==1) {
						this.setModelo("SS2007");
						this.setPreco(this.getPreco() + 500);
					}
					else{
						this.setModelo("SS324");
						this.setPreco(this.getPreco() + 200);
					}
			
				}
				else{

					i = p.perguntaModL();

					if (i==1) {
						this.setModelo("LG2007");
						this.setPreco(this.getPreco() + 350);
					}

					else{
						this.setModelo("LG324");
						this.setPreco(this.getPreco() + 100);
					}

				}
				cont = false;
			}
			catch(EntradaExeption modexp ){
				modexp.impModInv();
			}

		}while(cont);
		
	}

}