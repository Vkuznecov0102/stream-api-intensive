package ru.itsjava.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Faculty {
    private final String name;
    private final int birthYear;
    private final boolean isHumanitarian;

    public static FacultyBuilder builder() {
        return new FacultyBuilder();
    }

    public static class FacultyBuilder {
        private String name;
        private int birthYear;
        private boolean isHumanitarian;

        FacultyBuilder() {
        }

        public FacultyBuilder name(String name) {
            this.name = name;
            return this;
        }

        public FacultyBuilder birthYear(int birthYear) {
            this.birthYear = birthYear;
            return this;
        }

        public FacultyBuilder isHumanitarian(boolean isHumanitarian) {
            this.isHumanitarian = isHumanitarian;
            return this;
        }

        public Faculty build() {
            return new Faculty(name, birthYear, isHumanitarian);
        }

        public String toString() {
            return "Faculty.FacultyBuilder(name=" + this.name + ", birthYear=" + this.birthYear + ", isHumanitarian=" + this.isHumanitarian + ")";
        }
    }
}
