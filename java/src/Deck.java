class Deck{
  SetCard [] setcards = new SetCard[81];

   public Deck(){
    int a =0;
     for (int sh = 0; sh<3; sh++){
       for(int n = 0; n<3; n++){
         for (int c = 0; c<3; c++){
           for (int s = 0; s <3; s++){
             setcards[a] = new SetCard(s, sh, n, c);
             a++;
           }
           
         }
       }
     }
  }

  void printDeck(){
    for (int x = 0; x<81; x++){
      setcards[x].printCard();
      
    }
  }
  void display12(){
    for (int x = 0; x<12; x++){
      setcards[x].printCard();
      
    }
  }

  void shuffleDeck(){
    Random rand1 = new Random(); 
    int rando = 0;
    SetCard temp = new SetCard(8,8,8,8);
    for (int y = 0; y<100; y++){
      for (int x = 0; x<81; x++){
        rando =  rand1.nextInt(81);
        temp = setcards[rando];
        setcards[rando] = setcards[x];
        setcards[x] = temp;
      }
    }
  }

  int findSet(){
    int counter = 0;
    for (int x = 0; x<10; x++){
      for (int y = x+1; y<11; y++){
        for (int z = y+1; z<12;z++){
          if((setcards[x].getNumber() + setcards[y].getNumber() + setcards[z].getNumber()) % 3 ==0){
            if ((setcards[x].getShading() + setcards[y].getShading() + setcards[z].getShading()) % 3 == 0){
              if ((setcards[x].getColor() + setcards[y].getColor() + setcards[z].getColor()) % 3 == 0){
                if ((setcards[x].getShape() + setcards[y].getShape() + setcards[z].getShape()) % 3 == 0){
                  counter++;
                  
                  
                }
              }
            }
          }
        }
      }
    }
    
    
    return counter;
  }

}
