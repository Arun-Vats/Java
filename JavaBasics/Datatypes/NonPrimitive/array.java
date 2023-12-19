package JavaBasics.Datatypes.NonPrimitive;
import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        
        int[] marks = {97,98,95};
        System.out.println(marks[0]);
        System.out.println(marks.length);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        int[][] finalmarks = {{63,71},{67,77}};
        System.out.println(finalmarks[1][1]);
    }
}
