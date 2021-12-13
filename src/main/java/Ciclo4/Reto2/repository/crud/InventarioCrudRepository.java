package Ciclo4.Reto2.repository.crud;

import Ciclo4.Reto2.model.Inventario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventarioCrudRepository extends MongoRepository<Inventario, String> {
}
