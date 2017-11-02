package auctioneer;

public interface Bidder {

	void update(float newHighestBid);
	void updateHighestBidder(float newHighestBidder);
}
