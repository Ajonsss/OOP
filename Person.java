class Person {
    protected String Name;
    protected String Address;

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getAddress() {
        return Address;
    }

    public String toString() {
        return "Hello I am " + Name + " and " + "I lived in " + Address + ".";
    }


}