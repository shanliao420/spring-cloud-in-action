package work.tangthinker.microserviceuserservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import work.tangthinker.microserviceuserservice.entity.User;

/**
 * @author shanliao420@yeah.net
 * @date 2023/5/10 19:09 星期三
 * @file UserRepository
 * @project SpringCloud
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
