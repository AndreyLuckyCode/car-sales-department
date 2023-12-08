package andrey.code.store.repository;

import andrey.code.store.entity.ManagerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ManagerRepository extends JpaRepository<ManagerEntity, Long> {

    public List<ManagerEntity> findAllByOrderByTotalSalesDesc();
}
