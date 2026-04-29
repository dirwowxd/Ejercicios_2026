public abstract class Cazador implements  Evaluable, Promovible{
    String nombre, alias;
    TipoArma arma;
    double danioBase, pagoBase;


    public Cazador(String nombre, String alias, TipoArma arma, double danioBase) {
        this.nombre = nombre;
        this.alias = alias;
        this.arma = arma;
        this.danioBase = danioBase;
    }
    public double calcularPago() {
        return pagoBase;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Alias: " + alias);
        System.out.println("Arma: " + arma);
        System.out.println("DanioBase: " + danioBase);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public TipoArma getArma() {
        return arma;
    }

    public void setArma(TipoArma arma) {
        this.arma = arma;
    }

    public double getDanioBase() {
        return danioBase;
    }

    public void setDanioBase(double danioBase) {
        this.danioBase = danioBase;
    }

    public double getPagoBase() {
        return pagoBase;
    }

    public void setPagoBase(double pagoBase) {
        this.pagoBase = pagoBase;
    }
    @Override
    public void mostrarEficencia(){
        System.out.println("Eficiencia : "+this.calcularEficencia());
    }

    @Override
    public abstract double calcularEficencia();
    @Override
    public abstract boolean puedeSubirDeRango();

    @Override
    public abstract String getRangoActual();


}
