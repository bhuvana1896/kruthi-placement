public class StringPalindrome{
    public static void main(String[]args){
        String str="RACECAR";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }
        if(str.equals(rev)){
            System.out.println("YES IT IS A PALINDROME");

        }
        else{
            System.out.println("NO,IT IS NOT A PALINDROME");
        }
    }
}