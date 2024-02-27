import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculadoraDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a data de nascimento do usuário
        System.out.print("Digite sua data de nascimento (no formato DD/MM/AAAA): ");
        String dataNascimentoStr = scanner.nextLine();

        // Converter a string para um objeto LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);

        // Imprimir a data de nascimento formatada
        System.out.println("Você nasceu em " + dataNascimento.format(formatter) + ".");

        // Calcular e imprimir a idade em dias
        long diasVividos = calcularDiasVividos(dataNascimento);
        System.out.println("Você já viveu " + diasVividos + " dias.");

        scanner.close();
    }

    // Método para calcular a diferença de dias entre a data de nascimento e a data atual
    private static long calcularDiasVividos(LocalDate dataNascimento) {
        return ChronoUnit.DAYS.between(dataNascimento, LocalDate.now());
    }
}
