### Query Methods in Spring Data JPA
- nazwa metody musi sie zaczynac od przedrostkow takich jak np. findBy, findAllBy, deleteBy, deleteAllBy, 
existsBy, countBy. 
```text
Przykladowo: findAllByName(String name) lub deleteByEmail(String email)
```
- jezeli chcemy ograniczyc ilosc zwracanych rekordow, mozemy dodac slowka first lub top.
```text
Przykladowo: findFirst2ByName lub findTop10ByName.
```
- jezeli chcemy narzucic unikalnosc rezultatow powinnismy wykorzystac slowko distinct.
```text
Przykladowo: findDistinctByName.
```

### Named Queries and Named Native Queries
- mozna uzywac razem ze Spring Data JPA ale trzeba pamietac
o konwencji nazewnictwa.

### Adnotacja @Query
- przy skomplikowanych zapytaniach lepiej korzystac z @Query
ze wzgledu na czytelnosc.
