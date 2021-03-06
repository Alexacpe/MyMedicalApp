package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    public  void addAvailableAppointment(String date, String time){
        //cada que se a?ade una cita se declara un nuevo objeto de AvailableAppointment con los parametros date y time
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }
    //obtener la lista con las citas
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }
    //sobreescribir el tostring de la super clase para a?adirle comportamiento
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
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");//para formatear de string a date

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);//toma un string y lo pasa a date.
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }
        //UN get date que me trae un string
        public String getDate() {
            return format.format(date);
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
    //metodo abstracto que viene de la clase padre, es el metodo obligatorio por ser declarado como abstracto en la clase abstracta
    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Clinica del norte");
        System.out.println("Departamento: Pediatria");
    }


}
