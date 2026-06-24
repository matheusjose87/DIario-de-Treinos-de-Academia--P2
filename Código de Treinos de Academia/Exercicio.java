package TreinosAcademia;

public class Exercicio {

    private String nome;
    private int series;
    private int repeticoes;

    public Exercicio(String nome, int series, int repeticoes) {
        this.nome = nome;
        this.series = series;
        this.repeticoes = repeticoes;
    }

    @Override
    public String toString() {
        return " -> " + nome + " (" +
                series + "x" + repeticoes + ")";
    }
}