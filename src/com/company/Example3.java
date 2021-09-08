package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args){
        var studentNames = new ArrayList<String>();
        var reader = new Scanner(System.in);//Created a LIST
        var userResponse = ""; // Variable for User Response
        while (!userResponse.equals("done")) {
            System.out.print("Type in the next student name or 'done' to exit: "); // We gotta promt the user some how
            userResponse = reader.nextLine();
            if (userResponse.equals("done")){
                break;// A while loop and we have to put our conditions inside the parenthesis ! IS IF NOT THE SYMBOL "!" MEANS WE DONT WANT IT As long as the user response is not it will keeo doing this.
            }

            studentNames.add(userResponse);

        }

        System.out.println("All of your students in the class are below:"); // Only double qoutes work not single qoutes like 'Blahh Blahhh'



    }
}
