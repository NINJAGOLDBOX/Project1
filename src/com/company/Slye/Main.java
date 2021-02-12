package com.company.Slye;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> taskList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        promptUser();
	    int userInput = input.nextInt();
	    while(userInput != 0){
	        if(userInput == 1){
	            addTask(taskList);
            }else if(userInput == 2){
	            removeTask(taskList);
            }else if(userInput == 3){
	            updateTask(taskList);
            }else if(userInput == 4){
	            listTasks(taskList);
            }else{
                System.out.println("That is not a valid command.");
            }
	        promptUser();
	        userInput = input.nextInt();
        }
    }

    static void promptUser(){
        System.out.println("Please choose an option:");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all tasks.");
        System.out.println("(0) Exit.");
    }
    static void addTask(ArrayList<String> a){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter description of the task.");
        String userInput = input.nextLine();
        a.add(userInput);
    }
    static void removeTask(ArrayList<String> a){
        Scanner input = new Scanner(System.in);
        System.out.println("Which task would you like to remove?");
        int userInput = input.nextInt();
        a.remove(userInput);
    }

    static void updateTask(ArrayList<String> a){
        Scanner input = new Scanner(System.in);
        Scanner nextInput = new Scanner(System.in);
        System.out.println("Which would you like to update?");
        int userInput = input.nextInt();
        System.out.println("What would you like to change it to?");
        String word = nextInput.nextLine();
        a.set(userInput, word);
    }

    static void listTasks(ArrayList<String> a){
        System.out.println(a);
    }
}
