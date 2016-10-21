package ws.xa.bitronix.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ws.xa.bitronix.demo.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
