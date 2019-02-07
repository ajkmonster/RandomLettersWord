import java.util.*;

public class RandomLettersWord {
    private static String[] arrayAlpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private static ArrayList<String> wordbuilder = new ArrayList<>();
    private static int newInput;
    public static void main(String[] args) {
        userInput();
        word();
        printer();
        checker();
    }

    public static void userInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter how long you want the word to be: ");
        newInput = input.nextInt();
    }
    public static void word(){
        for (int i =1;i<=newInput; i++){
            Random number = new Random();
            int Randnum = number.nextInt(arrayAlpha.length);
            wordbuilder.add(arrayAlpha[Randnum]);
        }
    }
    public static void printer(){
        for (String i: wordbuilder){
            System.out.print(i);
        }
    }
    public static void checker(){
        Collections.sort(wordbuilder);
        int a = Collections.binarySearch(wordbuilder,"a");
        int e = Collections.binarySearch(wordbuilder, "e");
        int i = Collections.binarySearch(wordbuilder, "i");
        int o = Collections.binarySearch(wordbuilder,"o");
        int u = Collections.binarySearch(wordbuilder, "u");
        if (a >= 0 || e >= 0 || i>=0 || o>=0 || u>= 0) {
            System.out.println("This maybe is a word");
        } else {
            System.out.println("This is not a word");
        }
//            below is another way with regular arrays
//            String[] lettersInWord = word().split("");
//        System.out.println(lettersInWord);
//        for (int x = 0; x <lettersInWord.length; x++){
//            if (lettersInWord[x].equalsIgnoreCase("a") || lettersInWord[x].equalsIgnoreCase("e")|| lettersInWord[x].equalsIgnoreCase("i")
//                    || lettersInWord[x].equalsIgnoreCase("o") || lettersInWord[x].equalsIgnoreCase("u")) {
//                contains = true;
//            }
//        }
//        if (contains) {
//            System.out.println("This maybe is a word.");
//        } else {
//            System.out.println("This is not a word.");
//        }
    }
}
