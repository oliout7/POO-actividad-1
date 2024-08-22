
import java.util.List;
import java.util.ArrayList;

public class ListJava {
    public static void main(String[] args) {
        // Usando List con ArrayList (permite duplicados, mantiene orden)
        List<String> listaDeNombres = new ArrayList<>();

        // Agregar elementos
        listaDeNombres.add("Jose");
        listaDeNombres.add("Eduardo");
        listaDeNombres.add("Maria");
        listaDeNombres.add("Jose"); // Este duplicado se agregará

        // Imprimir elementos
        for (int i = 0; i < listaDeNombres.size(); i++) {
            System.out.println("Elemento en índice " + i + ": " + listaDeNombres.get(i));
        }
    }
}
