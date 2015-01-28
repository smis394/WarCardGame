// Complete Class card by extending abstract Class PlayingCard and implementing the Comparable interface
public class Card extends PlayingCard implements Comparable<Card>
{
  public Card(int suit,int rank)
  {
    super(suit,rank);
  }
  public int compareTo(Card other)
  {
    if(this.getRank()>other.getRank())
    {
      return 1;
    }
    if(this.getRank()<other.getRank())
    {
      return -1;
    }
    else
    {
      return 0;
    }
  }
  public String toString()
  {
    String rank="";
    String suit="";
    if(getRank()==11)
    {
      rank="J";
    }
    if(getRank()==12)
    {
      rank="Q";
    }
    if(getRank()==13)
    {
      rank="K";
    }
    if(getRank()==1)
    {
      rank="A";
    }
    if(getSuit()==1)
    {
      suit="H";
    }
    if(getSuit()==2)
    {
      suit="C";
    }
    if(getSuit()==3)
    {
      suit="D";
    }
    if(getSuit()==4)
    {
      suit="S";
    }
    if(getRank()<=10&&getRank()!=1)
    {
      return getRank()+"-"+suit;
    }
    else
    {
      return rank+"-"+suit;
    }
  }
}

  

