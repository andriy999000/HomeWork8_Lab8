package com.google;

public class Book {
    private static final String nameClass = "Book";
    private static final String namelibraryThisBook = "С библиотеки Brain Academy";
    private int pages;
    private String name;
    private int pageNum;






    public void setPage(int value,boolean printTF){
        if (value <= pages && value > 0){

            this.pageNum = value;

            if (printTF == true){
                System.out.printf("This is page " + pageNum);
            }

        }else{
            System.out.printf("Страница ненайдена или не сушествует\nERROR CODE: 404");
        }


    }









    //

    public void setInt(int key ,int value) {
        switch (key){
            case 1: this.pages = value;
        }


        //        pages = pages;
    }


    public void setStr(int key ,String value) {


        switch (key){
            case 1:
                this.name = value;
                break;

        }
    }



    public int getInt(int key){
        switch (key){
            case 1:
                return this.pages;


            default:
                return -1;

        }
    }


    public String getStr(int key){
        switch (key){
            case 1:
                return this.name;



            default:
                return "Error";


        }
    }



    public void Info(int key){
        switch (key){
            case 1:
                System.out.print("name = ");
                System.out.println(this.name);
                break;


            case 2:
                System.out.print("pages = ");
                System.out.println(this.pages);
                break;


        }


    }
}
