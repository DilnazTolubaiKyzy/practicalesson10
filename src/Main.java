import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println(method(s));
//
//    }
//   public   static String method(String name){
//        return "HELLO"+name.toUpperCase();
//        Scanner sc = new Scanner(System.in);
//        System.out.println(method(sc.nextLine(), sc.nextLine()));
//    }
//    public static String method(String a,String b){
//        if(a.contains(b)){
//            return "Есть совпадение";
//        }else {
//        }
//        return "Нет совпадение";
        method("Dilnaz","Aidai","Anel","Jeck");

    }
    public static void method(String...name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].length() %2==0) {
                System.out.println(name[i].toUpperCase());


            }
        }

    }

    }