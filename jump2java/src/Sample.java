// Q1. 평균점수 구하기
/*
public class Sample {
    public static void main(String[] args) {
        Integer[] grades = new Integer[3];
        grades[0] = 80;
        grades[1] = 75;
        grades[2] = 55;

        Integer avg = 0;
        for (int i = 0; i < 3; i++) {
            avg += grades[i];
        }
        avg /= 3;
        System.out.println(avg);
    }
}
*/

// Q2. 자연수 13이 홀수 짝수 여부
/*
import java.io.InputStream;
import java.io.IOException;
public class Sample {
    public static void main(String[] args) throws IOException {
        InputStream inputnum = System.in;
        int val = inputnum.read();
        if (val % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}*/

// Q3. 주민등록번호 파싱 홍길동 씨의 주민등록번호는 881120-1068234이다. 홍길동 씨의 주민등록번호를 연월일(YYYYMMDD) 부분과 그 뒤의 숫자 부분으로 나누어 출력해 보자.z
/*
import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);
        String val = scanned.nextLine();
        System.out.println(val.indexOf("-") - 1);
        System.out.println(val.substring(0, val.indexOf("-")));
        System.out.println(val.substring(val.indexOf("-") + 2));
    }
}*/

// Q6. 리스트 값 뒤집기
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class Sample {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
//        System.out.println(list);
//
//
//        list.sort(Comparator.reverseOrder());
//        System.out.println(list);
//    }
//}

// for each statement 작성해보기
/*
import java.util.ArrayList;

public class Sample {
    public static void main(String[] args) {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        ArrayList<Integer> newMarks = new ArrayList<>();

        for (int i = 0; i < marks.length; i++) {
            newMarks.add(marks[i]);
        }
        System.out.println(newMarks);
        Integer Avg = 0;
        for (Integer number:newMarks) {
            Avg += number;
        }
        Avg /= marks.length;
        System.out.print("평균 값 : ");
        System.out.println(Avg);
    }
}*/

class Animal {
    String name;
    int    age;
    String hi() {
        return "hi";
    }
    Animal (int age){
        this.age = age;
        name = "default";
    }
    Animal (String name) {
        this.name = name;
    }
}

public class Sample {
    public static void main(String[] args) {
        Animal cat = new Animal("hello");
        System.out.println(cat.name);
        System.out.println(cat.hi());
    }
}