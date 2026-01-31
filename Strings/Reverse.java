// Reverse a string 
//Intution , convert string to array of characters, revese using temp

import java.util.*; 
class Main{
public static String Reverse(String s){
    char[] arr = s.toCharArray(); 
    int l = 0 ;
    int r = arr.length-1;
    while(l < r) {
        char t = arr[r];
        arr[r] = arr[l];
        arr[l] = t;
        l++ ; r--;
    }
    return new String(arr);
}
public static void main(String args[])  {
    Scanner sc = new Scanner(System.in); 
    String str = sc.nextLine();
    System.out.println(Reverse(str)); 
}
    
}
