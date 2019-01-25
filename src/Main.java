import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String []args) {

        String question = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter question: ");
        question = keyboard.nextLine();



        while (!question.equalsIgnoreCase("No")){

            System.out.println(question);
            String askquestion = keyboard.nextLine();


            String answers = rndm();

            System.out.println("YOU ASKED: " + askquestion);
            System.out.println("MAGIC 8-BALL SAYS: " + answers);

            System.out.println("Do you have another question for the Magic 8-Ball? (Yes/No)");
            question= keyboard.nextLine();
            System.out.println();

//            if (question.equalsIgnoreCase("Yes")){
//
//                System.out.println(question);

                System.out.println("Thank you for playing! ");

                keyboard.close();
                System.exit(0);



            }
        }
        public static String rndm (){
           Random rnd = new Random();
           int x = rnd.nextInt();

            ArrayList<String> answers = new ArrayList<>();
            answers.add("It is certain");
            answers.add("It is decidedly so");
            answers.add("Without a doubt");
            answers.add("Yes definitely");
            answers.add("You may rely on it");
            answers.add("As I see it, yes");
            answers.add("Most likely");
            answers.add("Outlook good");
            answers.add("Yes");
            answers.add("Signs point to yes");
            answers.add("Reply hazy try again");
            answers.add("Ask again later");
            answers.add("Better not tell you now");
            answers.add("Cannot predict now");
            answers.add("Concentrate and ask again");
            answers.add("Don't count on it");
            answers.add("My reply is no");
            answers.add("My sources say no");
            answers.add("Outlook not so good");
            answers.add("Very doubtful");

return answers.get(x);

        }
    }