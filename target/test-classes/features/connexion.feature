@REQ_POEI22GR3-2
Feature: Authentification
	@TEST_POEI22GR3-23 @Automation_Testing_GR3
	Scenario Outline: Lors de la connexion à son compte, l'écran 'Dashboard" doit s'afficher
		Given l'utilisateur est dans la Home Page
		When click My Account button
		And saisir votre '<email>' de connexion
		And saisir votre '<mdp>'
		And cliquer sur login
		And cliquer sur Dashboard 
		And cliquer sur Orders
		And cliquer sur Dashboard 
		And cliquer sur Downloads
		And cliquer sur Dashboard 
		And cliquer sur Adresses
		And cliquer sur Dashboard 
		And cliquer sur Account Details
		And cliquer sur Dashboard
		Then cliquer sur Logout
		Examples:
		|email                       |      mdp   |
		|montassar.jaarani@esprit.tn | Selinum@1234 |
