package Day18;

import java.util.Scanner;

import static Day18.validator.PersonValidator.*;
import static Day18.validator.StoreValidator.*;
import static Day18.validator.TriangleValidator.*;

public class test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         String firstName;
         String lastName;
         String passportId;
         int age;
         String gender;
         String nationality;

         while (true){
             firstName= scanner.nextLine();;
             if(isValidFirstName(firstName))
             {
                 break;
             }else
             {
                 System.out.println("Invalid firstname");
             }
         }
        while (true){
            lastName= scanner.nextLine();;
            if(isValidLastName(lastName))
            {
                break;
            }else
            {
                System.out.println("Invalid lastname");
            }
        }
        while (true){
            age= scanner.nextInt();;
            if(isValidAge(age))
            {
                break;
            }else
            {
                System.out.println("Invalid age");
            }
        }
        while (true){
            gender= scanner.nextLine();;
            if(isValidGender(gender))
            {
                break;
            }else
            {
                System.out.println("Invalid gender");
            }
        }
        while (true){
            passportId=scanner.nextLine();
            if(isValidPassportId(passportId))
            {
                break;
            }else
            {
                System.out.println("Invalid passportid");
            }
        }
        nationality=scanner.nextLine();
        Person person=new Person(firstName,lastName,passportId,age,gender,nationality);
        person.display();

        int n=scanner.nextInt();
        int countOfWorkers;
        String name;
        int phoneNumber;
        int [] productNumbers=new int[n];

        while (true){
            countOfWorkers=scanner.nextInt();
            if(ValidsetCountOfWorkers(countOfWorkers))
            {
                break;
            }
            else {
                System.out.println("Invalid count of workers");
            }
        }
        while(true){
            name=scanner.nextLine();
            if(ValidSetName(name)){
                break;
            }
            else
            {
                System.out.println("Invalid name");
            }
        }
        while (true){
            phoneNumber=scanner.nextInt();
            if(ValisSetPhoneNumber(phoneNumber)){
                break;
            }
            else
            {
                System.out.println("Invalid phone number");
            }
        }
        for(int i=0;i<productNumbers.length;i++){
            productNumbers[i]=scanner.nextInt();
        }
        Store store=new Store(countOfWorkers,name,phoneNumber,productNumbers);

        int sideA;
        int sideB;
        int sideC;

        while (true) {
            sideA = scanner.nextInt();
            if (IsValidSideA(sideA)) {
                break;

            } else {
                System.out.println("Invalid side");
            }
        }
        while (true){
            sideB=scanner.nextInt();
            if(IsValidSideB(sideB)){
                break;
            }else
            {
                System.out.println("Invalid side");
            }
        }
        while (true){
            sideC=scanner.nextInt();
          if(IsValidSideC(sideC)){
                break;
            }else
            {
                System.out.println("Invalid side");
            }
        }

        Triangle triangle=new Triangle(sideA,sideB,sideC);



    }




}
