package interfaces;

public interface InterfaceB {

public void mostrarMensaje();
    // nuestro metodo sera heredado a la interfaceA

// metodo default
// este tipo de metodos no son abstractos y poseen un comportamiento
// acceso default void/tipo de valor nombre(parametros){
// sentencia a ejecutar}
// las instancias podran hacer uso de los metodos default siempre y cuando sean publicas
public default void saluda(){
    System.out.println("Hola mundo desde una interface");
}



}
