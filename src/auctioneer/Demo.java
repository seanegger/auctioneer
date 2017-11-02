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

public class Demo {

	public static void main(String[] args) {
		//make bidders
		ComputerBidder compB = new ComputerBidder();
		HumanBidder humanB = new HumanBidder();
		ComputerBidder newBidder = null;
		//create auctioneer
		Auctioneer auctioneer = new Auctioneer();
		//create strategies
		Strategy bid10Over = new Bid10Over();
		Strategy bidNOver = new BidNOver();
		Strategy bid10OverAfter10Offers = new Bid10OverAfter10Offers();
		Strategy bid10OverUnder100 = new Bid10OverUnder100();
		//set strategies
		compB.setStrategy(bid10Over);
		humanB.setStrategy(bid10OverUnder100);
		//add bidders to auctioneer
		auctioneer.addBidder(humanB);
		auctioneer.addBidder(compB);
		//create item
		ItemForBid itemforbid = new ItemForBid(70);
		auctioneer.setItem(itemforbid);
		boolean newBidderExists = false;
		//set auction to running
		auctioneer.setAuctionRunning(true);
		for ( int i = 0; i < 10; i++)
		{
			humanB.bid();
			compB.bid();
			if (newBidderExists)
				newBidder.bid();
			if(auctioneer.getHighestBid() >= 100 && auctioneer.getHighestBid() < 120)
			{
				humanB.bidCustom(200);
				newBidder = new ComputerBidder();
				newBidder.setStrategy(bidNOver);
				auctioneer.addBidder(newBidder);
				humanB.setStrategy(bid10OverAfter10Offers);
				newBidderExists = true;
			}
			auctioneer.display();
		}
		
		
	}
}
