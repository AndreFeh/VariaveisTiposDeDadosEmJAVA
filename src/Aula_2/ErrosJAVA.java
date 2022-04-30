package Aula_2;

public class ErrosJAVA {

    public static void main(String[] args) {

//    Ignorando Regras basicas
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
//    short s2 = 40000; Excede o tamanho da variavel

//    int i1 = -10000000000;
        int i2 = 28500;

//    long l1 = 100000000000000000; da erro por ser inteiro no long
        long l2 = 100000000000000000L; // Itentificar quem é inteiro e que em long
        long l3 = 200400500500055000L;
//    ^^^ Valores Inteiros

//    float f1 = 4.5;
        float f2 = 10.68F;

        double d1 = 85.69;
        double d2 = 99.04D;

        char c1 = 'W';
//    char c2 = 'Tw';
        char c3 = '\u0057';

        String st1 = "Fulano1";
        String st2 = "Fulano2";

//    String dt1 = "09/02/1981";

        boolean bo1 = true;
        boolean bo2 = false;
    }
}
