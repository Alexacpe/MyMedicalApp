package model;

import java.util.ArrayList;
import java.util.Date;

//Clase model.Doctor
//Utilizo extends para heredar los atributos de la clase padre
public class Doctor extends User {

    private String speciality;

    //Constructor con parametro-> recibe como parametro un nombre de doctor y el email que fue declarado en la clase padre model.User
    public Doctor(String name,String email){
        //super es para usar el constructor de la clase padre
       super(name,email);
       this.speciality=speciality;
     }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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
    //sobreescribir el tostring de la super clase para añadirle comportamiento
    @Override
    public String toString() {
        return super.toString()+"\n Speciality:"+speciality+"\nAvailable: "+availableAppointments.toString();//convertir la lista de fechas en un toString para que solo me muestre los datos de las citas
    }
    //Clase anidada asociada a la logica de la clase model.Doctor, para asignar citas

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
        @Override
        public String toString() {
            return "Avaliable Appointmen \nDate"+date+"\nTime:"+time;
        }
    }


}
