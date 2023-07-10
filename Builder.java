public class Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(1));

        //set char at index
        sb.setCharAt(0, 'H');
        System.out.println(sb);

        //insert method at pos
        sb.insert(0,'S');
        System.out.println(sb);

        //delete method is used to substring or char
        sb.delete(0, 2);//2 is exclusive
        System.out.println(sb);

        //append char at the end
        sb.append('Y');
        System.out.println(sb);

        System.out.println(sb.length());
        
        System.out.println(sb.reverse());

        StringBuffer sf = new StringBuffer("Ankit");
        System.out.println(sf);

        System.out.println(sf.length());
        System.out.println(sf.capacity());
        System.out.println(sf.replace(0,2,"Ma"));
        System.out.println(sf.append('y'));
        System.out.println(sf.indexOf("k"));
        System.out.println(sf.charAt(3));
    }
}
