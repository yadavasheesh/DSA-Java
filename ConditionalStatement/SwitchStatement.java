package ConditionalStatement;

public class SwitchStatement {
    public static void main(String[] args) {
        char ch='b';
        System.out.println(switch (ch) {
            case 'a' -> "samosa";
            case 'b' -> "Mango Shake";
            case 'c' -> "Paneer";
            default -> "We wake up";
        });
    }
}
