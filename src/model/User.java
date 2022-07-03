package model;

//Clase padre (Super Clase) que va a heredar atributos en comun que tienen otras clases (model.Doctor y model.Patient)
//se convierte en clase abstracta,ya no puede ser instanciada con comportamientos, ya que los objetos del proyecto son solo doctor y nurse
public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    //constructor con los parametros minimos para que el usuario pueda existir
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        //validacion para enviar numero telefonico
        if (phoneNumber.length()>8){
            System.out.println("Numero telefonico debe ser de 8 caracteres maximo");
        }else if (phoneNumber.length()==8){
            this.phoneNumber=phoneNumber;
        }
    }
    //el metodo toString es de la superclase por defecto
    //sobreescribo el metodo para que imprima los datos que necesito de model.User
    @Override //override sirve para sobreeescribir el metodo
    public String toString(){
        return "model.User:" + name + ",Email: "+email+
        "\n Address: "+address+" Phone: "+phoneNumber;
    }

    //metodo abstracto de la clase abtracta
    //traer datos especificos de cada usuario
    public abstract void showDataUser();
}
