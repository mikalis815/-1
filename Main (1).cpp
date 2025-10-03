#include <iostream>
using namespace std;

int main() {
    // Исходный массив
    int original[] = {1, 2, 3, 4, 5, 6};
    
    // Определяем размер массива
    int size = sizeof(original) / sizeof(original[0]);
    
    // Создаем массив для перевернутых значений
    int reversed[size];
    
    cout << "Исходный массив: ";
    // Выводим исходный массив
    for (int i = 0; i < size; i++) {
        cout << original[i] << " ";
    }
    
    cout << endl;
    
    // Заполняем массив reversed в обратном порядке
    for (int i = 0; i < size; i++) {
        // original[size - 1 - i] - доступ к элементам с конца
        reversed[i] = original[size - 1 - i];
    }
    
    cout << "Перевернутый массив: ";
    // Выводим перевернутый массив
    for (int i = 0; i < size; i++) {
        cout << reversed[i] << " ";
    }
    
    cout << endl;
    
    return 0;
}