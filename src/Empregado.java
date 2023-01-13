public class Empregado {

    private String primeiroNome;
    private String ultimoNome;
    private double salarioMensal;

    public Empregado(String primeiroNome, String ultimoNome, double salarioMensal){
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        if (salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
        }
    }

    public String getPrimeiroNome(){
        return primeiroNome;
    }

    public void setPrimeiroNome(String novoPrimeiroNome){
        primeiroNome = novoPrimeiroNome;
    }

    public String getUltimoNome(){
        return ultimoNome;
    }

    public void setUltimoNomeNome(String novoUltimoNome){
        ultimoNome = novoUltimoNome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
        }
    }
}
