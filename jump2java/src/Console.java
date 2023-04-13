/* 1byte reading
import java.io.IOException;
import java.io.InputStream;

public class Console {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        int a;
        a = in.read(); // 1바이트 입력 ㄴ
        System.out.println(a);
    }
}
*/


//bytes reading
import java.io.IOException;
import java.io.InputStream;

public class Console {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;//InputStream 객체

        byte[] a = new byte[3];
        in.read(a);
        for (int i = 0; i < 3; i++)
            System.out.println(a[i]);
    }
}


/*
// Char Stream Reading

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Console {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        char[] a = new char[3];
        reader.read(a);

        for (int i = 0; i < 3; i++)
            System.out.println(a[i]);
    }
}
*/
/*
// String Readline
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Console {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String a = br.readLine();
        System.out.println(a);
    }
}
*/
/*
// Scanner Reference Code

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());
    }
}
*/
