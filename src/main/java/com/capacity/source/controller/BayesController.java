package com.capacity.source.controller;

import com.alibaba.fastjson.JSON;
import com.capacity.source.entity.BayesEntity;
import com.capacity.source.service.IBayesService;
import com.capacity.source.utils.CommonUtils;
import com.capacity.source.utils.ConstantUtils;
import com.capacity.source.utils.HttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 俗人 on 2018/2/3.
 */
@RestController
public class BayesController {

    @Autowired
    private IBayesService bayesService;


    @RequestMapping(value = "/getBayesResult")
    public Object getBayesResult(HttpServletRequest request,BayesEntity bayesEntity ){
        bayesEntity.setAction("train");
        bayesEntity.setTaskId(CommonUtils.getUUID());
        bayesEntity.setLabel("label");
        bayesEntity.setSelectCols("ID_CHK,I_E_FLAG,I_E_PORT,DESTINATION_PORT,VOYAGE_NO,TRAF_MODE");
        bayesEntity.setSourceid("1");
        bayesEntity.setDbtype("mysql");
        bayesEntity.setOrgtableName("x_train");
        bayesEntity.setModelid("model111");
        bayesEntity.setResultTableName("result1");
        bayesService.saveModel(bayesEntity);

       Object  result =  HttpUtils.doPost(ConstantUtils.BAYES_URL, JSON.toJSONString(bayesEntity));
       int i = 22222;

       return null;
    }
}
