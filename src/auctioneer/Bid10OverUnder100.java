
public abstract class Bid10OverUnder100 implements Strategy{
	@Override
	public void notifyAuctioneerOfBid(Auctioneer auctioneer, double highestBid,Bidder bidder)
	{
		if(highestBid <100.0)
			auctioneer.takeBid(highestBid+10.0, bidder );
	}
}
