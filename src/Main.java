import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //Llamar al menu
        //showMenu();
        //Objeto de tipo doctor Tomando los parametros que se le asig� al metodo constructor
        Doctor myDoctor = new Doctor("Mariana","Pediatra");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        //objeto de tipo paciente
        Patient patient = new Patient("Alex", "alex@mail.com");
        //ya no se puede acceder a las variables desde ac� porque estan private en la clase (encapsulamiento)
        //System.out.println(patient.name);
        //System.out.println(patient.email);
        //asignar otros datos de la clase Patient que no est�n como parametros en el objeto
        //patient.weight = 80 ;
        //patient.heidht = 1.74;
         }

}
