package tr.com.vitelco.javanet.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Student
{
	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String surname;
}
