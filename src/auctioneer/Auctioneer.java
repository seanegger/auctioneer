package auctioneer;

public class Auctioneer {



	private Bidder highestBidder;
	private ArrayList<Bidder> bidders;
	private IemForBid item;
	private float highestBid;
	private boolean auctionGoing;

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

	public IemForBid getItem() {
		return item;
	}

	public void setItem(IemForBid item) {
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
		bidder.add(bidder);
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
		}
	}

	public void display()
	{

	}
}
