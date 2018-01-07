import com.eisgroup.javaexam.factory.TransportationFactory;
import com.eisgroup.javaexam.factory.test.BaseTransportationFactoryTest;

public class TestCar extends BaseTransportationFactoryTest{

	@Override
	protected TransportationFactory getTransportationFactory() {
		return new Factory();
	}

}
