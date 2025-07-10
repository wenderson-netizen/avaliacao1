import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] notas = new double[2][2]; // [semestre][bimestre]
        double[] mediaBimestral = new double[4];
        double[] mediaSemestral = new double[2];
        double mediaFinal;

        // Coleta das notas
        System.out.println("Digite as notas dos bimestres:");
        for (int semestre = 0; semestre < 2; semestre++) {
            for (int bimestre = 0; bimestre < 2; bimestre++) {
                System.out.printf("Nota do %dº bimestre do %dº semestre: ", 
                    (bimestre + 1), (semestre + 1));
                notas[semestre][bimestre] = scanner.nextDouble();
            }
        }

        // Cálculo das médias bimestrais
        int index = 0;
        for (int semestre = 0; semestre < 2; semestre++) {
            for (int bimestre = 0; bimestre < 2; bimestre++) {
                mediaBimestral[index++] = notas[semestre][bimestre];
            }
        }

        // Cálculo das médias semestrais
        for (int semestre = 0; semestre < 2; semestre++) {
            mediaSemestral[semestre] = (notas[semestre][0] + notas[semestre][1]) / 2;
        }

        // Cálculo da média final
        mediaFinal = (mediaSemestral[0] + mediaSemestral[1]) / 2;

        // Apresentação dos resultados
        System.out.println("\n--- Resultados ---");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Média do %dº bimestre: %.2f\n", (i + 1), mediaBimestral[i]);
        }
        for (int i = 0; i < 2; i++) {
            System.out.printf("Média do %dº semestre: %.2f\n", (i + 1), mediaSemestral[i]);
        }
        System.out.printf("Média Final: %.2f\n", mediaFinal);

        scanner.close();
    }
}
