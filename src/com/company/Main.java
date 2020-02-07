package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//Polya Part1: Scan for smallest unit, display it
        ArrayList<String> data = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name = sc.nextLine();
        data.add(name);
        System.out.println("Enter an email address: ");
        String email = sc.nextLine();
        data.add(email);
        System.out.println("Enter highest diploma: ");
        String diploma = sc.nextLine();
        data.add(diploma);
        System.out.println("Enter major ");
        String major = sc.nextLine();
        data.add(major);
        System.out.println("Enter university name: ");
        String uni = sc.nextLine();
        data.add(uni);
        System.out.println("Enter graduation year: ");
        String yr = sc.nextLine();
        data.add(yr);
        System.out.println("Enter company: ");
        String co = sc.nextLine();
        data.add(co);
        System.out.println("Enter job title: ");
        String ti = sc.nextLine();
        data.add(ti);
        System.out.println("Enter start date: ");
        String start = sc.nextLine();
        data.add(start);
        System.out.println("Enter end date: ");
        String end = sc.nextLine();
        data.add(end);
        System.out.println("Enter job description: ");
        String desc = sc.nextLine();
        data.add(desc);
        System.out.println("Enter skill 1: ");
        String sk1 = sc.nextLine();
        data.add(sk1);
        System.out.println("Enter rating/ranking: ");
        String rk1 = sc.nextLine();
        data.add(rk1);
        System.out.println("Enter skill 2: ");
        String sk2 = sc.nextLine();
        data.add(sk2);
        System.out.println("Enter rating/ranking: ");
        String rk2 = sc.nextLine();
        data.add(rk2);
        System.out.println("Enter skill 3: ");
        String sk3 = sc.nextLine();
        data.add(sk3);
        System.out.println("Enter rating/ranking: ");
        String rk3 = sc.nextLine();
        data.add(rk3);

      //  System.out.println("ArrayList " + data);

        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println("");
        System.out.println("");
        System.out.println("Education");
        System.out.println(data.get(2) + " in " + data.get(3));
        System.out.println(data.get(4) + " , " + data.get(5));
        System.out.println("");
        System.out.println("");
        System.out.println("Experience");
        System.out.println(data.get(6));
        System.out.println(data.get(7) + " , from " + data.get(8) + " to " + data.get(9));
        System.out.println("Duty 1 " + data.get(10));
        System.out.println("");
        System.out.println("");
        System.out.println("Skills");
        System.out.println(data.get(11) + " , " + data.get(12));
        System.out.println(data.get(13) + " , " + data.get(14));
        System.out.println(data.get(15) + " , " + data.get(16));
    }
}


/*
OOP: Change this to getters and setters


i. Can I do a while loop, while unfinished: true;
loop back through q's until everyone is answered

ii. Then, I'd like to for loop the arrayList,
into four sections of a resume = if(){}


Scanner sc = new Scanner(System.in);

System.out.println("Enter name: ")
String name = sc.nextLine();

System.out.println("Enter email address: ")
String name = sc.nextLine();

degree level
major
university name
graduation year
1 work experience
company
job title
start date
end date
1 job description
3 skills
skill name
rating/proficiency


 */