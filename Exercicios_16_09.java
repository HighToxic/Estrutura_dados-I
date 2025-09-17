/* 1. Transforme a matriz do programa ArrayBidimensional.java para 5 x 5 */

public class ArrayBidimensional {
  public static void main (String[] args){
    int[][] matriz = new int[5][5];

    matriz[0][0]= 1; matriz[0][1] = 2; matriz[0][2] = 3; matriz[0][3] = 4; matriz[0][4] = 5;
    matriz[1][0]= 6; matriz[1][1] = 7; matriz[1][2] = 8; matriz[1][3] = 9; matriz[1][4] = 10;
    matriz[2][0]= 11; matriz[2][1] = 12; matriz[2][2] = 13; matriz[2][3] = 14; matriz[2][4] = 15;
    matriz[3][0]= 16; matriz[3][1] = 17; matriz[3][2] = 18; matriz[3][3] = 19; matriz[3][4] = 20;
    matriz[4][0]= 21; matriz[4][1] = 22; matriz[4][2] = 23; matriz[4][3] = 24; matriz[4][4] = 25;

    for (int linha = 0; linha < matriz.length; linha++) {
      for (int coluna = 0; coluna < matriz[linha].length; coluna++){
        System.out.println("Elemento na posição [" + linha + "][" + coluna + "]: " + matriz[linha][coluna]);
      }
    }
  }
}

/* 2. Por que não aumentar o array diretamente?
A imutabilidade do tamanho do array é uma característica de Java. Isso porque a alocação de memória para um array é contígua e fixa. Se um array pudesse "crescer", 
ele exigiria mais espaço do que o inicialmente alocado, o que poderia invadir o espaço de memória de outras variáveis.
A solução de copiar para um novo array garante que a nova alocação de memória seja feita de forma segura.

Alternativa: Use ArrayList

Para situações em que você precisa de uma lista de elementos com tamanho dinâmico, a melhor solução é usar a classe ArrayList. 
Ela é muito mais prática e eficiente para lidar com coleções que precisam aumentar ou diminuir de tamanho.

Teste o programa: AumentarArray.java*/

public class AumentarArray {

    public static void main(String[] args) {
        // --- Exemplo de como "aumentar" um array de Strings ---

        // 1. Array original com tamanho fixo (6 elementos)
        String[] nomes = {"Lucas", "Daniel", "Julia", "Tatiana", "Izabela", "Matheus"};
        System.out.println("Array original (tamanho " + nomes.length + "): " + java.util.Arrays.toString(nomes));

        // 2. Definir o novo tamanho. Queremos adicionar 3 nomes.
        int novoTamanho = nomes.length + 3;

        // 3. Criar um NOVO array com o tamanho desejado.
        // Ele terá 9 posições, com as 6 primeiras vazias (valor default 'null').
        String[] novoNomes = new String[novoTamanho];

        // 4. Copiar os elementos do array original para o novo array.
        // Sintaxe: System.arraycopy(arrayOrigem, posInicialOrigem, arrayDestino, posInicialDestino, numElementos)
        System.arraycopy(nomes, 0, novoNomes, 0, nomes.length);

        // O array 'novoNomes' agora contém: {"Lucas", "Daniel", "Julia", "Tatiana", "Izabela", "Matheus", null, null, null}
        
        // 5. Adicionar os novos elementos nas posições restantes do novo array.
        // A primeira posição livre é o índice 6.
        novoNomes[6] = "Carlos";
        novoNomes[7] = "Mariana";
        novoNomes[8] = "Fernanda";

        // 6. (Opcional) Fazer a referência 'nomes' apontar para o novo array.
        // Isso é útil se você quiser continuar trabalhando com a variável 'nomes'.
        nomes = novoNomes;

        // 7. Exibir o resultado final.
        System.out.println("Novo array (tamanho " + nomes.length + "): " + java.util.Arrays.toString(nomes));
    }
}

/* 3. Arrays Irregulares (ou "Jagged Arrays"). Em Java, arrays multidimensionais não precisam ter um número fixo de colunas em todas as linhas. 
Você pode ter arrays onde cada "linha" (sub-array) tem um tamanho diferente. Execute o programa ArrayIrregular.java e veja o resultado;*/

public class ArrayIrregular {

    public static void main(String[] args) {

        // --- Demonstração de um Array Irregular ---

        // Declara um array bidimensional de Strings.
        // O primeiro colchete define o número de linhas (3),
        // mas o segundo fica vazio para indicar que o número de colunas
        // será definido separadamente para cada linha.
        String[][] nomes = new String[3][];

        // 1. Inicializa a primeira linha do array.
        // Cria um array de Strings com 2 posições e o atribui à primeira linha (índice 0).
        nomes[0] = new String[2]; 

        // 2. Inicializa a segunda linha do array.
        // Cria um array de Strings com 3 posições e o atribui à segunda linha (índice 1).
        nomes[1] = new String[3]; 

        // 3. Inicializa a terceira linha do array.
        // Cria um array de Strings com 1 posição e o atribui à terceira linha (índice 2).
        nomes[2] = new String[1]; 

        // Agora o array 'nomes' é uma estrutura irregular, com cada linha
        // (ou sub-array) tendo um tamanho diferente.

        // --- Atribuindo valores a cada posição ---

        // Atribui valores à primeira linha (índice 0).
        nomes[0][0] = "João";
        nomes[0][1] = "Maria";

        // Atribui valores à segunda linha (índice 1).
        nomes[1][0] = "Pedro";
        nomes[1][1] = "Ana";
        nomes[1][2] = "Carlos";

        // Atribui valores à terceira linha (índice 2).
        nomes[2][0] = "Paula";

        // Exibindo os valores para confirmar a estrutura.
        System.out.println("Array Irregular:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Linha " + i + ": ");
            for (int j = 0; j < nomes[i].length; j++) {
                System.out.print(nomes[i][j] + " ");
            }
            System.out.println(); // Pula para a próxima linha
        }
    }
}

