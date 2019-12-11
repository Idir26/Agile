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
Feature: Strategie guerison
En tant que medecin
Je veux etre capable de guerir mes patients selon leur categorie d'age
Afin de pouvoir leur promulguer les soins adequats
  @tag1
  Scenario Outline: Guerir patient
    Given l <age1> de la personne inferieur a cinquante ans
    And   l <age2> de la personne superieur ou egal a cinquante ans 
    When elles tombent malade avec des <points_maladie> a enlever
    Then je les gueris en ajoutant quarante aux <points_vies1> de la personne jeune et vingt aux <points_vies2> de la personne vieille 
    
    Examples: 
      | age1 | age2 | points_maladie  | points_vies1 | points_vies2 |
      | 30   |  70  | 70              |    70        | 50           |
      | 15   |  50  | 40              |    100       | 80           |
      | 25   |  60  | 20              |    100       | 100          |
    
     
     
    

  
