package com.sdcxv.demo.service;

import com.sdcxv.demo.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Sdcxv on 2016/2/5.
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoDao demoDao;

    public void insert(Map map) {
        this.demoDao.insert(map);
    }
}
