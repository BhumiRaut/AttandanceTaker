package com.attendance.attendancetaker.repository;

//package com.attendance.attendancetaker;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "attandance")
public class Attandance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;

    private boolean present;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    public Attandance() {}

    public Attandance(LocalDate date, boolean present, Student student) {
        this.date = date;
        this.present = present;
        this.student = student;
    }

    public Long getId() { return id; }

    public LocalDate getDate() { return date; }

    public void setDate(LocalDate date) { this.date = date; }

    public boolean isPresent() { return present; }

    public void setPresent(boolean present) { this.present = present; }

    public Student getStudent() { return student; }

    public void setStudent(Student student) { this.student = student; }

	@Override
	public int hashCode() {
		return Objects.hash(date, id, present, student);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Attandance other = (Attandance) obj;
		return Objects.equals(date, other.date) && Objects.equals(id, other.id) && present == other.present
				&& Objects.equals(student, other.student);
	}
    
    
}
