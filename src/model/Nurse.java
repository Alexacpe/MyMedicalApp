package model;

public class Nurse extends User{
    private String specility;

    public Nurse(String name, String email, String specility) {
        super(name, email);
        this.specility = specility;
    }

    public String getSpecility() {
        return specility;
    }

    public void setSpecility(String specility) {
        this.specility = specility;
    }



    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital:  Pablo Tobon");
        System.out.println("Departamento: Cruz Roja, Pablo Tobon, Antioquia");
    }
}
