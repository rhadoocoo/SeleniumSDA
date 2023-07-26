Feature: FileUpload
  Scenario: Ca utilizator vreau sa fac upload unui fisier
    Given Deschid browserul
    When Accesez pagina "https://qa-practice.netlify.app/"
    And Apas butonul "QAPractice-Button-File Upload"
    And Astept 3 secunde
    And Selectez fisierul pe care vreau sa il uploadez
    And Astept 3 secunde
    And Trimit apasand pe butonul "QAPractice-Button-Submit"
    And Astept 3 secunde
    And Primesc confirmare ca fisierul s-a uploadat cu succes
    And Inchid browserul