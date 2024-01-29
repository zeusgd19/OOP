class Person{
    private String name;
    private String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return this.name + "\n"+ "  " + this.address;
    }
}
public class MainPerson {
    public static void main(String[] args) {
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person javier = new Person("Javier García", "Calle Mayor 15 12002 Castellón");

        System.out.println(ada);
        System.out.println(javier);
    }
}
