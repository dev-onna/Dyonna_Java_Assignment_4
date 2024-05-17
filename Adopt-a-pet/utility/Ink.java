package utility;
import objects.Shelter;
import java.util.Scanner;
import java.util.ArrayList;

import objects.Pet;


public class Ink {
  private Scanner input = new Scanner(System.in);
  private int choice;

  public void printWelcome() {
    String lightBlue = "\u001B[94m";
    String reset = "\u001B[0m";
    System.out.println(lightBlue + "Welcome to Adopt A Pet!" + reset);
    } // printWelcome()
    
  public void printGoodDay() {
    System.out.println("Have a great day pet lover");
  } // printGoodday()


  public int validateMainMenu() {
    boolean valid = false;

    while(!valid) {
      String lightBlue = "\u001B[94m";
      String reset = "\u001B[0m";
      System.out.println(lightBlue + "##### MAIN MENU #####" + reset);
      System.out.println("(1) View Pets\n(2) Shelter Details\n(3) Book Appointment\n(4) Exit");
      try {
        choice = input.nextInt();
        if(choice >= 1 && choice <=4) {
          valid = true; // escapes loop only if choice is correct dt and range
        }
        else {
          System.out.println("Please enter a 1 - 4");
        }
      } 
      catch (Exception e) { // runs on exception
        System.out.println("That's not a number!");
        input.nextLine();
      } 
      finally { // always runs!
        input.nextLine();
      }
    } // while
    return choice;
  } // printMenu()

  public void printPetDetails(Pet pet) {
    System.out.printf("Name: %s\n", pet.getName());
    System.out.printf("Age: %d\n", pet.getAge());
    System.out.printf("Breed: %s\n", pet.getBreed());
    System.out.printf("Color: %s\n", pet.getColor());
    System.out.printf("Owner: %s\n", pet.getOwner());
    System.out.printf("Is Adopted: %b\n", pet.getIsAdopted());
    System.out.println("Adopt this pet? Y/N");
  } // printPetDetails()
  
  public void printAvailablePets(ArrayList<Pet> pets) {
    for(int i = 0; i < pets.size(); i++) {
      if(!pets.get(i).getIsAdopted()) {
        System.out.printf("(%d) Name: %s Type: %s Age: %d\n", i + 1,
          pets.get(i).getName(), pets.get(i).getType(), pets.get(i).getAge());
      }
    } // for
    System.out.println("Which Pet Would You Like To Adopt? Choose By Number.");
    System.out.println("Please Book An Appointment from main menu after Adoption Choice");
  } // printAvailablePets()

  public void printShelterDetails(Shelter shelter) {
    System.out.printf("Shelter Address: %s\n", shelter.getAddress());
    String[][] hours = shelter.getHours();
    String[] days = shelter.getDays();

    for (int i = 0; i < days.length; i++) {
      System.out.print("\u001B[31m");
      System.out.println("Monday - Friday");
      System.out.print("  ");
      System.out.print("\u001B[0m");

     System.out.println("8:00AM - 4:00PM");
     System.out.println("Saturday/Sunday We Are Closed");
  }//for

  System.out.println("hit any key to go back");
    } // printshelter details
  }//