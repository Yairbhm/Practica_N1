public class Reloj {
    private int hora;
    private int minutos;
    
    public Reloj(int horaInicial, int minutosIniciales) {
        hora = horaInicial;
        minutos = minutosIniciales;
    }
    
    public int getHora() {
        return hora;
    }
    
    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public int getMinutos() {
        return minutos;
    }
    
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    
    public void incrementarMinutos() {
        minutos++;
        if(minutos >= 60) {
            minutos = 0;
            hora++;
            if(hora >= 24) {
                hora = 0;
            }
        }
    }
    
    public void mostrarHora() {
        String horaStr = String.format("%02d", hora);
        String minutosStr = String.format("%02d", minutos);
        System.out.println("╔════════╗");
        System.out.println("║ " + horaStr + " : " + minutosStr + " ║");
        System.out.println("╚════════╝");
    }
}
