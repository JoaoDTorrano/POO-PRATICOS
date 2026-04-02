* **NOME:** João Pedro Torrano Dias
* **MATRÍCULA:** 273
* **CURSO:** GES
# Relatório de Desenvolvimento: Projeto PC Mania 💻

Este documento detalha a colaboração técnica entre o aluno e o assistente de IA (**Gemini 1.5 Flash**) no desenvolvimento do sistema de e-commerce de computadores.

---

## 🤖 Ficha Técnica do Assistente
* **Modelo:** Gemini 1.5 Flash (Google)
* **Função:** Suporte em Debugging, Lógica de POO e Refatoração de Código.

---

## 🛠️ Detalhamento da Assistência de IA

O uso da Inteligência Artificial foi focado na resolução de erros de execução e no aprimoramento da lógica de negócios, conforme detalhado abaixo:

### 1. Formatação de Interface (Console)
* **Pedido:** Criação de um menu visual baseado em uma imagem de referência.
* **Ajuda prestada:** Implementação de `System.out.printf` com o uso de máscaras de formatação (`%-30s`) para garantir o alinhamento das colunas de promoções (Apple, Samsung e Dell), simulando uma tabela real no console Java.

### 2. Resolução de `NullPointerException`
* **Pedido:** Correção de erro ao tentar definir nomes em componentes de hardware.
* **Ajuda prestada:** Diagnóstico de que o array de objetos estava sendo declarado, mas os objetos internos não estavam sendo instanciados (`new`). A IA auxiliou na compreensão de que cada posição do array precisa de uma instância própria antes de acessar seus métodos `set`.

### 3. Correção da Lógica de Acumulação (Carrinho)
* **Pedido:** Problema onde apenas o preço do primeiro computador era somado ao total.
* **Ajuda prestada:** Identificação de um erro de lógica no laço `for-each` na classe `Cliente`. O comando `break` estava interrompendo a soma precocemente. A IA sugeriu a remoção do `break` e a inicialização da variável local para garantir o cálculo correto de todos os itens não nulos.

### 4. Tratamento de Dados Vazios
* **Pedido:** Erro onde aparecia "null" e "0.0" quando uma opção não era preenchida.
* **Ajuda prestada:** Implementação de verificações condicionais (`if (computador != null)`) para filtrar slots vazios e evitar que informações não cadastradas poluíssem a saída de dados do sistema.

---
**Nota:** A arquitetura do sistema e a estrutura das classes foram definidas pelo aluno, com a IA atuando como monitor digital para resolução de entraves técnicos específicos.

---
## 📝 Nota de Autoria do Relatório
Este relatório foi **gerado integralmente pelo assistente Gemini**
