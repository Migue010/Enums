public enum Papeleria {
    Calculadora(10,15000),
    Cuadernos(50 ,4500),
    Lapices(100 , 1200),
    Carpetas(10 , 3000);


    private int unidades;
    private double costo;

    Papeleria(int unidades, double costo) {
        this.unidades = unidades;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Papeleria{" +
                "unidades=" + unidades +
                ", costo=" + costo +
                '}';
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
