import javax.swing.*;

public class Divider {
    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog(null, "Podaj liczbę");

        String divider = JOptionPane.showInputDialog(null, "Podaj dzielnik");
        int result;
        try {
            try {
                result = convertToInteger(number) / convertToInteger(divider);
                JOptionPane.showMessageDialog(null, String.format("Wynik dzielenia to %d", result));
            } catch (ArithmeticException e) {
                System.out.println("Błąd nie można dzielić przez zero");
            }
        } catch (NumberFormatException e) {
            System.out.println("Wprowadzono tekst a nie liczbe");
        }

    }

    private static int convertToInteger(String number){
        return Integer.parseInt(number);
    }
}
