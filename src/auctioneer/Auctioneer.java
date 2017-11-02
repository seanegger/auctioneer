package auctioneer;

import java.util.ArrayList;

public class Auctioneer {



	private Bidder highestBidder;
	private ArrayList<Bidder> bidders;
	private ItemForBid item;
	private float highestBid;
	private boolean auctionGoing;
	int numOfBids = 0;

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

	public void addBidder(Bidder bidder)
	{
		bidders.add(bidder);
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

	}
}
