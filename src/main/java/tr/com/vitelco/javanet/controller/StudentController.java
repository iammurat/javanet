package tr.com.vitelco.javanet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tr.com.vitelco.javanet.entity.Student;
import tr.com.vitelco.javanet.service.StudentService;

import java.util.List;

@RestController
@RequestMapping( "api/students" )
public class StudentController
{
	@Autowired
	private StudentService studentService;

	@RequestMapping( value = "/{id}", method = RequestMethod.GET )
	public Student get( @PathVariable @NonNull Long id )
	{
		return studentService.getById( id );
	}

	@RequestMapping( method = RequestMethod.GET )
	public List<Student> getAll()
	{
		return studentService.getAll();
	}

	@RequestMapping( method = RequestMethod.POST )
	public Student create( @RequestBody Student student )
	{
		return studentService.create( student );
	}

	@RequestMapping( method = RequestMethod.PUT )
	public Student update( @RequestBody Student student )
	{
		return studentService.update( student );
	}

	@RequestMapping( value = "/{id}", method = RequestMethod.DELETE )
	public void delete( @PathVariable Long id )
	{
		studentService.deleteById( id );
	}
}
