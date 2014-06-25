
public class CalculoAlmacen {
	Llanta[] llantasAlmacen1=new Llanta[10];
	Llanta[] llantasAlmacen2=new Llanta[5];
	
	public CalculoAlmacen() {
		for(int i=0;i<llantasAlmacen1.length;i++)
		{
			llantasAlmacen1[i]=new Llanta();
		}
		for(int i=0;i<llantasAlmacen2.length;i++)
		{
			llantasAlmacen2[i]=new Llanta();
		}
	}
	
	public int calcularTotalAlmacen1(){
		int total=0;
		for(int i=0;i<llantasAlmacen2.length;i++)
		{
			total=llantasAlmacen2[i].numeroLlantas+total;
		}
		return total;
	}
	
	public int calcularTotalAlmacen2(){
		int total=0;
		for(int i=0;i<llantasAlmacen2.length;i++)
		{
			total=llantasAlmacen2[i].numeroLlantas+total;
		}
		return total;
	}
	
	public void anyadirLlantaAlmacen1(int posicion){
		llantasAlmacen1[posicion].addLlanta();
	}
	
	public void anyadirLlantaAlmacen2(int posicion){
		llantasAlmacen1[posicion].addLlanta();
	}
	
}
