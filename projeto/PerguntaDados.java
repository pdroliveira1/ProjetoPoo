//Pedro Augusto de Lima Oliveira 2417847

public class PerguntaDados{

	Leitura l = new Leitura();
	int i;


	public int perguntaProd()throws EntradaExeption{
		System.out.println("===============================================");
		System.out.println("ESCOLHA QUAL PRODUTO DESEJA COMPRAR");
		System.out.println("1- MONITOR");
		System.out.println("2- FONE");
		System.out.println("3- TECLADO");
		System.out.println("===============================================");
		i = Integer.parseInt(l.entDados(": "));
		if (i > 0 && i < 4) {
			return i;
		}
		else{
			throw new EntradaExeption();
		}
	}

//====================metodos MONIT===========================

	public int perguntaRes()throws EntradaExeption{
		System.out.println("===============================================");
		System.out.println("ESCOLHA QUAL A RESOLUCAO");
		System.out.println("1- FULLHD");
		System.out.println("2- HD");
		System.out.println("===============================================");
		i = Integer.parseInt(l.entDados(": "));
		if (i > 0 && i < 3) {
			return i;
		}
		else{
			throw new EntradaExeption();
		}
	}
	

	public int perguntaTam()throws EntradaExeption{
		System.out.println("===============================================");
		System.out.println("ESCOLHA QUAL O TAMANHO DA TELA");
		System.out.println("1- 30POL");
		System.out.println("2- 20POL");
		System.out.println("===============================================");
		i = Integer.parseInt(l.entDados(": "));
		if (i > 0 && i < 3) {
			return i;
		}
		else{
			throw new EntradaExeption();
		}
	}

	public int perguntaMar()throws EntradaExeption{
		System.out.println("===============================================");
		System.out.println("ESCOLHA QUAL A MARCA");
		System.out.println("1- SANSUNG");
		System.out.println("2- LG");
		System.out.println("===============================================");
		i = Integer.parseInt(l.entDados(": "));
		if (i > 0 && i < 3) {
			return i;
		}
		else{
			throw new EntradaExeption();
		}
	}

	public int perguntaModS()throws EntradaExeption{
		System.out.println("===============================================");
		System.out.println("ESCOLHA QUAL O MODELO");
		System.out.println("1- SS2007");
		System.out.println("2- SS324");
		System.out.println("===============================================");
		i = Integer.parseInt(l.entDados(": "));
		if (i > 0 && i < 3) {
			return i;
		}
		else{
			throw new EntradaExeption();
		}
	}

	public int perguntaModL()throws EntradaExeption{
		System.out.println("===============================================");
		System.out.println("ESCOLHA QUAL O MODELO");
		System.out.println("1- LG2007");
		System.out.println("2- LG324");
		System.out.println("===============================================");
		i = Integer.parseInt(l.entDados(": "));
		if (i > 0 && i < 3) {
			return i;
		}
		else{
			throw new EntradaExeption();
		}
	}

//====================metodos FONES===========================

	public int perguntaFor()throws EntradaExeption{
		System.out.println("===============================================");
		System.out.println("ESCOLHA QUAL O FORMATO DO FONE");
		System.out.println("1- INTRAOURICULAR");
		System.out.println("2- EXTRAOURICULAR");
		System.out.println("===============================================");
		i = Integer.parseInt(l.entDados(": "));
		if (i > 0 && i < 3) {
			return i;
		}
		else{
			throw new EntradaExeption();
		}
	}

	public int perguntaPsMicro()throws EntradaExeption{
		System.out.println("===============================================");
		System.out.println("ESCOLHA SE POSSUI MICROFONE");
		System.out.println("1- SIM");
		System.out.println("2- NAO");
		System.out.println("===============================================");
		i = Integer.parseInt(l.entDados(": "));
		if (i > 0 && i < 3) {
			return i;
		}
		else{
			throw new EntradaExeption();
		}
	}

	public int perguntaMarFone()throws EntradaExeption{
		System.out.println("===============================================");
		System.out.println("ESCOLHA QUAL A MARCA");
		System.out.println("1- SANSUNG");
		System.out.println("2- LG");
		System.out.println("===============================================");
		i = Integer.parseInt(l.entDados(": "));
		if (i > 0 && i < 3) {
			return i;
		}
		else{
			throw new EntradaExeption();
		}
	}

	public int perguntaModFs()throws EntradaExeption{
		System.out.println("===============================================");
		System.out.println("ESCOLHA QUAL O MODELO");
		System.out.println("1- SS5007");
		System.out.println("2- SS570");
		System.out.println("===============================================");
		i = Integer.parseInt(l.entDados(": "));
		if (i > 0 && i < 3) {
			return i;
		}
		else{
			throw new EntradaExeption();
		}
	}

	public int perguntaModFl()throws EntradaExeption{
		System.out.println("===============================================");
		System.out.println("ESCOLHA QUAL O MODELO");
		System.out.println("1- LG5007");
		System.out.println("2- LG570");
		System.out.println("===============================================");
		i = Integer.parseInt(l.entDados(": "));
		if (i > 0 && i < 3) {
			return i;
		}
		else{
			throw new EntradaExeption();
		}
	}

//====================metodos TECLA===========================

	public int perguntaTempRes()throws EntradaExeption{
		System.out.println("===============================================");
		System.out.println("ESCOLHA QUAL O TEMPO DE RESPOSTA DO TECLADO");
		System.out.println("1- 0.5");
		System.out.println("2- 0.7");
		System.out.println("===============================================");
		i = Integer.parseInt(l.entDados(": "));

		if (i > 0 && i < 3) {
			return i;
		}
		else{
			throw new EntradaExeption();
		}
		
	}

	public int perguntaNumTecla()throws EntradaExeption{
		System.out.println("===============================================");
		System.out.println("ESCOLHA QUAL O NUMERO DE TECLAS");
		System.out.println("1- 60");
		System.out.println("2- 80");
		System.out.println("===============================================");
		i = Integer.parseInt(l.entDados(": "));
		if (i > 0 && i < 3) {
			return i;
		}
		else{
			throw new EntradaExeption();
		}
	}

	public int perguntaMarTecla()throws EntradaExeption{
		System.out.println("===============================================");
		System.out.println("ESCOLHA QUAL A MARCA");
		System.out.println("1- LOGITEC");
		System.out.println("2- RAZER");
		System.out.println("===============================================");
		i = Integer.parseInt(l.entDados(": "));
		if (i > 0 && i < 3) {
			return i;
		}
		else{
			throw new EntradaExeption();
		}
	}

	public int perguntaModLo()throws EntradaExeption{
		System.out.println("===============================================");
		System.out.println("ESCOLHA QUAL O MODELO");
		System.out.println("1- L2030");
		System.out.println("2- L205");
		System.out.println("===============================================");
		i = Integer.parseInt(l.entDados(": "));
		if (i > 0 && i < 3) {
			return i;
		}
		else{
			throw new EntradaExeption();
		}
	}

	public int perguntaModR()throws EntradaExeption{
		System.out.println("===============================================");
		System.out.println("ESCOLHA QUAL O MODELO");
		System.out.println("1- R2030");
		System.out.println("2- R205");
		System.out.println("===============================================");
		i = Integer.parseInt(l.entDados(": "));
		if (i > 0 && i < 3) {
			return i;
		}
		else{
			throw new EntradaExeption();
		}
	}	




}