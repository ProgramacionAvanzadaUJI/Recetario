package recetario;

public class Cocinero {
    private void preparaReceta(Receta receta) {
        receta.preparaReceta();
    }

    public void aCocinar() {
        Receta receta = new Paella();
        preparaReceta(receta);
        receta = new LubinaAlHorno();
        preparaReceta(receta);
    }
}
