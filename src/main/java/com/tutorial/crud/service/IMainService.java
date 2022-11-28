package com.tutorial.crud.service;

import java.util.List;
import com.tutorial.crud.entity.Main;


public interface IMainService {

    public List<Main> getMain();

    public void saveMain(Main main);

    public void deleteMain (Long id);

    public Main findMain ( Long id);
}
