package StucturesClass;
import java.util.Scanner;
import java.text.DecimalFormat;
public class HwOneWordAnalyzer {

//Implement the methods: minWordLength(), maxWordLength(), wordLengthRange(), averageWordLength(), and mostCommonWordLength()
//They should be called in this order from within the main method using the given input array. However, they must return correct results even for different inputs.
    public static int minWordLength(String[] words, int arrLength)
    {
        if (words.length==0)
        {
            return -1;
        }
        int min=words[0].length();
        for(int i=1;i<arrLength;i++)
        {
            if(min>words[i].length())
                min=words[i].length();
        }
        return min;
    }
    public static int maxWordLength(String[] words, int arrLength)
    {
        if (words.length==0)
        {
            return -1;
        }
        int max=words[0].length();
        for(int i=1;i<arrLength;i++)
        {
            if(max<words[i].length())
                max=words[i].length();
        }
        return max;
    }
    public static int wordLengthRange(String[] words, int arrLength)
    {
        if (words.length==0)
        {
            return -1;
        }
        //Uses prior min and max methods to calculate the range
        return maxWordLength(words,arrLength)-minWordLength(words,arrLength);
    }
    public static String averageWordLength(String[] words, int arrLength)
    {
        if (words.length==0)
        {
            return "-1";
        }
        DecimalFormat df=new DecimalFormat("#.00");
        double avg;
        double sum=0.00;
        for(int i=0;i<arrLength;i++)
            sum=sum+words[i].length();
        avg= sum/arrLength;
        String fmtavg = df.format(avg);
        return fmtavg;
    }
    public static int mostCommonWordLength(String[] words, int arrLength)
    {
        if (words.length==0)
        {
            return -1;
        }
        int[] length_counter = new int[101];
        int max_length = -1;
        int max = Integer.MIN_VALUE;

        //get count of all type of length from 1-100
        for (String word : words) {
            length_counter[word.length()]++;
            //store the max value and max_length value
            if (length_counter[word.length()] > max) {
                max = length_counter[word.length()];
                max_length = word.length();
            }
        }
        // if there's a draw
        for(int i=0;i<length_counter.length;i++){
            if(length_counter[i] == max){
                if(i != max_length)
                    return -1;
            }
        }
        return max_length;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter an array of words separated by spaces: ");
        String[] words = sc.nextLine().split(" ");
        int n = words.length;
        System.out.println(minWordLength(words,n));
        System.out.println(maxWordLength(words,n));
        System.out.println(wordLengthRange(words,n));
        System.out.println(averageWordLength(words,n));
        System.out.println(mostCommonWordLength(words,n));
        }
}
