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
