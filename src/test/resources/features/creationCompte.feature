@REQ_POEI22GR3-1
Feature: Création d'un compte client
	@TEST_POEI22GR3-20 @Automation_Testing_GR3
	Scenario Outline: Creation de compte avec un mots de passe non rebuste
		Given l'utilisateur est dans la Home Page
		When click My Account button
		And saisir un '<email>'
		And saisir le '<mdp>'
		And cliquer sur Register
		And cliquer sur Dashboard
		Then verifier la création d'un compte
		Examples:
			|email       |      mdp      |
			|m.j         | Seli2578Pg12446! |
