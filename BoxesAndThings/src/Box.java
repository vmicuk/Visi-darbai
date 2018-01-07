import java.util.ArrayList;

public class Box implements ToBeStored {
	private ArrayList<ToBeStored> boxItems;
	private double maxWeight;
//	private double totalMaxWeight;
	
	public Box(double weight) {
		this.maxWeight = weight;
		this.boxItems = new ArrayList<ToBeStored>();
	}
//	//tusciam box
//	public void add(ToBeStored stored) {
//		if (stored.weight() < maxWeight) this.boxItems.add(stored);
//	}
	public void add(ToBeStored stored) {
		
		if (stored.weight() < maxWeight) this.boxItems.add(stored);
	}


	public int howManyItems () {
		return this.boxItems.size();
	}
	
//	@Override
//	public double weight() {
//		double allWeight = 0, weight = 0;
//		allWeight += weight;
//		for (ToBeStored stored : this.boxItems) {
//			allWeight += stored.weight();
//		}
//		return allWeight;
//	}
//	@Override
//	public double weight() {
//		double weight = 0;
//		for (ToBeStored stored : this.boxItems) {
//			weight += stored.weight();
//		}
//		return weight;
//	}
	@Override
	public double weight() {
		double weight = 0;
		for (ToBeStored stored : this.boxItems) {
			weight += stored.weight();
		}
		return weight;
	}
	public double likutisBox() {
		double weight = 0;
		for (ToBeStored stored : this.boxItems) {
			maxWeight -= stored.weight();
		}
		return maxWeight;
	}
	
	@Override
	public String toString() {
		return "Box: " + howManyItems() + " things, total weight " + 
				String.format("%.1f", weight()) + " kg";
	}
}
