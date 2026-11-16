(ns todo.backend.db
  "Este namespace gerencia os dados dos 'todos' usando um banco de dados persistente SQLite."
  (:require [next.jdbc :as jdbc]))

(def db-spec {:dbtype "sqlite"
              :dbname "prod.db"})

(defn initialize-database!
  "Cria a tabela 'todos' no banco de dados se ela ainda não existir."
  []
  (jdbc/execute! db-spec ["
    CREATE TABLE IF NOT EXISTS todos (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      title TEXT,
      description TEXT,
      completed BOOLEAN DEFAULT 0,
      created_at TEXT
    )
  "]))

(defn get-all-todos
  "Retorna uma lista com todos os 'todos' no banco."
  []
  (jdbc/execute! db-spec ["SELECT * FROM todos ORDER BY created_at DESC"]))

(defn create-todo
  "Cria um novo 'todo', salva no banco e o retorna."
  [todo-data]
  (jdbc/execute-one! db-spec ["
    INSERT INTO todos (title, description, completed, created_at)
    VALUES (?, ?, ?, ?)
    RETURNING *"
                              (:title todo-data)
                              (:description todo-data)
                              0
                              (str (java.time.Instant/now))]))