package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args){
        var studentNames = new ArrayList<String>(); // 1. Created a variable studentNames 2. Created a list that is a string 3
        var reader = new Scanner(System.in);//Created a LIST. I think what i said is wrong. This reads from command line, one at a time
        var userResponse = ""; // Variable for User Response
        while (!userResponse.equals("done")) { //while for the user input. if not equal "done" then keep asking that motha fu***ka!
            System.out.print("Type in the next student name or \'done\' to exit: "); // We gotta promt the user some how !!!SCRATCH THATTTTTT. KEEP ASKING THE USER THE SAME QUESTION UNTIL WE GET A RESSPONSE.
            userResponse = reader.nextLine(); // THIS READS EACH LINE TYPED BY USER?? READ EACH USER REPSONSE AND STORE IT!!!!!!!! STORE IT!
            if (userResponse.equals("done")){
                break;// A while loop and we have to put our conditions inside the parenthesis ! IS IF NOT THE SYMBOL "!" MEANS WE DONT WANT IT As long as the user response is not it will keeo doing this.
            }

            studentNames.add(userResponse);

        }

        System.out.println("All of your students in the class are below:");
         for (var studentName : studentNames){
             System.out.println(studentName);// Only double qoutes work not single qoutes like 'Blahh Blahhh'
         }



    }
}
