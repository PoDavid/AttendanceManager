package church.morningclass.attendancemanager.repository;

import church.morningclass.attendancemanager.model.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
