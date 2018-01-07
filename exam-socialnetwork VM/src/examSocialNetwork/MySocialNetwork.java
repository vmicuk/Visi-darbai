/**Program: Social Network
 * 
 * 
 * @author Vitalij Micuk JP16 3
 * @param friend 
 * @param city
 * @param firstName
 * @param lastName
 * @return return average price of post stamps price
 * @see  somthing )))
 */
package examSocialNetwork;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

public class MySocialNetwork implements SocialNetwork {
	
	final static  Logger logger = Logger.getLogger(MySocialNetwork.class.getName());
	Collection<Friend> friends = new HashSet<Friend>();

	@Override
	public void addFriend(Friend friend) throws IllegalArgumentException {
		if (friend == null)	throw new IllegalArgumentException("Klaida!");
		friends.add(friend);
	}
	/**Method find friend by city */
	@Override
	public Collection<Friend> findByCity(String city) throws IllegalArgumentException {
		Collection<Friend> newFriends = new ArrayList<>();
		loadLoggingConfiguration();
		if (city == null) throw new IllegalArgumentException("Klaida!");
		for (Friend findCity: friends) {
			if (findCity.getCity().equals(city)) newFriends.add(findCity);
		logger.log(Level.INFO, "City: {0}", new Object[]{city});
		}
		return newFriends;
	}
	/**Method find Friend by first name and last name if not show exception*/
	@Override
	public Friend findFriend(String firstName, String lastName) throws FriendNotFoundException, IllegalArgumentException {
		loadLoggingConfiguration();
		if (firstName == null || lastName == null) throw new IllegalArgumentException("Tusti laukai!");		
		ArrayList<Friend> findFriend = new ArrayList<>();
		findFriend.addAll(friends);
		for (Friend find: findFriend) {
			if (find.getFirstName().equals(firstName) && find.getLastName().equals(lastName)) return find;
			logger.log(Level.FINEST , "First Name: {0}, Last Name: {1}", new Object[]{firstName, lastName});
			 throw new FriendNotFoundException(firstName, lastName);
			
		}
		return null;
	}
	/**Method to get how many Friends*/
	@Override
	public int getNumberOfFriends() {
		return friends.size();
	}
	/**Method to ordered collection<Friend> by city, first name and last name */
	@Override
	public Collection<Friend> getOrderedFriends() {
		List<Friend> friendsOrdered = new ArrayList<>();
		friendsOrdered.addAll(friends);
		
		Collections.sort(friendsOrdered, new Comparator<Friend>() {
			@Override
			public int compare(Friend obj1, Friend obj2) {
		        Friend sh1 = (Friend) obj1;
		        Friend sh2 = (Friend) obj2;
		        int result = sh1.getCity().compareTo(sh2.getCity());
		        if (result != 0) return (int)(result/Math.abs(result));
		        result = sh1.getLastName().compareTo(sh2.getLastName()); 
		        if (result != 0) return (int)(result/Math.abs(result));
		        result = sh1.getFirstName().compareTo(sh2.getFirstName());
		        return (result != 0) ? (int)(result/Math.abs(result)) : 0;
			}
		});
		return friendsOrdered;
	}
	/**Method create logging parameters */
	private static void loadLoggingConfiguration() {
        try {
            LogManager.getLogManager().readConfiguration(MySocialNetwork.class.getClassLoader().getResourceAsStream("logging.properties"));
        } catch (IOException ex) {
            Logger.getLogger(MySocialNetwork.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(MySocialNetwork.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
