class Main {
  public static void main(String[] args) {
    System.out.println("\nA Deck of 81 Set Cards was made and shuffled. 12 top cards were picked and checked for sets 10,000 times. \nOf those 10,000 times, this is the data collected. \n");
    Deck setdeck = new Deck();

		int [] stats = new int[]{0, 0, 0, 0, 0, 0};

    for (int x = 0; x<10000; x++){
      setdeck.shuffleDeck();
      int a = setdeck.findSet();
			if(a >= 5){
				stats[5] += 1;
			}
			else{
				stats[a] += 1;
			}
    }
		float finalStats[] = new float[6];
		for(int i = 0; i < 6; i++){
			finalStats[i] = ((float)(stats[i]) / 10000)*100;
		}
    

    System.out.println("There were " + stats[0] + " times with zero sets, making up " + finalStats[0] + " % of the decks\n"   );
    System.out.println("There were " + stats[1] + " times with one set, making up " + finalStats[1]+ " % of the decks\n"   );
    System.out.println("There were " + stats[2] + " times with two sets, making up " + finalStats[2] + " % of the decks\n"   );
    System.out.println("There were " + stats[3] + " times with three sets, making up " + finalStats[3] + " % of the decks\n"   );
    System.out.println("There were " + stats[4] + " times with four sets, making up " + finalStats[4] + " % of the decks\n"   );
    System.out.println("There were " + stats[5] + " times with five or more sets, making up " + finalStats[5] + " % of the decks\n"   );
  }
}
