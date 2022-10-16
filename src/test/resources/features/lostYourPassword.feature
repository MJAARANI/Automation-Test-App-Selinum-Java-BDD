@REQ_POEI22GR3-4
Feature: Réinitialisation mot de passe oublié
	@TEST_POEI22GR3-73 @Automation_Testing_GR3
	Scenario Outline: Un lien "Lost your password?" doit rediriger vers une page permettant de saisir son login et de  valider la demande de réinitialisation 
		Given l'utilisateur est dans la Home Page
		When click My Account button
		And click sur Lost Your Password button
		And saisir mail '<email>' du compte a reinitialiser son mot de passe 
		And click sur Reset Password button
		Then je verifie que le mail de reinitialisation est bien envoyé
		
		Examples:
		|email|
		|montassar.jaarani@gmail.com|
