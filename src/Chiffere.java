import java.util.Scanner;

public class Chiffere

{
    private static char[] allChars = new char[]{
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',};

    private static String key = "key";

    private static int findIndex (char value)
    {
        for (int index = 0; index < allChars.length; index++) {
            if (allChars[index] == value) {
                return index;
            }
        }
        return -1;
    }

    private static void encode (int inputIndex, int keyIndex)
    {
        int encode = ((inputIndex+keyIndex)% 26);
        System.out.print(allChars[encode]);
    }

    private static void decode (int inputIndex, int keyIndex)
    {
        int encode = (((inputIndex-keyIndex)+26)%26);
        System.out.print(allChars[encode]);
    }

    public static void main (String [] args)
    {
        //User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe den Text ein: ");
        String userInput = scanner.nextLine();
        System.out.println("Ascii Zeichen: " + userInput);
        //Only lowerCase Letters are used
        userInput = userInput.toLowerCase();

        //
        while (key.length() < userInput.length())
        {
            key = key + key;
        }

        while(!userInput.isEmpty())
        {
            char userChar = userInput.charAt(0);
            char keyChar = key.charAt(0);
            int inputIndex = findIndex(userChar);
            int keyIndex = findIndex(keyChar);

            decode(inputIndex,keyIndex);

            userInput = userInput.substring(1);
            key = key.substring(1);
        }

    }
}
