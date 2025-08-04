package com.attendance.attendancetaker.repository;

//package com.attendance.attendancetaker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
