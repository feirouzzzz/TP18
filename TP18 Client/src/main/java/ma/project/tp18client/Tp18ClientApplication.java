package ma.project.tp18client;

import ma.project.tp18client.entities.ClientEntity;
import ma.project.tp18client.repositories.ClientEntityRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class Tp18ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp18ClientApplication.class, args);
    }

    @Bean
    CommandLineRunner populateDatabase(ClientEntityRepository repository) {
        return args -> {
            repository.save(new ClientEntity(null, "Feirouz", 22f));
            repository.save(new ClientEntity(null, "karima", 24f));
            repository.save(new ClientEntity(null, "nora", 26f));
        };
    }
}
