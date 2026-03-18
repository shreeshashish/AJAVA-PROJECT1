import java.util.Scanner;

public class Pro5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] ch_arr = str.toCharArray();
        int length = str.length();
        char[] freq_chars = new char[length];
        int[] frequency = new int[length];
        boolean isNew;
        int k = 0;

        for(int i=0; i<length; i++) {
            isNew = true;
            for(int j=i-1; j>=0; j--) {
                if(ch_arr[i]==ch_arr[j]) {
                    isNew = false;
                    break;
                }
            }

            if(isNew == true) {
                freq_chars[k] = ch_arr[i];
                for(int j=0; j<length; j++) {
                    if(freq_chars[k]==ch_arr[j]) {
                        frequency[k]++;
                    }
                }
                k++;
            }
        }

        int most_freq = 0, second_freq = 0;
        for(int i=0; i<k; i++) {
            if(frequency[i] > most_freq) {
                second_freq = most_freq;
                most_freq = frequency[i];
            }
            else if(frequency[i] > second_freq && frequency[i] < most_freq) {
                second_freq = frequency[i];
            }
        }

        if(second_freq==0) {
            System.out.println("The second most frequent character doesn't exist in the string.");
        }
        else {
            System.out.println("The second most frequent character(s) in the string is/are:");
            for(int i=0; i<=k; i++) {
                if(frequency[i]==second_freq) {
                    System.out.println(freq_chars[i]);
                }
            }
        }

        sc.close();
    }
}