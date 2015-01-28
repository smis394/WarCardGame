import java.util.ArrayList;
import java.util.Random;
public class CardList
{
  private ArrayList<Card>cards;
  private Random random;
  public CardList()
  {
    cards=new ArrayList<Card>();
    random=new Random();
  }
  public int size()
  {
    return cards.size();
  }   
  public void addCardToBottom(Card card)
  {
    cards.add(card);
  }
  public void addCardToTop(Card card)
  {
    cards.add(0,card);
  }
  public Card takeCardFromTop()
  {
    Card card=cards.get(0);
    cards.remove(0);
    return card;
  }
  public Card removeRandomCard()
  {
    int rand=random.nextInt(cards.size());
    Card card=cards.get(rand);
    cards.remove(rand);
    return card;
  }
}
