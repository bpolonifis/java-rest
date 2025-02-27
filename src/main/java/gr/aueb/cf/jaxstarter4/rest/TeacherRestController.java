package gr.aueb.cf.jaxstarter4.rest;


import gr.aueb.cf.jaxstarter4.dto.TeacherReadOnlyDTO;
import gr.aueb.cf.jaxstarter4.model.Teacher;

import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.validation.Validator;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("/teachers")
public class TeacherRestController {

    private final Validator validator;


    public TeacherRestController( ) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        this.validator = factory.getValidator();
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTeachers() {

        //Assume we call service layer and get back
        // a list of teachers
        List<Teacher> teachers = Arrays.asList(
                new Teacher(1L,"123456","Ath","Andr"),
                new Teacher(2L,"234567","Makis","Kapetis"),
                new Teacher(3L,"345678","Markos","Karab."),
                new Teacher(4L,"456789","Chr.","Frag."));

        if (teachers.size() == 0) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        List<TeacherReadOnlyDTO> teacherDto = new ArrayList<>();
        for (Teacher teacher : teachers) {
            teacherDto.add(mapFrom(teacher));
        }

        return Response.ok(Response.Status.OK).entity(teacherDto).build();

    }
    private TeacherReadOnlyDTO mapFrom(Teacher teacher) {
        return new TeacherReadOnlyDTO(teacher.getId(),
                teacher.getSsn(),teacher.getFirstname(),teacher.getSurname());
    }

}
