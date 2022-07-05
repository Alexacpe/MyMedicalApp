package ui;

import java.util.Scanner;

public class UIPatientMenu {
    //metodo que sale cuando el paciente se loggea
    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome patient: "+ UIMenu.patientLogged);
            //opciones para el paciente
            System.out.println("1. Book an appointmet");
            System.out.println("2. My appointment");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
            }
        }while (response!=0);
    }
    private static void showBookAppointmetMenu(){
        int response = 0;
        do {
            System.out.println(":: Book an appointmen");
            System.out.println(":: Select date: ");


        }while (response!=0);
    }
}
