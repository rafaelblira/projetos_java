public class Teste3 {
    public static void main(String[] args) {
        char[] NOMECURSO = {'S', 'I', 'S', 'T', 'E', 'M', 'A'};
        char[] CODCURSO = new char [7];
        System.arraycopy(NOMECURSO, 0, CODCURSO, 0, 7);
        System.out.println(new String(CODCURSO));
    }
}