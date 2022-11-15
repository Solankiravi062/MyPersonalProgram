import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarShop {

	public static void main(String args[])
	{
		List<DreamCar> carList = Arrays.asList(
				new DreamCar("BMW","White",150),
				new DreamCar("SKODA","Red",250),
				new DreamCar("MARUTI","Yello",500),
				new DreamCar("PORCSHE","White",550),
				new DreamCar("JAGUAR","Red",450)
				);
				System.out.println(carList);
				Predicate<DreamCar> p = x -> x.getPrice() >= 500;
	//Predicate<DreamCar> p = x -> x.getPrice() > 500;
	for(DreamCar dreamCar :  carList )
	{
		if(p.test(dreamCar))
		System.out.println(dreamCar.getName());
	}
	
	List<DreamCar> carList2 = carList.stream().filter(x -> x.getPrice() >= 500).collect(Collectors.toList());
		System.out.println(carList2);
	}
}
