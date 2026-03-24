import java.util.ArrayList;
public class Fila {
    private ArrayList<String> fila = new ArrayList<>();

    public void enqueue(String item){
        fila.add(item);
    }

    public String dequeue(){
        if (!fila.isEmpty()){
            return fila.remove(0);
        }
        return null;
    }

    public String front(){
        if (!fila.isEmpty()){
            return fila.get(0);
        }
        return null;
    }

    public boolean isEmpty(){
        return fila.isEmpty();
    }

    public static void main(String[] args){
        Fila fila = new Fila();
        fila.enqueue("a");
        fila.enqueue("b");
        fila.enqueue("c");
        fila.enqueue("d");
        fila.enqueue("e");

        System.out.println("Elemento Removido: "+fila.dequeue());
        System.out.println("Elemento Em frente: "+fila.front());
        System.out.println("Está vazia: "+fila.isEmpty());
    }
}