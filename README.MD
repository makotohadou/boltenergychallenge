Retorna quantas operações são necessárias para tornar uma sequencia de caracteres composta por '}' e '{' estavel.

A definição de sequência estável é a seguinte:
1. A sequência vazia é estável;
2. Se S é estável, então {S} também estável;
3. Se S e T são estáveis, então a concatenação ST também é estável.

# Endpoints
## /bolt/operations
Recebe uma lista de strings e retorna uma lista de Long representando, em ordem, quantas operações são necessárias para torná-las estável.