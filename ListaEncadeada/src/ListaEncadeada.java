public class ListaEncadeada{
   public No primeiro;
   public int [] arranjo;
   private int tamanho;

   public ListaEncadeada(int capacidade){
       arranjo = new int[capacidade];
       primeiro = null;
       tamanho = 0;
   }

   public void criarListaVazia(){
       tamanho = 0;
   }

    class No {
        int valor;
        No proximo;

        public No(int valor){
            this.valor= valor;
            this.proximo = null;

        }

        public No(int valor, No proximo){
            this.valor = valor;
            this.proximo = proximo;
        }
    }

    public void InserirNoInicio(int valor){
       No novoNo = new No(valor);
       novoNo.proximo = primeiro;
       primeiro = novoNo;
       tamanho++;

    }

   public void inserirNoFim(int valor){
       No novoNo = new No(valor);
       if(primeiro == null){
           primeiro = novoNo;
       }else{
           No auxiliar = primeiro;
           while(auxiliar.proximo != null){
               auxiliar = auxiliar.proximo;
           }
           auxiliar.proximo = novoNo;
       }

       tamanho++;
   }


   public void inserirPosicao(int valor, int posicao) {
       if(posicao < 0 || posicao > tamanho) {
           System.out.println("Posição Invalida");
           return;
       }

       No novoNo = new No(valor);

       if(posicao == 0) {
           novoNo.proximo = primeiro;
           primeiro = novoNo;
       }else{
           No auxiliar = primeiro;
           for( int i = 0; i < posicao - 1; i++) {
               auxiliar = auxiliar.proximo;
           }
           novoNo.proximo = auxiliar.proximo;
           auxiliar.proximo = novoNo;
       }

       tamanho++;
   }

   public void removerInicio(){
       if(primeiro == null){
           System.out.println("Sua lista está vazia");
           return;
       }
       primeiro = primeiro.proximo;
       tamanho--;
   }

   public void removerFinal(){
       if(primeiro == null){
           System.out.println("Sua lista está vazia");
           return;
       }

       if(primeiro.proximo == null){
           primeiro = null;
       }else{
           No auxiliar = primeiro;
           while(auxiliar.proximo.proximo != null){
               auxiliar = auxiliar.proximo;
           }
           auxiliar.proximo = null;
       }

       tamanho--;

   }

   public void removerPosicao(int posicao){
       if(posicao < 0 || posicao >= tamanho){
           System.out.println("Posição inválida");
           return;
       }

       if(posicao == 0) {
           primeiro = primeiro.proximo;
       }else{
           No auxiliar = primeiro;
           for( int i = 0; i < posicao - 1; i++) {
               auxiliar = auxiliar.proximo;
           }
           auxiliar.proximo = auxiliar.proximo.proximo;
       }

       tamanho--;

   }

   public void removerElemento(int valor){
       if(primeiro == null){
           System.out.println("Sua Lista está vazia");
           return;
       }
       if(primeiro.valor == valor){
           primeiro = primeiro.proximo;
           tamanho--;
           return;

       }

       No auxiliar = primeiro;
       while(auxiliar.proximo != null && auxiliar.proximo.valor != valor){
           auxiliar = auxiliar.proximo;
       }

       if(auxiliar.proximo !=null){
           auxiliar.proximo = auxiliar.proximo.proximo;
           tamanho--;
       }else{
           System.out.println("O elemento não foi encontrado");
       }

   }

   public void exibirLista(){
       if(primeiro == null){
           System.out.println("Sua lista está vazia");
           return;
       }

       No auxiliar = primeiro;
       System.out.println(primeiro.valor + "");
       while(auxiliar.proximo != null){
          System.out.println(auxiliar.proximo.valor + " ");
          auxiliar = auxiliar.proximo;
       }

       System.out.println();

   }

   public int pesquisar(int valor){
       if(primeiro == null) {
           System.out.println("Sua Lista está vazia");
           return valor;
       }

       int posicao = 0;
       No auxiliar = primeiro;

       while(auxiliar.proximo != null){
           if(auxiliar.valor == valor){
               System.out.println("elemento na posião " + posicao);
               return posicao;
           }
           auxiliar = auxiliar.proximo;
           posicao++;


       }

       System.out.println("Elemento nao encontrado");

       return posicao;
   }

   public int getTamanho(){
       System.out.println("Tamanho da sua lista " + tamanho);
       return tamanho;
   }

    public static void main(String[] args) {

       ListaEncadeada lista = new ListaEncadeada(10);

       lista.criarListaVazia();

       lista.InserirNoInicio(10);
       lista.inserirPosicao(11, 1);
       lista.inserirPosicao(12,2);
       lista.inserirPosicao(14,3);
       lista.inserirPosicao(15,4);
       lista.inserirPosicao(16,5);
       lista.inserirPosicao(17,6);
       lista.inserirPosicao(18,7);
       lista.inserirPosicao(13,3);
       lista.inserirNoFim(20);
       lista.removerElemento(18);
       lista.removerInicio();
       lista.removerPosicao(1);
       lista.pesquisar(10);
       lista.getTamanho();
       lista.exibirLista();

    }
    
}

