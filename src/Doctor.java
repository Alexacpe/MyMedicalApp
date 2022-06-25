//Clase Doctor
public class Doctor {
    //Atributos
    static int id = 0; //autoincrementable
    String name;
    String speciality;


    //Constructor
    public Doctor(){ //Metodo constructor por defecto
        System.out.println("Construyento un metodo Doctor");
    }
    //Constructor con parametro-> recibe como parametro un nombre de doctor y la especialidad
    Doctor(String name, String speciality){
        id++; //comportamiento del metodo para generar id autoincrementable
        System.out.println("El nombre del doctor es: "+ name);
        //this hace referencia a los elementos que componen esa clase y ese elemento toma el parametro que se recibe en el constructor
        this.name = name;
        this.speciality = speciality;
     }

    //Comportamientos = Metodos

    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println();
    }
}
