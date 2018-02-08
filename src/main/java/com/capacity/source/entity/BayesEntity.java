package com.capacity.source.entity;

import lombok.Data;

/**
 * Created by 俗人 on 2018/2/3.
 */
@Data
public class BayesEntity {
    private String action;
    private String taskId;
    private String label;
    private String selectCols;
    private String sourceid;
    private String dbtype;
    private String orgtableName;
    private String modelid;
    private String resultTableName;
}
