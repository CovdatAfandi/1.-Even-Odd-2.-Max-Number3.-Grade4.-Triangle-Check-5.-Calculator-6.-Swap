import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.Cut yoxsa tek

        System.out.println("Reqem daxil edin:");
        Scanner scanner= new Scanner(System.in);
        int a=scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Cut");
        } else {
            System.out.println("Tek");
        }
        // 2. Ededlerden boyuyunun secilmesi

        System.out.println("1-ci ededi daxil edin:");
        Scanner scanner1= new Scanner(System.in);
        int a1=scanner1.nextInt();
        System.out.println("2-ci ededi daxil edin:");
        int a2=scanner1.nextInt();
        System.out.println("3-cu ededi daxil edin:");
        int a3=scanner1.nextInt();
        if (a1 > a2 && a1 >  a3) {
            System.out.println("Birinci eded boyukdur.");
        } else if (a2>a1 && a2>a3) {
            System.out.println("Ikinci eded boyukdur.");
        }
        else {
            System.out.println("Ucuncu eded boyukdur.");
        }

        //3.Bal-qiymetleri

        System.out.println("Balinizi daxil edin:");
        Scanner scanner2= new Scanner(System.in);
        int b=scanner2.nextInt();
        if (b>=91){
            System.out.println("Qiymetiniz A dir.");
        } else if (b>=81) {
            System.out.println("Qiymetiniz B dir.");
        } else if (b>=71) {
            System.out.println("Qiymetiniz C dir");
        } else if (b>=61) {
            System.out.println("Qiymetiniz D dir");
        } else if (b>=51) {
            System.out.println("Qiymetiniz E dir");
        } else {
            System.out.println("Kesilmisiniz.");
        }

        //4.Ucbucaq berabersizliyi

        System.out.println("Ucbucagin 1-ci terefini qeyd edin:");
        Scanner scanner3=new Scanner(System.in);
        int c1=scanner3.nextInt();
        System.out.println("Ucbucagin 2-ci terefini qeyd edin:");
        int c2=scanner3.nextInt();
        System.out.println("Ucbucagin 3-cu terefini qeyd edin:");
        int c3=scanner3.nextInt();

        if (c1+c2>c3 && c2+c3>c1 && c3+c1>c2){
            System.out.println("Ucbucaqdir.");
        }
        else {
            System.out.println("Ucbucaq deyil.");
        }

        //5. Hesab emeliyyati
        System.out.println("1-ci ededi daxil edin:");
        Scanner scanner4 = new Scanner(System.in);
        int d = scanner4.nextInt();
        System.out.println("2-ci ededi daxil edin:");
        int f = scanner4.nextInt();
        System.out.println("Hesab emeliyyatini secin:1)Toplama 2)Cixma 3)Vurma 4)Bolme");
        int g = scanner4.nextInt();
        if (g == 1) {
            System.out.println("Cem:" + (d+f));
        } else if (g==2) {
            System.out.println("Ferq:" + (d-f));
        } else if (g==3) {
            System.out.println("Hasil:"+(d*f));
        } else {
            System.out.println("Qismet:"+(d/f));
        }

        //İki dəyişənin yerini dəyişmek

        int h=5;
        int i=6;
        h=h+i;
        i=h-i;
        h=h-i;
        System.out.println("i:"+(i));
        System.out.println("h:"+(h));

    }
}

