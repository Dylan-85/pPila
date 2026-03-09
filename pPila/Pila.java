import java.util.*;

public class Pila 
{
    public static void main(String[] args) 
    {
        boolean seguir = true;
        Stack<Integer> p = new Stack<>();
        Scanner sc = new Scanner(System.in);

        while (seguir) 
        {
            System.out.println("Ingresar valor aleatorio: 1");
            System.out.println("Salir: 2");
            p.push((int)(Math.random()*50+1));

            if (sc.nextInt() == 2) {
                seguir = false;
            }

        }

            System.out.println(p);

    }
}
;