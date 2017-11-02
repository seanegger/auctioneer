package auctioneer;

public class HumanBidder implements Bidder{

    private String name;
    float currentHighestBidder;
    Auctioneer auctioneer;
    Strategy strategy;

    public void updateHighestBidder(float newHighestBidder)
    {
        currentHighestBidder = newHighestBidder;
    }

    public void bid()
    {
        strategy.notifyAuctioneerOfBid(auctioneer,auctioneer.getHighestBid(), this);
    }

    void bidCustom(float amount)
    {
        auctioneer.takeBid(amount, this);
    }

	@Override
	public void update(float newHighestBid) {
		// TODO Auto-generated method stub
		
	}

}
