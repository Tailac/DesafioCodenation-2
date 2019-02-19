package challenge;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface QuoteRepository extends JpaRepository<	Quote, Integer> {

	@Query(value = "SELECT id,actor,detail FROM SCRIPTS ORDER BY RAND() LIMIT 1", nativeQuery = true)
	Quote getQuoteRandom();

	@Query(value = "SELECT id,actor,detail FROM SCRIPTS WHERE actor = :actor ORDER BY RAND() LIMIT 1", nativeQuery = true)
	Quote getQuoteByActor(@Param("actor") String actor);
	
}
