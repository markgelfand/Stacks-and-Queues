public class Student_Gelfand {
    private int id;
    private String firstName;
    private String lastName;

    public Student_Gelfand(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Student_Gelfand)) return false;
        Student_Gelfand other = (Student_Gelfand) obj;
        return this.id == other.id;
    }

    //Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}



