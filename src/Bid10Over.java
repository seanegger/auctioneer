
public abstract class Bid10Over implements Strategy {
	@Override
	public void notifyAuctioneerOfBid(Auctioneer auctioneer, double highestBid)
	{
		auctioneer.takeBid(highestBid+10.0, )
	}

}
