# SpringTodoApp

## Aplikacja Springowa z interfejsem REST służąca do zarządzania zadaniami "Todo"

Do stworzenia aplikacji wykorzystano:
  - Framework Spring,
  - Bazę danych H2 do przechowywania informacji na temat zadań, grup zadań oraz projektów,
  - Flyway jako narzędzie do zarządzania migracjami bazy danych,
  - Keycloak do zarządzania użytkownikami oraz ich uprawnieniami oraz obsługą logowania (początkowa wersja aplikacji przechowywała informacje o użytkownikach w bazie danych),
  - Bibliotekę Lombok do zwiększenia czytelności kodu i zmniejszenia tzw. "boilerplate code",
  - Bibliotekę jUnit oraz AssertJ do napisania testów,
  - Thymeleaf do stworzenia strony internetowej z wykorzystaniem szablonów.
  
Aplikacja ta miała na celu zapoznanie się z możliwościami frameworka Spring, z tego względu spróbowano użyć w niej zróżnicowanych adnotacji i mechanizmów Springa, w tym różnego rodzaju repozytoriów, kontrolerów, aspektów, konfiguracji, ExceptionHandler'ów, RestControllerAdvice'ów, filtrów, interceptorów, konfiguracji, serwisów itd.

## REST API Spring app for managing "Todo" tasks

Following technologies were used to create application:
  - Spring framework,
  - H2 Database to store information about tasks, task groups and projects,
  - Flyway as a database migration tool,
  - Keycloak as tool for managing users and their privilages, as well as handling signing operation (early app versions used database for storing information about users),
  - Lombok library to make code more readable and to reduce the amount of "boilerplate" code,
  - jUnit and AssertJ library for tests,
  - Thymeleaf to create HTML site using templates.
  
The goal of this application was to familiarise with the capabilities of Spring framework, because of that the author tried to use variety of Spring adnotations and classes, including variety of repositories, controllers, aspects, configurations, ExceptionHandlers, RestControllerAdvices, filters, interceptors, configurations, services etc.
