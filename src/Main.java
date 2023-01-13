public class Main {
    public static void main(String[] args) {

        Empregado empregado1 = new Empregado();
        Empregado empregado2 = new Empregado();

        empregado1.setNome("Darlan R. C. Poffo");
        empregado1.setSalarioMensal(2500.50);

        empregado2.setNome("Vanessa Y. Tanaka");
        empregado2.setSalarioMensal(3100.35);

        System.out.printf("Nome do 1º funcionario: %s%n", empregado1.getNome());
        System.out.printf("Salário do 1º funcionario: %.2f%n", empregado1.getSalarioMensal());

        System.out.printf("Nome do 2º funcionario: %s%n", empregado2.getNome());
        System.out.printf("Salário do 2º funcionario: %.2f%n", empregado2.getSalarioMensal());
    }
}