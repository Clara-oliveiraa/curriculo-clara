package com.unicap.curriculo_clara.repository;

import com.unicap.curriculo_clara.models.Curriculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
}
