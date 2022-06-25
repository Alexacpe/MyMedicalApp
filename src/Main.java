import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //Llamar al menu
        //showMenu();
        //Tomando los parametros que se le asigó al metodo constructor
        Doctor myDoctor = new Doctor("Mariana","Pediatra");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
    }
}
