
public class Llanta {
	int numeroLlantas=0;
	String marca="";
	String modelo="";
	String dimensiones="";
	public Llanta() {
		numeroLlantas=0;
		marca="";
		modelo="";
		dimensiones="";
	}
	
	public void addLlanta(){
		numeroLlantas++;
	}
	
	public void addLlantas(int num){
		numeroLlantas=numeroLlantas+num;
	}
	
	public void subsLlanta(){
		numeroLlantas--;
	}
	
	public void subsLlantas(int num){
		numeroLlantas=numeroLlantas-num;
	}

}
