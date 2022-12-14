package worker_Info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        ArrayList<Worker> workersList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Scanner scn = new Scanner(System.in);

            System.out.print("Фамилия и инициалы работника: ");
            String fio = scn.nextLine();

            System.out.print("Должность работника: ");
            String post = scn.nextLine();

            System.out.print("Год поступления на работу: ");
            int yearOfEntry = 0;
            try{
                yearOfEntry = scn.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Неверно введен формат года");
                System.exit(0);
            }

            workersList.add(new Worker(fio, post, yearOfEntry));
        }

        Collections.sort(workersList);

        String worker = "";
        for (int i = 0; i < workersList.size(); i++) {
            worker += workersList.get(i);
        }
        System.out.print(worker);

        System.out.print("Введите стаж работника: ");
        Scanner scn = new Scanner(System.in);

        int operatingTime = scn.nextInt();
        int yearNow = 2022;

        for (Worker par : workersList) {
            int workExperience = yearNow - par.getYearOfEntry();
            if (workExperience > operatingTime) {
                System.out.println(par.getFio() +
                        " - стаж работы превышает " + operatingTime + " лет");
            }
        }

    }//main
}//class