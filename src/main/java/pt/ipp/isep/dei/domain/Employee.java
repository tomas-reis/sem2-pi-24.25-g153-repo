package pt.ipp.isep.dei.domain;

import java.util.Objects;

public class Employee {
    private final String email;
    private String name;
    private String position;
    private String phone;

    public Employee(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return email.equals(employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    public boolean hasEmail(String email) {
        return this.email.equals(email);
    }

    /**
     * Clone method.
     *
     * @return A clone of the current instance.
     */
    public Employee clone() {
        return new Employee(this.email);
    }
}