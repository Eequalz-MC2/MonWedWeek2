import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LineSplitExample {

    public static void main(String[] args) throws IOException {
        var fileName = "jerseys.txt";
        var studentJerseys = Paths.get(fileName);
        var studentNames = new ArrayList<String>();
        var jerseyNumbers = new ArrayList<Integer>();
        var studentLines = Files.readAllLines(studentJerseys);//// read everything in that one list of string
        //String [] seperatedNames = studentLines.spliterator("\n");
        //Integer [] seperatedNumbers = studentLines.spliterator("\n");

        System.out.println("I think this is your list of names and numbers... ");
        for (var splitlinevariableLoop : studentLines) {  //I have to create a loop to keep going through the text. Get in the mindset of looping through stuff.
            var splitNames = splitlinevariableLoop.split(",");
            studentNames.add(splitNames[0]); //what does this do again?
            var jerseyNum = Integer.parseInt(splitNames[1]);
            jerseyNumbers.add(jerseyNum); //ask what is "add" is at the end of class?

            ////System.out.println(studentLines);

        }

        for (int i = 0; i < studentNames.size(); i++) {  //start with variable i and start with 0. I'm gonna keep looping until i is the size of list
            System.out.println("Student:  " + studentNames.get(i) + " Jersey Number: " + jerseyNumbers.get(i)); //this way we can look through two collection. IT'S THE OLD SCHOOL WAY

        }
    }
}
