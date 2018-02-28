package com.example.demobak.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author JiJG(jijg)
 * date:2018-02-28 19:37
 */
@Entity
public class Boy {
    @Id
    @GeneratedValue
    private Integer id;
    private String height;
    private Integer age;
}
