package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User{

    private String birthday;
    private double weight;
    private double heidht;
    private String blood;
     //lista donde se guardan las citas que ejecuta el paciente
    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date,String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date,time);
        appointmentDoctors.add(appointmentDoctor);
    }

    //Metodo constructor con los parametros minimos para model.Patient pueda ser declarado
    public Patient(String name, String email){
        //super recibe el metodo contructor del padre
        super(name, email);
    }
    //darle acceso al dato de la variable
    public void setWeight (double weight){
        this.weight=weight;
    }
    //dar formato al dato obtenido
    public String getWeight(double weight) {
        return this.weight + "kg.";
    }
    public double getHeidht() {
        return heidht;
    }

    public String setHeidht(double heidht) {
        return this.heidht + "cm.";
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return weight;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        //heredo el toString de user para complementar con los atributos de model.Patient
        return super.toString()+
                "birthday='" + birthday + '\n' +
                ", weight=" + getWeight() +
                ", heidht=" + getHeidht() +
                ", blood='" + blood ;
    }
    //metodo abstracto que viene de la clase padre, es el metodo obligatorio por ser declarado como abstracto en la clase abstracta
    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial del paciente");
    }
}
