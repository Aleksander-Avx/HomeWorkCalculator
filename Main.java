package Calculator;

public class Main {
    public static void main ( String[] args ) {

        Calculator calc = Calculator.instance.get ( );

        // Ошибка деления на 0 , с помощью try/cache обрабатываем ошибку
        try {
            int a = calc.plus.apply ( 1 , 2 );
            int b = calc.minus.apply ( 1 , 1 );
            int c = calc.devide.apply ( a , b );
            calc.println.accept ( c );
            calc.println.accept ( a );
            calc.println.accept ( b );
        } catch (ArithmeticException e) {
            System.out.println ( "Арифметическая ошибка\n" + e.getMessage ( ) );
        }
    }

}

