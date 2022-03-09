package co.pedrobelle.batmanrobin;

import java.util.Objects;

public class Robin {

    private String firstName;
    private String lastName;

    public Robin(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String output() {
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public String output(boolean showLastName) {
        if (showLastName){
            return output();
        } else {
            return firstName;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robin robin = (Robin) o;
        return Objects.equals(firstName, robin.firstName) && Objects.equals(lastName, robin.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public String toString(){
        return "Eita porra";
    }
}
