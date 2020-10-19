Feature: Multiplicacion

  Scenario: Multiplicar cero por un numero da cero
    Given Tengo una calculadora
    When Multiplico 0 por 5
    Then Obtengo 0
    
  Scenario: Multiplicar un por un numero da ese numero
    Given Tengo una calculadora
    When Multiplico 1 por 5
    Then Obtengo 5
    
  Scenario: Multiplicar cinco por cuatro da veinte
    Given Tengo una calculadora
    When Multiplico 5 por 4
    Then Obtengo 20