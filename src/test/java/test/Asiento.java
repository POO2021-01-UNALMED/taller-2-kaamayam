
package test;

public class Asiento {
	//Atributos
	String color;
	int precio;
	int registro;
	//metodos
	void cambioColor(String cambioColor) {

		if (cambioColor == "rojo"){
			color = "rojo"
		}
		else if (cambioColor == "verde") {
			color = "verde";}
		
		else if (cambioColor == "amarillo") {
			color = "amarillo";}
		
		else if (cambioColor == "negro") {
			color = "negro";  }
			
	    else if (cambioColor == "blanco") {
		    color = "blanco";}
	    else(){
	    	System.out.println("Este color no es elegible")
	    }
	    
	}
}
