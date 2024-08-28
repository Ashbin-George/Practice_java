public class Main {
    public static void main(String[] args) {
         String str = "As";
         String temp = " ";
         char ch;
         for (int i=0;i<str.length();i++)
         {
             ch=str.charAt(i);
             temp=ch+temp;
         }
         System.out.println("reversed string:" +temp);
    }
}