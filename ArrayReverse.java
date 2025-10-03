public class ArrayReverse {
    public static void main(String[] args) {
        // Исходный массив
        int[] original = {1, 2, 3, 4, 5, 6};
        
        // Создаем новый массив такой же длины
        int[] reversed = new int[original.length];
        
        System.out.print("Исходный массив: ");
        // Выводим исходный массив
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        
        System.out.println();
        
        // Заполняем reversed в обратном порядке
        for (int i = 0; i < original.length; i++) {
            // Берем элементы с конца original и помещаем в начало reversed
            // original.length - 1 - i вычисляет обратный индекс
            reversed[i] = original[original.length - 1 - i];
        }
        
        System.out.print("Перевернутый массив: ");
        // Выводим результат
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
}