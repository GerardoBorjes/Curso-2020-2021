package src;

public class Ex1 {

    public void ExAreaDeTriangulo() {
        float base = Float.parseFloat(Boletin1.readline("introduzca la base del triángulo: "));
        float altura = Float.parseFloat(Boletin1.readline("Introduzca la altura: "));
        Boletin1.println("\n El área del triángulo es " + (base * altura) / 2f);
    }

    public void ExSelect(int index) {

        switch (index) {
            case 1:
                ExAreaDeTriangulo();
                break;
            case 2:
                ExAreaDeTriangulo();
                break;
            case 3:
                ExAreaDeTriangulo();
                break;
            case 4:
                ExAreaDeTriangulo();
                break;
            case 5:
                ExAreaDeTriangulo();
                break;

            default:
                break;
        }

    }

}
