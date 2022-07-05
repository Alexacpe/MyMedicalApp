package ui;

import model.Doctor;

import java.util.*;

public class UIPatientMenu {
    //metodo que sale cuando el paciente se loggea
    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome patient: " + UIMenu.patientLogged.getName());
            //opciones para el paciente
            System.out.println("1. Book an appointmet");
            System.out.println("2. My appointment");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    showBookAppointmetMenu();
                case 2:
                    showPatientMyAppointment();
                case 0:
                    UIMenu.showMenu();
            }
        } while (response != 0);
    }
    //metodo para el caso 1
    private static void showBookAppointmetMenu() {
        int response = 0;
        do {
            System.out.println(":: Book an appointmen");
            System.out.println(":: Select date: ");
            //mostrar las fechas de los doctores que tienen fechas disponibles
            //integer para numerar la lista de fechas
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();//segundo indice para numerar la fecha que selecciona el paciente

            //recorrer la lista de citas del doctor
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();//al encontrar una cita se guarda en el objeto available appointmets

                Map<Integer, Doctor> doctorAppointents = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + "." + availableAppointments.get(j).getDate());
                    //insertar el indice de los doctores al map
                    doctorAppointents.put(Integer.valueOf(j),UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    //dentro de los doctores esta el map de las fechas de cada uno con su indice
                    doctors.put(Integer.valueOf(k),doctorAppointents);
                }
            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            //obtener la lista de fechas del doctor seleccionado
            Map<Integer,Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            //indice de la fecha
            Integer indexDate = 0;
            //seleccion de doctor
            Doctor doctorSelected = new Doctor("","");

            //recorrer el map
            for (Map.Entry<Integer,Doctor> doc: doctorAvailableSelected.entrySet()) {
                //traer el indice de la fecha seleccionada para luego obtener el doctor
                indexDate = doc.getKey();//obtener el key (Integer indice) del map
                doctorSelected = doc.getValue();//obtengo el valor de el indice seleccionado
            }
            //confirmar lo seleccionado
            System.out.println(doctorSelected.getName() +
                    ". Date: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate() +
                    ". Time" + doctorSelected.getAvailableAppointments().get(indexDate).getTime());
            //confirmar seleccion
            System.out.println("Confirm your appointment: \n1. Yes \n2. Change Data");
            response = Integer.valueOf(sc.nextLine());
            if (response==1){
                UIMenu.patientLogged.addAppointmentDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());
                showPatientMenu();
            }

        } while (response != 0);

    }
    //metodo para el caso 2
    private static void showPatientMyAppointment(){
        int response = 0;
        do {
            System.out.println("My appointments");
        //validar si el paciente loggeado no tiene citas disponibles
            if (UIMenu.patientLogged.getAppointmentDoctors().size()==0){
                System.out.println("Don't have appointments");
                break;
            }
            // si si tiene citas mostrarlas
            for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                int j = i + 1;
                System.out.println(j + ". "+ "\n Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate()
                + "\n Time: "+UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime()+
                        "\n Doctor: "+ UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName());
            }
            System.out.println("0. Return");
        }while (response !=0);
    }
}

