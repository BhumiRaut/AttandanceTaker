package com.attendance.attendancetaker.repository;

//package com.attendance.attendancetaker;

import java.time.LocalDate;

public class AttendanceRequest {
    private LocalDate date;
    private boolean present;
    private Long studentId;

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public boolean isPresent() { return present; }
    public void setPresent(boolean present) { this.present = present; }

    public Long getStudentId() { return studentId; }
    public void setStudentId(Long studentId) { this.studentId = studentId; }
}
