package ms.jiren.sigespro.controller;

import ms.jiren.sigespro.repository.entity.AplicacionEntity;
import ms.jiren.sigespro.service.AplicacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/applications")
public class AplicacionController {

    private final AplicacionService service;

    @GetMapping
    public ResponseEntity<List<AplicacionEntity>> getAllApplications() {
        List<AplicacionEntity> applications = service.getAllApplications();
        return ResponseEntity.ok().body(applications);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AplicacionEntity> getApplicationById(@PathVariable Integer id) {
        Optional<AplicacionEntity> application = service.getApplicationById(id);
        return application.map(value -> ResponseEntity.ok().body(value))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AplicacionEntity> createApplication(@RequestBody AplicacionEntity application) {
        AplicacionEntity savedApplication = service.createOrUpdateApplication(application);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedApplication);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AplicacionEntity> updateApplication(@PathVariable Integer id, @RequestBody AplicacionEntity application) {
        application.setIdappl(id); // Ensure that the ID in the request body matches the path
        AplicacionEntity updatedApplication = service.createOrUpdateApplication(application);
        return ResponseEntity.ok().body(updatedApplication);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteApplication(@PathVariable Integer id) {
        service.deleteApplicationById(id);
        return ResponseEntity.noContent().build();
    }
}

