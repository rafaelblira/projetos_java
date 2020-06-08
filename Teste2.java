public class Teste2 {
    public static void main(String[] args) {
        String[] cursos;
        cursos = new String[2];
        cursos[0] = "Sistemas";
        cursos[1] = "Internet";

        /*Definicao de array multidimensional */
        double[][] notas = new double[2][4];
        notas[0][0] = 8.0;
        notas[0][1] = 7.5;
        notas[0][2] = 9.0;
        notas[0][3] = 8.5;
        notas[1][0] = 9.5;
        notas[1][1] = 8.5;
        notas[1][2] = 8.0;
        notas[1][3] = 9.0;

        double media = 0.0;



        System.out.println("\n");
        /*println imprime linha em branco com a quebra de linha e salto de linha "\n" */
        System.out.println("Medias: ");

        for(int l = 0; l < notas.length; l++){
            for(int c = 0; c < notas[l].length; c++){
                System.out.println(l + " e " + c + " = " + notas[l][c] + "\t");
                /*print imprime as nots sem a quebra de linha, mas com tabulacao "\t" */
                media = media + notas[l][c];
            }
        media = media/4;

        System.out.println(cursos[l] + " = " + media);
            /*println imprime linha em branco com a quebra e salto de linha \n */
        }
    System.out.println("\n");

    }
}