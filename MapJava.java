import java.util.Map;
import java.util.HashMap;

public class MapJava {
    public static void main(String[] args) {
        // Usando Map con HashMap (almacena pares clave-valor, sin orden específico)
        Map<String, String> mapaDeNombres = new HashMap<>();

        // Agregar pares clave-valor al Map
        mapaDeNombres.put("002307", "Alejandra");
        mapaDeNombres.put("000426", "Diego");
        mapaDeNombres.put("001109", "Naomi");
        mapaDeNombres.put("001028", "Jorge"); // Esta clave ya existe, el valor se actualizará

        // Imprimir los pares clave-valor
        for (Map.Entry<String, String> entrada : mapaDeNombres.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
    }
}
