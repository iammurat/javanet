package tr.com.vitelco.javanet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.vitelco.javanet.entity.Student;
import tr.com.vitelco.javanet.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService
{
	@Autowired
	private StudentRepository studentRepository;

	public Student getById( Long id )
	{
		return studentRepository.findById( id ) // Optional<Student>
								.orElse( null );
	}

	public List<Student> getAll()
	{
		List<Student> students = new ArrayList<>();
		studentRepository.findAll() // Iterable<Student>
						 .iterator() // Iterator<Student>
						 .forEachRemaining( students::add );
		// iterate and add to "students" list each element

		return students;
	}

	public Student create( Student student )
	{
		return studentRepository.save( student ); // create or update
	}

	public Student update( Student student )
	{
		return studentRepository.save( student ); // create or update
	}

	public void deleteById( Long id )
	{
		studentRepository.deleteById( id );
	}
}
