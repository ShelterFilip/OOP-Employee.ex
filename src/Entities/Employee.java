package Entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;
    private List<Employee> list = new ArrayList<>();

    public Employee(){
    }

    public Employee(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public List<Employee> getList() {
        return list;
    }

    public void setList(List<Employee> list) {
        this.list = list;   
    }

    public void adition(double percentage){
       this.salary += salary / 100 * percentage;
    }

    public String toString(){
        return getId()
        + ", "
        + getName()
        +", "
        +String.format("%.2f", getSalary());
    }



    

    
    
    
}
