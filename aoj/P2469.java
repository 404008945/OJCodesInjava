package aoj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.deepToString;

public class P2469 {
    static boolean LOCAL = System.getSecurityManager() == null;
    static boolean TO_FILE = true;
    Scanner cin = new Scanner(System.in);

    void run() {
       int []A= new int[cin.nextInt()];
        for (int i = 0; i < A.length; i++) {
            A[i]=cin.nextInt();
        }
        Arrays.sort(A);
        for(int i=A.length-1;i>=0;i--)
            System.out.print(A[i]+" ");
        System.out.println();
        //debug(A);
    }

    void debug(Object... os) {
        System.err.println(deepToString(os));
    }

    public static void main(String[] args) {
        if (LOCAL) {
            try {
                System.setIn(new FileInputStream("in.txt"));
            } catch (Throwable e) {
                LOCAL = false;
            }
        }
        if (TO_FILE) {
            try {
                System.setOut(new PrintStream("output.txt"));
            } catch (FileNotFoundException e) {
                TO_FILE = false;
            }
        }
        new P2469().run();
    }
}