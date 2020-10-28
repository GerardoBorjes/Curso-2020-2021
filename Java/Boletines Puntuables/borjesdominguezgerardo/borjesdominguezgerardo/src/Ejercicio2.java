
import java.util.Scanner;







public class Ejercicio2 {
    
    public static void main(String[] args) {
    
        Scanner $reader;
        String $emails[] = new String[10];
        $emails[0] = "GerardoBorjes@gmail.com";
        $emails[1] = "JohnDoe@yahoo.com";
        $emails[2] = "JaneDoe@outlook.com";
        $emails[3] = "Usuario@hotmail.com";
        $emails[4] = "Usuario1@yahoo.com";

System.out.println($emails[5]);
        boolean $Salir = false;
        do {
       
            System.out.println("1. Guardar un nuevo mail");
            System.out.println("2. Buscar un mail");
            System.out.println("3. Contar mails");
            System.out.println("4. Porcentaje de correos");
            System.out.println("5.Salir");
            $reader = new Scanner(System.in);
           int $opcion = $reader.nextInt();
           switch ($opcion) {
               case 1:
                System.out.println("Introduce un correo");
                $reader = new Scanner(System.in);
                    String $mail = $reader.nextLine();
                    $GuardarEnMatriz($emails, $mail);
                   break;

                   case 2:
                   System.out.println("Escribe un mail para saber si existe");
                   $reader = new Scanner(System.in);
                   int $Index = $Encontrar($emails, $reader.nextLine());
                   if($Index > -1){
                        System.out.println("El email existe, está almacenado en la posición: " + $Index);
                   }
                   break;

                   case 3:
                   System.out.println("La cantidad de emails en la matriz es: " + $ContarLlenos($emails));
                   break;

                   case 4:
                   String $Sufijos[] = {"gmail.com", "hotmail.com", "yahoo.com", "outlook.com"};
                 int  $CantidadDeMails = $ContarLlenos($emails);
                   for (int i = 0; i < $Sufijos.length; i++) {
                        int $counter = 0;
                       for (int j = 0; j < $emails.length; j++) {
                           if($emails[j] != null){
                             
                         

                            if($emails[j].substring($emails[j].lastIndexOf('@')+1) .equals($Sufijos[i])){

                                $counter++;
                           }
                           }
                     
                           
                        }

                        System.out.println("El porcentaje de mails del dominio " + $Sufijos[i] + " Es del " + ((100*$counter)/$CantidadDeMails) + "%");
                    }
                    break;
                    case 5:
                    $Salir = true;
                    $reader.close();
                    break;
               
               default:
               $reader.close();
               $Salir = true;
                   break;
           }
            
        } while (!$Salir);

    }

    /**
     * Método que cuenta el número de objetos dentro de un array que no son nulos.
     * @param array
     * @return
     */
    static int $ContarLlenos(Object array[]){
        int $counter= 0;
        for (Object object : array) {
            if(object != null){
                $counter++;
            }
        }

        return $counter;

    }


/**
 * Método que recibe una matriz y un objeto, guarda el objeto en la primera posición no definida de la matriz.
 * @param array
 * @param item
 */
    static void $GuardarEnMatriz(Object array[], Object item){
   
       for (int i = 0; i < array.length; i++) {
           System.out.println(array[i]);
           if(array[i] == null){
                array[i] = item;
          
                break;
           }
       }
    }
    /**
     * Método que devuelve un entero con el índice de un objeto en una matriz, si no existe, devuelve -1
     * @param array
     * @param item
     * @return
     */
    static int $Encontrar(Object array[], Object item){

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(item)){
                return i;
            }
        }

        return -1;
    }

}
