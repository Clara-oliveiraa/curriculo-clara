package com.unicap.curriculo_clara.services;

import com.unicap.curriculo_clara.models.Curriculo;
import com.unicap.curriculo_clara.repository.CurriculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CurriculoService {

    @Autowired
    private  CurriculoRepository curriculoRepository;

    public Curriculo criarCurriculo(Curriculo curriculo){
        return curriculoRepository.save(curriculo);
    }

    public Curriculo obterCurriculo(Long id){
        return curriculoRepository.findById(id).orElse(null);
    }

    public List<Curriculo> obterTodosCurriculos() {
        return curriculoRepository.findAll();
    }
}
