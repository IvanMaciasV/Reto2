package Ciclo4.Reto2.repository;

import Ciclo4.Reto2.model.Inventario;
import Ciclo4.Reto2.repository.crud.InventarioCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InventarioRepository {
    @Autowired
    private InventarioCrudRepository crudInterface;

    public List<Inventario> listAll() {
        return crudInterface.findAll();
    }

    public Optional<Inventario> getSupplement(String reference) {
        return crudInterface.findById(reference);
    }

    public Inventario create(Inventario clothe) {
        return crudInterface.save(clothe);
    }

    public void update(Inventario clothe) {
        crudInterface.save(clothe);
    }

    public void delete(Inventario clothe) {
        crudInterface.delete(clothe);
    }
}
