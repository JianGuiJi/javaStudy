package com.example.demobak.service;

import com.example.demobak.model.Girl;
import com.example.demobak.repositories.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author JiJG(jijg)
 * date:2018-02-28 20:36
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    //开启事务
    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("F");
        girlA.setAge(19);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("G");
        girlB.setAge(29);
        girlRepository.save(girlB);
    }

}
