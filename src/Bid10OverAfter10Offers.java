import auctioneer.Auctioneer;
import auctioneer.Bidder;

public class Bid10OverAfter10Offers implements Strategy{
	@Override
	public void notifyAuctioneerOfBid(Auctioneer auctioneer, double highestBid,Bidder bidder)
	{
		if(auctioneer.getNumBid() >=10)
			auctioneer.takeBid(highestBid+10.0, bidder );
	}
}
		