package com.company;
import java.util.ArrayList;

/**
 * Prints email domains for the incoming sting like "ya@yahoo.com; on@mail.ru; ona@gmail.com;"
 */
public class EmailAssignment {

    private static void emailInfo(String emails) {

        char currentSymbol;
        int nextSymbolIndex = 0;
        ArrayList<String> emailsArrayList = new ArrayList<>();

        for (int i = 0; i < emails.length(); i++) {
            currentSymbol = emails.charAt(i);
            if (currentSymbol == ';') {
                emailsArrayList.add(emails.substring(nextSymbolIndex, i));
                nextSymbolIndex = i + 2;
            }
        }

        for (String emailAddress : emailsArrayList) {
            int atSignIndex = 0;
            int dotSignIndex;
            for (int i = 0; i < emailAddress.length(); i++) {
                currentSymbol = emailAddress.charAt(i);
                if (currentSymbol == '@'){
                    atSignIndex = i+1;
                }
                if (currentSymbol == '.'){
                    dotSignIndex = i;
                    System.out.println(emailAddress.substring(atSignIndex, dotSignIndex));
                }

            }

        }
    }

        public static void main (String[]args){
            emailInfo("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
        }
    }
