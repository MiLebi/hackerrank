import java.text.SimpleDateFormat;
        import java.util.Scanner;

public class DatFormat {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
        System.out.println(displayFormat.format(parseFormat.parse(in.next())));
    }
}
