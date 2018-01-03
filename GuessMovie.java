import java.util.Scanner;

public class GuessMovie {
    public static void main(String[] args){
        String movie = "Inception";
        int n = movie.length();
        char[] movieArray = movie.toCharArray();

        char[] movieMask = new char[n];
        for(int i = 0; i < n; i++){
            movieMask[i] = '-';
        }

        int guesses = 10;
        String guessList = "";
        String guessResult = "";

        System.out.println("Welcome to 'Guess That Film.' Guess a letter, and we'll tell you if you're right!");

        while(!(guessResult.equals(movie)) && guesses > 0) {
            Scanner reader = new Scanner(System.in);
            char guess = reader.next().charAt(0);

            for (int i = 0; i < n; i++) {
                if (movieArray[i] == guess) {
                    movieMask[i] = movieArray[i];
                }
            }
            guessResult = new String(movieMask);
            guesses--;
            guessList = guessList + String.valueOf(guess) + " ";
            System.out.println(guessResult);
            if(guessResult.equals(movie)) {
                System.out.print("Congratulations! You won!");
                break;
            }
            System.out.println("So far, you have guessed " + guessList);
            System.out.println("You have " + guesses + " left.");

        }
        System.out.println("Sorry, looks like you lost. :(");
    }
}

