public class calculate {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        switch (args[0]) {
            case "somar" -> sum(x, y);
            case "subtrair" -> minu(x, y);
            case "dividir" -> div(x, y);
            case "multiplicar" -> mult(x, y);
            default -> System.out.println(" Esse comando não existe");
        }

    }

    static void sum(int x, int y){
        System.out.println(x + y);
    }

    static void minu(int x, int y){
        System.out.println(x - y);
    }

    static void div(int x,int y){
        System.out.println(x / y);
    }

    static void mult(int x,int y){
        System.out.println(x * y);
        }
}
