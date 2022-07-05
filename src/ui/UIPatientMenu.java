package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
    //metodo que sale cuando el paciente se loggea
    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome patient: " + UIMenu.patientLogged);
            //opciones para el paciente
            System.out.println("1. Book an appointmet");
            System.out.println("2. My appointment");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
            }
        } while (response != 0);
    }

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
        } while (response != 0);

    }
}

