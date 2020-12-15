package vsvdev.controller.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vsvdev.model.doctor.Doctor;
import vsvdev.service.doctor.DoctorService;

import java.util.List;

@RestController
public class DoctorController {

    private final DoctorService docservice;
    @Autowired
    public DoctorController(DoctorService docservice) {
        this.docservice = docservice;
    }


    @GetMapping("/doc")
    public List<Doctor> getAllDoc(){
    return docservice.getDoc();
    }
}
