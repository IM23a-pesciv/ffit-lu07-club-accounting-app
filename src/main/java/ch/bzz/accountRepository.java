package ch.bzz;

import ch.bzz.account;
import ch.bzz.project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface accountRepository extends JpaRepository<account, Long> {
    List<account> findByProject(project project);
}