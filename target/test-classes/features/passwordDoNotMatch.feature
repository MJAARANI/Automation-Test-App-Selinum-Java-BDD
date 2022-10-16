@REQ_POEI22GR3-5
Feature: Affichage  des informations de mon compte
  @TEST_POEI22GR3-144 @Automation_Testing_GR3
  Scenario Outline: Test Changement MDP avec des nouveau MDP non conforme
    Given l'utilisateur est dans la Home Page
    When click My Account button
    And saisir votre '<email>' de connexion
    And saisir votre '<mdp>'
    And cliquer sur login
    And cliquer sur Account Details
    And saisir valid mot de passe actuel "Selinum@1234"
    And saisir faut nouveau mot de passe "Selinum@12345"
    And confirmer avec un autre faut nouveau  mot de passe "Selinum@123456"
    And cliquer sur save changes
    Then verifier New passwords do not much
    Examples:
      |email                       |      mdp   |
      |montassar.jaarani@esprit.tn | Selinum@1234|

