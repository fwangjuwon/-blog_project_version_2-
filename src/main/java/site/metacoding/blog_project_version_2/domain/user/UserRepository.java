package site.metacoding.blog_project_version_2.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * FROM user WHERE username=:username AND password = :password", nativeQuery = true)
    User mLogin(@Param("username") String username, @Param("password") String password);
}
