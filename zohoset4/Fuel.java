package zohoset4;

import java.util.Scanner;

public class Fuel {
        public static void main(String args[])
        {
            Scanner in = new Scanner(System.in);
            int carPetrol;

            System.out.println("Petrol in  car: ");
            carPetrol = in.nextInt();

            in.nextLine(); // To skip the line after pressing enter

            System.out.println("Petrol bunks: ");
            String petbunks = in.nextLine();
            int petrolbunks = petbunks.length();

            int[] arrayDis = new int[petrolbunks];
            int[] arrayCap = new int[petrolbunks];

            System.out.println("Distance form each petrol bunks: ");

            for(int i=0; i<petrolbunks; i++)
                arrayDis[i] = in.nextInt();

            System.out.println("Capacities of each petrol bunk: ");

            for(int i=0; i<petrolbunks; i++)
                arrayCap[i] = in.nextInt();

            int flag = 1;
            for(int i=0; i<petrolbunks; i++)
            {
                if(carPetrol >= arrayDis[i])
                {
                    carPetrol = carPetrol - arrayDis[i] + arrayCap[i];
                }
                else
                {
                    flag = 0;
                    System.out.println("Out of petrol");
                    break;
                }
            }
            if(flag == 1)
                System.out.println("Remaining petrol: "+carPetrol);
        }
    }

