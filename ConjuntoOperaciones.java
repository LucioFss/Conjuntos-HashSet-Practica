import java.util.HashSet;
import java.util.Iterator;
public class ConjuntoOperaciones 
{
    private HashSet<Integer> conjuntoA;
    private HashSet<Integer> conjuntoB;

    public ConjuntoOperaciones() {
        conjuntoA = new HashSet<>();
        conjuntoB = new HashSet<>();
    }
    
    /**
     * Agrega un número al conjunto A.
     * Precondicion:
     *  El valor introducido numero debe ser mayor a cero.
     * postCondicion:
     *  El elemento numero se agrego al conjunto.
    */
    public void agregarA(int numero) {
        assert numero >= 0:"Numero debe ser mayor o igual a cero";
        
        int sizePreAgregar = numero;
        conjuntoA.add(numero);
        
        assert pertenece(conjuntoA,sizePreAgregar);
    }
    
    /**
     * Metodo que retorna true o false si un elemento pertenece a un conjunto
     * El conjunto y el numero deben ser proporcionados en el parametro del metodo
     * precondicion:
     *  numero debe ser mayor a cero o igual
     *  El conjunto debe ser no nulo
     */
    public boolean pertenece(HashSet<Integer> conjunto, int numero){
        assert numero > 0:"Numero debe ser natural";
        assert conjunto != null:"El conjuto no debe ser nulo";
        for(Integer i: conjunto){
            if(i == numero){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Agrega un número al conjunto B.
     * Precondicion:
     *  El valor introducido numero debe ser mayor a cero.
     * postCondicion:
     *  El elemento numero se agrego al conjunto.
     */
    public void agregarB(int numero) {
        assert numero >= 0: "El parametro numero debe ser mayor o igual a cero";
        
        int sizePreAgregar = conjuntoB.size();
        conjuntoB.add(numero);
        
        assert conjuntoB.size() == sizePreAgregar+1;
    }
    
    
    /**
     * Devuelve un nuevo conjunto que es la unión de A y B.
     */
    public HashSet<Integer> obtenerUnion() {
        HashSet<Integer> union = new HashSet<>();
        
        //se agregan los elemento del conjutoA atrave de Iterator y while
        
        Iterator<Integer> x = conjuntoA.iterator();
        while(x.hasNext()){
            Integer elem = x.next();
            union.add(elem);
        }
        
        /*
        for(Iterator<Integer> x = conjuntoA.iterator();x.hasNext();){
            Integer elem = x.next();
            union.add(elem);
        }
        */
        
        //se agregan los elemento del conjutoB atrave de Iterator y while
        Iterator<Integer> y = conjuntoB.iterator();
        while(x.hasNext()){
            Integer elem = x.next();
            union.add(elem);
        }
        
        return union;
    }
    
    
    /**
     * Devuelve un nuevo conjunto que es la intersección de A y B.
     */
    public HashSet<Integer> obtenerInterseccion() {
        HashSet<Integer> union = new HashSet<>();
        for(Integer i : conjuntoA){
            Integer elem1 = i;
            for(Integer n: conjuntoB){
                Integer elem2 = n;
                if(elem1.equals(elem2)){
                    union.add(elem2);
                }
            }
        }
        return union;
    }
    
    /**
     * Devuelve un nuevo conjunto que es la diferencia A - B.
     */
    public HashSet<Integer> obtenerDiferencia() {
        // IMPLEMENTAR
        return null;
    }
    
    /**
     * Determina si el conjunto A es subconjunto de B.
     */
    public boolean esSubconjuntoAenB() {
        // IMPLEMENTARfdffdfd
        return false;
    }
    
    /**
     * Elimina un número del conjunto A.
     */
    public void eliminarDeA(int numero) {
        // IMPLEMENTAR
    }
    
    /**
     * Vacía ambos conjuntos.
     */
    public void vaciarConjuntos() {
        // IMPLEMENTAR
        conjuntoA.clear();
        conjuntoB.clear();
    }
    
    /**
     * Devuelve la cantidad de elementos en el conjunto A.
     */
    public int tamañoConjuntoA() {
        // IMPLEMENTAR
        return -1;
    }
    
    /**
     * Muestra el contenido de A y B (podés usar System.out.println).
     */
    public void mostrarConjuntos() {
        // IMPLEMENTAR
    }
    
    public boolean repOK()
    {
        //se evalua que el conjunto a no sea nulo
        if(conjuntoA == null){
            return false;
        }
        //se evalua que el conjunto a no sea nulo
        if(conjuntoB == null){
            return false;
        }
        //evalua que todos los elementos del conjunto A sean naturales
        for(Integer cant: conjuntoA){
            if(cant < 0){
                return false;
            }
        }
        //evalua que todos los elementos del conjunto B sean naturales
        for(Integer cant: conjuntoB){
            if(cant < 0){
                return false;
            }
        }
        return true;
    }
}
