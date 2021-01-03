// Fig. 7.9: Card.java
// Card class represents a playing card.

public class Card {
   private final String face; // face of card ("Ace", "Deuce", ...)
   private final String suit; // suit of card ("Hearts", "Diamonds", ...)
   
   //private Rule.efaces eface; // face of card ("Ace", "Deuce", ...)
   //private Rule.esuits esuit; // face of card ("Ace", "Deuce", ...)
   
   // two-argument constructor initializes card's face and suit
   public Card(String cardFace, String cardSuit) {
      this.face = cardFace; // initialize face of card
      this.suit = cardSuit; // initialize suit of card
   }
   
   // return String representation of Card
   public String toString() {             
      return face + " of " + suit;        
   }
   
   public String getFace() {
	   return face;
   }
   
   /*public Card(Rule.efaces eface, Rule.esuits esuit) {
	  this.eface = eface; // initialize face of card
	  this.esuit = esuit; // initialize suit of card
   }
   
   public String toString() {             
      return eface.toString() + " of " + esuit.toString();        
   }
   
   public Rule.efaces geteFace() {
	   return eface;
   }*/
} 



/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
