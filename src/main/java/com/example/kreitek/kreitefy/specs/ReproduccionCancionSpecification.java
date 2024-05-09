package com.example.kreitek.kreitefy.specs;


import com.example.kreitek.kreitefy.domain.entity.ReproduccionCancion;
import com.example.kreitek.kreitefy.specs.shared.EntitySpecification;
import com.example.kreitek.kreitefy.specs.shared.SearchCriteria;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public class ReproduccionCancionSpecification extends EntitySpecification<ReproduccionCancion> implements Specification<ReproduccionCancion> {


    public ReproduccionCancionSpecification(List<SearchCriteria> criteria) {
        this.criteria = criteria;
    }
}
