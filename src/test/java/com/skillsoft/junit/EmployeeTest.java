package com.skillsoft.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import  static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    static Employee employee;
    static double salary;

    @BeforeAll
    static void initEmployee() {

        salary = 45000;
        employee = new Employee("Brian", "Alford", 1011, 'M',
                "Tester", salary, "Contract");
    }

    @ParameterizedTest
    @DisplayName("Salary Update")
    @ValueSource(doubles = {500, 1000, 1300, 2400, 3500, 4000})
    void salaryUpdateTest(double salaryIncrement){

        employee.adjustSalary(salaryIncrement);
        salary += salaryIncrement;

        assertEquals(salary, employee.getSalary(), "Test salary updates");

    }
}