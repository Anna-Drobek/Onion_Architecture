# Onion_Architecture :onion:
*Badanie Onion Architecture na laboratorium z Projektowania wielowarstwowych aplikacji internetowych*

Ten projekt stanowi prosty przykład implementacji Onion Architecture w języku Java. Architektura ta ma na celu separację zależności między warstwami aplikacji, tak aby każda z nich odpowiadała za określone zadania, co ułatwia utrzymanie, rozwijanie i testowanie aplikacji.

:desktop_computer:
Ten projekt to prosty kalkulator napisany w języku Java. Zawiera klasę główną "Application", która umożliwia użytkownikowi wybór jednej z czterech operacji matematycznych: dodawanie, odejmowanie, mnożenie i dzielenie. Po wybraniu operacji użytkownik musi podać dwie liczby, a następnie zostanie wyświetlony wynik operacji. Projekt wykorzystuje wzorzec architektoniczny "Onion Architecture" i składa się z trzech głównych warstw: domeny, aplikacji i infrastruktury. Interfejs kalkulatora zdefiniowany jest w warstwie domeny, a jego implementacja znajduje się w warstwie infrastruktury. Warstwa aplikacji zawiera główną logikę programu i zarządza komunikacją między warstwą domeny a infrastrukturą.

## Przegląd architektury
![Onion Architecture](https://github.com/Anna-Drobek/Onion_Architecture/blob/main/onion.png)

Onion Architecture składa się z wielu warstw, z których każda ma określone zadania i zależności:
- Warstwa domenowa - zawiera logikę biznesową i reguły aplikacji, oraz stanowi rdzeń systemu. Ta warstwa jest niezależna od infrastruktury lub interfejsów użytkownika i definiuje encje, obiekty wartościowe i usługi domenowe.
- Warstwa aplikacyjna - zawiera logikę specyficzną dla aplikacji, taką jak przypadki użycia i przepływy sterowania, oraz orchestracja interakcji między warstwą domenową a warstwą infrastruktury.
- Warstwa infrastruktury - zawiera implementacje interfejsów zdefiniowanych w warstwie aplikacyjnej i domenowej, takie jak obiekty dostępu do danych, repozytoria i zewnętrzne usługi. Ta warstwa jest odpowiedzialna za interakcję z zewnętrznymi systemami i technologiami.

## Struktura projektu
Projekt jest zorganizowany zgodnie z zasadami Onion Architecture i składa się z trzech modułów:
- domain
- application
- infrastructure
