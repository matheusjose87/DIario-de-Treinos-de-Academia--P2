package TreinosAcademia;

public class PersonalTrainer extends Pessoa {

    private String especialidade;

    public PersonalTrainer(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }

    @Override
    public String apresentar() {
        return "Personal Trainer: " + nome +
               " | Idade: " + idade +
               " | Especialidade: " + especialidade;
    }
}