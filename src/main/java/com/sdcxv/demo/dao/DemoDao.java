package com.sdcxv.demo.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * Created by Sdcxv on 2016/2/5.
 */
@Repository
@Transactional
public interface DemoDao {

    public void insert(Map map);

}
