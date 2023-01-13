public class Main {
    public static void main(String[] args) {

        Empregado empregado1 = new Empregado(
                "Darlan R.",
                "C. Poffo",
                2500.56);
        Empregado empregado2 = new Empregado(
                "Vanessa",
                "Y. Tanaka",
                3100.35);

        System.out.printf("Nome do 1º funcionario: %s%n", empregado1.getPrimeiroNome());
        System.out.printf("Ultimo nome do 1º funcionario: %s%n", empregado1.getUltimoNome());
        System.out.println("Nome completo: " + empregado1.getPrimeiroNome() + " " + empregado1.getUltimoNome());
        System.out.printf("Salário do 1º funcionario: %.2f%n", empregado1.getSalarioMensal());
        System.out.printf("Ganhos anuais do 1º funcionario: %.2f%n", empregado1.getSalarioMensal()*12);

        System.out.println("");

        System.out.printf("Nome do 2º funcionario: %s%n", empregado2.getPrimeiroNome());
        System.out.printf("Ultimo Nome do 2º funcionario: %s%n", empregado2.getUltimoNome());
        System.out.println("Nome completo: " + empregado2.getPrimeiroNome() + " " + empregado2.getUltimoNome());
        System.out.printf("Salário do 2º funcionario: %.2f%n", empregado2.getSalarioMensal());
        System.out.printf("Ganhos anuais do 2º funcionario: %.2f%n", empregado2.getSalarioMensal()*12);

        System.out.println("\n********DEPOIS DO AUMENTO DE 10%********\n");

        empregado1.setSalarioMensal(empregado1.getSalarioMensal() * 1.1);
        System.out.printf("Nome do 1º funcionario: %s%n", empregado1.getPrimeiroNome());
        System.out.printf("Ultimo nome 1º funcionario: %s%n", empregado1.getUltimoNome());
        System.out.println("Nome completo: " + empregado1.getPrimeiroNome() + " " + empregado1.getUltimoNome());
        System.out.printf("Salário do 1º funcionario: %.2f%n", empregado1.getSalarioMensal());
        System.out.printf("Ganhos anuais do 1º funcionario: %.2f%n", empregado1.getSalarioMensal()*12);

        System.out.println("");

        empregado2.setSalarioMensal(empregado2.getSalarioMensal() * 1.1);
        System.out.printf("Nome do 2º funcionario: %s%n", empregado2.getPrimeiroNome());
        System.out.printf("Ultimo nome 2º funcionario: %s%n", empregado2.getUltimoNome());
        System.out.println("Nome completo: " + empregado2.getPrimeiroNome() + " " + empregado2.getUltimoNome());
        System.out.printf("Salário do 2º funcionario: %.2f%n", empregado2.getSalarioMensal());
        System.out.printf("Ganhos anuais do 2º funcionario: %.2f%n", empregado2.getSalarioMensal()*12);

    }
}