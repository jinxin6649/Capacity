package com.capacity.source.controller;

import com.alibaba.fastjson.JSON;
import com.capacity.source.Entity.BayesEntity;
import com.capacity.source.utils.ConstantUtils;
import com.capacity.source.utils.HttpUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 俗人 on 2018/2/3.
 */
@RestController
public class BayesController {

    @RequestMapping(value = "/getBayesResult")
    public Object getBayesResult(HttpServletRequest request,BayesEntity bayesEntity ){
        bayesEntity.setAction("train");
        bayesEntity.setTaskId("train1");
        bayesEntity.setLabel("label");
        bayesEntity.setSelectCols("ID_CHK,I_E_FLAG,I_E_PORT,DESTINATION_PORT,VOYAGE_NO,TRAF_MODE");
        bayesEntity.setSourceid("1");
        bayesEntity.setDbtype("mysql");
        bayesEntity.setOrgtableName("x_train");
        bayesEntity.setModelid("model01");
        bayesEntity.setResultTableName("result1");
       Object  result =  HttpUtils.doPost(ConstantUtils.BAYES_URL, JSON.toJSONString(bayesEntity));
       int i = 1;
       return null;
    }
}
