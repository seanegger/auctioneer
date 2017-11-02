package auctioneer;


public abstract class Bid10Over implements Strategy {
	@Override
	public void notifyAuctioneerOfBid(Auctioneer auctioneer, float highestBid,Bidder bidder)
	{
		auctioneer.takeBid(highestBid+10, bidder );
	}

}
