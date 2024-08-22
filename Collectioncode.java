import java.util.Collection;
import java.util.HashSet;

public class Collectioncode{
    public static void main(String[] args) {
        // Usando Collection con HashSet (no permite duplicados, no mantiene orden)
        Collection<String> ListaDeNombres = new HashSet<>();

        // Agregar elementos
        ListaDeNombres.add("Juan");
        ListaDeNombres.add("María");
        ListaDeNombres.add("Pedro");
        ListaDeNombres.add("Juan"); // Este duplicado no se agregará

        // Imprimir elementos
        for (String nombre : ListaDeNombres) {
            System.out.println(nombre);
        }
    }
}

