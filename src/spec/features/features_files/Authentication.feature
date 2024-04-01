Feature: Je verifie la page d authentification 
En tant qu utilisateur je souhaite me connecter au site Mercury
  @connexion
  Scenario: Je verifie la page d authentification 
   Given Je me connecte sur l application Mercury
   When Je saisie le User Name "Test"
   And Je saisie le password  "Test"
   And Je clique sur le bouton submit
   Then Je me redirige vers la page home "Login Successfully"
