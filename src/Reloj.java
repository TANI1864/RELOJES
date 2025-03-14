public class Reloj {
    private String marca;
    private String modelo;
    private int hora;
    private int minutos;


    public Reloj() {
        this.marca = "Desconocida";
        this.modelo = "Genérico";
        this.hora = 0;
        this.minutos = 0;
    }


    public Reloj(String marca, String modelo, int hora, int minutos) {
        this.marca = marca;
        this.modelo = modelo;
        setHora(hora);
        setMinutos(minutos);
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida. Se asignará 0.");
            this.hora = 0;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        } else {
            System.out.println("Minutos inválidos. Se asignará 0.");
            this.minutos = 0;
        }
    }

    public void avanzarMinutos(int incremento) {
        if (incremento > 0) {
            minutos += incremento;
            while (minutos >= 60) {
                minutos -= 60;
                hora++;
                if (hora >= 24) {
                    hora = 0;
                }
            }
            System.out.println("Hora actualizada: " + mostrarHora());
        } else {
            System.out.println("Ingrese un valor positivo para avanzar los minutos.");
        }
    }

    public String mostrarHora() {
        return String.format("%02d:%02d", hora, minutos);
    }

    public void mostrarInfo() {
        System.out.println("\n--- Información del Reloj ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Hora actual: " + mostrarHora());
    }
}
