package interfaces;

public class Interfaces implements InterfaceA {

    public static void main(String[] args) {
// una interfaz es una coleccion de metodos abstractos
// coleccion de constante
// especifica lo que se debe hacer
    }
// herencia de interfaces
    @Override
    public void mostrarMensaje() {
        System.out.println("Hola!");  
        // los metodos heredados de interfaceB se implementaran hasta que
        // una clase implemente la interfaceA
    }
}