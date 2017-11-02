package auctioneer;

public interface Strategy{

	void notifyAuctioneerOfBid(Auctioneer auctioneer, float highestBid, Bidder bidder);
}