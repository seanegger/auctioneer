import auctioneer.Auctioneer;
import auctioneer.Bidder;

public interface Strategy{

	void notifyAuctioneerOfBid(Auctioneer auctioneer, double highestBid, Bidder bidder);
}