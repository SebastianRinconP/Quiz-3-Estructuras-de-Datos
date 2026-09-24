package src;

public class Main {
    public static void main(String[] args) {

        // Snake inicial: cola en (0,0), cabeza en (0,1)
        Snake snake = new Snake(2);
        snake.addHead(new Position(0, 0)); // esto sería la cola inicial
        snake.addHead(new Position(0, 1)); // esto sería la cabeza inicial

        // Simulamos un movimiento hacia la derecha sin comer:
        Position newHead = new Position(0, 2);

        // "colision" revisaría si newHead coincide con alguna posición actual
        boolean choco = false;
        for (int i = 0; i < snake.size(); i++) {
            if (snake.get(i).equals(newHead)) {
                choco = true;
            }
        }

        if (!choco) {
            snake.addHead(newHead);   // se agrega la nueva cabeza
            snake.removeTail();       // se quita la cola anterior (no comió)
        }

        // Imprimir el estado actual de la serpiente
        for (int i = 0; i < snake.size(); i++) {
            Position p = snake.get(i);
            System.out.println("Segmento " + i + ": fila=" + p.row() + ", columna=" + p.column());
        }
    }
}

/*
        DynamicArray<String> arr = new DynamicArray<>(4);

        arr.append("A");
        arr.append("B");
        arr.append("C");
        arr.append("D");

        System.out.println("size: " + arr.size());       // 4
        System.out.println("capacity: " + arr.capacity()); // 4

        arr.append("E"); // aquí size == capacity, se dispara resize()

        System.out.println("size: " + arr.size());       // 5
        System.out.println("capacity: " + arr.capacity()); // 8 (se duplicó)

        System.out.println(arr.get(0)); // "A"
        System.out.println(arr.get(4)); // "E"

        arr.set(0, "Z");
        System.out.println(arr.get(0)); // "Z"

        String ultimo = arr.removeLast();
        System.out.println("Se removió: " + ultimo);       // "E"
        System.out.println("size: " + arr.size());          // 4

        // Ejemplo con Integer
        DynamicArray<Integer> nums = new DynamicArray<>(2);
        nums.append(10);
        nums.append(20);
        nums.append(30); // dispara resize a capacity 4

        System.out.println("size: " + nums.size());     // 3
        System.out.println("capacity: " + nums.capacity()); // 4
	}
         */