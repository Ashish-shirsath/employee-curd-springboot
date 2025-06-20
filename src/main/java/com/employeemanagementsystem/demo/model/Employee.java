package com.employeemanagementsystem.demo.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "employe_emanagement_system")
public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long employeeId;
        private String firstName;
        private String lastName;
        private String emailId;

        public Employee(){}
        public Employee( String firstName, String lastName, String emailId) {
              //  this.employeeId = employeeId;
                this.firstName = firstName;
                this.lastName = lastName;
                this.emailId = emailId;
        }



        public long getEmployeeId() {
                return employeeId;
        }

        public void setEmployeeId(long employeeId) {
                this.employeeId = employeeId;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getEmailId() {
                return emailId;
        }

        public void setEmailId(String emailId) {
                this.emailId = emailId;
        }
}
