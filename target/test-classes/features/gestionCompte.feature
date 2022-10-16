@REQ_POEI22GR3-5
Feature: Affichage  des informations de mon compte
	@TEST_POEI22GR3-126 @Automation_Testing_GR3
	Scenario Outline: Test Affichage  des informations de mon compte(nom, prénom, email)
		Given l'utilisateur est dans la Home Page
		When click My Account button
		And saisir votre '<email>' de connexion
		And saisir votre '<mdp>'
		And cliquer sur login
		And cliquer sur Account Details
		And saisir first name utilisateur "Montassar"
		And saisir last name utilisateur "Jaarani"
		Then verifier email utilisateur
		Then cliquer sur save changes
		#Then verifier que les changements sont prises en compte
		Examples:
				|email                       |      mdp     |
				#|montassar.jaarani@esprit.tn | Selinum@1234 |
				|             1239@gmail.com  |  Selinum@1234            |

