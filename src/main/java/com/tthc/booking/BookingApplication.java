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
			repository.save(new Booking("Nguyễn Văn Hoàng", "38 Vĩnh Hưng, Hoàng Mai", "3929382323", "Đổi giấy phép Lái Xe", "048392", "Accepted"));
			repository.save(new Booking("Trần Xuân Cung ", "43 Tôn Thất Tùng, Kim Liên, Đống Đa", "3929382353", "Làm Giấy Phép Xây Dựng", "8482990", "Done"));
			repository.save(new Booking("Lê Thái Long", "64 Ngọc Hà, Ngọc Hồ, Ba Đình", "3929382635", "Làm giấy độc thân", "42349823", "Rejected"));
			repository.save(new Booking("Nguyễn Trần Nhựt", "23 Nhật Tân, Tây Hồ", "39293822344", "Trích lục khai sinh", "025235231", "Processing"));

			// fetch all customers
			log.info("Booking found with findAll():");
			log.info("-------------------------------");
			for (Booking booking : repository.findAll()) {
				log.info(booking.toString());
			}
			log.info("");
//
//			// fetch an individual customer by ID
//			Booking customer = repository.findById(1L);
//			log.info("Booking found with findById(1L):");
//			log.info("--------------------------------");
//			log.info(customer.toString());
//			log.info("");
//
//			// fetch customers by last name
//			log.info("Booking found with findByLastName('Bauer'):");
//			log.info("--------------------------------------------");
//			repository.findByFullName("Ju").forEach(bauer -> {
//				log.info(bauer.toString());
//			});
//			// for (Customer bauer : repository.findByLastName("Bauer")) {
//			//  log.info(bauer.toString());
//			// }
//			log.info("");
		};
	}
}
