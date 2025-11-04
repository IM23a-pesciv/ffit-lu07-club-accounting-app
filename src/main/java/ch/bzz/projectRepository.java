package ch.bzz;

import ch.bzz.project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface projectRepository extends JpaRepository<project, String> {

}
