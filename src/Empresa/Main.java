package Empresa;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
class Region{

	private String localidad;
	public Region(String localidad){
	this.localidad = localidad;

	}
	public String getLocalidad() {
		return localidad;
	}
	@Override
	public String toString() {
		return "Region [localidad=" + localidad + "]";
	}
	
	
}


