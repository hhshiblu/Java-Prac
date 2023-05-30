public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("Car");
        Person myPerson = new Person("Hasanul haque shiblu", myVehicle);

        System.out.println("Person Name: " + myPerson.getPersonName());
        System.out.println("Vehicle Type: " + myPerson.getOwnedVehicle().getType());
    }
}