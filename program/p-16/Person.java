class Person {
    private String personName;
    private Vehicle ownedVehicle;

    public Person(String personName, Vehicle ownedVehicle) {
        this.personName = personName;
        this.ownedVehicle = ownedVehicle;
    }

    public String getPersonName() {
        return personName;
    }

    public Vehicle getOwnedVehicle() {
        return ownedVehicle;
    }
}