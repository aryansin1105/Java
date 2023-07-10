public class StringReverseRecursion {
    public static int first = -1;
    public static int last = -1;
    public static void stringReverse(String str,char element,int index){
    if(index == str.length()){
        System.out.println(first);
        System.out.println(last);
        return;
    }
    char currentChar = str.charAt(index);
    if(currentChar == element){
        if(first == -1){
            first = index;
        }else{
            last = index;
        }
    }
    stringReverse(str,element,index+1);
    }
    public static void main(String args[]) {
    String s = "Lovely Professional";
    stringReverse(s,'e',0);
}
}