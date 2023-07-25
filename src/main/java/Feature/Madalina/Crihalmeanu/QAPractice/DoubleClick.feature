Feature: Double click
  Scenario: Ca utilizator vreau sa dau dubluclick
    Given Deschid browserul
    When Accesez pagina "https://qa-practice.netlify.app/"
    And Apas butonul "QAPractice-Button-Actions"
    And Astept 2 secunde
    And Apas butonul "QAPractice-Button-DoubleClick"
    And Astept 5 secunde
    And Dau dubluclick pe butonul "QAPractice-Button-Doubleclick-action"
    And Astept 5 secunde
    And Confirm ca am dat dubluclick
    And Inchid browserul