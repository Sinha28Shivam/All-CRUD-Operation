package net.javaguides.springbootbackend;

import net.javaguides.springbootbackend.model.Employee;
import net.javaguides.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Shivam");
		employee.setLastName("Sinha");
		employee.setEmailId("sinha28.shivam@gmail.com");
//		employee.setDOJ(22/06/2022);
		employeeRepository.save(employee);


		Employee employee1 = new Employee();
		employee1.setFirstName("Anmol");
		employee1.setLastName("kothari");
		employee1.setEmailId("Kothari28.anmol@gmail.com");
//		employee.setDOJ(22/06/2022);
		employeeRepository.save(employee1);
	}
}
