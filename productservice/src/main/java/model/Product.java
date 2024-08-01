package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Product {
	
	@Id
	private Long id;
	private String name;
	private String description;
	private double price;
	

}
