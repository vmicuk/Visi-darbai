/** Visa programa daro marke paskaiciavimus vidutini, kiek isviso yra ir t.t.
 * 
 * 
 * @author Vitalij Micuk JP16 3
 * @param arg0 
 * @return return average price of post stamps price
 * @see  somthing )))
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import philatelist.Philatelist;
import philatelist.PostStamp;

public class Markes implements Philatelist {
	Collection<PostStamp> post = new HashSet<PostStamp>();
	
	@Override
	public void addToCollection(PostStamp arg0) throws IllegalArgumentException {
		if (arg0 == null || arg0.equals(" ") || arg0.getName() == null || arg0.getName().equals("")) throw new IllegalArgumentException("Klaida!");

		post.add(arg0);
	}
/**
 * paskaiciuoja vidutine kaina
 */
	@Override
	public double getAveragePostStampPrice() {
		double countAverage = post.size();
		double price = 0.0;
		for (PostStamp po : post) {
			price += po.getMarketPrice();
		} 
		return price / countAverage;
	}
/**
 * kiek isviso yra markiu
 */
	@Override
	public int getNumberOfPostStampsInCollection() {
		return post.size();
	}
/**
 * suranda kokia marke pati brangiausia
 */
	@Override
	public PostStamp getTheMostExpensivePostStamByMarketValue() {
		ArrayList<PostStamp> stamps = new ArrayList<>();
		stamps.addAll(post);
		PostStamp maxStamp = stamps.get(0);
		for (PostStamp po : stamps) {
			if (po.getMarketPrice() > maxStamp.getMarketPrice())
				maxStamp = po;
		} 
		return maxStamp;
	}

}