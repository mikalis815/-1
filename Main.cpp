#include <iostream>
using namespace std;

int main() {
    // Объявляем и инициализируем массив
    int numbers[] = {3, 8, 15, 22, 7, 10, 4, 9, 6};
    
    // Вычисляем размер массива (количество элементов)
    int size = sizeof(numbers) / sizeof(numbers[0]);
    
    // Счетчик для четных чисел
    int evenCount = 0;
    
    cout << "Четные числа в массиве: ";
    
    // Цикл по всем элементам массива
    for (int i = 0; i < size; i++) {
        // Проверка на четность
        if (numbers[i] % 2 == 0) {
            // Увеличиваем счетчик
            evenCount++;
            // Выводим четное число
            cout << numbers[i] << " ";
        }
    }
    
    cout << endl;
    cout << "Общее количество четных чисел: " << evenCount << endl;
    
    return 0;
}