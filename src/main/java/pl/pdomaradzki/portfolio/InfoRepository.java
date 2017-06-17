package pl.pdomaradzki.portfolio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.pdomaradzki.portfolio.models.Info;

import java.util.List;
import java.util.Optional;

/**
 * Created by jaizm on 16/06/2017.
 */

@Repository
public interface InfoRepository extends CrudRepository<Info, Integer> {
        List<Info> findOne(int id);
}
