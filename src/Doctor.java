import java.util.ArrayList;
import java.util.Date;

//Clase Doctor
public class Doctor {
    //Atributos
    static int id = 0; //autoincrementable
    private String name;
    private String email;
    private String speciality;


    //Constructor
    public Doctor(){ //Metodo constructor por defecto
        System.out.println("Construyento un objeto Doctor");
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

    //coleccion de objetos AvailableAppointment obtenidos de addAvailableAppointment
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    //metodo de la clase que agrega citas al doctor, recibe como parametro fecha y hora
    public  void addAvailableAppointment(Date date, String time){
        //cada que se añade una cita se declara un nuevo objeto de AvailableAppointment con los parametros date y time
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }
    //obtener la lista con las citas
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    //Clase anidada asociada a la logica de la clase Doctor, para asignar citas

    public static class AvailableAppointment{
        //atributos
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
