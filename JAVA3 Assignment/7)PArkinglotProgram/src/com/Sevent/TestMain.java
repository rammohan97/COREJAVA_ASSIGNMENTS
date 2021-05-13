package com.Sevent;

import java.util.Scanner;

public class TestMain
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int choice = 100;
        final Parked_CarOwnerList pl = new Parked_CarOwnerList();
        System.out.println("Enter 1.To Add Car 2.Remove Car 3.Get Car Location");
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter owner name");
            final String name = sc.next();
            System.out.println("Enter Car Model");
            final String model = sc.next();
            System.out.println("Enter Car Registration No.");
            final Integer regno = sc.nextInt();
            System.out.println("Enter Mobile No");
            final Long n = sc.nextLong();
            System.out.println("Enter Address");
            final String add = sc.next();
            final Parked_CarOwner_Details p = new Parked_CarOwner_Details(name, model, regno, n, add);
            pl.add_new_car(p);
        }
        if (choice == 2) {
            System.out.println("Enter Registration Number of Car To be Removed");
            final int regno2 = sc.nextInt();
            System.out.println("Enter Token Number");
            final int token = sc.nextInt();
            pl.remove(regno2, token);
        }
        if (choice == 3) {
            System.out.println("Enter Token No. Allocated Between 1-240");
            final int token2 = sc.nextInt();
            pl.get_parked_car_location(token2);
        }
    }
}