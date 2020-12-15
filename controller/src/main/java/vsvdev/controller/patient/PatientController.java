package vsvdev.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vsvdev.model.patient.Patient;
import vsvdev.service.patient.PatientService;

import java.util.List;

@RestController
public class PatientController {

private final PatientService patientService;

@Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patients")
    public List<Patient> getAllPatients(){
    return patientService.getPatients();
    }


}
