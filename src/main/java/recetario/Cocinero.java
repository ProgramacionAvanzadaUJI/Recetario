package recetario;

public class Cocinero {
    private void preparaReceta(Paella paella) {
        paella.preparaReceta();
    }

    private void preparaReceta(LubinaAlHorno lubinaAlHorno) {
        lubinaAlHorno.preparaLubina();
    }
    public void aCocinar() {
        Paella paella = new Paella();
        preparaReceta(paella);
        LubinaAlHorno lubinaAlHorno = new LubinaAlHorno();
        preparaReceta(lubinaAlHorno);
    }
}
