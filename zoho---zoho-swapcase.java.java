import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            int d=(int)str.charAt(i)^32;
            System.out.print((char)d);
        }
    }
}

/*Output:

   zOhO
   ZoHo*/
