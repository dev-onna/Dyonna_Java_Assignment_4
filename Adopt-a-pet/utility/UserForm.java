package utility;

import java.util.Scanner;

public class UserForm {
// 3 Fields
    private String applicantName;
    private String address;
    private String phoneNumber;

    // Constructor
    public UserForm() {
        // Do nothing 
    }
//===============================<
    // getters
    public String getApplicantName() {
        return applicantName;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    //=============================<
     // setters

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

   // fillFORM Method
    public void fillForm() {
     Scanner scanner = new Scanner(System.in);
       System.out.print(" Name: ");
       this.applicantName = scanner.nextLine();
       System.out.print("Address: ");
        this.address = scanner.nextLine();
        System.out.print("Phone Number: ");
        this.phoneNumber = scanner.nextLine();
    }

    // printForm Method
    public void printForm() {
        System.out.println("Applicant Name: " + applicantName);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }
}