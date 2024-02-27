
import java.time.LocalDate;


public class calendario {
    public static void main(String[] args) {
        // Obter o primeiro dia do mês atual
        LocalDate firstDayOfMonth = LocalDate.now().withDayOfMonth(1);
        
        // Obtém o número de dias no mês atual
        int numDaysInMonth = firstDayOfMonth.lengthOfMonth();
        
        // Obtém o dia da semana em que o primeiro dia do mês cai (1 = segunda-feira, 7 = domingo)
        int firstDayOfWeek = firstDayOfMonth.getDayOfWeek().getValue();
        
        // Imprime o cabeçalho do calendário
        System.out.println("Dom Seg Ter Qua Qui Sex Sáb");
        
        // Imprime espaços para os dias antes do primeiro dia do mês
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }
        
        // Imprime os números dos dias do mês
        for (int day = 1; day <= numDaysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((firstDayOfWeek + day - 1) % 7 == 0 || day == numDaysInMonth) {
                System.out.println();
            }
        }
    }
}