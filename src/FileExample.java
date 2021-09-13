import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExample {
    public static void main(String[] args) throws IOException {
        var filename = "student.txt";
        var studentFile= Paths.get(filename); //we need a pathway to the file
        var allstudents =Files.readString(studentFile); // Now read that file
        String [] seperatedNames = allstudents.split("\n");
                //now lets show the user
        System.out.println("Here are the students in your class:");
        for(var studentName: seperatedNames){
             System.out.println(studentName);
        }


    }// IO Exception. IM not handling it
}
