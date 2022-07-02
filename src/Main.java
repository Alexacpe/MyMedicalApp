import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //Llamar al menu
        //showMenu();
        //Objeto de tipo doctor Tomando los parametros que se le asigó al metodo constructor
        Doctor myDoctor = new Doctor("Mariana","mariana@mail.com");
        //System.out.println(myDoctor.name);
        //System.out.println(myDoctor.speciality);

        //Añadir nuevas citas a Mariana
        myDoctor.addAvailableAppointment(new Date(),"5pm");
        myDoctor.addAvailableAppointment(new Date(),"7pm");
        myDoctor.addAvailableAppointment(new Date(),"10am");
        /*
        //imprimir las citas llamando la clase anidada estatica

        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate()+" "+availableAppointment.getTime());
        }
        
        //imprimir lista con las citas creadas
        System.out.println(myDoctor.getAvailableAppointments());


        //objeto de tipo paciente
        Patient patient = new Patient("Alex", "alex@mail.com");
        //ya no se puede acceder a las variables desde acá porque estan private en la clase (encapsulamiento)
        //System.out.println(patient.name);
        //System.out.println(patient.email);
        //asignar otros datos de la clase Patient que no están como parametros en el objeto
        //patient.weight = 80 ;
        //patient.heidht = 1.74;*/

        Patient patient =new Patient("Alex","alex@mail.com");
        //imprimo los datos que me trae el metodo toString de User mas los del metodo toString de Patient
        System.out.println(patient);
        System.out.println(myDoctor);
         }

}
