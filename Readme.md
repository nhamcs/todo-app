# Todo List Clojure/ClojureScript

**Integrantes da Dupla:**
- Carla Sofia Santos Ribeiro - Matrícula: 20260001259
- Marcos Davi Taveira de Sousa - Matrícula: 20260001197

**Vídeo de Apresentação:** [Assistir Demonstração Completa](https://drive.google.com/file/d/1u-WktBdZNAEYEQ2V6pKpwwvE8VQOI39r/view?usp=sharing)

**Tutorial original:** [Tutorial Clojure/ClojureScript: Construindo uma Aplicação Persistente e Reativa](https://lambdageo-edu.github.io/lambdageo-tutorials/clojure/)

---

## Descrição
Aplicação full-stack de lista de tarefas (Todo List), construída de forma incremental para estudar a arquitetura de aplicações funcionais modernas:
- **Backend:** Clojure, com [Ring](https://github.com/ring-clojure/ring) (servidor Jetty) e [Reitit](https://github.com/metosin/reitit) (roteamento), expondo uma API REST com CRUD completo.
- **Banco de dados:** SQLite, acessado via [next.jdbc](https://github.com/seancorfield/next-jdbc), com persistência real em disco (`prod.db`).
- **Frontend:** ClojureScript com [Reagent](https://github.com/reagent-project/reagent) (React) e [Shadow-CLJS](https://github.com/thheller/shadow-cljs), consumindo a API via `fetch`.

---

## Pré-requisitos
| Ferramenta | Versão mínima |
| :--- | :--- |
| Java (JDK) | 11+ |
| [Clojure CLI](https://clojure.org/guides/install_clojure) (`clj`) | 1.11+ |
| Node.js (`node` / `npm`) | 18+ |

---

## Como Rodar

### 1. Clone o repositório e instale as dependências do frontend:
```bash
git clone [https://github.com/nhamcs/todo-app.git](https://github.com/nhamcs/todo-app.git)
cd todo-app
npm install