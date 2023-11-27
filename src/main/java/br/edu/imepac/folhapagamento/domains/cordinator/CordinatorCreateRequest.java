package br.edu.imepac.folhapagamento.domains.cordinator;

import br.edu.imepac.folhapagamento.entities.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CordinatorCreateRequest {

    private String name;
    private String email;
    private Address address;
    private Float percentsStudent;
    private Float valuePayments;
    private Integer amountStudents;
}
