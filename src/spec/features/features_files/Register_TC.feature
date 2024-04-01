Feature: Verifier le module register
  En tant qu utilisateur  je souhaite remplir le formulaire afin de m enregistrer

  @moduleRegister
  Scenario Outline: Verifier le module register
    Given Je me connecte sur l application Mercury
    When Je saisie le firstname "<username>"    
    When Je saisie le lastname "<lastname>"

    Examples: 
      | username  | lastname | 
      | omar |     5 |
      | ahmed |     7 |
