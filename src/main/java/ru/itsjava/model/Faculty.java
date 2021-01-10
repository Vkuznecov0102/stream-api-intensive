package ru.itsjava.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Faculty {
    private final String name;
    private final int birthYear;
    private final boolean isHumanitarian;
}
