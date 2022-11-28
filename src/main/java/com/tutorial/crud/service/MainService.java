package com.tutorial.crud.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tutorial.crud.entity.Main;
import com.tutorial.crud.repository.MainRepository;

@Service
public class MainService implements IMainService{

    @Autowired
    public MainRepository MaRepository;

    @Override
    public List<Main> getMain() {
        List<Main> listaMains = MaRepository.findAll();
        return listaMains;
    }

    @Override
    public void saveMain(Main main) {
        MaRepository.save(main);
        
    }

    @Override
    public void deleteMain(Long id) {
        MaRepository.deleteById(id);
        
    }

    @Override
    public Main findMain(Long id) {
        Main main = MaRepository.findById(id).orElse(null);
        return main;
    }
    
}
