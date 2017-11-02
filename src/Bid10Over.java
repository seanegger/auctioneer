
public abstract class Bid10Over implements Strategy {
	@Override
	public void notifyAuctioneerOfBid(Auctioneer auctioneer, double highestBid,Bidder bidder)
	{
		auctioneer.takeBid(highestBid+10.0, bidder );
	}

}
