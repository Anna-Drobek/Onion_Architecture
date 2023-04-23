# Onion_Architecture
Badanie Onion Architecture

Ten projekt stanowi prosty przykład implementacji Onion Architecture w języku Java. Architektura ta ma na celu separację zależności między warstwami aplikacji, tak aby każda z nich odpowiadała za określone zadania, co ułatwia utrzymanie, rozwijanie i testowanie aplikacji.

## Przegląd architektury
Onion Architecture składa się z wielu warstw, z których każda ma określone zadania i zależności:
- Warstwa domenowa - zawiera logikę biznesową i reguły aplikacji, oraz stanowi rdzeń systemu. Ta warstwa jest niezależna od infrastruktury lub interfejsów użytkownika i definiuje encje, obiekty wartościowe i usługi domenowe.
- Warstwa aplikacyjna - zawiera logikę specyficzną dla aplikacji, taką jak przypadki użycia i przepływy sterowania, oraz orchestracja interakcji między warstwą domenową a warstwą infrastruktury.
- Warstwa infrastruktury - zawiera implementacje interfejsów zdefiniowanych w warstwie aplikacyjnej i domenowej, takie jak obiekty dostępu do danych, repozytoria i zewnętrzne usługi. Ta warstwa jest odpowiedzialna za interakcję z zewnętrznymi systemami i technologiami.

## Struktura projektu
Projekt jest zorganizowany zgodnie z zasadami Onion Architecture i składa się z trzech modułów:
- domain
- application
- infrastructure
