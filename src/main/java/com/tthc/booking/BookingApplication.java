package com.tthc.booking;

import com.tthc.booking.data.BookingRepository;
import com.tthc.booking.model.Booking;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookingApplication {
	private static final Logger log = LoggerFactory.getLogger(BookingApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BookingApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookingRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new Booking("Jack", "38 Le Lai", "3929382323", "Đổi giấy phép", "001", "accepted"));
			repository.save(new Booking("Fang", "43 Le Lai", "3929382353", "Đổi giấy phép", "001", "done"));
			repository.save(new Booking("Long", "64 Le Lai", "3929382635", "Đổi giấy phép", "001", "rejected"));
			repository.save(new Booking("Ju", "23 Le Lai", "39293822344", "Đổi giấy phép", "001", "processing"));

			// fetch all customers
			log.info("Booking found with findAll():");
			log.info("-------------------------------");
			for (Booking booking : repository.findAll()) {
				log.info(booking.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Booking customer = repository.findById(1L);
			log.info("Booking found with findById(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// fetch customers by last name
			log.info("Booking found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByFullName("Ju").forEach(bauer -> {
				log.info(bauer.toString());
			});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			//  log.info(bauer.toString());
			// }
			log.info("");
		};
	}
}
