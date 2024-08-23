package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Integer choice;

        do{
        PetRecord petFile = new PetRecord();
            Pet pet;

            System.out.println("\n======================================\nEnter Your Choice!");
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");

            System.out.print("\nChoose your pet number: ");
            choice = input.nextInt();

            

            switch(choice){
                case 1: pet = new Dog();
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("Japanese Spitz");
                    System.out.println("Pet Kind Selected: " + petFile.getPet().getClass().getSimpleName());
                    System.out.println("The Dog's Breed is: "+ petFile.getPet().prompt());
                    break;
                case 2: pet = new Cat();
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    System.out.println("Pet Kind Selected: " + petFile.getPet().getClass().getSimpleName());
                    System.out.println("Number of Lives: "+ petFile.getPet().prompt());
                    break;
                case 3: //Exit
			        System.out.print("Program Terminated - SHAINA BLESSY MEIR TELEN 3BSCS-1");
			        break;

            }
         
    

       
        //System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
        

        
        
    } while (choice < 3);
}
}
