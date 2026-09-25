package src;
import java.util.Random;
public class Main {

    public static void moverse(int fila, int Columna, Snake snake){ //Se mueve sin haber comido
        Position newHead = new Position(fila, Columna);
        Boolean colision = false;
        for (int i = 0; i<snake.size();i++){
            if (snake.get(i).equals(newHead)){
                System.out.print("Game Over");
                colision = true;
            }
        }
        if (!colision){
            snake.addHead(newHead);
            snake.removeTail();
        }

        for (int i = 0; i<snake.size();i++){
            Position p = snake.get(i);
            if (i==0){
                System.out.println("Cola   "+i+": fila = " + p.row() + ": Columna = "+ p.column());
            } else if (i==snake.size()-1) {
                System.out.println("Cabeza "+i+": fila = " + p.row() + ": Columna = "+ p.column());
            } else {
                System.out.println("Cuerpo "+i+": fila = " + p.row() + ": Columna = "+ p.column());
            }

        }
    }

    public static void avecesDaAVecesQuita(int fila, int Columna, Snake snake){ //A veces come a veces no
        Random aleatorio = new Random();
        Position newHead = new Position(fila, Columna);
        Boolean colision = false;
        for (int i = 0; i<snake.size();i++){
            if (snake.get(i).equals(newHead)){
                System.out.print("Game Over");
                colision = true;
            }
        }
        Boolean comida = aleatorio.nextBoolean();
        if (!colision){
            if (comida){ //Si hay comida solo añade la cabeza si no entonces tambien quita la cola
                snake.addHead(newHead);
            } else {
                snake.addHead(newHead);
                snake.removeTail();
            }
        }
        for (int i = 0; i<snake.size();i++){
            Position p = snake.get(i);
            if (i==0){
                System.out.println("Cola   "+i+": fila = " + p.row() + ": Columna = "+ p.column());
            } else if (i==snake.size()-1) {
                System.out.println("Cabeza "+i+": fila = " + p.row() + ": Columna = "+ p.column());
            } else {
                System.out.println("Cuerpo "+i+": fila = " + p.row() + ": Columna = "+ p.column());
            }

        }
    }
    public static void main(String[] args) {
        Snake snake = new Snake(2);
        snake.addHead(new Position(0, 0)); 
        snake.addHead(new Position(0, 1)); 

        moverse(0, 2, snake);
        System.out.println();
        moverse(1, 2, snake);
        System.out.println();
        moverse(2, 2, snake);
        System.out.println();
        avecesDaAVecesQuita(3, 2, snake);
        System.out.println();
        avecesDaAVecesQuita(4, 2, snake);
        System.out.println();
        avecesDaAVecesQuita(4, 3, snake);
        System.out.println();
        moverse(4, 2, snake);
    }
}   
