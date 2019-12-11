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
Feature: Notifier Guerison
En tant que medecin
Je veux etre notifie du fait qu'une personne necessitant des soins est reellement guerie
Afin de pouvoir l'enlever de la liste des patients a traiter

  @tag1
  Scenario Outline: Guerison personne et notification medecin
    Given l <age> de la personne
    When elle tombe malade avec des <points_maladie> a enlever
    And  je la gueris
    Then je suis notifie de sa guerison et elle ne se trouve plus dans ma liste de patient
    
    
    Examples: 
      | age|  points_maladie       |       |
      | 50 |        20    				 | false |
      | 20 |        30             | false |

