package tr.com.vitelco.javanet.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tr.com.vitelco.javanet.entity.Student;

import java.util.List;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> //Repository
		// with pagination support
{
	// @Query("select s from Student s where s.id > 0") // sample custom query
	// (not needed for current example)
	// @Query requires "org.springframework.data.jpa.repository.Query"
	List<Student> findByNameAndSurname( String name, String surname ); // sample query
}
