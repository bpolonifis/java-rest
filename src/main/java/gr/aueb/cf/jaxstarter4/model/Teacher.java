package gr.aueb.cf.jaxstarter4.model;

public class Teacher {

    private long id;
    private String ssn;
    private String firstname;
    private String surname;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Teacher(long id, String ssn, String firstname, String surname) {
        this.id = id;
        this.ssn = ssn;
        this.firstname = firstname;
        this.surname = surname;
    }
}
