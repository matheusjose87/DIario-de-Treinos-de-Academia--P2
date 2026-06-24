package TreinosAcademia;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Academia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<Treino> diarioDeTreinos = new ArrayList<>();

        Usuario usuario = null;

        int opcao = 0;
        int geradorId = 1;

        while (opcao != 8) {

            System.out.println("\n===== DIÁRIO DE TREINOS =====");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Criar Treino");
            System.out.println("3 - Adicionar Exercício");
            System.out.println("4 - Listar Treinos");
            System.out.println("5 - Editar Treino");
            System.out.println("6 - Excluir Treino");
            System.out.println("7 - Demonstrar Polimorfismo");
            System.out.println("8 - Sair");
            System.out.print("Opção: ");

            try {

                opcao = entrada.nextInt();
                entrada.nextLine();

            } catch (InputMismatchException e) {

                System.out.println("Erro: digite apenas números.");
                entrada.nextLine();
                continue;
            }

            switch (opcao) {

                case 1:

                    try {

                        System.out.print("Nome: ");
                        String nome = entrada.nextLine();

                        System.out.print("Idade: ");
                        int idade = entrada.nextInt();

                        System.out.print("Peso: ");
                        double peso = entrada.nextDouble();

                        entrada.nextLine();

                        usuario = new Usuario(nome, idade, peso);

                        System.out.println("Usuário cadastrado!");

                    } catch (InputMismatchException e) {

                        System.out.println("Erro: idade e peso devem ser numéricos.");
                        entrada.nextLine();
                    }

                    break;

                case 2:

                    System.out.print("Nome do treino: ");
                    String nomeTreino = entrada.nextLine();

                    diarioDeTreinos.add(
                            new Treino(
                                    geradorId++,
                                    nomeTreino));

                    System.out.println("Treino criado!");
                    break;

                case 3:

                    if (diarioDeTreinos.isEmpty()) {

                        System.out.println("Nenhum treino criado.");
                        break;
                    }

                    for (Treino t : diarioDeTreinos) {
                        System.out.println(t);
                    }

                    try {

                        System.out.print("ID do treino: ");
                        int id = entrada.nextInt();
                        entrada.nextLine();

                        Treino treino = null;

                        for (Treino t : diarioDeTreinos) {

                            if (t.getId() == id) {

                                treino = t;
                                break;
                            }
                        }

                        if (treino != null) {

                            System.out.print("Nome exercício: ");
                            String nomeEx = entrada.nextLine();

                            System.out.print("Séries: ");
                            int series = entrada.nextInt();

                            System.out.print("Repetições: ");
                            int reps = entrada.nextInt();

                            entrada.nextLine();

                            treino.adicionarExercicio(
                                    new Exercicio(
                                            nomeEx,
                                            series,
                                            reps));

                            System.out.println("Exercício adicionado!");

                        } else {

                            System.out.println("Treino não encontrado.");
                        }

                    } catch (InputMismatchException e) {

                        System.out.println("Erro: digite apenas números.");
                        entrada.nextLine();
                    }

                    break;

                case 4:

                    if (usuario != null) {
                        System.out.println(usuario);
                    }

                    for (Treino t : diarioDeTreinos) {

                        System.out.println(t);

                        for (Exercicio e : t.getListaExercicios()) {
                            System.out.println(e);
                        }
                    }

                    break;

                case 5:

                    try {

                        System.out.print("Digite o ID do treino: ");

                        int idEditar = entrada.nextInt();
                        entrada.nextLine();

                        boolean encontrou = false;

                        for (Treino t : diarioDeTreinos) {

                            if (t.getId() == idEditar) {

                                System.out.print("Novo nome do treino: ");

                                String novoNome =
                                        entrada.nextLine();

                                t.setNomeTreino(novoNome);

                                System.out.println("Treino atualizado!");

                                encontrou = true;
                                break;
                            }
                        }

                        if (!encontrou) {
                            System.out.println("Treino não encontrado.");
                        }

                    } catch (InputMismatchException e) {

                        System.out.println("Erro: digite apenas números.");
                        entrada.nextLine();
                    }

                    break;

                case 6:

                    try {

                        System.out.print("ID do treino para excluir: ");

                        int idExcluir = entrada.nextInt();
                        entrada.nextLine();

                        Treino remover = null;

                        for (Treino t : diarioDeTreinos) {

                            if (t.getId() == idExcluir) {

                                remover = t;
                                break;
                            }
                        }

                        if (remover != null) {

                            diarioDeTreinos.remove(remover);

                            System.out.println("Treino removido!");

                        } else {

                            System.out.println("Treino não encontrado.");
                        }

                    } catch (InputMismatchException e) {

                        System.out.println("Erro: digite apenas números.");
                        entrada.nextLine();
                    }

                    break;

                case 7:

                    System.out.println("\n===== DEMONSTRAÇÃO DE POLIMORFISMO =====");

                    ArrayList<Pessoa> pessoas =
                            new ArrayList<>();

                    pessoas.add(
                            new PersonalTrainer(
                                    "Carlos",
                                    35,
                                    "Musculação"));

                    pessoas.add(
                            new PersonalTrainer(
                                    "Ana",
                                    28,
                                    "Crossfit"));

                    for (Pessoa p : pessoas) {
                        System.out.println(p.apresentar());
                    }

                    break;

                case 8:

                    System.out.println("Encerrando sistema...");
                    break;

                default:

                    System.out.println("Opção inválida!");
            }
        }

        entrada.close();
    }
}