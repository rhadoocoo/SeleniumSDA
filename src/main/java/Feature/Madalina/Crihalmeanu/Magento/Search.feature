Feature: Search bar
  Scenario Outline: Ca utilizator vreau sa pot cauta diverse produse pe site
    Given Deschid browserul
    When Accesez pagina "https://magento.softwaretestingboard.com/"
    And Introduc termenul "<produs_cautat>" in campul "Magento-Search"
    And Astept 2 secunde
    And Apas butonul "Magento-Search-button"
    And Astept 2 secunde
    And Pagina "https://magento.softwaretestingboard.com/catalogsearch/result/?q=<produs_cautat>" este afisata corect
    And Site-ul imi afiseaza rezultatele pentru "<produs_cautat>"
    And Produsele sunt de tipul "<produs_cautat>"
    And Astept 3 secunde
    And Inchid browserul



    Examples:
    |produs_cautat  |
    |Hoodie         |
    |Jacket         |
    |Pant           |
    |Short          |
