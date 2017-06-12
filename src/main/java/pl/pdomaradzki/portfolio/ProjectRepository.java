package pl.pdomaradzki.portfolio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.pdomaradzki.portfolio.models.Project;

import java.util.List;

/**
 * Created by jaizm on 10/06/2017.
 */

@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {
    List<Project> findAll();
}
