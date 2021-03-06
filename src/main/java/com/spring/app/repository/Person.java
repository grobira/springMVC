package com.spring.app.repository;

import lombok.*;
import org.springframework.data.annotation.Id;

@Getter @Setter
@EqualsAndHashCode @ToString
@NoArgsConstructor
public class Person {

    @Id
    private Long id;

    @NonNull
    private String name;

    private String lastName;

    private int age;

    public Person(Long id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
