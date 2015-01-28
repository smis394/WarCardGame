// create class CardDeck that extends CardList
public class CardDeck extends CardList
{
  private int suits=4;
  private int ranks=13;
  private int swaps=10000;
  public CardDeck()
  {
    super();
    for(int rank=1;rank<=ranks;rank++)
    {
      for(int suit=1;suit<=suits;suit++)
      {
        addCardToBottom(new Card(suit,rank));
      }
    }
  }
  public void shuffle()
  {
    for(int i=0;i<swaps;i++)
    {
      addCardToBottom(removeRandomCard());
    }
  }
}
