package gr.aueb.cf.jaxstarter4.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TeacherInsertDTO {
    
    
//    @NotNull (message = "Please give id")
//    private Long id; //genikos id den vazoume ston insert, to kanoyme gia to paradigma

    @Size(min =6, max = 6, message = "ssn must be 6 digit long")
    private String ssn;
    
    @NotNull(message = "please fill firstname")
    private String firstname;

    @NotNull(message = "please fill lastname")
    private String lastname;


//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
