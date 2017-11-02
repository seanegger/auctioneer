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

import java.util.ArrayList;

public class Auctioneer {



	private Bidder highestBidder;
	private ArrayList<Bidder> bidders;
	private ItemForBid item;
	private float highestBid;
	private boolean auctionGoing;
	int numOfBids = 0;
	
	public Auctioneer() {
		bidders = new ArrayList<Bidder>();
	}

	public int getNumOfBids()
	{
		return this.numOfBids;
	}
	public Bidder getHighestBidder() {
		return highestBidder;
	}

	public void setHighestBidder(Bidder highestBidder) {
		this.highestBidder = highestBidder;
	}

	public ArrayList<Bidder> getBidders() {
		return bidders;
	}

	public void setBidders(ArrayList<Bidder> bidders) {
		this.bidders = bidders;
	}

	public ItemForBid getItem() {
		return item;
	}

	public void setItem(ItemForBid item) {
		this.item = item;
	}

	public float getHighestBid() {
		return highestBid;
	}

	public void setHighestBid(float highestBid) {
		this.highestBid = highestBid;
	}

	public void setAuctionRunning(boolean isRunning)
	{
		auctionGoing = isRunning;
		if (isRunning)
		{
			highestBid = item.getInitialPrice();
		}
	}
	
	public void addBidder(Bidder bidder)
	{
		bidders.add(bidder);
		bidder.setAuctioneer(this);
	}

	public void updateAuctionRunning(boolean isRunning)
	{
		auctionGoing = isRunning;
	}

	private void notifyBidders()
	{
		for (Bidder bidder : bidders) {
			bidder.updateHighestBidder(highestBid);
		}
	}

	public void takeBid(float amount, Bidder bidder)
	{
		if (amount > highestBid)
		{
			highestBid = amount;
			highestBidder = bidder;
			this.numOfBids++;
		}
	}

	public void display()
	{
		System.out.println("----------------------------");
		System.out.println("Current Highest Bid: "+ highestBid);
	}
}
