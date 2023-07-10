public class Subsequences {
    public static void subsequences(String str,int index,String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        subsequences(str,index+1,newString+currentChar);
        subsequences(str,index+1,newString);
    }
    public static void main(String args[]) {
      String s = "abc";
      subsequences(s,0,"");
    }
}