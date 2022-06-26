public class Patient {
    //private solo permite que la clase tenga acceso
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double heidht;
    String blood;

    public Patient(String name, String email){
        this.name=name;
        this.email=email;
    }
}
