package com.company;

public class EmailAssignment {
    static void emailInfo(String emails){
        char c1;
        for(int i=0;i<emails.length();i++){
            c1=emails.charAt(i);
            if(c1=='@'){
                System.out.println(emails);
            }
        }
    }

    public static void main(String[] args) {
        emailInfo("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}
