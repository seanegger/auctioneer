public interface Strategy{
	void notifyAuctioneerOfBid(Auctioneer auctioneer, double highestBid,Bidder bidder);
}