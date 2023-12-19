package JavaBasics.Datatypes.NonPrimitive;

public class strings { 
    public static void main(String[] args) {
        //String is a non-primitive datatype
        String name = "Arun";
        String name2 = "Nikki";
        String name3 = name+" And "+name2;
        System.out.println(name3);
        System.out.println(name3.charAt(2));//charAt() is used to get the character for a specific position 
        System.out.println(name3.length()); //length() is used to get the length of the string
        String name4 = name3.replace('n','a'); //replace is used to replace the character
        System.out.println(name4);
        System.out.println(name3.substring(0,4));//substring is used to display a particular part of the string.
    }
}
