public class EvenNumbersCounter {
    public static void main(String[] args) {
        // Создаем массив с произвольными числами
        int[] numbers = {3, 8, 15, 22, 7, 10, 4, 9, 6};
        
        // Счетчик для четных чисел
        int evenCount = 0;
        
        System.out.print("Четные числа в массиве: ");
        
        // Проходим по всем элементам массива
        for (int i = 0; i < numbers.length; i++) {
            // Проверяем, является ли число четным
            // Число четное, если остаток от деления на 2 равен 0
            if (numbers[i] % 2 == 0) {
                // Увеличиваем счетчик четных чисел
                evenCount++;
                // Выводим найденное четное число
                System.out.print(numbers[i] + " ");
            }
        }
        
        // Переходим на новую строку
        System.out.println();
        // Выводим общее количество четных чисел
        System.out.println("Общее количество четных чисел: " + evenCount);
    }
}