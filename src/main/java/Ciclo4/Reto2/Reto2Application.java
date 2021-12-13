package Ciclo4.Reto2;

//import Ciclo4.Reto2.repository.crud.InventarioCrudRepository;
import Ciclo4.Reto2.repository.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto2Application implements CommandLineRunner {

	@Autowired
	private UserCrudRepository userRepo;

	//@Autowired
	//private InventarioCrudRepository supRepo;

	public static void main(String[] args) {
		SpringApplication.run(Reto2Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		userRepo.deleteAll();
		//supRepo.deleteAll();
	}
}
