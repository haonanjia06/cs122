package pro.chap123;

import java.util.List;



public class Queues {
	private class Node{
		public String data;
		public Node link;
	}
	
	
	public int binarySearch(List<Card> cards, Card key)
	{
	    int mid = (cards.size()) / 2;
	    if(cards.size() == 1) {
	        if(key.equals(cards.get(0))) {
	            return 0;
	        }
	    }
	    else {
	        if(key.equals(cards.get(mid))) {
	            return mid;
	        }
	        else if(key.compareTo(cards.get(mid)) == - 1) {
	            return binarySearch(cards.subList(0, mid), key);
	        }
	        else if(key.compareTo(cards.get(mid)) ==  1) {
	            return mid + 1 + binarySearch(cards.subList(mid + 1, cards.size()), key);
	        }
	    }
	    return -1;
	}
}
