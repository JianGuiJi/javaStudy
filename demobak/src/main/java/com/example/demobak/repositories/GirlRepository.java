package com.example.demobak.repositories;

import com.example.demobak.model.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author jijiangui(jijg)
 * date:2018-02-28 19:48
 * describe:
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    //通过年龄来查询
    public List<Girl> findAllByAge(Integer age);
}
