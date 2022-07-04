import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

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

        for (model.Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate()+" "+availableAppointment.getTime());
        }
        
        //imprimir lista con las citas creadas
        System.out.println(myDoctor.getAvailableAppointments());


        //objeto de tipo paciente
        model.Patient patient = new model.Patient("Alex", "alex@mail.com");
        //ya no se puede acceder a las variables desde acá porque estan private en la clase (encapsulamiento)
        //System.out.println(patient.name);
        //System.out.println(patient.email);
        //asignar otros datos de la clase model.Patient que no están como parametros en el objeto
        //patient.weight = 80 ;
        //patient.heidht = 1.74;*/

        //no se puede crear entidades de User porque es abstracta, pero si de las clases hijas
        User user = new Doctor("Alex","alex@mail.com"); //el objeto de tipo User toma la forma que le da doctor
        user.showDataUser();
        User userPatient = new Patient("CArla","car@mail.com");//User toma la forma de paciente
        userPatient.showDataUser();

        Patient patient =new Patient("Alex","alex@mail.com");
        //imprimo los datos que me trae el metodo toString de model.User mas los del metodo toString de model.Patient

        System.out.println(myDoctor);

        //Aplicar clases anonimas (forma de instraciar una clase abstracta sin necesidad de que sea por la clase hija)
        //el comportamiento de la clase anonima no se mantiene ni se puede heredar solo sirve para un momento
        User user1 = new User("Gero","gero@gero.com") {
            @Override
            public void showDataUser() {// se toma el unico metodo abstracto de la clase padre y se sobreescribe para darle comportamiento
                System.out.println("Doctor \n");
                System.out.println("Hostpital: Clipo\n");
                System.out.println("Nutricionista");
            }
        };
        user1.showDataUser();
    }

}
