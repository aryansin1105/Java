public class StringExample {
    public static void stringExample(String str,int index,int count,String newString){
        if(index == str.length())
        {
            for(int i=0;i<count;i++)
            newString = newString + 'x';
            System.out.println(newString);
            return;
        }
        if(str.charAt(index) == 'x'){
        count++;
        stringExample(str,index+1,count,newString);
        }
        else{
        newString = newString + str.charAt(index);
        stringExample(str,index+1,count,newString);
        }
    }
    public static void main(String args[]) {
    String s = "axbcxxxdexf";
    stringExample(s,0,0,"");
}
}