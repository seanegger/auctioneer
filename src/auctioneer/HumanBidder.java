package auctioneer;

public class HumanBidder implements Bidder{

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

    void bidCustom(float amount)
    {
        auctioneer.takeBid(amount, this)
    }

}
