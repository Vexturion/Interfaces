package interfaces;

public class PastorAleman implements Canino, Mascota { // para utilizar una interfaz utilizamos la palabra reservada implements
    // a diferencia de las clases que solo pueden heredar de una clase, una clase podra implementar la n cantidad de 
    //  interfaces que necesite, para hacerlo pondremos implements y las clases que seran implementadas, separas por una coma

    @Override
    public void aullar() {
        System.out.println("El pastor aleman aulla");
    } 
// al igual que en clases abstractas, nuestras clases deberan implementar todos los metodos abstractos de las interfaces
    
}
