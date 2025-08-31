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

- **versao_inicial/**	Versão propositalmente mal projetada. Forte acoplamento, ausência de padrões, responsabilidades misturadas.
- **versao_refatorada/**	Código refatorado com aplicação de princípios SOLID e técnicas como extração/movimentação de métodos, encapsulamento.
- **reestruturacao_ioc_sl/**	Versão final com arquitetura moderna utilizando Inversão de Controle (IoC) e Service Locator para desacoplamento e modularidade.
---

# Sistema Mal Projetado – Versão Inicial

## Etapa 1 – Implementação Inicial

**Objetivo:**  
Criar um sistema funcional, porém propositalmente mal projetado, com 2 a 4 classes, responsabilidades misturadas, forte acoplamento e ausência de padrões de projeto.

### Más práticas propositalmente criadas
- God Object
- Forte acoplamento
- Quebra de encapsulamento
- Mistura de responsabilidades
- Código repetitivo/confuso
  
# Sistema Refatorado – Aplicação de SOLID

## Etapa 2 – Refatoração

**Objetivo:**
Aplicar princípios SOLID e técnicas de refatoração para melhorar a coesão, modularidade e legibilidade do sistema.

### Melhorias aplicadas na versão refatorada:
- Encapsulamento de atributos.
- Separação de responsabilidades.
- Extração de métodos e modularização.
- Preparação para introdução de padrões arquiteturais.
  
# Sistema Reestruturado – IoC e Service Locator

## Etapa 3 – Arquitetura Moderna

**Objetivo:**
Aplicar Inversão de Controle (IoC) e o padrão Service Locator para desacoplar dependências e tornar o sistema extensível.

### Melhorias aplicadas na versão com IoC/Service Locator:
- Uso de interfaces (`ProdutoFactory`, `GeradorResumo`).
- Injeção de dependências via `ServiceLocator`.
- Separação clara entre lógica de negócio, criação de objetos e apresentação.

---

## 📁 Estrutura de pacotes e arquivos
```
src/
└── com/
    ├── versao_inicial/
    │   ├── Produto.java
    │   ├── Relatorio.java
    │   ├── SistemaLoja.java

    ├── versao_refatorada/
    │   ├── Produto.java
    │   ├── Relatorio.java
    │   ├── SistemaLoja.java
    │   ├── ResumoLoja.java

    ├── reestruturacao_ioc_sl/
    │   ├── GeradorResumo.java
    │   ├── GeradorResumoLoja.java
    │   ├── Main.java
    │   ├── Produto.java
    │   ├── ProdutoFactory.java
    │   ├── ProdutoFactoryImpl.java
    │   ├── Relatorio.java
    │   ├── ResumoLoja.java
    │   ├── ServiceLocator.java
    │   ├── SistemaLoja.java


```

---

## 👨‍💻Como Executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/marceloteclas/Reestrutura-o-de-sistema-mal-projetado-com-Ioc-Service-Locator.git 
   ```
2. Navegue até o local que foi clonado o repositório:
   ```bash
   cd Reestrutura-o-de-sistema-mal-projetado-com-Ioc-Service-Locator
   ```
3. Compile o código:
   ```bash
   javac src/com/reestruturacao_ioc_sl/*.java
   ```
 
4. Rode o Main:
   ```bash
   java -cp src com.reestruturacao_ioc_sl.Main
   ```

