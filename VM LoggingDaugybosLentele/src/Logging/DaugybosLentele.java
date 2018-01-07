package Logging;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class DaugybosLentele {

	final static  Logger logger = Logger.getLogger(DaugybosLentele.class.getName());
	
	public static int daugyba(int a, int b) {
		logger.log(Level.FINEST, "Daugiklis1 = {0}", a);
		logger.log(Level.FINEST, "Daugiklis2 = {0}", b);
		logger.log(Level.FINEST, "Rezultatas = {0}", a*b);
		return a*b;
	}
	
	public static void main(String[] args) {
		loadLoggingConfiguration();
		int sum=0;
		for(int i = 1; i <= 10; i++) {
			for (int x = 1; x<=10; x++){
			sum = daugyba(i,x);
			logger.log(Level.INFO, "{0} x {1} = {2}", new Object[]{i, x, sum});
			}
		}

		}
	private static void loadLoggingConfiguration() {
        try {
            LogManager.getLogManager().readConfiguration(DaugybosLentele.class.getClassLoader().getResourceAsStream("logging.properties"));
        } catch (IOException ex) {
            Logger.getLogger(DaugybosLentele.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(DaugybosLentele.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

	}
