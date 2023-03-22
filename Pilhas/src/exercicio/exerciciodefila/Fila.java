package exercicio.exerciciodefila;

public class Fila<T> {
    
    private No2<T> refNo2EntradaFila;


    public Fila() {
        this.refNo2EntradaFila = null;

    }

    public void enqueue(T object){
        No2 novNo2 = new No2(object);
        novNo2.setRefNo2(refNo2EntradaFila);
        refNo2EntradaFila = novNo2;


    }

    public T first(){
        if (!this.isEmpty()) {
            No2 primeiroNo2 = refNo2EntradaFila;
            while (true) {
                if (primeiroNo2.getRefNo2() != null) {
                    primeiroNo2 = primeiroNo2.getRefNo2();
                    
                }else{
                    break;
                }
                
            }
            return (T) primeiroNo2.getObject();
        }
        return null;

    }

    public T dequeue(){
        if (!this.isEmpty()) {
            No2 primeiroNo2 = refNo2EntradaFila;
            No2 noAuxiliar2 = refNo2EntradaFila;
            while (true) {
                if (primeiroNo2.getRefNo2() != null) {
                    noAuxiliar2 = primeiroNo2;
                    primeiroNo2 = primeiroNo2.getRefNo2();
                    
                }else{
                    noAuxiliar2.setRefNo2(null);
                    break;
                }
                
            }
            return (T) primeiroNo2.getObject();
        }
        return null;

    }

    public boolean isEmpty(){
        return refNo2EntradaFila == null? true : false;


    }

    @Override
    public String toString() {
        String stringRetorno2 = "";
        No2 noAuxiliar2 = refNo2EntradaFila;

        if(refNo2EntradaFila != null){
            while (true) {
                stringRetorno2 += "[No2{objeto=" + noAuxiliar2.getObject() + "}]---";
                if (noAuxiliar2.getRefNo2() != null) {
                    noAuxiliar2 = noAuxiliar2.getRefNo2();
                    
                }else{
                    stringRetorno2 += "null";
                    break;
                }
            }

        }else{
            stringRetorno2 = "null";
        }
        return stringRetorno2;
    }

    
}
