package ch.bzz;

import ch.bzz.booking;
import ch.bzz.project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface bookingRepository extends JpaRepository<booking, Long> {
    List<booking> findByProject(project project);
}
