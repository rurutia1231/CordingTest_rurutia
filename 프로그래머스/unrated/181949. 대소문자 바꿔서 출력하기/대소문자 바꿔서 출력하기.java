import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str = "";
        for(int i = 0; i<a.length(); i++){
            char C = a.charAt(i);
            if(Character.isLowerCase(C)){
                str+=Character.toUpperCase(C);}
        else{
            str+=Character.toLowerCase(C);
        }
            }
         System.out.println(str);
        }
    }
