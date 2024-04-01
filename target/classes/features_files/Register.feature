Feature: Je verifie la creation de compte
En tant qu utilisateur je souhaite me créer un compte au site Mercury
  @register
  Scenario: Je verifie la creation de compte 
   Given Je me connecte sur l application Mercuryy
   When Je clique sur le bouton register
   And Je saisie First Name "Ahmed" 
   And Je saisie Last Name "Hadrich"
   And Je saisie Phone "93025764"
   And Je saisie Email "hedrich.ahmed@gmail.com"
   And Je saisie Adresse "Rue 500"
   And Je saisie City "Sousse"
   And Je saisie State "Sousse"
   And Je saisie Postal Code "4054"
   And Je selectionne Country "TUNISIA"
   And Je saisie User Name "Ahmed"
   And Je saisie Password "1234"
   And Je saisie Confirm Password "1234"
   And Je clique sur le bouton Envoyer	
   Then Je me redirige vers la page  "Note: Your user name is Ahmed."
