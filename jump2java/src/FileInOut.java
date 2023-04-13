/*
// File OutputStream
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOut {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("./testfile");

        for(int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다.\n";
            output.write(data.getBytes());
        }

        output.close();
    }
}
*/
/*
//FileWriter
import java.io.FileWriter;
import java.io.IOException;

public class FileInOut {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("./test2.md");
        for(int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다.\n<br>";
            fw.write(data);
        }
        fw.close();
    }
}
 */
/*
//PrintWriter
import java.io.PrintWriter;
import java.io.IOException;

public class FileInOut {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("./test3.md");
        for(int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다.<br>";
            pw.println(data);
        }
        pw.close();
    }
}
 */
import java.io.FileWriter;
import java.io.IOException;

public class FileInOut {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("./test4.md");
        for(int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다.<br>";
            fw.write(data);
        }
        fw.close();

        FileWriter fw2 = new FileWriter("./test4.md", true);
        for(int i = 11; i < 21; i++) {
            String data = i + "번째 줄입니다.<br>";
            fw2.write(data);
        }
        fw2.close();
    }
}