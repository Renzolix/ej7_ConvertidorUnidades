public class ConvertidorUnidades {

    // Firma 1: metros a centímetros
    public double convertir(double metros) {
        return metros * 100.0;
    }

    // Firma 2: metros a kilómetros o milímetros
    public double convertir(double metros, boolean aKilometros) {
        if (aKilometros) {
            return metros / 1000.0;
        } else {
            return metros * 1000.0;
        }
    }

    // Firma 3: pies a metros
    public double convertir(int pies) {
        return pies * 0.3048;
    }

    public static void main(String[] args) {
        ConvertidorUnidades conv = new ConvertidorUnidades();

        double cm = conv.convertir(5.5); // Invoca Firma 1
        double km = conv.convertir(1500.0, true); // Invoca Firma 2
        double mm = conv.convertir(2.5, false);  // Invoca Firma 2
        double mts = conv.convertir(10); // Invoca Firma 3 (parámetro int)

        System.out.println("5.5 metros a cm: " + cm + " cm");
        System.out.println("1500 metros a km: " + km + " km");
        System.out.println("2.5 metros a mm: " + mm + " mm");
        System.out.println("10 pies a metros: " + mts + " mts");
    }
}