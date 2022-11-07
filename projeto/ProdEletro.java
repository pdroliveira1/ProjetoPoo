//Pedro Augusto de Lima Oliveira 2417847


public abstract class ProdEletro{
	private int preco;
	private	String codProd;			
	private	String marca;
	private	String modelo;
/*
	public ProdEletro(int preco, String codProd, String marca, String modelo){
		this.preco = preco;
		this.codProd = codProd;
		this.marca = marca;
		this.modelo = modelo;
	}
*/
	public int getPreco(){
		return preco;
	}

	public String getCodProd(){
		return codProd;
	}

	public String getMarca(){
		return marca;
	}

	public String getModelo(){
		return modelo;
	}

	public void setPreco(int preco){
		this.preco = preco;
	}

	public void setCodProd(String codProd){
		this.codProd = codProd;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public abstract void criarProd();

}