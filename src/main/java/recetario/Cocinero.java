package recetario;

public class Cocinero {
    private void preparaReceta(Receta receta) {
        receta.preparaReceta();
    }

    public void aCocinar() {
        preparaReceta(new Paella());
        preparaReceta(new LubinaAlHorno());
    }
}
