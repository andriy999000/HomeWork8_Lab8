package com.google;

import java.sql.SQLOutput;
import java.util.Arrays;

public class PostOffice {
    private static final String nameClass = "PostOffice";
    private static final String company = "Новая Почта";
    private String address;
    private String town;
    private String country;
    private String[] list;

    public void setList(String[] sp){
        list =  Arrays.copyOf(sp, sp.length);


    }

    public void getlist(){
        System.out.println(Arrays.toString(list));
    }


    public void setInt(int key ,int value) {
        System.out.println("System Error(setInt): no int value in this class");
//        switch (key):
//            case 1: this.value = value;
//
//        default:
//            System.out.println("System Error(setInt): no int value in this class");




    }


    public void setStr(int key ,String value) {


        switch (key){
            case 1:
                this.address = value;
                break;

            case 2:
                this.country = value;
                break;

            case 3:
                this.town = value;
                break;

        }
    }



    public int getInt(int key){
        return -1;
//        switch (key){
//            case 1:
//                return this.value;
//      }
//
//            default:
//                return -1;

        }



    public String getStr(int key){
        switch (key){
            case 1:
                return this.address;

            case 2:
                return this.country;


            case 3:
                return this.town;



            default:
                return "Error";


        }
    }



    public void Info(int key){
        switch (key){
            case 1:
                System.out.print("address = ");
                System.out.println(this.address);
                break;


            case 2:
                System.out.print("country = ");
                System.out.println(this.country);
                break;


            case 3:
                System.out.print("town = ");
                System.out.println(this.town);
                break;

            default:
                System.out.println("Error(Info): this key does not exist");

        }


    }
}
