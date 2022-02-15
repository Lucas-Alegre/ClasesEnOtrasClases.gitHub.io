package Empresa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Usuario {

	private String apellido;
	private String nombre;
	
	
	public Usuario(String apellido, String nombre) {
		this.apellido = apellido;
        this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	public String getNombre() {
		return nombre;
	}

	
	@Override
	public String toString() {
		return "Usuario( " + getApellido() + ", " + getNombre() + " )";
	}
	

}