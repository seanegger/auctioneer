package auctioneer;

public interface Bidder {

	void update(float newHighestBid);
	void bid()
}
