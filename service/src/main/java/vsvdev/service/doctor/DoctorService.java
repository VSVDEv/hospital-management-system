package vsvdev.service.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import vsvdev.dao.doctor.DoctorRepository;
import vsvdev.model.doctor.Doctor;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorService {

    private final DoctorRepository repository;
@Autowired
    public DoctorService(DoctorRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void initDoc(){
    repository.saveAll( Stream.of( new Doctor(100, "John Wick","killer"),
            new Doctor(101, "Bruce Willis","killer"),
            new Doctor(102, "Stathem","mechanic")
    ) .collect( Collectors.toList()) );
    }


    public List<Doctor> getDoc(){
    return repository.findAll();
    }
}
