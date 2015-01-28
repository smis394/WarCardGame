public class War {
  
  public static void main(String[] args) {
    // create deck, hands and stacks
    CardDeck deck=new CardDeck();
    CardList handA=new CardList();
    CardList handB=new CardList();
    CardList stackA=new CardList();
    CardList stackB=new CardList();
    int round=1;
    deck.shuffle();
    // deal the cards
    while(deck.size()>1)
    {
      handA.addCardToTop(deck.takeCardFromTop());
      handB.addCardToTop(deck.takeCardFromTop());
    }
    // play
    System.out.println("A------PLAYER------B");
    while(handA.size()!=0&&handB.size()!=0)
    {
      System.out.println(handA.size()+"-----ROUND "+round+"-----"+handB.size());
      Card cardA=handA.takeCardFromTop();
      Card cardB=handB.takeCardFromTop();
      System.out.println("      "+cardA.toString()+":"+cardB.toString());
      stackA.addCardToTop(cardA);
      stackB.addCardToTop(cardB);
      if(cardA.compareTo(cardB)==0)
      {
        System.out.println(handA.size()+"-------WAR-------"+handB.size());
        if(handA.size()>=2&&handB.size()>=2)
        {
          stackA.addCardToTop(handA.takeCardFromTop());
          Card cardA2=handA.takeCardFromTop(); 
          stackA.addCardToTop(cardA2);
          
          stackB.addCardToTop(handB.takeCardFromTop());
          Card cardB2=handB.takeCardFromTop();
          stackB.addCardToTop(cardB2);
          
          System.out.println("      "+cardA2.toString()+":"+cardB2.toString());
          if(cardA2.compareTo(cardB2)>0)
          {
            
            for(int i=0;i<stackB.size();i++)
            {
              handA.addCardToBottom(stackB.takeCardFromTop());
            }
            for(int i=0;i<stackA.size();i++)
            {
              handA.addCardToBottom(stackA.takeCardFromTop());
            }
          }
          else
          {
            for(int i=0;i<stackA.size();i++)
            {
              handB.addCardToBottom(stackA.takeCardFromTop());
            }
            for(int i=0;i<stackB.size();i++)
            {
              handB.addCardToBottom(stackB.takeCardFromTop());
            }
          }
        }
        else
        {
          if(handA.size()==1)
          {
            stackA.addCardToTop(handA.takeCardFromTop());
          }
          if(handB.size()==1)
          {
            stackB.addCardToTop(handB.takeCardFromTop());
          }
        }
      }
      else
      {
        if(cardA.compareTo(cardB)>0)
        {
          while(stackA.size()!=0)
          {
            handA.addCardToBottom(stackA.takeCardFromTop());
          }
          while(stackB.size()!=0)
          {
            handA.addCardToBottom(stackB.takeCardFromTop());
          }
        }
        else
        {
          while(stackA.size()!=0)
          {
            handB.addCardToBottom(stackA.takeCardFromTop());
          }
          while(stackB.size()!=0)
          {
            handB.addCardToBottom(stackB.takeCardFromTop());
          }
        }
      }
      round++;
    }
    if(handA.size()==0)
    {
      System.out.println("playerB won");
    }
    else
    {
      System.out.println("playerA won");
    }
  }
}

