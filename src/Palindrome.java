public class Palindrome {
    public static void main(String[] args) {
        String str="ABA";
        String temp ="";
        char ch;
        for(int i = 0;i < str.length(); i++)
        {
            ch = str.charAt(i);
            temp = ch+temp;

        }
        System.out.println("original string:" +str);
        System.out.println("reversed string:" +temp);

        if (temp.equals(str)) {
            System.out.println("PALINDROME");
        } else
        {
            System.out.println("NOT PALINDROME");
        }
    }
}
