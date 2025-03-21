# 17# Spring Data JPA Notes

---

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
---

### Named Queries and Named Native Queries
- mozna uzywac razem ze Spring Data JPA ale trzeba pamietac
o konwencji nazewnictwa.

---

### Adnotacja @Query
- przy skomplikowanych zapytaniach lepiej korzystac z @Query
ze wzgledu na czytelnosc

---

### Spring Data JPA Query by Example
- nie mozna konstruowac zapytan grupujacych warunki:
```text
Przykladowo: (name=?1 or surname=?2) and telephone=?3
```
- nie jestesmy w stanie odtworzyc wszystkich operatorow porownania na jakie pozwala SQL

---

### @EntityGraph
- rozwiazanie problemu n+1
- rozwiazanie problemu LazyInitializationException
```text
 @EntityGraph(
            type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {
                    "purchaseEntities",
                    "purchaseEntities.opinionEntity"
            }
    )
    CustomerEntity findByEmail(String email);
```
- FETCH - gdy wykorzystamy to ustawienie, to atrybuty okreslone w adnotacji @EntityGraph
beda traktowane jak Eager, natomaist pozostale (nie uzyte w adnotacji) jak FetchType.LAZY
- LOAD - Gdy wykorzystamy to ustawienie, to atrybuty okreslone w adnotacji @EntityGraph
beda traktowane jak EAGER, natomiast pozostale (nie uzyte w adnotacji) zgodnie z okreslonym
ustawieniem lub domyslnym ustawieniem FetchType

---

### Podsumowanie - sposoby na prace z danymi
1. JDBC template
2. Spring Data Access - JDBCTemplate,
3. JPA i metody wywolywane na EntityManager (Session),
4. JPA i JPQL (HQL),
5. JPA i Criteria API,
6. Named Queries,
7. Named Native Queries,
8. Spring Data - Repositories,
9. Spring Data - Query Methods
10. Spring Data @Query - JPQL,
11. Spring Data @Query - Native Queries,
12. Spring Data - Query by Example 