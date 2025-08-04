package com.attendance.attendancetaker.repository;

//package com.attendance.attendancetaker;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:3434")
public class AttandanceController {

    private final AttandanceRepository attandanceRepository;
    private final StudentRepository studentRepository;

    public AttandanceController(AttandanceRepository attandanceRepository, StudentRepository studentRepository) {
        this.attandanceRepository = attandanceRepository;
        this.studentRepository = studentRepository;
    }

    @PostMapping("/attendance")
    public Attandance addAttendance(@RequestBody AttendanceRequest request) {
        Student student = studentRepository.findById(request.getStudentId())
                .orElseThrow(() -> new RuntimeException("Student not found"));

        Attandance attandance = new Attandance(
                request.getDate(),
                request.isPresent(),
                student
        );

        return attandanceRepository.save(attandance);
    }

    @GetMapping("/attendance")
    public List<Attandance> getAllAttendance() {
        return attandanceRepository.findAll();
    }
}
