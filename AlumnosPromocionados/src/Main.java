import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] informacion = {{"cris", "6.5", "7.5", "8"},{"ana", "3.4", "4.4", "3"},{"carlos", "7.8", "5", "9.9",}};
        boolean[] resultados = new boolean[informacion.length];
        for (int i =0; i<informacion.length; i++) {
            for (int j=0; j<informacion[i].length; j++){
                double notaTeoria = (Double.parseDouble(informacion[i][1]) + Double.parseDouble(informacion[i][2]))/2;
                double notaFinal = notaTeoria*0.4 + Double.parseDouble(informacion[i][3])*0.6;
                if (notaFinal >=5) {
                    resultados[i] = true;
                }
                else {
                    resultados[i] = false;
                }
            }
        }
        for (int i =0; i< resultados.length; i++) {
            if (resultados[i]) {
                System.out.println("El alumno " + informacion[i][0] + " ha aprobado");
            }
            else {
                System.out.println("El alumno " + informacion[i][0] + " no ha aprobado");
            }
        }
    }
}