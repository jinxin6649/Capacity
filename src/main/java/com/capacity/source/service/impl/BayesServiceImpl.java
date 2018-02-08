package com.capacity.source.service.impl;

import com.capacity.source.entity.BayesEntity;
import com.capacity.source.mapper.BayesMapper;
import com.capacity.source.service.IBayesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 俗人 on 2018/2/4.
 */
@Service("bayesService")
public class BayesServiceImpl implements IBayesService{

    @Autowired
    private BayesMapper bayesMapper;

    @Override
    public void saveModel(BayesEntity bayesEntity) {
        bayesMapper.saveModel(bayesEntity);

    }
}
