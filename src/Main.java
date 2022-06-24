import ui.UIMenu.*;

import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {
        //instanciar el objeto
        Doctor myDoctor = new Doctor();
        //asignar nombre al doctor
         myDoctor.name = "Alexander Acevedo";
        //llamar al metodo
        myDoctor.showName();//metodo que muestra nombre
        myDoctor.showId();//metodo que muestra ID
        System.out.println(Doctor.id); //imprimir id


        //incrementa numero de id con cada objeto Tipo Doctor que se crea
        Doctor myDoctorCarla = new Doctor(); //Creando objeto p'ara doctor carla
        myDoctor.showId();
        System.out.println(Doctor.id);

        //Llamar al menu
        showMenu();
    }
}
