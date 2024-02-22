package com.roberto.hexagonal.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder // RETORNA EL MISMO OBJETO AL MODIFICARLO PARA PODER ENCADENAR CAMBIOS objeto.setNombre("roberto").setApellido("beltran");
public class BookDto {

	private Long id;
	private String title;
	private String description;
	private Double price;
}
