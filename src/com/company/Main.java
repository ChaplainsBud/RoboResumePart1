package com.company;

// Last feature: Ensure all fields have been entered, minimally

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

// Polya Part 2: Create a Resume class, constructor, create it in main...
// and... use Scanner to set all the properties, add to ArrayList, then display list
// GETTERS: to display, instead of indexing array?
// SETTERS: do I need an Array or ArrayList, and set... to change data inside?
//        Scanner sc = new Scanner(System.in);


            ArrayList<String> data = new ArrayList<String>();

            Scanner sc = new Scanner(System.in);

                System.out.println("Enter a name: ");
                String name = sc.nextLine();
                if(name.equals("")){
                    System.out.println("Please enter a real name");
                    name = sc.nextLine();
                }
                data.add(name);
                System.out.println("Enter an email address: ");
                String email = sc.nextLine();
                if(email.equals("")){
                    System.out.println("Please enter a valid email address: ");
                    email = sc.nextLine();
                }
                data.add(email);
                System.out.println("Enter highest diploma: ");
                String diploma = sc.nextLine();
                if(diploma.equals("")){
                    System.out.println("Please enter an actual diploma: ");
                    diploma = sc.nextLine();
                }
                data.add(diploma);
                System.out.println("Enter major ");
                String major = sc.nextLine();
                if(major.equals("")) {
                    System.out.println("Please enter an actual major: ");
                    major = sc.nextLine();
                }
                data.add(major);
                System.out.println("Enter university name: ");
                String uni = sc.nextLine();
                if(uni.equals("")){
                    System.out.println("Please enter an actual school name: ");
                    uni = sc.nextLine();
                }
                data.add(uni);
                System.out.println("Enter graduation year: ");
                String yr = sc.nextLine();
                if(yr.equals("")){
                    System.out.println("Please enter an actual year: ");
                    yr = sc.nextLine();
                }
                data.add(yr);
                System.out.println("Enter company: ");
                String co = sc.nextLine();
                if(co.equals("")){
                    System.out.println("Please enter an actual company: ");
                    co = sc.nextLine();
                }
                data.add(co);
                System.out.println("Enter job title: ");
                String ti = sc.nextLine();
                if(ti.equals("")){
                    System.out.println("Please enter an actual job title: ");
                    ti = sc.nextLine();
                }
                data.add(ti);
                System.out.println("Enter start date: ");
                String start = sc.nextLine();
                if(start.equals("")){
                    System.out.println("Please enter an accurate start date: ");
                    start = sc.nextLine();
                }
                data.add(start);
                System.out.println("Enter end date: ");
                String end = sc.nextLine();
                if(end.equals("")){
                    System.out.println("Please enter an accurate end date: ");
                    end = sc.nextLine();
                }
                data.add(end);
                System.out.println("Enter job description: ");
                String desc = sc.nextLine();
                if(desc.equals("")){
                    System.out.println("Please enter a real job description: ");
                    desc = sc.nextLine();
                }
                data.add(desc);
                System.out.println("Enter skill 1: ");
                String sk1 = sc.nextLine();
                if(sk1.equals("")){
                    System.out.println("Please enter a real skill: ");
                    sk1 = sc.nextLine();
                }
                data.add(sk1);
                System.out.println("Enter rating/ranking: ");
                String rk1 = sc.nextLine();
                if(rk1.equals("")){
                    System.out.println("Please enter a real rank: ");
                    rk1 = sc.nextLine();
                }
                data.add(rk1);
                System.out.println("Enter skill 2: ");
                String sk2 = sc.nextLine();
                if(sk2.equals("")){
                System.out.println("Please enter a real skill: ");
                sk2 = sc.nextLine();
                }
                data.add(sk2);
                System.out.println("Enter rating/ranking: ");
                String rk2 = sc.nextLine();
                if(rk2.equals("")){
                    System.out.println("Please enter a real rank: ");
                rk2 = sc.nextLine();
                }
                data.add(rk2);
                System.out.println("Enter skill 3: ");
                String sk3 = sc.nextLine();
                if(sk3.equals("")){
                System.out.println("Please enter a real skill: ");
                sk3 = sc.nextLine();
                }
                data.add(sk3);
                System.out.println("Enter rating/ranking: ");
                String rk3 = sc.nextLine();
                if(rk3.equals("")){
                System.out.println("Please enter a real rank: ");
                rk3 = sc.nextLine();
                }
                data.add(rk3);

                Applicant app = new Applicant(name, email, diploma, major, uni, yr, co, ti, start, end, desc, sk1, rk1, sk2, rk2, sk3, rk3);

            System.out.println("=============================================================");
            System.out.println(app.getName());
            System.out.println(app.getEmail());
            System.out.println("");
            System.out.println("");
            System.out.println("Education");
            System.out.println(app.getDiploma() + " in " + app.getMajor());
            System.out.println(app.getUni() + " , " + app.getYr());
            System.out.println("");
            System.out.println("");
            System.out.println("Experience");
            System.out.println(app.getCo());
            System.out.println(app.getTi() + " , from " + app.getStart() + " to " + app.getEnd());
            System.out.println("Duty 1 " + app.getDesc());
            System.out.println("");
            System.out.println("");
            System.out.println("Skills");
            System.out.println(app.getSk1() + " , " + app.getRk1());
            System.out.println(app.getSk2() + " , " + app.getRk2());
            System.out.println(app.getSk3() + " , " + app.getRk3());

          }

        }




        // check ArrayList for any empty indexes; if a single empty space, redo

    // how do I populate the constructor with data?

       // System.out.println(app.getName());

//        System.out.println(data.get(0));
//        System.out.println(data.get(1));
//        System.out.println("");
//        System.out.println("");
//        System.out.println("Education");
//        System.out.println(data.get(2) + " in " + data.get(3));
//        System.out.println(data.get(4) + " , " + data.get(5));
//        System.out.println("");
//        System.out.println("");
//        System.out.println("Experience");
//        System.out.println(data.get(6));
//        System.out.println(data.get(7) + " , from " + data.get(8) + " to " + data.get(9));
//        System.out.println("Duty 1 " + data.get(10));
//        System.out.println("");
//        System.out.println("");
//        System.out.println("Skills");
//        System.out.println(data.get(11) + " , " + data.get(12));
//        System.out.println(data.get(13) + " , " + data.get(14));
//        System.out.println(data.get(15) + " , " + data.get(16));





/*

i. Can I do a while loop, while unfinished: true;
loop back through q's until everyone is answered

ii. Then, I'd like to for loop the arrayList,
into four sections of a resume = if(){}


 */