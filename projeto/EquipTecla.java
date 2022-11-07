//Pedro Augusto de Lima Oliveira 2417847


public class EquipTecla extends ProdEletro implements MostraProd{

	private	double tempResp;
	private	int numTecla;
	PerguntaDados p = new PerguntaDados();
	int i;
	boolean cont = true;

	public EquipTecla(int preco, String codProd, String marca, String modelo,int numTecla, double tempResp) {
		this.setPreco(preco);
		this.setCodProd(codProd);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setTempResp(tempResp);
		this.setNumTecla(numTecla);
	}

	public EquipTecla() {}

//====================metodos gets===========================

	public double getTempResp(){
		return tempResp;
	}

	public int getNumTecla(){
		return numTecla;
	}

//====================metodos sets===========================

	public void setTempResp(double tempResp){
		this.tempResp = tempResp;
	}

	public void setNumTecla(int numTecla){
		this.numTecla = numTecla;
	}

//===========================================================

	public void mostraProd(){
		System.out.println("valor do produto: " + getPreco());
		System.out.println("o codigo da compra é: "+ getCodProd());
		System.out.println("marca: "+ getMarca());
		System.out.println("modelo: "+ getModelo());
		System.out.println("tempo de resposta: "+ getTempResp());
		System.out.println("numero de teclas: "+ getNumTecla());
	
	}


//=====================METODO POLIMORFICO: SOBRESCRITA======================================


	public void criarProd(){
		
		this.infTempRes();
	
	}

//===========================================================

	public void infTempRes(){

		do{
			try{
				i = p.perguntaTempRes();

				if (i==1) {
					this.setTempResp(0.5);
					this.setPreco(this.getPreco() + 100);
				}
				else{
					this.setTempResp(0.7);
					this.setPreco(this.getPreco() + 40);
				}

				cont = false;
				this.infNumTecla();
			}
			catch(EntradaExeption temexp ){
				temexp.impTemInv();
				cont = true;
			}
		}while(cont);
		

	}

//===========================================================

	public void infNumTecla(){

		
		do{
			try{
				i = p.perguntaNumTecla();

				if (i==1) {
					this.setNumTecla(60);
					this.setPreco(this.getPreco() + 80);
				}
				else{
					this.setNumTecla(80);
					this.setPreco(this.getPreco() + 100);
				}

				this.infMarTecla();
				cont = false;
			}
			catch(EntradaExeption numexp ){
				numexp.impNumInv();
				cont = true;
			}
		}while(cont);
		

	}

//===========================================================

	public void infMarTecla(){

		
		do{
			try{
				i = p.perguntaMarTecla();

				if (i==1) {
					this.setMarca("LOGITEC");
					this.setPreco(this.getPreco() + 100);
				}
				else{
					this.setMarca("RAZER");
					this.setPreco(this.getPreco() + 200);
				}

				this.infMod(i);
				cont = false;
			}
			catch(EntradaExeption marexp ){
				marexp.impMarInv();
				cont = true;
			}

		}while(cont);
		
	}

//===========================================================

	public void infMod(int n){

		
		do{
			try{
				if (n == 1) {

					i = p.perguntaModLo();

					if (i==1) {
						this.setModelo("L2030");
						this.setPreco(this.getPreco() + 50);
					}
					else{
						this.setModelo("L205");
						this.setPreco(this.getPreco() + 30);
					}
			
				}
				else{

					i = p.perguntaModR();

					if (i==1) {
						this.setModelo("R2030");
						this.setPreco(this.getPreco() + 75);
					}

					else{
						this.setModelo("R205");
						this.setPreco(this.getPreco() + 45);
					}

				}
				cont = false;
			}
			catch(EntradaExeption modexp ){
				modexp.impModInv();
				cont = true;
			}
		}while(cont);
		

	}
	

}