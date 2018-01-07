import com.eisgroup.javaexam.factory.Color;
import com.eisgroup.javaexam.factory.Transportation;
import com.eisgroup.javaexam.factory.TransportationFactory;

public class Factory implements TransportationFactory {

	@Override
	public Transportation produceBoat(String arg0, String arg1, double arg2, Color arg3, double arg4) {
		// TODO Auto-generated method stub
		Boat boatCreate = new Boat(arg0, arg1, arg2, arg3, arg4);
		return boatCreate;
	}

	@Override
	public Transportation produceCar(String arg0, String arg1, double arg2, Color arg3) {
		// TODO Auto-generated method stub
		Car carCreate = new Car(arg0, arg1, arg2, arg3);
		return carCreate;
	}

}
