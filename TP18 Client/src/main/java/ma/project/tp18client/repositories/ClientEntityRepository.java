package ma.project.tp18client.repositories;

import ma.project.tp18client.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientEntityRepository extends JpaRepository<ClientEntity, Long> {
    // Tu peux ajouter des méthodes personnalisées ici si nécessaire
}
