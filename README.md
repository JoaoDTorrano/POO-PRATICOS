**NOME:** João Pedro Torrano Dias
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

### 3. Lógica de Preços Dinâmicos
* **Pedido:** Substituição do valor fixo pela matrícula `2999` e cálculo automático das outras promoções.
* **Ajuda prestada:** Criação da lógica de derivação de preços:
    * `comp[1].setPreco(comp[0].getPreco() + 1234);`
    * `comp[2].setPreco(comp[0].getPreco() + 5678);`

### 4. Correção da Lógica de Acumulação (Carrinho)
* **Pedido:** Problema onde apenas o preço do primeiro computador era somado ao total.
* **Ajuda prestada:** Identificação de um erro de lógica no laço `for-each` na classe `Cliente`. O comando `break` estava interrompendo a soma precocemente. A IA sugeriu a remoção do `break` e a inicialização da variável local para garantir o cálculo correto de todos os itens não nulos.

### 5. Tratamento de Dados Vazios
* **Pedido:** Erro onde aparecia "null" e "0.0" quando uma opção não era preenchida.
* **Ajuda prestada:** Implementação de verificações condicionais (`if (computador != null)`) para filtrar slots vazios e evitar que informações não cadastradas poluíssem a saída de dados do sistema.

---

## 💡 Aprendizado Técnico Consolidado
Através das interações com a IA, foram reforçados os conceitos de:
* **Instanciação de Arrays de Referência:** Diferença entre o array e os objetos contidos nele.
* **Controle de Fluxo:** Impacto do comando `break` em iterações de soma.
* **Encapsulamento:** Uso correto de `Getters` e `Setters` para comunicação entre classes (`Cliente`, `Computador` e `HardwareBasico`).

---
**Nota:** A arquitetura do sistema e a estrutura das classes foram definidas pelo aluno, com a IA atuando como monitor digital para resolução de entraves técnicos específicos.

---
## 📝 Nota de Autoria do Relatório
Este relatório foi **gerado integralmente pelo assistente Gemini**
