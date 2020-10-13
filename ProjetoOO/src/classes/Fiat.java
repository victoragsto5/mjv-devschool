package classes;
public class Fiat extends Veiculo{

	@Override
	public String marca() {
		String retorno = super.marca(); 
		
		retorno += "\r\n Uno"; 
		
		return retorno;
	} 
	
	public String marca(String marcaPersonalizada) {
		return marcaPersonalizada + " 2.0";
	}

	@Override
	public String rodas() {
		return "4 rodas";
	}
	
}
