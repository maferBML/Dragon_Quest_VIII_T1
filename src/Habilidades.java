public class Habilidades {
    private String nombre;
    private TipoHabilidad tipo;
    private int costeMP;
    private int poder;
    private int duracion;

    

    public Habilidades(String nombre, TipoHabilidad tipo, int costeMP, int poder, int duracion, String[] habilidades) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.costeMP = costeMP;
        this.poder = poder;
        this.duracion = duracion;
        this.habilidades = habilidades;
    }
    

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public TipoHabilidad getTipo() {
        return tipo;
    }
    public void setTipo(TipoHabilidad tipo) {
        this.tipo = tipo;
    }
    public int getCosteMP() {
        return costeMP;
    }
    public void setCosteMP(int costeMP) {
        this.costeMP = costeMP;
    }
    public int getPoder(){
        return poder;
    }
    public void setPoder(int poder) {
        this.poder = poder;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;

    }
    private String[] habilidades;
    public String[] getHabilidades() {
        return habilidades;
    }
    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }
}

