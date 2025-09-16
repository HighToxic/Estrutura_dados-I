/* 1. Crie um programa em Java que declare e inicialize um vetor de inteiros com 5 posições. 
Atribua valores a cada uma das posições e, em seguida, imprima no console o valor armazenado na terceira posição do vetor (índice 2).*/

public class VetoresInteiros{
  public static void main(String[] args){
    int[] numeros = new int[5];
    
    numeros[0] = 10;
    numeros[1] = 20;
    numeros[2] = 30;
    numeros[3] = 40;
    numeros[4] = 50;

    System.out.println("terceiro número é:" + numeros[2]);
  }
}

/* 2. Crie um programa em Java que declare um vetor de booleanos chamado status com 3 posições. Atribua os valores true, false e true a cada uma das posições, respectivamente. 
Em seguida, use uma estrutura de controle if-else para verificar o valor da primeira posição do vetor (status[0]) e imprima a seguinte mensagem:

Se o valor for true, exiba: "O primeiro status está ativo."
Se o valor for false, exiba: "O primeiro status está inativo."*/

public class VetoresBooleanos{
  public static void main(String[] args){
    boolean[] status = new boolean[3];

    status[0] = true;
    status[1] = false;
    status[2] = true;

    if(status[0]){
      System.out.println("O primeiro status está ativo.");
    }    
    else{
      System.out.println("O primeiro status está inativo");
    }
  }
}

/* 3. Crie um programa em Java que declare e inicialize um vetor de inteiros chamado notas com os seguintes valores: 85, 92, 78, 95, 88.
Em seguida, utilize um laço de repetição for para percorrer todos os elementos do vetor.
Dentro do laço, imprima cada nota no console, acompanhada de sua respectiva posição (por exemplo: "Nota 1: 85", "Nota 2: 92", e assim por diante).*/

public class VetoresInteiros{
  public static void main(String[] args){
    int[] notas = {85, 92, 78, 95, 88};

    System.out.println("As notas são:");

    for (int i = 0; i < notas.length; i++){
      System.out.print("Nota " + (i + 1) + ": " + notas[i] + "\n");
    }
  }
}

/* 4.  Crie um programa em Java que declare e inicialize um vetor de números decimais (double) chamado precos, com os seguintes valores: 1.50, 2.75, 5.00, 3.25.
Em seguida, use um laço de repetição for para percorrer todos os elementos do vetor, calculando a soma total dos valores. Ao final do programa, imprima o resultado da soma no console.*/

public class VetoresDecimais{
  public static void main(String[] args){
    double[] precos = {1.50, 2.75, 5.00, 3.25};
    double soma = 0;
    for(int i = 0; i < precos.length; i++){
      System.out.println("Preço " + (i + 1) + ": R$" + precos[i] + "\n");
      soma += precos[i];
    }
    System.out.println("A soma total é R$: " + soma)
  }
}

/* 5. Crie um programa em Java que declare e inicialize um vetor de Strings chamado frutas com os valores "Maçã", "Banana", "Laranja" e "Uva".
Em seguida, o programa deve realizar as seguintes ações:

Imprimir o valor da primeira posição do vetor.
Alterar o valor da segunda posição para "Morango".
Imprimir o novo valor da segunda posição no console.*/

public class VetoresStrings{
  public static void main(String[] args){
    String[] frutas = {"Maçã","Banana","Laranja","Uva"};

    System.out.println("A primeira fruta é " + frutas[0]);

    frutas[1] = "Morango";

    System.out.println("A segunda fruta é : " + frutas[1]);
  }
}












