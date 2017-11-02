/*Author:    Alec Rulev & Sean Egger [Worked on whole lab together]
 * Class: CSI-340-01
 * Assignment: Lab 3
 * Date Assigned:9/21/2017
 * Due Date: 10/5/2017
 * Description: Implement an auctioning system using the observer design pattern
 * Certification of Authenticity:I  certify  that  this  is  entirely 
 *  my  own  work,  except  where  I  have  given fully-documented  references
 *  to  the  work  of  others.  I  understand  the definition and consequences of
 *  plagiarism and acknowledge that the assessor of this assignment may, for the
 *  purpose of assessing this assignment:-Reproduce  this  assignment  and  provide
 *  a  copy  to  another  member  of academic staff; and/or-Communicate  a  copy 
 *  of  this  assignment  to  a  plagiarism  checking service  (which  may  then 
 *  retain  a  copy  of  this  assignment  on  its database for the purpose of 
 *  future plagiarism checking)
*/
package auctioneer;

public class ComputerBidder implements Bidder{
    private String name;
    float currentHighestBidder;
    Auctioneer auctioneer;
    Strategy strategy;

    public void setStrategy(Strategy newStrategy)
    {
    	strategy = newStrategy;
    }
    
    public void updateHighestBidder(float newHighestBidder)
    {
        currentHighestBidder = newHighestBidder;
    }

    public void bid()
    {
        strategy.notifyAuctioneerOfBid(auctioneer,auctioneer.getHighestBid(), this);
    }

	@Override
	public void update(float newHighestBid) {
		// TODO Auto-generated method stub
		
	}
	
	public void setAuctioneer(Auctioneer auctioneer)
	{
		this.auctioneer = auctioneer;
	}
}
