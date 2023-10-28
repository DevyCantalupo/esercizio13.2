public class esercizio13di2 {
    public static void stampaOccorrenze(char[] array) {
        boolean occorrenze = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a') {
                System.out.println("a in " + i);
                occorrenze = true;
            }
        }

        if (!occorrenze) {
            System.out.println('0');
        }
    }

    public static void main(String[] args) {
        char[] arrayChar = {'a', 'a', 'b', 'c', 'd', 'a'};
        stampaOccorrenze(arrayChar);
    }
}
