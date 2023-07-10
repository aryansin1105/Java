public class RecursiveString {
    public static void stringReverse(String str,int index){
        if(index == 0){
        System.out.println(str.charAt(index));
        return;
    }
    System.out.println(str.charAt(index));
    stringReverse(str,index-1);
    }
    public static void main(String args[]) {
    String s = "Lovely Professional";
    stringReverse(s,s.length()-1);
}
}