package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class UIDoctorMenu {
    //lista para los doctores que tienen citas disponibles
    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();
    //metodo para mostrar el menu del doctor logeado
    public static void showDoctorMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome Dcoctor" + UIMenu.doctorLogged);//doctorLogged del menu de logeo
            System.out.println("1. Add Available Appointments");
            System.out.println("2. My Scheduled appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            //evaluar los casos
            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response != 0);
    }

    private static void showAddAvailableAppointment(){
        int response = 0;
        do {
            System.out.println();
            System.out.println("::Add Available Appointmet");
            System.out.println(":: Select a Month");

            for (int i = 0; i < 3; i++) {
                //variable temporal j solo para numerar los meses
                int j = i + 1;
                System.out.println(j+"."+UIMenu.MONTHS[i]);//numerar los meses
                System.out.println("Return");

                Scanner sc = new Scanner(System.in);
                response = Integer.valueOf(sc.nextLine());

                if (response < 0 && response > 4){
                    //tomar el mes seleccionado 1,2 o 3
                    int monthSelected = response;
                    System.out.println(monthSelected + "."+UIMenu.MONTHS[monthSelected]);//muestra el mes seleccionado
                    System.out.println("Insert the date available: [dd/MM/yy");
                    String date = sc.nextLine(); //se reutiliza la variable creada en scanner

                    System.out.println("Your date selected is: "+ date + "\n 1. Correct \n2. Change Date");
                    //validar si la respuesta es correcta
                    int responseDate = Integer.valueOf(sc.nextLine());
                    if (responseDate == 2)continue; //continue no continua sino que repite el ciclo

                    int responseTime=0;
                    String time = ""; //para capturar la hora
                        do {
                            System.out.println("Insert the time available for date: "+ date + "16:00");
                            time = sc.nextLine();
                            System.out.println("Your time selected is: "+ time + "\n 1. Correct \n2. Change Time");
                            responseTime = Integer.valueOf(sc.nextLine());
                        }while (responseTime == 2);

                        //asignacion de la fecha
                        UIMenu.doctorLogged.addAvailableAppointment(date, time);
                        checkDoctorAvailableAppointments(UIMenu.doctorLogged);//le paso al doctor logeado con el metodo checkDoctorAvailableAppointments

                }else if (response == 0){
                    showDoctorMenu();
                }
            }
        }while (response !=0);
    }

    private static void checkDoctorAvailableAppointments (Doctor doctor){
        //si el doctor si tiene citas y si el doctor no existe, agregarlo
        if (doctor.getAvailableAppointments().size() > 0
            && !doctorsAvailableAppointments.contains(doctor)) {
                doctorsAvailableAppointments.add(doctor);
        }
    }

}
