// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*; 

class Main {
    public static int RomanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1); 
        map.put('V',5); 
        map.put('X',10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int sum = 0; 
        for(int i = 0 ;i < s.length() ; i++) {
            int val = map.get(s.charAt(i));
            if(i+1 < s.length() && val < map.get(s.charAt(i+1))) {
                sum -= val; 
            }
            else {
                sum += val; 
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman Numeral: ");
        String str = sc.nextLine(); 
        System.out.println(RomanToInt(str));
    }
}