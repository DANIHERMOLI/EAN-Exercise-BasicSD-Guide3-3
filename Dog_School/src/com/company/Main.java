/**
 @title          :Main.java
 @description    :This is the solution to the third guide of software development activity 3
 @author         :Sergio Guzman @ sgioguzman@gmail.com
 @date           :2020-03-03
 @version        :1.0
 @usage          :java Main.java
 ==================================================================================================================
 */
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Dog> dogList = new ArrayList<>();
        String search;
        boolean exit = false;
        System.out.println("\n#################################");
        System.out.println("Welcome to the EAN Guide 3 Act. 3");
        System.out.println("#################################");
        System.out.println("------------Dog's list-----------\n");
        do {
            if(dogList.size() == 0) {
                System.out.println("The list is empty.");
                System.out.println("Please add a dog to the list.\n");
                dogList.add(init());
                System.out.println();
            } else {
                switch (menu()) {
                    case 1:
                        dogList.add(init());
                        System.out.println("\nThe dog has been added to the list.\n");
                        break;
                    case 2:
                        System.out.println("Enter the name of the dog:");
                        search = input.nextLine().toLowerCase();
                        System.out.println();
                        for (Dog dog : dogList) {
                            if (dog.getDogName().equals(search)) {
                                System.out.println(dog);
                                System.out.println("\n=================================\n");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Enter the race you want to look for:");
                        search = input.nextLine().toLowerCase();
                        int count = 0;
                        for (Dog dog : dogList) {
                            if (dog.getDogRace().equals(search)) {
                                count++;
                            }
                        }
                        System.out.println("\nFor the race " + search + " there are " + count + " dogs.\n");
                        break;
                    case 4:
                        System.out.println("Enter the location in which you want to look for: ");
                        search = input.nextLine().toLowerCase();
                        for (Dog dog : dogList) {
                            if (dog.getDogLocation().equals(search)) {
                                System.out.println("Dog's name: " + dog.getDogName());
                            }
                        }
                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        System.out.println("You shouldn't see this message");
                        break;
                }
            }
        }while(!exit);
        System.out.println("Exiting app.");
        Thread.sleep(2500);
    }

    public static Dog init() {
        Dog newDog = new Dog();
        System.out.println("Dog's name?");
        newDog.setDogName(input.nextLine().toLowerCase());
        System.out.println("Dog's race?");
        newDog.setDogRace(input.nextLine().toLowerCase());
        System.out.println("Dog's location?");
        newDog.setDogLocation(input.nextLine().toLowerCase());
        System.out.println("Owner's ID?");
        newDog.setOwnersID(input.nextLine().toLowerCase());
        System.out.println("Owner's Name?");
        newDog.setOwnersName(input.nextLine().toLowerCase());
        System.out.println("Contact Number?");
        newDog.setContactNumber(input.nextLine().toLowerCase());
        System.out.println("Day of Assistance?");
        newDog.setAssistanceDay(input.nextLine().toLowerCase());
        return newDog;
    }

    public static int menu() throws InterruptedException {
        do {
            System.out.println("What do you want to do?\n");
            System.out.println("1. Add a new dog to the list.");
            System.out.println("2. Find a dog by its name.");
            System.out.println("3. Get the amount of dogs that belong to a specific race.");
            System.out.println("4. Get the name of the dogs based on their location.");
            System.out.println("0. To exit the app.\n");
            System.out.println("Please enter the number of what you want to execute:");
            if(input.hasNextInt()) {
                switch (input.nextInt()) {
                    case 1:
                        input.nextLine();
                        return 1;
                    case 2:
                        input.nextLine();
                        return 2;
                    case 3:
                        input.nextLine();
                        return 3;
                    case 4:
                        input.nextLine();
                        return 4;
                    case 0:
                        input.nextLine();
                        return 0;
                    default:
                        System.out.println("ERROR: Please enter a number between 0 and 4.\n");
                }
            } else {
                System.out.println("ERROR: Please enter a number between 0 and 4.\n");
                Thread.sleep(1500);
            }
            input.nextLine();
        } while(true);
    }
}
