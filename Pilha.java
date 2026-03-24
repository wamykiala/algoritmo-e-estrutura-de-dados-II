import java.util.ArrayList;
public class Pilha {
    private ArrayList<Integer> pilha = new ArrayList<>();

    public void push_empilhar(int a){
        pilha.add(a);
    }

    public Integer pop_remover(){
        if (!pilha.isEmpty()){
            return pilha.remove(pilha.size()-1);
        }
        return null;
    }

    public Integer peek_topo(){
        if (!pilha.isEmpty()){
            return pilha.get(pilha.size()-1);
        }
        return null;
    }

    public boolean isEmpty(){
        return pilha.isEmpty();
    }

    public static void main(String[] args){
        Pilha pilha = new Pilha();
        pilha.push_empilhar(10);
        pilha.push_empilhar(5);
        pilha.push_empilhar(34);
        pilha.push_empilhar(14);
        pilha.push_empilhar(22);
        System.out.println("Ver elemento no Topo: "+pilha.peek_topo());
        System.out.println("Elemento Removido: "+pilha.pop_remover());
        System.out.println("Está vazia: "+pilha.isEmpty());
    }


}