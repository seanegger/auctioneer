package auctioneer;


public class Bid10OverAfter10Offers implements Strategy{
	@Override
	public void notifyAuctioneerOfBid(Auctioneer auctioneer, float highestBid,Bidder bidder)
	{
		if(auctioneer.getNumOfBids() >=10)
			auctioneer.takeBid(highestBid+10, bidder );
	}


}
		