/* 4. Adicione 10 elementos no programa ExemploPilhaSimples1.java;*/

import java.util.Stack;

public class ExemploPilhaSimples1 {

    public static void main(String[] args) {

        // 1. Criando uma nova pilha
        Stack<String> nomes = new Stack<>();
        
        System.out.println("Pilha criada: " + nomes);
        System.out.println("A pilha está vazia? " + nomes.isEmpty());
        System.out.println("---");

        // 2. Adicionando elementos à pilha (método push())
        nomes.push("Carlos");
        nomes.push("Ana");
        nomes.push("Bruno");
        nomes.push("Isadora");
        nomes.push("Thiago");
        nomes.push("Fernanda");
        nomes.push("Lucas");
        nomes.push("Beatriz");
        nomes.push("Gustavo");
        nomes.push("Sofia");
        nomes.push("Rafael");
        nomes.push("Larissa");
        nomes.push("Vitor");
        
      
        System.out.println("Elementos adicionados. Pilha atual: " + nomes);
        System.out.println("Tamanho da pilha: " + nomes.size());
        System.out.println("---");

        // 3. Verificando o elemento do topo sem removê-lo (método peek())
        String nomeDoTopo = nomes.peek();
        System.out.println("Elemento no topo (sem remover): " + nomeDoTopo);
        System.out.println("Pilha após o peek(): " + nomes);
        System.out.println("---");

        // 4. Removendo elementos da pilha (método pop())
        String nomeRemovido1 = nomes.pop();
        System.out.println("Elemento removido: " + nomeRemovido1);
        System.out.println("Pilha após a primeira remoção: " + nomes);

        String nomeRemovido2 = nomes.pop();
        System.out.println("Elemento removido: " + nomeRemovido2);
        System.out.println("Pilha após a segunda remoção: " + nomes);
        System.out.println("---");
        
        // 5. Tentando remover de uma pilha vazia
        // nomes.pop(); // Isso geraria uma exceção EmptyStackException
        
        System.out.println("A pilha está vazia? " + nomes.isEmpty());
    }
}

/* 5. Empilhe 10 elementos no programa ExemploPilhaSimples2.java;*/

import java.util.Stack;

public class ExemploPilhaSimples2 {
    public static void main(String[] args) {
        // Criando uma pilha de inteiros
        Stack<Integer> pilha = new Stack<>();

        // Empilhando elementos (push)
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);
        pilha.push(60);
        pilha.push(70);
        pilha.push(80);
        pilha.push(90);
        pilha.push(100);
        pilha.push(110);
        pilha.push(120);
        pilha.push(130);
        

        System.out.println("Pilha atual: " + pilha);

        // Consultando o topo da pilha (peek)
        System.out.println("Topo da pilha: " + pilha.peek());

        // Desempilhando elementos (pop)
        int removido = pilha.pop();
        System.out.println("Elemento removido: " + removido);
        System.out.println("Pilha após pop: " + pilha);

        // Verificando se a pilha está vazia
        System.out.println("A pilha está vazia? " + pilha.isEmpty());
    }
}

/* 6. Coloque 5 URLs reais no programa ExemploStack.java;*/

import java.util.Stack;

public class ExemploStack {
    public static void main(String[] args) {
        // Cria uma nova instância da classe Stack para armazenar Strings.
        // Stack é uma estrutura de dados LIFO (Last-In, First-Out).
        Stack<String> historicoDeNavegacao = new Stack<>();

        // 1. Adiciona elementos na pilha usando o método push().
        // O último elemento adicionado será o primeiro a ser removido.
        historicoDeNavegacao.push("pagina-inicial.com");
        historicoDeNavegacao.push("produtos.com");
        historicoDeNavegacao.push("carrinho.com");
        historicoDeNavegacao.push("youtube.com");
        historicoDeNavegacao.push("wikipedia.com");
        historicoDeNavegacao.push("twitter.com");
        historicoDeNavegacao.push("amazon.com");
        historicoDeNavegacao.push("google.com"); // Este é o topo da pilha agora.

        // 2. Acessa o elemento do topo da pilha sem removê-lo.
        // O método peek() retorna "google.com".
        System.out.println("Página atual (topo): " + historicoDeNavegacao.peek());

        // 3. Remove e retorna o elemento do topo da pilha.
        // O método pop() remove "google.com" e o retorna.
        System.out.println("Voltando para a página anterior: " + historicoDeNavegacao.pop());

        // 4. Acessa o novo elemento do topo da pilha.
        // O novo topo é "amazon.com".
        System.out.println("Página atual: " + historicoDeNavegacao.peek());
    }
}

/*7. Qual a função do método Arrays.sort(nomes) no programa ArrayOrdena.java?*/

// Ordena o array de strings em ordem alfabética.


