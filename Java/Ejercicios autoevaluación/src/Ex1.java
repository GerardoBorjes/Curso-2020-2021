
public class Ex1 {

    public void ExAreaDeTriangulo() {
        float base = Float.parseFloat(Boletin1.readline("introduzca la base del triángulo: "));
        float altura = Float.parseFloat(Boletin1.readline("Introduzca la altura: "));
        Boletin1.println("\n El área del triángulo es " + (base * altura) / 2f);
    }

    public void ExCircunferencia() {
        float radio = Float.parseFloat(Boletin1.readline("Introduzca el radio de la circunferencia: "));

        Boletin1.println("La longitud de esta circunferencia es: " + 2 * Math.PI * radio);
        Boletin1.println("El volumen de esta circunferencia es: " + (4 / 3) * radio * Math.pow(Math.PI, 3));
        Boletin1.println("La superficie de esta circunferencia es: " + Math.PI * Math.pow(radio, 2));
    }

    public void ExFarenheitACelsius() {
        float fahrenheit = Float.parseFloat(Boletin1.readline("Introduzca la temperatura en farenheit: "));
        Boletin1.println("La temperatura de " + fahrenheit + " grados fahrenheit es de " + ((fahrenheit - 23) * 5) / 9
                + " grados celsius");

    }

    public void ExIntercambio() {
        int x = 5, y = 1, guarda = 0;
        Boletin1.println("En estos momentos la variable \"X\" vale " + x + " Y la variable \"Y\" vale " + y
                + " Se intercambiarán mediante una variable intermedia. ");

        guarda = x;
        x = y;
        y = guarda;

        Boletin1.println("Ahora la variable \"X\" vale " + x + " Y la variable \"Y\" vale " + y + " ...(Magia!) ");

    }

    public void ExPreciosPorcentuales() {

        float precioInicial = Float.parseFloat(Boletin1.readline("Introduzca el precio inicial: "));
        float precioDescontado = precioInicial - Boletin1.Percentage(precioInicial, 15);
        Boletin1.println(
                "El precio inicial era " + precioInicial + " El precio con el 15% de descuento es " + precioDescontado);

    }

    public void ExSelect(int index) {

        switch (index) {
            case 1:
                ExAreaDeTriangulo();
                break;
            case 2:
                ExCircunferencia();
                break;
            case 3:
                ExFarenheitACelsius();
                break;
            case 4:
                ExIntercambio();
                break;
            case 5:
                ExPreciosPorcentuales();
                break;

            default:
                Boletin1.println("1. Area de un triángulo");
                Boletin1.println("2. Valores de una circunferencia");
                Boletin1.println("3. Paso de Fahrenheit a Celsius");
                Boletin1.println("4. Intercambio de variables");
                Boletin1.println("5. Aplicar descuento porcentual");
                break;
        }

    }

}
