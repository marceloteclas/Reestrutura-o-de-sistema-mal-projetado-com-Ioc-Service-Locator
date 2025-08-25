# Trabalho de Padrões de Projeto – Da Arquitetura Mal Projetada à Reestruturação com IoC/Service Locator
- **Instituição:** IFBA - Instituto Federal da Bahia
- **Curso:** Análise e Desenvolvimento de Sistemas (ADS)
- **Disciplina:** Padrões de Projeto 
- **Projeto:** Da Arquitetura Mal Projetada à Reestruturação com IoC/Service Locator
- **Professor:** Felipe de Souza Silva
- **Semestre:** 5
- **Ano:** 2025.1

# 📌Projeto Da Arquitetura Mal Projetada à Reestruturação com IoC/Service Locator

## Integrantes do Projeto

<table>
  <tr>
        <td align="center">
      <img src="https://avatars.githubusercontent.com/u/129338943?v=4" width="100px;" alt="Foto da Integrante Ronaldo"/><br />
      <sub><b><a href="https://github.com/Ronaldo-Correia">Ronaldo Correia</a></b></sub>
    </td>
    <td align="center">
      <img src="https://avatars.githubusercontent.com/u/114780494?v=4" width="100px;" alt="Foto da Integrante Marcelo"/><br />
      <sub><b><a href="https://github.com/marceloteclas">Marcelo Jesus</a></b></sub>
    </td>
    <td align="center">
      <img src="https://avatars.githubusercontent.com/u/129909472?v=4" width="100px;" alt="Foto da Integrante Franklin"/><br />
      <sub><b><a href="https://github.com/FranklinFelixADS">Franklin Felix</a></b></sub>
    </td>

  </tr>
</table>

## Estrutura do Projeto
- **versaoInicial/** → Código inicial, mal projetado (sem padrões de projeto).
- **versaoRefatorada/** → Código refatorado, aplicando técnicas de refatoração e padrões arquiteturais modernos.
- **Main.java** → Classe principal que executa as duas versão.

---

# Sistema Mal Projetado – Versão Inicial

## Etapa 1 – Implementação Inicial

**Objetivo:**  
Criar um sistema funcional, porém propositalmente mal projetado, com 2 a 4 classes, responsabilidades misturadas, forte acoplamento e ausência de padrões de projeto.

---

## 1. Estrutura do Sistema

O sistema implementado possui 3 classes principais:

1. **SistemaLoja.java**  
   - Concentra cadastro, listagem e venda de produtos.  
   - Faz todas as chamadas para `Produto` e `Relatorio`, caracterizando **God Object**.  

2. **Produto.java**  
   - Contém atributos públicos (`nome`, `preco`), sem encapsulamento.  
   - Não possui métodos de validação, tornando a classe vulnerável a alterações externas indevidas.  

3. **Relatorio.java**  
   - Mistura responsabilidades de lógica de negócio e apresentação (gera relatório + imprime no console).  
   - Não é modular nem reutilizável.

---

## 2. Más práticas propositalmente criadas

- **God Object**: `SistemaLoja` concentra todas as responsabilidades do sistema, dificultando manutenção e extensão.  
- **Forte acoplamento**: todas as classes dependem diretamente umas das outras, sem interfaces ou abstrações.  
- **Quebra de encapsulamento**: `Produto` possui atributos públicos, permitindo acesso direto e alterações indevidas.  
- **Mistura de responsabilidades**: `Relatorio` combina lógica de cálculo com saída de dados na tela.  
- **Código repetitivo/confuso**: listagem de produtos e vendas repetem lógica sem modularização.  

---

## 3. Estrutura de pacotes e arquivos

versao_inicial/

└── src/

└── com/

└── versao_inicial/

└── sistemaloja/

├── SistemaLoja.java

├── Produto.java

├── Relatorio.java

---

## 👨‍💻Como Executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/marceloteclas/Reestrutura-o-de-sistema-mal-projetado-com-Ioc-Service-Locator.git 
   ```
2. Compile o código:
   
   javac src/main/java/com/**/*.java
 
4. Rode o Main:
   
   java src/main/java/com/Main
