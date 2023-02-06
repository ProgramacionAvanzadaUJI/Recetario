package recetario;

public class Paella implements Receta {
    @Override
    public void preparaReceta() {
        System.out.println("Lava y trocea la verdura.");
        System.out.println("Corta el pollo.");
        System.out.println("Fríe el pollo.");
        System.out.println("Añade la verdura");
        System.out.println("Añade agua.");
        System.out.println("Deja hervir");
        System.out.println("Añade el arroz.");
        System.out.println("Espera 20 minutos.");
        System.out.println("Sirve en un plato.");
    }
}
