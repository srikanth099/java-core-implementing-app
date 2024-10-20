package org.ass.core;

import java.util.ArrayList;

import org.ass.core.assosiation.types.AirHosters;
import org.ass.core.assosiation.types.Flight;
import org.ass.core.dao.AssosiationRepeository;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		/*
		 * int result = CommonIn.add(3, 7); System.out.println("Result :"+result);
		 * UserEntity userEntity = new UserEntity(); userEntity.setAltKey(003);
		 * userEntity.setName("Chitti 2.0");
		 * userEntity.setEmail("ChittiUpdated.M42@gmail.com");
		 * userEntity.setPassword("robot"); userEntity.setCity("Pentagon");
		 * userEntity.setContactNumber("SL780"); userEntity.setCountry("America");
		 * userEntity.setPinCode("93736");
		 * 
		 * UserRepository repository = new UserRepository();
		 * repository.save(userEntity); UserEntity entity = repository.findById(003);
		 * System.out.println(entity);
		 */

		/*
		 * UserDto userDto = new UserDto(); userDto.setAltKey(5);
		 * userDto.setName("IRobot"); userDto.setCity("Cochi");
		 * userDto.setCountry("India"); userDto.setPinCode("560037");
		 * repository.update(userDto);
		 */

//		   UserHQLRepository hqlRepository = new UserHQLRepository(); //
//		   List<UserEntity> userEntityList = hqlRepository.findAll();
		
		/*
		 * userEntityList.forEach(each->{ System.out.println(each); })
		 * 
		 */

		/*
		 * userEntityList.stream().filter(each->each.getName().equalsIgnoreCase("irobot"
		 * )).collect(Collectors.toList()); List<UserEntity> findByName =
		 * hqlRepository.findByName("Friday"); findByName.forEach(each->{
		 * System.out.println(each); });
		 */
		
//		hqlRepository.updatePasswordByEmail("updatepwd","ChittiUpdated.M45@gmail.com");
//		hqlRepository.deleteUserByEmail("ChittiUpdated.M42@gmail.com");

		/*
		 * Team team = new Team();
		 *  team.setName("Imdian Crickter");
		 * team.setTeamSize("12");
		 *  team.setTeamType("p");
		 * 
		 * Captian captian = new Captian(); 
		 * captian.setCaptianName("MS DHONI");
		 * captian.setAge("43"); 
		 * captian.setEmail("ms.dhoni@gmail.com");
		 * 
		 * team.setCaptian(captian);
		 *  AssosiationRepeository repeository1 = new AssosiationRepeository(); 
		 *  repeository1.saveTeamDetails(team);
		 */

		AssosiationRepeository repeository1 = new AssosiationRepeository();

		AirHosters hoster1 = new AirHosters();
		hoster1.setName("Leesa");
		hoster1.setAge(34);

		AirHosters hoster2 = new AirHosters();
		hoster2.setName("Amrutha");
		hoster2.setAge(22);

		AirHosters hoster3 = new AirHosters();
		hoster3.setName("Karthika");
		hoster3.setAge(46);

		AirHosters hoster4 = new AirHosters();
		hoster4.setName("Luseyy");
		hoster4.setAge(33);

		ArrayList<AirHosters> list = new ArrayList<AirHosters>();
		list.add(hoster1);
		list.add(hoster2);
		list.add(hoster3);
		list.add(hoster4);

		Flight flight1 = new Flight();
		flight1.setName("TATAkingfisher");
		flight1.setTypeofFlight("Passenger");
		flight1.setNumofSeats(900);
		flight1.setPrice(9273574.00);
		flight1.setAirhosterssessList(list);
		repeository1.saveTeamDetails(flight1);

		ArrayList<AirHosters> list2 = new ArrayList<AirHosters>();
		list2.add(hoster4);
		list2.add(hoster2);
		list2.add(hoster3);

		Flight flight2 = new Flight();
		flight2.setName("IndianNavy");
		flight2.setTypeofFlight("Military");
		flight2.setNumofSeats(500);
		flight2.setPrice(5737497);
		flight2.setAirhosterssessList(list2);
		repeository1.saveTeamDetails(flight2);

	}
}
