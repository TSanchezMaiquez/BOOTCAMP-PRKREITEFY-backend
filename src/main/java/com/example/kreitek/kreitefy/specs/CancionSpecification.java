package com.example.kreitek.kreitefy.specs;


import com.example.kreitek.kreitefy.domain.entity.Cancion;
import com.example.kreitek.kreitefy.specs.shared.EntitySpecification;
import com.example.kreitek.kreitefy.specs.shared.SearchCriteria;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public class CancionSpecification extends EntitySpecification<Cancion> implements Specification<Cancion> {


    public CancionSpecification(List<SearchCriteria> criteria) {
        this.criteria = criteria;
    }



}
