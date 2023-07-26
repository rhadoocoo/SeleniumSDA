Feature: Alerte
  Scenario: Ca utilizator vreau sa opresc alertele primite in browser
    Given Deschid browserul
    When Accesez pagina "https://qa-practice.netlify.app/"
    And Apas butonul "QAPractice-Alerts"
    And Astept 2 secunde
    And Apas butonul "QAPractice-Alert"
    And Astept 3 secunde
    And Opresc alerta
    And Astept 3 secunde
    And Inchid browserul

  Scenario: Ca utilizator vreau sa opresc alertele primite in browser
    Given Deschid browserul
    When Accesez pagina "https://qa-practice.netlify.app/"
    And Apas butonul "QAPractice-Alerts"
    And Astept 2 secunde
    And Apas butonul "QAPractice-Confirm"
    And Astept 3 secunde
    And Dau click pe Ok in alerta aparuta
    And Astept 3 secunde
    And Inchid browserul

  Scenario: Ca utilizator vreau sa opresc alertele primite in browser
    Given Deschid browserul
    When Accesez pagina "https://qa-practice.netlify.app/"
    And Apas butonul "QAPractice-Alerts"
    And Astept 2 secunde
    And Apas butonul "QAPractice-Confirm"
    And Astept 3 secunde
    And Dau click pe Cancel in alerta aparuta
    And Astept 3 secunde
    And Inchid browserul