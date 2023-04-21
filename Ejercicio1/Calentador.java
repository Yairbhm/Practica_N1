public class Calentador {
    private int temperaturaMinima;
    private int temperaturaMaxima;
    private int temperaturaActual;
    private int incremento;

    public Calentador(int temperaturaMinima, int temperaturaMaxima, int incremento) {
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaActual = temperaturaMinima;
        this.incremento = incremento;
    }

    public void calentar() {
        if (temperaturaActual + incremento <= temperaturaMaxima) {
            temperaturaActual += incremento;
        } else {
            mostrarAlertaMaxima();
        }
    }

    public void enfriar() {
        if (temperaturaActual - incremento >= temperaturaMinima) {
            temperaturaActual -= incremento;
        } else {
            mostrarAlertaMinima();
        }
    }

    public void mostrarAlertaMaxima() { 
    String mensaje = "¡ALERTA DE TEMPERATURA MÁXIMA!\n\n" +
                     "La temperatura actual (" + temperaturaActual + " grados) ha superado la temperatura máxima permitida (" + temperaturaMaxima + " grados).\n" +
                     "Por favor, enfriar el agua antes de continuar utilizando el calentador.";

    System.out.println(mensaje);
}

    public void mostrarAlertaMinima() {
    String mensaje = "¡ALERTA DE TEMPERATURA MINIMA!\n\n" +
                     "La temperatura actual (" + temperaturaActual + " grados) ha superado la temperatura minima permitida (" + temperaturaMinima + " grados).\n" +
                     "Por favor, Calentar el agua antes de continuar utilizando el calentador.";

    System.out.println(mensaje);
    }
    
    public void MostrarInfo() {

    String Info = "╔════════════════════════════╗\n" +
                   "║    Información del calentador   ║\n" +
                   "╠════════════════════════════╣\n" +
                   "  La Temperatura actual es:  "  + temperaturaActual + "°C    \n"+
                   "  La Temperatura minima es:  "  + temperaturaMinima + "°C    \n"+
                   "  La Temperatura maxima es:  "  + temperaturaMaxima + "°C    \n"+
                   "  El Incremento es:  "  + incremento + "°C             \n"+
                   "╚════════════════════════════╝\n";
    System.out.println(Info);
}
    // Getters y Setters
    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(int temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(int temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public int getTemperaturaActual() {
        return temperaturaActual;
    }

    public void setTemperaturaActual(int temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }
}
