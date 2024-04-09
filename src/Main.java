import java.util.Scanner;


public class Main
{
    //From char to Ascii Number
    public static int toAscii (char in)
    {
        int out = (int) in;
        //System.out.println(out);
        return out;
    }
    //From Number to Binary
    public static String toBinary (int in)
    {
        String out = Integer.toBinaryString(in);
        int missingZero = 8 - out.length();
        if (missingZero != 0)
        {
            for (int i=0;i<missingZero;i++)
            {
                out = "0" + out;
            }
        }
        //System.out.println(out);
        return out;
    }




    public static void main(String[] args)
    {
        //User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe den Text ein: ");
        String userInput = scanner.nextLine();
        System.out.println("Ascii Zeichen: " + userInput);

        //StringBuilder for Output of Ascii Numbers and binary
        StringBuilder asciiNumbers = new StringBuilder("Ascii Zahlen: ");
        StringBuilder asciiBinary = new StringBuilder("Ascii Binär: ");

        //Walk through the full User String
        while(!userInput.isEmpty())
        {
            //Convert to Ascii Number
            char currentChar = userInput.charAt(0);
            int asciiNumber = toAscii(currentChar);
            asciiNumbers.append(asciiNumber + " ");

            //Convert to Binary
            asciiBinary.append(toBinary(asciiNumber));
            //Reduce String length
            userInput = userInput.substring(1);
        }

        System.out.println(asciiNumbers.toString());
        System.out.println(asciiBinary.toString());

        String fullBianry = asciiBinary.toString();


        if (fullBianry.length() % 6 != 0)
        {
            System.out.println(fullBianry.length());
            int addZero = (fullBianry.length()+1) % 6;
            System.out.println(addZero);

            for (int i=0; i < addZero;i++)
            {
                fullBianry += "0";
            }
        }
        System.out.println(fullBianry);





    }





}