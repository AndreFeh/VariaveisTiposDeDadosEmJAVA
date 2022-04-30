package Aula_3;

public class Precedencias {

    public static void main (String[] args){
        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmetico");
        aritmetico();
        System.out.println("Atribuicao");
        atribuicao();
    }

    private static void prePos(){
        int k = 10;

        int i = ++k; //ele soma o +1 depois apresenta o valor 10+1
        int j = k--; //apresenta o valor 11 e depois ele soma o +1
        int x = k; //vai apresentar o valor depois de feito as somas

        System.out.println("i = ++k = " + "\t" + i);
        System.out.println("j = k-- = " + "\t" + j);
        System.out.println("x = k = " + "\t" + x);
    }
    private static void aritmetico(){

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("a+b = " + r1);
        System.out.println("c-a = " + r2);
        System.out.println("d*b = " + r3);
        System.out.println("e/a = " + r4);
        System.out.println("c%b = " + r5);
    }
    private static void atribuicao(){ //simples e compostas

        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5F;
        double d = f;

        System.out.println("d" + d);

        i += 5;     // i = i + 5
        j -= 5;     // j = j - 5
        d /= 2.7D;  // d = d / 2.7D
        l *= 3;     // l = l * 3
        k %= 2;     // k = k % 2

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("d = " + d);
        System.out.println("l = " + l);
        System.out.println("k = " + k + "\n");

        i = k = j;

        System.out.println("k: " + k);
        System.out.println("i: " + i);

    }

}

