@tag
Feature: Faire le plein de carburant
En tant que propriétaire 
Je veux pouvoir faire le plein à ma voiture, en obtenant la quantité de carburant ajoutée.
Afin de pouvoir payer le pompiste selon la quantité de carburant ajoutée. 


  @tag1
  Scenario Outline: Calcul quantite fuel a mettre dans la voiture
    Given <quantiteInitiale> de carburant
    When le conducteur fait le plein
    Then la <quantiteAjoutee> de carburant est automatique calcule
    
   Examples: 
      | voiture  | quantiteInitiale | quantiteAjoutee |
      | voiture1 |     60            | 40 							|
      | voiture2 |     50 					 | 50               |

  @tag2
  Scenario Outline:  Calcul quantite fuel a mettre dans la voiture lorsque quantite initiale invalide
    Given <quantiteInitiale> de carburant
    When le conducteur fait le plein
    Then la <quantiteAjoutee> de carburant est automatique calcule avec quantite initiale est egale a zero

     Examples: 
      | voiture  | quantiteInitiale | quantiteAjoutee |
      | voiture1 |     -2            | 100							|
      | voiture2 |     200					 | 100              |
