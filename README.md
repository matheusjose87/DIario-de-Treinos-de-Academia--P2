# DIario-de-Treinos-de-Academia--P2
# 📦 Classe `Usuario`

> Classe modelo estruturada para representar um usuário/atleta dentro do sistema.

---

### 🛠️ Atributos

| Campo | Tipo | Descrição |
| :--- | :---: | :--- |
| **`nome`** | `String` | Nome do atleta |
| **`idade`** | `int` | Idade em anos |
| **`peso`** | `double` | Peso em kg |

---

### ⚙️ Funcionalidades

* 🔹 **Construtor Total:** Inicialização de todos os atributos de uma única vez no momento da criação do objeto.
* 🔹 **Encapsulamento:** Métodos *Getters* e *Setters* para garantir o acesso controlado aos dados da classe.
* 🔹 **Formatação de Saída:** Sobrescrita do método `toString()` para exibir as informações principais de forma limpa.

---

### 🚀 Exemplo de Uso

```java
Usuario u = new Usuario("Carlos", 22, 75.5);
System.out.println(u);

// Saída: Atleta: Carlos | Idade: 22 anos

        EXERCICIO 2  

// classe base para os exercicios do treino
class Exercicio {
    
    // atributos privados pra ninguem acessar direto de fora
    private String nome;
    private int series;
    private int repeticoes;

    // construtor que ja recebe os dados na hora de criar o objeto
    public Exercicio(String nome, int series, int repeticoes) {
        this.nome = nome;
        this.series = series;
        this.repeticoes = repeticoes;
    }

    // getters e setters padrao
    public String getNome() { 
        return nome; 
    }
    
    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public int getSeries() { 
        return series; 
    }
    
    public void setSeries(int series) { 
        this.series = series; 
    }

    public int getRepeticoes() { 
        return repeticoes; 
    }
    
    public void setRepeticoes(int repeticoes) { 
        this.repeticoes = repeticoes; 
    }

    // arrumando a impressao pra mostrar os dados em vez do endereco de memoria
    @Override
    public String toString() {
        return "  -> " + nome + " (" + series + "x" + repeticoes + ")";
    }
}
