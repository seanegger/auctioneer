package auctioneer;
public abstract class Bid10OverUnder100 implements Strategy{
	@Override
	public void notifyAuctioneerOfBid(Auctioneer auctioneer, float highestBid,Bidder bidder)
	{
		if(highestBid <100)
			auctioneer.takeBid(highestBid+10, bidder );
	}
}
