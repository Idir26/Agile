#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Possibilite d'ajouter du carburant 
En tant que propriétaire 
Je veux savoir si je peux rajouter une certaine quantité de carburant à mon réservoir.
Afin de prévoir la quantité à ajouter pour faire le plein. 

  @tag1
  Scenario Outline: Ajout carburant avec quantite valide
    Given reservoir de <quantiteInitiale> de carburant
    When  une certaine <quantite> de carburant est ajoutee a la voiture
    Then on verifie que l on peut ajouter cette quantite
    
     Examples: 
      | quantiteInitiale  | quantite        | 
      |     60            | 40 							| 
      |     50 					  | 1               | 

  @tag2
  Scenario Outline: Ajout carburant avec quantite invalide
    Given reservoir de <quantiteInitiale> de carburant
    When une certaine <quantite> de carburant est ajoutee a la voiture
    Then on verifie que l on ne peut pas ajouter cette quantite

    Examples: 
      | quantiteInitiale  | quantite| 
      |     60            |   -6    | 
      |     50					   |    55   | 
