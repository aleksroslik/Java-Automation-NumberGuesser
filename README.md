# Szkolka-automatyzacji-Java
Zadanie java 1 (może być też do wykonania po lekcji z Darkiem, bo też będą wymagały wiadomości z lekcji z nim, no chyba że ktoś się czuje na siłach to śmiało)
 
import java.util.Random;
 
public class Main {​​​​
 
    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(100);
    }
}
 

Powyższy kod spowoduje przypisanie do zmiennej 'numberToGuess' losowo wybranej liczby z zakresu 0-99. Wykorzystaj go do wykonania poniższego zadania:
 

Gra w zgadywanie polegająca na tym, że program losuje liczbę, a użytkownik próbuje ją odgadnąć.
 
Wymagania:
1. Program losuje liczbę z zakresu 0-99.
 
2. Program wyświetla komunikat z prośbą o rozpoczęcie zgadywania liczby całkowitej z zakresu 0-99
 
3. Program wczytuje liczbę wpisaną przez użytkownika.
 
4. Użytkownik powinien mieć maksymalnie 5 prób zgadywania.
 
5. Zachowanie programu podczas podania niepoprawnej liczby:
- w przypadku podania zbyt dużej liczby wypisać do konsoli: "Your number is GREATER than the one you are trying to guess"
- w przypadku podania zbyt małej liczby wypisać do konsoli: "Your number is LOWER than the one you are trying to guess"
- podać ile prób zostało mu do końca.
- jeżeli nie była to jego ostatnia próba to wypisać tekst: "Please try again"
 

6. Jeżeli użytkownik zgadł liczbę, program powinien wydrukować tekst "You guessed it!"
 
7. Jeżeli w ciągu 5 prób nie udało się odgadnąć liczby użytkownik, program ma wydrukować wiadomość:
"Sorry you didn't guess the number, the answer was: "
oraz dopisać do niej jaka była wartość liczby której nie udało się odgadnąć
