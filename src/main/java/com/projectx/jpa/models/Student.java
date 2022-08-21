package com.projectx.jpa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "`STUDENT`")
@Table(
        name = "`STUDENT`",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "student_email_unique",
                        columnNames = "`EMAIL`"
                )
        }
)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(name="`ID`")
    private Long id;
    @Column(name="`FIRST_NAME`", nullable = false, columnDefinition = "TEXT")
    private String firstName;
    @Column(name="`LAST_NAME`", nullable = false, columnDefinition = "TEXT")
    private String lastName;
    @Column(name="`EMAIL`", nullable = false, columnDefinition = "TEXT")
    private String email;
    @Column(name="`AGE`", nullable = false)
    private Integer age;
}
