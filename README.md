# Estrutura de Dados em Java — Vetor dinâmico

Implementação, do zero, de um **vetor dinâmico** (semelhante a um `ArrayList`) em Java puro, feita para estudar como essa estrutura funciona por dentro.

## O que a classe `Vetor` faz

| Método | Descrição |
|---|---|
| `adiciona(aluno)` | Insere no final do vetor |
| `adiciona(posicao, aluno)` | Insere numa posição, deslocando os elementos seguintes |
| `pega(posicao)` | Retorna o elemento da posição (valida o índice) |
| `remove(posicao)` | Remove o elemento e reorganiza o vetor |
| `contem(aluno)` | Verifica se o elemento existe (usa `equals`) |
| `tamanho()` | Quantidade de elementos armazenados |

Quando o array interno enche, o método `garanteEspaco()` cria um novo array com o dobro do tamanho e copia os elementos, ou seja, o vetor cresce automaticamente.

## Conceitos praticados

- Arrays e manipulação de índices
- Redimensionamento dinâmico
- Validação de posições e lançamento de exceções
- Sobrescrita de `equals` e `toString`

## Como executar

```bash
git clone https://github.com/RicardoLMessias/estruturadedados.git
cd estruturadedados
javac -d out src/*.java
java -cp out VetorTeste
```

## Autor

Ricardo Lima Messias — [GitHub](https://github.com/RicardoLMessias) · [LinkedIn](https://www.linkedin.com/in/ricardolimamessias-java)
