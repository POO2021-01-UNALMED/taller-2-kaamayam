
package test;

public class Motor {
	//atributos
	int numeroCilindros;
	String tipo;
	int registro;
	//metodos
	void cambiarRegistro(int r) {
		registro = r;
	}
	
    void cambiarRegistro(int reg){
        this.registro = reg;
    }
	
	void asignarTipo(String tipoM){
        if (tipoM == "electrico"){
            tipo = "electrico"}
        else if  (tipoM == "gasolina") {
        	tipo = "gasolina"}
        else(){
        	System.out.println("Este tipo no es elegible")
        }
     }
  }
        