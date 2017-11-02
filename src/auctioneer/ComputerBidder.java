package auctioneer;

public class ComputerBidder implements Bidder{
    private string name;
    float currentHighestBidder;
    Auctioneer auctioneer;
    Strategy strategy;

    void updateHighestBidder(float newHighestBidder)
    {
        currentHighestBidder = newHighestBidder;
    }

    void bid()
    {
        strategy.bid(auctioneer, this);
    }
}
