//Pedro Augusto de Lima Oliveira 2417847


public class EquipAud extends ProdEletro implements MostraProd{

	private	String formato;
	private	boolean psMicro;
	PerguntaDados p = new PerguntaDados();
	int i;
	boolean cont = true;


	public EquipAud(int preco, String codProd, String marca, String modelo, String formato) {
		this.setPreco(preco);
		this.setCodProd(codProd);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setFormato(formato);
	}

	public EquipAud() {

	}

//====================metodos gets===========================


	public String getFormato(){
		return formato;
	}

	public boolean getPsMicro(){
		return psMicro;
	}

//====================metodos sets===========================


	public void setFormato(String formato){
		this.formato = formato;
	}

	public void setPsMicro(boolean psMicro){
		this.psMicro = psMicro;
	}


//===========================================================

	public void mostraProd(){
		System.out.println("========================DADOS DA COMPRA========================");
		System.out.println("VALO: "+ this.getPreco());
		System.out.println("CODIGO DA COMPRA: "+ this.getCodProd());
		System.out.println("MARCA: "+ this.getMarca());
		System.out.println("MODELO: "+ this.getModelo());
		System.out.println("FORMATO: "+ this.getFormato());
		if (this.getPsMicro()) {
			System.out.println("POSSUI MICROFONE");	
		}
		else{
			System.out.println("NAO POSSUI MICROFONE");	
		}
		System.out.println("================================================");

	}

//====================METODO POLIMORFICO: SOBRESCRITA=======================================


	public void criarProd(){
		
		this.infFor();
	
	}

//===========================================================

	public void infFor(){

		
		do{
			try{
				i = p.perguntaFor();

				if (i==1) {
					this.setFormato("INTRAOURICULAR");
					this.setPreco(this.getPreco() + 500);
				}
				else{
					this.setFormato("EXTRAOURICULAR");
					this.setPreco(this.getPreco() + 350);
				}

				this.infPsMicro();
				cont = false;
			}
			catch(EntradaExeption forexp ){
				forexp.impForInv();
			}
		}while(cont);
	
		

	}

//===========================================================

	public void infPsMicro(){

		
		do{
			try{
				i = p.perguntaPsMicro();

				if (i==1) {
					this.setPsMicro(true);
					this.setPreco(this.getPreco() + 150);
				}
				else{
					this.setPsMicro(false);
					this.setPreco(this.getPreco() + 75);
				}

				this.infMarFone();
				cont = false;
			}
			catch(EntradaExeption psmicroexp ){
				psmicroexp.impPsmicroInv();
			}
		}while(cont);
		

	}

//===========================================================

	public void infMarFone(){

		
		do{
			try{
				i = p.perguntaMarFone();

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

					i = p.perguntaModFs();

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

					i = p.perguntaModFl();

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