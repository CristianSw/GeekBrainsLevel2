package gb.java.level2.level3;

public class Person {
    private String lastName;
    private String telephone;

    public Person(String lastName, String telephone) {
        this.lastName = lastName;
        this.telephone = telephone;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
