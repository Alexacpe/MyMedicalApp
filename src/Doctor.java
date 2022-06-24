//Clase Doctor
public class Doctor {
    //Atributos
    static int id = 0; //autoincrementable
    String name;
    String speciality;


    //Constructor
    Doctor(){
        //System.out.println("Construyento un metodo Doctor");
    }
    //Constructor con parametro-> recibe como parametro un nombre de doctor
   // Doctor(String name){
        //System.out.println("El nombre del doctor es: "+ name);
   // }

    //Comportamientos = Metodos

    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println(id++);
    }
}
