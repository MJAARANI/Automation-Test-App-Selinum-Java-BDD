@REQ_POEI22GR3-6
Feature: Déconnexion
	@TEST_POEI22GR3-114 @Automation_Testing_GR3
	Scenario Outline: Test Déconnexion
		Given l'utilisateur est dans la Home Page
		When click My Account button
		And saisir votre '<email>' de connexion
		And saisir votre '<mdp>'
		And cliquer sur login
		And cliquer sur Logout
		Then verifier pavé Login
		Then verifier pavé Register
		Examples:
		|email                       |      mdp   |
		|montassar.jaarani@esprit.tn | Selinum@1234|
