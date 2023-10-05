package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int countOfAgesEmployee = 2;
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 30, 1));
        employees.add(new Employee("Fredy", 31, 2));
        employees.add(new Employee("Yax", 32, 3));
        employees.add(new Employee("Alex", 35, 4));
        employees.add(new Employee("Alfred", 20, 5));

            double average = employees
                .stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        System.out.println(average);
        countOfOldEmployee(employees, countOfAgesEmployee);
    }
    public static void countOfOldEmployee(List<Employee> employees, int count){
        employees.stream()
                .sorted((a1, a2)-> a2.getAge()- a1.getAge())
                .limit(count)
                .map(Employee::getName)
                .collect(Collectors.joining(", ", count + " самых старших сотрудников зовут: ",  " ."));
    }
}