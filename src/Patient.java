public class Patient {
    //private solo permite que la clase tenga acceso(encapsulados)
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double heidht;
    private String blood;

    //Metodo constructor con los parametros minimos para Patient pueda ser declarado
    public Patient(String name, String email){
        this.name=name;
        this.email=email;
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
        this.phoneNumber = phoneNumber;
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
}
