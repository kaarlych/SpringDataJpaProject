### Query Methods in Spring Data JPA
1. nazwa metody musi sie zaczynac od przedrostkow takich jak np. findBy, findAllBy, deleteBy, deleteAllBy, 
existsBy, countBy. Przykladowo: findAllByName(String name) lub deleteByEmail(String email)
2. jezeli chcemy ograniczyc ilosc zwracanych rekordow, mozemy dodac slowka first lub top.
- Przykladowo: findFirst2ByName lub findTop10ByName.
3. Jezeli chcemy narzucic unikalnosc rezultatow powinnismy wykorzystac slowko distinct.
- Przykladowo: findDistinctByName.