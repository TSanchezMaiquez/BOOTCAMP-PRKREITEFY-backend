package com.example.kreitek.kreitefy.infraestructure.persistence;

import com.example.kreitek.kreitefy.domain.entity.ReproduccionCancion;
import com.example.kreitek.kreitefy.domain.persistencia.ReproduccionCancionPersistence;
import com.example.kreitek.kreitefy.specs.ReproduccionCancionSpecification;
import com.example.kreitek.kreitefy.specs.shared.SearchCriteriaHelper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public class ReproduccionCancionPersistenceImpl implements ReproduccionCancionPersistence {
private final ReproduccionCancionRepository reproduccionCancionRepository;

    public ReproduccionCancionPersistenceImpl(ReproduccionCancionRepository reproduccionCancionRepository) {
        this.reproduccionCancionRepository = reproduccionCancionRepository;
    }

    @Override
    public Page<ReproduccionCancion> findAll(Pageable pageable, String filter) {
        ReproduccionCancionSpecification specification = new ReproduccionCancionSpecification(SearchCriteriaHelper.fromFilterString(filter));
        return reproduccionCancionRepository.findAll(specification,pageable);
    }
}
