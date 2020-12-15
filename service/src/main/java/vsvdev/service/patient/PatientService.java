package vsvdev.service.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import vsvdev.dao.patient.PatientRepository;
import vsvdev.model.doctor.Doctor;
import vsvdev.model.patient.Patient;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PatientService {

    private final PatientRepository repository;
@Autowired
    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void initPatient(){
        repository.saveAll( Stream.of( new Patient(100, "Secret concil","killers"),
                new Patient(101, "Mafia","criminal"),
                new Patient(102, "Narco","drugs")
        ) .collect( Collectors.toList()) );
    }


    public List<Patient> getPatients(){
        return repository.findAll();
    }
}
