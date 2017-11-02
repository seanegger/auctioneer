package auctioneer;

import java.util.Scanner;

import auctioneer.Auctioneer;
import auctioneer.Bidder;

public class BidNOver implements Strategy {
	@Override
	public void notifyAuctioneerOfBid(Auctioneer auctioneer, float highestBid,Bidder bidder)
	{
		System.out.println("How much would you like to bid?(Input a number)");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		auctioneer.takeBid(highestBid+Float.parseFloat(input), bidder );
	}

	
}
