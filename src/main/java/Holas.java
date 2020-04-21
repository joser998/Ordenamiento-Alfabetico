import java.util.Scanner;
public class Holas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("¿Cuantos nombres quieres guardar?");
        int cant=sc.nextInt();
        
        String nombres[] = new String [cant];
        
        System.out.println("Guardar Datos\n");
        sc.nextLine();
        for(int i=0; i<nombres.length; i++){
            System.out.print("Nombre: ");
            nombres[i]=sc.nextLine();
        }
        
        //Ordenamiento Alfabetico
        for(int i=0; i<nombres.length; i++){
            for(int j=0; j<nombres.length && i!=j; j++){
                if(nombres[i].compareToIgnoreCase(nombres[j]) < 0){
                    String aux=nombres[i];
                    nombres[i]=nombres[j];
                    nombres[j]=aux;
                }
            }
        }
        
        //Muestra Nombres Alfabeticamente
        System.out.println("\nMuestra Nombres Alfabeticamente:");
        for(String mostrar:nombres){
            System.out.println(mostrar);
        }
        
        //Muestra Nombres Inversamente Alfabeticamente
        System.out.println("\nMuestra Nombres Inversamente Alfabeticamente:");
        for(int i=nombres.length-1; i>=0; i--)
            System.out.println(nombres[i]);
        
        
        
        
        
        
    }
}