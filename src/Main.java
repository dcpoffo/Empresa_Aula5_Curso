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
        System.out.printf("Ganhos anuais do 1º funcionario: %.2f%n", empregado1.getSalarioMensal()*12);
        System.out.println("");
        System.out.printf("Nome do 2º funcionario: %s%n", empregado2.getNome());
        System.out.printf("Salário do 2º funcionario: %.2f%n", empregado2.getSalarioMensal());
        System.out.printf("Ganhos anuais do 2º funcionario: %.2f%n", empregado2.getSalarioMensal()*12);

        System.out.println("\n********DEPOIS DO AUMENTO DE 10%********\n");

        empregado1.setSalarioMensal(empregado1.getSalarioMensal() * 1.1);
        System.out.printf("Nome do 1º funcionario: %s%n", empregado1.getNome());
        System.out.printf("Salário do 1º funcionario: %.2f%n", empregado1.getSalarioMensal());
        System.out.printf("Ganhos anuais do 1º funcionario: %.2f%n", empregado1.getSalarioMensal()*12);
        System.out.println("");
        empregado2.setSalarioMensal(empregado2.getSalarioMensal() * 1.1);
        System.out.printf("Nome do 2º funcionario: %s%n", empregado2.getNome());
        System.out.printf("Salário do 2º funcionario: %.2f%n", empregado2.getSalarioMensal());
        System.out.printf("Ganhos anuais do 2º funcionario: %.2f%n", empregado2.getSalarioMensal()*12);


        //empregado1.setSalarioMensal();
    }
}