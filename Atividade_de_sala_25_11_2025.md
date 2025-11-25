1) Qual a história da torre de hanoí ? Com 7 discos eu consigo quantos moviemntos?

A Torre de Hanói (ou Torre de Hanoi) foi criada em 1883 pelo matemático francês Édouard Lucas (1842–1891). Lucas era conhecido por inventar problemas matemáticos e jogos de lógica, e publicou o enigma sob
o pseudônimo N. Claus (de Siam) — um anagrama de Lucas d’Amiens (sua cidade natal).
O problema apareceu pela primeira vez em um livro de Lucas intitulado “Récréations Mathématiques”.

[ M(n) = 2^n - 1 ]

Para 7 discos, o número de movimentos seria:

[ M(7) = 2^{7} - 1 = 127 ]

2) Quais são os princiapis métodos em Java de listas e filas?

## 📚 Listas (`List`, `ArrayList`, `LinkedList`)

A interface `List<E>` representa uma coleção **ordenada e indexada**, onde é possível acessar elementos por posição.  
Suas principais implementações são **ArrayList** e **LinkedList**.

| Método | Descrição | Exemplo |
|--------|------------|----------|
| `add(E e)` | Adiciona elemento ao final da lista. | `lista.add("A");` |
| `add(int index, E e)` | Insere elemento em uma posição específica. | `lista.add(1, "B");` |
| `remove(Object o)` | Remove a primeira ocorrência do elemento. | `lista.remove("A");` |
| `remove(int index)` | Remove o elemento no índice indicado. | `lista.remove(0);` |
| `get(int index)` | Retorna o elemento do índice informado. | `lista.get(2);` |
| `set(int index, E e)` | Substitui o elemento no índice. | `lista.set(0, "X");` |
| `size()` | Retorna a quantidade de elementos. | `lista.size();` |
| `isEmpty()` | Verifica se a lista está vazia. | `lista.isEmpty();` |
| `contains(Object o)` | Verifica se a lista contém o elemento. | `lista.contains("B");` |
| `indexOf(Object o)` | Retorna o índice da primeira ocorrência. | `lista.indexOf("C");` |
| `clear()` | Remove todos os elementos. | `lista.clear();` |
| `toArray()` | Converte a lista para array. | `lista.toArray();` |
| `subList(int from, int to)` | Retorna parte da lista. | `lista.subList(1, 4);` |
| `sort(Comparator c)` | Ordena a lista. | `lista.sort(null);` |
| `replaceAll(UnaryOperator op)` | Aplica operação a todos os elementos. | `lista.replaceAll(s -> s.toUpperCase());` |
| `removeIf(Predicate filter)` | Remove elementos que atendem ao predicado. | `lista.removeIf(s -> s.isEmpty());` |


## 🧮  Fila (`Queue`)

A interface `Queue<E>` segue a lógica **FIFO** (*First In, First Out*), onde o primeiro elemento inserido é o primeiro removido.


| Método | Descrição | Exemplo |
|--------|------------|----------|
| `add(E e)` | Adiciona ao final (lança exceção se cheia). | `fila.add(5);` |
| `offer(E e)` | Adiciona ao final (retorna `false` se cheia). | `fila.offer(5);` |
| `remove()` | Remove e retorna o primeiro (exceção se vazia). | `fila.remove();` |
| `poll()` | Remove e retorna o primeiro (`null` se vazia). | `fila.poll();` |
| `element()` | Retorna (sem remover) o primeiro (exceção se vazia). | `fila.element();` |
| `peek()` | Retorna (sem remover) o primeiro (`null` se vazia). | `fila.peek();` |
| `size()` | Retorna o número de elementos. | `fila.size();` |
