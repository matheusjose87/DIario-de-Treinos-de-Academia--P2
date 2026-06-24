package TreinosAcademia;

import java.util.ArrayList;
import java.util.List;

public class Treino {

    private int id;
    private String nomeTreino;
    private List<Exercicio> listaExercicios;

    public Treino(int id, String nomeTreino) {
        this.id = id;
        this.nomeTreino = nomeTreino;
        this.listaExercicios = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNomeTreino() {
        return nomeTreino;
    }

    public void setNomeTreino(String nomeTreino) {
        this.nomeTreino = nomeTreino;
    }

    public List<Exercicio> getListaExercicios() {
        return listaExercicios;
    }

    public void adicionarExercicio(Exercicio e) {
        listaExercicios.add(e);
    }

    @Override
    public String toString() {
        return "[ID: " + id + "] " +
                nomeTreino + " (" +
                listaExercicios.size() +
                " exercícios)";
    }
}