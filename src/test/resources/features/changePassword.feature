@REQ_POEI22GR3-5
Feature: Affichage  des informations de mon compte
	@TEST_POEI22GR3-127 @Automation_Testing_GR3
	Scenario Outline: Test RG2:changement mot de passe
		Given l'utilisateur est dans la Home Page
		When click My Account button
		And saisir votre '<email>' de connexion
		And saisir votre '<mdp>'
		And cliquer sur login
		And cliquer sur Account Details
		And saisir faut mot de passe actuel "Selinum@12345"
		And saisir nouveau mot de passe "Selinum@1234"
		And confirmer nouveau mot de passe "Selinum@1234"
		And cliquer sur save changes
		Then verifier your current password is incorrect
		Examples:
				|email                       |      mdp   |
				|montassar.jaarani@esprit.tn | Selinum@1234|
