package com.mycompany.javaproject;

public class ObjectOriented {
    // Technician class
    static class Technician {
        private String name;
        private int employeeId;

        public Technician(String name, int employeeId) {
            this.name = name;
            this.employeeId = employeeId;
        }

        public String getName() {
            return name;
        }

        public void fixEquipment() {
            System.out.println(name + " is fixing the equipment.");
        }
    }

    // Customer class
    static class Customer {
        private String name;
        private String address;

        public Customer(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public void placeServiceRequest() {
            System.out.println(name + " has placed a service request.");
        }
    }

    // Management class (subclass of Technician)
    static class Management extends Technician {
        private String department;

        public Management(String name, int employeeId, String department) {
            super(name, employeeId);
            this.department = department;
        }

        // Overriding fixEquipment method
        @Override
        public void fixEquipment() {
            System.out.println(getName() + " from " + department + " is fixing the equipment.");
        }

        // Method overloading
        public void fixEquipment(String specificIssue) {
            System.out.println(getName() + " from " + department + " is fixing the equipment with " + specificIssue);
        }

        // New method
        public void conductMeeting() {
            System.out.println("Management is conducting a meeting.");
        }
    }

    public static void main(String[] args) {
        // Creating objects of Technician, Customer, and Management classes
        Technician technician1 = new Technician("John", 101);
        Customer customer1 = new Customer("Alice", "123 Main St");
        Management management1 = new Management("Jane", 201, "Operations");

        // Calling methods
        technician1.fixEquipment();
        customer1.placeServiceRequest();
        management1.fixEquipment();
        management1.fixEquipment("software issue");
        management1.conductMeeting();
    }
}
