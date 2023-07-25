Feature: Deschiderea unei pagini web
 Ca utilizator, vreau sa pot deschide orice pagina web
  Scenario: Accesează pagina dorita de utilizator
    Given Deschid browserul
    When Accesez pagina "https://www.google.com"
    Then Pagina "google.com" este afisata corect
    And Inchid browserul
