package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
        //variable constante con la palabra final asi no podrá ser reasignada
        public static final String [] MONTHS = {"Enero", "Febrero", "Marzo", "Abril","Mayo","Junio"};
        //variable para obtener el doctor logeado
        public static Doctor doctorLogged;
        //variable para obtener el doctor logeado
        public static Patient patientLogged;

        public static void showMenu(){
            System.out.println("Bienvenido a la app de Medicos");
            System.out.println("Selecciona la opción deseada");

            int response = 0;
            do {
                System.out.println("1. Doctor");
                System.out.println("2. Patient");
                System.out.println("0. Salir");

                Scanner sc = new Scanner(System.in);
                response = Integer.valueOf(sc.nextLine());

                switch (response){
                    case 1:
                        System.out.println("Doctor");
                        //implementa autenticacion si es doctor con la opcion 1 (parametro)
                        authUser(1);//asigno el parametro que solicita el metodo
                        break;
                    case 2:
                        response = 0;
                        authUser(2);

                        break;
                    case 0:
                        System.out.println("Thank you for you visit");
                        break;
                    default:
                        System.out.println("Please select a correct answer");
                }
            }while (response != 0);
        }

        //menu de autenticacion

        private static void authUser(int userType){
            //userType = 1 Es Doctor
            //userType = 2 es Paciente
            ArrayList<Doctor> doctors = new ArrayList<>();
            doctors.add(new Doctor("Primer doctor","primer@mail.com"));
            doctors.add(new Doctor("segundo doctor","segundo@mail.com"));
            doctors.add(new Doctor("tercer doctor","tercer@mail.com"));

            ArrayList<Patient>patients = new ArrayList<>();
            patients.add(new Patient("Primer paciente","paciente1@mail.com"));
            patients.add(new Patient("Segundo paciente","paciente2@mail.com"));
            patients.add(new Patient("Tercero paciente","paciente3@mail.com"));

            //variable que valida si el mail es correcto
            boolean emailCorrect = false;
            do {
                System.out.println("Ingresar email");
                //leer los datos ingresados en el menu
                Scanner sc = new Scanner(System.in);
                //recibir los datos y almacenarlos en la variable email
                String email = sc.nextLine();
                if (userType == 1){
                    //verifica el ArrayList de doctors
                    for (Doctor d: doctors){
                        if (d.getEmail().equals(email)){
                            emailCorrect = true; //si el email es correcto cambia la variable a true
                            //obtener el usuario logueado
                            doctorLogged = d;
                            //mostrar el menu del doctor
                            UIDoctorMenu.showDoctorMenu();
                        }
                    }
                }
                if (userType == 2){
                    //verifica el ArrayList de patients
                    for (Patient p: patients){
                        if (p.getEmail().equals(email)){
                            emailCorrect = true;
                            patientLogged=p;
                            //mostrar el menu del paciente
                            UIPatientMenu.showPatientMenu();
                        }
                    }
                }

            }while (!emailCorrect);//si el email es falso seguir solicitando el correcto
        }


        static void showPatientMenu(){
            int response = 0;
            do {
                System.out.println("\n\n");
                System.out.println("model.Patient");
                System.out.println("1. Book an appointment");
                System.out.println("2. My appointments");
                System.out.println("0. Return");

                Scanner sc = new Scanner(System.in);
                response = Integer.valueOf(sc.nextLine());

                switch (response){
                    case 1:
                        System.out.println("::Book an appointment");
                        //Mostrar 3 meses de los 6 que hay en la variable constante
                        for (int i = 1; i < 4 ; i++) {
                            System.out.println(i + "."+ MONTHS[i]);
                        }
                        break;
                    case 2:
                        System.out.println("::My appointments");
                        break;
                    case 0:
                        showMenu();
                        break;
                }
            }while (response != 0);
        }

        /*public static void menuOption(){
            int response = 0;
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
        }*/

    }

