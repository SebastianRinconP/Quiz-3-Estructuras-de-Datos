public class Main
{
	public static void main(String[] args) {
   
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
}
